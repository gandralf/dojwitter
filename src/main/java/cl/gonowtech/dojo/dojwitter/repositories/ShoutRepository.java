package cl.gonowtech.dojo.dojwitter.repositories;

import java.util.List;

import cl.gonowtech.dojo.dojwitter.models.Shout;

public interface ShoutRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Shout entity);
	
	Shout update(Shout entity);
	
	void destroy(Shout entity);
	
	Shout find(Long id);
	
	List<Shout> findAll();

}
