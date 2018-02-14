package thegame;

import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
/**
 * 
 * @author Jacky Lin & Tim Zhen
 *we still need to figure out how to let user input names
 *add random falling notes
 *make it so that the if user presses nothing, they lose points
 */
public class fallingNotes extends Application{

	private Random r = new Random();
	double r1 = Math.random() + 1;
	double r2 = Math.random() + 1;
	double r3 = Math.random() + 1;
	double r4 = Math.random() + 1;
	double r5 = Math.random() + 1;
	
	private double RADIUS = 20.0;
	private int health = 100;
	private int score = 0;
	private int combo = 0;
	private boolean gameOn = true;
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
	Timeline timeline1 = new Timeline();
	Timeline timeline2 = new Timeline();
	Timeline timeline3 = new Timeline();
	Timeline timeline4 = new Timeline();
	Timeline timeline5 = new Timeline();
	 
	Text cScore = new Text("Score");
	Text cHealth = new Text("100%");
	Text cCombo = new Text("0x");
	
	@Override
	public void start(Stage stage) throws Exception {
		
	    cScore.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	    cHealth.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	    cCombo.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	    
		circle1.setRadius(RADIUS);
		circle2.setRadius(RADIUS);
		circle3.setRadius(RADIUS);
		circle4.setRadius(RADIUS);
		circle5.setRadius(RADIUS);
		
		timeline1.setCycleCount(timeline1.INDEFINITE);
		timeline2.setCycleCount(timeline2.INDEFINITE);
		timeline3.setCycleCount(timeline3.INDEFINITE);
		timeline4.setCycleCount(timeline4.INDEFINITE);
		timeline5.setCycleCount(timeline5.INDEFINITE);
		
		KeyFrame kf1 = new KeyFrame(Duration.seconds(r1),
				//new KeyValue(circle1.centerXProperty(), 100),
				new KeyValue(circle1.centerYProperty(), 650));
		KeyFrame kf2 = new KeyFrame(Duration.seconds(r2),
				//new KeyValue(circle2.centerXProperty(), 200),
                new KeyValue(circle2.centerYProperty(), 650));
		KeyFrame kf3 = new KeyFrame(Duration.seconds(r3),
               // new KeyValue(circle3.centerXProperty(), 300),
				new KeyValue(circle3.centerYProperty(), 650));
		KeyFrame kf4 = new KeyFrame(Duration.seconds(r4),
               // new KeyValue(circle4.centerXProperty(), 400),
                new KeyValue(circle4.centerYProperty(), 650));
		KeyFrame kf5 = new KeyFrame(Duration.seconds(r5),
                //new KeyValue(circle5.centerXProperty(), 500),
                new KeyValue(circle5.centerYProperty(), 650));
        timeline1.getKeyFrames().add(kf1);
        timeline2.getKeyFrames().add(kf2);
        timeline3.getKeyFrames().add(kf3);
        timeline4.getKeyFrames().add(kf4);
        timeline5.getKeyFrames().add(kf5);

		cScore.setLayoutX(300);
		cScore.setLayoutY(300);
		cHealth.setLayoutX(500);
		cHealth.setLayoutY(100);
		cCombo.setLayoutX(500);
		cCombo.setLayoutY(150);
		
		Pane root = new Pane();
		root.getChildren().addAll(clickCircle1, clickCircle2, clickCircle3, clickCircle4, clickCircle5);
		root.getChildren().addAll(cScore,cHealth,cCombo);
        root.getChildren().addAll(circle1, circle2, circle3, circle4, circle5);
        Scene scene = new Scene(root, 600, 600);
        stage.setResizable(false);
        stage.setTitle("REEEEEEEEEEE");
        stage.setScene(scene);
        stage.show();
        // make sure to end game when the health reaches 0
        // also change the keypressed to become an event listener. the onkeypressed is only working with 
        // find out how to 
        /*while (gameOn)
        {
        	checkHealth();
        }*/
    		timeline1.play();
    		timeline2.play();
    		timeline3.play();
    		timeline4.play();
    		timeline5.play();
    		
        	scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
        		@Override
        		public void handle(KeyEvent event) {      
        			if(event.getCode() == KeyCode.D) {
        				checkHealth();
        				getPoints(circle1);
        				display();
        			}
        			if(event.getCode() == KeyCode.F) {
        				checkHealth();
        				getPoints(circle2);
        				display();
        			}
        			if (event.getCode() == KeyCode.SPACE){
        				checkHealth();
        				getPoints(circle3);
        				display();
        			}    
        			if(event.getCode() == KeyCode.J) {
        				checkHealth();
        				getPoints(circle4);
        				display();
        			}
        			if(event.getCode() == KeyCode.K) {
        				checkHealth();
        				getPoints(circle5);
        				display();
        			}
        			
        		}
        	});
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
			if(health - 10 >= 0) {
				health -= 10;
			}
			else
				health = 0;
		}
	}
	
	public void display() {
		cScore.setText("" + score + "");   
    	cHealth.setText("" + health + "%");
    	cCombo.setText("" + combo + "x");
	}
	
	public void resetGame() {
		health = 100;
		score = 0;
		combo = 0;
		
	}
	
	public void checkHealth() {
		if(health <= 0) {
			gameOn = false;
			timeline1.stop();
			timeline2.stop();
			timeline3.stop();
			timeline4.stop();
			timeline5.stop();
			cScore.setText("GAME OVER");
			health = 10;
		}
	}
	
	public static void main(String[] args) {
        Application.launch(args);    
    }
	
}
