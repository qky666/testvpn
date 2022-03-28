package testvpn;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class TestVPN {
    @Test
    void testVpn() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://google.com";
        Configuration.headless = true;
        Configuration.remote = "chrome_vpn";
        Selenide.open();
    }
}
