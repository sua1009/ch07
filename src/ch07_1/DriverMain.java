package ch07_1;

public class DriverMain {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle v = new Vehicle();
		
//		Driver 클래스의 멤버 메서드 drive()는 매개변수로 Vehicle 클래스의 객체를 받음 
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(v);
		
	
	}

}
