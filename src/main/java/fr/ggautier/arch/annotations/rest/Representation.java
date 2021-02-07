package fr.ggautier.arch.annotations.rest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * The current or intended state of a resource.
 *
 * <p>A representation consists of data, metadata describing the data and hypermedia links which can help the clients
 * in transition to next desired state.
 *
 * @see <a href="https://www.ics.uci.edu/~fielding/pubs/dissertation/rest_arch_style.htm#sec_5_2_1_2">https://www.ics.uci.edu/~fielding/pubs/dissertation/rest_arch_style.htm</a>
 * @see <a href="https://restfulapi.net/">https://restfulapi.net/</a>
 */
@Target(ElementType.TYPE)
public @interface Representation {

}
