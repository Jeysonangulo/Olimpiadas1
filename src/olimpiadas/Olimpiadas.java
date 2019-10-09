
package olimpiadas;

import java.util.Date;


public class Olimpiadas {
    private int numeroDeParticipantes;
    private int numeroDeMedallas;
    private Atletismo nombreDeLasOlimpiadas;
    private Date fechaDeInicio;
    private int numeroDeCompetencias;
    private boolean hayCompetencia;

    public Olimpiadas(int numeroDeParticipantes, int numeroDeMedallas, Atletismo nombreDeLasOlimpiadas, Date fechaDeInicio, int numeroDeCompetencias, boolean hayCompetencia) {
        this.numeroDeParticipantes = numeroDeParticipantes;
        this.numeroDeMedallas = numeroDeMedallas;
        this.nombreDeLasOlimpiadas = nombreDeLasOlimpiadas;
        this.fechaDeInicio = fechaDeInicio;
        this.numeroDeCompetencias = numeroDeCompetencias;
        this.hayCompetencia = hayCompetencia;
    }
    
    public void eliminarParticipantes (){
        this.numeroDeParticipantes -=1;
    }
    
    public void entregaDeMedallas () {
        this.numeroDeMedallas -=4;
    }

    public int getNumeroDeParticipantes() {
        return numeroDeParticipantes;
    }

    public void setNumeroDeParticipantes(int numeroDeParticipantes) {
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    public int getNumeroDeMedallas() {
        return numeroDeMedallas;
    }

    public void setNumeroDeMedallas(int numeroDeMedallas) {
        this.numeroDeMedallas = numeroDeMedallas;
    }

    public Atletismo getNombreDeLasOlimpiadas() {
        return nombreDeLasOlimpiadas;
    }

    public void setNombreDeLasOlimpiadas(Atletismo nombreDeLasOlimpiadas) {
        this.nombreDeLasOlimpiadas = nombreDeLasOlimpiadas;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public int getNumeroDeCompetencias() {
        return numeroDeCompetencias;
    }

    public void setNumeroDeCompetencias(int numeroDeCompetencias) {
        this.numeroDeCompetencias = numeroDeCompetencias;
    }

    public boolean isHayCompetencia() {
        return hayCompetencia;
    }

    public void setHayCompetencia(boolean hayCompetencia) {
        this.hayCompetencia = hayCompetencia;
    }

    
    
    
}
