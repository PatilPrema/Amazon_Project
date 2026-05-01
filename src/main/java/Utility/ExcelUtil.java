package Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

public class ExcelUtil {

    public static Object[][] getData(String path, String sheetName) throws Exception {

        FileInputStream fis = new FileInputStream("./excel/TestData.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet(sheetName);

        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rows - 1][cols];

        for (int i = 1; i < rows; i++) {
        	Row row = sheet.getRow(i);
      
            for (int j = 0; j < cols; j++) {
            	 Cell cell = row.getCell(j);

            	if (cell.getCellType() == CellType.NUMERIC) {
            	    data[i - 1][j] = String.valueOf((long) cell.getNumericCellValue());
            	} else {
            	    data[i - 1][j] = cell.getStringCellValue();
            	}
            }
        }

        wb.close();
        return data;
    }
}
