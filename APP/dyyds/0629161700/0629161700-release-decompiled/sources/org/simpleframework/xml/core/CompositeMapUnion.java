package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class CompositeMapUnion implements org.simpleframework.xml.core.Repeater {
    private final org.simpleframework.xml.core.Context context;
    private final org.simpleframework.xml.core.LabelMap elements;
    private final org.simpleframework.xml.core.Group group;
    private final org.simpleframework.xml.core.Expression path;
    private final org.simpleframework.xml.stream.Style style;
    private final org.simpleframework.xml.strategy.Type type;

    public CompositeMapUnion(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.core.Group r3, org.simpleframework.xml.core.Expression r4, org.simpleframework.xml.strategy.Type r5) {
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

    private void write(org.simpleframework.xml.stream.OutputNode r2, java.lang.Object r3, java.lang.Object r4, org.simpleframework.xml.core.Label r5) {
            r1 = this;
            org.simpleframework.xml.core.Context r0 = r1.context
            org.simpleframework.xml.core.Converter r0 = r5.getConverter(r0)
            java.util.Map r3 = java.util.Collections.singletonMap(r3, r4)
            boolean r4 = r5.isInline()
            if (r4 != 0) goto L23
            java.lang.String r4 = r5.getName()
            org.simpleframework.xml.stream.Style r1 = r1.style
            java.lang.String r1 = r1.getElement(r4)
            boolean r4 = r2.isCommitted()
            if (r4 != 0) goto L23
            r2.setName(r1)
        L23:
            r0.write(r2, r3)
            return
    }

    private void write(org.simpleframework.xml.stream.OutputNode r6, java.util.Map r7) {
            r5 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            java.lang.Object r2 = r7.get(r1)
            if (r2 == 0) goto L8
            java.lang.Class r3 = r2.getClass()
            org.simpleframework.xml.core.Group r4 = r5.group
            org.simpleframework.xml.core.Label r4 = r4.getLabel(r3)
            if (r4 == 0) goto L28
            r5.write(r6, r1, r2, r4)
            goto L8
        L28:
            org.simpleframework.xml.core.UnionException r6 = new org.simpleframework.xml.core.UnionException
            org.simpleframework.xml.strategy.Type r7 = r5.type
            org.simpleframework.xml.core.Group r5 = r5.group
            java.lang.Object[] r5 = new java.lang.Object[]{r3, r7, r5}
            java.lang.String r7 = "Value of %s not declared in %s with annotation %s"
            r6.<init>(r7, r5)
            throw r6
        L38:
            return
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r3) {
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

    @Override // org.simpleframework.xml.core.Repeater, org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r3, java.lang.Object r4) {
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
            java.util.Map r3 = (java.util.Map) r3
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
