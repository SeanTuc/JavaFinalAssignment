/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkdinos;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Sean
 */
public class LandDino extends Dinos{
    private boolean piosonous;
    private String skinType, habitat;
    private ArrayList<String> skinTypes;
    
    
    public LandDino(String skinType, String habitat, boolean piosonous, Double size, String name, String eraFrom, 
            String species, LocalDate dateTamed, int cargoCapacity) {
        super(size, name, eraFrom, species, dateTamed, cargoCapacity);
        super.setType("land");
        this.skinTypes = new ArrayList<>();
        setSkinList();
        setSkinType(skinType);
        setHabitat(habitat);
        setPiosonous(piosonous);

        
        }
    /**
     * sets the valid skin tpye list
     */
    public void setSkinList(){
        skinTypes.add("scales");
        skinTypes.add("fur");
        skinTypes.add("plates");
        skinTypes.add("shell");
        skinTypes.add("feathers");
    }
            
            
    /**
     * validates if dino can be piosonous 
     * @param piosonous 
     */        
    public void setPiosonous(boolean piosonous) {
        if((skinType.trim().equalsIgnoreCase("Sclaes") || (habitat.trim().equalsIgnoreCase("swamp"))) && piosonous)
            this.piosonous = piosonous;
        else if(!piosonous)
            this.piosonous = piosonous;
        else{
            throw new IllegalArgumentException("Only Dinousours with scales or that live in the swamp can be piosonous");
        }
    }
    
    /**
     * checks if the desired skin type is a valid word and if it is a valid skin type 
     * @param skinType 
     */
    public void setSkinType(String skinType) {
        if(super.validWord(skinType)){
            if (skinTypes.contains(skinType.toLowerCase())){
                this.skinType = skinType;
            }
            else{
                throw new IllegalArgumentException( skinType + " is not a valid skin type");
            }
        }
        else{
            throw new IllegalArgumentException( skinType + "is not a valid word");
        }   
    }
    
    /**
     * checks if desired habitat is a valid word
     * @param habitat 
     */
    public void setHabitat(String habitat) {
        if(super.validWord(habitat)){
                this.habitat = habitat.toLowerCase();
        }
        else{
            throw new IllegalArgumentException( habitat + "is not a valid word");
        } 
    }
    
////////////////////////////// GETTER ////////////////////////////////////////////

    public boolean getPiosonous() {
        return piosonous;
    }

    public String getSkinType() {
        return skinType;
    }

    public String getHabitat() {
        return habitat;
    }
    
    public String toString(){
        String piosonous;
        if (getPiosonous())
            piosonous = "is";
        else
            piosonous = "is not";
        return "Your Dino is called " + super.getName() + ", from the " + super.getSpecies() + " species. /n It is " + super.getSize() + " feet long and is found on"
                + super.getType() + " in "+ getHabitat() +" areas, it can carry " + super.getCargoCapacity() + ". /n This Dino " + piosonous +
                "piosonous.";
    }
}
