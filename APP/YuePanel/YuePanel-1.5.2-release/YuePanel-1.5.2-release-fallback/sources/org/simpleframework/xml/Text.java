package org.simpleframework.xml;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Text {
    boolean data() default false;

    java.lang.String empty() default "";

    boolean required() default true;
}
