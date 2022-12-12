
public class Toy {

	public static void main(String[] args) {
		
		
		
		
	}

}


class ToyW 
{
	
	public String name;
	public int weight;
	
	public ToyW() {
		
		this.name = " ";
		this.weight = 0;
		printData();
		
	}
		
	public ToyW (String name, int weight) {
		this.name = name;
		this.weight = weight;	
		printData();
		
	}
	
	public printData() {
		System.out.println("Brand: " + name);
		System.out.println("Weright: " + weight);
	}
	
}