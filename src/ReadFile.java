import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile
{
    public static void main(String[] args) throws IOException {
        FileInputStream wrkbook =new FileInputStream("C:\\\\Users\\\\301044075\\\\Desktop\\\\Test1.xlsx");
        XSSFWorkbook page =new XSSFWorkbook(wrkbook);
        XSSFSheet sheet=page.getSheetAt(0);
        Row row= sheet.getRow(0);
        Cell cell=row.getCell(0);
        Cell cell2=row.getCell(1);
        System.out.println(cell);
        System.out.println(cell2);
    }

}