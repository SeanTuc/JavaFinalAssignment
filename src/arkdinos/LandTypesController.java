/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkdinos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sean
 */
public class LandTypesController implements Initializable {
    //These are combobox example
    @FXML private Label comboBoxHabitatLabel;
    @FXML private ComboBox comboBoxHabitat;
    
    
//These are combobox 
    @FXML private Label comboBoxSkinLabel;
    @FXML private ComboBox comboBoxSkin;

// Text fields

        // Text fields
    @FXML private TextField cargoWeightTextField;
    @FXML private TextField nameTextField;
    @FXML private TextField eraTextField;
    @FXML private TextField speciesTextField;
    @FXML private TextField carryWeightTextField;
    @FXML private TextField flightDistanceTextField;
    @FXML private DatePicker tamedDatePicker;
    @FXML private Label errorLabel;
    @FXML private Slider sizeSlider;
    @FXML private Label sliderValueLables;
    @FXML private RadioButton  piosonousRadioButton;
    @FXML private RadioButton noPiosonousRadioButton;
    @FXML private ToggleGroup  piosonousToggleGroup;
    
    private boolean piosonous;
    
    
    
    public void comboBoxHabitatChanged(){
        comboBoxHabitatLabel.setText("Your selected habitat is: \n" + comboBoxHabitat.getValue().toString());
    }
    
    
    
    public void comboBoxSkinChanged(){
        comboBoxHabitatLabel.setText("Your selected Dino skin is: \n" + comboBoxHabitat.getValue().toString());
    }
    
    public void radioButtonBoxChanged(){
        if (piosonousToggleGroup.getSelectedToggle().equals(this.piosonousRadioButton))
            piosonous = true;
        if (piosonousToggleGroup.getSelectedToggle().equals(this.noPiosonousRadioButton))
            piosonous = false;
    }
    
    public void SliderValueChanged(){
        sliderValueLables.setText(Double.toString(sizeSlider.getValue()));
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this. piosonousToggleGroup = new ToggleGroup();
        this. piosonousRadioButton.setToggleGroup( piosonousToggleGroup);
        this.noPiosonousRadioButton.setToggleGroup( piosonousToggleGroup);
        
        comboBoxHabitat.setValue(null);
        comboBoxHabitat.getItems().addAll("Swamp","Jungle","Mountains","Rain forest","Forest", "Plains","Dessert","Tundra");
        
        
        comboBoxSkin.setValue(null);
        comboBoxSkin.getItems().addAll("Fur","Scales","Plates","Shell","Feathers");
    }    
    
    public void landChangeToDinoTypeButtonPushed(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("DinoTypes.fxml"));

        Parent tableView = loader.load();
        Scene scene = new Scene(tableView);
        // now we have a scene but we need to access the Stage to set the Stage

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Dino Types");
        window.setScene(scene);
        window.show();
    }

    
    
    /**
     * newDinoButtonPushed 
     */
    public void newDinoButtonPushed() throws IOException{
        // validate text fields have required info

        if (!comboBoxSkin.getValue().toString().isEmpty()&& !comboBoxHabitat.getValue().toString().isEmpty() &&
                !nameTextField.getText().isEmpty() && !eraTextField.getText().isEmpty() &&
                !speciesTextField.getText().isEmpty() && sizeSlider.getValue() > 0 
                && tamedDatePicker.getValue()!= null)
            
        {
          try
          {   LandDino newLandDino = new LandDino(comboBoxSkin.getValue().toString(),comboBoxHabitat.getValue().toString(),
                  piosonous, sizeSlider.getValue(), nameTextField.getText(),
                    eraTextField.getText(), speciesTextField.getText(), tamedDatePicker.getValue(),
                    Integer.parseInt(cargoWeightTextField.getText()));
          writeToFile("LandDino.txt",newLandDino.toString());
          // clear out the input fields    
            cargoWeightTextField.clear();
            nameTextField.clear();
            eraTextField.clear();
            speciesTextField.clear();
            comboBoxSkin.setValue(null);
            comboBoxHabitat.setValue(null);
            tamedDatePicker.setValue(null);
            errorLabel.setText("Succesfully Added ");
          
          }
           catch(IllegalArgumentException e)
           {
               errorLabel.setText("Your information is not valid. Please fix \n" + e.getMessage());
           }
        }
        else {
                  errorLabel.setText("Your information is not entirely filled out. Please fix \n");
        } 
           
        
    }



    public void writeToFile(String filename, String textToSave)throws IOException{    
        try(FileWriter fw = new FileWriter(filename, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw))
    {
        out.println(textToSave);
        
    
    
    
    } catch (IOException e) {

    }
        
    }








    
    
    
    
    
    
    
    
    
    
}
