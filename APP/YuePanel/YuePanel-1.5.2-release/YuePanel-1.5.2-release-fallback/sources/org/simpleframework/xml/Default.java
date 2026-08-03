package org.simpleframework.xml;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Default {
    boolean required() default true;

    org.simpleframework.xml.DefaultType value() default org.simpleframework.xml.DefaultType.FIELD;
}
