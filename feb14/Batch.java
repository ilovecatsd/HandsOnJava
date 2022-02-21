package feb14;

import java.util.ArrayList;

public class Batch {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	public static void main(String[] args)
	
	{
		ArrayList<ArrayList<String>> batch_id = new ArrayList();
	
	ArrayList<String> year_2020 = new ArrayList();
      year_2020.add("NBH21");
      year_2020.add("HYT60");
      year_2020.add("BGY77");
     
      ArrayList<String> year_2021 = new ArrayList();
      year_2021.add("BHT65");
      year_2021.add("JHY49");
      year_2021.add("POH43");
      
      ArrayList<String> year_2022 = new ArrayList();
      
      year_2022.add("OUH12");
      year_2022.add("KJI21");
      year_2022.add("UYH11");
      
      
  batch_id.add(year_2020);
  batch_id.add(year_2021);
  batch_id.add(year_2022);
    		  
  System.out.println(year_2022);
	
		
}
}
