package org.simpleframework.xml;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface ElementArray {
    boolean data() default false;

    boolean empty() default true;

    java.lang.String entry() default "";

    java.lang.String name() default "";

    boolean required() default true;
}
