package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    ModelRepo modelRepo;

    @PostMapping("/assets/post")
    public void postData(@RequestBody ModelTest modelTest) {
        modelRepo.save(modelTest);
    }

    @GetMapping("/get")
    public List<ModelTest> getData(){
        List<ModelTest> lista = new ArrayList<>();
        for (ModelTest model: modelRepo.findAll()) {
         if(model.getId()!=null && model.getModeli()!=null && model.getTarga()!=null ){
             lista.add(model);
         }
        }
        return lista;
    }

}
