package org.cardiacatlas.xpacs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main application that starts the Spring framework
 * This would be a REST controller with auto configuration
 */
@RestController
@SpringBootApplication
public class App 
{
	static final Logger logger = LoggerFactory.getLogger(App.class);
	
	// A test hello method, accessible at [context-root]/hello URL
	@RequestMapping("/hello")
	String home() {
		logger.info("INFO: hello is called");
		return "Hello, XPACS";
	}
	
	// The main method runs Spring
    public static void main( String[] args ) throws Exception
    {
        SpringApplication.run(App.class, args);
    }
}
