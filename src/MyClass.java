import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.security.auth.login.LoginContext;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class MyClass {
    public static void main(String[] args) throws IOException
    {

            File file = new File("C:\\Users\\301044075\\Desktop\\Test1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet first_sheet = workbook.createSheet("First Sheet");

        first_sheet.createRow(0).createCell(0).setCellValue("hmacwan1516@gmail.com");
        first_sheet.getRow(0).createCell(1).setCellValue("Pass123");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            workbook.write(fos);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}