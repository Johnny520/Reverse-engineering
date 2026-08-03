package org.simpleframework.xml;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Order {
    java.lang.String[] attributes() default {};

    java.lang.String[] elements() default {};
}
