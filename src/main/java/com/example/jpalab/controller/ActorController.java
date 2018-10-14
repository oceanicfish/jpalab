package com.example.jpalab.controller;

import com.example.jpalab.entity.Actor;
import com.example.jpalab.entity.HttpJsonForm;
import com.example.jpalab.service.ActorService;
import com.example.jpalab.service.JsonFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorController {

    @Autowired
    ActorService actorService;
    @Autowired
    JsonFormService jsonFormService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody List<Actor> getAll() {
        return actorService.getAllActors();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    HttpJsonForm getActor(@PathVariable Integer id) {

        Actor actor = actorService.getOne(id);

        HttpJsonForm form = jsonFormService.generateForm(actor);

        form.setData(actor);

        return form;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void saveActor(@RequestBody Actor actor) {
        actorService.saveActor(actor);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteActor(@RequestBody Actor actor) {
        actorService.deleteActor(actor);
    }

}
