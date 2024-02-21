package gm.rh.servicio;

import gm.rh.Modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio {
    public List<Empleado> ListarEmpleados();

    public Empleado buscarEmpleadoPorId(Integer idEmpleado);

    public Empleado guardarEmpleado(Empleado empleado);

    public void EliminarEmpleado(Empleado empleado);
}
