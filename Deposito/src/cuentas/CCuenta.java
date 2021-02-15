package cuentas;
/**	
 * Clase que crea una cuenta
 * @author RYG
 *
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }
/**
 * 
 * @param nom Nombre
 * @param cue Cuenta
 * @param sal Saldo
 * @param tipo Tipo de interes
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
/**
 * 
 * @return devuelve saldo disponible
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * 
 * @param cantidad cantidad a ingresar
 * @throws Exception
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * 
 * @param cantidad retira cantidad
 * @throws Exception
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 * 
 * @return devuelve nombre
 */
	private String getNombre() {
		return nombre;
	}
/**
 * 
 * @param nombre establece nombre
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @return devuelve cuenta
 */
	private String getCuenta() {
		return cuenta;
	}
/**
 * 
 * @param establece cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * 
 * @return devuelve saldo
 */
	private double getSaldo() {
		return saldo;
	}
/**
 * 
 * @param saldo establece saldo
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * 
 * @return devuelve tipo de interes
 */
	private double getTipoInteres() {
		return tipoInteres;
	}
/**
 * 
 * @param tipoInteres establece tipo de interes
 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
