package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class PrimitiveList implements org.simpleframework.xml.core.Converter {
    private final org.simpleframework.xml.strategy.Type entry;
    private final org.simpleframework.xml.core.CollectionFactory factory;
    private final java.lang.String parent;
    private final org.simpleframework.xml.core.Primitive root;

    public PrimitiveList(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.strategy.Type r3, org.simpleframework.xml.strategy.Type r4, java.lang.String r5) {
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

    private boolean isOverridden(org.simpleframework.xml.stream.OutputNode r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.CollectionFactory r0 = r2.factory
            org.simpleframework.xml.strategy.Type r1 = r2.entry
            boolean r3 = r0.setOverride(r1, r4, r3)
            return r3
    }

    private java.lang.Object populate(org.simpleframework.xml.stream.InputNode r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            java.util.Collection r4 = (java.util.Collection) r4
        L2:
            org.simpleframework.xml.stream.InputNode r0 = r3.getNext()
            if (r0 != 0) goto L9
            return r4
        L9:
            org.simpleframework.xml.core.Primitive r1 = r2.root
            java.lang.Object r0 = r1.read(r0)
            r4.add(r0)
            goto L2
    }

    private boolean validate(org.simpleframework.xml.stream.InputNode r2, java.lang.Class r3) throws java.lang.Exception {
            r1 = this;
        L0:
            org.simpleframework.xml.stream.InputNode r3 = r2.getNext()
            if (r3 != 0) goto L8
            r2 = 1
            return r2
        L8:
            org.simpleframework.xml.core.Primitive r0 = r1.root
            r0.validate(r3)
            goto L0
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.CollectionFactory r0 = r2.factory
            org.simpleframework.xml.core.Instance r0 = r0.getInstance(r3)
            java.lang.Object r1 = r0.getInstance()
            boolean r0 = r0.isReference()
            if (r0 != 0) goto L15
            java.lang.Object r3 = r2.populate(r3, r1)
            return r3
        L15:
            return r1
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.CollectionFactory r0 = r2.factory
            org.simpleframework.xml.core.Instance r0 = r0.getInstance(r3)
            boolean r1 = r0.isReference()
            if (r1 == 0) goto L11
            java.lang.Object r3 = r0.getInstance()
            return r3
        L11:
            r0.setInstance(r4)
            if (r4 == 0) goto L1b
            java.lang.Object r3 = r2.populate(r3, r4)
            return r3
        L1b:
            return r4
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.CollectionFactory r0 = r2.factory
            org.simpleframework.xml.core.Instance r0 = r0.getInstance(r3)
            boolean r1 = r0.isReference()
            if (r1 != 0) goto L19
            r1 = 0
            r0.setInstance(r1)
            java.lang.Class r0 = r0.getType()
            boolean r3 = r2.validate(r3, r0)
            return r3
        L19:
            r3 = 1
            return r3
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(org.simpleframework.xml.stream.OutputNode r4, java.lang.Object r5) throws java.lang.Exception {
            r3 = this;
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r5 = r5.iterator()
        L6:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r5.next()
            if (r0 == 0) goto L6
            java.lang.String r1 = r3.parent
            org.simpleframework.xml.stream.OutputNode r1 = r4.getChild(r1)
            boolean r2 = r3.isOverridden(r1, r0)
            if (r2 != 0) goto L6
            org.simpleframework.xml.core.Primitive r2 = r3.root
            r2.write(r1, r0)
            goto L6
        L24:
            return
    }
}
