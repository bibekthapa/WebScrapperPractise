/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webscrapperpractise.WebScrapperPractise.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author HOME
 */
public class Grabber {
       
    
    
    
    public String get(String link) throws MalformedURLException, IOException
    {
        URL url=new URL(link);
         HttpURLConnection conn=(HttpURLConnection) url.openConnection();
     BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
     StringBuilder content=new StringBuilder();
     String line="";
     while((line=reader.readLine())!=null)
     {
        content.append(line).append("\n");
     
     }
    
       reader.close();
       return content.toString();
    
    
    }
    
}
