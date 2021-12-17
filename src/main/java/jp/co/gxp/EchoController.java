package jp.co.gxp;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

@Controller("/")
public class EchoController {

    private static final Logger logger = LoggerFactory.getLogger(EchoController.class);

    @Get("/echo/{message}")
    public Response echo(String message) {
        logger.debug(message);
        return new Response(message);
    }

    public static class Response {

        public final String message;

        public final LocalDateTime dateTime;

        public Response(String message) {
            this(message, LocalDateTime.now());
        }

        public Response(String message, LocalDateTime dateTime) {
            this.message = message;
            this.dateTime = dateTime;
        }
    }
}
