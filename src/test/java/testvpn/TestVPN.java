package testvpn;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestVPN {
    private static final Logger logger = LoggerFactory.getLogger(TestVPN.class);

    @Test
    void testVpn() throws InterruptedException {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://google.com";
        Configuration.headless = true;
        Configuration.remote = "http://chrome_vpn:4444";
        Selenide.open("");
        Thread.sleep(3000);
        logger.info("Screenshot file: " + Selenide.screenshot("screenshot"));
    }
}
