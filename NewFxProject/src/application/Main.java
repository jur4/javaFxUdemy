package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			HBox root = new HBox();
			
			root.setPrefSize(340.0, 70.0);
			root.setSpacing(10.0);
			root.setAlignment(Pos.CENTER);
			
			
			Button button1 = new Button();
			Button button2 = new Button();
			Button button3 = new Button();
			Button button4 = new Button();
			Button button5 = new Button();
			
			
			button1.setPrefSize(64.0, 64.0);
			button2.setPrefSize(64.0, 64.0);
			button3.setPrefSize(64.0, 64.0);
			button4.setPrefSize(64.0, 64.0);
			button5.setPrefSize(64.0, 64.0);
			
			button1.getStyleClass().add("button1");
			button2.getStyleClass().add("button2");
			button3.getStyleClass().add("button3");
			button4.getStyleClass().add("button4");
			button5.getStyleClass().add("button5");
												
			root.getChildren().add(button1);
			root.getChildren().add(button2);
			root.getChildren().add(button3);
			root.getChildren().add(button4);
			root.getChildren().add(button5);
			
			button1.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					getHostServices().showDocument("http://www.youtube.com/");
					
					
				}
			});
			
			button2.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					getHostServices().showDocument("http://de-de-facebook.com");
					
				}
				
				
			});
			
			button3.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					getHostServices().showDocument("http://twitter.com");
					
				}
				
				
			});
			
			button4.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					getHostServices().showDocument("http://www.amazon.de");
					
				}
				
				
			});
			
			button5.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					System.exit(0);
					
				}
				
				
			});
			
			
								
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
