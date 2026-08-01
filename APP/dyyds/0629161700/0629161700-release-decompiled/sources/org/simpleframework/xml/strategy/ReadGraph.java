package org.simpleframework.xml.strategy;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ReadGraph extends java.util.HashMap {
    private final java.lang.String label;
    private final java.lang.String length;
    private final org.simpleframework.xml.strategy.Loader loader;
    private final java.lang.String mark;
    private final java.lang.String refer;

    public ReadGraph(org.simpleframework.xml.strategy.Contract r2, org.simpleframework.xml.strategy.Loader r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.getReference()
            r1.refer = r0
            java.lang.String r0 = r2.getIdentity()
            r1.mark = r0
            java.lang.String r0 = r2.getLength()
            r1.length = r0
            java.lang.String r2 = r2.getLabel()
            r1.label = r2
            r1.loader = r3
            return
    }

    private org.simpleframework.xml.strategy.Value readArray(org.simpleframework.xml.strategy.Type r1, java.lang.Class r2, org.simpleframework.xml.stream.NodeMap r3) {
            r0 = this;
            java.lang.String r0 = r0.length
            org.simpleframework.xml.stream.Node r0 = r3.remove(r0)
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.getValue()
            int r0 = java.lang.Integer.parseInt(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            org.simpleframework.xml.strategy.ArrayValue r1 = new org.simpleframework.xml.strategy.ArrayValue
            r1.<init>(r2, r0)
            return r1
    }

    private org.simpleframework.xml.strategy.Value readInstance(org.simpleframework.xml.strategy.Type r3, java.lang.Class r4, org.simpleframework.xml.stream.NodeMap r5) {
            r2 = this;
            java.lang.String r0 = r2.mark
            org.simpleframework.xml.stream.Node r0 = r5.remove(r0)
            if (r0 != 0) goto Ld
            org.simpleframework.xml.strategy.Value r2 = r2.readReference(r3, r4, r5)
            return r2
        Ld:
            java.lang.String r0 = r0.getValue()
            boolean r1 = r2.containsKey(r0)
            if (r1 != 0) goto L1c
            org.simpleframework.xml.strategy.Value r2 = r2.readValue(r3, r4, r5, r0)
            return r2
        L1c:
            org.simpleframework.xml.strategy.CycleException r2 = new org.simpleframework.xml.strategy.CycleException
            java.lang.String r3 = "Element '%s' already exists"
            java.lang.Object[] r4 = new java.lang.Object[]{r0}
            r2.<init>(r3, r4)
            throw r2
    }

    private org.simpleframework.xml.strategy.Value readReference(org.simpleframework.xml.strategy.Type r2, java.lang.Class r3, org.simpleframework.xml.stream.NodeMap r4) {
            r1 = this;
            java.lang.String r0 = r1.refer
            org.simpleframework.xml.stream.Node r0 = r4.remove(r0)
            if (r0 != 0) goto Ld
            org.simpleframework.xml.strategy.Value r1 = r1.readValue(r2, r3, r4)
            return r1
        Ld:
            java.lang.String r2 = r0.getValue()
            java.lang.Object r4 = r1.get(r2)
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L21
            org.simpleframework.xml.strategy.Reference r1 = new org.simpleframework.xml.strategy.Reference
            r1.<init>(r4, r3)
            return r1
        L21:
            org.simpleframework.xml.strategy.CycleException r1 = new org.simpleframework.xml.strategy.CycleException
            java.lang.String r3 = "Invalid reference '%s' found"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r1.<init>(r3, r2)
            throw r1
    }

    private org.simpleframework.xml.strategy.Value readValue(org.simpleframework.xml.strategy.Type r2, java.lang.Class r3, org.simpleframework.xml.stream.NodeMap r4) {
            r1 = this;
            java.lang.Class r0 = r2.getType()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto Lf
            org.simpleframework.xml.strategy.Value r1 = r1.readArray(r2, r3, r4)
            return r1
        Lf:
            org.simpleframework.xml.strategy.ObjectValue r1 = new org.simpleframework.xml.strategy.ObjectValue
            r1.<init>(r3)
            return r1
    }

    private org.simpleframework.xml.strategy.Value readValue(org.simpleframework.xml.strategy.Type r1, java.lang.Class r2, org.simpleframework.xml.stream.NodeMap r3, java.lang.String r4) {
            r0 = this;
            org.simpleframework.xml.strategy.Value r1 = r0.readValue(r1, r2, r3)
            if (r4 == 0) goto Lc
            org.simpleframework.xml.strategy.Allocate r2 = new org.simpleframework.xml.strategy.Allocate
            r2.<init>(r1, r0, r4)
            return r2
        Lc:
            return r1
    }

    public org.simpleframework.xml.strategy.Value read(org.simpleframework.xml.strategy.Type r4, org.simpleframework.xml.stream.NodeMap r5) {
            r3 = this;
            java.lang.String r0 = r3.label
            org.simpleframework.xml.stream.Node r0 = r5.remove(r0)
            java.lang.Class r1 = r4.getType()
            boolean r2 = r1.isArray()
            if (r2 == 0) goto L14
            java.lang.Class r1 = r1.getComponentType()
        L14:
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.getValue()
            org.simpleframework.xml.strategy.Loader r1 = r3.loader
            java.lang.Class r1 = r1.load(r0)
        L20:
            org.simpleframework.xml.strategy.Value r3 = r3.readInstance(r4, r1, r5)
            return r3
    }
}
