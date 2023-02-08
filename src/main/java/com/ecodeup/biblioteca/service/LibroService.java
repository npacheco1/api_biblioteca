package com.ecodeup.biblioteca.service;

import com.ecodeup.biblioteca.dto.LibroDTO;
import com.ecodeup.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private FactoryLibroService factoryLibroService;

    @Autowired
    private LibroRepository libroRepository;


    public LibroDTO save(LibroDTO libroDTO){
        return factoryLibroService.crearLibroDTO(libroRepository.save(factoryLibroService.crearLibro(libroDTO))) ;
    }

    public List<LibroDTO> findAll(){
        return factoryLibroService.crearLibrosDTO(libroRepository.findAll());
    }

    public LibroDTO findById(Integer id){
        return factoryLibroService.crearLibroDTO(libroRepository.findById(id).get());
    }



    public void deleteById(Integer id){
        libroRepository.deleteById(id);
    }
}
