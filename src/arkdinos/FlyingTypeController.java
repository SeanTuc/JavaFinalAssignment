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
public class FlyingTypeController implements Initializable {
    
    
    
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
    @FXML private Label sliderValueLable;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }    

    public void SliderValueChanged(){
        sliderValueLable.setText(Double.toString(sizeSlider.getValue()));
    }
    
    
    public void flyingchangeToDinoTypeButtonPushed(ActionEvent event) throws IOException{
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
        if (!nameTextField.getText().isEmpty() && !eraTextField.getText().isEmpty() && !speciesTextField.getText().isEmpty() 
                && sizeSlider.getValue() > 0  && !carryWeightTextField.getText().isEmpty() && !flightDistanceTextField.getText().isEmpty()
                && tamedDatePicker.getValue() !=null)
            
        {
          try
          {   FlyingDino flyingDino = new FlyingDino(Double.parseDouble(carryWeightTextField.getText()),
          Double.parseDouble(flightDistanceTextField.getText()), sizeSlider.getValue(), nameTextField.getText(),
                    eraTextField.getText(), speciesTextField.getText(), tamedDatePicker.getValue(),
                    Integer.parseInt(cargoWeightTextField.getText()));
            writeToFile("flyingDino.txt",flyingDino.toString());
          // clear out the input fields    
            cargoWeightTextField.clear();
            nameTextField.clear();
            eraTextField.clear();
            speciesTextField.clear();
            carryWeightTextField.clear();
            flightDistanceTextField.clear();
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
