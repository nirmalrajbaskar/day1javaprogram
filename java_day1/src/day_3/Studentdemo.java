package day_3;

public class Studentdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation_student s1=new Encapsulation_student();
		s1.setSid(102);
		s1.setSname("raja");
		s1.setCity("chennai");
		
		System.out.println("student id:"+s1.getSid());
		System.out.println("student name:"+s1.getSname());
		System.out.println("student city:"+s1.getCity());
		System.out.println(s1);
		

	}

}
