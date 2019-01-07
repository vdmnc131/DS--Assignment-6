import java.io.*;
import java.lang.*;
import java.util.*;

class matrix{

	public static void main (String[] args)
	{		
		  long start=System.currentTimeMillis();
		

		try 
		{
			int l=1;
			//PrintStream fileStream = new PrintStream("output.txt");
			//System.setOut(fileStream);
			FileInputStream file =  new FileInputStream("input.txt"); 
	 		Scanner p = new Scanner(file);
	 		
	 		String q = p.nextLine();
	 		list W = new list(Integer.parseInt(q));
	 		String query = p.nextLine(); 
	 		String[] s = query.split(",");
 			for(int i=0;i<s.length;i++) {
	 			W.Add(i,Integer.parseInt(s[i]));
	 					
	 		}
 			String query2 = p.nextLine(); 
	 		String[] s2 = query2.split(",");	
			for(int i=0;i<s2.length;i++) {
	 			W.Add_2(i,Integer.parseInt(s2[i]));
	 					
	 		}
	 		
	 		 W.Make_A();
	 		
	 		 W.check();
	 		
	 			
	 		

             
	 	} 
	
		catch (FileNotFoundException e)
		{
	 		System.out.println("File not found");
		}
	
				long stop=System.currentTimeMillis();
				long elapsedTime=stop-start;
				System.out.println(elapsedTime);
				System.out.println();


			
		
	}
}
