package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class CompositeKey implements org.simpleframework.xml.core.Converter {
    private final org.simpleframework.xml.core.Context context;
    private final org.simpleframework.xml.core.Entry entry;
    private final org.simpleframework.xml.core.Traverser root;
    private final org.simpleframework.xml.stream.Style style;
    private final org.simpleframework.xml.strategy.Type type;

    public CompositeKey(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.core.Entry r3, org.simpleframework.xml.strategy.Type r4) {
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

    private java.lang.Object read(org.simpleframework.xml.stream.InputNode r3, java.lang.String r4) {
            r2 = this;
            org.simpleframework.xml.stream.Style r0 = r2.style
            java.lang.String r4 = r0.getElement(r4)
            org.simpleframework.xml.strategy.Type r0 = r2.type
            java.lang.Class r0 = r0.getType()
            if (r4 == 0) goto L12
            org.simpleframework.xml.stream.InputNode r3 = r3.getNext(r4)
        L12:
            r4 = 0
            if (r3 != 0) goto L16
            return r4
        L16:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L1d
            return r4
        L1d:
            org.simpleframework.xml.core.Traverser r2 = r2.root
            java.lang.Object r2 = r2.read(r3, r0)
            return r2
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
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r5) {
            r4 = this;
            org.simpleframework.xml.stream.Position r0 = r5.getPosition()
            org.simpleframework.xml.strategy.Type r1 = r4.type
            java.lang.Class r1 = r1.getType()
            org.simpleframework.xml.core.Entry r2 = r4.entry
            java.lang.String r2 = r2.getKey()
            if (r2 != 0) goto L18
            org.simpleframework.xml.core.Context r2 = r4.context
            java.lang.String r2 = r2.getName(r1)
        L18:
            org.simpleframework.xml.core.Entry r3 = r4.entry
            boolean r3 = r3.isAttribute()
            if (r3 != 0) goto L25
            java.lang.Object r4 = r4.read(r5, r2)
            return r4
        L25:
            org.simpleframework.xml.core.AttributeException r5 = new org.simpleframework.xml.core.AttributeException
            org.simpleframework.xml.core.Entry r4 = r4.entry
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r4, r0}
            java.lang.String r0 = "Can not have %s as an attribute for %s at %s"
            r5.<init>(r0, r4)
            throw r5
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r3, java.lang.Object r4) {
            r2 = this;
            org.simpleframework.xml.stream.Position r0 = r3.getPosition()
            org.simpleframework.xml.strategy.Type r1 = r2.type
            java.lang.Class r1 = r1.getType()
            if (r4 != 0) goto L11
            java.lang.Object r2 = r2.read(r3)
            return r2
        L11:
            org.simpleframework.xml.core.PersistenceException r3 = new org.simpleframework.xml.core.PersistenceException
            org.simpleframework.xml.core.Entry r2 = r2.entry
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r0}
            java.lang.String r4 = "Can not read key of %s for %s at %s"
            r3.<init>(r4, r2)
            throw r3
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(org.simpleframework.xml.stream.InputNode r5) {
            r4 = this;
            org.simpleframework.xml.stream.Position r0 = r5.getPosition()
            org.simpleframework.xml.strategy.Type r1 = r4.type
            java.lang.Class r1 = r1.getType()
            org.simpleframework.xml.core.Entry r2 = r4.entry
            java.lang.String r2 = r2.getKey()
            if (r2 != 0) goto L18
            org.simpleframework.xml.core.Context r2 = r4.context
            java.lang.String r2 = r2.getName(r1)
        L18:
            org.simpleframework.xml.core.Entry r3 = r4.entry
            boolean r3 = r3.isAttribute()
            if (r3 != 0) goto L25
            boolean r4 = r4.validate(r5, r2)
            return r4
        L25:
            org.simpleframework.xml.core.ElementException r5 = new org.simpleframework.xml.core.ElementException
            org.simpleframework.xml.core.Entry r4 = r4.entry
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r4, r0}
            java.lang.String r0 = "Can not have %s as an attribute for %s at %s"
            r5.<init>(r0, r4)
            throw r5
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(org.simpleframework.xml.stream.OutputNode r4, java.lang.Object r5) {
            r3 = this;
            org.simpleframework.xml.strategy.Type r0 = r3.type
            java.lang.Class r0 = r0.getType()
            org.simpleframework.xml.core.Entry r1 = r3.entry
            java.lang.String r1 = r1.getKey()
            org.simpleframework.xml.core.Entry r2 = r3.entry
            boolean r2 = r2.isAttribute()
            if (r2 != 0) goto L28
            if (r1 != 0) goto L1c
            org.simpleframework.xml.core.Context r1 = r3.context
            java.lang.String r1 = r1.getName(r0)
        L1c:
            org.simpleframework.xml.stream.Style r2 = r3.style
            java.lang.String r1 = r2.getElement(r1)
            org.simpleframework.xml.core.Traverser r3 = r3.root
            r3.write(r4, r5, r0, r1)
            return
        L28:
            org.simpleframework.xml.core.ElementException r4 = new org.simpleframework.xml.core.ElementException
            org.simpleframework.xml.core.Entry r3 = r3.entry
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3}
            java.lang.String r5 = "Can not have %s as an attribute for %s"
            r4.<init>(r5, r3)
            throw r4
    }
}
