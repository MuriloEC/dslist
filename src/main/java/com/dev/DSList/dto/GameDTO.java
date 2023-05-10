package com.dev.DSList.dto;

import com.dev.DSList.entities.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.BeanUtils;

public class GameDTO {

    private Long id;
    private String title;
    private int year;
    private String genre;
    private String platforms;
    private double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO() {
    }
    
    public GameDTO(Game entity){
        /*O bean utils copia todos atributos da entide para o GameDTO(this)
        Funciona como o que foi feito no GameMinDTO porem de maneira resumida ja 
        que o GameDTO possui muitos atributos*/
        BeanUtils.copyProperties(entity, this);
    }
    
    /*Para usar o bean utils e necessario gerar os gets e sets e não somente os gets 
    como no GameMinDTO*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    
}
