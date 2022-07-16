
package consola;


public class Nave {
    //Atributos
   protected String nombre;
    protected Double apogeo;
    protected Double peso;
    protected int añoDeNacimiento;
    protected String paisDeNacimiento;
    protected String enfoqueArtistico;
          
   
    //Constructor 

    public Nave(String nombre, Double apogeo, Double peso, int añoDeNacimiento, String paisDeNacimiento, String enfoqueArtistico) {
        this.nombre = nombre;
        this.apogeo = apogeo;
        this.peso = peso;
        this.añoDeNacimiento = añoDeNacimiento;
        this.paisDeNacimiento = paisDeNacimiento;
        this.enfoqueArtistico = enfoqueArtistico;
    }
                    
       
    // get and set

  public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getApogeo() {
        return apogeo;
    }

    public void setApogeo(Double apogeo) {
        this.apogeo = apogeo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getAñoDeNacimiento() {
        return añoDeNacimiento;
    }

    public void setAñoDeNacimiento(int añoDeNacimiento) {
        this.añoDeNacimiento = añoDeNacimiento;
    }

    public String getPaisDeNacimiento() {
        return paisDeNacimiento;
    }

    public void setPaisDeNacimiento(String paisDeNacimiento) {
        this.paisDeNacimiento = paisDeNacimiento;
    }

    public String getEnfoqueArtistico() {
        return enfoqueArtistico;
    }

    public void setEnfoqueArtistico(String enfoqueArtistico) {
        this.enfoqueArtistico = enfoqueArtistico;
    }

    @Override
    public String toString() {
        return "Nave{" + "nombre=" + nombre + ", apogeo=" + apogeo + ", peso=" + peso + ", a\u00f1oDeNacimiento=" + añoDeNacimiento + ", paisDeNacimiento=" + paisDeNacimiento + ", enfoqueArtistico=" + enfoqueArtistico + '}';
    }
    
    


}
