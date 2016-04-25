package main.java;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Polynomial {
	public ArrayList<Term> array;
	FileReader newfile = new FileReader();
	
	public Polynomial(){
		array = new ArrayList<Term>();
	}
	
	public String initiate() throws FileNotFoundException{
		array.clear();
		newfile.read(array);
		return newfile.polyNum;
	}
	
	public void insert(int x, int y){
		Term temp = new Term(x,y);
		for (int i = 0; i <= array.size()-1; i++){
			if(y > array.get(i).getExp()){
				array.add(i,temp);
				break;
			}
			else if (i == array.size()-1){
				array.add(temp);
				break;
			}
		}
		if(array.size() == 0)
			array.add(temp);
	}
	
	public void delete(int x, int y){
		for(Term temp: array){
			if ((temp.getCoef() == x) && (temp.getExp() == y)){
				array.remove(array.indexOf(temp));
				break;
			}
		}
	}
	
	public void reverse(){
		ArrayList<Term> temp = new ArrayList<Term>();
		int arraysize = array.size() - 1;
		for (int i = 0; i <= arraysize; arraysize--){
			temp.add(array.get(arraysize));
		}
		array = temp;
	}
	
	public void returnProduct(){
		if (array.size() == 0)
			System.out.println("No terms exist!");
		for (int i = 1; i <= array.size(); i++){
			if (i == 1)
				System.out.print(array.get(i-1));
			else if (array.get(i-1).getCoef() < 0)
				System.out.print(" " + array.get(i-1));
			else
				System.out.print(" + " + array.get(i-1));
		}
	}
}
