package ch07;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1233445", 21);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
		
	}

}
