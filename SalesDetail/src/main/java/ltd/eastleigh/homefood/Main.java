package ltd.eastleigh.homefood;

public class Main {
	public static void main(String[] args) {
		SalesDetail salesDetail = new SalesDetail();
		displayGreeting();
		salesDetail.currentSale();
		salesDetail.currentExpenses();
	}

	private static void displayGreeting() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to HomeFood Eastleigh Pvt Ltd");
	}
}
