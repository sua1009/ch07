package ch07;

public class Television {
	int channel;
	int volume;
	
	final int maxVolume = 25;
	final int minVolume = 0;
	final int maxChannel = 15;
	final int minChannel = 1;
	
	
	public Television() {}
	
	public Television (int channel, int volume) {
		this.channel = channel;
		this.channel = volume;
		
	}
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
		
	}
	
	void changeChannel(int channel) {
		if (channel >maxChannel && channel <minChannel) {
			channel = minChannel;
			System.out.println("채널을 벗어났습니다. 다시 설정해주세요");
		}
		else {
			System.out.println(this.channel + "번 채널로 변경합니다.");
		}
		
	}
	
	void channelUp() {
		channel++;
		if (channel > maxChannel) {
			channel = minChannel;
			System.out.println("채널을 벗어났습니다. 다시 설정해주세요");
		}
		
		else {
			System.out.println(this.channel + "번 채널로 변경합니다.");
		}
	}
	
	void channelDown() {
		channel --;
		if (channel < minChannel) {
			channel = minChannel;
			System.out.println("채널을 벗어났습니다. 다시 설정해주세요");
		}
		else {
			System.out.println(this.channel + "번 채널로 변경합니다.");
		}
	}
	
	void volumeUp() {
		volume ++;
		if (volume > maxVolume) {
			System.out.println("최대 볼륨을 벗어났습니다. 다시 설정해주세요");
			
		}
		else {
			System.out.println("볼륨을 1 올립니다. \n 현재 볼륨" + volume);
		}
		
		
	}
	
	void volumeDown() {
		volume--;
		if (volume > maxVolume) {
			System.out.println("최대 볼륨을 벗어났습니다. 다시 설정해주세요");
			
		}
		else {
			System.out.println("볼륨을 1 올립니다. \n 현재 볼륨" + volume);
		}
	}
	
	
	
}
