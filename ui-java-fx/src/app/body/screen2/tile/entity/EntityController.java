package app.body.screen2.tile.entity;

import dto.definition.property.definition.api.PropertyDefinitionDTO;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class EntityController {


    @FXML
    private Label entityNameLabel;



    @FXML
    private TextField populationTextField;

    private Boolean isValueChanged = false;
    private List<String> entitiesNames;
    private List<Integer> entitiesPopulations;

    @FXML
    public void initialize() {
        populationTextField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> ov, String t, String t1) {
                checkInputValidity();
            }
        });
    }
    public Integer getPopulationValue() {

        Integer population = null;
        if(isValueChanged){
            population= Integer.parseInt(populationTextField.getText());
        }
        return population;

    }
    public void setEntitiesNames(List<String> entitiesNames) {
        this.entitiesNames = entitiesNames;
    }

    @FXML
    private void checkInputValidity(){
        isValueChanged = true;
        boolean isInputValid;
        Stage primaryStage = new Stage();

        isInputValid= true;
        try {
            //check population size
        }
        catch (NumberFormatException e) {
            Label errorMessage = new Label("Max value for population .... Min value...!\nTry again.");
            StackPane root = new StackPane();
            root.getChildren().add(errorMessage);
            Scene scene = new Scene(root, 150, 80);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Error Window");
            primaryStage.show();
            isInputValid= false;
            populationTextField.clear();
        }

    }

    /*public void setEntitiesPopulations(List<Integer> entitiesPopulations) {
        this.entitiesPopulations = entitiesPopulations;
    }
    @FXML
    void setPopulation() {
        int entityIndex = getEntityIndexByName(entityNameLabel.getText());
        entitiesPopulations.set(entityIndex, Integer.parseInt(populationTextField.getText()));
    }*/

   /* public int getEntityIndexByName(String name) {
        int index = 0;

        for (String entityName : entitiesNames) {
            if (entityName.equals(name)) {
                return index;
            }
            index++;
        }
        throw new IllegalArgumentException("Can't find entity with name " + name);
    }*/

    public void setEntityNameLabel(String entityNameLabel) {
        this.entityNameLabel.setText(entityNameLabel);
    }

    public void resetTextField(){
        populationTextField.clear();
    }
}
