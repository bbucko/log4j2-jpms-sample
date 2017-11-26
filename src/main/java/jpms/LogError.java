package jpms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogError {

    private static final Logger logger = LogManager.getLogger(LogError.class);

    public static void main(String[] args) {
        logger.info("hello world");
    }
}
