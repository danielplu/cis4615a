package cis4615;
/*
 * Daniel Lu
 * Rule 07. Prevent exceptions while logging data, ERR02_J.java
 * Non-compliant code
 * 		try {
		  // ...
		} catch (SecurityException se) {
		  System.err.println(se);
		  // Recover from exception
		}
 */

import java.util.logging.*;

public class R07_ERR02_J {
	// Compliant Code
	static Logger logger = Logger.getLogger(R07_ERR02_J.class.getName());
	public static void main(String[] args) {
		try {
			  // ...
			} catch(SecurityException se) {
			  logger.log(Level.SEVERE, se.toString());
			  // Recover from exception
			}
	}
}
