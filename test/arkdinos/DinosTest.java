/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkdinos;

import java.time.LocalDate;
import java.time.Month;
import java.util.Set;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sean
 */
public class DinosTest {
    
    private FlyingDino flyingDino;
    private LandDino landDino;
    private WaterDino waterDino;
    
    public DinosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.flyingDino = new FlyingDino(10.5, 20.5, 30.5, "Pteradon", "Jurassic", "Quitzle", LocalDate.of(2016, Month.JANUARY, 1),20);
        this.landDino = new LandDino("fur","dessert",false,30.5, "Bronto", "Triassic", "longNeck", LocalDate.of(2016, Month.JANUARY, 1),20);
        this.waterDino = new WaterDino(true,"electric","swamp",30.5, "Electric Eel", "Ancient", "Eel", LocalDate.of(2016, Month.JANUARY, 1),20);
    }
    @After
    public void tearDown() {
    }

    
    ///////////////////////WaterDino/////////////////////////////////////////////////////////////////////////
    /**
     * Test of getName method, of class WaterDino.
     */
    @Test
    public void testGetNameWaterDino() {
        String expResult = "Electric Eel";
        String result = this.waterDino.getName();
        assertEquals(expResult, result);
    }
    /**
     * Test of setName method, of class WaterDino.
     */
    @Test
    public void testSetNameWaterDino(){
        String name = "whale";
        String expResult = "whale";
        waterDino.setName(name);
        String result = waterDino.getName();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setName method, of class WaterDino.
     */
    @Test
    public void testSetNameWaterDinoInvalid(){
        String name = "wha-le";
        try{
            waterDino.setName(name);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setName (waterDino) correctly identified improper name -> \"%s\"%n",e.getMessage());
        }            
    }
    
    
    /////////////////// end of Name testing ///////////////////////////////////////////////
        /**
     * Test of getSize method, of class WaterDino.
     */
    @Test
    public void testGetSizeWaterDino() {
        Double expResult = 30.5;
        Double result = this.waterDino.getSize();
        assertEquals(expResult, result);
    }
    /**
     * Test of setSize method, of class WaterDino.
     */
    @Test
    public void testSetSizeWaterDino(){
        Double size = 31.5;
        Double expResult = 31.5;
        waterDino.setSize(size);
        Double result = waterDino.getSize();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setSize method, of class WaterDino.
     */
    @Test
    public void testSetSizeWaterDinoInvalid(){
        Double size = -1.5;
        try{
            waterDino.setSize(size);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setSize (waterDino) correctly identified improper size -> \"%s\"%n",e.getMessage());
        }            
    }

    /////////////////////////////// end of Size Testing /////////////////////////////////////////////////////////////////
    
    ///////////////////////WaterDino/////////////////////////////////////////////////////////////////////////
     /**
     * Test of getEraFrom method, of class WaterDino.
     */
    @Test
    public void testGetEraFromWaterDino() {
        String expResult = "Ancient";
        String result = this.waterDino.getEraFrom();
        assertEquals(expResult, result);
    }
    /**
     * Test of setEraFrom method, of class WaterDino.
     */
    @Test
    public void testSetEraFromWaterDino(){
        String era = "Old";
        String expResult = "Old";
        waterDino.setEraFrom(era);
        String result = waterDino.getEraFrom();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setEraFrom method, of class WaterDino.
     */
    @Test
    public void testSetEraFromWaterDinoInvalid(){
        String era = "Anc$nt";
        try{
            waterDino.setEraFrom(era);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setEraFrom (waterDino) correctly identified improper era -> \"%s\"%n",e.getMessage());
        }            
    }
    //////////////////////////// end of EraFrom testing/////////////////////////////////////////////////////////   
    
         /**
     * Test of getType method, of class WaterDino.
     */
    @Test
    public void testGetTypeWaterDino() {
        String expResult = "water";
        String result = this.waterDino.getType();
        assertEquals(expResult, result);
    }
    /**
     * Test of setType method, of class WaterDino.
     */
    @Test
    public void testSetTypeWaterDino(){
        String type = "land";
        String expResult = "land";
        waterDino.setType(type);
        String result = waterDino.getType();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setType method, of class WaterDino.
     */
    @Test
    public void testSetTypeWaterDinoInvalid(){
        String type = "Anc$nt";
        try{
            waterDino.setType(type);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setType (waterDino) correctly identified improper type -> \"%s\"%n",e.getMessage());
        }            
    }

        /**
     * Test of invalid setType method, of class WaterDino.
     */
    @Test
    public void testSetTypeWaterDinoInvalid2(){
        String type = "small";
        try{
            waterDino.setType(type);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setType (waterDino) correctly identified improper type -> \"%s\"%n",e.getMessage());
        }            
    }
    
    ///////////////////////////// End of tpye testing ///////////////////////////////////////////////////////////////////
    
         /**
     * Test of getSpecies method, of class WaterDino.
     */
    @Test
    public void testGetSpeciesWaterDino() {
        String expResult = "Eel";
        String result = this.waterDino.getSpecies();
        assertEquals(expResult, result);
    }
    /**
     * Test of setSpecies method, of class WaterDino.
     */
    @Test
    public void testSetSpeciesWaterDino(){
        String species = "Whales";
        String expResult = "Whales";
        waterDino.setSpecies(species);
        String result = waterDino.getSpecies();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setSpecies method, of class WaterDino.
     */
    @Test
    public void testSetSpeciesWaterDinoInvalid(){
        String species = "Sha5rks";
        try{
            waterDino.setSpecies(species);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setSpecies (waterDino) correctly identified improper species -> \"%s\"%n",e.getMessage());
        }            
    }
    
    /////////////////////// end of Species testing /////////////////////////////////////////////////////////////////
    
    /**
     * Test of getDateTamed method, of class WaterDino.
     */
    @Test
    public void testGetDateTamedWaterDino() {
        LocalDate expResult = LocalDate.of(2016, Month.JANUARY, 1);
        LocalDate result = waterDino.getDateTamed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateTamed method, of class WaterDino.
     */
    @Test
    public void testSetDateTamed() {
        LocalDate dateTeamed = LocalDate.of(2003, Month.JANUARY, 1);
        waterDino.setDateTamed(dateTeamed);
        LocalDate expResult = dateTeamed;
        LocalDate result = waterDino.getDateTamed();
        assertEquals(expResult, result);
    }

    
    /**
     * Test of setDateTamed method, of class WaterDino.
     */
    @Test
    public void testSetDateTamedInvalid() {
        LocalDate dateTeamed = LocalDate.of(2018, Month.JANUARY, 1);
        try
        {
            waterDino.setDateTamed(dateTeamed);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setDateTamed (waterDino) correctly identified someone as too young -> \"%s\"%n",e.getMessage());
        }
    }
     
    ///////////////////////// end of dateTamed ////////////////////////////////////////////////////////////////////////////
    
                /**
     * Test of getCargoCapacity method, of class WaterDino.
     */
    @Test
    public void testGetCargoCapacityWaterDino() {
        int expResult = 20;
        int result = this.waterDino.getCargoCapacity();
        assertEquals(expResult, result);
    }
    /**
     * Test of setCargoCapacity method, of class WaterDino.
     */
    @Test
    public void testSetCargoCapacityWaterDino(){
        int cargoCap = 20;
        int expResult = 20;
        waterDino.setCargoCapacity(cargoCap);
        int result = waterDino.getCargoCapacity();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setCargoCapacity method, of class WaterDino.
     */
    @Test
    public void testSetCargoCapacityWaterDinoInvalid(){
        int cargoCap = 37;
        try{
            waterDino.setCargoCapacity(cargoCap);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setCargoCapacity (waterDino) correctly identified improper cargoCap  -> \"%s\"%n",e.getMessage());
        }            
    }
    
    /**
     * Test of invalid setCargoCapacity method, of class WaterDino.
     */
    @Test
    public void testSetCargoCapacityWaterDinoInvalid2(){
        int cargoCap = -1;
        try{
            waterDino.setCargoCapacity(cargoCap);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setCargoCapacity (waterDino) correctly identified improper cargoCap -> \"%s\"%n",e.getMessage());
        }            
    }
    
    //////////////////////// end of testing CargoCapacity /////////////////////////////////////////////////////////
     
    //////////////////////////Water Class  specialty////////////////////////
    
    /**
     * Test of getGills method, of class WaterDino.
     */
    @Test
    public void testGetGillsWaterDino() {
        boolean expResult = true;
        boolean result = this.waterDino.getGills();
        assertEquals(expResult, result);
    }
    /**
     * Test of setGills method, of class WaterDino to valid false
     */
    @Test
    public void testSetGillsWaterDino(){
        boolean gills = false;
        waterDino.setHabitat("ocean");
        boolean expResult = false;
        waterDino.setGills(gills);
        boolean result = waterDino.getGills();
        assertEquals(expResult, result);             
    }
   
    /**
     * Test of invalid setGills method false not ocean, of class WaterDino.
     */
    @Test
    public void testSetGillsWaterDinoInvalid(){
        waterDino.setHabitat("swamp");
        boolean gills = false;
        try{
            waterDino.setGills(gills);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setGills (waterDino) correctly identified improper gills  -> \"%s\"%n",e.getMessage());
        }            
    }

    //////////////////////////////// end of gills testing ////////////////////////////////////////////////////
    
         /**
     * Test of getHabitat method, of class WaterDino.
     */
    @Test
    public void testGetHabitatWaterDino() {
        String expResult = "swamp";
        String result = this.waterDino.getHabitat();
        assertEquals(expResult, result);
    }
    /**
     * Test of setHabitat method, of class WaterDino with converting to lower case.
     */
    @Test
    public void testSetHabitatWaterDino(){
        String habitat = "oCeAn";
        String expResult = "ocean";
        waterDino.setHabitat(habitat);
        String result = waterDino.getHabitat();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setHabitat method, of class WaterDino.
     */
    @Test
    public void testSetHabitatWaterDinoInvalid(){
        String habitat = "Oce5n";
        try{
            waterDino.setHabitat(habitat);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setHabitat (waterDino) correctly identified improper habitat -> \"%s\"%n",e.getMessage());
        }            
    }
    /**
     * Test of invalid setHabitat method, of class WaterDino not in valid array.
     */
    @Test
    public void testSetHabitatWaterDinoInvalid2(){
        String habitat = "dessert";
        try{
            waterDino.setHabitat(habitat);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setHabitat (waterDino) correctly identified improper habitat -> \"%s\"%n",e.getMessage());
        }            
    }
    
    
    
    ////////////////////////////////// end of habitat testing /////////////////////////////////////////
    
   
     /**
     * Test of getAdaptation method, of class WaterDino.
     */
    @Test
    public void testGetAdaptationWaterDino() {
        String expResult = "electric";
        String result = this.waterDino.getAdaptation();
        assertEquals(expResult, result);
    }
    /**
     * Test of setAdaptation method, of class WaterDino with converting to lower case.
     */
    @Test
    public void testSetAdaptationWaterDino(){
        String adaptation = "gloW";
        String expResult = "glow";
        waterDino.setAdaptation(adaptation);
        String result = waterDino.getAdaptation();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setAdaptation method, of class WaterDino.
     */
    @Test
    public void testSetAdaptationWaterDinoInvalid(){
        String adaptation = "Gl0w";
        try{
            waterDino.setAdaptation(adaptation);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setAdaptation (waterDino) correctly identified improper adaptation -> \"%s\"%n",e.getMessage());
        }            
    }
    /**
     * Test of invalid setAdaptation method, of class WaterDino not in valid array but valid word.
     */
    @Test
    public void testSetAdaptationWaterDinoInvalid2(){
        String adaptation = "dessert";
        try{
            waterDino.setAdaptation(adaptation);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setAdaptation (waterDino) correctly identified improper adaptation -> \"%s\"%n",e.getMessage());
        }            
    }

    //////////////////////////////// end of adaptation tests ///////////////////////////////////////////////////////
    
    

    
    
    
    ///////////////////////FlyingDino/////////////////////////////////////////////////////////////////////////
    /**
     * Test of getName method, of class FlyingDino.
     */
    @Test
    public void testGetNameFlyingDino() {
        String expResult = "Pteradon";
        String result = this.flyingDino.getName();
        assertEquals(expResult, result);
    }
    /**
     * Test of setName method, of class FlyingDino.
     */
    @Test
    public void testSetNameFlyingDino(){
        String name = "whale";
        String expResult = "whale";
        flyingDino.setName(name);
        String result = flyingDino.getName();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setName method, of class FlyingDino.
     */
    @Test
    public void testSetNameFlyingDinoInvalid(){
        String name = "wha-le";
        try{
            flyingDino.setName(name);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setName (flyingDino) correctly identified improper name -> \"%s\"%n",e.getMessage());
        }            
    }
    
    
    /////////////////// end of Name testing ///////////////////////////////////////////////
        /**
     * Test of getSize method, of class FlyingDino.
     */
    @Test
    public void testGetSizeFlyingDino() {
        Double expResult = 30.5;
        Double result = this.flyingDino.getSize();
        assertEquals(expResult, result);
    }
    /**
     * Test of setSize method, of class FlyingDino.
     */
    @Test
    public void testSetSizeFlyingDino(){
        Double size = 31.5;
        Double expResult = 31.5;
        flyingDino.setSize(size);
        Double result = flyingDino.getSize();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setSize method, of class FlyingDino.
     */
    @Test
    public void testSetSizeFlyingDinoInvalid(){
        Double size = -1.5;
        try{
            flyingDino.setSize(size);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setSize (flyingDino) correctly identified improper size -> \"%s\"%n",e.getMessage());
        }            
    }

    /////////////////////////////// end of Size Testing /////////////////////////////////////////////////////////////////
    
    ///////////////////////FlyingDino/////////////////////////////////////////////////////////////////////////
     /**
     * Test of getEraFrom method, of class FlyingDino.
     */
    @Test
    public void testGetEraFromFlyingDino() {
        String expResult = "Jurassic";
        String result = this.flyingDino.getEraFrom();
        assertEquals(expResult, result);
    }
    /**
     * Test of setEraFrom method, of class FlyingDino.
     */
    @Test
    public void testSetEraFromFlyingDino(){
        String era = "Old";
        String expResult = "Old";
        flyingDino.setEraFrom(era);
        String result = flyingDino.getEraFrom();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setEraFrom method, of class FlyingDino.
     */
    @Test
    public void testSetEraFromFlyingDinoInvalid(){
        String era = "Anc$nt";
        try{
            flyingDino.setEraFrom(era);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setEraFrom (flyingDino) correctly identified improper era -> \"%s\"%n",e.getMessage());
        }            
    }
    //////////////////////////// end of EraFrom testing/////////////////////////////////////////////////////////   
    
         /**
     * Test of getType method, of class FlyingDino.
     */
    @Test
    public void testGetTypeFlyingDino() {
        String expResult = "flying";
        String result = this.flyingDino.getType();
        assertEquals(expResult, result);
    }
    /**
     * Test of setType method, of class FlyingDino.
     */
    @Test
    public void testSetTypeFlyingDino(){
        String type = "flying";
        String expResult = "flying";
        flyingDino.setType(type);
        String result = flyingDino.getType();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setType method, of class FlyingDino.
     */
    @Test
    public void testSetTypeFlyingDinoInvalid(){
        String type = "Anc$nt";
        try{
            flyingDino.setType(type);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setType (flyingDino) correctly identified improper type -> \"%s\"%n",e.getMessage());
        }            
    }

        /**
     * Test of invalid setType method, of class FlyingDino.
     */
    @Test
    public void testSetTypeFlyingDinoInvalid2(){
        String type = "small";
        try{
            flyingDino.setType(type);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setType (flyingDino) correctly identified improper type -> \"%s\"%n",e.getMessage());
        }            
    }
    
    ///////////////////////////// End of tpye testing ///////////////////////////////////////////////////////////////////
    
         /**
     * Test of getSpecies method, of class FlyingDino.
     */
    @Test
    public void testGetSpeciesFlyingDino() {
        String expResult = "Quitzle";
        String result = this.flyingDino.getSpecies();
        assertEquals(expResult, result);
    }
    /**
     * Test of setSpecies method, of class FlyingDino.
     */
    @Test
    public void testSetSpeciesFlyingDino(){
        String species = "Reptiles";
        String expResult = "Reptiles";
        flyingDino.setSpecies(species);
        String result = flyingDino.getSpecies();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setSpecies method, of class FlyingDino.
     */
    @Test
    public void testSetSpeciesFlyingDinoInvalid(){
        String species = "Sha5rks";
        try{
            flyingDino.setSpecies(species);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setSpecies (flyingDino) correctly identified improper species -> \"%s\"%n",e.getMessage());
        }            
    }
    
    /////////////////////// end of Species testing /////////////////////////////////////////////////////////////////
    
    /**
     * Test of getDateTamed method, of class FlyingDino.
     */
    @Test
    public void testGetDateTamedFlyingDino() {
        LocalDate expResult = LocalDate.of(2016, Month.JANUARY, 1);
        LocalDate result = flyingDino.getDateTamed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateTamed method, of class FlyingDino.
     */
    @Test
    public void testSetDateTamedFlyingDino() {
        LocalDate dateTeamed = LocalDate.of(2003, Month.JANUARY, 1);
        flyingDino.setDateTamed(dateTeamed);
        LocalDate expResult = dateTeamed;
        LocalDate result = flyingDino.getDateTamed();
        assertEquals(expResult, result);
    }

    
    /**
     * Test of setDateTamed method, of class FlyingDino.
     */
    @Test
    public void testSetDateTamedFlyingDinoInvalid() {
        LocalDate dateTeamed = LocalDate.of(2018, Month.JANUARY, 1);
        try
        {
            flyingDino.setDateTamed(dateTeamed);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setDateTamed (flyingDino) correctly identified someone as too young -> \"%s\"%n",e.getMessage());
        }
    }
     
    ///////////////////////// end of dateTamed ////////////////////////////////////////////////////////////////////////////
    
    /**
     * Test of getCargoCapacity method, of class FlyingDino.
     */
    @Test
    public void testGetCargoCapacityFlyingDino() {
        int expResult = 20;
        int result = this.flyingDino.getCargoCapacity();
        assertEquals(expResult, result);
    }
    /**
     * Test of setCargoCapacity method, of class FlyingDino.
     */
    @Test
    public void testSetCargoCapacityFlyingDino(){
        int cargoCap = 20;
        int expResult = 20;
        flyingDino.setCargoCapacity(cargoCap);
        int result = flyingDino.getCargoCapacity();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setCargoCapacity method, of class FlyingDino.
     */
    @Test
    public void testSetCargoCapacityFlyingDinoInvalid(){
        int cargoCap = 37;
        try{
            flyingDino.setCargoCapacity(cargoCap);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setCargoCapacity (flyingDino) correctly identified improper cargoCap  -> \"%s\"%n",e.getMessage());
        }            
    }
    
    /**
     * Test of invalid setCargoCapacity method, of class FlyingDino.
     */
    @Test
    public void testSetCargoCapacityFlyingDinoInvalid2(){
        int cargoCap = -1;
        try{
            flyingDino.setCargoCapacity(cargoCap);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setCargoCapacity (flyingDino) correctly identified improper cargoCap -> \"%s\"%n",e.getMessage());
        }            
    }
    
    ////////////////////////// end of flying cargo testing /////////////////////////////////////////////
    
    ///////////////////////// specialty flying ///////////////////////////////////////////////
    /**
     * Test of getCarryWeight method, of class FlyingDino.
     */
    @Test
    public void testGetCarryWeightFlyingDino() {
        Double expResult = 10.5;
        Double result = this.flyingDino.getCarryWeight();
        assertEquals(expResult, result);
    }
    /**
     * Test of setCarryWeight method, of class FlyingDino.
     */
    @Test
    public void testSetCarryWeightFlyingDino(){
        Double carryWeight = 10.5;
        Double expResult = 10.5;
        flyingDino.setCarryWeight(carryWeight);
        Double result = flyingDino.getCarryWeight();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setCarryWeight method, of class FlyingDino.
     */
    @Test
    public void testSetCarryWeightFlyingDinoInvalid(){
        Double carryWeight = 37.5;
        try{
            flyingDino.setCarryWeight(carryWeight);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setCarryWeight (flyingDino) correctly identified improper carryWeight  -> \"%s\"%n",e.getMessage());
        }            
    }
    
    /**
     * Test of invalid setCarryWeight method, of class FlyingDino.
     */
    @Test
    public void testSetCarryWeightFlyingDinoInvalid2(){
        Double carryWeight = -1.5;
        try{
            flyingDino.setCarryWeight(carryWeight);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setCarryWeight (flyingDino) correctly identified improper carryWeight -> \"%s\"%n",e.getMessage());
        }            
    }    
    
    //////////////////////////////// end of carry weight Tests ////////////////////////////////////////////////////
        /**
     * Test of getFlightDistance method, of class FlyingDino.
     */
    @Test
    public void testGetFlightDistanceFlyingDino() {
        Double expResult = 20.5;
        Double result = this.flyingDino.getFlightDistance();
        assertEquals(expResult, result);
    }
    /**
     * Test of setFlightDistance method, of class FlyingDino.
     */
    @Test
    public void testSetFlightDistanceFlyingDino(){
        Double flightDistance = 10.5;
        Double expResult = 10.5;
        flyingDino.setFlightDistance(flightDistance);
        Double result = flyingDino.getFlightDistance();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setFlightDistance method, of class FlyingDino to high.
     */
    @Test
    public void testSetFlightDistanceFlyingDinoInvalid(){
        Double flightDistance = 2000.5;
        try{
            flyingDino.setFlightDistance(flightDistance);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setFlightDistance (flyingDino) correctly identified improper flightDistance  -> \"%s\"%n",e.getMessage());
        }            
    }
    
    /**
     * Test of invalid setFlightDistance method, of class FlyingDino negative number.
     */
    @Test
    public void testSetFlightDistanceFlyingDinoInvalid2(){
        Double flightDistanceNegative = -1.5;
        try{
            flyingDino.setFlightDistance(flightDistanceNegative);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setFlightDistance (flyingDino) correctly identified improper flightDistance -> \"%s\"%n",e.getMessage());
        }            
    }


    
    ///////////////////////LandDino/////////////////////////////////////////////////////////////////////////
    /**
     * Test of getName method, of class LandDino.
     */
    @Test
    public void testGetNameLandDino() {
        String expResult = "Bronto";
        String result = this.landDino.getName();
        assertEquals(expResult, result);
    }
    /**
     * Test of setName method, of class LandDino.
     */
    @Test
    public void testSetNameLandDino(){
        String name = "whale";
        String expResult = "whale";
        landDino.setName(name);
        String result = landDino.getName();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setName method, of class LandDino.
     */
    @Test
    public void testSetNameLandDinoInvalid(){
        String name = "wha-le";
        try{
            landDino.setName(name);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setName (landDino) correctly identified improper name -> \"%s\"%n",e.getMessage());
        }            
    }
    
    
    /////////////////// end of Name testing ///////////////////////////////////////////////
        /**
     * Test of getSize method, of class LandDino.
     */
    @Test
    public void testGetSizeLandDino() {
        Double expResult = 30.5;
        Double result = this.landDino.getSize();
        assertEquals(expResult, result);
    }
    /**
     * Test of setSize method, of class LandDino.
     */
    @Test
    public void testSetSizeLandDino(){
        Double size = 31.5;
        Double expResult = 31.5;
        landDino.setSize(size);
        Double result = landDino.getSize();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setSize method, of class LandDino.
     */
    @Test
    public void testSetSizeLandDinoInvalid(){
        Double size = -1.5;
        try{
            landDino.setSize(size);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setSize (landDino) correctly identified improper size -> \"%s\"%n",e.getMessage());
        }            
    }

    /////////////////////////////// end of Size Testing /////////////////////////////////////////////////////////////////
    
    ///////////////////////LandDino/////////////////////////////////////////////////////////////////////////
     /**
     * Test of getEraFrom method, of class LandDino.
     */
    @Test
    public void testGetEraFromLandDino() {
        String expResult = "Triassic";
        String result = this.landDino.getEraFrom();
        assertEquals(expResult, result);
    }
    /**
     * Test of setEraFrom method, of class LandDino.
     */
    @Test
    public void testSetEraFromLandDino(){
        String era = "Old";
        String expResult = "Old";
        landDino.setEraFrom(era);
        String result = landDino.getEraFrom();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setEraFrom method, of class LandDino.
     */
    @Test
    public void testSetEraFromLandDinoInvalid(){
        String era = "Anc$nt";
        try{
            landDino.setEraFrom(era);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setEraFrom (landDino) correctly identified improper era -> \"%s\"%n",e.getMessage());
        }            
    }
    //////////////////////////// end of EraFrom testing/////////////////////////////////////////////////////////   
    
         /**
     * Test of getType method, of class LandDino.
     */
    @Test
    public void testGetTypeLandDino() {
        String expResult = "land";
        String result = this.landDino.getType();
        assertEquals(expResult, result);
    }
    /**
     * Test of setType method, of class LandDino.
     */
    @Test
    public void testSetTypeLandDino(){
        String type = "land";
        String expResult = "land";
        landDino.setType(type);
        String result = landDino.getType();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setType method, of class LandDino.
     */
    @Test
    public void testSetTypeLandDinoInvalid(){
        String type = "Anc$nt";
        try{
            landDino.setType(type);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setType (landDino) correctly identified improper type -> \"%s\"%n",e.getMessage());
        }            
    }

        /**
     * Test of invalid setType method, of class LandDino.
     */
    @Test
    public void testSetTypeLandDinoInvalid2(){
        String type = "small";
        try{
            landDino.setType(type);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setType (landDino) correctly identified improper type -> \"%s\"%n",e.getMessage());
        }            
    }
    
    ///////////////////////////// End of tpye testing ///////////////////////////////////////////////////////////////////
    
         /**
     * Test of getSpecies method, of class LandDino.
     */
    @Test
    public void testGetSpeciesLandDino() {
        String expResult = "longNeck";
        String result = this.landDino.getSpecies();
        assertEquals(expResult, result);
    }
    /**
     * Test of setSpecies method, of class LandDino.
     */
    @Test
    public void testSetSpeciesLandDino(){
        String species = "Reptiles";
        String expResult = "Reptiles";
        landDino.setSpecies(species);
        String result = landDino.getSpecies();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setSpecies method, of class LandDino.
     */
    @Test
    public void testSetSpeciesLandDinoInvalid(){
        String species = "Sha5rks";
        try{
            landDino.setSpecies(species);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setSpecies (landDino) correctly identified improper species -> \"%s\"%n",e.getMessage());
        }            
    }
    
    /////////////////////// end of Species testing /////////////////////////////////////////////////////////////////
    
    /**
     * Test of getDateTamed method, of class LandDino.
     */
    @Test
    public void testGetDateTamedLandDino() {
        LocalDate expResult = LocalDate.of(2016, Month.JANUARY, 1);
        LocalDate result = landDino.getDateTamed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateTamed method, of class LandDino.
     */
    @Test
    public void testSetDateLandTamed() {
        LocalDate dateTeamed = LocalDate.of(2003, Month.JANUARY, 1);
        landDino.setDateTamed(dateTeamed);
        LocalDate expResult = dateTeamed;
        LocalDate result = landDino.getDateTamed();
        assertEquals(expResult, result);
    }

    
    /**
     * Test of setDateTamed method, of class LandDino.
     */
    @Test
    public void testSetDateTamedLandInvalid() {
        LocalDate dateTeamed = LocalDate.of(2018, Month.JANUARY, 1);
        try
        {
            landDino.setDateTamed(dateTeamed);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setDateTamed (landDino) correctly identified someone as too young -> \"%s\"%n",e.getMessage());
        }
    }
     
    ///////////////////////// end of dateTamed ////////////////////////////////////////////////////////////////////////////
    
                /**
     * Test of getCargoCapacity method, of class LandDino.
     */
    @Test
    public void testGetCargoCapacityLandDino() {
        int expResult = 20;
        int result = this.landDino.getCargoCapacity();
        assertEquals(expResult, result);
    }
    /**
     * Test of setCargoCapacity method, of class LandDino.
     */
    @Test
    public void testSetCargoCapacityLandDino(){
        int cargoCap = 20;
        int expResult = 20;
        landDino.setCargoCapacity(cargoCap);
        int result = landDino.getCargoCapacity();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setCargoCapacity method, of class LandDino.
     */
    @Test
    public void testSetCargoCapacityLandDinoInvalid(){
        int cargoCap = 37;
        try{
            landDino.setCargoCapacity(cargoCap);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setCargoCapacity (landDino) correctly identified improper cargoCap  -> \"%s\"%n",e.getMessage());
        }            
    }
    
    /**
     * Test of invalid setCargoCapacity method, of class LandDino.
     */
    @Test
    public void testSetCargoCapacityLandDinoInvalid2(){
        int cargoCap = -1;
        try{
            landDino.setCargoCapacity(cargoCap);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setCargoCapacity (landDino) correctly identified improper cargoCap -> \"%s\"%n",e.getMessage());
        }            
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    ///////////////////////////////////// specialty Land Dino //////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
    /**
     * Test of getPiosonous method, of class LandDino.
     */
    @Test
    public void testGetPiosonousLandDino() {
        boolean expResult = false;
        boolean result = this.landDino.getPiosonous();
        assertEquals(expResult, result);
    }
    /**
     * Test of setPiosonous method, of class LandDino to valid true
     */
    @Test
    public void testSetPiosonousLandDino(){
        boolean piosonous = true;
        landDino.setHabitat("swamp");
        boolean expResult = true;
        landDino.setPiosonous(piosonous);
        boolean result = landDino.getPiosonous();
        assertEquals(expResult, result);             
    }
   
    /**
     * Test of invalid setPiosonous method true not swamp, of class LandDino.
     */
    @Test
    public void testSetPiosonousLandDinoInvalid(){
        landDino.setHabitat("forest");
        boolean piosonous = true;
        try{
            landDino.setPiosonous(piosonous);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setPiosonous (landDino) correctly identified improper piosonous  -> \"%s\"%n",e.getMessage());
        }            
    }

    //////////////////////////////// end of piosonous testing ////////////////////////////////////////////////////

         /**
     * Test of getHabitat method, of class LandDino.
     */
    @Test
    public void testGetHabitatLandDino() {
        String expResult = "dessert";
        String result = this.landDino.getHabitat();
        assertEquals(expResult, result);
    }
    /**
     * Test of setHabitat method, of class LandDino with converting to lower case.
     */
    @Test
    public void testSetHabitatLandDino(){
        String habitat = "SWAMP";
        String expResult = "swamp";
        landDino.setHabitat(habitat);
        String result = landDino.getHabitat();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setHabitat method, of class LandDino.
     */
    @Test
    public void testSetHabitatLandDinoInvalid(){
        String habitat = "Oce5n";
        try{
            landDino.setHabitat(habitat);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setHabitat (landDino) correctly identified improper habitat -> \"%s\"%n",e.getMessage());
        }            
    }
    
    ////////////////////////////////// end of habitat testing /////////////////////////////////////////
    
         /**
     * Test of getSkinType method, of class LandDino.
     */
    @Test
    public void testGetSkinTypeLandDino() {
        String expResult = "fur";
        String result = this.landDino.getSkinType();
        assertEquals(expResult, result);
    }
    /**
     * Test of setSkinType method, of class LandDino with converting to lower case.
     */
    @Test
    public void testSetSkinTypeLandDino(){
        String adaptation = "scales";
        String expResult = "scales";
        landDino.setSkinType(adaptation);
        String result = landDino.getSkinType();
        assertEquals(expResult, result);             
    }
    
    /**
     * Test of invalid setSkinType method, of class LandDino.
     */
    @Test
    public void testSetSkinTypeLandDinoInvalid(){
        String adaptation = "Gl0w";
        try{
            landDino.setSkinType(adaptation);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setSkinType (landDino) correctly identified improper adaptation -> \"%s\"%n",e.getMessage());
        }            
    }
    /**
     * Test of invalid setSkinType method, of class LandDino not in valid array but valid word.
     */
    @Test
    public void testSetSkinTypeLandDinoInvalid2(){
        String adaptation = "smiles";
        try{
            landDino.setSkinType(adaptation);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("setSkinType (landDino) correctly identified improper adaptation -> \"%s\"%n",e.getMessage());
        }            
    }
    
    
    
    ////////////////////////////////////////////////// end of skin type testing//////////////////////////////////

        
}
