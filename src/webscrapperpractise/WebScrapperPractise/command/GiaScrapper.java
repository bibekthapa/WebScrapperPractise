/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webscrapperpractise.WebScrapperPractise.command;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import webscrapperpractise.WebScrapperPractise.util.Grabber;

/**
 *
 * @author HOME
 */
public class GiaScrapper extends Scrapper {

    @Override
    public void scrap() throws IOException, MalformedURLException {
       String link = "https://javaapps.gia.edu/AlumniRegDirectoryNew/alumniDirectorySearch.do?method=search";
            Grabber grabber = new Grabber();
            String param = "name=&".concat("city=&").concat("state=&").concat("country=India");
            String content = grabber.post(link, param);
            String regex="<a href=\"(.*?)\">(.*?)</a></td>\\n<td>(.*?)</td>";
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher=pattern.matcher(content);
            
            while(matcher.find())
            {
                System.out.println("Name:"+matcher.group(2));
                System.out.println("Address:"+matcher.group(3));
                System.out.println("\n");
            
            
            }
           
            

    }
    
}
