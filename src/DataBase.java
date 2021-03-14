
public class DataBase {
	private static DataBase instance;
	private String str;
	private DataBase() {
		
	}
	public static DataBase getItstance() {
		return instance;
	}
	public void setString(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
}
