package com.example.jpalab.service;

import com.example.jpalab.entity.Actor;
import com.example.jpalab.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    @Autowired
    ActorRepository actorRepository;

    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }

    public Actor getOne(Integer id) {

        return actorRepository.getOne(id);
    }

    public void saveActor(Actor actor) {
        actorRepository.save(actor);
    }

    public void deleteActor(Actor actor) {
        actorRepository.delete(actor);
    }
}
