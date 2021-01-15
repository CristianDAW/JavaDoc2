/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

/**
 * @see Persona
 * @author Cristian
 * @version 5.0.0
 */
public class Empleado extends Persona {
/**
 * @param numeroEmpleado
 * @param departamento
 * @param puesto
 */
    private int numeroEmpleado;

    private String departamento;

    private String puesto;

    public Empleado() {

    }
/**
 * 
 * @param nombre
 * @param edad
 * @param sexo
 * @param numeroEmpleado
 * @param departamento
 * @param puesto 
 */
    public Empleado(String nombre,
            int edad,
            char sexo,
            int numeroEmpleado,
            String departamento,
            String puesto) {

        super(nombre, edad, sexo);

        this.numeroEmpleado = numeroEmpleado;

        this.departamento = departamento;

        this.puesto = puesto;

    }
/**
 * 
 * @return numeroEmpleado
 */
    public int getNumeroEmpleado() {

        return numeroEmpleado;

    }
/**
 * 
 * @param numeroEmpleado 
 */
    public void setNumeroEmpleado(int numeroEmpleado) {

        this.numeroEmpleado = numeroEmpleado;

    }
/**
 * 
 * @return departamento
 */
    public String getDepartamento() {

        return departamento;

    }
/**
 * 
 * @param departamento 
 */
    public void setDepartamento(String departamento) {

        this.departamento = departamento;

    }
/**
 * 
 * @return puesto
 */
    public String getPuesto() {

        return puesto;

    }
/**
 * 
 * @param puesto 
 */
    public void setPuesto(String puesto) {

        this.puesto = puesto;

    }

}
