package com.example.sopraninja.models;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ComponentesFlauta {

    @FXML
    private TextField configFuro_1;
    @FXML
    private TextField configFuro_2;

    @FXML
    private TextField disFuro_1;
    @FXML
    private TextField disFuro_2;

    @FXML
    private TextField areaComprimento;

    @FXML
    private TextField areaNomeFlauta;

    public ComponentesFlauta () {

    }

    public TextField getConfigFuro_1() {
        return configFuro_1;
    }

    public void setConfigFuro_1(TextField configFuro_1) {
        this.configFuro_1 = configFuro_1;
    }

    public TextField getConfigFuro_2() {
        return configFuro_2;
    }

    public void setConfigFuro_2(TextField configFuro_2) {
        this.configFuro_2 = configFuro_2;
    }

    public TextField getDisFuro_1() {
        return disFuro_1;
    }

    public void setDisFuro_1(TextField disFuro_1) {
        this.disFuro_1 = disFuro_1;
    }

    public TextField getDisFuro_2() {
        return disFuro_2;
    }

    public void setDisFuro_2(TextField disFuro_2) {
        this.disFuro_2 = disFuro_2;
    }

    public TextField getAreaComprimento() {
        return areaComprimento;
    }

    public void setAreaComprimento(TextField areaComprimento) {
        this.areaComprimento = areaComprimento;
    }

    public TextField getAreaNomeFlauta() {
        return areaNomeFlauta;
    }

    public void setAreaNomeFlauta(TextField areaNomeFlauta) {
        this.areaNomeFlauta = areaNomeFlauta;
    }
}
