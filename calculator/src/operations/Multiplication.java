package operations;

public class Multiplication {

	Double firstNumber;
	Double secondNumber;
	
	public Multiplication() {
		
	}
	
	public Multiplication(Double firstNumber, Double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public Double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(Double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public Double getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(Double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public Double result() {
		return firstNumber * secondNumber;
	}
	
}
