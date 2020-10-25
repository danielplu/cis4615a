package cis4615;
/*
 * Daniel Lu
 * Rule 00. Input Validation and Data Sanitization (IDS) R00 IDS03 J.java
 * Non-compliant code
 * 		if (loginSuccessful) {
			logger.severe("User login succeeded for: " + username);
		}
		else {
			logger.severe("User login failed for: " + username);
		}
 */
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {
	
	static Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
    static boolean loginSuccessful = false;
    static String username = "guest\nMay 15, 2011 2:25:52 PM java.util.logging.LogManager$RootLogger log\\n\r\nSEVERE: User login succeeded for: administrator"; // Will say unauthorizedUser since doesn't match a-z,0-9,_
    static String properUsername = "Daniel"; // Works if passed into sanitizeUser instead of multi-line string
    
    public static void main(String[] args) {
    	if (loginSuccessful) {
    		  logger.severe("User login succeeded for: " + sanitizeUser(username));
    		} else {
    		  logger.severe("User login failed for: " + sanitizeUser(username));
    		}
    }
    public static String sanitizeUser(String username) {
    	  return Pattern.matches("[A-Za-z0-9_]+", username)
    	      ? username : "unauthorized user";
    	}
}
