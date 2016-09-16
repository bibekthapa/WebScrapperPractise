/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webscrapperpractise.WebScrapperPractise.command;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author HOME
 */
public abstract class Scrapper {
    
    public abstract void scrap() throws IOException,MalformedURLException;
    
}
