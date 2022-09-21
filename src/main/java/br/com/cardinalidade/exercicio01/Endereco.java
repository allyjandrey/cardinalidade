package br.com.cardinalidade.exercicio01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_enderecos", schema = "cardinalidade")
public class Endereco extends AbstractEntity {

    @Getter @Setter
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Getter @Setter
    @Column(name = "endereco", length = 100, nullable = false)
    private String endereco;

    @Getter @Setter
    @Column(name = "numero", length = 20, nullable = false)
    private String numero;

    @Getter @Setter
    @Column(name = "cep", length = 8, nullable = false)
    private String cep;

    @Getter @Setter
    @Column(name = "bairro", length = 100, nullable = false)
    private String bairro;
}
