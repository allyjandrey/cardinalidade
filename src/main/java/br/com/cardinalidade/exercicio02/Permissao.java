package br.com.cardinalidade.exercicio02;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_permissoes", schema = "cardinalidade")
public class Permissao extends AbstractEntity {

    @Getter @Setter
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Getter @Setter
    @Column(name = "descricao", length = 255, nullable = false)
    private String descricao;

    @Getter @Setter
    @Column(name = "regras", length = 100, nullable = false, unique = true)
    private String regras;

    @Getter @Setter
    @Column(name = "funcionalidade", length = 100, nullable = false)
    private String funcionalidade;

    @Getter @Setter
    @Column(name = "acao", length = 100, nullable = false)
    private String acao;
}
