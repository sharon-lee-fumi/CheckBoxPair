/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltwo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Xiaowen Li
 */
public class FinalTwo extends Application
{
    private TextFieldPair t1,t2,t3,t4; 
    
    @Override
    public void start(Stage primaryStage)
    {
        VBox root = new VBox();
        t1 = new TextFieldPair();
        t2 = new TextFieldPair();
        t3 = new TextFieldPair();
        t4 = new TextFieldPair();
       
        root.getChildren().add(t1); 
        root.getChildren().add(t2); 
        root.getChildren().add(t3); 
        root.getChildren().add(t4);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
