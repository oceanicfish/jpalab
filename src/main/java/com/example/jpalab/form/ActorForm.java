package com.example.jpalab.form;

import lombok.Data;

@Data
public class ActorForm {

    private String schema;
    private String form;
    private Object data;
    private Integer status;
    private String error;

}
