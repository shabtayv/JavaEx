package ps0;

import java.util.Random;

public class RandomHello extends HelloWorld {

	String[] randomStrings = {"hello1", "hello2", "hello3", "hello4", "hello5"};
	
	public static void main(String[] argv) {
		RandomHello hello = new RandomHello();
		for (int i = 0; i < 10; i++) {
			System.out.println(hello.sayHello());
		}
	}
	
	public String sayHello() {
		Random randomGenerator = new Random();
		return randomStrings[randomGenerator.nextInt(5)];
	}
}
