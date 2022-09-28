package br.com.cardinalidade.exercicio03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "usuario2")
@Table(name = "tb_usuarios2", schema = "exercicio03")
public class Usuario extends AbstractEntity {

    @Getter @Setter
    @Column(name = "id", unique = true)
    private Long id;

    @Getter @Setter
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Getter @Setter
    @Column(name = "cpf", length = 15, nullable = false, unique = true)
    private String cpf;

    @Getter @Setter
    @Column(name = "login", length = 20, nullable = false, unique = true)
    private String login;

    @Getter @Setter
    @Column(name = "senha", length = 20, nullable = false)
    private String senha;

    @Getter @Setter
    @JoinColumn(name = "telefones_id", nullable = false)
    @OneToMany(targetEntity = Telefone.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Telefone> telefone;
}
