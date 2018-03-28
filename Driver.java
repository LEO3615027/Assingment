
import java.util.Scanner;

public class Driver {
//	DataCollection data = new DataCollection();// for hard code
//	Relationship relaShip = new Relationship();// use as database
	private String[] _socialNet = new String[30];// set maximum of social network
	private String _relationList[][] = new String[30][30];// the maximum of fiends
	// private String string = "";// use as database

	public void display() {
		
		new WindowMenu();
		// while(x==1){ return x == 2}
		int x = 1;
		PersonSet pers = new PersonSet();
		
		pers.addPerson(new Adult("Alice","F",18));
		pers.addPerson(new Adult("Bob","M",20));
		pers.addPerson(new Adult("Cathy","F",21));
		pers.addPerson(new Adult("Don","M",24));
		while (true) {
			
//			relaShip.setList() = 
			Scanner keyborad = new Scanner(System.in);
			int inputInt = keyborad.nextInt();
			if (inputInt > 4) {// show error
				System.out.println("please insert the right number");
				new WindowMenu();
			} else if (inputInt == 1) {// show all people
				// a method for showAll
				pers.showPerAll();
			} else if (inputInt == 2) {// select a person
				System.out.println("please full name of a person you like");
				String inputString = keyborad.nextLine();
				pers.selectPer(inputString);
				// a method for select
				// show all person and than do option
				new WindowMenu(2);
				while(true){
					Scanner keyborad_2 = new Scanner(System.in);
					int inputInt_2 = keyborad_2.nextInt();
					FriendSet fdset = new FriendSet(inputString);
					if (inputInt > 6) {// show error
						System.out.println("please insert the right number");
						new WindowMenu(2);
					} else if (inputInt == 1) {//add a friend
						System.out.println("enter your friend name to add ");
						String inputInt_fdname = keyborad.nextLine();
						fdset.addFriend(inputInt_fdname);
					} else if (inputInt == 2) {//delete a friend
						
					} else if (inputInt == 3) {//search a friend
						
					} else if (inputInt == 4) {//set my stituation
						
					} else if (inputInt == 5) {//hide or show my situation
						
					}
				}
			} else if (inputInt == 3) {// are they in relationship?
				// a method for check relationship

			} else {
				// a method for quite 
				System.out.println("Thank you bye");
				break;
			}
		}

	}
}

