package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class FieldContact implements org.simpleframework.xml.core.Contact {
    private final org.simpleframework.xml.util.Cache<java.lang.annotation.Annotation> cache;
    private final java.lang.reflect.Field field;
    private final java.lang.annotation.Annotation label;
    private final java.lang.annotation.Annotation[] list;
    private final int modifier;
    private final java.lang.String name;

    public FieldContact(java.lang.reflect.Field r2, java.lang.annotation.Annotation r3, java.lang.annotation.Annotation[] r4) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.cache = r0
            int r0 = r2.getModifiers()
            r1.modifier = r0
            java.lang.String r0 = r2.getName()
            r1.name = r0
            r1.label = r3
            r1.field = r2
            r1.list = r4
            return
    }

    private <T extends java.lang.annotation.Annotation> T getCache(java.lang.Class<T> r7) {
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
            org.simpleframework.xml.util.Cache<java.lang.annotation.Annotation> r0 = r6.cache
            java.lang.Object r7 = r0.fetch(r7)
            java.lang.annotation.Annotation r7 = (java.lang.annotation.Annotation) r7
            return r7
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Object get(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.annotation.Annotation getAnnotation() {
            r1 = this;
            java.lang.annotation.Annotation r0 = r1.label
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Type
    public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.annotation.Annotation r0 = r1.label
            java.lang.Class r0 = r0.annotationType()
            if (r2 != r0) goto Lb
            java.lang.annotation.Annotation r2 = r1.label
            return r2
        Lb:
            java.lang.annotation.Annotation r2 = r1.getCache(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Class getDeclaringClass() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.Class r0 = r0.getDeclaringClass()
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Class getDependent() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.Class r0 = org.simpleframework.xml.core.Reflector.getDependent(r0)
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Class[] getDependents() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.Class[] r0 = org.simpleframework.xml.core.Reflector.getDependents(r0)
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Type
    public java.lang.Class getType() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.Class r0 = r0.getType()
            return r0
    }

    public boolean isFinal() {
            r1 = this;
            int r0 = r1.modifier
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public boolean isReadOnly() {
            r1 = this;
            boolean r0 = r1.isStatic()
            if (r0 != 0) goto Le
            boolean r0 = r1.isFinal()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public boolean isStatic() {
            r1 = this;
            int r0 = r1.modifier
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public void set(java.lang.Object r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.isFinal()
            if (r0 != 0) goto Lb
            java.lang.reflect.Field r0 = r1.field
            r0.set(r2, r3)
        Lb:
            return
    }

    @Override // org.simpleframework.xml.core.Contact, org.simpleframework.xml.strategy.Type
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.getName()
            java.lang.reflect.Field r1 = r2.field
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "field '%s' %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
