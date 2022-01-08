package org.example.page;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingFromFile {

    //создаем массив из списка ссылок
    public static List<String> readUrlsFromTXTFile() throws IOException {
        FileReader urls = new FileReader("url.txt");
        BufferedReader input = new BufferedReader(urls);
        List<String> list = new ArrayList<>();
        String line = input.readLine();
        list.add(line);
        for (int i = 2; i < 100; i++) {
            list.add(line + "/page" + i);
        }
        urls.close();
        input.close();
        return list;
    }
}
