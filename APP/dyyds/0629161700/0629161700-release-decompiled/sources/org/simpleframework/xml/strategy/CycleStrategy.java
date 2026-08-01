package org.simpleframework.xml.strategy;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class CycleStrategy implements org.simpleframework.xml.strategy.Strategy {
    private final org.simpleframework.xml.strategy.Contract contract;
    private final org.simpleframework.xml.strategy.ReadState read;
    private final org.simpleframework.xml.strategy.WriteState write;

    public CycleStrategy() {
            r2 = this;
            java.lang.String r0 = "id"
            java.lang.String r1 = "reference"
            r2.<init>(r0, r1)
            return
    }

    public CycleStrategy(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "class"
            r1.<init>(r2, r3, r0)
            return
    }

    public CycleStrategy(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "length"
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public CycleStrategy(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.strategy.Contract r0 = new org.simpleframework.xml.strategy.Contract
            r0.<init>(r2, r3, r4, r5)
            r1.contract = r0
            org.simpleframework.xml.strategy.WriteState r2 = new org.simpleframework.xml.strategy.WriteState
            r2.<init>(r0)
            r1.write = r2
            org.simpleframework.xml.strategy.ReadState r2 = new org.simpleframework.xml.strategy.ReadState
            r2.<init>(r0)
            r1.read = r2
            return
    }

    @Override // org.simpleframework.xml.strategy.Strategy
    public org.simpleframework.xml.strategy.Value read(org.simpleframework.xml.strategy.Type r1, org.simpleframework.xml.stream.NodeMap r2, java.util.Map r3) {
            r0 = this;
            org.simpleframework.xml.strategy.ReadState r0 = r0.read
            org.simpleframework.xml.strategy.ReadGraph r0 = r0.find(r3)
            if (r0 == 0) goto Ld
            org.simpleframework.xml.strategy.Value r0 = r0.read(r1, r2)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.strategy.Strategy
    public boolean write(org.simpleframework.xml.strategy.Type r1, java.lang.Object r2, org.simpleframework.xml.stream.NodeMap r3, java.util.Map r4) {
            r0 = this;
            org.simpleframework.xml.strategy.WriteState r0 = r0.write
            org.simpleframework.xml.strategy.WriteGraph r0 = r0.find(r4)
            if (r0 == 0) goto Ld
            boolean r0 = r0.write(r1, r2, r3)
            return r0
        Ld:
            r0 = 0
            return r0
    }
}
