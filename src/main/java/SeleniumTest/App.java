package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("This is my first Selenium testing!");

        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.gecko.driver","/Users/james/java_resources/Selenium/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.scu.edu/";
        String expectedTitle = "Home - Santa Clara University";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        // test search function

        // WebElement searchInput = driver.findElement(By.id("cheese"));
        // WebElement searchBtn = driver.findElement(By.cssSelector("#input-group-text#btn#btn-light"));
        // String searchingMessage = "Computer Science";
        // searchInput.sendKeys(searchingMessage);
        // searchBtn.click();


        // test get start

        //close Fire fox
        driver.close();
    }
}
