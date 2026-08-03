package org.simpleframework.xml;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Attribute {
    java.lang.String empty() default "";

    java.lang.String name() default "";

    boolean required() default true;
}
