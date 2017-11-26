package jpms;

import org.junit.jupiter.api.Test;

public class Log4j2Test {

    @Test
    public void shouldStartLog4j() {
        LogError.main(new String[]{""});
    }
}