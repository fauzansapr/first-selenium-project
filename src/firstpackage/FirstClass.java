package firstpackage;

// import selenium webdriver
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

    private String expectedTitle;
    private String actualTitle;

    public FirstClass() {
        this.expectedTitle = "Welcome: Mercury Tours";
    }

    public FirstClass(String expectedTitle, String actualTitle) {
        this.expectedTitle = expectedTitle;
        this.actualTitle = actualTitle;
    }

    public String getExpectedTitle() {
        return expectedTitle;
    }

    public String getActualTitle() {
        return actualTitle;
    }

    public void setExpectedTitle(String expectedTitle) {
        this.expectedTitle = expectedTitle;
    }

    public void setActualTitle(String actualTitle) {
        this.actualTitle = actualTitle;
    }

    public void compareTitle() {
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Title Match");
        } else {
            System.out.println("Title Not Match");
        }
    }

    public void compareTitle(String actualTitle, String expectedTitle) {
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Title Match");
        } else {
            System.out.println("Title Not Match");
        }
    }
}
