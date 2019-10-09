
package olimpiadas;

import java.util.Date;


class Atletismo extends Olimpiadas{
    private int kmRecorridos;
    private int velocidadMedia;
    private String nombreParticipante;

    public Atletismo(int kmRecorridos, int velocidadMedia, String nombreParticipante, int numeroDeParticipantes, int numeroDeMedallas, Atletismo nombreDeLasOlimpiadas, Date fechaDeInicio, int numeroDeCompetencias, boolean hayCompetencia) {
        super(numeroDeParticipantes, numeroDeMedallas, nombreDeLasOlimpiadas, fechaDeInicio, numeroDeCompetencias, hayCompetencia);
        this.kmRecorridos = kmRecorridos;
        this.velocidadMedia = velocidadMedia;
        this.nombreParticipante = nombreParticipante;
    }
    
    public void estadisticaFinal(int distancia){
        this.kmRecorridos += distancia;
    }
    
    public void estadisticaFinal(int distancia, int velocidad){
        this.kmRecorridos += distancia;
        this.velocidadMedia += velocidad;
    }


    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public int getVelocidadMedia() {
        return velocidadMedia;
    }

    public void setVelocidadMedia(int velocidadMedia) {
        this.velocidadMedia = velocidadMedia;
    }

    public String getNombreParticipante() {
        return nombreParticipante;
    }

    public void setNombreParticipante(String nombreParticipante) {
        this.nombreParticipante = nombreParticipante;
    }

   

    
    
}
