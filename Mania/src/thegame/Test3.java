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
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Test3 extends Application{

	private Random r = new Random();
	double rand = Math.random() + 1;
	
	private Circle circle1 = new Circle(100, -50, 20);
	private Circle circle2 = new Circle(200, -50, 20);
	private Circle circle3 = new Circle(300, -50, 20);
	private Circle circle4 = new Circle(400, -50, 20);
	private Circle circle5 = new Circle(500, -50, 20);
	private Circle clickCircle1 = new Circle(100, 590, 20);
	private Circle clickCircle2 = new Circle(200, 590, 20);
	private Circle clickCircle3 = new Circle(300, 590, 20);
	private Circle clickCircle4 = new Circle(400, 590, 20);
	private Circle clickCircle5 = new Circle(500, 590, 20);
	private Line line = new Line(600,580,0,580);
	int score = 0;
	Text scenetitle = new Text("Score");
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
	    scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	    
		circle1.setRadius(20.0);
		circle2.setRadius(20.0);
		circle3.setRadius(20.0);
		circle4.setRadius(20.0);
		circle5.setRadius(20.0);
		
		Timeline timeline = new Timeline();
		KeyFrame kf1 = new KeyFrame(Duration.seconds(1.5),
				//new KeyValue(circle1.centerXProperty(), 100),
				new KeyValue(circle1.centerYProperty(), 650));
		KeyFrame kf2 = new KeyFrame(Duration.seconds(1.5),
				//new KeyValue(circle2.centerXProperty(), 200),
                new KeyValue(circle2.centerYProperty(), 650));
		KeyFrame kf3 = new KeyFrame(Duration.seconds(1.5),
               // new KeyValue(circle3.centerXProperty(), 300),
				new KeyValue(circle3.centerYProperty(), 650));
		KeyFrame kf4 = new KeyFrame(Duration.seconds(1.5),
               // new KeyValue(circle4.centerXProperty(), 400),
                new KeyValue(circle4.centerYProperty(), 650));
		KeyFrame kf5 = new KeyFrame(Duration.seconds(1.5),
                //new KeyValue(circle5.centerXProperty(), 500),
                new KeyValue(circle5.centerYProperty(), 650));
        timeline.getKeyFrames().add(kf1);
        timeline.getKeyFrames().add(kf2);
        timeline.getKeyFrames().add(kf3);
        timeline.getKeyFrames().add(kf4);
        timeline.getKeyFrames().add(kf5);

		scenetitle.setLayoutX(300);
		scenetitle.setLayoutY(300);
		
		Pane root = new Pane();
		timeline.play();
		root.getChildren().addAll(clickCircle1, clickCircle2, clickCircle3, clickCircle4, clickCircle5);
		root.getChildren().add(line);
		root.getChildren().add(scenetitle);
        root.getChildren().addAll(circle1, circle2, circle3, circle4, circle5);
        Scene scene = new Scene(root, 600, 600);
        stage.setResizable(false);
        stage.setTitle("REEEEEEEEEEE");
        stage.setScene(scene);
        stage.show();
        
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {      
                if(event.getCode() == KeyCode.D) {
                	if(circle1.intersects(line.getBoundsInLocal())) {
                		score += 100;
                		scenetitle.setText("" + score + ""); 
                	}
                }
                if(event.getCode() == KeyCode.F) {
                	if(circle2.intersects(line.getBoundsInLocal())) {
                		getPoints(circle2);
                		scenetitle.setText("" + score + ""); 
                	}
                }
                if (event.getCode() == KeyCode.SPACE){
                	if(circle3.intersects(line.getBoundsInLocal())) {
                		getPoints(circle3);
                		scenetitle.setText("" + score + ""); 
                	}
                }    
                if(event.getCode() == KeyCode.J) {
                	if(circle4.intersects(line.getBoundsInLocal())) {
                		getPoints(circle4);
                		scenetitle.setText("" + score + ""); 
                	}
                }
                if(event.getCode() == KeyCode.K) {     
                	if(circle5.intersects(line.getBoundsInLocal())) {
                		getPoints(circle5);
                		scenetitle.setText("" + score + ""); 
                	}
                }
            }
        });
	}
	
	public void getPoints(Circle dumb)
	{
		if (dumb.getCenterY() >= 580 && dumb.getCenterY() <= 600)
		{
			score = score + 300;
		}
		else if (dumb.getCenterY() >= 560 && dumb.getCenterY() <= 620)
		{
			score = score + 100;
		}
		else
		{
			score = score + 0;
		}
	}
	
	public static void main(String[] args) {
        Application.launch(args);    
    }
	
}
