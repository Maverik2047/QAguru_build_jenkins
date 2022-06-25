package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTest {
    @Test
    @Tag("test1")
    void propertyTest(){
        String browser = System.getProperty("browser","safari");
        System.out.println(browser);
    }
}
