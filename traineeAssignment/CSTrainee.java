package traineeAssignment;

public class CSTrainee extends Trainee{
	private String lang;
	public  CSTrainee(int id,String name,String lang)
	{
		super(id,name);
		this.lang=lang;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	
}
 
