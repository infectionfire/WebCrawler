package org.example.page;

import org.example.config.ParcerPageConfiguration;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

public class GetPageVI {
    public static Document getPage() throws IOException {
            //меняем значение для выбора ссылки, отсчет с нуля
            String url = ReadingFromFile
                    .readUrlsFromTXTFile()
                    .get(ParcerPageConfiguration.getNumber());
            return Jsoup.parse(new URL(url), 45000);
        }
}
