
public class MainApp {	
	public static void main(String[] args) {		
		Study study = Study.getIntance();
		study.setCourse("역사");
		Debug.println(study.getCourse());
		
		Study study2 = Study.getIntance();
		study.setCourse("프로그래밍");
		Debug.println(study.getCourse());
		Debug.println(study2.getCourse());
		if(study == study2) {
			System.out.println("같은 객체 입니다.");
		}
	}
}
class Debug{
	public static final boolean isDebug = false;
	
	public static void println(String message) {
		if(isDebug)
			System.out.println(message);
	}
}
class Study{
	private static Study instance = null;
	private String course;
	private Study() {
		
	}	
	public static Study getIntance() {
		if(instance == null)
			instance = new Study();
		return instance;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		return "학생이 " + course + " 과목을 공부합니다. By 용석";
	}
}
