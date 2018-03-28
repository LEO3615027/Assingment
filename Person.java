
public abstract class Person {
	String name;
	String general;
	int age;
	
	
	Person(){}//Construct with empty
	Person(String name, String general, int age) {//Construct ,easy to build up a new Object of human
		this.name = name;
		this.general = general;
		this.age = age;
	}
	
	public String toString(){//The method to show all information
		return "Adult [name=" + name + ", age=" + age + ", General=" + general + "]";
	}
	
	//Following method is about general set and get
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGeneral() {
		return general;
	}

	public void setGeneral(String general) {
		this.general = general;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}