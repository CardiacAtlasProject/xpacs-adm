package org.cardiacatlas.xpacs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main application that starts the Spring framework
 * This would be a REST controller with auto configuration
 */
@RestController
@EnableAutoConfiguration
public class App 
{
	// A test hello method, accessible at [context-root]/hello URL
	@RequestMapping("/hello")
	String home() {
		return "Hello, XPACS";
	}
	
	// The main method runs Spring
    public static void main( String[] args ) throws Exception
    {
        SpringApplication.run(App.class, args);
    }
}
