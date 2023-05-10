package com.dev.DSList.properties;

import com.dev.DSList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long>{
    /*O repository éresponsvel por fazer as consultas no banco de dados como exemplo: select, delete, etc*/
    
    
}
