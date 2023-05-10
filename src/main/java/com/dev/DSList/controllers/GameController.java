/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.DSList.controllers;

import com.dev.DSList.dto.GameDTO;
import com.dev.DSList.dto.GameMinDTO;
import com.dev.DSList.entities.Game;
import com.dev.DSList.services.GameServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    /*controller é a porta da API, ele que implementa a API.
    O front-end chama o back-end por ele*/
    
    
    @Autowired
    private GameServices gameServices;
    
    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameServices.findAll();
        return result;
    }
    
    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameServices.findById(id);
        return result;
    }
}
