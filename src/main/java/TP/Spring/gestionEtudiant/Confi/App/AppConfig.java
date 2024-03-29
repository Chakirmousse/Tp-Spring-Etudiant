package TP.Spring.gestionEtudiant.Confi.App;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "TP.Spring.gestionEtudiant")
@PropertySource("classpath:app.properties")
public class AppConfig {

}
