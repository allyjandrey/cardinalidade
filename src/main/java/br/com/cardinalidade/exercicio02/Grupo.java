package br.com.cardinalidade.exercicio02;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_grupos", schema = "exercicio02")
public class Grupo extends AbstractEntity {

    @Getter @Setter
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Getter @Setter
    @Column(name = "descricao", length = 255, nullable = false)
    private String descricao;

    @Getter @Setter
    @JoinColumn(name = "permissoes", nullable = false)
    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, targetEntity = Permissao.class, fetch = FetchType.EAGER)
    @JoinTable(name = "grupo_permissao", schema = "cardinalidade",
            joinColumns = @JoinColumn(name = "id_grupo"),
            inverseJoinColumns = @JoinColumn(name = "id_permissao"))
    private List<Permissao> permissoes;
}
