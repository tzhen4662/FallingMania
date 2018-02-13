package thegame;
import java.io.File;
import java.util.ArrayList;

import csv.cSVUlities;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
/**
 * 
 * @author Zi long Yuen
 *
 */
public class startScreen extends Application
{
		public static void main(String[] args){
			Application.launch(args);
		}

		@Override
		public void start(Stage primaryStage) throws Exception
		{
			/*File CVS = new File("test1.csv");
			cSVUlities data = new cSVUlities(CVS);
			ArrayList<String> header = new ArrayList<String>();
			header = data.getColumnHeaders();*/
		   
			//button CSS
			Label Title = new Label();
			Title.setText("Falling Mania");
			Title.setStyle("-fx-background-color: #FFFFFF; -fx-font-size: 3em;	-fx-padding: 8 8 8 8; -fx-text-fill: #00CCCC; "
					+ "-fx-border-width: 2; -fx-border-radius: 30; -fx-background-color: transparent; -fx-border-color: #99CCFF");
			
			Label controlTitle = new Label();
			controlTitle.setText("Controls");
			controlTitle.setStyle("-fx-background-color: #FFFFFF; -fx-font-size: 3em;	-fx-padding: 8 8 8 8; -fx-text-fill: #00CCCC; "
					+ "-fx-border-width: 2; -fx-border-radius: 30; -fx-background-color: transparent; -fx-border-color: #99CCFF");
			
			Button button = new Button();
			button.setText("Start");
			button.setStyle("-fx-border-color: #0000ff; -fx-background-color: #00BFFF; -fx-font-size: 20px; -fx-text-fill: white;");
			
			Button button2 = new Button();
			button2.setText("Highscores");
			button2.setStyle("-fx-border-color: #0000ff; -fx-background-color: #87CEEB; -fx-font-size: 20px; -fx-text-fill: white;");
			
			Button button3 = new Button();
			button3.setText("Controls");
			button3.setStyle("-fx-border-color: #0000ff; -fx-background-color: #87CEFA; -fx-font-size: 20px; -fx-text-fill: white;");
			
			Button button4 = new Button();
			button4.setText("The controls are D, F, Space, J, and K. \nThe objective of the game is to press "
					+ "\nthe key at the right time when the circle \nis falling.");
			button4.setStyle("-fx-border-color: #0000ff; -fx-background-color: #00BFFF; -fx-font-size: 2em; -fx-text-fill: white;");
			
			Button button5 = new Button();
			button5.setText("reee");
			button5.setStyle("-fx-border-color: #0000ff; -fx-background-color: #00BFFF; -fx-font-size: 2em; -fx-text-fill: white;");
			
			Button button6 = new Button();
			button6.setText("REEE");
			button6.setStyle("-fx-border-color: #0000ff; -fx-background-color: #00BFFF; -fx-font-size: 2em; -fx-text-fill: white;");
			
			Button endButton = new Button();
			endButton.setText("Close");
			endButton.setStyle("-fx-border-color: #99CCFF; -fx-background-color: #CCCCFF; -fx-font-size: 15px; -fx-text-fill: white;");
			
			Button BackButton = new Button();
			BackButton.setText("Back");
			BackButton.setStyle("-fx-border-color: #99CCFF; -fx-background-color: #CCCCFF; -fx-font-size: 15px; -fx-text-fill: white;");
			
			Button BackButton2 = new Button();
			BackButton2.setText("Back");
			BackButton2.setStyle("-fx-border-color: #99CCFF; -fx-background-color: #CCCCFF; -fx-font-size: 15px; -fx-text-fill: white;");


		    //Buttons
			Pane root = new Pane();
			Pane root2 = new Pane();
			Pane root3 = new Pane();
			root.getChildren().add(Title);
			root2.getChildren().add(controlTitle);
		    root.getChildren().add(button);
		    root.getChildren().add(button2);
		    root.getChildren().add(button3);
		    root2.getChildren().add(button4);
		    root.getChildren().add(endButton);
		    root2.getChildren().add(BackButton);
		    root3.getChildren().add(BackButton2);
		    root3.getChildren().add(button5);
		    root3.getChildren().add(button6);
		    Title.setLayoutX(190);
			Title.setLayoutY(140);
		    controlTitle.setLayoutX(220);
			controlTitle.setLayoutY(140);
			button.setLayoutX(270);
			button.setLayoutY(250);
			button2.setLayoutX(240);
			button2.setLayoutY(310);
			button3.setLayoutX(255);
			button3.setLayoutY(370);
			button4.setLayoutX(90);
			button4.setLayoutY(240);
			button5.setLayoutX(90);
			button5.setLayoutY(240);
			button6.setLayoutX(350);
			button6.setLayoutY(240);
			endButton.setLayoutX(0);
			endButton.setLayoutY(0);
			BackButton.setLayoutX(0);
			BackButton.setLayoutY(0);
			BackButton2.setLayoutX(0);
			BackButton2.setLayoutY(0);
		    
			//Scenes
			Scene scene = new Scene(root, 600, 600);
		    Scene control = new Scene(root2, 600, 600);
		    Scene highscore = new Scene(root3, 600, 600);
		    primaryStage.setScene(scene);
		    primaryStage.show();
		    
		    BackgroundImage Background= new BackgroundImage(new Image("images/spacey.jpg",600,600,false,true),
		            BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		              BackgroundSize.DEFAULT);
		    root.setBackground(new Background(Background));
		    BackgroundImage controlBackground= new BackgroundImage(new Image("images/spacey.jpg",600,600,false,true),
		            BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		              BackgroundSize.DEFAULT);
		    root2.setBackground(new Background(controlBackground));
		    BackgroundImage highscoreBackground= new BackgroundImage(new Image("images/spacey.jpg",600,600,false,true),
		            BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		              BackgroundSize.DEFAULT);
		    root3.setBackground(new Background(highscoreBackground));

		    
			//Button Actions
			button.setOnAction(value ->  {
	        	System.out.println("Starting ");
			});
			button2.setOnAction(value ->  {
				primaryStage.setScene(highscore)
			;});
			button3.setOnAction(value ->  {
				primaryStage.setScene(control)
			;});
			button4.setOnAction(value ->  {
	        	System.out.println("Controls ");
			});
		    endButton.setOnAction(e -> Platform.exit());
			BackButton.setOnAction(value ->  {
				primaryStage.setScene(scene)
			;});
			BackButton2.setOnAction(value ->  {
				primaryStage.setScene(scene)
			;});
		}
}
