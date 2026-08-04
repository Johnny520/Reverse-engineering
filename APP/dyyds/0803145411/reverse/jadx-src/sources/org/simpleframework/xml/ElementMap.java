package org.simpleframework.xml;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface ElementMap {
    boolean attribute() default false;

    boolean data() default false;

    boolean empty() default true;

    String entry() default "";

    boolean inline() default false;

    String key() default "";

    Class keyType() default void.class;

    String name() default "";

    boolean required() default true;

    String value() default "";

    Class valueType() default void.class;
}
