import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends ObjectClass {
    public Server() {}
    public static void main(String[] args) {
        try {
            ObjectClass obj = new ObjectClass();
            ObjectInterface stub = (ObjectInterface) UnicastRemoteObject.exportObject(obj, 0);

            Registry registry = LocateRegistry.getRegistry();
            registry.bind('serverStatus', stub);                
        } catch(RemoteException re) {
            System.err.println(re.toString());
        }
        
    }
}