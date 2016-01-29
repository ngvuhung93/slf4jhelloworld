package example.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
    private static final Logger slf4jLogger = LoggerFactory.getLogger( HelloWorld.class );
    
    public static void main( String[] args ) {
	slf4jLogger.info( "Hello World" );
    }
}
