package com.kripxon.kripxonapp.controller;

import com.kripxon.kripxonapp.model.Empleado;
import com.kripxon.kripxonapp.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }

    @PostMapping
    public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
        return empleadoRepository.save(empleado);
    }
}