package org.simpleframework.xml;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface ElementMap {
    boolean attribute() default false;

    boolean data() default false;

    boolean empty() default true;

    java.lang.String entry() default "";

    boolean inline() default false;

    java.lang.String key() default "";

    java.lang.Class keyType() default void.class;

    java.lang.String name() default "";

    boolean required() default true;

    java.lang.String value() default "";

    java.lang.Class valueType() default void.class;
}
