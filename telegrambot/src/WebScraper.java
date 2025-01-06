
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebScraper {

    public static List<Product> searchInstrument(String instrumentName) {
        List<Product> results = new ArrayList<>();
        try {
            // URL del sito Thomann con query di ricerca
            String url = "https://www.thomann.de/it/search_dir.html?sw=" + instrumentName;

            // Connessione e parsing della pagina
            Document document = Jsoup.connect(url).get();

            // Selettori CSS per nome e dettagli
            Elements products = document.select(".product"); // Selettore per il container del prodotto

            for (Element product : products) {
                String name = product.select(".title__manufacturer").text(); // Nome del prodotto
                String detailsUrl = product.select(".title__name").text(); // URL dettagli

                // Aggiungi il prodotto alla lista
                results.add(new Product(name,  detailsUrl));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return results;
    }

}