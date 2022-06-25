package properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTest {

    @Test
    @Tag("test1")
    void propTest() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "101");
        String browserSize = System.getProperty("browserSize", "1920x1080");

        System.out.println(browser);
        System.out.println(version);
        System.out.println(browserSize);
    }
}