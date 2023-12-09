package bean;
// Generated 05/12/2023 10:44:54 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ProdutosEma generated by hbm2java
 */
@Entity
@Table(name = "produtos_ema",
         catalog = "db_eduardo_aguero"
)
public class ProdutosEma implements java.io.Serializable {

    private int idProdutoEma;
    private String nomeProdutoEma;
    private String descricaoProdutoEma;
    private Double precoVendaEma;
    private int quantidadeEstoqueEma;
    private String categoriaEma;
    private String fornecedorEma;
    private Date dataCadastroEma;
    private Set vendasProdutoEmas = new HashSet(0);

    public ProdutosEma() {
    }

    public ProdutosEma(int idProdutoEma) {
        this.idProdutoEma = idProdutoEma;
    }

    public ProdutosEma(int idProdutoEma, String nomeProdutoEma, String descricaoProdutoEma, Double precoVendaEma, int quantidadeEstoqueEma, String categoriaEma, String fornecedorEma, Date dataCadastroEma, Set vendasProdutoEmas) {
        this.idProdutoEma = idProdutoEma;
        this.nomeProdutoEma = nomeProdutoEma;
        this.descricaoProdutoEma = descricaoProdutoEma;
        this.precoVendaEma = precoVendaEma;
        this.quantidadeEstoqueEma = quantidadeEstoqueEma;
        this.categoriaEma = categoriaEma;
        this.fornecedorEma = fornecedorEma;
        this.dataCadastroEma = dataCadastroEma;
        this.vendasProdutoEmas = vendasProdutoEmas;
    }

    @Id

    @Column(name = "id_produto_ema", unique = true, nullable = false)
    public int getIdProdutoEma() {
        return this.idProdutoEma;
    }

    public void setIdProdutoEma(int idProdutoEma) {
        this.idProdutoEma = idProdutoEma;
    }

    @Column(name = "nome_produto_ema")
    public String getNomeProdutoEma() {
        return this.nomeProdutoEma;
    }

    public void setNomeProdutoEma(String nomeProdutoEma) {
        this.nomeProdutoEma = nomeProdutoEma;
    }

    @Column(name = "descricao_produto_ema", length = 65535)
    public String getDescricaoProdutoEma() {
        return this.descricaoProdutoEma;
    }

    public void setDescricaoProdutoEma(String descricaoProdutoEma) {
        this.descricaoProdutoEma = descricaoProdutoEma;
    }

    @Column(name = "preco_venda_ema", precision = 10)
    public Double getPrecoVendaEma() {
        return this.precoVendaEma;
    }

    public void setPrecoVendaEma(Double precoVendaEma) {
        this.precoVendaEma = precoVendaEma;
    }

    @Column(name = "quantidade_estoque_ema")
    public int getQuantidadeEstoqueEma() {
        return this.quantidadeEstoqueEma;
    }

    public void setQuantidadeEstoqueEma(int quantidadeEstoqueEma) {
        this.quantidadeEstoqueEma = quantidadeEstoqueEma;
    }

    @Column(name = "categoria_ema", length = 50)
    public String getCategoriaEma() {
        return this.categoriaEma;
    }

    public void setCategoriaEma(String categoriaEma) {
        this.categoriaEma = categoriaEma;
    }

    @Column(name = "fornecedor_ema", length = 100)
    public String getFornecedorEma() {
        return this.fornecedorEma;
    }

    public void setFornecedorEma(String fornecedorEma) {
        this.fornecedorEma = fornecedorEma;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "data_cadastro_ema", length = 10)
    public Date getDataCadastroEma() {
        return this.dataCadastroEma;
    }

    public void setDataCadastroEma(Date dataCadastroEma) {
        this.dataCadastroEma = dataCadastroEma;
    }

    @OneToMany(mappedBy = "produtosEma", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<VendasProdutoEma> getVendasProdutoEmas() {
        return this.vendasProdutoEmas;
    }

    public void setVendasProdutoEmas(Set<VendasProdutoEma> vendasProdutoEmas) {
        this.vendasProdutoEmas = vendasProdutoEmas;
    }

    public String toString() {
        return nomeProdutoEma;
    }

}
