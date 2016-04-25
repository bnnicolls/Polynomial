package main.java;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. Wrap everything you want to do in the try
 * 2. use throws keyword (see open chrome tab)
 * 
 */




public class FileReader {
		public String polyNum;
		Scanner scnr;
		FileReader(){
			
		}
		File f = new File("src/test/infile.txt");
		/** Reads Data from file and populates tempDirectory arrayList found in Directory class
		 * @throws FileNotFoundException */
		public void read(ArrayList<Term> array) throws FileNotFoundException{
			int x = 0;
			int y = 0;
				scnr = new Scanner(f);
				while (scnr.hasNextLine()){
						//scnr.useDelimiter(" ");
						polyNum = scnr.next();
						System.out.println(polyNum);
						while (scnr.hasNext()){
							x = scnr.nextInt();
							System.out.println(x);
							y = scnr.nextInt();
							System.out.println(y);
							Term temp = new Term(x,y);
							array.add(temp);
						}
				break;
				}
		}
		
}
