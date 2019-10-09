
package olimpiadas;

import java.util.Date;


class Natacion extends Olimpiadas{
    private boolean piscinaOlimpica;
    private boolean desgasteFisico ;
    private int gastoCalorias;

    public Natacion(boolean piscinaOlimpica, boolean desgasteFisico, int gastoCalorias, int numeroDeParticipantes, int numeroDeMedallas, Atletismo nombreDeLasOlimpiadas, Date fechaDeInicio, int numeroDeCompetencias, boolean hayCompetencia) {
        super(numeroDeParticipantes, numeroDeMedallas, nombreDeLasOlimpiadas, fechaDeInicio, numeroDeCompetencias, hayCompetencia);
        this.piscinaOlimpica = piscinaOlimpica;
        this.desgasteFisico = desgasteFisico;
        this.gastoCalorias = gastoCalorias;
    }
    
    public void mejorarSalud(){
        gastoCalorias += 500;
    }
    
    public void mejorarSalud(boolean mayor){
        this.gastoCalorias += 500;
        this.desgasteFisico = mayor;
        
    }

    public boolean isPiscinaOlimpica() {
        return piscinaOlimpica;
    }

    public void setPiscinaOlimpica(boolean piscinaOlimpica) {
        this.piscinaOlimpica = piscinaOlimpica;
    }

    public boolean getDesgasteFisico() {
        return desgasteFisico;
    }

    public void setDesgasteFisico(boolean desgasteFisico) {
        this.desgasteFisico = desgasteFisico;
    }

    public int getGastoCalorias() {
        return gastoCalorias;
    }

    public void setGastoCalorias(int gastoCalorias) {
        this.gastoCalorias = gastoCalorias;
    }
    
}
