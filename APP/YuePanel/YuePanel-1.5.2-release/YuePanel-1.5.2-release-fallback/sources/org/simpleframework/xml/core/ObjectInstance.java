package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ObjectInstance implements org.simpleframework.xml.core.Instance {
    private final org.simpleframework.xml.core.Context context;
    private final java.lang.Class type;
    private final org.simpleframework.xml.strategy.Value value;

    public ObjectInstance(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.strategy.Value r3) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r3.getType()
            r1.type = r0
            r1.context = r2
            r1.value = r3
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
            java.lang.Object r0 = r2.getInstance(r0)
            org.simpleframework.xml.strategy.Value r1 = r2.value
            if (r1 == 0) goto L1c
            r1.setValue(r0)
        L1c:
            return r0
    }

    public java.lang.Object getInstance(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Context r0 = r1.context
            org.simpleframework.xml.core.Instance r2 = r0.getInstance(r2)
            java.lang.Object r2 = r2.getInstance()
            return r2
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
