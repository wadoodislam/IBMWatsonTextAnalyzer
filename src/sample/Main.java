package sample;

import com.google.gson.Gson;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.ToneAnalyzer;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("IBMWatson.fxml"));
        primaryStage.setTitle("Text Analyzer App");
        primaryStage.setScene(new Scene(root, 1150, 775));

        primaryStage.show();

    }



    public static void main(String[] args) {

        launch(args);


    }
}
