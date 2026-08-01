package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class GetPart implements org.simpleframework.xml.core.MethodPart {
    private final org.simpleframework.xml.util.Cache<java.lang.annotation.Annotation> cache;
    private final java.lang.annotation.Annotation label;
    private final java.lang.annotation.Annotation[] list;
    private final java.lang.reflect.Method method;
    private final java.lang.String name;
    private final org.simpleframework.xml.core.MethodType type;

    public GetPart(org.simpleframework.xml.core.MethodName r2, java.lang.annotation.Annotation r3, java.lang.annotation.Annotation[] r4) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.cache = r0
            java.lang.reflect.Method r0 = r2.getMethod()
            r1.method = r0
            java.lang.String r0 = r2.getName()
            r1.name = r0
            org.simpleframework.xml.core.MethodType r2 = r2.getType()
            r1.type = r2
            r1.label = r3
            r1.list = r4
            return
    }

    @Override // org.simpleframework.xml.core.MethodPart
    public java.lang.annotation.Annotation getAnnotation() {
            r0 = this;
            java.lang.annotation.Annotation r0 = r0.label
            return r0
    }

    @Override // org.simpleframework.xml.core.MethodPart
    public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r7) {
            r6 = this;
            org.simpleframework.xml.util.Cache<java.lang.annotation.Annotation> r0 = r6.cache
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1c
            java.lang.annotation.Annotation[] r0 = r6.list
            int r1 = r0.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1c
            r3 = r0[r2]
            java.lang.Class r4 = r3.annotationType()
            org.simpleframework.xml.util.Cache<java.lang.annotation.Annotation> r5 = r6.cache
            r5.cache(r4, r3)
            int r2 = r2 + 1
            goto Lc
        L1c:
            org.simpleframework.xml.util.Cache<java.lang.annotation.Annotation> r6 = r6.cache
            java.lang.Object r6 = r6.fetch(r7)
            java.lang.annotation.Annotation r6 = (java.lang.annotation.Annotation) r6
            return r6
    }

    @Override // org.simpleframework.xml.core.MethodPart
    public java.lang.Class getDeclaringClass() {
            r0 = this;
            java.lang.reflect.Method r0 = r0.method
            java.lang.Class r0 = r0.getDeclaringClass()
            return r0
    }

    @Override // org.simpleframework.xml.core.MethodPart
    public java.lang.Class getDependent() {
            r0 = this;
            java.lang.reflect.Method r0 = r0.method
            java.lang.Class r0 = org.simpleframework.xml.core.Reflector.getReturnDependent(r0)
            return r0
    }

    @Override // org.simpleframework.xml.core.MethodPart
    public java.lang.Class[] getDependents() {
            r0 = this;
            java.lang.reflect.Method r0 = r0.method
            java.lang.Class[] r0 = org.simpleframework.xml.core.Reflector.getReturnDependents(r0)
            return r0
    }

    @Override // org.simpleframework.xml.core.MethodPart
    public java.lang.reflect.Method getMethod() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.method
            boolean r0 = r0.isAccessible()
            if (r0 != 0) goto Le
            java.lang.reflect.Method r0 = r2.method
            r1 = 1
            r0.setAccessible(r1)
        Le:
            java.lang.reflect.Method r2 = r2.method
            return r2
    }

    @Override // org.simpleframework.xml.core.MethodPart
    public org.simpleframework.xml.core.MethodType getMethodType() {
            r0 = this;
            org.simpleframework.xml.core.MethodType r0 = r0.type
            return r0
    }

    @Override // org.simpleframework.xml.core.MethodPart
    public java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.name
            return r0
    }

    @Override // org.simpleframework.xml.core.MethodPart
    public java.lang.Class getType() {
            r0 = this;
            java.lang.reflect.Method r0 = r0.method
            java.lang.Class r0 = r0.getReturnType()
            return r0
    }

    @Override // org.simpleframework.xml.core.MethodPart
    public java.lang.String toString() {
            r0 = this;
            java.lang.reflect.Method r0 = r0.method
            java.lang.String r0 = r0.toGenericString()
            return r0
    }
}
