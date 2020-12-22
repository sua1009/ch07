package ch07;

//	클래스 B에서 클래스 A를 기반으로 객체를 생성함 
//	동일 패키지 내에서 필드, 메서드, 생성자 사용가능
public class B {
	public void method() {
//		클래스를 통해서 객체를 생성한다는 것은 해당 클래스 타입의 변수를 생성하는 것 
		Integer in = 0;
		String str = "";
		A a = new A();
		a.field = "value";
		a.method();
		
	}
	
}
