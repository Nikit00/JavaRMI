import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ClienteBusca {
    public static void main (String[] args) throws Exception {
    	
    	try {
    		ICarro car = (ICarro) Naming.lookup("rmi://192.168.0.108/servidorcar");
    		while (true) {
    			Scanner ler = new Scanner(System.in);
    			System.out.println("Digite o nome do veiculo para buscar: ");
    			String veiculo = ler.next();
			System.out.println(car.busca(veiculo));
    			//break;
    		}
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    
    }
}
