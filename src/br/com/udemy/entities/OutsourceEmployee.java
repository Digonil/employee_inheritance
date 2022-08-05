package br.com.udemy.entities;

public class OutsourceEmployee extends Employee {

	public Double additionalCharge;

	public OutsourceEmployee() {

	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double addtionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = addtionalCharge;
	}

	public Double getAddtionalCharge() {
		return additionalCharge;
	}

	public void setAddtionalCharge(Double addtionalCharge) {
		this.additionalCharge = addtionalCharge;
	}

	@Override
	public Double payment() {
		return super.payment() + (additionalCharge * 1.1);// Por sobreescrever o método, utilizamos o mesmo da classe
															// mão e adicionamos a regra adicional.
	}

	@Override
	public String toString() {
		return "Employee [Payment: " + payment();
	}

}
