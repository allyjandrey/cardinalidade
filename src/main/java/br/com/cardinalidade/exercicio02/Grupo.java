package br.com.cardinalidade.exercicio02;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_grupos", schema = "cardinalidade")
public class Grupo extends AbstractEntity {

    @Getter @Setter
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Getter @Setter
    @Column(name = "descricao", length = 255, nullable = false)
    private String descricao;

    @Getter @Setter
    @Column(name = "regras", nullable = false)
    private String regras;
}
