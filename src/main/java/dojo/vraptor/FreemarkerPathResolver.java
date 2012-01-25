package dojo.vraptor;

import br.com.caelum.vraptor.http.FormatResolver;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.view.DefaultPathResolver;

@Component
public class FreemarkerPathResolver extends DefaultPathResolver {
    public FreemarkerPathResolver(FormatResolver resolver) {
        super(resolver);
    }

    protected String getPrefix()  {
        return "/WEB-INF/views/";
    }

    protected String getExtension() {
        return "ftl";
    }
}
