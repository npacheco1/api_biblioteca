package com.ecodeup.biblioteca.controller;

import com.ecodeup.biblioteca.dto.AutorDTO;
import com.ecodeup.biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/biblioteca")
public class AutorController {



    @Autowired
    private AutorService autorService;

    @PostMapping
    public ResponseEntity<AutorDTO> save(@RequestBody AutorDTO autorDTO){
        return new ResponseEntity<>(autorService.save(autorDTO) , HttpStatus.OK);
    }

}
