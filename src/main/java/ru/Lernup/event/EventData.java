package ru.Lernup.event;

import lombok.Data;

@Data
public class EventData {
    private   String text;

    public EventData(String text) {
        this.text = text;

    }
}
