package gm.rh.repositorio;

import gm.rh.Modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;



public interface  EmpleadoRepositorio extends JpaRepository<Empleado, Integer>  {
}
