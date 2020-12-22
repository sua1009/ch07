package ch07;

public class A {
	
//	protected를 사용하면 같은 패키지 안에서는 사용이 가능하고 
//	외부 패키지는 상속받아야지만 사용이 가능하다.
//	접근 제어자가 protected로 적용된 멤버 변수
	protected String field;
	
//	접근 제어자가 protected로 적용된 생성자	
	protected A() {
		
	}
//	접근 제어자가 protected가 적용된 멤버 메서드
	protected void method() {
		
	}
}
