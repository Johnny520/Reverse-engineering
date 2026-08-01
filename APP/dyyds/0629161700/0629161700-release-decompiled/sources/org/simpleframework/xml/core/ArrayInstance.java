package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
    public java.lang.Object getInstance() {
            r2 = this;
            org.simpleframework.xml.strategy.Value r0 = r2.value
            boolean r0 = r0.isReference()
            if (r0 == 0) goto Lf
            org.simpleframework.xml.strategy.Value r2 = r2.value
            java.lang.Object r2 = r2.getValue()
            return r2
        Lf:
            java.lang.Class r0 = r2.type
            int r1 = r2.length
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            org.simpleframework.xml.strategy.Value r2 = r2.value
            if (r2 == 0) goto L1e
            r2.setValue(r0)
        L1e:
            return r0
    }

    @Override // org.simpleframework.xml.core.Instance
    public java.lang.Class getType() {
            r0 = this;
            java.lang.Class r0 = r0.type
            return r0
    }

    @Override // org.simpleframework.xml.core.Instance
    public boolean isReference() {
            r0 = this;
            org.simpleframework.xml.strategy.Value r0 = r0.value
            boolean r0 = r0.isReference()
            return r0
    }

    @Override // org.simpleframework.xml.core.Instance
    public java.lang.Object setInstance(java.lang.Object r1) {
            r0 = this;
            org.simpleframework.xml.strategy.Value r0 = r0.value
            if (r0 == 0) goto L7
            r0.setValue(r1)
        L7:
            return r1
    }
}
