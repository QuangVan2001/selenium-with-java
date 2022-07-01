import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SeleniumTest {
    public static WebDriver myBrowser; // để tương tác với các element của browser

    @BeforeTest
    public void init() {
        WebDriverManager.chromedriver().setup();
        myBrowser = new ChromeDriver(); // khởi tạo
        myBrowser.manage().window().maximize();
        myBrowser.get("http://localhost:6969/swt-presentation-selenium/");
    }



    @Test
    public static void UTCID01() {


        WebElement userID = myBrowser.findElement(By.name("userID"));
        userID.sendKeys("admin");
        WebElement password = myBrowser.findElement(By.name("password"));
        password.sendKeys("1");
        WebElement action = myBrowser.findElement(By.name("action"));
        //wating 4s
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        action.click();

        WebElement year = myBrowser.findElement(By.name("year"));
        year.sendKeys("2020");
        WebElement month = myBrowser.findElement(By.name("month"));
        month.sendKeys("2");
        WebElement day = myBrowser.findElement(By.name("day"));
        day.sendKeys("29");
        WebElement check = myBrowser.findElement(By.xpath("/html/body/form[2]/input[4]"));
        //wating 2s

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        check.click();
        Assert.assertEquals(valid(2020, 2, 29), true);

    }
    @Test
    public static void UTCID02() {


        WebElement userID = myBrowser.findElement(By.name("userID"));
        userID.sendKeys("admin");
        WebElement password = myBrowser.findElement(By.name("password"));
        password.sendKeys("1");
        WebElement action = myBrowser.findElement(By.name("action"));
        //wating 4s
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        action.click();

        WebElement year = myBrowser.findElement(By.name("year"));
        year.sendKeys("2021");
        WebElement month = myBrowser.findElement(By.name("month"));
        month.sendKeys("2");
        WebElement day = myBrowser.findElement(By.name("day"));
        day.sendKeys("29");
        WebElement check = myBrowser.findElement(By.xpath("/html/body/form[2]/input[4]"));
        //wating 2s

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        check.click();
        Assert.assertEquals(valid(2021, 2 , 29), false);

    }
    @Test
    public static void UTCID03() {


        WebElement userID = myBrowser.findElement(By.name("userID"));
        userID.sendKeys("admin");
        WebElement password = myBrowser.findElement(By.name("password"));
        password.sendKeys("1");
        WebElement action = myBrowser.findElement(By.name("action"));
        //wating 4s
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        action.click();

        WebElement year = myBrowser.findElement(By.name("year"));
        year.sendKeys("2020");
        WebElement month = myBrowser.findElement(By.name("month"));
        month.sendKeys("2");
        WebElement day = myBrowser.findElement(By.name("day"));
        day.sendKeys("31");
        WebElement check = myBrowser.findElement(By.xpath("/html/body/form[2]/input[4]"));
        //wating 2s

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        check.click();
        Assert.assertEquals(valid(2020, 2, 31), false);

    }
    @Test
    public static void UTCID04() {


        WebElement userID = myBrowser.findElement(By.name("userID"));
        userID.sendKeys("admin");
        WebElement password = myBrowser.findElement(By.name("password"));
        password.sendKeys("1");
        WebElement action = myBrowser.findElement(By.name("action"));
        //wating 4s
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        action.click();

        WebElement year = myBrowser.findElement(By.name("year"));
        year.sendKeys("2020");
        WebElement month = myBrowser.findElement(By.name("month"));
        month.sendKeys("4");
        WebElement day = myBrowser.findElement(By.name("day"));
        day.sendKeys("30");
        WebElement check = myBrowser.findElement(By.xpath("/html/body/form[2]/input[4]"));
        //wating 2s

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        check.click();
        Assert.assertEquals(valid(2020, 4, 30), true);

    }
    @Test
    public static void UTCID05() {


        WebElement userID = myBrowser.findElement(By.name("userID"));
        userID.sendKeys("admin");
        WebElement password = myBrowser.findElement(By.name("password"));
        password.sendKeys("1");
        WebElement action = myBrowser.findElement(By.name("action"));
        //wating 4s
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        action.click();

        WebElement year = myBrowser.findElement(By.name("year"));
        year.sendKeys("2009");
        WebElement month = myBrowser.findElement(By.name("month"));
        month.sendKeys("8");
        WebElement day = myBrowser.findElement(By.name("day"));
        day.sendKeys("31");
        WebElement check = myBrowser.findElement(By.xpath("/html/body/form[2]/input[4]"));
        //wating 2s

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        check.click();
        Assert.assertEquals(valid(2009, 8, 31), true);

    }
    @Test
    public static void UTCID06() {


        WebElement userID = myBrowser.findElement(By.name("userID"));
        userID.sendKeys("admin");
        WebElement password = myBrowser.findElement(By.name("password"));
        password.sendKeys("1");
        WebElement action = myBrowser.findElement(By.name("action"));
        //wating 4s
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        action.click();

        WebElement year = myBrowser.findElement(By.name("year"));
        year.sendKeys("2022");
        WebElement month = myBrowser.findElement(By.name("month"));
        month.sendKeys("2");
        WebElement day = myBrowser.findElement(By.name("day"));
        day.sendKeys("28");
        WebElement check = myBrowser.findElement(By.xpath("/html/body/form[2]/input[4]"));
        //wating 2s

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        check.click();
        Assert.assertEquals(valid(2022, 2, 28), true);

    }
    @Test
    public static void UTCID07() {


        WebElement userID = myBrowser.findElement(By.name("userID"));
        userID.sendKeys("admin");
        WebElement password = myBrowser.findElement(By.name("password"));
        password.sendKeys("1");
        WebElement action = myBrowser.findElement(By.name("action"));
        //wating 4s
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        action.click();

        WebElement year = myBrowser.findElement(By.name("year"));
        year.sendKeys("2021");
        WebElement month = myBrowser.findElement(By.name("month"));
        month.sendKeys("7");
        WebElement day = myBrowser.findElement(By.name("day"));
        day.sendKeys("31");
        WebElement check = myBrowser.findElement(By.xpath("/html/body/form[2]/input[4]"));
        //wating 2s

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        check.click();
        Assert.assertEquals(valid(2021, 7, 31), true);

    }
    @Test
    public static void UTCID08() {


        WebElement userID = myBrowser.findElement(By.name("userID"));
        userID.sendKeys("admin");
        WebElement password = myBrowser.findElement(By.name("password"));
        password.sendKeys("1");
        WebElement action = myBrowser.findElement(By.name("action"));
        //wating 4s
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        action.click();

        WebElement year = myBrowser.findElement(By.name("year"));
        year.sendKeys("2022");
        WebElement month = myBrowser.findElement(By.name("month"));
        month.sendKeys("6");
        WebElement day = myBrowser.findElement(By.name("day"));
        day.sendKeys("30");
        WebElement check = myBrowser.findElement(By.xpath("/html/body/form[2]/input[4]"));
        //wating 2s

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        check.click();
        Assert.assertEquals(valid(2022, 6, 30), true);

    }
    @Test
    public static void UTCID09() {


        WebElement userID = myBrowser.findElement(By.name("userID"));
        userID.sendKeys("admin");
        WebElement password = myBrowser.findElement(By.name("password"));
        password.sendKeys("1");
        WebElement action = myBrowser.findElement(By.name("action"));
        //wating 4s
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        action.click();

        WebElement year = myBrowser.findElement(By.name("year"));
        year.sendKeys("2021");
        WebElement month = myBrowser.findElement(By.name("month"));
        month.sendKeys("6");
        WebElement day = myBrowser.findElement(By.name("day"));
        day.sendKeys("31");
        WebElement check = myBrowser.findElement(By.xpath("/html/body/form[2]/input[4]"));
        //wating 2s

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        check.click();
        Assert.assertEquals(valid(2021, 6, 31), false);

    }
    @Test
    public static void UTCID10() {


        WebElement userID = myBrowser.findElement(By.name("userID"));
        userID.sendKeys("admin");
        WebElement password = myBrowser.findElement(By.name("password"));
        password.sendKeys("1");
        WebElement action = myBrowser.findElement(By.name("action"));
        //wating 4s
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        action.click();

        WebElement year = myBrowser.findElement(By.name("year"));
        year.sendKeys("2022");
        WebElement month = myBrowser.findElement(By.name("month"));
        month.sendKeys("2");
        WebElement day = myBrowser.findElement(By.name("day"));
        day.sendKeys("29");
        WebElement check = myBrowser.findElement(By.xpath("/html/body/form[2]/input[4]"));
        //wating 2s

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        check.click();
        Assert.assertEquals(valid(2022, 2, 29), false);

    }
    @Test
    public static void UTCID11() {


        WebElement userID = myBrowser.findElement(By.name("userID"));
        userID.sendKeys("admin");
        WebElement password = myBrowser.findElement(By.name("password"));
        password.sendKeys("1");
        WebElement action = myBrowser.findElement(By.name("action"));
        //wating 4s
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        action.click();

        WebElement year = myBrowser.findElement(By.name("year"));
        year.sendKeys("2020");
        WebElement month = myBrowser.findElement(By.name("month"));
        month.sendKeys("8");
        WebElement day = myBrowser.findElement(By.name("day"));
        day.sendKeys("31");
        WebElement check = myBrowser.findElement(By.xpath("/html/body/form[2]/input[4]"));
        //wating 2s

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        check.click();
        Assert.assertEquals(valid(2000, 8, 31), true);

    }
    @Test
    public static void UTCID12() {


        WebElement userID = myBrowser.findElement(By.name("userID"));
        userID.sendKeys("admin");
        WebElement password = myBrowser.findElement(By.name("password"));
        password.sendKeys("1");
        WebElement action = myBrowser.findElement(By.name("action"));
        //wating 4s
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        action.click();

        WebElement year = myBrowser.findElement(By.name("year"));
        year.sendKeys("2021");
        WebElement month = myBrowser.findElement(By.name("month"));
        month.sendKeys("7");
        WebElement day = myBrowser.findElement(By.name("day"));
        day.sendKeys("30");
        WebElement check = myBrowser.findElement(By.xpath("/html/body/form[2]/input[4]"));
        //wating 2s

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        check.click();
        Assert.assertEquals(valid(2021, 7, 30), true);

    }
    @Test
    public static void UTCID13() {


        WebElement userID = myBrowser.findElement(By.name("userID"));
        userID.sendKeys("admin");
        WebElement password = myBrowser.findElement(By.name("password"));
        password.sendKeys("1");
        WebElement action = myBrowser.findElement(By.name("action"));
        //wating 4s
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        action.click();

        WebElement year = myBrowser.findElement(By.name("year"));
        year.sendKeys("2022");
        WebElement month = myBrowser.findElement(By.name("month"));
        month.sendKeys("9");
        WebElement day = myBrowser.findElement(By.name("day"));
        day.sendKeys("31");
        WebElement check = myBrowser.findElement(By.xpath("/html/body/form[2]/input[4]"));
        //wating 2s

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        check.click();
        Assert.assertEquals(valid(2022, 9, 31), false);

    }
    @Test
    public static void UTCID14() {


        WebElement userID = myBrowser.findElement(By.name("userID"));
        userID.sendKeys("admin");
        WebElement password = myBrowser.findElement(By.name("password"));
        password.sendKeys("1");
        WebElement action = myBrowser.findElement(By.name("action"));
        //wating 4s
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        action.click();

        WebElement year = myBrowser.findElement(By.name("year"));
        year.sendKeys("2020");
        WebElement month = myBrowser.findElement(By.name("month"));
        month.sendKeys("9");
        WebElement day = myBrowser.findElement(By.name("day"));
        day.sendKeys("30");
        WebElement check = myBrowser.findElement(By.xpath("/html/body/form[2]/input[4]"));
        //wating 2s

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        check.click();
        Assert.assertEquals(valid(2020, 9, 30), true);

    }
    @Test
    public static void UTCID15() {


        WebElement userID = myBrowser.findElement(By.name("userID"));
        userID.sendKeys("admin");
        WebElement password = myBrowser.findElement(By.name("password"));
        password.sendKeys("1");
        WebElement action = myBrowser.findElement(By.name("action"));
        //wating 4s
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        action.click();

        WebElement year = myBrowser.findElement(By.name("year"));
        year.sendKeys("2022");
        WebElement month = myBrowser.findElement(By.name("month"));
        month.sendKeys("10");
        WebElement day = myBrowser.findElement(By.name("day"));
        day.sendKeys("31");
        WebElement check = myBrowser.findElement(By.xpath("/html/body/form[2]/input[4]"));
        //wating 2s

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        check.click();
        Assert.assertEquals(valid(2022, 10, 31), true);

    }



    public static boolean isLeap(int y) {
        boolean result = false;
        if ((y % 400 == 0 || (y % 4 != 0 && y % 100 != 0))) {
            result = true;
        }
        return result;
    }

    //testing whether the y,m,d is a valid date value or not
    public static boolean valid(int y, int m, int d) {
        if (y < 1 || m < 1 || m > 12 || d < 1 || d > 31) {
            return false;
        }
        int maxD = 31;
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            maxD = 30;
        } else if (m == 2) {
            if (isLeap(y)) {
                maxD = 29;// cũ là 29
            } else {
                maxD = 28;// cũ là 28
            }
        }
        return d <= maxD;
    }


    @AfterTest
    public void tearDown() {
        myBrowser.quit();
    }
}
