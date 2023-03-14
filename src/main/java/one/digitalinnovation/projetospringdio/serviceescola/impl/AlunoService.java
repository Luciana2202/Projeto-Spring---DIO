package one.digitalinnovation.projetospringdio.serviceescola.impl;


import one.digitalinnovation.projetospringdio.modelescola.Aluno;

public interface AlunoService {

    Iterable<Aluno> buscarTodos();

    Aluno buscarPorId(Long id);

    void inserir(Aluno aluno);

    void atualizar(Long id, Aluno aluno);

    void deletar(Long id);
}
