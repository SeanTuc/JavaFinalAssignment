/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkdinos;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sean
 */
public class DinoTypesController implements Initializable {
    
    
    
    
    public void changeToLandButtonPushed(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("LandTypes.fxml"));

        Parent tableView = loader.load();
        Scene scene = new Scene(tableView);
        // now we have a scene but we need to access the Stage to set the Stage

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("list of person objects");
        window.setScene(scene);
        window.show();
    }
    
        
    public void changeToWaterButtonPushed(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("WaterTypes.fxml"));

        Parent tableView = loader.load();
        Scene scene = new Scene(tableView);
        // now we have a scene but we need to access the Stage to set the Stage

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("list of person objects");
        window.setScene(scene);
        window.show();
    }

        
       public void changeToFlyingButtonPushed(ActionEvent event) throws IOException{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("FlyingType.fxml"));
            
            Parent tableView = loader.load();
            Scene scene = new Scene(tableView);
            // now we have a scene but we need to access the Stage to set the Stage
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setTitle("list of person objects");
            window.setScene(scene);
            window.show();
        }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
