/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresasalones;

/**
 *
 * @author Johan Castillo
 */
public class DatosEmpresa {
    private String nombreEmpresa;
	private String nit;
	private String telEmpresa;
	private String nombreRepresentante;
	private String cedula;
	private String telrepresentante;
	private String sector;
	private String salon;
        private String pocentaje;
        private String ss;

    public DatosEmpresa(String nombreEmpresa, String nit, String telEmpresa, String nombreRepresentante, String cedula, String telrepresentante, String sector, String salon,String porcen) {
        this.nombreEmpresa = nombreEmpresa;
        this.nit = nit;
        this.telEmpresa = telEmpresa;
        this.nombreRepresentante = nombreRepresentante;
        this.cedula = cedula;
        this.telrepresentante = telrepresentante;
        this.sector = sector;
        this.salon = salon;
        this.pocentaje = porcen;
    }

    public DatosEmpresa() {
    }

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }
    public DatosEmpresa(String porcentaje){
    }

    public String getPocentaje() {
        return pocentaje;
    }

    public void setPocentaje(String pocentaje) {
        this.pocentaje = pocentaje;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelEmpresa() {
        return telEmpresa;
    }

    public void setTelEmpresa(String telEmpresa) {
        this.telEmpresa = telEmpresa;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelrepresentante() {
        return telrepresentante;
    }

    public void setTelrepresentante(String telrepresentante) {
        this.telrepresentante = telrepresentante;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

   

    
    
}
