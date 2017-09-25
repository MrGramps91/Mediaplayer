package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Player player = new Player("file:///C:/"); //used temporarily until a 'file select option is incorporated//
		Scene scene = new Scene(player,1280,760, Color.BLACK); //used temporarily until 'automatic video scaling is incorporated//
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
