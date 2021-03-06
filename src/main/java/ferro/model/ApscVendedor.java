package ferro.model;

// Generated 17/03/2015 01:50:11 PM by Hibernate Tools 3.6.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * ApscVendedor generated by hbm2java
 */
@Entity
@Table(name = "APSC_VENDEDOR",schema="ERP"
/*"dbo"
,catalog="ERP"*/)
public class ApscVendedor implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idVend;
	private String cdVend;
	private String ruc;
	private String tdoc;
	private String ndoc;
	private String nomVend;
	private String apePat;
	private String apeMat;
	private String direcVend;
	private String numCel1;
	private String numCel2;
	private String numCel3;
	private String telf1;
	private String telf2;
	private String email;
	private Date fecReg;
	private Date fecMod;
	private String usuReg;
	private String usuMod;
	private Boolean estado;
	private Set<ApscPedido> apscPedidos = new HashSet<ApscPedido>(0);

	public ApscVendedor() {
	}

	public ApscVendedor(long idVend) {
		this.idVend = idVend;
	}

	public ApscVendedor(long idVend, String cdVend, String ruc, String tdoc,
			String ndoc, String nomVend, String apePat, String apeMat,
			String direcVend, String numCel1, String numCel2, String numCel3,
			String telf1, String telf2, String email, Date fecReg, Date fecMod,
			String usuReg, String usuMod, Boolean estado,
			Set<ApscPedido> apscPedidos) {
		this.idVend = idVend;
		this.cdVend = cdVend;
		this.ruc = ruc;
		this.tdoc = tdoc;
		this.ndoc = ndoc;
		this.nomVend = nomVend;
		this.apePat = apePat;
		this.apeMat = apeMat;
		this.direcVend = direcVend;
		this.numCel1 = numCel1;
		this.numCel2 = numCel2;
		this.numCel3 = numCel3;
		this.telf1 = telf1;
		this.telf2 = telf2;
		this.email = email;
		this.fecReg = fecReg;
		this.fecMod = fecMod;
		this.usuReg = usuReg;
		this.usuMod = usuMod;
		this.estado = estado;
		this.apscPedidos = apscPedidos;
	}

	@Id
	@Column(name = "ID_VEND", unique = true, nullable = false)
	public long getIdVend() {
		return this.idVend;
	}

	public void setIdVend(long idVend) {
		this.idVend = idVend;
	}

	@Column(name = "CD_VEND", length = 16)
	public String getCdVend() {
		return this.cdVend;
	}

	public void setCdVend(String cdVend) {
		this.cdVend = cdVend;
	}

	@Column(name = "RUC", length = 16)
	public String getRuc() {
		return this.ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
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

	@Column(name = "NOM_VEND", length = 32)
	public String getNomVend() {
		return this.nomVend;
	}

	public void setNomVend(String nomVend) {
		this.nomVend = nomVend;
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

	@Column(name = "DIREC_VEND", length = 128)
	public String getDirecVend() {
		return this.direcVend;
	}

	public void setDirecVend(String direcVend) {
		this.direcVend = direcVend;
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

	@Column(name = "TELF1", length = 16)
	public String getTelf1() {
		return this.telf1;
	}

	public void setTelf1(String telf1) {
		this.telf1 = telf1;
	}

	@Column(name = "TELF2", length = 16)
	public String getTelf2() {
		return this.telf2;
	}

	public void setTelf2(String telf2) {
		this.telf2 = telf2;
	}

	@Column(name = "EMAIL", length = 128)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "apscVendedor")
	public Set<ApscPedido> getApscPedidos() {
		return this.apscPedidos;
	}

	public void setApscPedidos(Set<ApscPedido> apscPedidos) {
		this.apscPedidos = apscPedidos;
	}
	
	@Transient
	public String getNombreCompleto(){
		return getNomVend()+", "+getApePat()+" "+getApeMat();
	}

}
