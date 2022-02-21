package day2;

class Proteins{
    Proteins(){
    	System.out.println("10 g of Protein is available");
    }
    Proteins(int x){
    	System.out.println("20 g of Protein is available ");
    }
}

class SourceExtendProteins extends Proteins{
	SourceExtendProteins(){
    	System.out.println("Source :10 g of Protein is available");
    }
	SourceExtendProteins(int x){
		super();
    	System.out.println("Source :20 g of Protein is available ");
    }
}
public class MyProtein {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SourceExtendProteins obj1 =new SourceExtendProteins();
		SourceExtendProteins obj2 =new SourceExtendProteins(20);
	}

}