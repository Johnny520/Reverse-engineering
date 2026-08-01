package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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

    private java.lang.String getDefault() {
            r2 = this;
            org.simpleframework.xml.core.Label r0 = r2.label
            java.lang.String r0 = r0.getOverride()
            boolean r1 = r2.isEmpty(r0)
            if (r1 != 0) goto Ld
            return r0
        Ld:
            org.simpleframework.xml.core.Contact r2 = r2.contact
            java.lang.String r2 = r2.getName()
            return r2
    }

    private java.lang.String getName(java.lang.Class r1) {
            r0 = this;
            java.lang.String r0 = r0.getRoot(r1)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r0 = r1.getSimpleName()
            java.lang.String r0 = org.simpleframework.xml.core.Reflector.getName(r0)
            return r0
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
            r2 = 0
            return r2
    }

    private java.lang.String getRoot(java.lang.Class<?> r2, java.lang.Class<?> r3) {
            r1 = this;
            java.lang.String r2 = r3.getSimpleName()
            java.lang.Class<org.simpleframework.xml.Root> r0 = org.simpleframework.xml.Root.class
            java.lang.annotation.Annotation r3 = r3.getAnnotation(r0)
            org.simpleframework.xml.Root r3 = (org.simpleframework.xml.Root) r3
            if (r3 == 0) goto L1e
            java.lang.String r3 = r3.name()
            boolean r1 = r1.isEmpty(r3)
            if (r1 != 0) goto L19
            return r3
        L19:
            java.lang.String r1 = org.simpleframework.xml.core.Reflector.getName(r2)
            return r1
        L1e:
            r1 = 0
            return r1
    }

    public org.simpleframework.xml.core.Contact getContact() {
            r0 = this;
            org.simpleframework.xml.core.Contact r0 = r0.contact
            return r0
    }

    public org.simpleframework.xml.strategy.Type getDependent() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            org.simpleframework.xml.strategy.Type r0 = r0.getDependent()
            return r0
    }

    public java.lang.String getEntry() {
            r2 = this;
            org.simpleframework.xml.strategy.Type r0 = r2.getDependent()
            java.lang.Class r0 = r0.getType()
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L12
            java.lang.Class r0 = r0.getComponentType()
        L12:
            java.lang.String r2 = r2.getName(r0)
            return r2
    }

    public org.simpleframework.xml.core.Expression getExpression() {
            r3 = this;
            java.lang.String r0 = r3.getPath()
            if (r0 == 0) goto L10
            org.simpleframework.xml.core.PathParser r1 = new org.simpleframework.xml.core.PathParser
            org.simpleframework.xml.core.Contact r2 = r3.contact
            org.simpleframework.xml.stream.Format r3 = r3.format
            r1.<init>(r0, r2, r3)
            return r1
        L10:
            org.simpleframework.xml.core.EmptyExpression r0 = new org.simpleframework.xml.core.EmptyExpression
            org.simpleframework.xml.stream.Format r3 = r3.format
            r0.<init>(r3)
            return r0
    }

    public java.lang.String getName() {
            r2 = this;
            org.simpleframework.xml.core.Label r0 = r2.label
            java.lang.String r0 = r0.getEntry()
            org.simpleframework.xml.core.Label r1 = r2.label
            boolean r1 = r1.isInline()
            if (r1 != 0) goto L13
            java.lang.String r2 = r2.getDefault()
            return r2
        L13:
            return r0
    }

    public java.lang.String getPath() {
            r1 = this;
            org.simpleframework.xml.core.Contact r1 = r1.contact
            java.lang.Class<org.simpleframework.xml.Path> r0 = org.simpleframework.xml.Path.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            org.simpleframework.xml.Path r1 = (org.simpleframework.xml.Path) r1
            if (r1 != 0) goto Le
            r1 = 0
            return r1
        Le:
            java.lang.String r1 = r1.value()
            return r1
    }

    public boolean isEmpty(java.lang.String r1) {
            r0 = this;
            r0 = 1
            if (r1 == 0) goto Lb
            int r1 = r1.length()
            if (r1 != 0) goto La
            return r0
        La:
            r0 = 0
        Lb:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.annotation.Annotation r0 = r1.marker
            org.simpleframework.xml.core.Contact r1 = r1.contact
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r0 = "%s on %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            return r1
    }
}
