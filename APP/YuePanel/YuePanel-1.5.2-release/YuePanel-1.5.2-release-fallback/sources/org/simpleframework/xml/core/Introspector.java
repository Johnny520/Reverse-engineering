package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class Introspector {
    private final org.simpleframework.xml.core.Contact contact;
    private final org.simpleframework.xml.stream.Format format;
    private final org.simpleframework.xml.core.Label label;
    private final java.lang.annotation.Annotation marker;

    public Introspector(org.simpleframework.xml.core.Contact r2, org.simpleframework.xml.core.Label r3, org.simpleframework.xml.stream.Format r4) {
            r1 = this;
            r1.<init>()
            java.lang.annotation.Annotation r0 = r2.getAnnotation()
            r1.marker = r0
            r1.contact = r2
            r1.format = r4
            r1.label = r3
            return
    }

    private java.lang.String getDefault() throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Label r0 = r2.label
            java.lang.String r0 = r0.getOverride()
            boolean r1 = r2.isEmpty(r0)
            if (r1 != 0) goto Ld
            return r0
        Ld:
            org.simpleframework.xml.core.Contact r0 = r2.contact
            java.lang.String r0 = r0.getName()
            return r0
    }

    private java.lang.String getName(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            java.lang.String r0 = r1.getRoot(r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r2 = org.simpleframework.xml.core.Reflector.getName(r2)
            return r2
    }

    private java.lang.String getRoot(java.lang.Class r3) {
            r2 = this;
            r0 = r3
        L1:
            if (r0 == 0) goto Lf
            java.lang.String r1 = r2.getRoot(r3, r0)
            if (r1 == 0) goto La
            return r1
        La:
            java.lang.Class r0 = r0.getSuperclass()
            goto L1
        Lf:
            r3 = 0
            return r3
    }

    private java.lang.String getRoot(java.lang.Class<?> r2, java.lang.Class<?> r3) {
            r1 = this;
            java.lang.String r2 = r3.getSimpleName()
            java.lang.Class<org.simpleframework.xml.Root> r0 = org.simpleframework.xml.Root.class
            java.lang.annotation.Annotation r3 = r3.getAnnotation(r0)
            org.simpleframework.xml.Root r3 = (org.simpleframework.xml.Root) r3
            if (r3 == 0) goto L1e
            java.lang.String r3 = r3.name()
            boolean r0 = r1.isEmpty(r3)
            if (r0 != 0) goto L19
            return r3
        L19:
            java.lang.String r2 = org.simpleframework.xml.core.Reflector.getName(r2)
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public org.simpleframework.xml.core.Contact getContact() {
            r1 = this;
            org.simpleframework.xml.core.Contact r0 = r1.contact
            return r0
    }

    public org.simpleframework.xml.strategy.Type getDependent() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            org.simpleframework.xml.strategy.Type r0 = r0.getDependent()
            return r0
    }

    public java.lang.String getEntry() throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.strategy.Type r0 = r2.getDependent()
            java.lang.Class r0 = r0.getType()
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L12
            java.lang.Class r0 = r0.getComponentType()
        L12:
            java.lang.String r0 = r2.getName(r0)
            return r0
    }

    public org.simpleframework.xml.core.Expression getExpression() throws java.lang.Exception {
            r4 = this;
            java.lang.String r0 = r4.getPath()
            if (r0 == 0) goto L10
            org.simpleframework.xml.core.PathParser r1 = new org.simpleframework.xml.core.PathParser
            org.simpleframework.xml.core.Contact r2 = r4.contact
            org.simpleframework.xml.stream.Format r3 = r4.format
            r1.<init>(r0, r2, r3)
            return r1
        L10:
            org.simpleframework.xml.core.EmptyExpression r0 = new org.simpleframework.xml.core.EmptyExpression
            org.simpleframework.xml.stream.Format r1 = r4.format
            r0.<init>(r1)
            return r0
    }

    public java.lang.String getName() throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Label r0 = r2.label
            java.lang.String r0 = r0.getEntry()
            org.simpleframework.xml.core.Label r1 = r2.label
            boolean r1 = r1.isInline()
            if (r1 != 0) goto L12
            java.lang.String r0 = r2.getDefault()
        L12:
            return r0
    }

    public java.lang.String getPath() throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Contact r0 = r2.contact
            java.lang.Class<org.simpleframework.xml.Path> r1 = org.simpleframework.xml.Path.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            org.simpleframework.xml.Path r0 = (org.simpleframework.xml.Path) r0
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            java.lang.String r0 = r0.value()
            return r0
    }

    public boolean isEmpty(java.lang.String r2) {
            r1 = this;
            r0 = 1
            if (r2 == 0) goto Lb
            int r2 = r2.length()
            if (r2 != 0) goto La
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.annotation.Annotation r0 = r2.marker
            org.simpleframework.xml.core.Contact r1 = r2.contact
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "%s on %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
