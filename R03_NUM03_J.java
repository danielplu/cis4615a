package cis4615;

import java.io.DataInputStream;
import java.io.IOException;

/*
 * Daniel Lu
 * Rule 03. Use integer types that can fully represent the possible range of unsigned data, R03_NUM03_J.java
 * Non-compliant code
 * 		public static int getInteger(DataInputStream is) throws IOException {
  			return is.readInt(); 
		}
 */

public class R03_NUM03_J {
	// Compliant code
	public static long getInteger(DataInputStream is) throws IOException {
		return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
	}
}
