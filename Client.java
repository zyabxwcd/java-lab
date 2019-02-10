import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Client {
    private Client() { }
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry();
            ObjectInterface stub = (ObjectInterface) registry.lookup('serverStatus');
            System.out.println(stub.sayHello());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}