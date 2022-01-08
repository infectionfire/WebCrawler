/*
this file can be added element of the massive to
 */

import config.ParcerPageConfiguration;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import static config.ParcerPageConfiguration.getAllInfoAndUrls;


public class ApachePOIExcelWrite {

    private static final String FILE_NAME = "GroupInfo.xlsx";

    public static void main(String[] args) throws IOException {
        final long startTime = System.currentTimeMillis();
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Urls");

        int rowNum = 0;//счетчик строк
        int index = 0;
        List<String> createMassiveForXLSX = getAllInfoAndUrls();
        for (String crm : createMassiveForXLSX) {//цикл создания параметризированного списка
            Row row = sheet.createRow(rowNum++);
            Cell cellName = row.createCell(0);//первый столбец, описание товаров
            Cell cellURL = row.createCell(1);//второй столбец, ссылки на фото
            cellName.setCellValue(ParcerPageConfiguration.names.get(index));
            cellURL.setCellValue(ParcerPageConfiguration.urls.get(index));
            index++;
        }

        FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
        workbook.write(outputStream);
        outputStream.close();
        workbook.close();
        final long elapsedTimeMillis = System.currentTimeMillis() - startTime;
        System.out.println("Сборка завершена за "+Math.ceil(elapsedTimeMillis/1000.0)+ " секунд");
    }
}