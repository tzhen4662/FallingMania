package thegame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Controls extends Application
{	
	public static void main(String[] args){
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Label Title = new Label();
		Title.setText("Controls");
		Title.setStyle("-fx-background-color: #FFFFFF; -fx-font-size: 3em;	-fx-padding: 8 8 8 8; -fx-text-fill: #0000CC; -fx-border-width: 2; -fx-border-radius: 30; -fx-background-color: transparent; -fx-border-color: #99CCFF");
		Button button = new Button();
		button.setText("'The controls are zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz \n zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz "
				+ "\n zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz \n zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"
				+ "\n zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz \n zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"
				+ "\n zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz \n zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz'");
		button.setStyle("-fx-border-color: #0000ff; -fx-background-color: #00BFFF; -fx-font-size: 1.5em; -fx-text-fill: white;");
		
		button.setOnAction(value ->  {
        	System.out.println("Controls ");
		});

		Pane root = new Pane();
		root.getChildren().add(Title);
	    root.getChildren().add(button);
	    Title.setLayoutX(220);
		Title.setLayoutY(140);
		button.setLayoutX(90);
		button.setLayoutY(240);
	    Scene Control = new Scene(root, 600, 600);
	    primaryStage.setScene(Control);
	    primaryStage.show();
	    
	    /*scene.getStylesheets().add("CSS");
	    stage.show();*/
	}
}


