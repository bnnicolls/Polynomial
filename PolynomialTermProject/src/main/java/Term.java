package main.java;


public class Term {
	private int coef;
	private int exp;
	
	public Term(int coef, int exp){
		this.coef = coef;
		this.exp = exp;
	}

	public int getCoef() {
		return coef;
	}
	public int getExp() {
		return exp;
	}
	
	public String toString(){
		String newterm = "";
		if (coef == 0)
			newterm = "0";
		else if (exp == 0)
			newterm = coef + "";
		else if (exp == 1)
			newterm = coef + "x" ;
		else
			newterm = coef + "x^" + exp;
		return newterm; 
	}
}