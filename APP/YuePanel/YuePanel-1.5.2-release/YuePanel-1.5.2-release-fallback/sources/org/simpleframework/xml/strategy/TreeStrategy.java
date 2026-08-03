package org.simpleframework.xml.strategy;

/* JADX INFO: loaded from: classes2.dex */
public class TreeStrategy implements org.simpleframework.xml.strategy.Strategy {
    private final java.lang.String label;
    private final java.lang.String length;
    private final org.simpleframework.xml.strategy.Loader loader;

    public TreeStrategy() {
            r2 = this;
            java.lang.String r0 = "class"
            java.lang.String r1 = "length"
            r2.<init>(r0, r1)
            return
    }

    public TreeStrategy(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.strategy.Loader r0 = new org.simpleframework.xml.strategy.Loader
            r0.<init>()
            r1.loader = r0
            r1.length = r3
            r1.label = r2
            return
    }

    private org.simpleframework.xml.strategy.Value readArray(java.lang.Class r2, org.simpleframework.xml.stream.NodeMap r3) throws java.lang.Exception {
            r1 = this;
            java.lang.String r0 = r1.length
            org.simpleframework.xml.stream.Node r3 = r3.remove(r0)
            if (r3 == 0) goto L11
            java.lang.String r3 = r3.getValue()
            int r3 = java.lang.Integer.parseInt(r3)
            goto L12
        L11:
            r3 = 0
        L12:
            org.simpleframework.xml.strategy.ArrayValue r0 = new org.simpleframework.xml.strategy.ArrayValue
            r0.<init>(r2, r3)
            return r0
    }

    private java.lang.Class readValue(org.simpleframework.xml.strategy.Type r2, org.simpleframework.xml.stream.NodeMap r3) throws java.lang.Exception {
            r1 = this;
            java.lang.String r0 = r1.label
            org.simpleframework.xml.stream.Node r3 = r3.remove(r0)
            java.lang.Class r2 = r2.getType()
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L14
            java.lang.Class r2 = r2.getComponentType()
        L14:
            if (r3 == 0) goto L20
            java.lang.String r2 = r3.getValue()
            org.simpleframework.xml.strategy.Loader r3 = r1.loader
            java.lang.Class r2 = r3.load(r2)
        L20:
            return r2
    }

    private java.lang.Class writeArray(java.lang.Class r2, java.lang.Object r3, org.simpleframework.xml.stream.NodeMap r4) {
            r1 = this;
            int r3 = java.lang.reflect.Array.getLength(r3)
            java.lang.String r0 = r1.length
            if (r0 == 0) goto Lf
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4.put(r0, r3)
        Lf:
            java.lang.Class r2 = r2.getComponentType()
            return r2
    }

    @Override // org.simpleframework.xml.strategy.Strategy
    public org.simpleframework.xml.strategy.Value read(org.simpleframework.xml.strategy.Type r2, org.simpleframework.xml.stream.NodeMap r3, java.util.Map r4) throws java.lang.Exception {
            r1 = this;
            java.lang.Class r4 = r1.readValue(r2, r3)
            java.lang.Class r2 = r2.getType()
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L13
            org.simpleframework.xml.strategy.Value r2 = r1.readArray(r4, r3)
            return r2
        L13:
            if (r2 == r4) goto L1b
            org.simpleframework.xml.strategy.ObjectValue r2 = new org.simpleframework.xml.strategy.ObjectValue
            r2.<init>(r4)
            return r2
        L1b:
            r2 = 0
            return r2
    }

    @Override // org.simpleframework.xml.strategy.Strategy
    public boolean write(org.simpleframework.xml.strategy.Type r2, java.lang.Object r3, org.simpleframework.xml.stream.NodeMap r4, java.util.Map r5) {
            r1 = this;
            java.lang.Class r5 = r3.getClass()
            java.lang.Class r2 = r2.getType()
            boolean r0 = r5.isArray()
            if (r0 == 0) goto L13
            java.lang.Class r3 = r1.writeArray(r2, r3, r4)
            goto L14
        L13:
            r3 = r5
        L14:
            if (r5 == r2) goto L1f
            java.lang.String r2 = r1.label
            java.lang.String r3 = r3.getName()
            r4.put(r2, r3)
        L1f:
            r2 = 0
            return r2
    }
}
