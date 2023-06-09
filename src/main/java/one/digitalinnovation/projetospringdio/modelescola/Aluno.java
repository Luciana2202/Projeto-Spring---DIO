package one.digitalinnovation.projetospringdio.modelescola;


import jakarta.persistence.*;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @ManyToOne
    private Dados endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dados getEndereco() {
        return endereco;
    }

    public void setEndereco(Dados endereco) {
        this.endereco = endereco;
    }

}
