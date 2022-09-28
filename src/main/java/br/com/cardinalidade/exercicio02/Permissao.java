package br.com.cardinalidade.exercicio02;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_permissoes", schema = "exercicio02")
public class Permissao extends AbstractEntity {

    @Getter @Setter
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Getter @Setter
    @Column(name = "descricao", length = 255, nullable = false)
    private String descricao;

    @Getter @Setter
    @Column(name = "regra", length = 100, nullable = false, unique = true)
    private String regra;

    @Getter @Setter
    @Column(name = "funcionalidade", length = 100, nullable = false)
    private String funcionalidade;

    @Getter @Setter
    @Column(name = "acao", length = 100, nullable = false)
    private String acao;

    @Getter @Setter
    @ManyToMany(mappedBy ="permissoes")
    private List<Grupo> grupos;
}
