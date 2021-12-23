
public class UserDemo {
	public static void main(String[] args) {
		DatabasePersistence dp= new DatabasePersistence();
		dp.persistence();
		FilePersistence fp=new FilePersistence();
		fp.persistence();
		
	}
}
