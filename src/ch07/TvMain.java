package ch07;

public class TvMain {

	public static void main(String[] args) {
		Television tv = new Television(5,10);
		
		tv.powerOn();
		tv.changeChannel(10) ;
		tv.volumeUp();
		tv.volumeUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
		
		SmartTV stv = new SmartTV();
		stv.powerOn();
		stv.volumeUp();
		stv.volumeUp();
		stv.channelUp();
		stv.changeChannel(20);
		stv.turnOffInternet();
		stv.changeUrl("www.daum.net");
		stv.turnOnYoutube();
		stv.turnOffYoutube();
		stv.powerOff();
	
		
		IPTV iptv = new IPTV();
		iptv.VODChannelOn();
		iptv.VODChannelUp();
		iptv.VODChannelDown();
		iptv.VODChanneOff();
		
		
	
	
//	문제 1 ) Television  클래스를 상속받아 IPTV라는 클래스를 생성하고, IPTV고유의 기능으로 VOD 채널을
//	볼 수 있는 프로그램을 작성하세요 
//	조건 1. VOD 채널을 저장하는 멤버 변수 필요
//	조건 2. VOD 채널을 변경하는 메서드 필요

//	문제 2 ) Television 클래스는 현제 volume이 최대볼륨과 최소 볼륨이 존재하지 않는 상태이며, 
//	channel도 최소 채널과 최대 채널이 존재하지 않는 상태이다. 이를 수정하여 볼륨은 0~25 까지의 볼륨을
//	사용할 수 있도록 수정하고, 해당범위를 넘어서지 못하도록 수정하고 
//	채널은 1~ 15번까지의 범위를 가지고 그 범위를 넘어서면 각각 반대의 최대 혹은 최소값을 가지도록 수정하세요
	
	
	}

}
