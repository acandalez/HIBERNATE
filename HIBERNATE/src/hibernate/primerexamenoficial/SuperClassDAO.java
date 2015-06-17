package hibernate.primerexamenoficial;

import org.hibernate.Session;

public class SuperClassDAO {
	private Session sesion = null;

	public Session getSesion() {
		return sesion;
	}

	public void setSesion(Session sesion) {
		this.sesion = sesion;
	}

}
