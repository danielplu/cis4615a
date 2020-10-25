package cis4615;

import java.io.File;

/*
 * Daniel Lu
 * Rule 13.Detect and handle file-related errors, FIO02-J.java
 * Non-compliant code
 * 	File file = new File(args[0]);
   	file.delete();
 */
public class R13_FIO02_J {
	
	public static void main(String[] args) {
		// Compliant code
		File file = new File("file");
		if (!file.delete()) {
		  System.out.println("Deletion failed");
		}
	}
}
