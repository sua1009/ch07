package ch07_1;

public class Car {

	Tire frontLeftTire = new Tire ("앞 왼쪽", 6);
	Tire forntRightTire = new Tire ("앞 오른쪽", 2);
	Tire backLeftTire = new Tire ("뒤 왼쪽 ", 3);
	Tire backRightTire = new Tire ("뒤 오른쪽", 4);
	
	int run() {
		System.out.println("[자동차가 달립니다. ]" );
		
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		
		if (forntRightTire.roll() == false) {
			stop();
			return 2;
		}
		
		if (backLeftTire.roll() == false ) {
			stop();
			return 3;
		}
		
		if (backRightTire.roll() == false ) {
			stop();
			return 4;
		}
//		0을 리턴시 해당 메서드의 정상적인 종료를 의미함  
		return 0;
	}
	
	void stop () {
		System.out.println("[자동차가 멈췄습니다. ]");
	}
}
