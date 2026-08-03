package org.simpleframework.xml.strategy;

/* JADX INFO: loaded from: classes2.dex */
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
    public org.simpleframework.xml.strategy.Value read(org.simpleframework.xml.strategy.Type r2, org.simpleframework.xml.stream.NodeMap r3, java.util.Map r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.strategy.ReadState r0 = r1.read
            org.simpleframework.xml.strategy.ReadGraph r4 = r0.find(r4)
            if (r4 == 0) goto Ld
            org.simpleframework.xml.strategy.Value r2 = r4.read(r2, r3)
            return r2
        Ld:
            r2 = 0
            return r2
    }

    @Override // org.simpleframework.xml.strategy.Strategy
    public boolean write(org.simpleframework.xml.strategy.Type r2, java.lang.Object r3, org.simpleframework.xml.stream.NodeMap r4, java.util.Map r5) {
            r1 = this;
            org.simpleframework.xml.strategy.WriteState r0 = r1.write
            org.simpleframework.xml.strategy.WriteGraph r5 = r0.find(r5)
            if (r5 == 0) goto Ld
            boolean r2 = r5.write(r2, r3, r4)
            return r2
        Ld:
            r2 = 0
            return r2
    }
}
