package com.example.dockersample.controller;

import com.example.dockersample.samples.Samples;
import com.example.dockersample.samples.SamplesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {

    private final SamplesRepository repository;

    public HelloController(SamplesRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        Optional<Samples> record = repository.findById(1);
        System.out.println(record);
        if(record.isPresent()){
            return "hello DB";
        }
        return "Hello Docker Compose";
    }
}
