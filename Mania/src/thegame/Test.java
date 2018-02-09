package thegame;
import java.util.ArrayList;
import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class Test extends Application{
	
	
	private Random r = new Random();
	long timeStep = System.nanoTime() + 10000000000L;
	private String[] xValues = {"100","200","300","400","500"};
	private int x = 0;

		@Override
		public void start(Stage stage) throws Exception {
			new AnimationTimer() {
		        public void handle(long now) {   
		          for (int i = 0; i < xValues.length; i++)
			      {
			        	x = Integer.parseInt(xValues[i]);
			      }
		          Notes newNote = new Notes(x,100);  
		          while (now > timeStep)
		          {
		        	  newNote.setY(newNote.getY()-10);
		          }
		        }
		    }.start();
		    
			Pane root = new Pane();
			Scene scene = new Scene(root, 600, 600);
		    stage.setResizable(false);
		    stage.setTitle("REEEEEEEEEEE");
		    stage.setScene(scene);
		    stage.show();
		}


}
