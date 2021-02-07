package fr.ggautier.arch.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * A Repository mediates between the domain and data mapping layers, acting like an in-memory domain object collection.
 *
 * @see <a href ="https://www.martinfowler.com/eaaCatalog/repository.html">https://www.martinfowler.com</a>
 */
@Target(ElementType.TYPE)
public @interface Repository {
}
