package page;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import static config.ParcerPageConfiguration.names;
import static config.ParcerPageConfiguration.urls;
import static page.GetPageVI.getPage;

/**
 * Формирование поля "технические характеристики" для описания товарной карточки
 */

public class GetInfo {//технические характеристики
    private GetInfo() {
        throw new IllegalStateException("Utility class");
    }

    public static void CreateCharacteristics() throws IOException {
        List<String> urlProduct = new ArrayList<>();
        List<String> nameProduct = new ArrayList<>();
        Elements elements = getPage()
                .select("div.listing-grid");
        if (elements!=null) {
            Elements namesCard = elements.select("div.product-tile.grid-item");//вытаскиваем инфу из маркированного списка
            for (Element name : namesCard) {//цикл добавляет значения к строке, попутно форматируя ее
                names.add(name.select("a.link").text()) ;
                List<String> temp = List.of(name.select("div.title").html().split("\""));
                urls.add("vseinstrumenti.ru/"+temp.get(1));
            }
        }
    }
}