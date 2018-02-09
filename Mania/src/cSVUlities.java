import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class cSVUlities 
{
	ArrayList<String> CSVData;
	int rowLength;
	
	public cSVUlities(File csv) throws IOException
	{
		CSVData = new ArrayList<String>();
		boolean toggle = true;
		Path pathToFile = Paths.get(csv.getAbsolutePath());
		BufferedReader buff = Files.newBufferedReader(pathToFile);
		String line = buff.readLine();
		while (line != null) { 
			line = buff.readLine();
			String[] attributes = null;
			if (line != null) {
				attributes = line.split(",");
				if(toggle)
				{
					toggle = ! toggle;
					this.rowLength = attributes.length;
				}
			} 
			if (attributes != null) {
				for (String x : attributes) {
					CSVData.add(x);
				} 
			}
		}
	}
	
	public ArrayList<String> getColumnHeaders()
	{
		ArrayList<String> yes = new ArrayList<String>();
		for(int i = 0; i < rowLength; i++)
		{
			yes.add(CSVData.get(i));
		}
		return yes;
	}
	
	public ArrayList<String> getColumnData(int column)
	{
		ArrayList<String> yes = new ArrayList<String>();
		for(int i = column; i < this.CSVData.size(); i = i + rowLength)
		{	String x = CSVData.get(i);
			if(!(x.equals("")))
			{
				yes.add(CSVData.get(i));
			}
			else
			{
				yes.add("NULL");
			}
		}
		return yes;
	}
	
	public ArrayList<Integer> getDataInt(int column)
	{
		ArrayList<Integer> yes = new ArrayList<Integer>();
		for(int i = column; i < this.CSVData.size(); i = i + rowLength)
		{
			String x =(CSVData.get(i));
			if(!(x.equals("")))
			{
				yes.add(Integer.parseInt(x));
			}
			else
			{
				yes.add(null);
			}
		}
		return yes;
	}
	
	public ArrayList<Double> getDataDouble(int column)
	{
		ArrayList<Double> yes = new ArrayList<Double>();
		for(int i = column; i < this.CSVData.size(); i = i + rowLength)
		{
			String x =(CSVData.get(i));
			if(!(x.equals("")))
			{
				yes.add(Double.parseDouble(x));
			}
			else
			{
				yes.add(null);
			}
		}
		return yes;
	}
	public void writeCSV(File CSV) throws IOException
	{
		PrintWriter thing = new PrintWriter(CSV);
        StringBuilder sb = new StringBuilder();
        sb.append("Name");
        sb.append(',');
        sb.append("Score");
        sb.append('\n');
        for(int i = 0; i< CSVData.size(); i+=2)
        {
            sb.append(CSVData.get(i));
            sb.append(',');
            sb.append(CSVData.get(i+1));
            sb.append('\n');
        }
        thing.write(sb.toString());
        thing.close();
	}
	public void addEntry(String Name, int Score)
	{
		CSVData.add(Name);
		CSVData.add(Integer.toString(Score));
	}
	public void calculateScore()
	{
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i = 3; i < (CSVData.size()-2)/2; i+=2)
		{
			numList.add(Integer.parseInt(CSVData.get(i)));
		}
		for(int i = 0; i <= numList.size(); i++)
		{
			System.out.println(numList.get(i));
		}
			Collections.sort(numList);
			System.out.println("Everything Past here is Sorted!");
		for(int i = 0; i <= numList.size(); i++)
		{
			System.out.println(numList.get(i));
		}
	}
}
