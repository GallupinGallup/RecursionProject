package counting.model;

public class RecursionTool {
	
	public double calculateFactorial(double currentNumber){
		if(currentNumber == 0 || currentNumber == 1){
			return 1;
		}else{
			return calculateFactorial(currentNumber - 1) * currentNumber;
		}
	}
	
	public double calculateIterativeFactorial(int num){
		if(num == 0 || num == 1){
			return 1;
		}else{
			int product = 1;
			for(int i = 2; i < num + 1; i++){
				product *= i;
			}
			return product;
		}
	}
	
	public int calculateFibonacci(int currentNumber){
		if(currentNumber == 0 || currentNumber == 1){
			return 1;
		}else{
			return calculateFibonacci(currentNumber - 1) + calculateFibonacci(currentNumber - 2);
		}
	}
	
	public int iterativeFibonacci(int number){
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 0; i < number; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

}