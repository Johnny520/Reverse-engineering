package org.simpleframework.xml.strategy;

/* JADX INFO: loaded from: classes2.dex */
public class VisitorStrategy implements org.simpleframework.xml.strategy.Strategy {
    private final org.simpleframework.xml.strategy.Strategy strategy;
    private final org.simpleframework.xml.strategy.Visitor visitor;

    public VisitorStrategy(org.simpleframework.xml.strategy.Visitor r2) {
            r1 = this;
            org.simpleframework.xml.strategy.TreeStrategy r0 = new org.simpleframework.xml.strategy.TreeStrategy
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public VisitorStrategy(org.simpleframework.xml.strategy.Visitor r1, org.simpleframework.xml.strategy.Strategy r2) {
            r0 = this;
            r0.<init>()
            r0.strategy = r2
            r0.visitor = r1
            return
    }

    @Override // org.simpleframework.xml.strategy.Strategy
    public org.simpleframework.xml.strategy.Value read(org.simpleframework.xml.strategy.Type r2, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.InputNode> r3, java.util.Map r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.strategy.Visitor r0 = r1.visitor
            if (r0 == 0) goto L7
            r0.read(r2, r3)
        L7:
            org.simpleframework.xml.strategy.Strategy r0 = r1.strategy
            org.simpleframework.xml.strategy.Value r2 = r0.read(r2, r3, r4)
            return r2
    }

    @Override // org.simpleframework.xml.strategy.Strategy
    public boolean write(org.simpleframework.xml.strategy.Type r2, java.lang.Object r3, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.OutputNode> r4, java.util.Map r5) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.strategy.Strategy r0 = r1.strategy
            boolean r3 = r0.write(r2, r3, r4, r5)
            org.simpleframework.xml.strategy.Visitor r5 = r1.visitor
            if (r5 == 0) goto Ld
            r5.write(r2, r4)
        Ld:
            return r3
    }
}
