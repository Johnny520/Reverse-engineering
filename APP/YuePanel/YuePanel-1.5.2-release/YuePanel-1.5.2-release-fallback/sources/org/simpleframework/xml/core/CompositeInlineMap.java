package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class CompositeInlineMap implements org.simpleframework.xml.core.Repeater {
    private final org.simpleframework.xml.core.Entry entry;
    private final org.simpleframework.xml.core.MapFactory factory;
    private final org.simpleframework.xml.core.Converter key;
    private final org.simpleframework.xml.stream.Style style;
    private final org.simpleframework.xml.core.Converter value;

    public CompositeInlineMap(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.core.Entry r3, org.simpleframework.xml.strategy.Type r4) throws java.lang.Exception {
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

    private java.lang.Object read(org.simpleframework.xml.stream.InputNode r5, java.util.Map r6) throws java.lang.Exception {
            r4 = this;
            org.simpleframework.xml.stream.InputNode r0 = r5.getParent()
            java.lang.String r1 = r5.getName()
        L8:
            if (r5 == 0) goto L20
            org.simpleframework.xml.core.Converter r2 = r4.key
            java.lang.Object r2 = r2.read(r5)
            org.simpleframework.xml.core.Converter r3 = r4.value
            java.lang.Object r5 = r3.read(r5)
            if (r6 == 0) goto L1b
            r6.put(r2, r5)
        L1b:
            org.simpleframework.xml.stream.InputNode r5 = r0.getNext(r1)
            goto L8
        L20:
            return r6
    }

    private void write(org.simpleframework.xml.stream.OutputNode r7, java.util.Map r8, org.simpleframework.xml.stream.Mode r9) throws java.lang.Exception {
            r6 = this;
            org.simpleframework.xml.core.Entry r0 = r6.entry
            java.lang.String r0 = r0.getEntry()
            org.simpleframework.xml.stream.Style r1 = r6.style
            java.lang.String r0 = r1.getElement(r0)
            java.util.Set r1 = r8.keySet()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            org.simpleframework.xml.stream.OutputNode r3 = r7.getChild(r0)
            java.lang.Object r4 = r8.get(r2)
            r3.setMode(r9)
            org.simpleframework.xml.core.Converter r5 = r6.key
            r5.write(r3, r2)
            org.simpleframework.xml.core.Converter r2 = r6.value
            r2.write(r3, r4)
            goto L14
        L34:
            return
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.MapFactory r0 = r1.factory
            java.lang.Object r0 = r0.getInstance()
            java.util.Map r0 = (java.util.Map) r0
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
            java.util.Map r2 = (java.util.Map) r2
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
            java.lang.String r1 = r5.getName()
        L8:
            if (r5 == 0) goto L22
            org.simpleframework.xml.core.Converter r2 = r4.key
            boolean r2 = r2.validate(r5)
            r3 = 0
            if (r2 != 0) goto L14
            return r3
        L14:
            org.simpleframework.xml.core.Converter r2 = r4.value
            boolean r5 = r2.validate(r5)
            if (r5 != 0) goto L1d
            return r3
        L1d:
            org.simpleframework.xml.stream.InputNode r5 = r0.getNext(r1)
            goto L8
        L22:
            r5 = 1
            return r5
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(org.simpleframework.xml.stream.OutputNode r4, java.lang.Object r5) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.stream.OutputNode r0 = r4.getParent()
            org.simpleframework.xml.stream.Mode r1 = r4.getMode()
            java.util.Map r5 = (java.util.Map) r5
            boolean r2 = r4.isCommitted()
            if (r2 != 0) goto L13
            r4.remove()
        L13:
            r3.write(r0, r5, r1)
            return
    }
}
