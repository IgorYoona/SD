package agriculturamachinebook;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;
import server.Client;
import thrift.Edge;
import thrift.Vertex;

/**
 *
 * @author Livionildo
 */
public class AgriculturaMachineBook{
    
    Scanner entrada = new Scanner(System.in);
    int flagLogin = 0;
    int flagMenu = 0;
    Client client = new Client();
    
    //Para leitura do usu�rio/senha
    int id;
    String nome;
    int senha;
    int opcao;  
               
    //Para administrar o conte�do
    Map<Integer,Vertex> hashVerticesId;
    Map<String,Edge> hashArestasId;
    Map<String,Vertex> hashVerticesPessoas;
    Map<String,Vertex> hashVerticesMaquinas;
    Collection<Vertex> colecaoVertices;
    
    public void RodaRede() throws InterruptedException, IOException, TException{ 
        converteMap();
        
        do{      
            System.out.println("==============================================================================");
            System.out.println("Seja bem vindo � maior comunidade de adoradors de m�quinas agr�colas do mundo!");
            System.out.println("==============================================================================");
            System.out.println("Fa�a o login");
            System.out.print("Nome:");
            nome = entrada.nextLine();
            System.out.print("Senha:");
            senha = entrada.nextInt();
            entrada.nextLine();
            System.out.println("==============================================================================");
            
            if(hashVerticesPessoas.containsKey(nome)){
                if(hashVerticesPessoas.get(nome).getColor() == senha){
                    do{
                        this.id = hashVerticesPessoas.get(nome).getName();
                        System.out.println("Ol� "+nome+", o que voc� gostaria de fazer?");         
                        System.out.println("==============================================================================");
                        System.out.println("1) Procurar pessoas"); 
                        System.out.println("2) Listar amigos"); 
                        System.out.println("3) Adicionar amigo"); 
                        System.out.println("4) Procurar m�quinas agr�colas");
                        System.out.println("5) Listar minhas m�quinas agr�colas");
                        System.out.println("6) Adicionar m�quina agr�cola");
                        System.out.println("7) Sair");
                        System.out.println("==============================================================================");
                        opcao = entrada.nextInt(); 
                        entrada.nextLine();
                        System.out.println("==============================================================================");


                        switch(opcao){
                            case 1:
                                System.out.println("F�s de m�quinas agr�colas:");
                                System.out.println("==============================================================================");
                                Set<String> keysP = hashVerticesPessoas.keySet();
                                    for(String chave: keysP)
                                        System.out.println(chave);                                   
                                System.out.println("==============================================================================");
                                break;
                                
                            case 2:
                                System.out.println("Lista de amigos:");
                                System.out.println("==============================================================================");
                                client.open();
                                Map<Integer,Vertex> vizinhos = client.getService().getAdjacentVertices(id);                           
                                client.close();
                                if(!vizinhos.isEmpty()){
                                    Set<Integer> keys = hashVerticesId.keySet();
                                        for(Integer chave: keys){
                                            if(vizinhos.get(chave).getWeight() == 1.0)
                                                System.out.println(vizinhos.get(chave).getDescription());              
                                        } 
                                }else{System.out.println("==============================================================================");
                                    System.out.println("Voc� n�o tem amigos, seu fracassado.");
                                    System.out.println("==============================================================================");
                                }
                                break;
                                
                            case 3:
                                String amigo;
                                int idamigo;
                                
                                System.out.println("Adicionar amigo:");
                                System.out.println("==============================================================================");
                                System.out.println("Informe o nome da pessoa");
                                amigo = entrada.nextLine();
                                if(hashVerticesPessoas.containsKey(amigo)){
                                    idamigo = hashVerticesPessoas.get(amigo).getName();
                                    client.open();
                                    client.getService().addEdge(id, idamigo, "oi", 1.0, 1);
                                    client.close();
                                    
                                }else{
                                    System.out.println("==============================================================================");
                                    System.out.println("N�o existe pessoa com esse nome.");
                                }
                                break;

                            case 4:
                                System.out.println("Modelos de m�quinas agr�colas:");
                                System.out.println("==============================================================================");
                                if(!hashVerticesMaquinas.isEmpty()){
                                    Set<String> keysM = hashVerticesMaquinas.keySet();
                                    for(String chave: keysM)
                                        System.out.println(chave);  
                                }else{
                                    System.out.println("N�o existem m�quinas argr�cola no momento");
                                }
                                System.out.println("==============================================================================");
                                break;
                                
                            case 5:
                                System.out.println("Lista de m�quinas agr�colas:");
                                System.out.println("==============================================================================");
                                client.open();
                                Map<Integer,Vertex> maquinas = client.getService().getAdjacentVertices(id);
                                client.close();
                                Set<Integer> keys2 = hashVerticesId.keySet();
                                    for(Integer chave: keys2){
                                        if(maquinas.get(chave).getWeight() != 1.0)
                                            System.out.println(maquinas.get(chave).getDescription());              
                                    }                               
                                break;
                            
                            case 6:
                                String maquina;
                                int idmaquina;
                                
                                System.out.println("Adicionar m�quina agr�cola:");
                                System.out.println("==============================================================================");
                                System.out.println("Informe o nome da M�quina");
                                maquina = entrada.nextLine();
                                if(hashVerticesMaquinas.containsKey(maquina)){                      
                                    idmaquina = hashVerticesPessoas.get(maquina).getName();
                                    client.open();
                                    client.getService().addEdge(id, idmaquina, "oi", 1.0, 1);
                                    client.close();
                                    
                                }else{
                                    System.out.println("==============================================================================");
                                    System.out.println("N�o existe pessoa com esse nome.");
                                }
                                break;
                                
                            case 7:
                                System.out.println("Volte sempre!");
                                System.out.println("==============================================================================");
                                flagLogin = -1;
                                flagMenu = -1;
                                break;

                            default:
                                System.out.println("Op��o inv�lida!");
                                System.out.println("==============================================================================");
                                break;
                        }
                    }while(flagMenu == 0);
                }else{
                    System.out.println("Senha incorreta!");
                    
                }               
            }else{
                System.out.println("Usu�rio n�o cadastrado!");
            }              
        }while(flagLogin==0);
    }

    public AgriculturaMachineBook(Client c) throws TTransportException, TException{
        this.client = c;
        
        client.open();
        hashVerticesId = client.getService().getAllRingVertices();
        hashArestasId = client.getService().getAllRingEdges();
        
        hashVerticesPessoas = new HashMap<String,Vertex>();
        hashVerticesMaquinas = new HashMap<String,Vertex>();
        
        client.close();
    }
    
    public void converteMap(){      
               
        Set<Integer> keys = hashVerticesId.keySet();
         
        for(Integer chave: keys){
            if(hashVerticesId.get(chave).getWeight() == 1.0){
                hashVerticesPessoas.put(hashVerticesId.get(chave).getDescription(),hashVerticesId.get(chave)); 
            }else{
                hashVerticesMaquinas.put(hashVerticesId.get(chave).getDescription(),hashVerticesId.get(chave)); 
            }
        }
    }
}
