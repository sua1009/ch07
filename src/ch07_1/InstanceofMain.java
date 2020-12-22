package ch07_1;

public class InstanceofMain {

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}
	
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method1 - Child로 변환 성공 ");
		}
		else {
			System.out.println("method1 - 변환되지 않음 ");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child)parent;
		System.out.println("method2 - child로 변환 성공");
	}
	

}