package ru.zarwlad.zarwladbot.bot;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
@Setter
@Getter
@Slf4j
public class TextMessageHandlerTgImpl implements MessageHandler{
    @Autowired
    private TelegramBot telegramBot;

    @Override
    public void processMessage(Update update){
        if (update.getMessage().getFrom().getLastName().toLowerCase().equals("Черемисина".toLowerCase())){
            returnReversedTextJoke(update);
        }
        else {
            returnMsgText(update);
        }
    }

    @Override
    public void returnUnsupportedCommandTxt(Update update) {
        String s = "Извини! Твоя команда не поддерживается. Возможно я исправлюсь в будущем :)";
        createAndSendTextMsg(update, s);
    }


    public void returnReversedTextJoke(Update update){
        String s = "Привет Черемисиной! " + new StringBuffer().append(update.getMessage().getText()).reverse().toString();
        createAndSendTextMsg(update, s);
    }

    public void returnMsgText(Update update){
        String s = update.getMessage().getText();
        createAndSendTextMsg(update, s);
    }

    /*
    main method for create and send text messages to chat
     */

    private void createAndSendTextMsg(Update update, String text){
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(update.getMessage().getChatId()));
        message.setText(text);
        sendMsg(message);
    }

    private void sendMsg(SendMessage message){
        try {
            telegramBot.execute(message);
        } catch (TelegramApiException e) {
            log.error(e.getLocalizedMessage());
        }
    }
}
