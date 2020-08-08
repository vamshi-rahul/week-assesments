package traineeAssignment;
import java.util.HashMap;

import java.util.HashSet;

import java.util.Map;

import java.util.Set;
public class TraineeMain {
	 Map<Integer, Trainee> map = new HashMap<>();

	    Set<CSTrainee> cStraineeSet = new HashSet<>();

	    Set<ECETrainee> eceTrainees = new HashSet<>();



	    public static void main(String[] args) {

	        TraineeMain Traineedemo = new TraineeMain();

	        Traineedemo.runApp();

	    }



	    public void runApp() {

	        Trainee trainee1 = new CSTrainee(1,"Rahul","java");

	        Trainee trainee2 = new CSTrainee(2, "pranay", "python");

	        Trainee trainee3 = new ECETrainee(3, "Neeraj", "diode");

	        Trainee trainee4 = new ECETrainee(4, "Harish", "PI");

	        map.put(trainee1.getId(), trainee1);

	        map.put(trainee2.getId(), trainee2);

	        map.put(trainee3.getId(), trainee3);

	        map.put(trainee4.getId(), trainee4);

	        for (Trainee trainee : map.values()) {

	            Trainee typeTrainee = (Trainee) trainee;

	            boolean iscse = typeTrainee instanceof CSTrainee;

	            if (iscse) {

	                cStraineeSet.add((CSTrainee) typeTrainee);

	            } else {

	                eceTrainees.add((ECETrainee) typeTrainee);

	            }

	        }

	        System.out.println("DISPLAYING CSE TRAINEES");

	        for(CSTrainee csset:cStraineeSet)

	        {

	            int id=csset.getId();

	            String language=csset.getLang();

	            String name=csset.getName();

	        System.out.println("The name="+name+" Id="+id+" Languages="+language);

	        }



	        System.out.println("DISPLAYING ECE TRAINEES");

	        for(ECETrainee eceset:eceTrainees)

	        {

	            int id=eceset.getId();

	            String devices=eceset.getDeviceUsed();

	            String name=eceset.getName();

	            System.out.println("The name="+name+" Id="+id+" devices="+devices);

	        }



	    }

	}
	
