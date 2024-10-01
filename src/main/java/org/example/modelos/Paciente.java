package org.example.modelos;

public class Paciente {

   private String idcliente;
   private String nombrecliente;
   private String gruposanguineo;
   private String emailcliente;
   private String telefonocliente;
   private String ciudadcliente;
   private String paiscliente;
   private double edadcliente;
   private double pesocliente;
   private double estaturacliente;
   private Boolean enfermedadcronica;
   private Boolean afiliadocliente;
   private Boolean tienediscapacidad;
   private Boolean esfumador;
   private Boolean tienehijos;

   public Paciente() {


   }

   public Paciente(java.lang.String idcliente, java.lang.String nombrecliente, java.lang.String gruposanguineo, java.lang.String emailcliente, java.lang.String telefonocliente, java.lang.String ciudadcliente, java.lang.String paiscliente, double edadcliente, double pesocliente, double estaturacliente, java.lang.Boolean enfermedadcronica, java.lang.Boolean afiliadocliente, java.lang.Boolean tienediscapacidad, java.lang.Boolean esfumador, java.lang.Boolean tienehijos) {
      this.idcliente = idcliente;
      this.nombrecliente = nombrecliente;
      this.gruposanguineo = gruposanguineo;
      this.emailcliente = emailcliente;
      this.telefonocliente = telefonocliente;
      this.ciudadcliente = ciudadcliente;
      this.paiscliente = paiscliente;
      this.edadcliente = edadcliente;
      this.pesocliente = pesocliente;
      this.estaturacliente = estaturacliente;
      this.enfermedadcronica = enfermedadcronica;
      this.afiliadocliente = afiliadocliente;
      this.tienediscapacidad = tienediscapacidad;
      this.esfumador = esfumador;
      this.tienehijos = tienehijos;
   }

   public java.lang.String getIdcliente() {
      return idcliente;
   }

   public void setIdcliente(java.lang.String idcliente) {
      this.idcliente = idcliente;
   }

   public java.lang.String getNombrecliente() {
      return nombrecliente;
   }

   public void setNombrecliente(java.lang.String nombrecliente) {
      this.nombrecliente = nombrecliente;
   }

   public java.lang.String getGruposanguineo() {
      return gruposanguineo;
   }

   public void setGruposanguineo(java.lang.String gruposanguineo) {
      this.gruposanguineo = gruposanguineo;
   }

   public java.lang.String getEmailcliente() {
      return emailcliente;
   }

   public void setEmailcliente(java.lang.String emailcliente) {
      this.emailcliente = emailcliente;
   }

   public java.lang.String getTelefonocliente() {
      return telefonocliente;
   }

   public void setTelefonocliente(java.lang.String telefonocliente) {
      this.telefonocliente = telefonocliente;
   }

   public java.lang.String getCiudadcliente() {
      return ciudadcliente;
   }

   public void setCiudadcliente(java.lang.String ciudadcliente) {
      this.ciudadcliente = ciudadcliente;
   }

   public java.lang.String getPaiscliente() {
      return paiscliente;
   }

   public void setPaiscliente(java.lang.String paiscliente) {
      this.paiscliente = paiscliente;
   }

   public double getEdadcliente() {
      return edadcliente;
   }

   public void setEdadcliente(double edadcliente) {
      this.edadcliente = edadcliente;
   }

   public double getPesocliente() {
      return pesocliente;
   }

   public void setPesocliente(double pesocliente) {
      this.pesocliente = pesocliente;
   }

   public double getEstaturacliente() {
      return estaturacliente;
   }

   public void setEstaturacliente(double estaturacliente) {
      this.estaturacliente = estaturacliente;
   }

   public java.lang.Boolean getEnfermedadcronica() {
      return enfermedadcronica;
   }

   public void setEnfermedadcronica(java.lang.Boolean enfermedadcronica) {
      this.enfermedadcronica = enfermedadcronica;
   }

   public java.lang.Boolean getAfiliadocliente() {
      return afiliadocliente;
   }

   public void setAfiliadocliente(java.lang.Boolean afiliadocliente) {
      this.afiliadocliente = afiliadocliente;
   }

   public java.lang.Boolean getTienediscapacidad() {
      return tienediscapacidad;
   }

   public void setTienediscapacidad(java.lang.Boolean tienediscapacidad) {
      this.tienediscapacidad = tienediscapacidad;
   }

   public java.lang.Boolean getEsfumador() {
      return esfumador;
   }

   public void setEsfumador(java.lang.Boolean esfumador) {
      this.esfumador = esfumador;
   }

   public java.lang.Boolean getTienehijos() {
      return tienehijos;
   }

   public void setTienehijos(java.lang.Boolean tienehijos) {
      this.tienehijos = tienehijos;
   }

   @java.lang.Override
   public java.lang.String toString() {
      return "Paciente{" +
              "idcliente=" + idcliente +
              ", nombrecliente=" + nombrecliente +
              ", gruposanguineo=" + gruposanguineo +
              ", emailcliente=" + emailcliente +
              ", telefonocliente=" + telefonocliente +
              ", ciudadcliente=" + ciudadcliente +
              ", paiscliente=" + paiscliente +
              ", edadcliente=" + edadcliente +
              ", pesocliente=" + pesocliente +
              ", estaturacliente=" + estaturacliente +
              ", enfermedadcronica=" + enfermedadcronica +
              ", afiliadocliente=" + afiliadocliente +
              ", tienediscapacidad=" + tienediscapacidad +
              ", esfumador=" + esfumador +
              ", tienehijos=" + tienehijos +
              '}';
   }
}