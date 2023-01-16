package ru.Lernup;

import org.springframework.context.ApplicationListener;
import ru.Lernup.event.Event;

import java.io.*;
import java.util.Properties;


public class Out implements ApplicationListener<Event> {
    private  int x;
    private final Logger logger;

 Properties properties = new Properties();


    public Out( Logger logger) {

        this.logger = logger;
    }

    @Override
    public void onApplicationEvent(Event event) {
         if (event.toString().indexOf("Create")>0)
            logger.log("Выберите язык Ru или Us");
        else if (event.toString().indexOf("Ru")>0){
             try {
                 properties.loadFromXML(new FileInputStream("src/main/resources/text_ru_Ru.xml"));
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
         else if (event.toString().indexOf("Us")>0){
             try {
                 properties.load(new FileInputStream("src/main/resources/text_en_Us.properties"));
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }






        if (event.toString().indexOf("Less") > 0)
        logger.log(properties.getProperty("msgLess"));
        else if (event.toString().indexOf("Equal") > 0)
            logger.log(properties.getProperty("msgEqually"));
        else if (event.toString().indexOf("More")>0)
            logger.log(properties.getProperty("msgMore"));
        else if (event.toString().indexOf("Start")>0)
            logger.log(properties.getProperty("msgStart"));
        else if (event.toString().indexOf("New")>0)
            logger.log(properties.getProperty("msgNew"));


    }

}
