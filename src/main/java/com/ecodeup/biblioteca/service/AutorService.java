package com.ecodeup.biblioteca.service;

import com.ecodeup.biblioteca.dto.AutorDTO;
import com.ecodeup.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private FactoryAutorService factoryAutorService;

    @Autowired
    private AutorRepository autorRepository;


    public AutorDTO save(AutorDTO autorDTO){
        return factoryAutorService.crearAutorDTO(autorRepository.save(factoryAutorService.crearAutor(autorDTO))) ;
    }


    public List<AutorDTO>findAll(){
        return factoryAutorService.crearAutoresDTO(autorRepository.findAll());
    }

    public AutorDTO findById(Integer id){
        return factoryAutorService.crearAutorDTO(autorRepository.findById(id).get());
    }



    public void deleteById(Integer id){
        autorRepository.deleteById(id);
    }
}

