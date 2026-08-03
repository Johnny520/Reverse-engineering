package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class PrimitiveValue implements org.simpleframework.xml.core.Converter {
    private final org.simpleframework.xml.core.Context context;
    private final org.simpleframework.xml.core.Entry entry;
    private final org.simpleframework.xml.core.PrimitiveFactory factory;
    private final org.simpleframework.xml.core.Primitive root;
    private final org.simpleframework.xml.stream.Style style;
    private final org.simpleframework.xml.strategy.Type type;

    public PrimitiveValue(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.core.Entry r3, org.simpleframework.xml.strategy.Type r4) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.PrimitiveFactory r0 = new org.simpleframework.xml.core.PrimitiveFactory
            r0.<init>(r2, r4)
            r1.factory = r0
            org.simpleframework.xml.core.Primitive r0 = new org.simpleframework.xml.core.Primitive
            r0.<init>(r2, r4)
            r1.root = r0
            org.simpleframework.xml.stream.Style r0 = r2.getStyle()
            r1.style = r0
            r1.context = r2
            r1.entry = r3
            r1.type = r4
            return
    }

    private boolean isOverridden(org.simpleframework.xml.stream.OutputNode r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.PrimitiveFactory r0 = r2.factory
            org.simpleframework.xml.strategy.Type r1 = r2.type
            boolean r3 = r0.setOverride(r1, r4, r3)
            return r3
    }

    private java.lang.Object readAttribute(org.simpleframework.xml.stream.InputNode r2, java.lang.String r3) throws java.lang.Exception {
            r1 = this;
            if (r3 == 0) goto Lc
            org.simpleframework.xml.stream.Style r0 = r1.style
            java.lang.String r3 = r0.getAttribute(r3)
            org.simpleframework.xml.stream.InputNode r2 = r2.getAttribute(r3)
        Lc:
            if (r2 != 0) goto L10
            r2 = 0
            return r2
        L10:
            org.simpleframework.xml.core.Primitive r3 = r1.root
            java.lang.Object r2 = r3.read(r2)
            return r2
    }

    private java.lang.Object readElement(org.simpleframework.xml.stream.InputNode r2, java.lang.String r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.stream.Style r0 = r1.style
            java.lang.String r3 = r0.getAttribute(r3)
            org.simpleframework.xml.stream.InputNode r2 = r2.getNext(r3)
            if (r2 != 0) goto Le
            r2 = 0
            return r2
        Le:
            org.simpleframework.xml.core.Primitive r3 = r1.root
            java.lang.Object r2 = r3.read(r2)
            return r2
    }

    private boolean validateAttribute(org.simpleframework.xml.stream.InputNode r2, java.lang.String r3) throws java.lang.Exception {
            r1 = this;
            if (r3 == 0) goto Lc
            org.simpleframework.xml.stream.Style r0 = r1.style
            java.lang.String r3 = r0.getAttribute(r3)
            org.simpleframework.xml.stream.InputNode r2 = r2.getNext(r3)
        Lc:
            if (r2 != 0) goto L10
            r2 = 1
            return r2
        L10:
            org.simpleframework.xml.core.Primitive r3 = r1.root
            boolean r2 = r3.validate(r2)
            return r2
    }

    private boolean validateElement(org.simpleframework.xml.stream.InputNode r2, java.lang.String r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.stream.Style r0 = r1.style
            java.lang.String r3 = r0.getAttribute(r3)
            org.simpleframework.xml.stream.InputNode r3 = r2.getNext(r3)
            if (r3 != 0) goto Le
            r2 = 1
            return r2
        Le:
            org.simpleframework.xml.core.Primitive r3 = r1.root
            boolean r2 = r3.validate(r2)
            return r2
    }

    private void writeAttribute(org.simpleframework.xml.stream.OutputNode r2, java.lang.Object r3, java.lang.String r4) throws java.lang.Exception {
            r1 = this;
            if (r3 == 0) goto L14
            if (r4 == 0) goto Lf
            org.simpleframework.xml.stream.Style r0 = r1.style
            java.lang.String r4 = r0.getAttribute(r4)
            r0 = 0
            org.simpleframework.xml.stream.OutputNode r2 = r2.setAttribute(r4, r0)
        Lf:
            org.simpleframework.xml.core.Primitive r4 = r1.root
            r4.write(r2, r3)
        L14:
            return
    }

    private void writeElement(org.simpleframework.xml.stream.OutputNode r2, java.lang.Object r3, java.lang.String r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.stream.Style r0 = r1.style
            java.lang.String r4 = r0.getAttribute(r4)
            org.simpleframework.xml.stream.OutputNode r2 = r2.getChild(r4)
            if (r3 == 0) goto L17
            boolean r4 = r1.isOverridden(r2, r3)
            if (r4 != 0) goto L17
            org.simpleframework.xml.core.Primitive r4 = r1.root
            r4.write(r2, r3)
        L17:
            return
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r4) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.strategy.Type r0 = r3.type
            java.lang.Class r0 = r0.getType()
            org.simpleframework.xml.core.Entry r1 = r3.entry
            java.lang.String r1 = r1.getValue()
            org.simpleframework.xml.core.Entry r2 = r3.entry
            boolean r2 = r2.isInline()
            if (r2 != 0) goto L21
            if (r1 != 0) goto L1c
            org.simpleframework.xml.core.Context r1 = r3.context
            java.lang.String r1 = r1.getName(r0)
        L1c:
            java.lang.Object r4 = r3.readElement(r4, r1)
            return r4
        L21:
            java.lang.Object r4 = r3.readAttribute(r4, r1)
            return r4
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.strategy.Type r0 = r1.type
            java.lang.Class r0 = r0.getType()
            if (r3 != 0) goto Ld
            java.lang.Object r2 = r1.read(r2)
            return r2
        Ld:
            org.simpleframework.xml.core.PersistenceException r2 = new org.simpleframework.xml.core.PersistenceException
            org.simpleframework.xml.core.Entry r3 = r1.entry
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3}
            java.lang.String r0 = "Can not read value of %s for %s"
            r2.<init>(r0, r3)
            throw r2
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(org.simpleframework.xml.stream.InputNode r4) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.strategy.Type r0 = r3.type
            java.lang.Class r0 = r0.getType()
            org.simpleframework.xml.core.Entry r1 = r3.entry
            java.lang.String r1 = r1.getValue()
            org.simpleframework.xml.core.Entry r2 = r3.entry
            boolean r2 = r2.isInline()
            if (r2 != 0) goto L21
            if (r1 != 0) goto L1c
            org.simpleframework.xml.core.Context r1 = r3.context
            java.lang.String r1 = r1.getName(r0)
        L1c:
            boolean r4 = r3.validateElement(r4, r1)
            return r4
        L21:
            boolean r4 = r3.validateAttribute(r4, r1)
            return r4
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(org.simpleframework.xml.stream.OutputNode r4, java.lang.Object r5) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.strategy.Type r0 = r3.type
            java.lang.Class r0 = r0.getType()
            org.simpleframework.xml.core.Entry r1 = r3.entry
            java.lang.String r1 = r1.getValue()
            org.simpleframework.xml.core.Entry r2 = r3.entry
            boolean r2 = r2.isInline()
            if (r2 != 0) goto L20
            if (r1 != 0) goto L1c
            org.simpleframework.xml.core.Context r1 = r3.context
            java.lang.String r1 = r1.getName(r0)
        L1c:
            r3.writeElement(r4, r5, r1)
            goto L23
        L20:
            r3.writeAttribute(r4, r5, r1)
        L23:
            return
    }
}
