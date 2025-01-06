
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.List;

public class MusicalInstrumentsBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            SendMessage message = new SendMessage();
            message.setChatId(chatId);

            if (messageText.equals("/start")) {
                message.setText("Benvenuto! Usa /cerca [strumento] per cercare strumenti musicali.");
            } else if (messageText.startsWith("/cerca")) {
                String strumento = messageText.substring(7).trim();

                if (strumento.isEmpty()) {
                    message.setText("Per favore, specifica uno strumento da cercare. Es: /cerca basso");
                } else {
                    List<Product> risultati = WebScraper.searchInstrument(strumento);

                    if (risultati.isEmpty()) {
                        message.setText("Non ho trovato risultati per '" + strumento + "'.");
                    } else {
                        StringBuilder risposta = new StringBuilder("Ho trovato i seguenti strumenti:\n");
                        for (Product risultato : risultati) {
                            risposta.append(risultato.toString()).append("\n\n");
                        }
                        message.setText(risposta.toString());
                    }
                }
            } else {
                message.setText("Comando non riconosciuto. Usa /aiuto per vedere i comandi disponibili.");
            }

            try {
                execute(message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "StrumentiMusicali_bot";
    }

    @Override
    public String getBotToken() {
        return "8105827743:AAFY1k9r8djFY_2eNJQv8wKaPamoEQmct7M";
    }
}