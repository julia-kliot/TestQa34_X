package manage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {

    public UserHelper(WebDriver wd) {
        super(wd);
    }
    public void initLogin() {
        click(By.cssSelector("[href='/login']"));
    }

    public void fillInLoginForm() throws InterruptedException {
        type(By.cssSelector("#user"), "juliakliot.jk@gmail.com");
        click(By.cssSelector("#login"));
        Thread.sleep(2000);
        type(By.cssSelector("#password"), "misha240613");
    }

    public void submitLogin() {
        click(By.cssSelector("#login-submit"));
    }
    public boolean isLogged() {
        return wd.findElements(By.cssSelector("[data-test-id = 'header-member-menu-button']")).size() > 0;

    }

    public void logOut() {
        click(By.cssSelector("[data-test-id = 'header-member-menu-button']"));
        click(By.cssSelector("[data-test-id = 'header-member-menu-logout']"));
        click(By.cssSelector("[data-testid='logout-button']"));
    }

}
