package thegame;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

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
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 * 
 * @author Zi long Yuen
 *
 */
public class startScreen extends Application
{
		
		private Random r = new Random();
		double rand = Math.random() + 1;
		private double RADIUS = 20.0;
		private int health = 100;
		private int score = 0;
		private int combo = 1;
		private Circle circle1 = new Circle(100, -50, RADIUS);
		private Circle circle2 = new Circle(200, -50, RADIUS);
		private Circle circle3 = new Circle(300, -50, RADIUS);
		private Circle circle4 = new Circle(400, -50, RADIUS);
		private Circle circle5 = new Circle(500, -50, RADIUS);
		private Circle clickCircle1 = new Circle(100, 590, RADIUS);
		private Circle clickCircle2 = new Circle(200, 590, RADIUS);
		private Circle clickCircle3 = new Circle(300, 590, RADIUS);
		private Circle clickCircle4 = new Circle(400, 590, RADIUS);
		private Circle clickCircle5 = new Circle(500, 590, RADIUS);
	 
		Text scenetitle = new Text("Score");
		Text cHealth = new Text("100%");
		Text cCombo = new Text("1x");
		
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
			Label title = new Label();
			title.setText("Falling Mania");
			title.setStyle("-fx-background-color: #FFFFFF; -fx-font-size: 3em;	-fx-padding: 8 8 8 8; -fx-text-fill: #00CCCC; "
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
			
			Button backButton = new Button();
			backButton.setText("Back");
			backButton.setStyle("-fx-border-color: #99CCFF; -fx-background-color: #CCCCFF; -fx-font-size: 15px; -fx-text-fill: white;");
			
			Button backButton2 = new Button();
			backButton2.setText("Back");
			backButton2.setStyle("-fx-border-color: #99CCFF; -fx-background-color: #CCCCFF; -fx-font-size: 15px; -fx-text-fill: white;");


		    //Buttons
			Pane root = new Pane();
			Pane root2 = new Pane();
			Pane root3 = new Pane();
			root.getChildren().addAll(title, button, button2, button3, endButton);
			root2.getChildren().addAll(controlTitle, button4, backButton);
		    root3.getChildren().addAll(backButton2, button5, button6);
		    title.setLayoutX(190);
			title.setLayoutY(140);
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
			backButton.setLayoutX(0);
			backButton.setLayoutY(0);
			backButton2.setLayoutX(0);
			backButton2.setLayoutY(0);
		    
			//Scenes
			Scene scene = new Scene(root, 600, 600);
		    Scene control = new Scene(root2, 600, 600);
		    Scene highscore = new Scene(root3, 600, 600);
		    primaryStage.setScene(scene);
		    primaryStage.show();
		    
		    //Background Image
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
			backButton.setOnAction(value ->  {
				primaryStage.setScene(scene)
			;});
			backButton2.setOnAction(value ->  {
				primaryStage.setScene(scene)
			;});
		}
}
