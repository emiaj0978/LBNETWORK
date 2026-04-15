package com.senati.LBNETWORK.service;

import com.senati.LBNETWORK.entity.Plan;
import com.senati.LBNETWORK.repository.PlanRepository;
import org.springframework.stereotype.Service;
import java.util.List;
//Importamos la anotacion @service
//Esto es la capa de la logica de negocio, aqui van las validaciones, calculos, etc.
@Service
public class PlanService {
    //Inyectamos el repositorio para poder acceder a la base de datos
    private final PlanRepository planRepository;

    //Contructor: Spring inyecta automaticamente el repositorio(las dependencias)
    public PlanService(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }
    //Retorna o recive la lista de todos los clientes
    public List<Plan> listarTodos(){
        return planRepository.findAll();
    }

    //Eliminar el cliente por el id
    public void eliminarPlan(long id){
        planRepository.deleteById(id);
    }
}
