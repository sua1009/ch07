package ch07;

public class IPTV extends Television {
//	iptv의 멤버변수
	int VODChannel;
	
//	생성자를 사용하여 기본값 입력
	IPTV() {
		VODChannel = 101;
		channel = 1;
		volume = 0;
	}
	void VODChannelOn() {
		System.out.println("vod를 켭니다.");
	}
	
	void VODChannelUp () {
		VODChannel++;
		System.out.println(this.VODChannel+ "로 변경합니다.");
	}
	
	void VODChannelDown () {
		VODChannel--;
		System.out.println(this.VODChannel+ "로 변경합니다.");
	}
	
	void VODChanneOff() {
		System.out.println("vod를 종료합니다.");
	}
}
