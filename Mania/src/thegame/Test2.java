package thegame;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Test2 extends Application{

	/**
	 * These fields are the circles on the bottom 
	 */
	private Circle clickCircle1 = new Circle(100, 580, 20);
	private Circle clickCircle2 = new Circle(200, 580, 20);
	private Circle clickCircle3 = new Circle(300, 580, 20);
	private Circle clickCircle4 = new Circle(400, 580, 20);
	private Circle clickCircle5 = new Circle(500, 580, 20);
	private Line line = new Line(600,580,0,580);
	public int score = 0;
	Text theScore = new Text("Score");
	
    /*private Parent createContent() {
        Pane root = new Pane();
        root.setPrefSize(600, 600);
        Notes note = new Notes();
        root.getChildren().add(note);
        root.getChildren().add(line);
        root.getChildren().addAll(clickCircle1, clickCircle2, clickCircle3, clickCircle4, clickCircle5);
        return root;
    }
    */

    public void start(Stage primaryStage) throws Exception{
    	primaryStage.setTitle("REEEEEEEEEE");
    	Pane root = new Pane();
        root.setPrefSize(600, 600);
        Notes note = new Notes();
        root.getChildren().add(note);
        root.getChildren().add(line);
        root.getChildren().addAll(clickCircle1, clickCircle2, clickCircle3, clickCircle4, clickCircle5);
        root.getChildren().add(theScore);
        
        theScore.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        theScore.setLayoutX(300);
		theScore.setLayoutY(300);
		
    	Scene scene = new Scene(root, 600, 600);
    	primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        
        
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
        public void handle(KeyEvent event) {
            if (event.getCode() == KeyCode.SPACE){
           
            }          
            if(event.getCode() == KeyCode.D) {
            	score++;
            	theScore.setText("" + score + "");   
            }
            if(event.getCode() == KeyCode.F) {
            	
            }
            if(event.getCode() == KeyCode.J) {
            
            }
            if(event.getCode() == KeyCode.K) {      
            
            }
        }
       });
        
        
    }
    private class Notes extends StackPane {
        Rectangle d;
        public int a = 20;
        public Notes() {
        	
            d = new Rectangle(20,20);
            d.setFill(Color.RED);
            d.setStroke(Color.BLACK);
            setAlignment(Pos.CENTER);
            getChildren().addAll(d);
            AnimationTimer timer = new AnimationTimer() {
    			@Override
    			public void handle(long arg0) {
    				d.relocate(20,a+=20);
    			}
            	
            };
           
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}