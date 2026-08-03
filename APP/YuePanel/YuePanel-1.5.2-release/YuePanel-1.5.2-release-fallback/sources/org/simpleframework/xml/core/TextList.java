package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class TextList implements org.simpleframework.xml.core.Repeater {
    private final org.simpleframework.xml.core.CollectionFactory factory;
    private final org.simpleframework.xml.core.Primitive primitive;
    private final org.simpleframework.xml.strategy.Type type;

    public TextList(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.strategy.Type r3, org.simpleframework.xml.core.Label r4) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.ClassType r4 = new org.simpleframework.xml.core.ClassType
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r4.<init>(r0)
            r1.type = r4
            org.simpleframework.xml.core.CollectionFactory r0 = new org.simpleframework.xml.core.CollectionFactory
            r0.<init>(r2, r3)
            r1.factory = r0
            org.simpleframework.xml.core.Primitive r3 = new org.simpleframework.xml.core.Primitive
            r3.<init>(r2, r4)
            r1.primitive = r3
            return
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r4) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.CollectionFactory r0 = r3.factory
            org.simpleframework.xml.core.Instance r0 = r0.getInstance(r4)
            java.lang.Object r1 = r0.getInstance()
            boolean r2 = r0.isReference()
            if (r2 == 0) goto L15
            java.lang.Object r4 = r0.getInstance()
            return r4
        L15:
            java.lang.Object r4 = r3.read(r4, r1)
            return r4
    }

    @Override // org.simpleframework.xml.core.Repeater, org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            org.simpleframework.xml.core.Primitive r1 = r2.primitive
            java.lang.Object r3 = r1.read(r3)
            if (r3 == 0) goto Le
            r0.add(r3)
        Le:
            return r4
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(org.simpleframework.xml.stream.InputNode r1) throws java.lang.Exception {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(org.simpleframework.xml.stream.OutputNode r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            java.util.Collection r4 = (java.util.Collection) r4
            org.simpleframework.xml.stream.OutputNode r3 = r3.getParent()
            java.util.Iterator r4 = r4.iterator()
        La:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r4.next()
            org.simpleframework.xml.core.Primitive r1 = r2.primitive
            r1.write(r3, r0)
            goto La
        L1a:
            return
    }
}
