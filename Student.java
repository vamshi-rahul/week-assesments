package Assignment4;

public class Student {
		private String rollno;
		private int age;
		Student(String rollno,int age){
			this.rollno=rollno;
			this.age=age;
		}
		public String getRollno() {
			return rollno;
		}
		public void setRollno(String rollno) {
			this.rollno = rollno;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public int hashCode() {
			int hash=rollno.hashCode();
			return hash;
		}
		

		@Override
		public boolean equals(Object arg) {

			if (this == arg) {

				return true;

			}

			if (arg == null || !(arg instanceof Student)) {

				return false;

			}

			Student that = (Student) arg;

			boolean isequal = this.rollno.equals (that.rollno);

			return isequal;
		}

	}

