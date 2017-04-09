/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkdinos;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Sean
 */
public class WaterDino extends Dinos{
    private boolean gills;
    private String adaptation, habitat;
    private ArrayList<String> habitats, adaptations;

    public WaterDino(boolean gills, String adaptation, String habitat, double size, String name, String eraFrom, 
            String species, LocalDate dateTamed, int cargoCapacity) {
        super(size, name, eraFrom, species, dateTamed, cargoCapacity);
        super.setType("water");
        this.habitats = new ArrayList<>();
        this.adaptations = new ArrayList<>();
        setHabitatsList();
        setAdaptationList();
        setHabitat(habitat);
        setGills(gills);
        setAdaptation(adaptation);
    }
    
    /**
     * constructs the possible adaptation list
     */
    
    public void setAdaptationList(){
        adaptations.add("electric");
        adaptations.add("sting");
        adaptations.add("shell");
        adaptations.add("pioson");
        adaptations.add("glow");
        adaptations.add("camouflage");
        adaptations.add("none");
        
    }//end of setAdaptationList
    
    
    /**
     * constructs the valid habitat list
     */
    public void setHabitatsList(){
        habitats.add("river");
        habitats.add("lake");
        habitats.add("ocean");
        habitats.add("swamp");
        habitats.add("stream");
        habitats.add("pond");
    }// end of setHabitatsList
    
    
    
    
    /**
     * validates gills entry then sets gills 
     * @param gills 
     */
    public void setGills(boolean gills) {
        if(!gills && (habitat.equals("ocean".toLowerCase()) ))
        {
            this.gills = gills;
        }
        else if (gills)
        {
            this.gills = gills; 
        }    
        else
        {
            throw new IllegalArgumentException(gills +" to having gills is only valid in the ocean");
        }
        
    }//end of setGills
    
    
    /**
     * validates desired adaptation is a valid adaptation then sets adaptation
     * @param adaptation 
     */
    public void setAdaptation(String adaptation) {
        if(super.validWord(adaptation)){
            if(adaptations.contains(adaptation.toLowerCase())){
                this.adaptation = adaptation.toLowerCase();
            }
            else{
                throw new IllegalArgumentException(adaptation +" is not a valid adaptation");
            }
        }
        else{
            throw new IllegalArgumentException(adaptation + " is not a vlaid word");
        }
    }//end of setAdaptation
    
    
    /**
     * checks inputted habitat to see if valid habitats then sets the habitat value
     * @param habitat 
     */
    public void setHabitat(String habitat) {
        if(super.validWord(habitat)){
            if(habitats.contains(habitat.toLowerCase())){
                this.habitat = habitat.toLowerCase();
            }
            else{
                throw new IllegalArgumentException(habitat +" is not a valid habitat");
            }
        }
        else{
            throw new IllegalArgumentException(habitat + " is not a vlaid word");
        }
    }// end of setHabitat

    //////////////////////////// GETTER ///////////////////////////////////////////////////////////
    
    public boolean getGills() {
        return gills;
    }

    public String getAdaptation() {
        return adaptation;
    }

    public String getHabitat() {
        return habitat;
    }
    
        public String toString(){
        String gills;
        if (getGills())
            gills = "has";
        else
            gills = "does not have";
        return "Your Dino is called " + super.getName() + ", from the " + super.getSpecies() + " species. /n It is " + super.getSize() + " feet long "
                + "and is found in ther" + super.getType() + " in the "+ getHabitat() +"'s, /n it can carry " + super.getCargoCapacity() 
                + ". This Dino " + gills + " Gills.";
    }
    
    
    
}//end of WaterDino class
