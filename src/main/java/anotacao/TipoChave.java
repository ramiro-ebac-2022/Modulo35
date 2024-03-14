package anotacao;

import java.lang.annotation.*;

/**
 * @author ramiro.zavala
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
