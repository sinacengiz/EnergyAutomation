import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ConnectWeb {
    private String url;
    public void connectWeb(String url){
        this.url=url;
        System.setProperty("webdriver.chrome.driver","C:/Users/User/Desktop/chromedriver.exe" );
        WebDriver webDriver = new ChromeDriver();
        url= "https://osos.akdenizedas.com.tr/osos/login.iface";
        webDriver.navigate().to(url);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
