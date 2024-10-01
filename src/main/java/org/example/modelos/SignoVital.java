package org.example.modelos;

public class SignoVital {
    private String idSignoVital;
    private String idPaciente;               // ID del paciente asociado
    private double temperatura;               // Temperatura corporal en grados Celsius
    private double presionArterialSistolica; // Presión arterial sistólica
    private double presionArterialDiastolica; // Presión arterial diastólica
    private double frecuenciaCardiaca;       // Frecuencia cardíaca en latidos por minuto
    private double frecuenciaRespiratoria;    // Frecuencia respiratoria en respiraciones por minuto
    private double saturacionOxigeno;        // Saturación de oxígeno en porcentaje
    private double peso;                      // Peso del paciente en kilogramos
    private double estatura;


    public SignoVital() {
    }

    public SignoVital(java.lang.String idSignoVital, java.lang.String idPaciente, double temperatura, double presionArterialSistolica, double presionArterialDiastolica, double frecuenciaCardiaca, double frecuenciaRespiratoria, double saturacionOxigeno, double peso, double estatura) {
        this.idSignoVital = idSignoVital;
        this.idPaciente = idPaciente;
        this.temperatura = temperatura;
        this.presionArterialSistolica = presionArterialSistolica;
        this.presionArterialDiastolica = presionArterialDiastolica;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.saturacionOxigeno = saturacionOxigeno;
        this.peso = peso;
        this.estatura = estatura;
    }

    public java.lang.String getIdSignoVital() {
        return idSignoVital;
    }

    public void setIdSignoVital(java.lang.String idSignoVital) {
        this.idSignoVital = idSignoVital;
    }

    public java.lang.String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(java.lang.String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getPresionArterialSistolica() {
        return presionArterialSistolica;
    }

    public void setPresionArterialSistolica(double presionArterialSistolica) {
        this.presionArterialSistolica = presionArterialSistolica;
    }

    public double getPresionArterialDiastolica() {
        return presionArterialDiastolica;
    }

    public void setPresionArterialDiastolica(double presionArterialDiastolica) {
        this.presionArterialDiastolica = presionArterialDiastolica;
    }

    public double getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(double frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public double getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(double frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public double getSaturacionOxigeno() {
        return saturacionOxigeno;
    }

    public void setSaturacionOxigeno(double saturacionOxigeno) {
        this.saturacionOxigeno = saturacionOxigeno;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "SignoVital{" +
                "idSignoVital=" + idSignoVital +
                ", idPaciente=" + idPaciente +
                ", temperatura=" + temperatura +
                ", presionArterialSistolica=" + presionArterialSistolica +
                ", presionArterialDiastolica=" + presionArterialDiastolica +
                ", frecuenciaCardiaca=" + frecuenciaCardiaca +
                ", frecuenciaRespiratoria=" + frecuenciaRespiratoria +
                ", saturacionOxigeno=" + saturacionOxigeno +
                ", peso=" + peso +
                ", estatura=" + estatura +
                '}';
    }
}


