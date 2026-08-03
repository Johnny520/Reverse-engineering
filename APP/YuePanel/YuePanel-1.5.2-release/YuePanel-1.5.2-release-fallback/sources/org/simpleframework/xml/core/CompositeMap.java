package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class CompositeMap implements org.simpleframework.xml.core.Converter {
    private final org.simpleframework.xml.core.Entry entry;
    private final org.simpleframework.xml.core.MapFactory factory;
    private final org.simpleframework.xml.core.Converter key;
    private final org.simpleframework.xml.stream.Style style;
    private final org.simpleframework.xml.core.Converter value;

    public CompositeMap(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.core.Entry r3, org.simpleframework.xml.strategy.Type r4) throws java.lang.Exception {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.MapFactory r0 = new org.simpleframework.xml.core.MapFactory
            r0.<init>(r2, r4)
            r1.factory = r0
            org.simpleframework.xml.core.Converter r4 = r3.getValue(r2)
            r1.value = r4
            org.simpleframework.xml.core.Converter r4 = r3.getKey(r2)
            r1.key = r4
            org.simpleframework.xml.stream.Style r2 = r2.getStyle()
            r1.style = r2
            r1.entry = r3
            return
    }

    private java.lang.Object populate(org.simpleframework.xml.stream.InputNode r4, java.lang.Object r5) throws java.lang.Exception {
            r3 = this;
            java.util.Map r5 = (java.util.Map) r5
        L2:
            org.simpleframework.xml.stream.InputNode r0 = r4.getNext()
            if (r0 != 0) goto L9
            return r5
        L9:
            org.simpleframework.xml.core.Converter r1 = r3.key
            java.lang.Object r1 = r1.read(r0)
            org.simpleframework.xml.core.Converter r2 = r3.value
            java.lang.Object r0 = r2.read(r0)
            r5.put(r1, r0)
            goto L2
    }

    private boolean validate(org.simpleframework.xml.stream.InputNode r3, java.lang.Class r4) throws java.lang.Exception {
            r2 = this;
        L0:
            org.simpleframework.xml.stream.InputNode r4 = r3.getNext()
            if (r4 != 0) goto L8
            r3 = 1
            return r3
        L8:
            org.simpleframework.xml.core.Converter r0 = r2.key
            boolean r0 = r0.validate(r4)
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            org.simpleframework.xml.core.Converter r0 = r2.value
            boolean r4 = r0.validate(r4)
            if (r4 != 0) goto L0
            return r1
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.MapFactory r0 = r2.factory
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
            org.simpleframework.xml.core.MapFactory r0 = r2.factory
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
            org.simpleframework.xml.core.MapFactory r0 = r2.factory
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
    public void write(org.simpleframework.xml.stream.OutputNode r6, java.lang.Object r7) throws java.lang.Exception {
            r5 = this;
            java.util.Map r7 = (java.util.Map) r7
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            org.simpleframework.xml.core.Entry r2 = r5.entry
            java.lang.String r2 = r2.getEntry()
            org.simpleframework.xml.stream.Style r3 = r5.style
            java.lang.String r2 = r3.getElement(r2)
            org.simpleframework.xml.stream.OutputNode r2 = r6.getChild(r2)
            java.lang.Object r3 = r7.get(r1)
            org.simpleframework.xml.core.Converter r4 = r5.key
            r4.write(r2, r1)
            org.simpleframework.xml.core.Converter r1 = r5.value
            r1.write(r2, r3)
            goto La
        L33:
            return
    }
}
