package firstpackage;

import org.openqa.selenium.WebElement;

public class SecondClass {
    private WebElement email;
    private WebElement password;

    public SecondClass() {
    }

    public SecondClass(WebElement email, WebElement password) {
        this.email = email;
        this.password = password;
    }

    public WebElement getEmail() {
        return email;
    }

    public void setEmail(WebElement email) {
        this.email = email;
    }

    public WebElement getPassword() {
        return password;
    }

    public void setPassword(WebElement password) {
        this.password = password;
    }
}
