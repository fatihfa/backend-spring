package com.example.controllers;

import java.util.List;

//import com.example.models.Ibuhamil;
import com.example.models.Skrining;
import com.example.services.SkriningService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skrinings")
public class SkriningController {
    

    @Autowired
    private SkriningService skriningService;



    @PostMapping
    public Skrining createSkrining(@RequestBody Skrining skrining){
        return skriningService.createSkrining(skrining);
    }

    @GetMapping
    public Iterable<Skrining> findAll(){
        return skriningService.findAll();
    }


    @GetMapping("findByBumilId/{skrining_id}")
    public List<Skrining> finByIbuhamilId(@PathVariable("skrining_id") Integer skriningId){

        var skriningList = (List<Skrining>) skriningService.finByIbuhamilId(skriningId);
        return skriningList;
    }
}
