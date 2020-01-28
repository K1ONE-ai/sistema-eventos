package br.com.EventosKrazyDog.SistemaEventos.Repository;

import br.com.EventosKrazyDog.SistemaEventos.Model.eventosModel;
import org.springframework.data.repository.CrudRepository;

public interface enventoRepository extends CrudRepository<eventosModel, String> {
}
