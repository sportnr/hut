/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misric.hut.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.misric.hut.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author user
 */
public class LoginController implements Initializable, ControlledScreen  {

    ScreensController myController;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

    @FXML
    private void goHome(ActionEvent event) {
        myController.setScreen(MainApp.scr002HomeID);
    }
}
