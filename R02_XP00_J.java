package cis4615;

import java.io.File;

/*
 * Daniel Lu
 * Rule 02. Do not ignore values returned by methods, R02_XP00_J.java
 * Non-compliant code
 * 		public void deleteFile(){
			File someFile = new File("someFileName.txt");
			// Do something with someFile
			someFile.delete();
		}
 */
public class R02_XP00_J {

	public static void main(String[] args) {
		deleteFile();
	}
	public static void deleteFile() {
		File someFile = new File("someFileName.txt");
		// Do something with someFile
		if (!someFile.delete()) {
		// Handle failure to delete the file
			System.out.println("Failure to delete file");
		}
		else {
			System.out.println("Successfully deleted file");
		}
	}
}

