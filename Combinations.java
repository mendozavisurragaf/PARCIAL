/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author LaboratorioFISI
 */
public class Combinations {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
		Combinations combinations = new Combinations();
		int n = 5;
                int i=0;
		System.out.println("# Ladder's steps: " + n);
		System.out.println("# Step combinations: " + combinations.countCombinations(n, 0));
                
                System.out.println("# Ladder's steps: OPTIMIZADO " + n);
		System.out.println("# Step combinations: OPTIMIZADO " + combinations.resultado(n));
	}

	public long countCombinations(int n, int level) {
		if (n < 0) {
			return 0;
		}
		if (n == 0 && level == 0) {
			return 0;
		}
		if (n == 0 && level > 0) {
			return 1;
		}
		return countCombinations(n - 1, level + 1) + countCombinations(n - 2, level + 1)
				+ countCombinations(n - 3, level + 1);
	}
        
        
        	public long countCombinationsOPTI(int n) {
                   long result=0;
                   long level;
                   long acumula=0;
                for (level = 0; level <= n; level++) {
                  //      for (j = 0; j < M; j++) {
                  //s=s+1;
                 acumula= acumula+1;
                   
                 }
                return acumula;
               } 
                
                public long resultado(int n) {   
                return countCombinationsOPTI(n - 1) + countCombinationsOPTI(n - 2)+ countCombinationsOPTI(n - 3);
	
	}
}










