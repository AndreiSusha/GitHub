
public class Toy {

	public static void main(String[] args) {
		
		ToyV car = new ToyV("Volvo", 3000);
		car.printData();
		Specifications car1 = new Specifications("Black", 90);
		car1.printData();
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
class Specifications extends ToyV {
	public String color;
	public int model;
	
	public Specifications (String color, int model) {
		this.color = color;
		this.model = model;
	}
	
	public void printData() {
		System.out.println("Color: " + color);
		System.out.println("Model: EX" + model);
	}
}