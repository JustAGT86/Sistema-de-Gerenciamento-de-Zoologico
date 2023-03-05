import java.util.Scanner;

import DAO.GirafaDAO;
import DAO.OrnitorrincoDAO;
import DAO.PavaoDAO;
import DAO.TucanoDAO;
import Especie.Animais.Girafa;
import Especie.Animais.Ornitorrinco;
import Especie.Animais.Pavao;
import Especie.Animais.Tucano;
public class Main {

    public static int retornaAnimal(Scanner input){
        System.out.println("1-Girafa");
        System.out.println("2-Ornitorrinco");
        System.out.println("3-Pavão");
        System.out.println("4-Tucano");
        int escolheAnimal=input.nextInt();

        return escolheAnimal;
    }
    public static void main(String[] args) {

        GirafaDAO girafaDAO = new GirafaDAO();
        OrnitorrincoDAO ornitorrincoDAO = new OrnitorrincoDAO();
        PavaoDAO pavaoDAO = new PavaoDAO();
        TucanoDAO tucanoDAO = new TucanoDAO();
        Scanner input = new Scanner(System.in);
        int opcao;
        int id;
        
        
        do{
            System.out.println("1-Criar um animal");
            System.out.println("2-Alterar info de algum animal");
            System.out.println("3-Deletar animal");
            System.out.println("4-Imprimir as caracteristicas de um animal");
            System.out.println("-1 para finalizar o programa");
            opcao=input.nextInt();
            if(opcao==1){
                System.out.println("Selecione um animal para criar:");
                int escolheAnimal=retornaAnimal(input);

                if(escolheAnimal==1){
                    System.out.println("O animal escolhido foi a girafa");
                    System.out.print("Digite o número de identificação: ");
                    int numIdentifica=input.nextInt();
                    System.out.print("Digite o número da gaiola: ");
                    int numGaiola=input.nextInt();
                    System.out.print("Está em extinção(true/false): ");
                    boolean extincao=input.nextBoolean();
                    System.out.print("Qual a altura do Animal: ");
                    int altura=input.nextInt();
                    System.out.print("Qual o tamanho do pescoço do animal: ");
                    double pescoco=input.nextDouble();
        
                    Girafa novaGirafa= new Girafa("amarelo", 4, "herbivoro", numIdentifica, numGaiola, extincao, altura, pescoco );
                    girafaDAO.insert(novaGirafa);

                }

                if(escolheAnimal==2){
                    System.out.println("O animal escolhido foi o ornitorrinco");
                    System.out.print("Digite o número de identificação: ");
                    int numIdentifica=input.nextInt();
                    System.out.print("Digite o número da gaiola: ");
                    int numGaiola=input.nextInt();
                    System.out.print("Está em extinção(true/false): ");
                    boolean extincao=input.nextBoolean();
        
                    Ornitorrinco novoOrnitorrinco= new Ornitorrinco("marrom", 4, "Carnivoro", numIdentifica, numGaiola, extincao);
                    ornitorrincoDAO.insert(novoOrnitorrinco);
                }

                if(escolheAnimal==3){
                    System.out.println("O animal escolhido foi o pavão");
                    System.out.print("Digite a cor da pena: ");
                    String corPena=input.next();
                    System.out.print("Digite a distancia de voo: ");
                    Double distanciaVoo=input.nextDouble();
                    System.out.print("Digite o número de identificação: ");
                    int numIdentifica=input.nextInt();
                    System.out.print("Digite o número da gaiola: ");
                    int numGaiola=input.nextInt();
                    System.out.print("Está em extinção(true/false): ");
                    boolean extincao=input.nextBoolean();
                    System.out.print("é macho?(true/false)");
                    boolean sexo=input.nextBoolean();
        
                    Pavao novoPavao= new Pavao(true, corPena, "carnivoro", distanciaVoo, numIdentifica, numGaiola, extincao, sexo);
                    pavaoDAO.insert(novoPavao);
                    
                }

                if(escolheAnimal==4){
                    System.out.println("O animal escolhido foi o tucano");
                    System.out.print("Digite a cor da pena: ");
                    String corPena=input.next();
                    System.out.print("Digite a distancia de voo: ");
                    Double distanciaVoo=input.nextDouble();
                    System.out.print("Digite o número de identificação: ");
                    int numIdentifica=input.nextInt();
                    System.out.print("Digite o número da gaiola: ");
                    int numGaiola=input.nextInt();
                    System.out.print("Está em extinção(true/false): ");
                    boolean extincao=input.nextBoolean();
                    System.out.print("Qual a cor do bico: ");
                    String corBico=input.next();
        
                    Tucano novoTucano= new Tucano(true, corPena, "carnivoro", distanciaVoo, numIdentifica, numGaiola, extincao, corBico);
                    tucanoDAO.insert(novoTucano);
                    
                }
            }

            if(opcao==2){
                System.out.println("Selecione um animal para alterar as informações:");
                int escolheAnimal=retornaAnimal(input);
                
                if(escolheAnimal==1){
                    System.out.println("Qual o ID:");
                    id=input.nextInt();
                    
                    System.out.println("O animal escolhido foi a girafa");
                    System.out.print("Digite o número da gaiola: ");
                    int numGaiola=input.nextInt();
                    System.out.print("Está em extinção(true/false): ");
                    boolean extincao=input.nextBoolean();
                    System.out.print("Qual a altura do Animal: ");
                    int altura=input.nextInt();
                    System.out.print("Qual o tamanho do pescoço do animal: ");
                    double pescoco=input.nextDouble();
        
                    Girafa novaGirafa= new Girafa("amarelo", 4, "herbivoro", id, numGaiola, extincao, altura, pescoco );
                    girafaDAO.insert(novaGirafa);
                    boolean confirma=girafaDAO.update(novaGirafa);
                    if(confirma){
                        System.out.println("As informaçoes foram alteradas");
                    }
                    
                }

                if(escolheAnimal==2){
                    System.out.println("Qual o ID:");
                    id=input.nextInt();

                    System.out.println("O animal escolhido foi o ornitorrinco");
                    System.out.print("Digite o número da gaiola: ");
                    int numGaiola=input.nextInt();
                    System.out.print("Está em extinção(true/false): ");
                    boolean extincao=input.nextBoolean();
        
                    Ornitorrinco novoOrnitorrinco= new Ornitorrinco("marrom", 4, "Carnivoro", id, numGaiola, extincao);
                    ornitorrincoDAO.insert(novoOrnitorrinco);
                    boolean confirma=ornitorrincoDAO.update(novoOrnitorrinco);
                    if(confirma){
                        System.out.println("As informaçoes foram alteradas");
                    }
                }

                if(escolheAnimal==3){
                    System.out.println("Qual o ID:");
                    id=input.nextInt();

                    System.out.println("O animal escolhido foi o pavão");
                    System.out.print("Digite a cor da pena: ");
                    String corPena=input.next();
                    System.out.print("Digite a distancia de voo: ");
                    Double distanciaVoo=input.nextDouble();
                    System.out.print("Digite o número da gaiola: ");
                    int numGaiola=input.nextInt();
                    System.out.print("Está em extinção(true/false): ");
                    boolean extincao=input.nextBoolean();
                    System.out.print("é macho?(true/false)");
                    boolean sexo=input.nextBoolean();
        
                    Pavao novoPavao= new Pavao(true, corPena, "carnivoro", distanciaVoo, id, numGaiola, extincao, sexo);
                    pavaoDAO.insert(novoPavao);
                    boolean confirma=pavaoDAO.update(novoPavao);
                    if(confirma){
                        System.out.println("As informaçoes foram alteradas");
                    }
                    
                }

                if(escolheAnimal==4){
                    System.out.println("Digite a ID do tucano:");
                    id=input.nextInt();

                    System.out.println("O animal escolhido foi o tucano");
                    System.out.print("Digite a cor da pena: ");
                    String corPena=input.next();
                    System.out.print("Digite a distancia de voo: ");
                    Double distanciaVoo=input.nextDouble();
                    System.out.print("Digite o número da gaiola: ");
                    int numGaiola=input.nextInt();
                    System.out.print("Está em extinção(true/false): ");
                    boolean extincao=input.nextBoolean();
                    System.out.print("Qual a cor do bico: ");
                    String corBico=input.next();
        
                    Tucano novoTucano= new Tucano(true, corPena, "carnivoro", distanciaVoo, id, numGaiola, extincao, corBico);
                    novoTucano.setNumeroIdentificacao(id);
                    boolean confirma=tucanoDAO.update(novoTucano);
                    if(confirma){
                        System.out.println("As informaçoes foram alteradas");
                    }
                    
                }
            }

            if(opcao==3){
                System.out.println("Selecione um animal para deletar as informações:");
                int escolheAnimal=retornaAnimal(input);
                
                if(escolheAnimal==1){
                    System.out.println("Qual o ID:");
                    id=input.nextInt();
                    girafaDAO.delete(id);
                }

                if(escolheAnimal==2){
                    System.out.println("Qual o ID:");
                    id=input.nextInt();
                    ornitorrincoDAO.delete(id);
                }

                if(escolheAnimal==3){
                    System.out.println("Qual o ID:");
                    id=input.nextInt();
                    pavaoDAO.delete(id);
                    
                }

                if(escolheAnimal==4){
                    System.out.println("Qual o ID:");
                    id=input.nextInt();
                    tucanoDAO.delete(id);
                }
            }
            

            if(opcao==4){
                System.out.println("Selecione um animal para imprimir as informações:");
                int escolheAnimal=retornaAnimal(input);

                if(escolheAnimal==1){
                    System.out.println("Qual o ID:");
                    id=input.nextInt();
                    girafaDAO.select(id);

                }

                if(escolheAnimal==2){
                    System.out.println("Qual o ID:");
                    id=input.nextInt();
                    ornitorrincoDAO.select(id);
                }
                
                if(escolheAnimal==3){
                    System.out.println("Qual o ID:");
                    id=input.nextInt();
                    pavaoDAO.select(id);
                }

                if(escolheAnimal==4){
                    System.out.println("Qual o ID:");
                    id=input.nextInt();
                    tucanoDAO.select(id);
                }

            }

            else if(opcao!=-1){
                System.out.println("Digite um número valido ");
            }
        }while(opcao!=-1);

    }
}