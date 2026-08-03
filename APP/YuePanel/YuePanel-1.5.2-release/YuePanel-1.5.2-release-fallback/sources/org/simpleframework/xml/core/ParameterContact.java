package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
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
            r1 = 0
            return r1
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.annotation.Annotation getAnnotation() {
            r1 = this;
            T extends java.lang.annotation.Annotation r0 = r1.label
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Type
    public <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class<A> r6) {
            r5 = this;
            java.lang.annotation.Annotation[] r0 = r5.labels
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L16
            r3 = r0[r2]
            java.lang.Class r4 = r3.annotationType()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L13
            return r3
        L13:
            int r2 = r2 + 1
            goto L4
        L16:
            r6 = 0
            return r6
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Class getDeclaringClass() {
            r1 = this;
            java.lang.Class r0 = r1.owner
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Class getDependent() {
            r2 = this;
            java.lang.reflect.Constructor r0 = r2.factory
            int r1 = r2.index
            java.lang.Class r0 = org.simpleframework.xml.core.Reflector.getParameterDependent(r0, r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Class[] getDependents() {
            r2 = this;
            java.lang.reflect.Constructor r0 = r2.factory
            int r1 = r2.index
            java.lang.Class[] r0 = org.simpleframework.xml.core.Reflector.getParameterDependents(r0, r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public abstract java.lang.String getName();

    @Override // org.simpleframework.xml.strategy.Type
    public java.lang.Class getType() {
            r2 = this;
            java.lang.reflect.Constructor r0 = r2.factory
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r1 = r2.index
            r0 = r0[r1]
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public boolean isReadOnly() {
            r1 = this;
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
            r2 = this;
            int r0 = r2.index
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.reflect.Constructor r1 = r2.factory
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "parameter %s of constructor %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
