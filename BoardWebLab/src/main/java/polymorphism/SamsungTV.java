package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv1")
public class SamsungTV implements TV {
	@Autowired
	//@Qualifier("sony")
	//@Resource(name = "sony")
	private Speaker speaker;  // DI(Dependency Injection, 의존성주입), IoC
	private int price;        // 27000000

	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}

	public void initMethod() {
		System.out.println("객체 초기화 작업 처리...");
	}
	
	public void destoryMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리...");
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}

	public void powerOn() {
		System.out.println("SamsungTV---전원을 켠다. (가격 : " + price + ")");
	}

	public void powerOff() {
		System.out.println("SamsungTV---전원을 끈다.");
	}

	public void volumeUp() {
		speaker.volumeUp();
		//System.out.println("SamsungTV---소리 올린다.");
	}

	public void volumeDown() {
		speaker.volumeDown();
		//System.out.println("SamsungTV---소리 내린다.");
	}
}
