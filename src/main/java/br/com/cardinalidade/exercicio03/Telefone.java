package br.com.cardinalidade.exercicio03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_telefones", schema = "exercicio03")
public class Telefone extends AbstractEntity {

    @Getter @Setter
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Getter @Setter
    @Column(name = "nome", length = 100, nullable = false, unique = true)
    private String nome;

    @Getter @Setter
    @Column(name = "pais", length = 5, nullable = false)
    private String  pais;

    @Getter @Setter
    @Column(name = "ddd", length = 5, nullable = false)
    private String ddd;

    @Getter @Setter
    @Column(name = "numero", length = 10)
    private String numero;
}
