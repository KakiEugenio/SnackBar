
package snackbar1;
import java.util.Scanner;


/**
 *
 * @author Pedro Malaquias
 */
public class Cliente {
    
      private String nome_cliente;
    private String endereco, contacto, email;

    Scanner input = new Scanner (System.in); 
    public Cliente(String nome_cliente, String endereco, String contacto, String email) {
        this.nome_cliente = nome_cliente;
        this.endereco = endereco;
        this.contacto = contacto;
        this.email = email;
    } 
    
    
    
    public String getNome_cliente() {
        
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
        
    }

    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
