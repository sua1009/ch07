package ch07;

public class SuperCar extends Car {
	
	@Override
	public void speedUp() {
		speed = speed + 10;
	}
	
//	Car 클래스의 stop() 메서드가 final을 사용하였기 때문에 Overriding이 되지 않음 
//	@Override 
//	public void stop() {
//		
//	}
}
