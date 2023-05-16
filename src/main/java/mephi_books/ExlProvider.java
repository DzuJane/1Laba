/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi_books;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Пользователь
 */
public class ExlProvider {
    private File file = new File("data.xlsx");
    private XSSFWorkbook workbook;

    public void loadFile() {                                                             //создание вб из файла
        try {
            workbook = new XSSFWorkbook(file);
        } catch (IOException |
                 InvalidFormatException ex) {
        }
    }

    public String getData(String sheet, int cell) throws IOException {                         // этот метод выдает в качестве результата значение в ячейке
        Random random = new Random();
        XSSFSheet exlsheet = this.workbook.getSheet(sheet);                                     // считываем имя листа из воркбука
        int row = random.nextInt(exlsheet.getLastRowNum() + 1);                           // ввожу переменную RowNumb, которая содержит инфу про количество строк на листе, +1, так как начинаем с 0
        String data = exlsheet.getRow(row).getCell(cell).getStringCellValue();              // из первой ячейки получаем информацию о пользователе; и записываем в Value
        return data;
    }

    public void Close() throws IOException {
        this.workbook.close();
    }
}