package cis4615;

/*
 * Daniel Lu
 * Rule 10. Do not invoke Thread.run(), R10_THI100_J.java
 * Non-compliant code
 * public final class Foo implements Runnable {
	  @Override public void run() {
	    // ...
	  }
	 
	  public static void main(String[] args) {
	    Foo foo = new Foo();
	    new Thread(foo).run();
	  }
	}
}
 */
public final class R10_THI00_J implements Runnable {
	// Compliant code
	// This compliant solution correctly uses the start() method to tell the Java
	// runtime to start a new thread:

	public static void main(String[] args) {
		R10_THI00_J foo = new R10_THI00_J();
		new Thread(foo).start();
	}

	@Override
	public void run() {
		// ...
	}

}
