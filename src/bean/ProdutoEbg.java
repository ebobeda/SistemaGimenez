package bean;
// Generated 13/09/2023 13:13:29 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ProdutoEbg generated by hbm2java
 */
@Entity
@Table(name="produto_ebg"
    ,catalog="db_estefani_gimenez"
)
public class ProdutoEbg  implements java.io.Serializable {


     private int idprodutoEbg;
     private String valorunitEbg;
     private String saborEbg;
     private String unidadeEbg;
     private int massaEbg;
     private int modoEbg;
     private int tamanhoEbg;
     private int retirarEbg;
     private Set vendaprodutoEbgs = new HashSet(0);

    public ProdutoEbg() {
    }

	
    public ProdutoEbg(int idprodutoEbg, String valorunitEbg, String saborEbg, String unidadeEbg, int massaEbg, int modoEbg, int tamanhoEbg, int retirarEbg) {
        this.idprodutoEbg = idprodutoEbg;
        this.valorunitEbg = valorunitEbg;
        this.saborEbg = saborEbg;
        this.unidadeEbg = unidadeEbg;
        this.massaEbg = massaEbg;
        this.modoEbg = modoEbg;
        this.tamanhoEbg = tamanhoEbg;
        this.retirarEbg = retirarEbg;
    }
    public ProdutoEbg(int idprodutoEbg, String valorunitEbg, String saborEbg, String unidadeEbg, int massaEbg, int modoEbg, int tamanhoEbg, int retirarEbg, Set vendaprodutoEbgs) {
       this.idprodutoEbg = idprodutoEbg;
       this.valorunitEbg = valorunitEbg;
       this.saborEbg = saborEbg;
       this.unidadeEbg = unidadeEbg;
       this.massaEbg = massaEbg;
       this.modoEbg = modoEbg;
       this.tamanhoEbg = tamanhoEbg;
       this.retirarEbg = retirarEbg;
       this.vendaprodutoEbgs = vendaprodutoEbgs;
    }
   
     @Id 

    
    @Column(name="idproduto_ebg", unique=true, nullable=false)
    public int getIdprodutoEbg() {
        return this.idprodutoEbg;
    }
    
    public void setIdprodutoEbg(int idprodutoEbg) {
        this.idprodutoEbg = idprodutoEbg;
    }

    
    @Column(name="valorunit_ebg", nullable=false, length=80)
    public String getValorunitEbg() {
        return this.valorunitEbg;
    }
    
    public void setValorunitEbg(String valorunitEbg) {
        this.valorunitEbg = valorunitEbg;
    }

    
    @Column(name="sabor_ebg", nullable=false, length=80)
    public String getSaborEbg() {
        return this.saborEbg;
    }
    
    public void setSaborEbg(String saborEbg) {
        this.saborEbg = saborEbg;
    }

    
    @Column(name="unidade_ebg", nullable=false, length=80)
    public String getUnidadeEbg() {
        return this.unidadeEbg;
    }
    
    public void setUnidadeEbg(String unidadeEbg) {
        this.unidadeEbg = unidadeEbg;
    }

    
    @Column(name="massa_ebg", nullable=false)
    public int getMassaEbg() {
        return this.massaEbg;
    }
    
    public void setMassaEbg(int massaEbg) {
        this.massaEbg = massaEbg;
    }

    
    @Column(name="modo_ebg", nullable=false)
    public int getModoEbg() {
        return this.modoEbg;
    }
    
    public void setModoEbg(int modoEbg) {
        this.modoEbg = modoEbg;
    }

    
    @Column(name="tamanho_ebg", nullable=false)
    public int getTamanhoEbg() {
        return this.tamanhoEbg;
    }
    
    public void setTamanhoEbg(int tamanhoEbg) {
        this.tamanhoEbg = tamanhoEbg;
    }

    
    @Column(name="retirar_ebg", nullable=false)
    public int getRetirarEbg() {
        return this.retirarEbg;
    }
    
    public void setRetirarEbg(int retirarEbg) {
        this.retirarEbg = retirarEbg;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="produtoEbg")
    public Set getVendaprodutoEbgs() {
        return this.vendaprodutoEbgs;
    }
    
    public void setVendaprodutoEbgs(Set vendaprodutoEbgs) {
        this.vendaprodutoEbgs = vendaprodutoEbgs;
    }




}

