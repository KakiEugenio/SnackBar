
package snackbar1;

/**
 *
 * @author Pedro Malaquias
 */
public class Salgadinho extends Prato {
    
      private String tipoSal;
    private String massa;

    public String getTipoSal() {
        return tipoSal;
    }

    @Override
    public void setTipoSal(String tipoSal) {
        this.tipoSal = tipoSal;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }
    
}
