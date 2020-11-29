package ru.zarwlad.zarwladbot.bot;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@Getter
@Setter
@Slf4j
public class TelegramUpdateReceiver {
    @Autowired
    private TelegramBot telegramBot;

    @Autowired
    private MessageHandler messageHandler;

    public void router(Update update){
        if (update.hasMessage() && update.getMessage().hasText()) {
            messageHandler.processMessage(update);
        }
        else {
            log.error("unsupported message type for update " + update.toString());
            messageHandler.returnUnsupportedCommandTxt(update);
        }
    }

}
