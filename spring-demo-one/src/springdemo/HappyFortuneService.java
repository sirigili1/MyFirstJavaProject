package springdemo;

public class HappyFortuneService implements FortuneInterface {

	@Override
	public String getFortune() {
		return "my fortune service";
	}

}
