import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class Carro extends UnicastRemoteObject implements ICarro {
    
    public Carro() throws RemoteException{}
    
            String[] vetor = {"Gol", "Saveiro", "Up", "Amarok", "Polo", "Celta", "Strada", "Hb20", "Ranger", "Hilux", "S10", "Jetta", "Corolla", "T-cross", "Creta", "Toro"};
    
    public String adiciona(String nome) throws RemoteException{
    	int z=0;
    	int y=0;
    	
    	for (y=0; y<vetor.length; y++){
    		z=y;
    	}
    	vetor[z] = nome;
    	
    	return "Veiculo Adicionado no indice "+z +" do vetor";    
    }
    
    
    public String busca(String nome) throws RemoteException{

        int i;
        int x=0;
                
        for (i=0; i<vetor.length; i++){
            if (vetor[i].equals(nome)){
                
                System.out.println("Carro encontrado no indice do vetor: " +i);
		nome = "Carro encontrado no indice "+i +" do vetor";		
              	x = 1;  
            } else {
		
		//nome = "Nao encontrado.";
                System.out.println("Nao encontrado.");
            }
        }
        
        if (x==0){
        	return "Veiculo nao encontrado...";
        }
        
        else {
        	return nome;
        
        }
        
    }
}
