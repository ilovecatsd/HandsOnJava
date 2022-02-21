package feb14;
import java.util.ArrayList;

public class Cricket {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	public static void main(String[] args)
	{
		//String[][] cricketers = {"Virat Kholi""Batsman","Rohit Sharma""Batsman","Shardul Thakur","Hardik Pandya","Mayank Agarwal","Ravindra Jadeja","Ravi Bishnoi","Mohammed Shami","Bhuvneshwar Kumar","Yuzvendra Chahal","Kuldeep Yadav"};
        
		
		ArrayList<ArrayList<String>> cricketers = new ArrayList();
         
         ArrayList<String> Batsman = new ArrayList();
         
         Batsman.add("Virat Kholi");
         Batsman.add("Rohit Sharma");
         Batsman.add("Mayank Agarwal");
         Batsman.add("KedarJadhav");
         
         ArrayList<String> Bowlers = new ArrayList();
         
         Bowlers.add("Yuzvendra Chahal");
         Bowlers.add("Ravi Bishnoi");
         Bowlers.add("Mohammed Shami");
         Bowlers.add("SHardul Thakur");
         
         ArrayList<String> Wicket = new ArrayList();
         
         Wicket.add("MS Dhoni");
         Wicket.add("KL Rahul");
         Wicket.add("Rishabh Pant");
         Wicket.add("Hardik Pandya");
         
         
         cricketers.add(Batsman);
         cricketers.add(Bowlers);
         cricketers.add(Wicket);
         
         
        // System.out.println(cricketers);

         System.out.println("Batsmen :" + Batsman);
         System.out.println("Bowlers: " + Bowlers);
         System.out.println("Wicket-Keepers: " +Wicket );
         
         
         
         
         
         
         
         
         
         
         

	}

}
