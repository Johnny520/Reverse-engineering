package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class Traverser {
    private final org.simpleframework.xml.core.Context context;
    private final org.simpleframework.xml.stream.Style style;

    public Traverser(org.simpleframework.xml.core.Context r2) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.stream.Style r0 = r2.getStyle()
            r1.style = r0
            r1.context = r2
            return
    }

    private org.simpleframework.xml.core.Composite getComposite(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.strategy.Type r0 = r1.getType(r2)
            if (r2 == 0) goto Le
            org.simpleframework.xml.core.Composite r2 = new org.simpleframework.xml.core.Composite
            org.simpleframework.xml.core.Context r1 = r1.context
            r2.<init>(r1, r0)
            return r2
        Le:
            org.simpleframework.xml.core.RootException r1 = new org.simpleframework.xml.core.RootException
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = "Can not instantiate null class"
            r1.<init>(r0, r2)
            throw r1
    }

    private org.simpleframework.xml.core.Decorator getDecorator(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.Context r0 = r0.context
            org.simpleframework.xml.core.Decorator r0 = r0.getDecorator(r1)
            return r0
    }

    private org.simpleframework.xml.strategy.Type getType(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.ClassType r0 = new org.simpleframework.xml.core.ClassType
            r0.<init>(r1)
            return r0
    }

    private java.lang.Object read(org.simpleframework.xml.stream.InputNode r1, java.lang.Class r2, java.lang.Object r3) {
            r0 = this;
            java.lang.String r0 = r0.getName(r2)
            if (r0 == 0) goto L7
            return r3
        L7:
            org.simpleframework.xml.core.RootException r0 = new org.simpleframework.xml.core.RootException
            java.lang.String r1 = "Root annotation required for %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r0.<init>(r1, r2)
            throw r0
    }

    public java.lang.String getName(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.core.Context r0 = r1.context
            java.lang.String r2 = r0.getName(r2)
            org.simpleframework.xml.stream.Style r1 = r1.style
            java.lang.String r1 = r1.getElement(r2)
            return r1
    }

    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r2, java.lang.Class r3) {
            r1 = this;
            org.simpleframework.xml.core.Composite r3 = r1.getComposite(r3)
            java.lang.Object r3 = r3.read(r2)
            if (r3 == 0) goto L13
            java.lang.Class r0 = r3.getClass()
            java.lang.Object r1 = r1.read(r2, r0, r3)
            return r1
        L13:
            r1 = 0
            return r1
    }

    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Class r0 = r4.getClass()
            org.simpleframework.xml.core.Composite r1 = r2.getComposite(r0)
            java.lang.Object r4 = r1.read(r3, r4)
            java.lang.Object r2 = r2.read(r3, r0, r4)
            return r2
    }

    public boolean validate(org.simpleframework.xml.stream.InputNode r2, java.lang.Class r3) {
            r1 = this;
            org.simpleframework.xml.core.Composite r0 = r1.getComposite(r3)
            java.lang.String r1 = r1.getName(r3)
            if (r1 == 0) goto Lf
            boolean r1 = r0.validate(r2)
            return r1
        Lf:
            org.simpleframework.xml.core.RootException r1 = new org.simpleframework.xml.core.RootException
            java.lang.String r2 = "Root annotation required for %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r1.<init>(r2, r3)
            throw r1
    }

    public void write(org.simpleframework.xml.stream.OutputNode r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Class r0 = r3.getClass()
            r1.write(r2, r3, r0)
            return
    }

    public void write(org.simpleframework.xml.stream.OutputNode r3, java.lang.Object r4, java.lang.Class r5) {
            r2 = this;
            java.lang.Class r0 = r4.getClass()
            java.lang.String r1 = r2.getName(r0)
            if (r1 == 0) goto Le
            r2.write(r3, r4, r5, r1)
            return
        Le:
            org.simpleframework.xml.core.RootException r2 = new org.simpleframework.xml.core.RootException
            java.lang.String r3 = "Root annotation required for %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r0}
            r2.<init>(r3, r4)
            throw r2
    }

    public void write(org.simpleframework.xml.stream.OutputNode r2, java.lang.Object r3, java.lang.Class r4, java.lang.String r5) {
            r1 = this;
            org.simpleframework.xml.stream.OutputNode r2 = r2.getChild(r5)
            org.simpleframework.xml.strategy.Type r4 = r1.getType(r4)
            if (r3 == 0) goto L26
            java.lang.Class r5 = r3.getClass()
            org.simpleframework.xml.core.Decorator r0 = r1.getDecorator(r5)
            if (r0 == 0) goto L17
            r0.decorate(r2)
        L17:
            org.simpleframework.xml.core.Context r0 = r1.context
            boolean r4 = r0.setOverride(r4, r3, r2)
            if (r4 != 0) goto L26
            org.simpleframework.xml.core.Composite r1 = r1.getComposite(r5)
            r1.write(r2, r3)
        L26:
            r2.commit()
            return
    }
}
