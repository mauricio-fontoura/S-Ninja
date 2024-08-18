package com.example.sopraninja.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TelaPrincipalController {

    @FXML
    private TextField configFuro_1, configFuro_2,configFuro_3,configFuro_4,configFuro_5,configFuro_6;

    @FXML
    private TextField disFuro_1, disFuro_2,disFuro_3,disFuro_4,disFuro_5,disFuro_6;

    @FXML
    private TextField areaComprimento;

    @FXML
    private TextField areaNomeFlauta;

    @FXML
    private List<TextField> groupConfigFuros = new ArrayList<>();

    @FXML
    private List<TextField> groupDisFuros = new ArrayList<>();

    String testeSaida = "0.0";



    public void CriarFlauta(ActionEvent event) {
        Double porcentagens = 0.0;

        int count = 0;
        groupConfigFuros.addAll(Arrays.asList(configFuro_1,configFuro_2,configFuro_3,configFuro_4,configFuro_5,configFuro_6));
        groupDisFuros.addAll(Arrays.asList(disFuro_1,disFuro_2,disFuro_3,disFuro_4,disFuro_5,disFuro_6));

        try {
        while (count != groupConfigFuros.size()) {
                porcentagens = Double.parseDouble(groupConfigFuros.get(count).getText()) * Double.parseDouble(areaComprimento.getText());
                groupDisFuros.get(count).setText(porcentagens.toString().substring(0,3));
                System.out.println(porcentagens.toString());
                count ++;
        }
        } catch (NumberFormatException e) {
            System.out.println("area de digitação vazia");
        }
    }
}


