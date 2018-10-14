package com.example.jpalab.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Data
@JsonAutoDetect
public class HttpJsonForm {

    private HashMap<String, HashMap<String, String>> schema;
    private List<Object> form;
    private Object data;

    public HashMap<String, HashMap<String, String>> getSchema() {
        return schema;
    }

    public void setSchema(HashMap<String, HashMap<String, String>> schema) {
        this.schema = schema;
    }

    public List<Object> getForm() {
        return form;
    }

    public void setForm(List<Object> form) {
        this.form = form;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
