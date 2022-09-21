package br.com.cardinalidade.exercicio02;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.List;

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
    @ManyToMany(targetEntity = Permissao.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "regras", nullable = false)
    private List<Permissao> regras;
}
