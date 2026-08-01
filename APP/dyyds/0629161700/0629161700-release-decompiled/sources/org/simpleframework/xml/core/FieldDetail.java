package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class FieldDetail {
    private final java.lang.reflect.Field field;
    private final java.lang.annotation.Annotation[] list;
    private final java.lang.String name;

    public FieldDetail(java.lang.reflect.Field r2) {
            r1 = this;
            r1.<init>()
            java.lang.annotation.Annotation[] r0 = r2.getDeclaredAnnotations()
            r1.list = r0
            java.lang.String r0 = r2.getName()
            r1.name = r0
            r1.field = r2
            return
    }

    public java.lang.annotation.Annotation[] getAnnotations() {
            r0 = this;
            java.lang.annotation.Annotation[] r0 = r0.list
            return r0
    }

    public java.lang.reflect.Field getField() {
            r0 = this;
            java.lang.reflect.Field r0 = r0.field
            return r0
    }

    public java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.name
            return r0
    }
}
