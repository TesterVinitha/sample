package practicae;

import java.io.File;
import java.io.IOException;

public class Document {
	
	public static void main(String[] args) throws IOException {
		
		File s= new File("E:\\Java\\Sample\\Demo");
		
		boolean file = s.isFile();
		
	System.out.println(file);
	
	boolean directory = s.isDirectory();
	
	System.out.println(directory);
		
	
	
	
	File f= new File("E:\\Java\\Sample\\Demo\\doc.txt");
	
   boolean createNewFile = f.createNewFile();
   
   System.out.println(createNewFile);
   
   
   File a= new File("E:\\Java\\Sample\\Demo\\doc.txt");
   
   
   
   
   
    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

		
		
		
		

	}


