package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class AnnotationFactory {
    private final org.simpleframework.xml.stream.Format format;
    private final boolean required;

    public AnnotationFactory(org.simpleframework.xml.core.Detail r1, org.simpleframework.xml.core.Support r2) {
            r0 = this;
            r0.<init>()
            boolean r1 = r1.isRequired()
            r0.required = r1
            org.simpleframework.xml.stream.Format r1 = r2.getFormat()
            r0.format = r1
            return
    }

    private java.lang.ClassLoader getClassLoader() throws java.lang.Exception {
            r1 = this;
            java.lang.Class<org.simpleframework.xml.core.AnnotationFactory> r0 = org.simpleframework.xml.core.AnnotationFactory.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            return r0
    }

    private java.lang.annotation.Annotation getInstance(java.lang.Class r5) throws java.lang.Exception {
            r4 = this;
            java.lang.ClassLoader r0 = r4.getClassLoader()
            java.lang.Class r1 = r5.getComponentType()
            boolean r2 = r5.isArray()
            java.lang.Class<org.simpleframework.xml.Element> r3 = org.simpleframework.xml.Element.class
            if (r2 == 0) goto L22
            boolean r5 = r4.isPrimitive(r1)
            if (r5 == 0) goto L1b
            java.lang.annotation.Annotation r5 = r4.getInstance(r0, r3)
            return r5
        L1b:
            java.lang.Class<org.simpleframework.xml.ElementArray> r5 = org.simpleframework.xml.ElementArray.class
            java.lang.annotation.Annotation r5 = r4.getInstance(r0, r5)
            return r5
        L22:
            boolean r5 = r4.isPrimitive(r5)
            if (r5 == 0) goto L35
            boolean r5 = r4.isAttribute()
            if (r5 == 0) goto L35
            java.lang.Class<org.simpleframework.xml.Attribute> r5 = org.simpleframework.xml.Attribute.class
            java.lang.annotation.Annotation r5 = r4.getInstance(r0, r5)
            return r5
        L35:
            java.lang.annotation.Annotation r5 = r4.getInstance(r0, r3)
            return r5
    }

    private java.lang.annotation.Annotation getInstance(java.lang.ClassLoader r2, java.lang.Class r3) throws java.lang.Exception {
            r1 = this;
            r0 = 0
            java.lang.annotation.Annotation r2 = r1.getInstance(r2, r3, r0)
            return r2
    }

    private java.lang.annotation.Annotation getInstance(java.lang.ClassLoader r3, java.lang.Class r4, boolean r5) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.AnnotationHandler r0 = new org.simpleframework.xml.core.AnnotationHandler
            boolean r1 = r2.required
            r0.<init>(r4, r1, r5)
            java.lang.Class[] r4 = new java.lang.Class[]{r4}
            java.lang.Object r3 = java.lang.reflect.Proxy.newProxyInstance(r3, r4, r0)
            java.lang.annotation.Annotation r3 = (java.lang.annotation.Annotation) r3
            return r3
    }

    private boolean isAttribute() {
            r3 = this;
            org.simpleframework.xml.stream.Format r0 = r3.format
            org.simpleframework.xml.stream.Verbosity r0 = r0.getVerbosity()
            r1 = 0
            if (r0 == 0) goto Le
            org.simpleframework.xml.stream.Verbosity r2 = org.simpleframework.xml.stream.Verbosity.LOW
            if (r0 != r2) goto Le
            r1 = 1
        Le:
            return r1
    }

    private boolean isPrimitive(java.lang.Class r3) {
            r2 = this;
            java.lang.Class<java.lang.Number> r0 = java.lang.Number.class
            boolean r0 = r0.isAssignableFrom(r3)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r3 != r0) goto Lf
            return r1
        Lf:
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            if (r3 != r0) goto L14
            return r1
        L14:
            boolean r3 = r3.isPrimitive()
            return r3
    }

    private boolean isPrimitiveKey(java.lang.Class[] r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L24
            int r1 = r3.length
            if (r1 <= 0) goto L24
            r1 = r3[r0]
            java.lang.Class r1 = r1.getSuperclass()
            r3 = r3[r0]
            if (r1 == 0) goto L1f
            boolean r0 = r1.isEnum()
            r1 = 1
            if (r0 == 0) goto L18
            return r1
        L18:
            boolean r0 = r3.isEnum()
            if (r0 == 0) goto L1f
            return r1
        L1f:
            boolean r3 = r2.isPrimitive(r3)
            return r3
        L24:
            return r0
    }

    public java.lang.annotation.Annotation getInstance(java.lang.Class r3, java.lang.Class[] r4) throws java.lang.Exception {
            r2 = this;
            java.lang.ClassLoader r0 = r2.getClassLoader()
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L25
            boolean r3 = r2.isPrimitiveKey(r4)
            java.lang.Class<org.simpleframework.xml.ElementMap> r4 = org.simpleframework.xml.ElementMap.class
            if (r3 == 0) goto L20
            boolean r3 = r2.isAttribute()
            if (r3 == 0) goto L20
            r3 = 1
            java.lang.annotation.Annotation r3 = r2.getInstance(r0, r4, r3)
            return r3
        L20:
            java.lang.annotation.Annotation r3 = r2.getInstance(r0, r4)
            return r3
        L25:
            java.lang.Class<java.util.Collection> r4 = java.util.Collection.class
            boolean r4 = r4.isAssignableFrom(r3)
            if (r4 == 0) goto L34
            java.lang.Class<org.simpleframework.xml.ElementList> r3 = org.simpleframework.xml.ElementList.class
            java.lang.annotation.Annotation r3 = r2.getInstance(r0, r3)
            return r3
        L34:
            java.lang.annotation.Annotation r3 = r2.getInstance(r3)
            return r3
    }
}
