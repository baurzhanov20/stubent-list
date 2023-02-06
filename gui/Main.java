public class Main{
	
	public static MainFrame frame;
	public static AddStudent[] studentList = new AddStudent[100];
	public static int sizeOfArray = 0;
	public static void main(String[] args) {
		
		frame = new MainFrame();
		frame.setVisible(true);
	
	}

	public static void addStudent(AddStudent st){
		studentList[sizeOfArray] = st;
		sizeOfArray++;
	}

	

	
}