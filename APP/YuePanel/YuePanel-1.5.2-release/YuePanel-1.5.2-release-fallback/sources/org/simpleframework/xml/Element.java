package org.simpleframework.xml;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Element {
    boolean data() default false;

    java.lang.String name() default "";

    boolean required() default true;

    java.lang.Class type() default void.class;
}
