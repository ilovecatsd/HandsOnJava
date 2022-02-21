package feb14;

public class Employee {
	String name;
	int i;
	int salary;
	int experience; 
	String skillSet;
	
	//methods
	
	void name(String name)
	{
		System.out.println("Hi "+name);
	}
    void salary(int salary)
    {
    	System.out.println("Your salary is: "+salary);	
    }
    void experience(int experience)
    {
    	System.out.println("Your experience is: "+experience);	
    }
    void skillSet(String skillSet)
    {
    	System.out.println("Your killset is: "+skillSet);
    }
}
