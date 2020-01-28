package br.com.EventosKrazyDog.SistemaEventos.Service;

import br.com.EventosKrazyDog.SistemaEventos.Model.eventosModel;
import br.com.EventosKrazyDog.SistemaEventos.Repository.enventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class eventosService {

    @Autowired
    private enventoRepository repository;

    public eventosModel cadastroEventos(eventosModel eventos){

        return repository.save(eventos);
    }
}
