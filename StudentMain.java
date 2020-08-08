package Assignment4;

import java.util.*;
public class StudentMain {
 Map<String,Student> map = new TreeMap<>();
	public static void main(String args[]) {
		StudentMain demo= new StudentMain();
		demo.runapp();
		}
	public void runapp() {
		Student student1=new Student("AS345",20);
		map.put("AS345", student1);
		Student student2=new Student("AS367",26);
		map.put("AS367", student2);
		Student student3=new Student("AS367",26);
		map.put("AS364", student3);
		Student student4=new Student("AS367",26);
		map.put("AS369", student4);
		
		Set<String> keys = map.keySet();

		for (String  i: keys) {

			Student stu = map.get(i);



			List<String> r = new ArrayList();

			r.add(map. getRollno());



			if (stu.getAge() % 2 == 0) {

				List<Student> le = new ArrayList();

				le.add(map.get(i));



			} else {

				List<Student> lo = new ArrayList();

				lo.add(map.get(i));

			}



		}



	}



}
