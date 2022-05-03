package org.Interface;

public class Automation implements Language, TestTool {

	public void Java() {
		System.out.println("Java is the programming language");
	}

	public void Selenium() {
		System.out.println("Selenium is the Testing tool");
	}

	public static void main(String[] args) {
		Automation executionclass = new Automation();
		executionclass.Java();
		executionclass.Selenium();
	}
}
