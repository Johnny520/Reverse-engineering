package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class CompositeUnion implements org.simpleframework.xml.core.Converter {
    private final org.simpleframework.xml.core.Context context;
    private final org.simpleframework.xml.core.LabelMap elements;
    private final org.simpleframework.xml.core.Group group;
    private final org.simpleframework.xml.core.Expression path;
    private final org.simpleframework.xml.strategy.Type type;

    public CompositeUnion(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.core.Group r3, org.simpleframework.xml.core.Expression r4, org.simpleframework.xml.strategy.Type r5) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.LabelMap r0 = r3.getElements()
            r1.elements = r0
            r1.context = r2
            r1.group = r3
            r1.type = r5
            r1.path = r4
            return
    }

    private void write(org.simpleframework.xml.stream.OutputNode r1, java.lang.Object r2, org.simpleframework.xml.core.Label r3) {
            r0 = this;
            org.simpleframework.xml.core.Context r0 = r0.context
            org.simpleframework.xml.core.Converter r0 = r3.getConverter(r0)
            r0.write(r1, r2)
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

    @Override // org.simpleframework.xml.core.Converter
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
    public void write(org.simpleframework.xml.stream.OutputNode r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Class r0 = r4.getClass()
            org.simpleframework.xml.core.Group r1 = r2.group
            org.simpleframework.xml.core.Label r1 = r1.getLabel(r0)
            if (r1 == 0) goto L10
            r2.write(r3, r4, r1)
            return
        L10:
            org.simpleframework.xml.core.UnionException r3 = new org.simpleframework.xml.core.UnionException
            org.simpleframework.xml.strategy.Type r4 = r2.type
            org.simpleframework.xml.core.Group r2 = r2.group
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r4, r2}
            java.lang.String r4 = "Value of %s not declared in %s with annotation %s"
            r3.<init>(r4, r2)
            throw r3
    }
}
