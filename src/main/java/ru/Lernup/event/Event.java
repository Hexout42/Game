package ru.Lernup.event;

import org.springframework.context.ApplicationEvent;

public class Event extends ApplicationEvent {

    public Event(Object source) {
        super(source);

    }


    public static Event of(String text){
        return  new Event(new EventData(text));

    }
}
