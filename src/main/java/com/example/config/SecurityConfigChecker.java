import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class SecurityConfigChecker {
    private static final Logger logger = LoggerFactory.getLogger(SecurityConfigChecker.class);

    @PostConstruct
    public void init() {
        logger.info("SecurityConfig is loaded!");
    }
}
