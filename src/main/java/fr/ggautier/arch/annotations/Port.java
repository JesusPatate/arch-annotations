package fr.ggautier.arch.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Port {

    /**
     * Existing types of ports.
     */
    enum Type {
        /**
         * Code that plugs into this type of port uses exposed features (that are provided by the domain).
         */
        API,

        /**
         * Code that plugs into this type of port provides exposed features (that are used by the domain).
         */
        SPI}

    Type type();
}
