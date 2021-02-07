package fr.ggautier.arch.annotations.rest;

/**
 * The key abstraction of information in REST.
 *
 * <p>Any information that can be named can be a resource:
 * a document or image, a temporal service (e.g. "today's weather in Los Angeles"), a collection of other resources,
 * a non-virtual object (e.g. a person), and so on. In other words, any concept that might be the target of an author's
 * hypertext reference must fit within the definition of a resource. A resource is a conceptual mapping to a set
 * of entities, not the entity that corresponds to the mapping at any particular point in time.
 *
 * @see <a href="https://www.ics.uci.edu/~fielding/pubs/dissertation/rest_arch_style.htm#sec_5_2_1_1">https://www.ics.uci.edu/~fielding/pubs/dissertation/rest_arch_style.htm/</a>
 * @see <a href="https://restfulapi.net/">https://restfulapi.net/</a>
 */
public @interface Resource {

}
