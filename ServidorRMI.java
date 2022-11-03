import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;

public class ServidorRMI {

    public static void main(String[] args){
    
    	System.setProperty("java.rmi.server.hostname","192.168.0.108");
    
        try {
            ICarro servidor = new Carro();          
            Naming.rebind("servidorcar", servidor);            
            System.out.println("Servidor no Ar, Aguardando...");
                       
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
