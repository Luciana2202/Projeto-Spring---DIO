package one.digitalinnovation.projetospringdio.modelescola;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosRepository extends CrudRepository<Dados, String> {

}