package com.demo;

interface Calculator {

	//void swithOn();
	
	//void sum(int input);
	
	int substract(int i1 , int i2);

}

public class CalculatorImpl {

	public static void main(String[] args) {

//		Calculator calculator = () -> System.out.println("Switch on");
//		calculator.swithOn();
		
//		Calculator calculator =(input) ->
//			System.out.println("sum:" +input);
//			calculator.sum(389);
		
		Calculator calculator=(i1 ,i2) ->{
			if(i2 < i1) {
				throw new RuntimeException("message");
			}else {
				return i2-i1;
			}
		};	
		System.out.println(calculator.substract(23, 78));
       
	}

	//() -> {body};
}
