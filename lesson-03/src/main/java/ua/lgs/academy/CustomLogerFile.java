package ua.lgs.academy;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class CustomLogerFile {
private static Logger LOG = Logger.getLogger(CustomLogerFile.class);
	
public static void logWithBasicConfigurator() {
	BasicConfigurator.configure();
	LOG.info("INFO logger message");
	LOG.debug("DEBUG logger message");
	LOG.warn("WARN logger message");
	
	
	
}
public static void logWithDomConfigurator() {
	DOMConfigurator.configure("loggerConfig.xml");
	LOG.error("ERROR logger message");
	LOG.info("INFO logger message");
	LOG.debug("DEBUG logger message");
	LOG.warn("WARN logger message");
	
}

}
