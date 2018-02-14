package thegame;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import csv.cSVUlities;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
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
		private int windowX = 600;
		private int windowY = 600;
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
			File CVS = new File("src/csv/ScoreSheet.csv");
			cSVUlities data = new cSVUlities(CVS);
			ArrayList<String> Names = new ArrayList<String>();
			ArrayList<String> Score = new ArrayList<String>();
			Names = data.getColumnData(0);
			Score = data.getColumnData(1);	
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
			button5.setText("Name");
			button5.setStyle("-fx-border-color: #0000ff; -fx-background-color: #00BFFF; -fx-font-size: 2em; -fx-text-fill: white;");
			
			Button button6 = new Button();
			button6.setText("Score");
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
			//if(Names.get(2) != null)
			//{
			//Text t1 = new Text (150, 200, Names.get(0));
			//Text t2 = new Text (150, 250, Names.get(1));
			//Text t3 = new Text (150, 300, Names.get(2));
			//Text t4 = new Text (350, 200, Score.get(0));
			//Text t5 = new Text (350, 250, Score.get(1));
			//Text t6 = new Text (350, 300, Score.get(2));
			//o}
			Text t1 = new Text (150, 200, "");
			Text t2 = new Text (150, 250, "");
			Text t3 = new Text (150, 300, "");
			Text t4 = new Text (350, 200, "");
			Text t5 = new Text (350, 250, "");
			Text t6 = new Text (350, 300, "");
			Pane root = new Pane();
			Pane root2 = new Pane();
			Pane root3 = new Pane();
			Pane gameRoot = new Pane();
			root.getChildren().addAll(title, button, button2, button3, endButton);
			root2.getChildren().addAll(controlTitle, button4, backButton);
		    root3.getChildren().addAll(backButton2, button5, button6,t1,t2,t3,t4,t5,t6);
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
			button5.setLayoutX(150);
			button5.setLayoutY(100);
			button6.setLayoutX(350);
			button6.setLayoutY(100);
			endButton.setLayoutX(0);
			endButton.setLayoutY(0);
			backButton.setLayoutX(0);
			backButton.setLayoutY(0);
			backButton2.setLayoutX(0);
			backButton2.setLayoutY(0);
		    
			//Scenes
			Scene scene = new Scene(root, windowX, windowY);
		    Scene control = new Scene(root2, windowX, windowY);
		    Scene highscore = new Scene(root3, windowX, windowY);	       
		    Scene game = new Scene(gameRoot, windowX, windowY);
		    primaryStage.setResizable(false);
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

		    //Game
		    scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		    cHealth.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		    cCombo.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		    
			circle1.setRadius(RADIUS);
			circle2.setRadius(RADIUS);
			circle3.setRadius(RADIUS);
			circle4.setRadius(RADIUS);
			circle5.setRadius(RADIUS);
			
			//Timeline 
			Timeline timeline = new Timeline();
			timeline.setCycleCount(10);
			KeyFrame kf1 = new KeyFrame(Duration.seconds(1.5),
					new KeyValue(circle1.centerYProperty(), 650));
			KeyFrame kf2 = new KeyFrame(Duration.seconds(1.5),
	                new KeyValue(circle2.centerYProperty(), 650));
			KeyFrame kf3 = new KeyFrame(Duration.seconds(1.5),
					new KeyValue(circle3.centerYProperty(), 650));
			KeyFrame kf4 = new KeyFrame(Duration.seconds(1.5),
	                new KeyValue(circle4.centerYProperty(), 650));
			KeyFrame kf5 = new KeyFrame(Duration.seconds(1.5),
	                new KeyValue(circle5.centerYProperty(), 650));
	        timeline.getKeyFrames().addAll(kf1, kf2, kf3, kf4, kf5);

			scenetitle.setLayoutX(300);
			scenetitle.setLayoutY(300);
			cHealth.setLayoutX(500);
			cHealth.setLayoutY(100);
			cCombo.setLayoutX(500);
			cCombo.setLayoutY(150);
			
			gameRoot.getChildren().addAll(clickCircle1, clickCircle2, clickCircle3, clickCircle4, clickCircle5);
			gameRoot.getChildren().addAll(scenetitle,cHealth,cCombo);
	        gameRoot.getChildren().addAll(circle1, circle2, circle3, circle4, circle5);
	        
	        // make sure to end game when the health reaches 0
	        // also change the keypressed to become an event listener. the onkeypressed is only working with 
	        game.setOnKeyPressed(new EventHandler<KeyEvent>() {
	            @Override
	            public void handle(KeyEvent event) {      
	                if(event.getCode() == KeyCode.D) {
	                	getPoints(circle1);
	                	display();
	                }
	                if(event.getCode() == KeyCode.F) {
	                	getPoints(circle2);
	                	display();
	                }
	                if (event.getCode() == KeyCode.SPACE){
	                	getPoints(circle3);
	                	display();
	                }    
	                if(event.getCode() == KeyCode.J) {
	                	getPoints(circle4);
	                	display();
	                }
	                if(event.getCode() == KeyCode.K) {     
	                	getPoints(circle5);
	                	display();
	                }
	            }
	        });
		    
			//Button Actions
			button.setOnAction(value ->  {
	        	primaryStage.setScene(game);
	        	timeline.play();
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
		
		// remember to make it so that health can't go over 100
		public void getPoints(Circle dumb)
		{
			if (dumb.getCenterY() >= 570 && dumb.getCenterY() <= 600)
			{
				combo += 1;
				score = score + 300 * combo;
				if(health + 2 <= 100) {
					health += 2;
				}
				
			}
			else if (dumb.getCenterY() >= 560 && dumb.getCenterY() <= 620)
			{
				combo += 1;
				score = score + 100 * combo;
				if(health + 1 <= 100) {
					health += 1;
				}
			}
			else
			{
				combo = 0;
				score = score + 0;
				health -= 10;
			}
		}
		
		public void display() {
			scenetitle.setText("" + score + "");   
	    	cHealth.setText("" + health + "%");
	    	cCombo.setText("" + combo + "x");
		}
}
