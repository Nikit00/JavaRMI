import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICarro extends Remote {
   public String busca(String nome) throws RemoteException;
   public String adiciona(String nome) throws RemoteException;
}
