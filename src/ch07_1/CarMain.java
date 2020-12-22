package ch07_1;

public class CarMain {

	public static void main(String[] args) {
//		Car 클래스 타입으로 객체 생성 
		Car car = new Car ();
		
		for(int i = 1; i <= 5; i ++ ) {
			
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HankookTire 로 교체");
				car.frontLeftTire = new HankookTire("앞 왼쪽", 15);
				break;
				
			case 2:
				System.out.println("앞 오른쪽 KumhoTire 로 교체");
				car.forntRightTire = new KumhoTire("앞 오른쪽", 13);
				break;
			
			case 3:
				System.out.println("뒤 왼쪽 HankookTire 로 교체");
				car.backLeftTire = new HankookTire("뒤 왼쪽", 14);
				break;
			
			case 4:
				System.out.println("뒤 오른쪽 KumhoTire 로 교체");
				car.backRightTire = new KumhoTire("뒤 오른쪽", 17);
			break;
		}	
			
			System.out.println("------------------------");
	}
	}
}
