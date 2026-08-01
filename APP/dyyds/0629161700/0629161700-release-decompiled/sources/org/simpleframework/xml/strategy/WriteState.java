package org.simpleframework.xml.strategy;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
