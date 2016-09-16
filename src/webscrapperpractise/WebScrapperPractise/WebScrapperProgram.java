package webscrapperpractise.WebScrapperPractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;

public class WebScrapperProgram {

 public static void main(String[] args)  {
     
     
     
     try{
     URL url =new URL("http://www.merojob.com");
     HttpURLConnection conn=(HttpURLConnection) url.openConnection();
     BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
     
     String line="";
     while((line=reader.readLine())!=null)
     {
         System.out.println(line);
     
     }
     
     reader.close();
     }catch(IOException ioe)
     {
        ioe.printStackTrace();
     }
     
     
     
     
        
    }
    
}
