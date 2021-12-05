package november29th;

public class vehicle {

		String name;
		int wheeler;
		String color;
		int price;

		public static void main(String[] args) {
			
			
	      
			
			System.out.println("Truck obj initialize and Arguemnt Constructor");
			vehicle Truck = new vehicle ();
			Truck.setName("Mahindra");
			Truck.setWheeler(8);
			Truck.setColor(" Blue");
			Truck.setPrice(907000);
			System.out.println(Truck.getName());
			System.out.println(Truck.getWheeler());
			System.out.println(Truck.getColor());
			System.out.println(Truck.getPrice());
			
			
			
		// Car obj creation and calling setter and getter	
			System.out.println("car obj creation set and get");
			vehicle car = new vehicle();
			 car.setName("AMAZE");
			 car.setWheeler(4);
			 car.setColor("Grey");
			 car.setPrice(95000);
			 
			 
			 
		 System.out.println("Bike obj creation set and get");
			vehicle Bike = new vehicle();
			Bike.setName("ducati");
			Bike.setWheeler(2);
			Bike.setColor("Blue");
			Bike.setPrice(28000);
			
		
			
			 System.out.println(Bike.getName());  
			 System.out.println(Bike.getWheeler());  
			 System.out.println(Bike.getColor());  
			 System.out.println(Bike.getPrice());  
		
			 System.out.println(car.getName());
			 System.out.println(car.getWheeler());
			 System.out.println(car.getColor());
			 System.out.println(car.getPrice());
		
		}
	public String getName() {
		return name;
	}
	public int getWheeler() {
		return wheeler;
	}
	  
	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWheeler(int wheeler) {
		this.wheeler = wheeler;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(int price) {
		this.price = price;
	}




	vehicle(){
		this.name="default-name";
		this.wheeler=4;
		this.color="Blue";
		this.price=580000;
		System.out.println(this.name);
		System.out.println(this.wheeler);
	System.out.println(this.color);
	System.out.println(this.price);
	}


	  vehicle(String name, int wheeler , String color , int price) {
		this.name= name;
		this.wheeler= wheeler;
		this.color= color;
		this.price=price;
	  }

	}

