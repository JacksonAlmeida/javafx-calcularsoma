package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane pane = FXMLLoader.load(getClass().getResource("/gui/mainView.fxml"));
			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Calcular");
			primaryStage.show();
		}
		catch (IOException e) {
		e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
