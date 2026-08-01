package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ConversionInstance implements org.simpleframework.xml.core.Instance {
    private final org.simpleframework.xml.core.Context context;
    private final java.lang.Class convert;
    private final org.simpleframework.xml.strategy.Value value;

    public ConversionInstance(org.simpleframework.xml.core.Context r1, org.simpleframework.xml.strategy.Value r2, java.lang.Class r3) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.convert = r3
            r0.value = r2
            return
    }

    @Override // org.simpleframework.xml.core.Instance
    public java.lang.Object getInstance() {
            r1 = this;
            org.simpleframework.xml.strategy.Value r0 = r1.value
            boolean r0 = r0.isReference()
            if (r0 == 0) goto Lf
            org.simpleframework.xml.strategy.Value r1 = r1.value
            java.lang.Object r1 = r1.getValue()
            return r1
        Lf:
            java.lang.Class r0 = r1.convert
            java.lang.Object r0 = r1.getInstance(r0)
            if (r0 == 0) goto L1a
            r1.setInstance(r0)
        L1a:
            return r0
    }

    public java.lang.Object getInstance(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.Context r0 = r0.context
            org.simpleframework.xml.core.Instance r0 = r0.getInstance(r1)
            java.lang.Object r0 = r0.getInstance()
            return r0
    }

    @Override // org.simpleframework.xml.core.Instance
    public java.lang.Class getType() {
            r0 = this;
            java.lang.Class r0 = r0.convert
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
