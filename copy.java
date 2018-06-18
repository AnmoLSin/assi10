package recursion;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copy {
   public static void main(String[] args) throws IOException {
   File f=new File("E:\\abc.txt");
   FileWriter o=new FileWriter("E:\\xyz.txt");
   try 
   {
	   FileReader i=new FileReader(f);
	   int ch;
	   String s="";
	   while((ch=i.read())!=-1) {
                s+=(char)ch;
	   }
	   char b[]=s.toCharArray();
	   for(int j=0;j<b.length;j++){
		o.write(b[j]);
	   }
	   o.close();
           File f1=new File("E:\\xyz.txt");
           FileReader i1=new FileReader(f1);
           while((ch=i1.read())!=-1) {
               System.out.print((char)ch);
	   }
           i.close();
		   i1.close();
   }
   catch(IOException e) 
   {
	System.out.println("Error");
   }
   }
}