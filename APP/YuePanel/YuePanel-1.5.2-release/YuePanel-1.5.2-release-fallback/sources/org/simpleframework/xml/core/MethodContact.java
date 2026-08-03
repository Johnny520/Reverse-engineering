package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class MethodContact implements org.simpleframework.xml.core.Contact {
    private org.simpleframework.xml.core.MethodPart get;
    private java.lang.Class item;
    private java.lang.Class[] items;
    private java.lang.annotation.Annotation label;
    private java.lang.String name;
    private java.lang.Class owner;
    private org.simpleframework.xml.core.MethodPart set;
    private java.lang.Class type;

    public MethodContact(org.simpleframework.xml.core.MethodPart r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MethodContact(org.simpleframework.xml.core.MethodPart r2, org.simpleframework.xml.core.MethodPart r3) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r2.getDeclaringClass()
            r1.owner = r0
            java.lang.annotation.Annotation r0 = r2.getAnnotation()
            r1.label = r0
            java.lang.Class[] r0 = r2.getDependents()
            r1.items = r0
            java.lang.Class r0 = r2.getDependent()
            r1.item = r0
            java.lang.Class r0 = r2.getType()
            r1.type = r0
            java.lang.String r0 = r2.getName()
            r1.name = r0
            r1.set = r3
            r1.get = r2
            return
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Object get(java.lang.Object r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.MethodPart r0 = r2.get
            java.lang.reflect.Method r0 = r0.getMethod()
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)
            return r3
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.annotation.Annotation getAnnotation() {
            r1 = this;
            java.lang.annotation.Annotation r0 = r1.label
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Type
    public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r3) {
            r2 = this;
            org.simpleframework.xml.core.MethodPart r0 = r2.get
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r3)
            java.lang.annotation.Annotation r1 = r2.label
            java.lang.Class r1 = r1.annotationType()
            if (r3 != r1) goto L11
            java.lang.annotation.Annotation r3 = r2.label
            return r3
        L11:
            if (r0 != 0) goto L1c
            org.simpleframework.xml.core.MethodPart r1 = r2.set
            if (r1 == 0) goto L1c
            java.lang.annotation.Annotation r3 = r1.getAnnotation(r3)
            return r3
        L1c:
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Class getDeclaringClass() {
            r1 = this;
            java.lang.Class r0 = r1.owner
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Class getDependent() {
            r1 = this;
            java.lang.Class r0 = r1.item
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Class[] getDependents() {
            r1 = this;
            java.lang.Class[] r0 = r1.items
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public org.simpleframework.xml.core.MethodPart getRead() {
            r1 = this;
            org.simpleframework.xml.core.MethodPart r0 = r1.get
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Type
    public java.lang.Class getType() {
            r1 = this;
            java.lang.Class r0 = r1.type
            return r0
    }

    public org.simpleframework.xml.core.MethodPart getWrite() {
            r1 = this;
            org.simpleframework.xml.core.MethodPart r0 = r1.set
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public boolean isReadOnly() {
            r1 = this;
            org.simpleframework.xml.core.MethodPart r0 = r1.set
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public void set(java.lang.Object r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.MethodPart r0 = r2.get
            java.lang.reflect.Method r0 = r0.getMethod()
            java.lang.Class r0 = r0.getDeclaringClass()
            org.simpleframework.xml.core.MethodPart r1 = r2.set
            if (r1 == 0) goto L1a
            java.lang.reflect.Method r0 = r1.getMethod()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r0.invoke(r3, r4)
            return
        L1a:
            org.simpleframework.xml.core.MethodException r3 = new org.simpleframework.xml.core.MethodException
            java.lang.String r4 = r2.name
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r0}
            java.lang.String r0 = "Property '%s' is read only in %s"
            r3.<init>(r0, r4)
            throw r3
    }

    @Override // org.simpleframework.xml.core.Contact, org.simpleframework.xml.strategy.Type
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.name
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "method '%s'"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
