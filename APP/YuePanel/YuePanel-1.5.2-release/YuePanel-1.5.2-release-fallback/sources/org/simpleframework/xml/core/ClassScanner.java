package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ClassScanner {
    private org.simpleframework.xml.core.Function commit;
    private org.simpleframework.xml.core.Function complete;
    private org.simpleframework.xml.core.NamespaceDecorator decorator;
    private org.simpleframework.xml.Order order;
    private org.simpleframework.xml.core.Function persist;
    private org.simpleframework.xml.core.Function replace;
    private org.simpleframework.xml.core.Function resolve;
    private org.simpleframework.xml.Root root;
    private org.simpleframework.xml.core.ConstructorScanner scanner;
    private org.simpleframework.xml.core.Support support;
    private org.simpleframework.xml.core.Function validate;

    public ClassScanner(org.simpleframework.xml.core.Detail r2, org.simpleframework.xml.core.Support r3) throws java.lang.Exception {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.ConstructorScanner r0 = new org.simpleframework.xml.core.ConstructorScanner
            r0.<init>(r2, r3)
            r1.scanner = r0
            org.simpleframework.xml.core.NamespaceDecorator r0 = new org.simpleframework.xml.core.NamespaceDecorator
            r0.<init>()
            r1.decorator = r0
            r1.support = r3
            r1.scan(r2)
            return
    }

    private void commit(java.lang.reflect.Method r2) {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.commit
            if (r0 != 0) goto La
            org.simpleframework.xml.core.Function r2 = r1.getFunction(r2)
            r1.commit = r2
        La:
            return
    }

    private void commit(org.simpleframework.xml.core.Detail r2) {
            r1 = this;
            org.simpleframework.xml.Namespace r2 = r2.getNamespace()
            if (r2 == 0) goto Lb
            org.simpleframework.xml.core.NamespaceDecorator r0 = r1.decorator
            r0.set(r2)
        Lb:
            return
    }

    private void complete(java.lang.reflect.Method r2) {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.complete
            if (r0 != 0) goto La
            org.simpleframework.xml.core.Function r2 = r1.getFunction(r2)
            r1.complete = r2
        La:
            return
    }

    private void definition(org.simpleframework.xml.core.Detail r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.Root r0 = r1.root
            if (r0 != 0) goto La
            org.simpleframework.xml.Root r0 = r2.getRoot()
            r1.root = r0
        La:
            org.simpleframework.xml.Order r0 = r1.order
            if (r0 != 0) goto L14
            org.simpleframework.xml.Order r2 = r2.getOrder()
            r1.order = r2
        L14:
            return
    }

    private org.simpleframework.xml.core.Function getFunction(java.lang.reflect.Method r3) {
            r2 = this;
            boolean r0 = r2.isContextual(r3)
            boolean r1 = r3.isAccessible()
            if (r1 != 0) goto Le
            r1 = 1
            r3.setAccessible(r1)
        Le:
            org.simpleframework.xml.core.Function r1 = new org.simpleframework.xml.core.Function
            r1.<init>(r3, r0)
            return r1
    }

    private boolean isContextual(java.lang.reflect.Method r4) {
            r3 = this;
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r0 = r4.length
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L12
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            r4 = r4[r2]
            boolean r4 = r0.equals(r4)
            return r4
        L12:
            return r2
    }

    private void method(org.simpleframework.xml.core.Detail r2) throws java.lang.Exception {
            r1 = this;
            java.util.List r2 = r2.getMethods()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            org.simpleframework.xml.core.MethodDetail r0 = (org.simpleframework.xml.core.MethodDetail) r0
            r1.method(r0)
            goto L8
        L18:
            return
    }

    private void method(org.simpleframework.xml.core.MethodDetail r6) {
            r5 = this;
            java.lang.annotation.Annotation[] r0 = r6.getAnnotations()
            java.lang.reflect.Method r6 = r6.getMethod()
            int r1 = r0.length
            r2 = 0
        La:
            if (r2 >= r1) goto L3b
            r3 = r0[r2]
            boolean r4 = r3 instanceof org.simpleframework.xml.core.Commit
            if (r4 == 0) goto L15
            r5.commit(r6)
        L15:
            boolean r4 = r3 instanceof org.simpleframework.xml.core.Validate
            if (r4 == 0) goto L1c
            r5.validate(r6)
        L1c:
            boolean r4 = r3 instanceof org.simpleframework.xml.core.Persist
            if (r4 == 0) goto L23
            r5.persist(r6)
        L23:
            boolean r4 = r3 instanceof org.simpleframework.xml.core.Complete
            if (r4 == 0) goto L2a
            r5.complete(r6)
        L2a:
            boolean r4 = r3 instanceof org.simpleframework.xml.core.Replace
            if (r4 == 0) goto L31
            r5.replace(r6)
        L31:
            boolean r3 = r3 instanceof org.simpleframework.xml.core.Resolve
            if (r3 == 0) goto L38
            r5.resolve(r6)
        L38:
            int r2 = r2 + 1
            goto La
        L3b:
            return
    }

    private void namespace(org.simpleframework.xml.core.Detail r5) throws java.lang.Exception {
            r4 = this;
            org.simpleframework.xml.NamespaceList r0 = r5.getNamespaceList()
            org.simpleframework.xml.Namespace r5 = r5.getNamespace()
            if (r5 == 0) goto Lf
            org.simpleframework.xml.core.NamespaceDecorator r1 = r4.decorator
            r1.add(r5)
        Lf:
            if (r0 == 0) goto L23
            org.simpleframework.xml.Namespace[] r5 = r0.value()
            int r0 = r5.length
            r1 = 0
        L17:
            if (r1 >= r0) goto L23
            r2 = r5[r1]
            org.simpleframework.xml.core.NamespaceDecorator r3 = r4.decorator
            r3.add(r2)
            int r1 = r1 + 1
            goto L17
        L23:
            return
    }

    private void persist(java.lang.reflect.Method r2) {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.persist
            if (r0 != 0) goto La
            org.simpleframework.xml.core.Function r2 = r1.getFunction(r2)
            r1.persist = r2
        La:
            return
    }

    private void replace(java.lang.reflect.Method r2) {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.replace
            if (r0 != 0) goto La
            org.simpleframework.xml.core.Function r2 = r1.getFunction(r2)
            r1.replace = r2
        La:
            return
    }

    private void resolve(java.lang.reflect.Method r2) {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.resolve
            if (r0 != 0) goto La
            org.simpleframework.xml.core.Function r2 = r1.getFunction(r2)
            r1.resolve = r2
        La:
            return
    }

    private void scan(org.simpleframework.xml.core.Detail r4) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.DefaultType r0 = r4.getOverride()
            java.lang.Class r1 = r4.getType()
        L8:
            if (r1 == 0) goto L1e
            org.simpleframework.xml.core.Support r2 = r3.support
            org.simpleframework.xml.core.Detail r1 = r2.getDetail(r1, r0)
            r3.namespace(r1)
            r3.method(r1)
            r3.definition(r1)
            java.lang.Class r1 = r1.getSuper()
            goto L8
        L1e:
            r3.commit(r4)
            return
    }

    private void validate(java.lang.reflect.Method r2) {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.validate
            if (r0 != 0) goto La
            org.simpleframework.xml.core.Function r2 = r1.getFunction(r2)
            r1.validate = r2
        La:
            return
    }

    public org.simpleframework.xml.core.Function getCommit() {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.commit
            return r0
    }

    public org.simpleframework.xml.core.Function getComplete() {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.complete
            return r0
    }

    public org.simpleframework.xml.core.Decorator getDecorator() {
            r1 = this;
            org.simpleframework.xml.core.NamespaceDecorator r0 = r1.decorator
            return r0
    }

    public org.simpleframework.xml.Order getOrder() {
            r1 = this;
            org.simpleframework.xml.Order r0 = r1.order
            return r0
    }

    public org.simpleframework.xml.core.ParameterMap getParameters() {
            r1 = this;
            org.simpleframework.xml.core.ConstructorScanner r0 = r1.scanner
            org.simpleframework.xml.core.ParameterMap r0 = r0.getParameters()
            return r0
    }

    public org.simpleframework.xml.core.Function getPersist() {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.persist
            return r0
    }

    public org.simpleframework.xml.core.Function getReplace() {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.replace
            return r0
    }

    public org.simpleframework.xml.core.Function getResolve() {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.resolve
            return r0
    }

    public org.simpleframework.xml.Root getRoot() {
            r1 = this;
            org.simpleframework.xml.Root r0 = r1.root
            return r0
    }

    public org.simpleframework.xml.core.Signature getSignature() {
            r1 = this;
            org.simpleframework.xml.core.ConstructorScanner r0 = r1.scanner
            org.simpleframework.xml.core.Signature r0 = r0.getSignature()
            return r0
    }

    public java.util.List<org.simpleframework.xml.core.Signature> getSignatures() {
            r1 = this;
            org.simpleframework.xml.core.ConstructorScanner r0 = r1.scanner
            java.util.List r0 = r0.getSignatures()
            return r0
    }

    public org.simpleframework.xml.core.Function getValidate() {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.validate
            return r0
    }
}
