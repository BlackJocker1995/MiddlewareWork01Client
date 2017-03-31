
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DataService extends Remote
{
	public double getData() throws RemoteException ;

	public void CreateTable(String table_name);// Crate table named "table_name"

	public void Insert(String name,int score);// insert one element

	public int Search(String name);// search the score from table
}
