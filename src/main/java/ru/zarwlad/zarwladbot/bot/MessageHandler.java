package ru.zarwlad.zarwladbot.bot;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface MessageHandler {
    void processMessage(Update update);
    void returnUnsupportedCommandTxt(Update update);
}
