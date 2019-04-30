package com.misric.hut;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.misric.hut.controllers.*;


public class MainApp extends Application {

    public static String scr001LoginID = "login";
    public static String scr001loginFile = "/fxml/login.fxml";
    public static String scr002HomeID = "home";
    public static String scr002HomeFile = "/fxml/home.fxml";

    @Override
    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
//
//        Scene scene = new Scene(root);
//        scene.getStylesheets().add("/styles/Styles.css");
//
//        stage.setTitle("JavaFX and Maven");
//        stage.setScene(scene);
//        scene.setFill(Color.TRANSPARENT);
//        stage.initStyle(StageStyle.TRANSPARENT);
//        stage.show();


        ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(MainApp.scr001LoginID, MainApp.scr001loginFile);
        mainContainer.loadScreen(MainApp.scr002HomeID, MainApp.scr002HomeFile);

        mainContainer.setScreen(MainApp.scr001LoginID);

        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
