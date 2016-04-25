package test.java;

import main.java.Polynomial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Driver {
	static Polynomial poly; //= new Polynomial();
	public static void main(String[] args) throws FileNotFoundException {
		int response;
		int x, y;
		String polyNum = "";
		File f = new File("src/test/infile.txt");
		Scanner scnr = new Scanner(f);
		poly = new Polynomial();
		polyNum = reader(scnr);
		Scanner stdin = new Scanner(System.in);
		System.out.println("Welcome to the Polynomial Function Creater! \n");
		System.out.println("What would you like to do?");
		System.out.println("1 - Insert Term | 2 - Delete Term | 3 - Reverse Term | 4 - Print Term | 5 - Retrieve Next Polynomial | 0 - Exit");
		response = stdin.nextInt();
		while (response != 0){
			if (response == 1){
				System.out.println("You selected to Insert Term");
				System.out.println("Enter desired coefficient followed by exponent. Seperate with space");
				x = stdin.nextInt();
				y = stdin.nextInt();
				poly.insert(x, y);
				poly.returnProduct();
			}
			else if (response == 2){
				System.out.println("You selected to Delete Term");
				System.out.println("Enter desired coefficient followed by exponent. Seperate with space");
				x = stdin.nextInt();
				y = stdin.nextInt();
				poly.delete(x, y);
				poly.returnProduct();
			}
			else if (response == 3){
				System.out.println("You selected to Reverse Term");
				System.out.println("The terms have now been reversed");
				poly.reverse();
				poly.returnProduct();
			}
			else if(response == 4){
				System.out.println("You selected to Print Term");
				System.out.print(polyNum + " (X) = ");
				poly.returnProduct();
			}
			else if(response == 5){
				System.out.println("You selected to Retrieve the Next Polynomial From File");
				poly.array.clear();
				polyNum = reader(scnr);
				poly.returnProduct();
			}
			else
				System.out.println("Invalid Option");
			System.out.println("\n\nWhat would you like to do next?");
			System.out.println("1 - Insert Term | 2 - Delete Term | 3 - Reverse Term | 4 - Print Term | 5 - Retrieve Next Polynomial | 0 - Exit");
			response = stdin.nextInt();
		}
		System.out.println("Goodbye!");
	}
	public static String reader(Scanner scnr){
		String polyNum = "";
		while (scnr.hasNext()){
			scnr.useDelimiter(";");
			int x, y;
			polyNum = scnr.next();
			//System.out.println(polyNum);
			while (scnr.hasNextLine()){
				if(!scnr.hasNextInt()){
					break;
				}
				x = scnr.nextInt();
				//System.out.println(x);
				y = scnr.nextInt();
				//System.out.println(y);
				poly.insert(x,y);
			}
			break;
		}
		return polyNum;
	}
}
