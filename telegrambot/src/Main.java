
import org.telegram.telegrambots.meta.TelegramBotsApi;//l'unica liberia per usare telegrambot che sono riuscita a trovare
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new MusicalInstrumentsBot());
            System.out.println("Bot avviato!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
