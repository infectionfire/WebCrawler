package config;

import java.util.ArrayList;
import java.util.List;

import static page.GetInfo.CreateCharacteristics;

public class ParcerPageConfiguration {

    final static int count = 100;//изменяем count в зависимости от количества ссылок
    private static int number = 0;//итерация по массиву
    public static List<String> names = new ArrayList<>();//если товаров больше сотки поменять тоже
    public static List<String> urls = new ArrayList<>();//если товаров больше сотки поменять тоже
    public static List<String> code = new ArrayList<>();//если товаров больше сотки поменять тоже
    public static int getNumber() {
        return number;
    }

    public static List<String> getAllInfoAndUrls() throws  IndexOutOfBoundsException{

        try {//подключаем модули
            for (int i = 0; i < count; i++) {
                CreateCharacteristics();
                number++;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return urls;
    }
}
