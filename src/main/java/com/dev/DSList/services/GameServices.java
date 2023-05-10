package com.dev.DSList.services;

import com.dev.DSList.dto.GameDTO;
import com.dev.DSList.dto.GameMinDTO;
import com.dev.DSList.entities.Game;
import com.dev.DSList.properties.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameServices {
    /*O services é responsavel pela logica do negócio
    Ele que orquestra o properties*/
    
    /*Injetando o game repository no service*/
    @Autowired
    private GameRepository gameRepository;
    
    @Transactional(readOnly = true)
    public GameDTO findById(Long Id){
        Game result = gameRepository.findById(Id).get();
        /*A linha acima foi utilizado o .get() pois o findById retorna um tipo optinal*/
        
        GameDTO dto = new GameDTO(result);
        return dto;
    }
    
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game>result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        /*A linha acima transforma uma lista do tipo game em uma tipo game min dto*/
        return dto;
    }
}
