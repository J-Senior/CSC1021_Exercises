package Practical7;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class StudentNames{
	public static void main(String[] args){
    
		int numStudents = 0;
		int index = 0;
		Map<String,String> studentNames = new HashMap<String,String>();
		
		String[] split = new String[1];
    	Scanner s = new Scanner( System.in );
    	Scanner students = new Scanner(System.in);
    	
    	System.out.print( "Enter number of students:" );
    	numStudents = students.nextInt();
    	
    	String[] names = new String[numStudents];
    
    	for( int i = 0; i < numStudents; i++ ){
        	System.out.print( "Enter student name and surname:" );
        	names[i] = s.nextLine();
        	split = names[i].split(" ");
        	studentNames.put(split[0], split[1]);
    	}
    	
    	System.out.print("--------------------------------------------------------\n");
    	System.out.print("Please enter a first name or a student number: ");
    	
    	String input = s.nextLine();
    	try{
    		
    		index = Integer.parseInt(input);
    		System.out.println(names[index-1]);
    		
    	} catch (RuntimeException a){
    		
    		System.out.println(studentNames.get(input));
    	}
    	

	}
}

/*	Task 2
public class StudentNames{
    public static void main(String[] args){
        String[] names = new String[5];
        Scanner s = new Scanner( System.in );
        for( int i = 0; i < 5; i++ ){
            System.out.println( "Enter student name:" );
            names[ i ] = s.next();
        }
        System.out.println( Arrays.toString( names ) );
    }
}*/

/*	Task 4
public class StudentNames{
	public static void main(String[] args){
    
		int numStudents = 8;
		String[] names = new String[numStudents];
    	Scanner s = new Scanner( System.in );
    
    	for( int i = 0; i < numStudents; i++ ){
        	System.out.println( "Enter student name:" );
        	names[ i ] = s.next();
    	}
    	System.out.println( Arrays.toString( names ) );
    	System.out.println("1st student: " + names[0]);
    	System.out.println("3rd student: " + names[2]);
    	System.out.println("8th student: " + names[7]);
	}
}*/

/*	Task 5
public class StudentNames{
	public static void main(String[] args){
    
		int numStudents = 8;
		String[] names = new String[numStudents];
    	Scanner s = new Scanner( System.in );
    
    	for( int i = 0; i < numStudents; i++ ){
        	System.out.println( "Enter student name:" );
        	names[ i ] = s.next();
    	}
    	
    	for( int i = 0; i < numStudents; i++){
    		System.out.println("Student " + (i+1) + ": " + names[i]);
    	}
	}
}*/

/*	Task 6
public class StudentNames{
	public static void main(String[] args){
    
		int numStudents = 8;
		int userSelection = 0;
		String[] names = new String[numStudents];
    	Scanner s = new Scanner( System.in );
    
    	for( int i = 0; i < numStudents; i++ ){
        	System.out.println( "Enter student name:" );
        	names[ i ] = s.next();
    	}
    	
    	System.out.print("\nPlease enter the number of the student you would like to see: ");
    	userSelection = s.nextInt();
    	System.out.println("Student " + userSelection + ": " + names[userSelection-1]);
	}
}*/


/*public class StudentNames{
	public static void main(String[] args){
    
		int numStudents = 8;
		int userSelection = 0;
		boolean exception = true;
		String[] names = new String[numStudents];
    	Scanner s = new Scanner( System.in );
    
    	for( int i = 0; i < numStudents; i++ ){
        	System.out.println( "Enter student name:" );
        	names[ i ] = s.next();
    	}
    	
    	System.out.print("\nPlease enter the number of the student you would like to see: ");
    	
    	while(exception){
			try{
				userSelection = s.nextInt();
				if((userSelection > 0) && (userSelection <= numStudents)){
					exception = false;
				}
				if(exception){
					System.out.print("Please enter a valid input: ");
				}
			} catch (Exception a) {
				System.out.print("Please enter a valid input: ");
				s.next();
			}
		}

    	System.out.println("Student " + userSelection + ": " + names[userSelection-1]);
	}
}*/