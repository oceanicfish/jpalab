package com.example.jpalab.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.LOCAL_VARIABLE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonForm {

    public String title() default "";
    public String type() default "";
    public String maxLength() default "";
    public String[] staticOptions() default {};
    public Class<?> referenceClass() default Object.class;

}
