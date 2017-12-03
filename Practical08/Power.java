package Practical8;

public class Power{


    public static void main(String[] args){
    	int x = 2;
    	
    	Power p = new Power();

    	System.out.println( x + " is: " + p.power(x, 1));
    	System.out.println( "The square of " + x + " is: " + p.power(x, 2));
        System.out.println( "The cube of " + x + " is: " + p.power(x, 3));
        System.out.println( "The hypercube of " + x + " is: " + p.power(x, 4));
        System.out.println( "The fith power of " + x + " is: " + p.power(x, 5));

    }
    
    public int power(int x, int n){
    	
    	if(n!=1){
    		x = x * power(x, (n-1));
    	}
    	
    	return x;
    }
}