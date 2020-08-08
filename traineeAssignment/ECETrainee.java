package traineeAssignment;

public class ECETrainee extends Trainee{
	private String deviceUsed;
	public  Trainee(int id,String name,String deviceUsed) {
		super(id,name);
		this.deviceUsed=deviceUsed;
	}
	public String getDeviceUsed() {
		return deviceUsed;
	}
	public void setDeviceUsed(String deviceUsed) {
		this.deviceUsed = deviceUsed;
	}
	

}
