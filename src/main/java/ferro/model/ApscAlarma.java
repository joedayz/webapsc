package ferro.model;
// Generated 17/03/2015 01:50:11 PM by Hibernate Tools 3.6.0


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ApscAlarma generated by hbm2java
 */
@Entity
@Table(name="APSC_ALARMA"
    ,schema="ERP"
    /*"dbo"
    ,catalog="ERP"*/
)
public class ApscAlarma  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idAlarma;
     private ApscPedido apscPedido;
     private Long idTipoAlarma;
     private Long idUser;
     private String idProd;
     private String msg;
     private Date fecReg;
     private String usuReg;
     private Boolean estado;

    public ApscAlarma() {
    }

	
    public ApscAlarma(long idAlarma) {
        this.idAlarma = idAlarma;
    }
    public ApscAlarma(long idAlarma, ApscPedido apscPedido, Long idTipoAlarma, Long idUser, String idProd, String msg, Date fecReg, String usuReg, Boolean estado) {
       this.idAlarma = idAlarma;
       this.apscPedido = apscPedido;
       this.idTipoAlarma = idTipoAlarma;
       this.idUser = idUser;
       this.idProd = idProd;
       this.msg = msg;
       this.fecReg = fecReg;
       this.usuReg = usuReg;
       this.estado = estado;
    }
   
     @Id 

    
    @Column(name="ID_ALARMA", unique=true, nullable=false)
    public long getIdAlarma() {
        return this.idAlarma;
    }
    
    public void setIdAlarma(long idAlarma) {
        this.idAlarma = idAlarma;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_PEDIDO")
    public ApscPedido getApscPedido() {
        return this.apscPedido;
    }
    
    public void setApscPedido(ApscPedido apscPedido) {
        this.apscPedido = apscPedido;
    }

    
    @Column(name="ID_TIPO_ALARMA")
    public Long getIdTipoAlarma() {
        return this.idTipoAlarma;
    }
    
    public void setIdTipoAlarma(Long idTipoAlarma) {
        this.idTipoAlarma = idTipoAlarma;
    }

    
    @Column(name="ID_USER")
    public Long getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    
    @Column(name="ID_PROD", length=16)
    public String getIdProd() {
        return this.idProd;
    }
    
    public void setIdProd(String idProd) {
        this.idProd = idProd;
    }

    
    @Column(name="MSG", length=160)
    public String getMsg() {
        return this.msg;
    }
    
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FEC_REG", length=23)
    public Date getFecReg() {
        return this.fecReg;
    }
    
    public void setFecReg(Date fecReg) {
        this.fecReg = fecReg;
    }

    
    @Column(name="USU_REG", length=16)
    public String getUsuReg() {
        return this.usuReg;
    }
    
    public void setUsuReg(String usuReg) {
        this.usuReg = usuReg;
    }

    
    @Column(name="ESTADO")
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }




}


