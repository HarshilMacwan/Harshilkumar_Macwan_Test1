import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class TestSelenium {
	public static void main(String[] args) throws IOException
    {
        Random objGenerator = new Random();
        int randomNumber = 0;
        for (int iCount = 0; iCount< 10; iCount++) {
             randomNumber = objGenerator.nextInt(100);
        }

            File file = new File("C:\\Users\\301044075\\Desktop\\Test1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet first_sheet = workbook.createSheet("First Sheet");

        first_sheet.createRow(0).createCell(0).setCellValue("User1");
        first_sheet.getRow(0).createCell(1).setCellValue("Pass1");
        first_sheet.getRow(0).createCell(2).setCellValue(randomNumber);
        first_sheet.createRow(1).createCell(0).setCellValue("User2");
        first_sheet.getRow(1).createCell(1).setCellValue("Pass2");
        first_sheet.getRow(1).createCell(2).setCellValue(randomNumber);
        first_sheet.createRow(2).createCell(0).setCellValue("User3");
        first_sheet.getRow(2).createCell(1).setCellValue("Pass3");
        first_sheet.getRow(2).createCell(2).setCellValue(randomNumber);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            workbook.write(fos);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
