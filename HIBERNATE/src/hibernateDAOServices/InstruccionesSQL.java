package hibernateDAOServices;

public class InstruccionesSQL {

	public static final String CONSULTAR_TODOS = "select * from employees";
	public static final String CONSULTAR_EMPLEADOS_X_DEPARTAMENTOS = "select * from employees where department_id = ?";
	public static final String COSULTAR_EMPLEADO_X_ID = "select * from employees where employee_id=?";
}
