package org.simpleframework.xml;

/* JADX INFO: loaded from: classes2.dex */
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
