package ru.Lernup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.Lernup.event.Event;

import java.util.Locale;
import java.util.Properties;
import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    int x;
    int y = (int) (Math.random()*1000);



    public static void main(String[] args) {
            ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

            Main main = new Main();
            context.publishEvent(Event.of("Create"));
            context.publishEvent(Event.of(main.scanner.nextLine()));
        context.publishEvent(Event.of("New"));
            do{
        context.publishEvent(Event.of("Start"));
        main.x = main.scanner.nextInt();
        if (main.x== main.y)
        context.publishEvent(Event.of("Equal"));
        else if (main.x> main.y)
            context.publishEvent(Event.of("Less"));
        else if (main.x< main.y)
            context.publishEvent(Event.of("More"));
            }
            while (main.x!= main.y);
    }
}