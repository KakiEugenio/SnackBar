
package snackbar1;

/**
 *
 * @author Pedro Malaquias
 */
public class Prato {
    
     private String dataVal, recheio;
    private float peso;
    private float  preco;

    
     //Métodos Especiais
    
    public String getDataVal() {
        return dataVal;
    }

    public void setDataVal(String dataVal) {
        this.dataVal = dataVal;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    public String getRecheio(){
        return recheio;
    }
    public void setRecheio(String recheio){
       
        this.recheio = recheio;
    }
    
    //Métodos Abstratos
     
    public static float calcularPreco(){
        
        return 0;
    }

    void setCobertura(String cobertura_1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setTipoSal(String tipo_1Salgadinho) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setMassa(String tipo_1Salgadinho) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
