package JavaDriverExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javadriver {

    public static void main(String[] args){
        //System.setProperty("webdriver.firefox.marionette", "./geckodriver.exe");
        //declaration
        WebDriver driver= new ChromeDriver();
        String baseUrl= "http://google.com";
        String expectedTitle= "Google";
        String actualTitle= "";

        //launch firefox
        driver.get(baseUrl);

        //get the actual value of title
        actualTitle= driver.getTitle();

        //compare
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        }else{
            System.out.println("Test Failled");
        }

        //close firefox
        driver.close();

        //exit
        System.exit(0);
    }
}
