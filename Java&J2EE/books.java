// Java program to illustrate 
// Java.util.HashMap 

import java.util.HashMap; 
import java.util.Map; 
import java.util.*; 

class amsam {

		HashMap<String, String> map = new HashMap<>();

		public amsam()
		{

		}

		public amsam(String title, String author, String price)
		{
			this.map.put("Title", title);
			this.map.put("Author", author);
			this.map.put("Price", price);
		}   

		public void print() 
			{ 
				if (map.isEmpty()) { 
					System.out.println("map is empty"); 
			} 

				else { 
					System.out.println(map); 
			} 
			} 

}


		/*void func1(){

		System.out.println("Size of map is:- "
						+ map.size()); 



		print(map); 
		if (map.containsKey("Title")) { 
			String a = map.get("Title"); 
			System.out.println("value for key"
							+ " \"Title\" is:- "
							+ a); 
		} 

		map.clear(); 
		print(map);
	}*/

	
	public class books {
		
		public static void main(String[] args) 
		{ 
			Scanner s = new Scanner(System.in);
			System.out.println("Enter author");
			String author = s.nextLine();
			System.out.println("Enter title");
			String title = s.nextLine();
			System.out.println("Enter price");
			String price = s.nextLine();
			amsam obj1 = new amsam(title,author,price);
			obj1.print(); 
		} 
}
