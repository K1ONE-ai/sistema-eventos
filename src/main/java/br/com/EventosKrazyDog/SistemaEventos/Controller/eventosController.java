package br.com.EventosKrazyDog.SistemaEventos.Controller;


import br.com.EventosKrazyDog.SistemaEventos.Model.eventosModel;
import br.com.EventosKrazyDog.SistemaEventos.Service.eventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class eventosController {

    @Autowired
    private eventosService service;

    @GetMapping
    public String mostrarHome(){
        return "index";
    }


    @GetMapping("/form")
    public String mostrarform(){
        return "form";
    }

    @PostMapping("/cadastrar")
    public String cadastroEvento(eventosModel evento){
        service.cadastroEventos(evento);
        return "index";
    }


}
