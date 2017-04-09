/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkdinos;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author Sean
 */
public class Dinos {
    private double size;
    private String name, eraFrom, type, species;
    private LocalDate dateTamed;
    private int cargoCapacity;
    private ArrayList<String> validTypes;
    
    
    public Dinos(double size, String name, String eraFrom, String species, LocalDate dateTamed, int cargoCapacity) {
        this.validTypes = new ArrayList<>();
        setValidTypes();
        setSize(size);
        setName(name);
        setEraFrom(eraFrom);
        //setType(type);
        setSpecies(species);
        setDateTamed(dateTamed);
        setCargoCapacity(cargoCapacity);
    }
    
    public void setValidTypes() {
        validTypes.add("land");
        validTypes.add("water");
        validTypes.add("flying");
    }
    
    /**
     * checks the cargo capacity is greater then 0 and less then 4/5s the dino's size
     * @param capacity 
     */
    public void setCargoCapacity(int capacity){
        if (capacity > 0 && capacity < size*0.8)
            cargoCapacity = capacity;
        else{
            throw new IllegalArgumentException("Cargo capacity must be less then 4/5s of the dino's ");
          }
    }
    
    /**
     * checks the size is greater then 0 and less then 135
     * @param size 
     */
    public void setSize(Double size) {
        if (size > 0 && size <= 135)
            this.size = size;
        else{
            throw new IllegalArgumentException(" The largest uncontroversial dino size is 135 ft, "
                    + "must be smaller then this" + size);
          }
    }

    /**
     * checks to see if the name is a valid word
     * @param name 
     */
    public void setName(String name) {
        if(validWord(name)){
            this.name = name;
        }
        else{
                  throw new IllegalArgumentException(" Dino name must only contain letters or dashes " + name);
          }
    }
    
    /**
     * checks to see if the era is a valid word
     * @param eraFrom 
     */
    public void setEraFrom(String eraFrom) {
        if(validWord(eraFrom)){
            this.eraFrom = eraFrom;
        }
        else{
                  throw new IllegalArgumentException(" The era must only contain letters or dashes " + eraFrom);
          }
    }

    /**
     * checks to see if type is a valid word and if it is a valid type
     * @param type 
     */
    public void setType(String type) {
        if(validWord(type)){
            if(validTypes.contains(type.toLowerCase()))
                this.type = type;
            else{
                  throw new IllegalArgumentException(type + " is not a valid dino type only water, land, flying");
            }
        }
        else{
                  throw new IllegalArgumentException(" Dino type must only contain letters " + type);
        }
    }

    /**
     * checks to see if desired species is actually a word
     * @param species 
     */
    public void setSpecies(String species) {
        if(validWord(species)){
            this.species = species;
        }
        else{
                  throw new IllegalArgumentException(" Dino species must only contain letters " + species);
          }
    }
    
    /**
     * checks to see if date is in the past
     * @param dateTamed 
     */
    public void setDateTamed(LocalDate dateTamed) {
        if(Period.between(dateTamed, LocalDate.now()).getDays() > 0)
        this.dateTamed = dateTamed;
        else{
                  throw new IllegalArgumentException(" can not tame in the future" + dateTamed + 
                          " must be before " + LocalDate.now());
          }
    }
    
    
    public boolean validWord(String text){
        boolean valid = true;
        String invalidChar = "1234567890-=!@#$%^&*()_+{}[];:,'./<>?|\\\"";
        for (int i = 0; i < invalidChar.length(); i++){
            if (text.contains(invalidChar.substring(i, i+1)))
                valid = false;}
        return valid;
    }

    ////////////////////////////////// GETTER /////////////////////////////////////////////////
    
    public Double getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getEraFrom() {
        return eraFrom;
    }

    public String getType() {
        return type;
    }

    public String getSpecies() {
        return species;
    }

    public LocalDate getDateTamed() {
        return dateTamed;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }
    
    

    
}
