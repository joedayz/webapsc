package ferro.model;

// Generated 01/04/2015 01:23:15 PM by Hibernate Tools 3.6.0

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * ApscCliente generated by hbm2java
 */
@Entity
@Table(name = "APSC_CLIENTE", schema="ERP"
/*"dbo"
,catalog="ERP"*/)
public class ApscCliente implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idCliente;
	private String cdCliente;
	private String ruc;
	private String dni;
	private String rsocial;
	private String tdoc;
	private String ndoc;
	private String nomCli;
	private String apePat;
	private String apeMat;
	private String ubigeo;
	private String dirClie;
	private String numCel1;
	private String numCel2;
	private String numCel3;
	private String telf1;
	private String telf2;
	private String emailClie;
	private Date fecReg;
	private Date fecMod;
	private String usuReg;
	private String usuMod;
	private Boolean estado;

	// nomapeado
	@Transient
	private String nombreTotal;

	public ApscCliente() {
	}

	public ApscCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public ApscCliente(long idCliente, String cdCliente, String ruc,
			String dni, String rsocial, String tdoc, String ndoc,
			String nomCli, String apePat, String apeMat, String ubigeo,
			String dirClie, String numCel1, String numCel2, String numCel3,
			String telf1, String telf2, String emailClie, Date fecReg,
			Date fecMod, String usuReg, String usuMod, Boolean estado,
			String nombreTotal) {
		this.idCliente = idCliente;
		this.cdCliente = cdCliente;
		this.ruc = ruc;
		this.dni = dni;
		this.rsocial = rsocial;
		this.tdoc = tdoc;
		this.ndoc = ndoc;
		this.nomCli = nomCli;
		this.apePat = apePat;
		this.apeMat = apeMat;
		this.ubigeo = ubigeo;
		this.dirClie = dirClie;
		this.numCel1 = numCel1;
		this.numCel2 = numCel2;
		this.numCel3 = numCel3;
		this.telf1 = telf1;
		this.telf2 = telf2;
		this.emailClie = emailClie;
		this.fecReg = fecReg;
		this.fecMod = fecMod;
		this.usuReg = usuReg;
		this.usuMod = usuMod;
		this.estado = estado;
		this.nombreTotal = nombreTotal;
	}

	@Id
	@Column(name = "ID_CLIENTE", unique = true, nullable = false)
	public long getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	@Column(name = "CD_CLIENTE", length = 16)
	public String getCdCliente() {
		return this.cdCliente;
	}

	public void setCdCliente(String cdCliente) {
		this.cdCliente = cdCliente;
	}

	@Column(name = "RUC", length = 32)
	public String getRuc() {
		return this.ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	@Column(name = "DNI", length = 8)
	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Column(name = "RSOCIAL", length = 128)
	public String getRsocial() {
		return this.rsocial;
	}

	public void setRsocial(String rsocial) {
		this.rsocial = rsocial;
	}

	@Column(name = "TDOC", length = 4)
	public String getTdoc() {
		return this.tdoc;
	}

	public void setTdoc(String tdoc) {
		this.tdoc = tdoc;
	}

	@Column(name = "NDOC", length = 32)
	public String getNdoc() {
		return this.ndoc;
	}

	public void setNdoc(String ndoc) {
		this.ndoc = ndoc;
	}

	@Column(name = "NOM_CLI", length = 32)
	public String getNomCli() {
		return this.nomCli;
	}

	public void setNomCli(String nomCli) {
		this.nomCli = nomCli;
	}

	@Column(name = "APE_PAT", length = 32)
	public String getApePat() {
		return this.apePat;
	}

	public void setApePat(String apePat) {
		this.apePat = apePat;
	}

	@Column(name = "APE_MAT", length = 32)
	public String getApeMat() {
		return this.apeMat;
	}

	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}

	@Column(name = "UBIGEO", length = 16)
	public String getUbigeo() {
		return this.ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	@Column(name = "DIR_CLIE", length = 256)
	public String getDirClie() {
		return this.dirClie;
	}

	public void setDirClie(String dirClie) {
		this.dirClie = dirClie;
	}

	@Column(name = "NUM_CEL_1", length = 16)
	public String getNumCel1() {
		return this.numCel1;
	}

	public void setNumCel1(String numCel1) {
		this.numCel1 = numCel1;
	}

	@Column(name = "NUM_CEL_2", length = 16)
	public String getNumCel2() {
		return this.numCel2;
	}

	public void setNumCel2(String numCel2) {
		this.numCel2 = numCel2;
	}

	@Column(name = "NUM_CEL_3", length = 16)
	public String getNumCel3() {
		return this.numCel3;
	}

	public void setNumCel3(String numCel3) {
		this.numCel3 = numCel3;
	}

	@Column(name = "TELF_1", length = 16)
	public String getTelf1() {
		return this.telf1;
	}

	public void setTelf1(String telf1) {
		this.telf1 = telf1;
	}

	@Column(name = "TELF_2", length = 16)
	public String getTelf2() {
		return this.telf2;
	}

	public void setTelf2(String telf2) {
		this.telf2 = telf2;
	}

	@Column(name = "EMAIL_CLIE", length = 128)
	public String getEmailClie() {
		return this.emailClie;
	}

	public void setEmailClie(String emailClie) {
		this.emailClie = emailClie;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FEC_REG", length = 23)
	public Date getFecReg() {
		return this.fecReg;
	}

	public void setFecReg(Date fecReg) {
		this.fecReg = fecReg;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FEC_MOD", length = 23)
	public Date getFecMod() {
		return this.fecMod;
	}

	public void setFecMod(Date fecMod) {
		this.fecMod = fecMod;
	}

	@Column(name = "USU_REG", length = 16)
	public String getUsuReg() {
		return this.usuReg;
	}

	public void setUsuReg(String usuReg) {
		this.usuReg = usuReg;
	}

	@Column(name = "USU_MOD", length = 16)
	public String getUsuMod() {
		return this.usuMod;
	}

	public void setUsuMod(String usuMod) {
		this.usuMod = usuMod;
	}

	@Column(name = "ESTADO")
	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	public void setnombreTotal(String nombreTotal) {
		this.nombreTotal = nombreTotal;
	}

	@Transient
	public String getnombreTotal() {
		// String nombre_Total="";
		this.nombreTotal = (getNdoc().startsWith("2")) ? (getRsocial() == null ? "": getRsocial())
				: (getApePat() == null ? "" : getApePat()) + " "
						+ (getApeMat() == null ? "" : getApeMat()) + ","
						+ (getNomCli() == null ? "" : getNomCli());
		return this.nombreTotal;

	}

	
	@Transient
	public String obtenerTelCel() {
		String numero1 = (getNumCel1() == null ? (getNumCel2() == null ? (getNumCel3() == null ? "SIN CEL" : getNumCel3()): getNumCel2()):getNumCel1());
		System.err.println("numero1  : " + numero1);

		String numero2 = (getTelf1() == null ? (getTelf2() == null ? "SIN CEL": getTelf2())	: getTelf1());
		System.err.println("numero2  : " + numero2);
		String final1 = ((numero1.equals("SIN CEL")) ? (numero2.equals("SIN CEL") ? "ACTUALIZAR DATOS DE CLIENTE" : getTelf2()) : numero1);

		String num1 = (getNumCel1() == null ? "" : getNumCel1())+ (getNumCel1() == null ? "": (getNumCel2() == null ? "" : "/"))+ (getNumCel2() == null ? "" : getNumCel2())+ (getNumCel2() == null ? "": (getNumCel3() == null ? "" : "/"))+ (getNumCel3() == null ? "" : getNumCel3());

		System.err.println("num1_: " + num1);

		System.err.println("numero es : " + final1);
		//setTelfCelCliente((num1.equals("") ? final1 : num1));
		return (num1.equals("") ? final1 : num1);
	}
}
