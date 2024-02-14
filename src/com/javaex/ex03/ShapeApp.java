package com.javaex.ex03;

public class ShapeApp {

	public static void main(String[] args) {
		
			Triangle t1 = new Triangle(5, 5);
			t1.setFillColor("빨강"); 
			// 동일패키지인데 왜 setFillColor?
			// 동일패키지안에서 상속된 클래스에서만 직접 사용 가능하다고 함. 
			t1.setLineColor("파랑");
			t1.showInfo();
			
	}

}


