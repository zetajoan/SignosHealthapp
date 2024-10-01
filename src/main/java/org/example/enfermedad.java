package org.example;

public class enfermedad {
    private String idEnfermedad;
    private String nombreEnfermedad;
    private String descripcionEnfermedad;
    private String sintomas;
    private double diasSintomas;
    private String tipoDeEnfermedad;
    private boolean enfermedadTerminal;
    private boolean enfermedadCronica;
    private String tratamientoRecomendado;
    private String riesgo;

    public enfermedad() {

    }

    public enfermedad(java.lang.String idEnfermedad, java.lang.String nombreEnfermedad, java.lang.String descripcionEnfermedad, java.lang.String sintomas, double diasSintomas, java.lang.String tipoDeEnfermedad, boolean enfermedadTerminal, boolean enfermedadCronica, java.lang.String tratamientoRecomendado, java.lang.String riesgo) {
        this.idEnfermedad = idEnfermedad;
        this.nombreEnfermedad = nombreEnfermedad;
        this.descripcionEnfermedad = descripcionEnfermedad;
        this.sintomas = sintomas;
        this.diasSintomas = diasSintomas;
        this.tipoDeEnfermedad = tipoDeEnfermedad;
        this.enfermedadTerminal = enfermedadTerminal;
        this.enfermedadCronica = enfermedadCronica;
        this.tratamientoRecomendado = tratamientoRecomendado;
        this.riesgo = riesgo;
    }

    public java.lang.String getIdEnfermedad() {
        return idEnfermedad;
    }

    public void setIdEnfermedad(java.lang.String idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }

    public java.lang.String getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    public void setNombreEnfermedad(java.lang.String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public java.lang.String getDescripcionEnfermedad() {
        return descripcionEnfermedad;
    }

    public void setDescripcionEnfermedad(java.lang.String descripcionEnfermedad) {
        this.descripcionEnfermedad = descripcionEnfermedad;
    }

    public java.lang.String getSintomas() {
        return sintomas;
    }

    public void setSintomas(java.lang.String sintomas) {
        this.sintomas = sintomas;
    }

    public double getDiasSintomas() {
        return diasSintomas;
    }

    public void setDiasSintomas(double diasSintomas) {
        this.diasSintomas = diasSintomas;
    }

    public java.lang.String getTipoDeEnfermedad() {
        return tipoDeEnfermedad;
    }

    public void setTipoDeEnfermedad(java.lang.String tipoDeEnfermedad) {
        this.tipoDeEnfermedad = tipoDeEnfermedad;
    }

    public boolean isEnfermedadTerminal() {
        return enfermedadTerminal;
    }

    public void setEnfermedadTerminal(boolean enfermedadTerminal) {
        this.enfermedadTerminal = enfermedadTerminal;
    }

    public boolean isEnfermedadCronica() {
        return enfermedadCronica;
    }

    public void setEnfermedadCronica(boolean enfermedadCronica) {
        this.enfermedadCronica = enfermedadCronica;
    }

    public java.lang.String getTratamientoRecomendado() {
        return tratamientoRecomendado;
    }

    public void setTratamientoRecomendado(java.lang.String tratamientoRecomendado) {
        this.tratamientoRecomendado = tratamientoRecomendado;
    }

    public java.lang.String getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(java.lang.String riesgo) {
        this.riesgo = riesgo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "enfermedad{" +
                "idEnfermedad=" + idEnfermedad +
                ", nombreEnfermedad=" + nombreEnfermedad +
                ", descripcionEnfermedad=" + descripcionEnfermedad +
                ", sintomas=" + sintomas +
                ", diasSintomas=" + diasSintomas +
                ", tipoDeEnfermedad=" + tipoDeEnfermedad +
                ", enfermedadTerminal=" + enfermedadTerminal +
                ", enfermedadCronica=" + enfermedadCronica +
                ", tratamientoRecomendado=" + tratamientoRecomendado +
                ", riesgo=" + riesgo +
                '}';
    }
}
