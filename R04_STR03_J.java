package cis4615;

import java.math.BigInteger;

/*
 * Daniel Lu
 * Rule 04. Do not encode noncharacter data as a string, R04_STR03-J.java
 * Non-compliant code
 * 		BigInteger x = new BigInteger("530500452766");
		byte[] byteArray = x.toByteArray();
		String s = new String(byteArray);
		byteArray = s.getBytes();
		x = new BigInteger(byteArray);
 */

public class R04_STR03_J {
	// Compliant code
	public static void main(String[] args) {
		BigInteger x = new BigInteger("530500452766");
		String s = x.toString(); // Valid character data
		byte[] byteArray = s.getBytes();
		String ns = new String(byteArray);
		x = new BigInteger(ns);
	}
}
