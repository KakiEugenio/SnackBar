
package snackbar1;

/**
 *
 * @author Pedro Malaquias
 */
public class Pedido {
    
      
    private String item_Consumido;
    private float taxa_servico;

    //Métodos Especiais
    
    

    public String getItem_Consumido() {
        return item_Consumido;
    }

    public void setItem_Consumido(String item_Consumido) {
        this.item_Consumido = item_Consumido;
    }

    public float getTaxa_servico() {
        return taxa_servico;
    }

    public void setTaxa_servico(float taxa_servico) {
        this.taxa_servico = taxa_servico;
    }
    
    //Métodos Abstratos
    
    public void facturaRecibo(){
        
    }
   
    public static int troco(){
        
        return 0 ;
    }
    
}
