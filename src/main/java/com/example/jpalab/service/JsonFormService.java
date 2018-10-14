package com.example.jpalab.service;

import com.example.jpalab.annotation.JsonForm;
import com.example.jpalab.entity.HttpJsonForm;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.lang.reflect.Field;
import java.util.HashMap;

@Service
public class JsonFormService {

    public HttpJsonForm generateForm(Object entity) {

        HttpJsonForm form = new HttpJsonForm();

        try {

            HashMap<String, HashMap<String, String>> formSchema = new HashMap<String, HashMap<String, String>>();

            Field[] fields = Class.forName("com.example.jpalab.entity.Actor").getDeclaredFields();

            for (Field field : fields) {

                if (field.isAnnotationPresent(JsonForm.class)) {

                    HashMap<String, String> inputSchema = new HashMap<String, String>();

                    String fieldName = field.getName();

                    String inputTitle = field.getAnnotation(JsonForm.class).title();
                    String inputType = field.getAnnotation(JsonForm.class).type();
                    String inputMaxLength = field.getAnnotation(JsonForm.class).maxLength();

                    inputSchema.put("title", inputTitle);
                    inputSchema.put("type", inputType);
                    inputSchema.put("maxLength", inputMaxLength);

                    formSchema.put(fieldName, inputSchema);
                }
            }

            form.setSchema(formSchema);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return form;
    }
}
