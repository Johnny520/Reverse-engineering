package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class CompositeInlineList implements org.simpleframework.xml.core.Repeater {
    private final org.simpleframework.xml.strategy.Type entry;
    private final org.simpleframework.xml.core.CollectionFactory factory;
    private final java.lang.String name;
    private final org.simpleframework.xml.core.Traverser root;
    private final org.simpleframework.xml.strategy.Type type;

    public CompositeInlineList(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.strategy.Type r3, org.simpleframework.xml.strategy.Type r4, java.lang.String r5) {
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

    private java.lang.Object read(org.simpleframework.xml.stream.InputNode r3, java.lang.Class r4) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Traverser r0 = r2.root
            java.lang.Object r3 = r0.read(r3, r4)
            java.lang.Class r4 = r3.getClass()
            org.simpleframework.xml.strategy.Type r0 = r2.entry
            java.lang.Class r0 = r0.getType()
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L17
            return r3
        L17:
            org.simpleframework.xml.core.PersistenceException r3 = new org.simpleframework.xml.core.PersistenceException
            org.simpleframework.xml.strategy.Type r0 = r2.entry
            org.simpleframework.xml.strategy.Type r1 = r2.type
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r0, r1}
            java.lang.String r0 = "Entry %s does not match %s for %s"
            r3.<init>(r0, r4)
            throw r3
    }

    private java.lang.Object read(org.simpleframework.xml.stream.InputNode r4, java.util.Collection r5) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.stream.InputNode r0 = r4.getParent()
            java.lang.String r1 = r4.getName()
        L8:
            if (r4 == 0) goto L1e
            org.simpleframework.xml.strategy.Type r2 = r3.entry
            java.lang.Class r2 = r2.getType()
            java.lang.Object r4 = r3.read(r4, r2)
            if (r4 == 0) goto L19
            r5.add(r4)
        L19:
            org.simpleframework.xml.stream.InputNode r4 = r0.getNext(r1)
            goto L8
        L1e:
            return r5
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.CollectionFactory r0 = r1.factory
            java.lang.Object r0 = r0.getInstance()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto Lf
            java.lang.Object r2 = r1.read(r2, r0)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // org.simpleframework.xml.core.Repeater, org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r1, java.lang.Object r2) throws java.lang.Exception {
            r0 = this;
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L9
            java.lang.Object r1 = r0.read(r1, r2)
            return r1
        L9:
            java.lang.Object r1 = r0.read(r1)
            return r1
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(org.simpleframework.xml.stream.InputNode r5) throws java.lang.Exception {
            r4 = this;
            org.simpleframework.xml.stream.InputNode r0 = r5.getParent()
            org.simpleframework.xml.strategy.Type r1 = r4.entry
            java.lang.Class r1 = r1.getType()
            java.lang.String r2 = r5.getName()
        Le:
            if (r5 == 0) goto L1f
            org.simpleframework.xml.core.Traverser r3 = r4.root
            boolean r5 = r3.validate(r5, r1)
            if (r5 != 0) goto L1a
            r5 = 0
            return r5
        L1a:
            org.simpleframework.xml.stream.InputNode r5 = r0.getNext(r2)
            goto Le
        L1f:
            r5 = 1
            return r5
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(org.simpleframework.xml.stream.OutputNode r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            java.util.Collection r4 = (java.util.Collection) r4
            org.simpleframework.xml.stream.OutputNode r0 = r3.getParent()
            boolean r1 = r3.isCommitted()
            if (r1 != 0) goto Lf
            r3.remove()
        Lf:
            r2.write(r0, r4)
            return
    }

    public void write(org.simpleframework.xml.stream.OutputNode r5, java.util.Collection r6) throws java.lang.Exception {
            r4 = this;
            java.util.Iterator r6 = r6.iterator()
        L4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r6.next()
            if (r0 == 0) goto L4
            org.simpleframework.xml.strategy.Type r1 = r4.entry
            java.lang.Class r1 = r1.getType()
            java.lang.Class r2 = r0.getClass()
            boolean r3 = r1.isAssignableFrom(r2)
            if (r3 == 0) goto L28
            org.simpleframework.xml.core.Traverser r2 = r4.root
            java.lang.String r3 = r4.name
            r2.write(r5, r0, r1, r3)
            goto L4
        L28:
            org.simpleframework.xml.core.PersistenceException r5 = new org.simpleframework.xml.core.PersistenceException
            org.simpleframework.xml.strategy.Type r6 = r4.type
            java.lang.Object[] r6 = new java.lang.Object[]{r2, r1, r6}
            java.lang.String r0 = "Entry %s does not match %s for %s"
            r5.<init>(r0, r6)
            throw r5
        L36:
            return
    }
}
