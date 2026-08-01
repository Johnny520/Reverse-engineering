package org.simpleframework.xml.strategy;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ReadState extends org.simpleframework.xml.util.WeakCache<org.simpleframework.xml.strategy.ReadGraph> {
    private final org.simpleframework.xml.strategy.Contract contract;
    private final org.simpleframework.xml.strategy.Loader loader;

    public ReadState(org.simpleframework.xml.strategy.Contract r2) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.strategy.Loader r0 = new org.simpleframework.xml.strategy.Loader
            r0.<init>()
            r1.loader = r0
            r1.contract = r2
            return
    }

    private org.simpleframework.xml.strategy.ReadGraph create(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3.fetch(r4)
            org.simpleframework.xml.strategy.ReadGraph r0 = (org.simpleframework.xml.strategy.ReadGraph) r0
            if (r0 != 0) goto L14
            org.simpleframework.xml.strategy.ReadGraph r0 = new org.simpleframework.xml.strategy.ReadGraph
            org.simpleframework.xml.strategy.Contract r1 = r3.contract
            org.simpleframework.xml.strategy.Loader r2 = r3.loader
            r0.<init>(r1, r2)
            r3.cache(r4, r0)
        L14:
            return r0
    }

    public org.simpleframework.xml.strategy.ReadGraph find(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.fetch(r2)
            org.simpleframework.xml.strategy.ReadGraph r0 = (org.simpleframework.xml.strategy.ReadGraph) r0
            if (r0 == 0) goto L9
            return r0
        L9:
            org.simpleframework.xml.strategy.ReadGraph r1 = r1.create(r2)
            return r1
    }
}
