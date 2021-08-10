package org.sample;

public class Constructor1 extends Constructor{
	public Constructor1() {
		this("abc",54564);
		System.out.println("Default Constructor 1");
	}
	
public Constructor1(String ajithName, int ajithId) {
	System.out.println("Employee name is:"+ajithName+"Employee id is:"+ajithId);
	
	
	
}
}
