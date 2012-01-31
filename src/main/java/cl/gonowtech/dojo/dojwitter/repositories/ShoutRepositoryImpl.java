package cl.gonowtech.dojo.dojwitter.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import cl.gonowtech.dojo.dojwitter.models.Shout;

@Component
public class ShoutRepositoryImpl
    extends Repository<Shout, Long>
    implements ShoutRepository {

	ShoutRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
}
