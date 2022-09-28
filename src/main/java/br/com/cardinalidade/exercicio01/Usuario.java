package br.com.cardinalidade.exercicio01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_usuarios", schema = "exercicio01")
public class Usuario extends AbstractEntity {

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
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_endereco", nullable = false, unique = true)
    private Endereco endereco;
}
