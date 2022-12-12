
public class Toy {

	public static void main(String[] args) {
		
		ToyV car = new ToyV("Volvo", 3000);
		car.printData();
		
		
	}

}


class ToyV 
{
	
	public String name;
	public int weight;
	
	public ToyV() {
		
		this.name = " ";
		this.weight = 0;
		
	}
		
	public ToyV (String name, int weight) {
		this.name = name;
		this.weight = weight;
		
	}
	
	public void printData() {
		System.out.println("Brand: " + name);
		System.out.println("Weight: " + weight);
	}
	
}