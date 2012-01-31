package cl.gonowtech.dojo.dojwitter.controllers;

import java.util.List;

import cl.gonowtech.dojo.dojwitter.models.Shout;
import cl.gonowtech.dojo.dojwitter.repositories.ShoutRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class ShoutController {

	private final Result result;
	private final ShoutRepository repository;
	private final Validator validator;
	
	ShoutController(Result result, ShoutRepository repository, Validator validator) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;
	}
	
	@Get("/shouts")
	public List<Shout> index() {
		return repository.findAll();
	}
	
	@Post("/shouts")
	public void create(Shout shout) {
		validator.validate(shout);
		validator.onErrorUsePageOf(this).newShout();
		repository.create(shout);
		result.redirectTo(this).index();
	}
	
	@Get("/shouts/new")
	public Shout newShout() {
		return new Shout();
	}
	
	@Put("/shouts")
	public void update(Shout shout) {
		validator.validate(shout);
		validator.onErrorUsePageOf(this).edit(shout);
		repository.update(shout);
		result.redirectTo(this).index();
	}
	
	@Get("/shouts/{shout.id}/edit")
	public Shout edit(Shout shout) {
		return repository.find(shout.getId());
	}

	@Get("/shouts/{shout.id}")
	public Shout show(Shout shout) {
		return repository.find(shout.getId());
	}

	@Delete("/shouts/{shout.id}")
	public void destroy(Shout shout) {
		repository.destroy(repository.find(shout.getId()));
		result.redirectTo(this).index();  
	}
}