package com.senati.LBNETWORK.service;

import com.senati.LBNETWORK.entity.Servicio;
import com.senati.LBNETWORK.repository.ServicioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
//Importamos la anotacion @service
//Esto es la capa de la logica de negocio, aqui van las validaciones, calculos, etc.
@Service
public class ServicioService {
    //Inyectamos el repositorio para poder acceder a la base de datos
    private final ServicioRepository servicioRepository;

    //Contructor: Spring inyecta automaticamente el repositorio(las dependencias)
    public ServicioService(ServicioRepository servicioRepository) {
        this.servicioRepository = servicioRepository;
    }
    //Retorna o recive la lista de todos los clientes
    public List<Servicio> listarTodos(){
        return servicioRepository.findAll();
    }

    //Eliminar el cliente por el id
    public void eliminarServicio(long id){
        servicioRepository.deleteById(id);
    }
}
