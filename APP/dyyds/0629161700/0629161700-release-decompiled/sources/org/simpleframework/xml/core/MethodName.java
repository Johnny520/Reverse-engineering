package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class MethodName {
    private java.lang.reflect.Method method;
    private java.lang.String name;
    private org.simpleframework.xml.core.MethodType type;

    public MethodName(java.lang.reflect.Method r1, org.simpleframework.xml.core.MethodType r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.method = r1
            r0.type = r2
            r0.name = r3
            return
    }

    public java.lang.reflect.Method getMethod() {
            r0 = this;
            java.lang.reflect.Method r0 = r0.method
            return r0
    }

    public java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.name
            return r0
    }

    public org.simpleframework.xml.core.MethodType getType() {
            r0 = this;
            org.simpleframework.xml.core.MethodType r0 = r0.type
            return r0
    }
}
