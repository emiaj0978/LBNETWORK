package com.senati.LBNETWORK.service;

import com.senati.LBNETWORK.entity.Soporte_tecnico;
import com.senati.LBNETWORK.repository.Soporte_tecnicoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
//Importamos la anotacion @service
//Esto es la capa de la logica de negocio, aqui van las validaciones, calculos, etc.
@Service
public class Soporte_tecnicoService {
    //Inyectamos el repositorio para poder acceder a la base de datos
    private final Soporte_tecnicoRepository soporte_tecnicoRepository;

    //Contructor: Spring inyecta automaticamente el repositorio(las dependencias)
    public Soporte_tecnicoService(Soporte_tecnicoRepository soporte_tecnicoRepository) {
        this.soporte_tecnicoRepository = soporte_tecnicoRepository;
    }
    //Retorna o recive la lista de todos los clientes
    public List<Soporte_tecnico> listarTodos(){
        return soporte_tecnicoRepository.findAll();
    }

    //Eliminar el cliente por el id
    public void eliminarSoporte_tecnico(long id){
        soporte_tecnicoRepository.deleteById(id);
    }
}
