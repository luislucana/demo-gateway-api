import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Basear-se no arquivo:
 * https://github.com/luislucana/starwars-api/blob/master/pom.xml
 * https://github.com/luislucana/starwars-api/blob/master/src/main/java/br/com/starwars/service/util/SwapiRestUtil.java
 */
@SpringBootApplication
@ComponentScan("br.com.gateway.*")
//@EntityScan("br.com.gateway.persistence.model")
//@EnableJpaRepositories("br.com.starwars.persistence.repository")
//@EnableTransactionManagement
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}