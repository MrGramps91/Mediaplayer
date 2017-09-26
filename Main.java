package application;
	
import java.io.File;
import java.net.MalformedURLException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;



public class Main extends Application {
	Player player;
	FileChooser fileChooser;
	public void start(final Stage primaryStage) {
		
		MenuItem open = new MenuItem("Open");
		Menu file = new Menu("File");
		MenuBar menu = new MenuBar();
		
		file.getItems().add(open);
		menu.getMenus().add(file);
		
		open.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				player.player.pause();
				fileChooser = new FileChooser();
				File file = fileChooser.showOpenDialog(primaryStage);
				if(file != null){
					try {
						player = new Player(file.toURI().toURL().toExternalForm());
						Scene scene = new Scene(player,1280,760, Color.BLACK );
						primaryStage.setScene(scene);
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			
		});
		
		Player player = new Player("file:///C:/Users/Public/Music/Sample%20Music/Sleep%20Away.mp3"); //figure put the proper syntx for opening files
		player.setTop(menu);
		Scene scene = new Scene(player,1280,780, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
