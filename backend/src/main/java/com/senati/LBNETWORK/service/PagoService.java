package com.senati.LBNETWORK.service;

import com.senati.LBNETWORK.entity.Pago;
import com.senati.LBNETWORK.repository.PagoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
//Importamos la anotacion @service
//Esto es la capa de la logica de negocio, aqui van las validaciones, calculos, etc.
@Service
public class PagoService {
    //Inyectamos el repositorio para poder acceder a la base de datos
    private final PagoRepository pagoRepository;

    //Contructor: Spring inyecta automaticamente el repositorio(las dependencias)
    public PagoService(PagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }
    //Retorna o recive la lista de todos los clientes
    public List<Pago> listarTodos(){
        return pagoRepository.findAll();
    }

    //Eliminar el cliente por el id
    public void eliminarPago(long id){
        pagoRepository.deleteById(id);
    }
}
