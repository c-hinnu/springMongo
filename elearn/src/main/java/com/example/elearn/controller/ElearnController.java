package com.example.elearn.controller;

import com.example.elearn.model.Elearn;
import com.example.elearn.service.ElearnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")

public class ElearnController {
   @Autowired
    private ElearnService es;
   @GetMapping("/student")
    public ResponseEntity<List<Elearn>> getAllcourse(@PathVariable int id)
   {
       List<Elearn> el=es.getall(id);
       return ResponseEntity.ok().body(el);
   }
 @PostMapping("/students")
    public  ResponseEntity<Elearn> Addstudent(@RequestBody Elearn elearn)
 {
     es.addnewstudent(elearn);
     return ResponseEntity.ok().body(elearn);
 }

}
