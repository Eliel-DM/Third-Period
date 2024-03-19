package com.example.ProjectSpring1234.Service;

import com.example.ProjectSpring1234.Entity.Estado;
import com.example.ProjectSpring1234.Repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;
    public List<Estado> buscarTodos(){
        return estadoRepository.findAll() ;
    }

}
