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

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

/**
 * ApscForpago generated by hbm2java
 */
@Entity
@Table(name = "APSC_FORPAGO",schema="ERP"
/*"dbo"
,catalog="ERP"*/)
@DynamicUpdate
@DynamicInsert
@SelectBeforeUpdate 
public class ApscForpago implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idForpago;
	private String cdForpago;
	private String descripcion;
	private Date fecReg;
	private Date fecMod;
	private String usuReg;
	private String usuMod;
	private Boolean estado;
	private Set<ApscPedido> apscPedidos = new HashSet<ApscPedido>(0);

	public ApscForpago() {
	}

	public ApscForpago(long idForpago) {
		this.idForpago = idForpago;
	}

	public ApscForpago(long idForpago, String cdForpago, String descripcion,
			Date fecReg, Date fecMod, String usuReg, String usuMod,
			Boolean estado, Set<ApscPedido> apscPedidos) {
		this.idForpago = idForpago;
		this.cdForpago = cdForpago;
		this.descripcion = descripcion;
		this.fecReg = fecReg;
		this.fecMod = fecMod;
		this.usuReg = usuReg;
		this.usuMod = usuMod;
		this.estado = estado;
		this.apscPedidos = apscPedidos;
	}

	@Id
	@Column(name = "ID_FORPAGO", unique = true, nullable = false)
	public long getIdForpago() {
		return this.idForpago;
	}

	public void setIdForpago(long idForpago) {
		this.idForpago = idForpago;
	}

	@Column(name = "CD_FORPAGO", length = 8)
	public String getCdForpago() {
		return this.cdForpago;
	}

	public void setCdForpago(String cdForpago) {
		this.cdForpago = cdForpago;
	}

	@Column(name = "DESCRIPCION", length = 128)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FEC_REG",insertable = false, length = 23)
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

	@Column(name = "USU_REG", length = 8)
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

	@Column(name = "ESTADO",insertable = false)
	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "apscForpago")
	public Set<ApscPedido> getApscPedidos() {
		return this.apscPedidos;
	}

	public void setApscPedidos(Set<ApscPedido> apscPedidos) {
		this.apscPedidos = apscPedidos;
	}

}
