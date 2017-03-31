import java.rmi.*;
public class RmiHelloClient {
	public static void main(String[] args) {
		try {
			DataService ds = (DataService) Naming.lookup("//localhost:1100/ds");//load the class

			//ds.CreateTable("stu");
			//ds.Insert("rain",90);
			int score = ds.Search("rain");
			System.out.println(score);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
