package pac1;

public class Person {
	public enum Gender {
		M('M'),
		F('F');

		private char gender;

		Gender(char g) {
			this.gender = g;
		}

		public char getValue() {
			return gender;
		}

		public static Gender fromChar(char c) {
			if (Character.toUpperCase(c) == 'M') return M;
			else if (Character.toUpperCase(c) == 'M') return F;
			else throw new IllegalArgumentException("Invalid gender.");
		}
	}

	String firstname;
	String lastname;
	Gender gender;
	int age;
	String weight;
	String phoneNumber;

	Person(String fname,String lname,char g, int a, String w, String pn)
	{
		firstname=fname;
		lastname=lname;
		gender = Gender.fromChar(g);
		age = a;
		weight = w;
		phoneNumber = pn;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = Gender.fromChar(gender);
	}

	public void showDetails() {
		System.out.println("Person Details");
        System.out.println("__________________");
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Gender: " + gender);
        System.out.println("Age: "+ age);
        System.out.println("Weight: " + weight);
        System.out.println("Phone number: " + phoneNumber);
	}
}