package webscrapperpractise.WebScrapperPractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import webscrapperpractise.WebScrapperPractise.command.GiaScrapper;
import webscrapperpractise.WebScrapperPractise.command.RjScrapper;
import webscrapperpractise.WebScrapperPractise.command.Scrapper;
import webscrapperpractise.WebScrapperPractise.util.Grabber;

public class WebScrapperProgram {

    public static void main(String[] args) throws IOException {

       Scrapper scrap=new RjScrapper();
       scrap.scrap();
    }

}


