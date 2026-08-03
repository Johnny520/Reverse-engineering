package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ArrayInstance implements org.simpleframework.xml.core.Instance {
    private final int length;
    private final java.lang.Class type;
    private final org.simpleframework.xml.strategy.Value value;

    public ArrayInstance(org.simpleframework.xml.strategy.Value r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.getLength()
            r1.length = r0
            java.lang.Class r0 = r2.getType()
            r1.type = r0
            r1.value = r2
            return
    }

    @Override // org.simpleframework.xml.core.Instance
    public java.lang.Object getInstance() throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.strategy.Value r0 = r2.value
            boolean r0 = r0.isReference()
            if (r0 == 0) goto Lf
            org.simpleframework.xml.strategy.Value r0 = r2.value
            java.lang.Object r0 = r0.getValue()
            return r0
        Lf:
            java.lang.Class r0 = r2.type
            int r1 = r2.length
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            org.simpleframework.xml.strategy.Value r1 = r2.value
            if (r1 == 0) goto L1e
            r1.setValue(r0)
        L1e:
            return r0
    }

    @Override // org.simpleframework.xml.core.Instance
    public java.lang.Class getType() {
            r1 = this;
            java.lang.Class r0 = r1.type
            return r0
    }

    @Override // org.simpleframework.xml.core.Instance
    public boolean isReference() {
            r1 = this;
            org.simpleframework.xml.strategy.Value r0 = r1.value
            boolean r0 = r0.isReference()
            return r0
    }

    @Override // org.simpleframework.xml.core.Instance
    public java.lang.Object setInstance(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.strategy.Value r0 = r1.value
            if (r0 == 0) goto L7
            r0.setValue(r2)
        L7:
            return r2
    }
}
