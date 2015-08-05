
public class Output {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Hej");
		int c=10; 
		switch(c)
		{
			case 10:
			System.out.println("Podano 10");
			break;
			case 11:
			System.out.println("Podano 11");
		}

	}
	
	
	
	private int getMax(int tab[]){
		int max=tab[0];
		for(int i=1; i<tab.length-1; i++)
		if(max<tab[i])max=tab[i];
			
		return max;
	
	}

}
class nowa{
	
}
