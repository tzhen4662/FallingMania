
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Runner 
{
	public static void main(String[]args) throws IOException
	{
		ArrayList<String> cools = new ArrayList<String>();
		File CVS = new File("test2.csv");
		cSVUlities test =  new cSVUlities(CVS);
	test.addEntry("Brandon", 2007);
	//test.addEntry("Tim", 20352257);
		//test.addEntry("Zilong", 1);
		//test.addEntry("Jacky", 324);
		test.writeCSV(CVS);
	//	test.calculateScore();
		cools = test.getColumnData(0);
		for(int i = 0; i < cools.size(); i++)
		{   
		    System.out.print(cools.get(i));
		}  
	}
}
