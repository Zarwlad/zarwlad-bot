package ru.zarwlad.zarwladbot.bot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TelegramBot extends TelegramLongPollingBot {
    @Value("${zarwlad.telegram.api.bot-token}")
    private String botToken;

    @Value("${zarwlad.telegram.api.bot-username}")
    private String botUsername;

    @Autowired
    private TelegramUpdateReceiver telegramUpdateReceiver;

    @Override
    public void onUpdateReceived(Update update) {
        telegramUpdateReceiver.router(update);
    }
}
