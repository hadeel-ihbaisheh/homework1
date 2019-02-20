package shoop;



	import java.util.ArrayList;

	public class hwTest {
	public static int count=0;
	public static int price=0;
	public static ArrayList<Integer>books= new ArrayList<Integer>();

	public void addbook(int p) {
		books.add(p);
		count=books.size();
		price=price+p;
		
	}
	}
