package org.simpleframework.xml;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface ElementList {
    boolean data() default false;

    boolean empty() default true;

    java.lang.String entry() default "";

    boolean inline() default false;

    java.lang.String name() default "";

    boolean required() default true;

    java.lang.Class type() default void.class;
}
