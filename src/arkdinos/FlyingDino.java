/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkdinos;

import java.time.LocalDate;

/**
 *
 * @author Sean
 */
public class FlyingDino extends Dinos{
    private double carryWeight, flightDistance;
    
    
    
    public FlyingDino(double carryWeight, double flightDistance, double size, String name, String eraFrom, 
            String species, LocalDate dateTamed, int cargoCapacity) {
        super(size, name, eraFrom, species, dateTamed, cargoCapacity);
        super.setType("flying");
        setCarryWeight(carryWeight);
        setFlightDistance(flightDistance);
        
    }
    
    /**
     * validates that the carry weight is less then 1/2 the size and
     * that it is greater then 0
     * @param carryWeight 
     */
    public void setCarryWeight(Double carryWeight) {
        if( carryWeight > 0 && carryWeight < (super.getSize()/2))
            this.carryWeight = carryWeight;
        else{
            throw new IllegalArgumentException("Flying Dino's carry weight must be positive and less then 100lbs,"
                    + " inputted lbs:" + carryWeight);
        }
    }
    
    /**
     * checks if flight distance is less then 20*carry weight and is > 0
     * @param flightDistance 
     */
    public void setFlightDistance(Double flightDistance) {
        if (flightDistance > 0){
            if(flightDistance < 20*carryWeight)
                this.flightDistance = flightDistance;
            else{
            throw new IllegalArgumentException("Flying Dino's flgiht distance must less then "
                    + "20*carryWeight" + flightDistance +" > " + carryWeight *20);
            }
        }
        else{
            throw new IllegalArgumentException("Flying Dino's flgiht distance must be more then 0  not: "
                     + flightDistance );
        }
    }

    /////////////////////////////////////// GETTER //////////////////////////////////
    
    public Double getCarryWeight() {
        return carryWeight;
    }

    public Double getFlightDistance() {
        return flightDistance;
    }

        public String toString(){
        String piosonous;
        return "Your Dino is called " + super.getName() + ", from the " + super.getSpecies() + ". /n It is " +
                super.getSize() + " feet long and is seen "
                + super.getType() + ", /n it can walk carrying " + super.getCargoCapacity() + " and fly for "+ getFlightDistance() +" carrying " + 
                getCarryWeight() + ".";
    }
    
}
