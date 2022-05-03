package org.system;

public class Desktop extends Computer {
	public void desktopSize() {

		System.out.println("Deskstop size is 21");
	}

	public static void main(String[] args) {

		Desktop details = new Desktop();
		details.computerModel();
		details.desktopSize();

	}
}
