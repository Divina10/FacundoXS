package ar.com.exisoft.facundo.configuracion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
  @PropertySource(value = "classpath:db.properties", ignoreResourceNotFound = true),
  @PropertySource(value = "classpath:engine.properties", ignoreResourceNotFound = true)
})
@ComponentScan(basePackages = { "ar.com.exisoft.facundo.configuracion" })
@ImportResource({"classpath:facundo-ui-context.xml", "classpath:facundo-login-context.xml", "classpath:facundo-custom-context.xml"})
public class ConfiguracionFacundoXS {

}
