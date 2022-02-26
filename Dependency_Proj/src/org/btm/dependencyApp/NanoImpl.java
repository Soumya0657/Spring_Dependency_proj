package org.btm.dependencyApp;

public class NanoImpl implements Icar

{
	
	public NanoImpl() {
		System.out.println("Nano imlemntation oject created");
	}
private int id;
private String color;

	@Override
	public void drive() {
		
		System.out.println("nano details below");
		
		System.out.println("nano iud"+id);
		System.out.println("nano color"+color);
		System.out.println("nano driven broom");
		
		
	}

}
