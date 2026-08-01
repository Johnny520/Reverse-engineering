package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class SignatureScanner {
    private final org.simpleframework.xml.core.SignatureBuilder builder;
    private final java.lang.reflect.Constructor constructor;
    private final org.simpleframework.xml.core.ParameterFactory factory;
    private final org.simpleframework.xml.core.ParameterMap registry;
    private final java.lang.Class type;

    public SignatureScanner(java.lang.reflect.Constructor r2, org.simpleframework.xml.core.ParameterMap r3, org.simpleframework.xml.core.Support r4) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.SignatureBuilder r0 = new org.simpleframework.xml.core.SignatureBuilder
            r0.<init>(r2)
            r1.builder = r0
            org.simpleframework.xml.core.ParameterFactory r0 = new org.simpleframework.xml.core.ParameterFactory
            r0.<init>(r4)
            r1.factory = r0
            java.lang.Class r4 = r2.getDeclaringClass()
            r1.type = r4
            r1.constructor = r2
            r1.registry = r3
            r1.scan(r4)
            return
    }

    private java.util.List<org.simpleframework.xml.core.Parameter> create(java.lang.annotation.Annotation r3, int r4) {
            r2 = this;
            org.simpleframework.xml.core.ParameterFactory r0 = r2.factory
            java.lang.reflect.Constructor r1 = r2.constructor
            org.simpleframework.xml.core.Parameter r3 = r0.getInstance(r1, r3, r4)
            if (r3 == 0) goto Ld
            r2.register(r3)
        Ld:
            java.util.List r2 = java.util.Collections.singletonList(r3)
            return r2
    }

    private java.lang.annotation.Annotation[] extract(java.lang.annotation.Annotation r4) {
            r3 = this;
            java.lang.Class r0 = r4.annotationType()
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L19
            r3 = 0
            r3 = r0[r3]
            r0 = 0
            java.lang.Object r3 = r3.invoke(r4, r0)
            java.lang.annotation.Annotation[] r3 = (java.lang.annotation.Annotation[]) r3
            java.lang.annotation.Annotation[] r3 = (java.lang.annotation.Annotation[]) r3
            return r3
        L19:
            org.simpleframework.xml.core.UnionException r0 = new org.simpleframework.xml.core.UnionException
            java.lang.Class r3 = r3.type
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r3}
            java.lang.String r4 = "Annotation '%s' is not a valid union for %s"
            r0.<init>(r4, r3)
            throw r0
    }

    private java.util.List<org.simpleframework.xml.core.Parameter> process(java.lang.annotation.Annotation r2, int r3) {
            r1 = this;
            boolean r0 = r2 instanceof org.simpleframework.xml.Attribute
            if (r0 == 0) goto L9
            java.util.List r1 = r1.create(r2, r3)
            return r1
        L9:
            boolean r0 = r2 instanceof org.simpleframework.xml.Element
            if (r0 == 0) goto L12
            java.util.List r1 = r1.create(r2, r3)
            return r1
        L12:
            boolean r0 = r2 instanceof org.simpleframework.xml.ElementList
            if (r0 == 0) goto L1b
            java.util.List r1 = r1.create(r2, r3)
            return r1
        L1b:
            boolean r0 = r2 instanceof org.simpleframework.xml.ElementArray
            if (r0 == 0) goto L24
            java.util.List r1 = r1.create(r2, r3)
            return r1
        L24:
            boolean r0 = r2 instanceof org.simpleframework.xml.ElementMap
            if (r0 == 0) goto L2d
            java.util.List r1 = r1.create(r2, r3)
            return r1
        L2d:
            boolean r0 = r2 instanceof org.simpleframework.xml.ElementListUnion
            if (r0 == 0) goto L36
            java.util.List r1 = r1.union(r2, r3)
            return r1
        L36:
            boolean r0 = r2 instanceof org.simpleframework.xml.ElementMapUnion
            if (r0 == 0) goto L3f
            java.util.List r1 = r1.union(r2, r3)
            return r1
        L3f:
            boolean r0 = r2 instanceof org.simpleframework.xml.ElementUnion
            if (r0 == 0) goto L48
            java.util.List r1 = r1.union(r2, r3)
            return r1
        L48:
            boolean r0 = r2 instanceof org.simpleframework.xml.Text
            if (r0 == 0) goto L51
            java.util.List r1 = r1.create(r2, r3)
            return r1
        L51:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            return r1
    }

    private void register(org.simpleframework.xml.core.Parameter r4) {
            r3 = this;
            java.lang.String r0 = r4.getPath()
            java.lang.Object r1 = r4.getKey()
            org.simpleframework.xml.core.ParameterMap r2 = r3.registry
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L13
            r3.validate(r4, r1)
        L13:
            org.simpleframework.xml.core.ParameterMap r2 = r3.registry
            boolean r2 = r2.containsKey(r0)
            if (r2 == 0) goto L1e
            r3.validate(r4, r0)
        L1e:
            org.simpleframework.xml.core.ParameterMap r2 = r3.registry
            r2.put(r0, r4)
            org.simpleframework.xml.core.ParameterMap r3 = r3.registry
            r3.put(r1, r4)
            return
    }

    private void scan(java.lang.Class r3) {
            r2 = this;
            java.lang.reflect.Constructor r3 = r2.constructor
            java.lang.Class[] r3 = r3.getParameterTypes()
            r0 = 0
        L7:
            int r1 = r3.length
            if (r0 >= r1) goto L12
            r1 = r3[r0]
            r2.scan(r1, r0)
            int r0 = r0 + 1
            goto L7
        L12:
            return
    }

    private void scan(java.lang.Class r5, int r6) {
            r4 = this;
            java.lang.reflect.Constructor r5 = r4.constructor
            java.lang.annotation.Annotation[][] r5 = r5.getParameterAnnotations()
            r0 = 0
        L7:
            r1 = r5[r6]
            int r2 = r1.length
            if (r0 >= r2) goto L2b
            r1 = r1[r0]
            java.util.List r1 = r4.process(r1, r6)
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            org.simpleframework.xml.core.Parameter r2 = (org.simpleframework.xml.core.Parameter) r2
            org.simpleframework.xml.core.SignatureBuilder r3 = r4.builder
            r3.insert(r2, r6)
            goto L16
        L28:
            int r0 = r0 + 1
            goto L7
        L2b:
            return
    }

    private java.util.List<org.simpleframework.xml.core.Parameter> union(java.lang.annotation.Annotation r8, int r9) {
            r7 = this;
            org.simpleframework.xml.core.Signature r0 = new org.simpleframework.xml.core.Signature
            java.lang.reflect.Constructor r1 = r7.constructor
            r0.<init>(r1)
            java.lang.annotation.Annotation[] r1 = r7.extract(r8)
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            org.simpleframework.xml.core.ParameterFactory r5 = r7.factory
            java.lang.reflect.Constructor r6 = r7.constructor
            org.simpleframework.xml.core.Parameter r4 = r5.getInstance(r6, r8, r4, r9)
            java.lang.String r5 = r4.getPath()
            boolean r6 = r0.contains(r5)
            if (r6 != 0) goto L2c
            r0.set(r5, r4)
            r7.register(r4)
            int r3 = r3 + 1
            goto Ld
        L2c:
            org.simpleframework.xml.core.UnionException r9 = new org.simpleframework.xml.core.UnionException
            java.lang.Class r7 = r7.type
            java.lang.Object[] r7 = new java.lang.Object[]{r5, r8, r7}
            java.lang.String r8 = "Annotation name '%s' used more than once in %s for %s"
            r9.<init>(r8, r7)
            throw r9
        L3a:
            java.util.List r7 = r0.getAll()
            return r7
    }

    private void validate(org.simpleframework.xml.core.Parameter r4, java.lang.Object r5) {
            r3 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r3.registry
            java.lang.Object r5 = r0.get(r5)
            org.simpleframework.xml.core.Parameter r5 = (org.simpleframework.xml.core.Parameter) r5
            boolean r0 = r4.isText()
            boolean r1 = r5.isText()
            if (r0 == r1) goto L4b
            java.lang.annotation.Annotation r0 = r4.getAnnotation()
            java.lang.annotation.Annotation r1 = r5.getAnnotation()
            java.lang.String r2 = r4.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3d
            java.lang.Class r5 = r5.getType()
            java.lang.Class r4 = r4.getType()
            if (r5 != r4) goto L2f
            goto L4b
        L2f:
            org.simpleframework.xml.core.ConstructorException r4 = new org.simpleframework.xml.core.ConstructorException
            java.lang.Class r3 = r3.type
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r3}
            java.lang.String r5 = "Parameter types do not match for '%s' in %s"
            r4.<init>(r5, r3)
            throw r4
        L3d:
            org.simpleframework.xml.core.ConstructorException r4 = new org.simpleframework.xml.core.ConstructorException
            java.lang.Class r3 = r3.type
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r3}
            java.lang.String r5 = "Annotations do not match for '%s' in %s"
            r4.<init>(r5, r3)
            throw r4
        L4b:
            return
    }

    public java.util.List<org.simpleframework.xml.core.Signature> getSignatures() {
            r0 = this;
            org.simpleframework.xml.core.SignatureBuilder r0 = r0.builder
            java.util.List r0 = r0.build()
            return r0
    }

    public boolean isValid() {
            r0 = this;
            org.simpleframework.xml.core.SignatureBuilder r0 = r0.builder
            boolean r0 = r0.isValid()
            return r0
    }
}
