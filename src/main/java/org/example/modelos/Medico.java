package org.example.modelos;

public class Medico {

    private String idMedico;
    private String nombreMedico;
    private String especialidad;
    private String emailMedico;
    private String telefonoMedico;
    private String ciudadMedico;
    private String paisMedico;
    private double añosExperiencia;
    private boolean disponible;
    private boolean aceptaNuevosPacientes;
    private String tipoConsultorio;
    private double tarifaConsulta;
    private boolean certificadoActivo;
    private double cantidadPacientes;
    private String gradoAcademico;

    public Medico() {
    }

    public Medico(java.lang.String idMedico, java.lang.String nombreMedico, java.lang.String especialidad, java.lang.String emailMedico, java.lang.String telefonoMedico, java.lang.String ciudadMedico, java.lang.String paisMedico, double añosExperiencia, boolean disponible, boolean aceptaNuevosPacientes, java.lang.String tipoConsultorio, double tarifaConsulta, boolean certificadoActivo, double cantidadPacientes, java.lang.String gradoAcademico) {
        this.idMedico = idMedico;
        this.nombreMedico = nombreMedico;
        this.especialidad = especialidad;
        this.emailMedico = emailMedico;
        this.telefonoMedico = telefonoMedico;
        this.ciudadMedico = ciudadMedico;
        this.paisMedico = paisMedico;
        this.añosExperiencia = añosExperiencia;
        this.disponible = disponible;
        this.aceptaNuevosPacientes = aceptaNuevosPacientes;
        this.tipoConsultorio = tipoConsultorio;
        this.tarifaConsulta = tarifaConsulta;
        this.certificadoActivo = certificadoActivo;
        this.cantidadPacientes = cantidadPacientes;
        this.gradoAcademico = gradoAcademico;
    }

    public java.lang.String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(java.lang.String idMedico) {
        this.idMedico = idMedico;
    }

    public java.lang.String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(java.lang.String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public java.lang.String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(java.lang.String especialidad) {
        this.especialidad = especialidad;
    }

    public java.lang.String getEmailMedico() {
        return emailMedico;
    }

    public void setEmailMedico(java.lang.String emailMedico) {
        this.emailMedico = emailMedico;
    }

    public java.lang.String getTelefonoMedico() {
        return telefonoMedico;
    }

    public void setTelefonoMedico(java.lang.String telefonoMedico) {
        this.telefonoMedico = telefonoMedico;
    }

    public java.lang.String getCiudadMedico() {
        return ciudadMedico;
    }

    public void setCiudadMedico(java.lang.String ciudadMedico) {
        this.ciudadMedico = ciudadMedico;
    }

    public java.lang.String getPaisMedico() {
        return paisMedico;
    }

    public void setPaisMedico(java.lang.String paisMedico) {
        this.paisMedico = paisMedico;
    }

    public double getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(double añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isAceptaNuevosPacientes() {
        return aceptaNuevosPacientes;
    }

    public void setAceptaNuevosPacientes(boolean aceptaNuevosPacientes) {
        this.aceptaNuevosPacientes = aceptaNuevosPacientes;
    }

    public java.lang.String getTipoConsultorio() {
        return tipoConsultorio;
    }

    public void setTipoConsultorio(java.lang.String tipoConsultorio) {
        this.tipoConsultorio = tipoConsultorio;
    }

    public double getTarifaConsulta() {
        return tarifaConsulta;
    }

    public void setTarifaConsulta(double tarifaConsulta) {
        this.tarifaConsulta = tarifaConsulta;
    }

    public boolean isCertificadoActivo() {
        return certificadoActivo;
    }

    public void setCertificadoActivo(boolean certificadoActivo) {
        this.certificadoActivo = certificadoActivo;
    }

    public double getCantidadPacientes() {
        return cantidadPacientes;
    }

    public void setCantidadPacientes(double cantidadPacientes) {
        this.cantidadPacientes = cantidadPacientes;
    }

    public java.lang.String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(java.lang.String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Medico{" +
                "idMedico=" + idMedico +
                ", nombreMedico=" + nombreMedico +
                ", especialidad=" + especialidad +
                ", emailMedico=" + emailMedico +
                ", telefonoMedico=" + telefonoMedico +
                ", ciudadMedico=" + ciudadMedico +
                ", paisMedico=" + paisMedico +
                ", añosExperiencia=" + añosExperiencia +
                ", disponible=" + disponible +
                ", aceptaNuevosPacientes=" + aceptaNuevosPacientes +
                ", tipoConsultorio=" + tipoConsultorio +
                ", tarifaConsulta=" + tarifaConsulta +
                ", certificadoActivo=" + certificadoActivo +
                ", cantidadPacientes=" + cantidadPacientes +
                ", gradoAcademico=" + gradoAcademico +
                '}';
    }
}
