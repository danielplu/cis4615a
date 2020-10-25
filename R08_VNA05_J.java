package cis4615;
/*
 * Daniel Lu
 * Rule 08. Ensure atomicity when reading and writing 64-bit values, VNA05_J.java
 * Non-compliant code
 * 		class LongContainer {
  			private long i = 0;
 
		    void assignValue(long j) {
		      i = j;
		    }
 
		    void printLong() {
		      System.out.println("i = " + i);
		    }
}
 */
public class R08_VNA05_J {
	// Compliant code
	class LongContainer {
		  private volatile long i = 0;
		 
		  void assignValue(long j) {
		    i = j;
		  }
		 
		  void printLong() {
		    System.out.println("i = " + i);
		  }
		}
}
