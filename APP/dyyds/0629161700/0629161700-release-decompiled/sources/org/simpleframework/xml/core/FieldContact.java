package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
            org.simpleframework.xml.util.Cache<java.lang.annotation.Annotation> r6 = r6.cache
            java.lang.Object r6 = r6.fetch(r7)
            java.lang.annotation.Annotation r6 = (java.lang.annotation.Annotation) r6
            return r6
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            java.lang.reflect.Field r0 = r0.field
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.annotation.Annotation getAnnotation() {
            r0 = this;
            java.lang.annotation.Annotation r0 = r0.label
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Type
    public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.annotation.Annotation r0 = r1.label
            java.lang.Class r0 = r0.annotationType()
            if (r2 != r0) goto Lb
            java.lang.annotation.Annotation r1 = r1.label
            return r1
        Lb:
            java.lang.annotation.Annotation r1 = r1.getCache(r2)
            return r1
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Class getDeclaringClass() {
            r0 = this;
            java.lang.reflect.Field r0 = r0.field
            java.lang.Class r0 = r0.getDeclaringClass()
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Class getDependent() {
            r0 = this;
            java.lang.reflect.Field r0 = r0.field
            java.lang.Class r0 = org.simpleframework.xml.core.Reflector.getDependent(r0)
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.Class[] getDependents() {
            r0 = this;
            java.lang.reflect.Field r0 = r0.field
            java.lang.Class[] r0 = org.simpleframework.xml.core.Reflector.getDependents(r0)
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.name
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Type
    public java.lang.Class getType() {
            r0 = this;
            java.lang.reflect.Field r0 = r0.field
            java.lang.Class r0 = r0.getType()
            return r0
    }

    public boolean isFinal() {
            r0 = this;
            int r0 = r0.modifier
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public boolean isReadOnly() {
            r1 = this;
            boolean r0 = r1.isStatic()
            if (r0 != 0) goto Le
            boolean r1 = r1.isFinal()
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public boolean isStatic() {
            r0 = this;
            int r0 = r0.modifier
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            return r0
    }

    @Override // org.simpleframework.xml.core.Contact
    public void set(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r1.isFinal()
            if (r0 != 0) goto Lb
            java.lang.reflect.Field r1 = r1.field
            r1.set(r2, r3)
        Lb:
            return
    }

    @Override // org.simpleframework.xml.core.Contact, org.simpleframework.xml.strategy.Type
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.getName()
            java.lang.reflect.Field r3 = r3.field
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "field '"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "' "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
