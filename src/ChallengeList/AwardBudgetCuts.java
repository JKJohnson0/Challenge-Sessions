package ChallengeList;
import java.io.*;
import java.util.*;
public class AwardBudgetCuts {
	
	  static double findGrantsCap(double[] grantsArray, double newBudget) {
		    // your code goes here
		    double cap = 0;
		    int n = 0;
		    int extra = 0;
		    int count = 0;
		    n = grantsArray.length;
		    
		    cap = newBudget/n;
		    for(int i = 0; i <= n-1; i++){
		      if(grantsArray[i] <= cap){
		         extra += grantsArray[i];
		         count++; 
		      }
		    }
		    newBudget = newBudget - extra;
		    cap = newBudget/n;
		    for(int i = 0; i <= n-1; i++){
		      if(grantsArray[i] > cap){
		        grantsArray[i] = cap;
		      }
		    }
		    return cap;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
