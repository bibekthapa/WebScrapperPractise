/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webscrapperpractise.WebScrapperPractise.command;

import webscrapperpractise.WebScrapperPractise.excel.Excelimpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import webscrapperpractise.WebScrapperPractise.util.Grabber;

/**
 *
 * @author HOME
 */
public class RjScrapper extends Scrapper{

    @Override
    public void scrap() throws IOException {
        
       Map map=new HashMap();
       String link="http://www.ramrojob.com";
     Grabber grabber=new Grabber();
     String content=grabber.get(link);
      Excelimpl excelfile=new Excelimpl();
    
        String regx="<div class=\"col-sm(.*?)\">\\n\\s(.*?)alt=\"(.*?)\"\\stitle=\"(.*?)\"\\s(.*?)\\n\\s(.*?)\\n(.*?)<a href=\"(.*?)\">\\s(.*?)</a>";
       
        Pattern pattern=Pattern.compile(regx);
        Matcher matcher=pattern.matcher(content.toString());
       int i=1;
        while(matcher.find())
        {
                System.out.println(matcher.group(4));
                System.out.println(matcher.group(8));
                map.put(matcher.group(4), matcher.group(8));
               
               
                
        }
        
        System.out.println(map);
        excelfile.writeinexcelfile(map);
    }
    
}
