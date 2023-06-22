package snackbar1;
import Conexao.Conexao;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static java.nio.file.Files.list;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.sql.SQLException;
import java.util.Scanner;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.list;

/**
 *
 * @author Pedro Malaquias
 */
public class SnackBar1 {

    
    public static void main(String[] args)  throws SQLException  {

        Conexao dao = new Conexao();
        dao.connect();
        List<Prato> list = new ArrayList<>();
        double preco = 0;
        double ValorTotal = 0;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("--------- Bem vindo ao Snack Bar ------------");
        System.out.println("Nome: ");
        String nome = input.nextLine();
        System.out.println("Endereco: ");
        String endereco = input.nextLine();
        System.out.println("Contacto: ");
        String contacto = input.nextLine();
        System.out.println("Email: ");
        String email = input.nextLine();
        
        Cliente cliente = new Cliente(nome,endereco,contacto,email)
            
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

            String molho = null,cobertura = null;
            String tiposal = null; String massa = null;
            String recheio = null,  tipoSal  ;


                        //Menu  Pizza
      
        switch (menu) {
            case 1 -> {
                
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
                            cobertura = " Atum ";
                        }
                        case 2 -> {
                            cobertura = " Baicon ";
                        }
                        case 3 -> {
                            cobertura = " Chouriço ";
                        }
                        default -> {
                            cobertura = " Escolha Inválida ";
                        }
                    }
                } else {
                    cobertura = " Sem Cobertura ";
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
                                molho=" Mustarda ";
                            }
                            case 2 -> {
                                molho= " Maionese";
                            }
                            case 3 -> {
                                  molho=" Ketchup ";
                            }
                            case 4 -> {
                                 molho= "Todos os Molhos";
                                break;
                            }
                            default -> {
                                 molho = " Escolha Inválida ";

                            }

                        }
                        infor += molho;
                        System.out.println("Escolhas: " + infor);
                        System.out.println("Deseja continuar? ");
                        System.out.print(" Sim [s] / Não [n]");

                        resposta = input.next().charAt(0);
                    } while (resposta == 's');

                } else {
                    
                    molho = " Todos Molhos ";
                    System.out.println("Você escolheu todos os molhos");
                    System.out.println("""
                                       Molhos escolhido
                                       1- Mustarda
                                       2- Maionese
                                       3- Ketchup                                     
                                       """);
                }  

                 Prato prato = new Pizza(cobertura, molho);  
                 list.add(prato);
                 preco = 1500;
                   
            }
            
                        //Menu Salgadinho
            
            case 2 -> 
                
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
                            recheio = " Atum ";
                        }
                        case 2 -> {
                             recheio = " Baicon ";
                        }
                        case 3 -> {
                             recheio = " Chouriço";
                        }
                        default -> {
                             recheio = "  Escolha Inválida ";
                        }
                    }
                } else {

                    recheio = " Sem Recheio ";
                    System.out.println("Você não escolheu o recheio ");

                }

                System.out.println(" Que tipo de Salgadinho você quer? ");
                System.out.println(" 1- Frito");
                System.out.println(" 2-Assado ");
                
                int tipoSalgadinho = input.nextInt();

                switch (tipoSalgadinho) {

                    case 1 -> {
                        tipoSal = " 1- Frito ";

                    }
                    case 2 -> {
                        tipoSal = " 2- Assado ";
                    }               
                    default -> {
                        tipoSal = "Escolha Invalida";

                    }
                }
                
                     //Tipo de Massa - Salgadinho
                
                System.out.println(" Digite o tipo de Massa que você deseja:  ");
                System.out.println(" 1-Massa 1 ");
                System.out.println(" 2-Massa 2");
                System.out.println(" 3-Massa 3");
                
               int  tipoMassa = input.nextInt();
                
                switch (tipoMassa) {
                        
                   case 1 -> {
                        massa = " 1- Massa 1 ";

                    }
                    case 2 -> {
                       massa =" 2- Massa 2 ";
                    }
                    case 3 -> {
                       massa = " 3- Massa 3 ";
                    }
                    default -> {
                       massa = " Escolha Inválida ";
 
                    }
                }
              preco=1000;
              Prato prato = new Salgadinho(tiposal,massa);
              list.add(prato);
                
            }
               
                    // Menu Lanche
            
            case 3 -> {

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
                    tipopao = " Pao Cacete";
                    }
                    case 2 -> {
                        tipopao= " Pao Francês ";
                    }
                    case 3 -> {
                       tipopao= " Pao Italiano";
                    }
                    default -> {
                        tipopao= "Escolha Inválida";

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
                          tipomolho = " Mustarda ";
                        }
                        case 2 -> { 
                            tipomolho= " Maionese ";
                        }
                        case 3 -> {
                             tipomolho= " Ketchup ";
                        }
                        case 4 -> {
                             tipomolho= "Todos os Molhos";
                        }
                        default -> {
                             tipomolho = "Escolha Inválida";

                        }
                    }
                    
                    infor += tipomolho;
                    System.out.println("Escolhas: " + infor);
                    System.out.println("Deseja continuar? ");
                    System.out.println(" Sim [s] / Não [n]");
                    resposta = input.next().charAt(0);
                    
                } while (resposta == 's');
                
                System.out.println("");
                Prato prato = new Lanche(tipopao,tipomolho);
                 list.add(prato);
                 preco=3000;
            }

        }
            ValorTotal=+preco;
            System.out.println("Total a pagar "+ ValorTotal);
            System.out.println(" O seu pedido foi efectuado");
            System.out.println("-------------------------------------------");
        System.out.println("Deseja fazer um novo pedido? ");
            System.out.println(" Sim [s] / Não [n]");
           resp = input.next().charAt(0);
        
        } while( resp == 's' );

             gerarFactura(nome,email,contacto,endereco,list,ValorTotal);
    }
    
    private static void gerarFactura(String nome,String email, String contacto, 
            String endereco,List<Prato> list,double ValorTotal) {

         String path = "C:\\Users\\Pedro Malaquias\\Documents\\Programação\\SnackBar1.txt";

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
				bw.write("FACTURA/RECIBO:\n");
				bw.newLine();
				bw.write(" Nome do cliente:"+ nome );
				bw.newLine();
				bw.write("E-mail:"+ email);
				bw.newLine();
				bw.write("Contacto: "+contacto);
                                bw.newLine();
                                bw.write("Endereco:"+ endereco);
				bw.newLine();
                                for (Prato prato: list) {
                                bw.write("Prato:" + prato.toString());
				bw.newLine();
                            }
                                bw.write("Valor Total:" + ValorTotal);

			} catch (IOException e) {
				System.out.println("Error" + e.getMessage());
			}

    }
      
} 

