import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ObjectInterface implements Remote {
    public String sayHello() throws RemoteException;
}