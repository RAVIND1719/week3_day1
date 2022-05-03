package studentInformation;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student id is : " + " " + id);

	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student id is : " + " " + id);
		System.out.println("Student Name is : " + " " + name);
	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student Email id is : " + " " + email);
		System.out.println("Student Phone number is : " + " " + phoneNumber);
	}

	public static void main(String[] args) {
		Students studentInfo = new Students();
		studentInfo.getStudentInfo(20063427);
		studentInfo.getStudentInfo(20063427, "Ravindranath N");
		studentInfo.getStudentInfo("ravind88@gmail.com", 9345347153L);

	}
}
