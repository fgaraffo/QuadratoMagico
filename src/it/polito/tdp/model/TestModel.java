package it.polito.tdp.model;

import java.util.List;

public class TestModel {

	public static void main(String[] args) {
		
		Model m = new Model();
		
		List <Quadrato> quadrati = m.findMagicSquare(3);
		
		for (Quadrato q : quadrati)
			System.out.println(q);
			
		
	}

}
