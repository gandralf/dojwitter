package dojo.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;

@Resource
public class HomeController {
    @Get("/")
    public void index() {
        // Just load the template
    }
}
