package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class DetailScanner implements org.simpleframework.xml.core.Detail {
    private org.simpleframework.xml.DefaultType access;
    private org.simpleframework.xml.NamespaceList declaration;
    private java.util.List<org.simpleframework.xml.core.FieldDetail> fields;
    private java.lang.annotation.Annotation[] labels;
    private java.util.List<org.simpleframework.xml.core.MethodDetail> methods;
    private java.lang.String name;
    private org.simpleframework.xml.Namespace namespace;
    private org.simpleframework.xml.Order order;
    private org.simpleframework.xml.DefaultType override;
    private boolean required;
    private org.simpleframework.xml.Root root;
    private boolean strict;
    private java.lang.Class type;

    public DetailScanner(java.lang.Class r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DetailScanner(java.lang.Class r2, org.simpleframework.xml.DefaultType r3) {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.methods = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.fields = r0
            java.lang.annotation.Annotation[] r0 = r2.getDeclaredAnnotations()
            r1.labels = r0
            r1.override = r3
            r3 = 1
            r1.strict = r3
            r1.type = r2
            r1.scan(r2)
            return
    }

    private void access(java.lang.annotation.Annotation r2) {
            r1 = this;
            if (r2 == 0) goto L10
            org.simpleframework.xml.Default r2 = (org.simpleframework.xml.Default) r2
            boolean r0 = r2.required()
            r1.required = r0
            org.simpleframework.xml.DefaultType r2 = r2.value()
            r1.access = r2
        L10:
            return
    }

    private void extract(java.lang.Class r5) {
            r4 = this;
            java.lang.annotation.Annotation[] r5 = r4.labels
            int r0 = r5.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L2e
            r2 = r5[r1]
            boolean r3 = r2 instanceof org.simpleframework.xml.Namespace
            if (r3 == 0) goto Lf
            r4.namespace(r2)
        Lf:
            boolean r3 = r2 instanceof org.simpleframework.xml.NamespaceList
            if (r3 == 0) goto L16
            r4.scope(r2)
        L16:
            boolean r3 = r2 instanceof org.simpleframework.xml.Root
            if (r3 == 0) goto L1d
            r4.root(r2)
        L1d:
            boolean r3 = r2 instanceof org.simpleframework.xml.Order
            if (r3 == 0) goto L24
            r4.order(r2)
        L24:
            boolean r3 = r2 instanceof org.simpleframework.xml.Default
            if (r3 == 0) goto L2b
            r4.access(r2)
        L2b:
            int r1 = r1 + 1
            goto L4
        L2e:
            return
    }

    private void fields(java.lang.Class r5) {
            r4 = this;
            java.lang.reflect.Field[] r5 = r5.getDeclaredFields()
            int r0 = r5.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L17
            r2 = r5[r1]
            org.simpleframework.xml.core.FieldDetail r3 = new org.simpleframework.xml.core.FieldDetail
            r3.<init>(r2)
            java.util.List<org.simpleframework.xml.core.FieldDetail> r2 = r4.fields
            r2.add(r3)
            int r1 = r1 + 1
            goto L6
        L17:
            return
    }

    private boolean isEmpty(java.lang.String r1) {
            r0 = this;
            int r1 = r1.length()
            if (r1 != 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    private void methods(java.lang.Class r5) {
            r4 = this;
            java.lang.reflect.Method[] r5 = r5.getDeclaredMethods()
            int r0 = r5.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L17
            r2 = r5[r1]
            org.simpleframework.xml.core.MethodDetail r3 = new org.simpleframework.xml.core.MethodDetail
            r3.<init>(r2)
            java.util.List<org.simpleframework.xml.core.MethodDetail> r2 = r4.methods
            r2.add(r3)
            int r1 = r1 + 1
            goto L6
        L17:
            return
    }

    private void namespace(java.lang.annotation.Annotation r1) {
            r0 = this;
            if (r1 == 0) goto L6
            org.simpleframework.xml.Namespace r1 = (org.simpleframework.xml.Namespace) r1
            r0.namespace = r1
        L6:
            return
    }

    private void order(java.lang.annotation.Annotation r1) {
            r0 = this;
            if (r1 == 0) goto L6
            org.simpleframework.xml.Order r1 = (org.simpleframework.xml.Order) r1
            r0.order = r1
        L6:
            return
    }

    private void root(java.lang.annotation.Annotation r4) {
            r3 = this;
            if (r4 == 0) goto L22
            org.simpleframework.xml.Root r4 = (org.simpleframework.xml.Root) r4
            java.lang.Class r0 = r3.type
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = r4.name()
            boolean r2 = r3.isEmpty(r1)
            if (r2 == 0) goto L18
            java.lang.String r1 = org.simpleframework.xml.core.Reflector.getName(r0)
        L18:
            boolean r0 = r4.strict()
            r3.strict = r0
            r3.root = r4
            r3.name = r1
        L22:
            return
    }

    private void scan(java.lang.Class r1) {
            r0 = this;
            r0.methods(r1)
            r0.fields(r1)
            r0.extract(r1)
            return
    }

    private void scope(java.lang.annotation.Annotation r1) {
            r0 = this;
            if (r1 == 0) goto L6
            org.simpleframework.xml.NamespaceList r1 = (org.simpleframework.xml.NamespaceList) r1
            r0.declaration = r1
        L6:
            return
    }

    @Override // org.simpleframework.xml.core.Detail
    public org.simpleframework.xml.DefaultType getAccess() {
            r1 = this;
            org.simpleframework.xml.DefaultType r0 = r1.override
            if (r0 == 0) goto L5
            return r0
        L5:
            org.simpleframework.xml.DefaultType r0 = r1.access
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public java.lang.annotation.Annotation[] getAnnotations() {
            r1 = this;
            java.lang.annotation.Annotation[] r0 = r1.labels
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public java.lang.reflect.Constructor[] getConstructors() {
            r1 = this;
            java.lang.Class r0 = r1.type
            java.lang.reflect.Constructor[] r0 = r0.getDeclaredConstructors()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public java.util.List<org.simpleframework.xml.core.FieldDetail> getFields() {
            r1 = this;
            java.util.List<org.simpleframework.xml.core.FieldDetail> r0 = r1.fields
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public java.util.List<org.simpleframework.xml.core.MethodDetail> getMethods() {
            r1 = this;
            java.util.List<org.simpleframework.xml.core.MethodDetail> r0 = r1.methods
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public org.simpleframework.xml.Namespace getNamespace() {
            r1 = this;
            org.simpleframework.xml.Namespace r0 = r1.namespace
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public org.simpleframework.xml.NamespaceList getNamespaceList() {
            r1 = this;
            org.simpleframework.xml.NamespaceList r0 = r1.declaration
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public org.simpleframework.xml.Order getOrder() {
            r1 = this;
            org.simpleframework.xml.Order r0 = r1.order
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public org.simpleframework.xml.DefaultType getOverride() {
            r1 = this;
            org.simpleframework.xml.DefaultType r0 = r1.override
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public org.simpleframework.xml.Root getRoot() {
            r1 = this;
            org.simpleframework.xml.Root r0 = r1.root
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public java.lang.Class getSuper() {
            r2 = this;
            java.lang.Class r0 = r2.type
            java.lang.Class r0 = r0.getSuperclass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Lb
            r0 = 0
        Lb:
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public java.lang.Class getType() {
            r1 = this;
            java.lang.Class r0 = r1.type
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public boolean isInstantiable() {
            r2 = this;
            java.lang.Class r0 = r2.type
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 1
            if (r0 == 0) goto Le
            return r1
        Le:
            java.lang.Class r0 = r2.type
            boolean r0 = r0.isMemberClass()
            r0 = r0 ^ r1
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public boolean isPrimitive() {
            r1 = this;
            java.lang.Class r0 = r1.type
            boolean r0 = r0.isPrimitive()
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public boolean isRequired() {
            r1 = this;
            boolean r0 = r1.required
            return r0
    }

    @Override // org.simpleframework.xml.core.Detail
    public boolean isStrict() {
            r1 = this;
            boolean r0 = r1.strict
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Class r0 = r1.type
            java.lang.String r0 = r0.toString()
            return r0
    }
}
