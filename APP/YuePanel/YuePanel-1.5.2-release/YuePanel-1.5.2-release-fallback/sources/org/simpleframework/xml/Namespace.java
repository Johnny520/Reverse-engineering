package org.simpleframework.xml;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Namespace {
    java.lang.String prefix() default "";

    java.lang.String reference() default "";
}
