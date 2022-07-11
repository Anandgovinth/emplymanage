package com.bluetree.Emplyreg.controller;

import com.bluetree.Emplyreg.model.Emply;
import com.bluetree.Emplyreg.service.EmplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmplyController {

    EmplyService emplyService;

    @Autowired
    public EmplyController(EmplyService emplyService) {
        this.emplyService = emplyService;
    }
    private ResponseEntity responseEntity;
    @PostMapping("/addemply")
    public ResponseEntity<?> addEmply(@RequestBody Emply emply)
    {


            emplyService.addEmply(emply);
            responseEntity=new ResponseEntity<>(emply, HttpStatus.CREATED);

        return responseEntity;
    }
    @PostMapping("/saveemply")
    public ResponseEntity<?> saveAllEmplys(@RequestBody List<Emply> emplys)
    {


        emplyService.saveAllEmplys(emplys);
        responseEntity=new ResponseEntity<>(emplys, HttpStatus.CREATED);

        return responseEntity;
    }

    @PutMapping("/updateemply")
    public ResponseEntity<?>updateEmply(@RequestBody Emply emply)
    {
        try {
            emplyService.updateEmply(emply);
            responseEntity = new ResponseEntity<>(emply, HttpStatus.OK);
        }
        catch (Exception e)
        {
            responseEntity=new ResponseEntity<>("Error try save after sometime",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;


    }
    @GetMapping("/employee")
    public ResponseEntity<?>getAllEmply()
    {
        try {
            List<Emply> studentList = emplyService.getAllEmply();
            responseEntity=new ResponseEntity<>(studentList,HttpStatus.OK);
        }
        catch (Exception e)
        {
            responseEntity=new ResponseEntity<>("Error try save after sometime",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;


    }



    @DeleteMapping("/employ/{id}")
    public ResponseEntity<?> deleteEmply(@PathVariable int id)
    {
        try {
            emplyService.deleteEmply(id);
            responseEntity=new ResponseEntity<>("Successfully deleted!!!!", HttpStatus.OK);
        }

        catch (Exception e)
        {
            responseEntity=new ResponseEntity<>("Error try after sometime",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }
}
