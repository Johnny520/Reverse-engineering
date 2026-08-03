package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
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

    private org.simpleframework.xml.core.Composite getComposite(java.lang.Class r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.strategy.Type r0 = r2.getType(r3)
            if (r3 == 0) goto Le
            org.simpleframework.xml.core.Composite r3 = new org.simpleframework.xml.core.Composite
            org.simpleframework.xml.core.Context r1 = r2.context
            r3.<init>(r1, r0)
            return r3
        Le:
            org.simpleframework.xml.core.RootException r3 = new org.simpleframework.xml.core.RootException
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Can not instantiate null class"
            r3.<init>(r1, r0)
            throw r3
    }

    private org.simpleframework.xml.core.Decorator getDecorator(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Context r0 = r1.context
            org.simpleframework.xml.core.Decorator r2 = r0.getDecorator(r2)
            return r2
    }

    private org.simpleframework.xml.strategy.Type getType(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.core.ClassType r0 = new org.simpleframework.xml.core.ClassType
            r0.<init>(r2)
            return r0
    }

    private java.lang.Object read(org.simpleframework.xml.stream.InputNode r1, java.lang.Class r2, java.lang.Object r3) throws java.lang.Exception {
            r0 = this;
            java.lang.String r1 = r0.getName(r2)
            if (r1 == 0) goto L7
            return r3
        L7:
            org.simpleframework.xml.core.RootException r1 = new org.simpleframework.xml.core.RootException
            java.lang.String r3 = "Root annotation required for %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r1.<init>(r3, r2)
            throw r1
    }

    public java.lang.String getName(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Context r0 = r1.context
            java.lang.String r2 = r0.getName(r2)
            org.simpleframework.xml.stream.Style r0 = r1.style
            java.lang.String r2 = r0.getElement(r2)
            return r2
    }

    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r2, java.lang.Class r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Composite r3 = r1.getComposite(r3)
            java.lang.Object r3 = r3.read(r2)
            if (r3 == 0) goto L13
            java.lang.Class r0 = r3.getClass()
            java.lang.Object r2 = r1.read(r2, r0, r3)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            java.lang.Class r0 = r4.getClass()
            org.simpleframework.xml.core.Composite r1 = r2.getComposite(r0)
            java.lang.Object r4 = r1.read(r3, r4)
            java.lang.Object r3 = r2.read(r3, r0, r4)
            return r3
    }

    public boolean validate(org.simpleframework.xml.stream.InputNode r3, java.lang.Class r4) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Composite r0 = r2.getComposite(r4)
            java.lang.String r1 = r2.getName(r4)
            if (r1 == 0) goto Lf
            boolean r3 = r0.validate(r3)
            return r3
        Lf:
            org.simpleframework.xml.core.RootException r3 = new org.simpleframework.xml.core.RootException
            java.lang.String r0 = "Root annotation required for %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r3.<init>(r0, r4)
            throw r3
    }

    public void write(org.simpleframework.xml.stream.OutputNode r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            java.lang.Class r0 = r3.getClass()
            r1.write(r2, r3, r0)
            return
    }

    public void write(org.simpleframework.xml.stream.OutputNode r3, java.lang.Object r4, java.lang.Class r5) throws java.lang.Exception {
            r2 = this;
            java.lang.Class r0 = r4.getClass()
            java.lang.String r1 = r2.getName(r0)
            if (r1 == 0) goto Le
            r2.write(r3, r4, r5, r1)
            return
        Le:
            org.simpleframework.xml.core.RootException r3 = new org.simpleframework.xml.core.RootException
            java.lang.String r4 = "Root annotation required for %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r0}
            r3.<init>(r4, r5)
            throw r3
    }

    public void write(org.simpleframework.xml.stream.OutputNode r2, java.lang.Object r3, java.lang.Class r4, java.lang.String r5) throws java.lang.Exception {
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
            org.simpleframework.xml.core.Composite r4 = r1.getComposite(r5)
            r4.write(r2, r3)
        L26:
            r2.commit()
            return
    }
}
