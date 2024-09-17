package dataExel;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class readData {
    public static void main(String[] args) throws IOException {

        String exelFilePath = ".\\src\\test\\java\\dataFile\\testData.xls";
        FileInputStream fileInputStream = new FileInputStream(exelFilePath);
        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
       // XSSFSheet sheet =  workbook.getSheet("sheet1");
        HSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> sheetIterator = sheet.iterator();
        while (sheetIterator.hasNext()) {
            HSSFRow row = (HSSFRow) sheetIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                HSSFCell cell = (HSSFCell) cellIterator.next();
                switch (cell.getCellType()) {
                    case STRING: System.out.print(cell.getStringCellValue()); break;
                    case NUMERIC: System.out.print(cell.getNumericCellValue()); break;
                    case FORMULA: System.out.print(cell.getCellFormula()); break;

                }
                System.out.print(" - ");



            }


        }


    }
}
