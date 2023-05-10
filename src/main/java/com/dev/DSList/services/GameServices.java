package com.dev.DSList.services;

import com.dev.DSList.dto.GameMinDTO;
import com.dev.DSList.entities.Game;
import com.dev.DSList.properties.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServices {
    /*O services é responsavel pela logica do negócio
    Ele que orquestra o properties*/
    
    /*Injetand o game repository no service*/
    @Autowired
    private GameRepository gameRepository;
    
    public List<GameMinDTO> findAll(){
        List<Game>result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        /*A linha acima transforma uma lista do tipo game em uma tipo game min dto*/
        return dto;
    }
}
