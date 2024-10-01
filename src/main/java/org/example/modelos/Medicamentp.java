package org.example.modelos;

public class Medicamentp {
    private String idMedicamento;
    private String nombreMedicamento;
    private String descripcion;
    private String principioActivo;
    private String formaFarmaceutica; // Tableta, jarabe, etc.
    private double dosisRecomendada;   // Dosis recomendada en mg o ml
    private String viaAdministracion;   // Oral, intravenosa, etc.
    private boolean recetaNecesaria;    // ¿Se necesita receta médica?
    private String efectosSecundarios;   // Posibles efectos secundarios
    private String contraindications;     // Contraindicaciones


    public Medicamentp() {


    }

    public Medicamentp(java.lang.String idMedicamento, java.lang.String nombreMedicamento, java.lang.String descripcion, java.lang.String principioActivo, java.lang.String formaFarmaceutica, double dosisRecomendada, java.lang.String viaAdministracion, boolean recetaNecesaria, java.lang.String efectosSecundarios, java.lang.String contraindications) {
        this.idMedicamento = idMedicamento;
        this.nombreMedicamento = nombreMedicamento;
        this.descripcion = descripcion;
        this.principioActivo = principioActivo;
        this.formaFarmaceutica = formaFarmaceutica;
        this.dosisRecomendada = dosisRecomendada;
        this.viaAdministracion = viaAdministracion;
        this.recetaNecesaria = recetaNecesaria;
        this.efectosSecundarios = efectosSecundarios;
        this.contraindications = contraindications;
    }

    public java.lang.String getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(java.lang.String idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public java.lang.String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(java.lang.String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public java.lang.String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }

    public java.lang.String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(java.lang.String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public java.lang.String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(java.lang.String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public double getDosisRecomendada() {
        return dosisRecomendada;
    }

    public void setDosisRecomendada(double dosisRecomendada) {
        this.dosisRecomendada = dosisRecomendada;
    }

    public java.lang.String getViaAdministracion() {
        return viaAdministracion;
    }

    public void setViaAdministracion(java.lang.String viaAdministracion) {
        this.viaAdministracion = viaAdministracion;
    }

    public boolean isRecetaNecesaria() {
        return recetaNecesaria;
    }

    public void setRecetaNecesaria(boolean recetaNecesaria) {
        this.recetaNecesaria = recetaNecesaria;
    }

    public java.lang.String getEfectosSecundarios() {
        return efectosSecundarios;
    }

    public void setEfectosSecundarios(java.lang.String efectosSecundarios) {
        this.efectosSecundarios = efectosSecundarios;
    }

    public java.lang.String getContraindications() {
        return contraindications;
    }

    public void setContraindications(java.lang.String contraindications) {
        this.contraindications = contraindications;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Medicamentp{" +
                "idMedicamento=" + idMedicamento +
                ", nombreMedicamento=" + nombreMedicamento +
                ", descripcion=" + descripcion +
                ", principioActivo=" + principioActivo +
                ", formaFarmaceutica=" + formaFarmaceutica +
                ", dosisRecomendada=" + dosisRecomendada +
                ", viaAdministracion=" + viaAdministracion +
                ", recetaNecesaria=" + recetaNecesaria +
                ", efectosSecundarios=" + efectosSecundarios +
                ", contraindications=" + contraindications +
                '}';
    }
}
