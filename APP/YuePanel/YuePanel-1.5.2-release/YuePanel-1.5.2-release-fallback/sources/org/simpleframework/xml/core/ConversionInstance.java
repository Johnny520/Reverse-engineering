package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ConversionInstance implements org.simpleframework.xml.core.Instance {
    private final org.simpleframework.xml.core.Context context;
    private final java.lang.Class convert;
    private final org.simpleframework.xml.strategy.Value value;

    public ConversionInstance(org.simpleframework.xml.core.Context r1, org.simpleframework.xml.strategy.Value r2, java.lang.Class r3) throws java.lang.Exception {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.convert = r3
            r0.value = r2
            return
    }

    @Override // org.simpleframework.xml.core.Instance
    public java.lang.Object getInstance() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.strategy.Value r0 = r1.value
            boolean r0 = r0.isReference()
            if (r0 == 0) goto Lf
            org.simpleframework.xml.strategy.Value r0 = r1.value
            java.lang.Object r0 = r0.getValue()
            return r0
        Lf:
            java.lang.Class r0 = r1.convert
            java.lang.Object r0 = r1.getInstance(r0)
            if (r0 == 0) goto L1a
            r1.setInstance(r0)
        L1a:
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
            java.lang.Class r0 = r1.convert
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
    public java.lang.Object setInstance(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.strategy.Value r0 = r1.value
            if (r0 == 0) goto L7
            r0.setValue(r2)
        L7:
            return r2
    }
}
