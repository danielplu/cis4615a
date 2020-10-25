package cis4615;
/*
 * Daniel Lu
 * Rule 09. Synchronize access to static fields that can be modified by untrusted code, LCK05_J.java
 * Non-compliant code
 * This class is not thread-safe
 * public final class CountHits {
	  private static int counter;
	 
	  public void incrementCounter() {
	    counter++;
	  }
}
 */
public final class R09_LCK05_J {
	// Compliant code
	/* This class is thread-safe */
	  private static int counter;
	  private static final Object lock = new Object();
	 
	  public void incrementCounter() {
	    synchronized (lock) {
	      counter++;
	    }
	  }
}
