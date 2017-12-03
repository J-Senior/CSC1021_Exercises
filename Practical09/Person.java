public class Person{

    String name = "Harry Potter";
    double height = 0;
    double weight = 0;
    double bmi = 0;


    public static void main(String[] args){
        Person p = new Person();
        p.setName("Steve");
        p.setHeight(0);
        p.setWeight(70);
        p.checkPositive();
        //p.addImperial();
        p.display();

    }
    
    public void setName(String name){
    	this.name = name;
    }
    
    public String getName(){
    	return name;
    }
    
    public void checkPositive(){
    	if((height <= 0) || (weight <= 0)){
    		throw new IllegalArgumentException();
    	}
    }

    public void setHeight(double height){
    	this.height = height;
    }
    
    public double getHeight(){
    	return height;
    }
    
    public void setWeight(double weight){
    	this.weight = weight;
    }
    
    public double getWeight(){
    	return weight;
    }
	
    public double bmi(){
    	bmi = (weight / height) / height;
    	return bmi;
    }
    
    public void addImperial(){
    	height = height * 0.0254;
    	weight = weight * 6.35029;
    }
    
    public String bmiStatus(){
    	String status = "Error";
    	if(bmi < 18.5){
    		status = "Underweight";
    	}
    	if((bmi >= 18.5) && (bmi <= 24.9)){
    		status = "Normal / Acceptable";
    	}
    	if((bmi >= 25) && (bmi <= 29.9)){
    		status = "Overweight";
    	}
    	if((bmi >= 30) && (bmi <= 39.9)){
    		status = "Medically Obese";
    	}
    	if(bmi >= 40){
    		status = "Extreme Obesity";
    	}
    	if(bmi == 0){
    		status = "Invalid Weight or Height";
    	}
    	
    	return status;
    }
    
    public String format(){
        return String.format( "Name:\t\t%s\nHeight:\t\t%.2f m\nWeight:\t\t%.2f kg\nBMI:\t\t%.2f\nBMI Status:\t%s\n", getName(), getHeight(), getWeight(), bmi(), bmiStatus() );
    }

    public void display(){
        System.out.println( format() );
    }
}