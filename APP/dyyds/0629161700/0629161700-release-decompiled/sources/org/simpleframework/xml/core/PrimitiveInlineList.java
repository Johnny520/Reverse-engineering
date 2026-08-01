package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class PrimitiveInlineList implements org.simpleframework.xml.core.Repeater {
    private final org.simpleframework.xml.strategy.Type entry;
    private final org.simpleframework.xml.core.CollectionFactory factory;
    private final java.lang.String parent;
    private final org.simpleframework.xml.core.Primitive root;

    public PrimitiveInlineList(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.strategy.Type r3, org.simpleframework.xml.strategy.Type r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.CollectionFactory r0 = new org.simpleframework.xml.core.CollectionFactory
            r0.<init>(r2, r3)
            r1.factory = r0
            org.simpleframework.xml.core.Primitive r3 = new org.simpleframework.xml.core.Primitive
            r3.<init>(r2, r4)
            r1.root = r3
            r1.parent = r5
            r1.entry = r4
            return
    }

    private boolean isOverridden(org.simpleframework.xml.stream.OutputNode r2, java.lang.Object r3) {
            r1 = this;
            org.simpleframework.xml.core.CollectionFactory r0 = r1.factory
            org.simpleframework.xml.strategy.Type r1 = r1.entry
            boolean r1 = r0.setOverride(r1, r3, r2)
            return r1
    }

    private java.lang.Object read(org.simpleframework.xml.stream.InputNode r4, java.util.Collection r5) {
            r3 = this;
            org.simpleframework.xml.stream.InputNode r0 = r4.getParent()
            java.lang.String r1 = r4.getName()
        L8:
            if (r4 == 0) goto L1a
            org.simpleframework.xml.core.Primitive r2 = r3.root
            java.lang.Object r4 = r2.read(r4)
            if (r4 == 0) goto L15
            r5.add(r4)
        L15:
            org.simpleframework.xml.stream.InputNode r4 = r0.getNext(r1)
            goto L8
        L1a:
            return r5
    }

    private void write(org.simpleframework.xml.stream.OutputNode r4, java.lang.Object r5, org.simpleframework.xml.stream.Mode r6) {
            r3 = this;
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r5 = r5.iterator()
        L6:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r5.next()
            if (r0 == 0) goto L6
            java.lang.String r1 = r3.parent
            org.simpleframework.xml.stream.OutputNode r1 = r4.getChild(r1)
            boolean r2 = r3.isOverridden(r1, r0)
            if (r2 != 0) goto L6
            r1.setMode(r6)
            org.simpleframework.xml.core.Primitive r2 = r3.root
            r2.write(r1, r0)
            goto L6
        L27:
            return
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r2) {
            r1 = this;
            org.simpleframework.xml.core.CollectionFactory r0 = r1.factory
            java.lang.Object r0 = r0.getInstance()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto Lf
            java.lang.Object r1 = r1.read(r2, r0)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // org.simpleframework.xml.core.Repeater, org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r1, java.lang.Object r2) {
            r0 = this;
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L9
            java.lang.Object r0 = r0.read(r1, r2)
            return r0
        L9:
            java.lang.Object r0 = r0.read(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(org.simpleframework.xml.stream.InputNode r4) {
            r3 = this;
            org.simpleframework.xml.stream.InputNode r0 = r4.getParent()
            java.lang.String r1 = r4.getName()
        L8:
            if (r4 == 0) goto L19
            org.simpleframework.xml.core.Primitive r2 = r3.root
            boolean r4 = r2.validate(r4)
            if (r4 != 0) goto L14
            r3 = 0
            return r3
        L14:
            org.simpleframework.xml.stream.InputNode r4 = r0.getNext(r1)
            goto L8
        L19:
            r3 = 1
            return r3
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(org.simpleframework.xml.stream.OutputNode r4, java.lang.Object r5) {
            r3 = this;
            org.simpleframework.xml.stream.OutputNode r0 = r4.getParent()
            org.simpleframework.xml.stream.Mode r1 = r4.getMode()
            boolean r2 = r4.isCommitted()
            if (r2 != 0) goto L11
            r4.remove()
        L11:
            r3.write(r0, r5, r1)
            return
    }
}
