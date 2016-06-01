package ar.com.exisoft.facundo.model;

import java.io.Serializable;

/**
 * A entity object, like in any other Java application. In a typical real world
 * application this could for example be a JPA entity.
 */
@SuppressWarnings("serial")
public class LoginEntity  implements Serializable, Cloneable {
	
	
	
	@Override
	public boolean equals(Object obj) {
		//TODO implementar cuando llene con los campos AGUS
		if (this == obj) {
			return true;
		}
//		if (this.id == null) {
//			return false;
//		}

		if (obj instanceof LoginEntity && obj.getClass().equals(getClass())) {
			//return this.id.equals(((LoginEntity) obj).id);
		}

		return false;
	}

}
