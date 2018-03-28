
public class PersonSet {
	private Person[] person;
	private int PersonCount;
	
	PersonSet(){
		person = new Person[30];// create a new Array
	}
	
	public void addPerson(Person hum){// to add a person
//		System.out.println("add Person:"+hum.getName());
		person[PersonCount] = hum;
	}
	
	public void deleteHum(String name) {//to delete a person
		System.out.println("delete Person"+name);
		
		for(int i=0;i<PersonCount;i++){
			if(person[i].getName().equals(name)){
				for(int j=i;j<PersonCount;j++){
					if(j<PersonCount-1){
						person[j]=person[j+1];
					}else{
						person[j]=null;
					}
				}
				PersonCount--;
				break;
			}
		}
	}

	public void alterPer(String name,Person per) {// a method for alter
		System.out.println("alter a person"+name);
		for(int i=0;i<PersonCount;i++){
			if(person[i].getName().equals(name)){
				person[i]=per;
			}
		}
	}

	public void showPerAll() {// to show all people
		System.out.println("search all person");
		for(int i=0;i<PersonCount;i++){
			System.out.println(person[i].toString());
		}
	}
	
	public void selectPer(String name) {// to select  a person
		System.out.println("\n search the information of student"+name);
		for(int i=0;i<PersonCount;i++){
			if(person[i].getName().equals(name)){
					System.out.println(person[i].toString());
			}
		}
	}
}

