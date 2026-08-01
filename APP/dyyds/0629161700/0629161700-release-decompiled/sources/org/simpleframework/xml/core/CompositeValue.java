package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class CompositeValue implements org.simpleframework.xml.core.Converter {
    private final org.simpleframework.xml.core.Context context;
    private final org.simpleframework.xml.core.Entry entry;
    private final org.simpleframework.xml.core.Traverser root;
    private final org.simpleframework.xml.stream.Style style;
    private final org.simpleframework.xml.strategy.Type type;

    public CompositeValue(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.core.Entry r3, org.simpleframework.xml.strategy.Type r4) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.Traverser r0 = new org.simpleframework.xml.core.Traverser
            r0.<init>(r2)
            r1.root = r0
            org.simpleframework.xml.stream.Style r0 = r2.getStyle()
            r1.style = r0
            r1.context = r2
            r1.entry = r3
            r1.type = r4
            return
    }

    private boolean validate(org.simpleframework.xml.stream.InputNode r3, java.lang.String r4) {
            r2 = this;
            org.simpleframework.xml.stream.Style r0 = r2.style
            java.lang.String r4 = r0.getElement(r4)
            org.simpleframework.xml.stream.InputNode r3 = r3.getNext(r4)
            org.simpleframework.xml.strategy.Type r4 = r2.type
            java.lang.Class r4 = r4.getType()
            r0 = 1
            if (r3 != 0) goto L14
            return r0
        L14:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L1b
            return r0
        L1b:
            org.simpleframework.xml.core.Traverser r2 = r2.root
            boolean r2 = r2.validate(r3, r4)
            return r2
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r4) {
            r3 = this;
            org.simpleframework.xml.stream.InputNode r4 = r4.getNext()
            org.simpleframework.xml.strategy.Type r0 = r3.type
            java.lang.Class r0 = r0.getType()
            r1 = 0
            if (r4 != 0) goto Le
            return r1
        Le:
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L15
            return r1
        L15:
            org.simpleframework.xml.core.Traverser r3 = r3.root
            java.lang.Object r3 = r3.read(r4, r0)
            return r3
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
            java.lang.String r3 = "Can not read value of %s for %s"
            r2.<init>(r3, r1)
            throw r2
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(org.simpleframework.xml.stream.InputNode r3) {
            r2 = this;
            org.simpleframework.xml.strategy.Type r0 = r2.type
            java.lang.Class r0 = r0.getType()
            org.simpleframework.xml.core.Entry r1 = r2.entry
            java.lang.String r1 = r1.getValue()
            if (r1 != 0) goto L14
            org.simpleframework.xml.core.Context r1 = r2.context
            java.lang.String r1 = r1.getName(r0)
        L14:
            boolean r2 = r2.validate(r3, r1)
            return r2
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(org.simpleframework.xml.stream.OutputNode r4, java.lang.Object r5) {
            r3 = this;
            org.simpleframework.xml.strategy.Type r0 = r3.type
            java.lang.Class r0 = r0.getType()
            org.simpleframework.xml.core.Entry r1 = r3.entry
            java.lang.String r1 = r1.getValue()
            if (r1 != 0) goto L14
            org.simpleframework.xml.core.Context r1 = r3.context
            java.lang.String r1 = r1.getName(r0)
        L14:
            org.simpleframework.xml.stream.Style r2 = r3.style
            java.lang.String r1 = r2.getElement(r1)
            org.simpleframework.xml.core.Traverser r3 = r3.root
            r3.write(r4, r5, r0, r1)
            return
    }
}
