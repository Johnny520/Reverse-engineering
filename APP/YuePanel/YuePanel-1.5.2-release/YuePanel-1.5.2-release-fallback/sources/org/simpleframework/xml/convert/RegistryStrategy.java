package org.simpleframework.xml.convert;

/* JADX INFO: loaded from: classes2.dex */
public class RegistryStrategy implements org.simpleframework.xml.strategy.Strategy {
    private final org.simpleframework.xml.convert.Registry registry;
    private final org.simpleframework.xml.strategy.Strategy strategy;

    public RegistryStrategy(org.simpleframework.xml.convert.Registry r2) {
            r1 = this;
            org.simpleframework.xml.strategy.TreeStrategy r0 = new org.simpleframework.xml.strategy.TreeStrategy
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public RegistryStrategy(org.simpleframework.xml.convert.Registry r1, org.simpleframework.xml.strategy.Strategy r2) {
            r0 = this;
            r0.<init>()
            r0.registry = r1
            r0.strategy = r2
            return
    }

    private boolean isReference(org.simpleframework.xml.strategy.Value r1) {
            r0 = this;
            if (r1 == 0) goto La
            boolean r1 = r1.isReference()
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    private org.simpleframework.xml.convert.Converter lookup(org.simpleframework.xml.strategy.Type r1, java.lang.Object r2) throws java.lang.Exception {
            r0 = this;
            java.lang.Class r1 = r1.getType()
            if (r2 == 0) goto La
            java.lang.Class r1 = r2.getClass()
        La:
            org.simpleframework.xml.convert.Registry r2 = r0.registry
            org.simpleframework.xml.convert.Converter r1 = r2.lookup(r1)
            return r1
    }

    private org.simpleframework.xml.convert.Converter lookup(org.simpleframework.xml.strategy.Type r1, org.simpleframework.xml.strategy.Value r2) throws java.lang.Exception {
            r0 = this;
            java.lang.Class r1 = r1.getType()
            if (r2 == 0) goto La
            java.lang.Class r1 = r2.getType()
        La:
            org.simpleframework.xml.convert.Registry r2 = r0.registry
            org.simpleframework.xml.convert.Converter r1 = r2.lookup(r1)
            return r1
    }

    private org.simpleframework.xml.strategy.Value read(org.simpleframework.xml.strategy.Type r2, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.InputNode> r3, org.simpleframework.xml.strategy.Value r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.convert.Converter r0 = r1.lookup(r2, r4)
            org.simpleframework.xml.stream.Node r3 = r3.getNode()
            org.simpleframework.xml.stream.InputNode r3 = (org.simpleframework.xml.stream.InputNode) r3
            if (r0 == 0) goto L1f
            java.lang.Object r3 = r0.read(r3)
            java.lang.Class r2 = r2.getType()
            if (r4 == 0) goto L19
            r4.setValue(r3)
        L19:
            org.simpleframework.xml.convert.Reference r0 = new org.simpleframework.xml.convert.Reference
            r0.<init>(r4, r3, r2)
            return r0
        L1f:
            return r4
    }

    private boolean write(org.simpleframework.xml.strategy.Type r1, java.lang.Object r2, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.OutputNode> r3) throws java.lang.Exception {
            r0 = this;
            org.simpleframework.xml.convert.Converter r1 = r0.lookup(r1, r2)
            org.simpleframework.xml.stream.Node r3 = r3.getNode()
            org.simpleframework.xml.stream.OutputNode r3 = (org.simpleframework.xml.stream.OutputNode) r3
            if (r1 == 0) goto L11
            r1.write(r3, r2)
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }

    @Override // org.simpleframework.xml.strategy.Strategy
    public org.simpleframework.xml.strategy.Value read(org.simpleframework.xml.strategy.Type r2, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.InputNode> r3, java.util.Map r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.strategy.Strategy r0 = r1.strategy
            org.simpleframework.xml.strategy.Value r4 = r0.read(r2, r3, r4)
            boolean r0 = r1.isReference(r4)
            if (r0 == 0) goto Ld
            return r4
        Ld:
            org.simpleframework.xml.strategy.Value r2 = r1.read(r2, r3, r4)
            return r2
    }

    @Override // org.simpleframework.xml.strategy.Strategy
    public boolean write(org.simpleframework.xml.strategy.Type r2, java.lang.Object r3, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.OutputNode> r4, java.util.Map r5) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.strategy.Strategy r0 = r1.strategy
            boolean r5 = r0.write(r2, r3, r4, r5)
            if (r5 != 0) goto Ld
            boolean r2 = r1.write(r2, r3, r4)
            return r2
        Ld:
            return r5
    }
}
