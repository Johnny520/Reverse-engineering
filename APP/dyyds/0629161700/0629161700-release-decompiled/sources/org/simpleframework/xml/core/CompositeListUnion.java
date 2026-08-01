package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class CompositeListUnion implements org.simpleframework.xml.core.Repeater {
    private final org.simpleframework.xml.core.Context context;
    private final org.simpleframework.xml.core.LabelMap elements;
    private final org.simpleframework.xml.core.Group group;
    private final org.simpleframework.xml.core.Expression path;
    private final org.simpleframework.xml.stream.Style style;
    private final org.simpleframework.xml.strategy.Type type;

    public CompositeListUnion(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.core.Group r3, org.simpleframework.xml.core.Expression r4, org.simpleframework.xml.strategy.Type r5) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.LabelMap r0 = r3.getElements()
            r1.elements = r0
            org.simpleframework.xml.stream.Style r0 = r2.getStyle()
            r1.style = r0
            r1.context = r2
            r1.group = r3
            r1.type = r5
            r1.path = r4
            return
    }

    private java.lang.Object readElement(org.simpleframework.xml.stream.InputNode r3) {
            r2 = this;
            java.lang.String r0 = r3.getName()
            org.simpleframework.xml.core.Expression r1 = r2.path
            java.lang.String r0 = r1.getElement(r0)
            org.simpleframework.xml.core.LabelMap r1 = r2.elements
            java.lang.Object r0 = r1.get(r0)
            org.simpleframework.xml.core.Label r0 = (org.simpleframework.xml.core.Label) r0
            org.simpleframework.xml.core.Context r2 = r2.context
            org.simpleframework.xml.core.Converter r2 = r0.getConverter(r2)
            java.lang.Object r2 = r2.read(r3)
            return r2
    }

    private java.lang.Object readElement(org.simpleframework.xml.stream.InputNode r3, java.lang.Object r4) {
            r2 = this;
            java.lang.String r0 = r3.getName()
            org.simpleframework.xml.core.Expression r1 = r2.path
            java.lang.String r0 = r1.getElement(r0)
            org.simpleframework.xml.core.LabelMap r1 = r2.elements
            java.lang.Object r0 = r1.get(r0)
            org.simpleframework.xml.core.Label r0 = (org.simpleframework.xml.core.Label) r0
            org.simpleframework.xml.core.Context r2 = r2.context
            org.simpleframework.xml.core.Converter r2 = r0.getConverter(r2)
            java.lang.Object r2 = r2.read(r3, r4)
            return r2
    }

    private java.lang.Object readText(org.simpleframework.xml.stream.InputNode r2) {
            r1 = this;
            org.simpleframework.xml.core.Group r0 = r1.group
            org.simpleframework.xml.core.Label r0 = r0.getText()
            org.simpleframework.xml.core.Context r1 = r1.context
            org.simpleframework.xml.core.Converter r1 = r0.getConverter(r1)
            java.lang.Object r1 = r1.read(r2)
            return r1
    }

    private java.lang.Object readText(org.simpleframework.xml.stream.InputNode r2, java.lang.Object r3) {
            r1 = this;
            org.simpleframework.xml.core.Group r0 = r1.group
            org.simpleframework.xml.core.Label r0 = r0.getText()
            org.simpleframework.xml.core.Context r1 = r1.context
            org.simpleframework.xml.core.Converter r1 = r0.getConverter(r1)
            org.simpleframework.xml.stream.InputNode r2 = r2.getParent()
            java.lang.Object r1 = r1.read(r2, r3)
            return r1
    }

    private void write(org.simpleframework.xml.stream.OutputNode r3, java.lang.Object r4, org.simpleframework.xml.core.Label r5) {
            r2 = this;
            org.simpleframework.xml.core.Context r0 = r2.context
            org.simpleframework.xml.core.Converter r0 = r5.getConverter(r0)
            java.util.Set r4 = java.util.Collections.singleton(r4)
            boolean r1 = r5.isInline()
            if (r1 != 0) goto L23
            java.lang.String r5 = r5.getName()
            org.simpleframework.xml.stream.Style r2 = r2.style
            java.lang.String r2 = r2.getElement(r5)
            boolean r5 = r3.isCommitted()
            if (r5 != 0) goto L23
            r3.setName(r2)
        L23:
            r0.write(r3, r4)
            return
    }

    private void write(org.simpleframework.xml.stream.OutputNode r4, java.util.Collection r5) {
            r3 = this;
            java.util.Iterator r5 = r5.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r5.next()
            if (r0 == 0) goto L4
            java.lang.Class r1 = r0.getClass()
            org.simpleframework.xml.core.Group r2 = r3.group
            org.simpleframework.xml.core.Label r2 = r2.getLabel(r1)
            if (r2 == 0) goto L20
            r3.write(r4, r0, r2)
            goto L4
        L20:
            org.simpleframework.xml.core.UnionException r4 = new org.simpleframework.xml.core.UnionException
            org.simpleframework.xml.strategy.Type r5 = r3.type
            org.simpleframework.xml.core.Group r3 = r3.group
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r5, r3}
            java.lang.String r5 = "Entry of %s not declared in %s with annotation %s"
            r4.<init>(r5, r3)
            throw r4
        L30:
            return
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r2) {
            r1 = this;
            org.simpleframework.xml.core.Group r0 = r1.group
            org.simpleframework.xml.core.Label r0 = r0.getText()
            if (r0 != 0) goto Ld
            java.lang.Object r1 = r1.readElement(r2)
            return r1
        Ld:
            java.lang.Object r1 = r1.readText(r2)
            return r1
    }

    @Override // org.simpleframework.xml.core.Repeater, org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Object r0 = r2.readElement(r3, r4)
            org.simpleframework.xml.core.Group r1 = r2.group
            org.simpleframework.xml.core.Label r1 = r1.getText()
            if (r1 == 0) goto L11
            java.lang.Object r2 = r2.readText(r3, r4)
            return r2
        L11:
            return r0
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(org.simpleframework.xml.stream.InputNode r3) {
            r2 = this;
            java.lang.String r0 = r3.getName()
            org.simpleframework.xml.core.Expression r1 = r2.path
            java.lang.String r0 = r1.getElement(r0)
            org.simpleframework.xml.core.LabelMap r1 = r2.elements
            java.lang.Object r0 = r1.get(r0)
            org.simpleframework.xml.core.Label r0 = (org.simpleframework.xml.core.Label) r0
            org.simpleframework.xml.core.Context r2 = r2.context
            org.simpleframework.xml.core.Converter r2 = r0.getConverter(r2)
            boolean r2 = r2.validate(r3)
            return r2
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(org.simpleframework.xml.stream.OutputNode r2, java.lang.Object r3) {
            r1 = this;
            java.util.Collection r3 = (java.util.Collection) r3
            org.simpleframework.xml.core.Group r0 = r1.group
            boolean r0 = r0.isInline()
            if (r0 == 0) goto L1e
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L14
            r1.write(r2, r3)
            return
        L14:
            boolean r1 = r2.isCommitted()
            if (r1 != 0) goto L1d
            r2.remove()
        L1d:
            return
        L1e:
            r1.write(r2, r3)
            return
    }
}
