package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class CompositeList implements org.simpleframework.xml.core.Converter {
    private final org.simpleframework.xml.strategy.Type entry;
    private final org.simpleframework.xml.core.CollectionFactory factory;
    private final java.lang.String name;
    private final org.simpleframework.xml.core.Traverser root;
    private final org.simpleframework.xml.strategy.Type type;

    public CompositeList(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.strategy.Type r3, org.simpleframework.xml.strategy.Type r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.CollectionFactory r0 = new org.simpleframework.xml.core.CollectionFactory
            r0.<init>(r2, r3)
            r1.factory = r0
            org.simpleframework.xml.core.Traverser r0 = new org.simpleframework.xml.core.Traverser
            r0.<init>(r2)
            r1.root = r0
            r1.entry = r4
            r1.type = r3
            r1.name = r5
            return
    }

    private java.lang.Object populate(org.simpleframework.xml.stream.InputNode r4, java.lang.Object r5) throws java.lang.Exception {
            r3 = this;
            java.util.Collection r5 = (java.util.Collection) r5
        L2:
            org.simpleframework.xml.stream.InputNode r0 = r4.getNext()
            org.simpleframework.xml.strategy.Type r1 = r3.entry
            java.lang.Class r1 = r1.getType()
            if (r0 != 0) goto Lf
            return r5
        Lf:
            org.simpleframework.xml.core.Traverser r2 = r3.root
            java.lang.Object r0 = r2.read(r0, r1)
            r5.add(r0)
            goto L2
    }

    private boolean validate(org.simpleframework.xml.stream.InputNode r3, java.lang.Class r4) throws java.lang.Exception {
            r2 = this;
        L0:
            org.simpleframework.xml.stream.InputNode r4 = r3.getNext()
            org.simpleframework.xml.strategy.Type r0 = r2.entry
            java.lang.Class r0 = r0.getType()
            if (r4 != 0) goto Le
            r3 = 1
            return r3
        Le:
            org.simpleframework.xml.core.Traverser r1 = r2.root
            r1.validate(r4, r0)
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
    public void write(org.simpleframework.xml.stream.OutputNode r5, java.lang.Object r6) throws java.lang.Exception {
            r4 = this;
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r6 = r6.iterator()
        L6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r6.next()
            if (r0 == 0) goto L6
            org.simpleframework.xml.strategy.Type r1 = r4.entry
            java.lang.Class r1 = r1.getType()
            java.lang.Class r2 = r0.getClass()
            boolean r3 = r1.isAssignableFrom(r2)
            if (r3 == 0) goto L2a
            org.simpleframework.xml.core.Traverser r2 = r4.root
            java.lang.String r3 = r4.name
            r2.write(r5, r0, r1, r3)
            goto L6
        L2a:
            org.simpleframework.xml.core.PersistenceException r5 = new org.simpleframework.xml.core.PersistenceException
            org.simpleframework.xml.strategy.Type r6 = r4.entry
            org.simpleframework.xml.strategy.Type r0 = r4.type
            java.lang.Object[] r6 = new java.lang.Object[]{r2, r6, r0}
            java.lang.String r0 = "Entry %s does not match %s for %s"
            r5.<init>(r0, r6)
            throw r5
        L3a:
            return
    }
}
