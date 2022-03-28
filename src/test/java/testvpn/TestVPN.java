package testvpn;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class TestVPN {
    @Test
    void testVpn() throws InterruptedException {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://google.com";
        Configuration.headless = true;
        Configuration.remote = "http://chrome_vpn:4444";
        Selenide.open();
        Thread.sleep(3000);
        Selenide.screenshot("screenshot.png");
    }
}
