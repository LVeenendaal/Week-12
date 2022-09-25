import java.util.Random;

public class TestDemo {
	
	public int randomNumberSquared() {
		
		int a = getRandomInt();
		return a*a;
	}
	
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
		
	}

	public int addPositive(int a, int b) {
		
		int c = 0;
		
		if(a>0 && b>0) {
			c = a+b;
		}else if(a<=0 || b<=0) {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
		
		return c;
	}
	}
