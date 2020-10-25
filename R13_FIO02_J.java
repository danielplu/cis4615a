package cis4615;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

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

		Path file = new File(args[0]).toPath();
		try {
			Files.delete(file);
		} catch (IOException x) {
			System.out.println("Deletion failed");
			// Handle error
		}
	}
}
