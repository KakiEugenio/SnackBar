package snackbar1;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Scanner;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro Malaquias
 */
public class SnackBar1 {

    
    public static void main(String[] args) {
    
     Scanner input = new Scanner(System.in);
     
      
        String nomeCl = "Sem Nome";

        List<String> dados = new ArrayList<>();
        String dataValidade = "";
        
        
        /*System.out.println("---------Bem vindo ao S N A C K    B A R-------------");
        System.out.println("Nome: ");
        String nome = input.nextLine();
        System.out.println("Endereco: ");
        String endereco = input.nextLine();
        System.out.println("Contacto: ");
        String contacto = input.nextLine();
        System.out.println("Email: ");
        String email = input.nextLine();
        
        Cliente p = new Cliente(nome,endereco,contacto,email);*/

        Prato prato;
        char resp;
        
        do {
    
        System.out.println(" Menu do Snack Bar ");
        System.out.println("""
                           [1] - Pizza
                           [2] - Salgadinho
                           [3] - Lanche
                           """);
        System.out.print("Faça a sua encomenda: ");
        int menu = input.nextInt();
        input.nextLine();

        //PRIMEIRO MENU - PIZZA
      
        switch (menu) {
            case 1 -> {
                   
                prato = new Pizza();

                System.out.println("Deseja uma cobertura recheada ? ");
                System.out.print("Sim[s] / Não[n]:");
                char respostaCobertura = input.next().charAt(0);

                if (respostaCobertura == 's') {
                    System.out.println("""
                                       Menu Recheio
                                       1- Atum
                                       2- Baicon
                                       3- Chouriço
                                       """);

                    int menuRecheio = input.nextInt();

                    switch (menuRecheio) {
                        case 1 -> {
                            prato.setRecheio(" Atum");
                        }
                        case 2 -> {
                            prato.setRecheio("Baicon");
                        }
                        case 3 -> {
                            prato.setRecheio("Chouriço");
                        }
                        default -> {
                            prato.setRecheio("Escolha Inválida");
                        }
                    }
                } else {
                    System.out.println(" Você não escolheu o recheio ");

                }
                // Faz com que o programa registe varios tipo de molho em simultanio ate adicionar 0

                String infor = "";
                char resposta;

                System.out.println("""
                                       Menu Molho
                                       Deseja todos os molhos? 
                                       Sim => s
                                       Não => n
                                       """);

                System.out.println("Deseja Todos os molhos? ");
                System.out.print("Sim[s] / Não[n]: ");
                char todosMolho = input.next().charAt(0);
                if (todosMolho != 's') {
                    do {

                        System.out.println(" Selecione o molho que você pretende");

                        System.out.println("""
                                       Menu Molho
                                       1- Mustarda
                                       2- Maionese
                                       3- Ketchup
                                       """);
                        
                     
                        int tipoMolho = input.nextInt();

                        switch (tipoMolho) {
                            case 1 -> {
                                prato.setRecheio(" Mustarda ");
                            }
                            case 2 -> {
                                prato.setRecheio(" Maionese ");
                            }
                            case 3 -> {
                                prato.setRecheio(" Ketchup ");
                            }
                            case 4 -> {
                                prato.setRecheio("Todos os Molhos");
                                break;
                            }
                            default -> {
                                prato.setRecheio("Escolha Inválida");

                            }

                        }
                        infor += prato.getRecheio();
                        System.out.println("Escolhas: " + infor);
                        System.out.println("Deseja continuar? ");
                        System.out.print(" Sim [s] / Não [n]");

                        resposta = input.next().charAt(0);
                    } while (resposta == 's');

                } else {
                    System.out.println("Você escolheu todos os molhos");
                    System.out.println("""
                                       Molhos escolhido
                                       1- Mustarda
                                       2- Maionese
                                       3- Ketchup                                     
                                       """);
                }  
                   
            }
            
                        //SEGUNDO MENU - SALGADINHOS
            
            case 2 -> {
                prato = new Salgadinho();
                
                 System.out.print("Deseja uma cobertura recheada? ");
                 System.out.println("Sim[s] / Não[n]:");
                char respostaCobertura = input.next().charAt(0);

                if (respostaCobertura == 's') {
                    System.out.println("""
                                       Menu Recheio
                                       1- Atum
                                       2- Baicon
                                       3- Chouriço
                                       """);

                    int menuRecheio = input.nextInt();

                    switch (menuRecheio) {
                        case 1 -> {
                            prato.setRecheio(" Atum");
                        }
                        case 2 -> {
                            prato.setRecheio(" Baicon ");
                        }
                        case 3 -> {
                            prato.setRecheio(" Chouriço");
                        }
                        default -> {
                            prato.setRecheio(" Escolha Inválida");
                        }
                    }
                } else {
                    System.out.println("Você não escolheu o recheio ");

                }

                System.out.println(" Que tipo de Salgadinho você quer? ");
                System.out.println(" 1- Frito");
                System.out.println(" 2-Assado ");
                
                int tipoSalgadinho = input.nextInt();

                switch (tipoSalgadinho) {
                    case 1 -> {
                        prato.setTipoSal(" 1- Frito ");

                    }
                    case 2 -> {
                        prato.setTipoSal(" 2- Assado ");
                    }               
                    default -> {
                        prato.setRecheio("Escolha Invalida");

                    }

                }
                
                     //Tipo de MASSA - Salgadinho
                
                System.out.println(" Digite o tipo de Massa que você deseja:  ");
                System.out.println(" 1-Massa 1 ");
                System.out.println(" 2-Massa 2");
                System.out.println(" 3-Massa 3");
                
               int  tipoMassa = input.nextInt();
                switch (tipoMassa) {
                    case 1 -> {
                        prato.setMassa(" 1- Massa 1");

                    }
                    case 2 -> {
                        prato.setMassa(" 2- Massa 2");
                    }
                    case 3 -> {
                        prato.setMassa(" 3- Massa 3");
                    }
                    default -> {
                        prato.setRecheio("Escolha Inválida");

                    }

                }

            }
            // MENU Lanche
            case 3 -> {

                prato = new Lanche();
                System.out.println(" Menu Lanche ");
                System.out.println(" Selecione  o tipo de pão que você prefere ");

                System.out.println("""
                                       Menu Pão
                                       1- Pão Cacete
                                       2- Pão Francês
                                       3- Pao Italiano
                                       """);

                int tipoPao = input.nextInt();

                switch (tipoPao) {
                    case 1 -> {
                        prato.setRecheio(" Pao Cacete");
                    }
                    case 2 -> {
                        prato.setRecheio(" Pao Francês ");
                    }
                    case 3 -> {
                        prato.setRecheio(" Pao Italiano");
                    }
                    default -> {
                        prato.setRecheio("Escolha Inválida");

                    }

                }
                String infor = "";
                char resposta;
                do {

                    System.out.println(" Selecione o molho que você pretende: ");

                    System.out.println("""
                                       Menu Molho
                                       1- Mustarda
                                       2- Maionese
                                       3- Ketchup
                                       """);

                    int tipoMolho = input.nextInt();

                    switch (tipoMolho) {
                        case 1 -> {
                            prato.setRecheio(" Mustarda ");
                        }
                        case 2 -> { 
                            prato.setRecheio(" Maionese ");
                        }
                        case 3 -> {
                            prato.setRecheio(" Ketchup ");
                        }
                        case 4 -> {
                            prato.setRecheio("Todos os Molhos");
                        }
                        default -> {
                            prato.setRecheio("Escolha Inválida");

                        }

                    }
                    infor += prato.getRecheio();
                    System.out.println("Escolhas: " + infor);
                    System.out.println("Deseja continuar? ");
                    System.out.println(" Sim [s] / Não [n]");
                    resposta = input.next().charAt(0);
                } while (resposta == 's');
 
                System.out.println("");

            }

        }
            System.out.println(" O seu pedido foi efectuado");
            System.out.println("-------------------------------------------");
        System.out.println("Deseja fazer um novo pedido? ");
            System.out.println(" Sim [s] / Não [n]");
           

                resp = input.next().charAt(0);
        } while( resp == 's' );
        
       
         String nomeDoArquivo = "SnackBar1.txt";
        String folder = "C:\\Users\\Pedro Malaquias\\Documents\\Programação";
        String path = folder + "/" + nomeDoArquivo;
         gerarFactura(nomeDoArquivo, path, dados);  
      
        
    
    }
    
    private static void gerarFactura(String nomeDoArquivo, String path, List<String> dados) {

        FileWriter stream;
        PrintWriter print;

        try {
            //stream é uma conexao de escrita para o arquivo
            stream = new FileWriter(path);
            //class PrintWriter vai escrever no arquivo
            print = new PrintWriter(stream);

            for (String linha : dados) {
                print.println(linha);
            }
            //fechar o arquivo
            stream.close();
            print.close();

            System.out.println("O arquivo " + nomeDoArquivo + " foi guardado na pasta " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
      
} 