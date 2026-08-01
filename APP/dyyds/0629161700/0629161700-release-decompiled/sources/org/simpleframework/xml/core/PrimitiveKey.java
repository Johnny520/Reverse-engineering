package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class PrimitiveKey implements org.simpleframework.xml.core.Converter {
    private final org.simpleframework.xml.core.Context context;
    private final org.simpleframework.xml.core.Entry entry;
    private final org.simpleframework.xml.core.PrimitiveFactory factory;
    private final org.simpleframework.xml.core.Primitive root;
    private final org.simpleframework.xml.stream.Style style;
    private final org.simpleframework.xml.strategy.Type type;

    public PrimitiveKey(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.core.Entry r3, org.simpleframework.xml.strategy.Type r4) {
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

    private boolean isOverridden(org.simpleframework.xml.stream.OutputNode r2, java.lang.Object r3) {
            r1 = this;
            org.simpleframework.xml.core.PrimitiveFactory r0 = r1.factory
            org.simpleframework.xml.strategy.Type r1 = r1.type
            boolean r1 = r0.setOverride(r1, r3, r2)
            return r1
    }

    private java.lang.Object readAttribute(org.simpleframework.xml.stream.InputNode r2, java.lang.String r3) {
            r1 = this;
            org.simpleframework.xml.stream.Style r0 = r1.style
            java.lang.String r3 = r0.getAttribute(r3)
            org.simpleframework.xml.stream.InputNode r2 = r2.getAttribute(r3)
            if (r2 != 0) goto Le
            r1 = 0
            return r1
        Le:
            org.simpleframework.xml.core.Primitive r1 = r1.root
            java.lang.Object r1 = r1.read(r2)
            return r1
    }

    private java.lang.Object readElement(org.simpleframework.xml.stream.InputNode r2, java.lang.String r3) {
            r1 = this;
            org.simpleframework.xml.stream.Style r0 = r1.style
            java.lang.String r3 = r0.getElement(r3)
            org.simpleframework.xml.stream.InputNode r2 = r2.getNext(r3)
            if (r2 != 0) goto Le
            r1 = 0
            return r1
        Le:
            org.simpleframework.xml.core.Primitive r1 = r1.root
            java.lang.Object r1 = r1.read(r2)
            return r1
    }

    private boolean validateAttribute(org.simpleframework.xml.stream.InputNode r2, java.lang.String r3) {
            r1 = this;
            org.simpleframework.xml.stream.Style r0 = r1.style
            java.lang.String r3 = r0.getElement(r3)
            org.simpleframework.xml.stream.InputNode r2 = r2.getAttribute(r3)
            if (r2 != 0) goto Le
            r1 = 1
            return r1
        Le:
            org.simpleframework.xml.core.Primitive r1 = r1.root
            boolean r1 = r1.validate(r2)
            return r1
    }

    private boolean validateElement(org.simpleframework.xml.stream.InputNode r2, java.lang.String r3) {
            r1 = this;
            org.simpleframework.xml.stream.Style r0 = r1.style
            java.lang.String r3 = r0.getElement(r3)
            org.simpleframework.xml.stream.InputNode r2 = r2.getNext(r3)
            if (r2 != 0) goto Le
            r1 = 1
            return r1
        Le:
            org.simpleframework.xml.core.Primitive r1 = r1.root
            boolean r1 = r1.validate(r2)
            return r1
    }

    private void writeAttribute(org.simpleframework.xml.stream.OutputNode r3, java.lang.Object r4) {
            r2 = this;
            org.simpleframework.xml.strategy.Type r0 = r2.type
            java.lang.Class r0 = r0.getType()
            org.simpleframework.xml.core.PrimitiveFactory r1 = r2.factory
            java.lang.String r4 = r1.getText(r4)
            org.simpleframework.xml.core.Entry r1 = r2.entry
            java.lang.String r1 = r1.getKey()
            if (r1 != 0) goto L1a
            org.simpleframework.xml.core.Context r1 = r2.context
            java.lang.String r1 = r1.getName(r0)
        L1a:
            org.simpleframework.xml.stream.Style r2 = r2.style
            java.lang.String r2 = r2.getAttribute(r1)
            if (r4 == 0) goto L25
            r3.setAttribute(r2, r4)
        L25:
            return
    }

    private void writeElement(org.simpleframework.xml.stream.OutputNode r3, java.lang.Object r4) {
            r2 = this;
            org.simpleframework.xml.strategy.Type r0 = r2.type
            java.lang.Class r0 = r0.getType()
            org.simpleframework.xml.core.Entry r1 = r2.entry
            java.lang.String r1 = r1.getKey()
            if (r1 != 0) goto L14
            org.simpleframework.xml.core.Context r1 = r2.context
            java.lang.String r1 = r1.getName(r0)
        L14:
            org.simpleframework.xml.stream.Style r0 = r2.style
            java.lang.String r0 = r0.getElement(r1)
            org.simpleframework.xml.stream.OutputNode r3 = r3.getChild(r0)
            if (r4 == 0) goto L2b
            boolean r0 = r2.isOverridden(r3, r4)
            if (r0 != 0) goto L2b
            org.simpleframework.xml.core.Primitive r2 = r2.root
            r2.write(r3, r4)
        L2b:
            return
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r3) {
            r2 = this;
            org.simpleframework.xml.strategy.Type r0 = r2.type
            java.lang.Class r0 = r0.getType()
            org.simpleframework.xml.core.Entry r1 = r2.entry
            java.lang.String r1 = r1.getKey()
            if (r1 != 0) goto L14
            org.simpleframework.xml.core.Context r1 = r2.context
            java.lang.String r1 = r1.getName(r0)
        L14:
            org.simpleframework.xml.core.Entry r0 = r2.entry
            boolean r0 = r0.isAttribute()
            if (r0 != 0) goto L21
            java.lang.Object r2 = r2.readElement(r3, r1)
            return r2
        L21:
            java.lang.Object r2 = r2.readAttribute(r3, r1)
            return r2
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r2, java.lang.Object r3) {
            r1 = this;
            org.simpleframework.xml.strategy.Type r0 = r1.type
            java.lang.Class r0 = r0.getType()
            if (r3 != 0) goto Ld
            java.lang.Object r1 = r1.read(r2)
            return r1
        Ld:
            org.simpleframework.xml.core.PersistenceException r2 = new org.simpleframework.xml.core.PersistenceException
            org.simpleframework.xml.core.Entry r1 = r1.entry
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r3 = "Can not read key of %s for %s"
            r2.<init>(r3, r1)
            throw r2
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(org.simpleframework.xml.stream.InputNode r3) {
            r2 = this;
            org.simpleframework.xml.strategy.Type r0 = r2.type
            java.lang.Class r0 = r0.getType()
            org.simpleframework.xml.core.Entry r1 = r2.entry
            java.lang.String r1 = r1.getKey()
            if (r1 != 0) goto L14
            org.simpleframework.xml.core.Context r1 = r2.context
            java.lang.String r1 = r1.getName(r0)
        L14:
            org.simpleframework.xml.core.Entry r0 = r2.entry
            boolean r0 = r0.isAttribute()
            if (r0 != 0) goto L21
            boolean r2 = r2.validateElement(r3, r1)
            return r2
        L21:
            boolean r2 = r2.validateAttribute(r3, r1)
            return r2
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(org.simpleframework.xml.stream.OutputNode r2, java.lang.Object r3) {
            r1 = this;
            org.simpleframework.xml.core.Entry r0 = r1.entry
            boolean r0 = r0.isAttribute()
            if (r0 != 0) goto Lc
            r1.writeElement(r2, r3)
            return
        Lc:
            if (r3 == 0) goto L11
            r1.writeAttribute(r2, r3)
        L11:
            return
    }
}
