/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkdinos;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Sean
 */
public class Dinotesting {
        public static void main(String[] args)
    {
        FlyingDino one = new FlyingDino(10.5, 20.5, 30.5, "Pteradon", "Jurassic", "Quitzle", LocalDate.of(2016, Month.JANUARY, 1),20);
        LandDino two = new LandDino("fur","dessert",false,30.5, "Bronto", "Triassic", "longNeck", LocalDate.of(2016, Month.JANUARY, 1),20);
        WaterDino three = new WaterDino(true,"electric","swamp",30.5, "Electric Eel", "Ancient", "Eel", LocalDate.of(2016, Month.JANUARY, 1),20);
    }
}
