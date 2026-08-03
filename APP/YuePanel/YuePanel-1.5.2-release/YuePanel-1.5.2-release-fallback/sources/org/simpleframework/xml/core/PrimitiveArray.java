package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class PrimitiveArray implements org.simpleframework.xml.core.Converter {
    private final org.simpleframework.xml.strategy.Type entry;
    private final org.simpleframework.xml.core.ArrayFactory factory;
    private final java.lang.String parent;
    private final org.simpleframework.xml.core.Primitive root;
    private final org.simpleframework.xml.strategy.Type type;

    public PrimitiveArray(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.strategy.Type r3, org.simpleframework.xml.strategy.Type r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.ArrayFactory r0 = new org.simpleframework.xml.core.ArrayFactory
            r0.<init>(r2, r3)
            r1.factory = r0
            org.simpleframework.xml.core.Primitive r0 = new org.simpleframework.xml.core.Primitive
            r0.<init>(r2, r4)
            r1.root = r0
            r1.parent = r5
            r1.entry = r4
            r1.type = r3
            return
    }

    private boolean isOverridden(org.simpleframework.xml.stream.OutputNode r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.ArrayFactory r0 = r2.factory
            org.simpleframework.xml.strategy.Type r1 = r2.entry
            boolean r3 = r0.setOverride(r1, r4, r3)
            return r3
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

    private void write(org.simpleframework.xml.stream.OutputNode r1, java.lang.Object r2, int r3) throws java.lang.Exception {
            r0 = this;
            java.lang.Object r2 = java.lang.reflect.Array.get(r2, r3)
            if (r2 == 0) goto L11
            boolean r3 = r0.isOverridden(r1, r2)
            if (r3 != 0) goto L11
            org.simpleframework.xml.core.Primitive r3 = r0.root
            r3.write(r1, r2)
        L11:
            return
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.ArrayFactory r0 = r2.factory
            org.simpleframework.xml.core.Instance r0 = r0.getInstance(r3)
            java.lang.Object r1 = r0.getInstance()
            boolean r0 = r0.isReference()
            if (r0 != 0) goto L15
            java.lang.Object r3 = r2.read(r3, r1)
            return r3
        L15:
            return r1
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r5, java.lang.Object r6) throws java.lang.Exception {
            r4 = this;
            int r0 = java.lang.reflect.Array.getLength(r6)
            r1 = 0
        L5:
            org.simpleframework.xml.stream.Position r2 = r5.getPosition()
            org.simpleframework.xml.stream.InputNode r3 = r5.getNext()
            if (r3 != 0) goto L10
            return r6
        L10:
            if (r1 >= r0) goto L1e
            org.simpleframework.xml.core.Primitive r2 = r4.root
            java.lang.Object r2 = r2.read(r3)
            java.lang.reflect.Array.set(r6, r1, r2)
            int r1 = r1 + 1
            goto L5
        L1e:
            org.simpleframework.xml.core.ElementException r5 = new org.simpleframework.xml.core.ElementException
            org.simpleframework.xml.strategy.Type r6 = r4.type
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r2}
            java.lang.String r0 = "Array length missing or incorrect for %s at %s"
            r5.<init>(r0, r6)
            throw r5
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.ArrayFactory r0 = r2.factory
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
            int r0 = java.lang.reflect.Array.getLength(r5)
            r1 = 0
        L5:
            if (r1 >= r0) goto L16
            java.lang.String r2 = r3.parent
            org.simpleframework.xml.stream.OutputNode r2 = r4.getChild(r2)
            if (r2 != 0) goto L10
            goto L16
        L10:
            r3.write(r2, r5, r1)
            int r1 = r1 + 1
            goto L5
        L16:
            return
    }
}
