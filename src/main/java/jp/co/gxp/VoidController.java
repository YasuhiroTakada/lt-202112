package jp.co.gxp;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/")
public class VoidController {

    private static final Logger logger = LoggerFactory.getLogger(VoidController.class);

    @Get("/log/{message}")
    public String echo(String message) {
        logger.debug(message);
        return message;
    }
}
