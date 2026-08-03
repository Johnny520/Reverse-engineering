package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class MethodDetail {
    private final java.lang.annotation.Annotation[] list;
    private final java.lang.reflect.Method method;
    private final java.lang.String name;

    public MethodDetail(java.lang.reflect.Method r2) {
            r1 = this;
            r1.<init>()
            java.lang.annotation.Annotation[] r0 = r2.getDeclaredAnnotations()
            r1.list = r0
            java.lang.String r0 = r2.getName()
            r1.name = r0
            r1.method = r2
            return
    }

    public java.lang.annotation.Annotation[] getAnnotations() {
            r1 = this;
            java.lang.annotation.Annotation[] r0 = r1.list
            return r0
    }

    public java.lang.reflect.Method getMethod() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.method
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}
