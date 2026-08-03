package org.simpleframework.xml.strategy;

/* JADX INFO: loaded from: classes2.dex */
class WriteState extends org.simpleframework.xml.util.WeakCache<org.simpleframework.xml.strategy.WriteGraph> {
    private org.simpleframework.xml.strategy.Contract contract;

    public WriteState(org.simpleframework.xml.strategy.Contract r1) {
            r0 = this;
            r0.<init>()
            r0.contract = r1
            return
    }

    public org.simpleframework.xml.strategy.WriteGraph find(java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2.fetch(r3)
            org.simpleframework.xml.strategy.WriteGraph r0 = (org.simpleframework.xml.strategy.WriteGraph) r0
            if (r0 != 0) goto L12
            org.simpleframework.xml.strategy.WriteGraph r0 = new org.simpleframework.xml.strategy.WriteGraph
            org.simpleframework.xml.strategy.Contract r1 = r2.contract
            r0.<init>(r1)
            r2.cache(r3, r0)
        L12:
            return r0
    }
}
