package org.simpleframework.xml;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Version {
    java.lang.String name() default "";

    boolean required() default false;

    double revision() default 1.0d;
}
