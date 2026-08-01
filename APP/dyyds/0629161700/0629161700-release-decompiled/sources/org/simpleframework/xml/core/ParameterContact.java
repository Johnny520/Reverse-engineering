package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
abstract class ParameterContact<T extends java.lang.annotation.Annotation> implements org.simpleframework.xml.core.Contact {
    protected final java.lang.reflect.Constructor factory;
    protected final int index;
    protected final T label;
    protected final java.lang.annotation.Annotation[] labels;
    protected final java.lang.Class owner;

    public ParameterContact(T r2, java.lang.reflect.Constructor r3, int r4) {
            r1 = this;
            r1.<init>()
            java.lang.annotation.Annotation[][] r0 = r3.getParameterAnnotations()
            r0 = r0[r4]
            r1.labels = r0
            java.lang.Class r0 = r3.getDeclaringClass()
            r1.owner = r0
            r1.factory = r3
            r1.index = r4
            r1.label = r2
            return
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.annotation.Annotation getAnnotation() {
            r0 = this;
            T extends java.lang.annotation.Annotation r0 = r0.label
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Type
    public <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class<A> r5) {
            r4 = this;
            java.lang.annotation.Annotation[] r4 = r4.labels
            int r0 = r4.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L16
            r2 = r4[r1]
            java.lang.Class r3 = r2.annotationType()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L13
            return r2
        L13:
            int r1 = r1 + 1
            goto L4
        L16:
            r4 = 0
            return r4
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Class getDeclaringClass() {
            r0 = this;
            java.lang.Class r0 = r0.owner
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Class getDependent() {
            r1 = this;
            java.lang.reflect.Constructor r0 = r1.factory
            int r1 = r1.index
            java.lang.Class r1 = org.simpleframework.xml.core.Reflector.getParameterDependent(r0, r1)
            return r1
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Class[] getDependents() {
            r1 = this;
            java.lang.reflect.Constructor r0 = r1.factory
            int r1 = r1.index
            java.lang.Class[] r1 = org.simpleframework.xml.core.Reflector.getParameterDependents(r0, r1)
            return r1
    }

    @Override // org.simpleframework.xml.core.Contact
    public abstract java.lang.String getName();

    @Override // org.simpleframework.xml.strategy.Type
    public java.lang.Class getType() {
            r1 = this;
            java.lang.reflect.Constructor r0 = r1.factory
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r1 = r1.index
            r1 = r0[r1]
            return r1
    }

    @Override // org.simpleframework.xml.core.Contact
    public boolean isReadOnly() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public void set(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            return
    }

    @Override // org.simpleframework.xml.core.Contact, org.simpleframework.xml.strategy.Type
    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.index
            java.lang.reflect.Constructor r3 = r3.factory
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "parameter "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " of constructor "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
