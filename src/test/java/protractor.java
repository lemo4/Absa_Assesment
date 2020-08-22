
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;


public class protractor {

    public static void main(String[] args) throws Exception {

        //WebDriver location
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LEMOHANG\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launch website
        driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
        Thread.sleep(3000);

        //Validate that you are on the User List Table
        Boolean Display = driver.findElement(By.xpath("//html/body/table/thead/tr[2]/td/button")).isDisplayed();
        if (Display == true) {

            //Click Add users
            driver.findElement(By.xpath("/html/body/table/thead/tr[2]/td/button")).click();
        }

        // enter a valid First Name
        driver.findElement(By.name("FirstName")).sendKeys("FName1");

        // enter a valid Surname Name
        driver.findElement(By.name("LastName")).sendKeys("LName");

        // enter a valid User Name (*)
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("User1");

        // enter a valid Password
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("Pass1");

        // enter a Select Customer
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input")).click();
        //  Thread.sleep(5000);

        //select role
       Select role = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select")));
         role.selectByVisibleText("Admin");

        //Enter Email
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("Admin@mail.com");

        //Enter Cell Phone Number
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("082555");

        // SAVE
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[2]")).click();

    }
}