package com.example.jpalab;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("crud")
@ResponseBody
public class CRUDController {

    @RequestMapping(method = RequestMethod.GET)
    public String getAll() {

        return "hello jpa";
    }
}
