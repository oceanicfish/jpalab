package com.example.jpalab.entity;

import com.example.jpalab.annotation.JsonForm;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@JsonAutoDetect
@Data
@Entity
@Table(name = "actor")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Actor {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name = "actor_id")
    private Integer id;

    @JsonForm(title = "First Name", type = "string", maxLength = "5")
    @Column(name = "first_name", columnDefinition = "VARCHAR(45)")
    private String firstName;

    @JsonForm(title = "Last Name", type = "string", maxLength = "10")
    @Column(name = "last_name", columnDefinition = "VARCHAR(45)")
    private String lastName;

    @Column(name = "last_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;

}
