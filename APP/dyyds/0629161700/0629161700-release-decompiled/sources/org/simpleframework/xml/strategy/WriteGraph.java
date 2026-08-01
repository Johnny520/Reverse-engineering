package org.simpleframework.xml.strategy;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class WriteGraph extends java.util.IdentityHashMap<java.lang.Object, java.lang.String> {
    private final java.lang.String label;
    private final java.lang.String length;
    private final java.lang.String mark;
    private final java.lang.String refer;

    public WriteGraph(org.simpleframework.xml.strategy.Contract r2) {
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
            return
    }

    private java.lang.Class writeArray(java.lang.Class r2, java.lang.Object r3, org.simpleframework.xml.stream.NodeMap r4) {
            r1 = this;
            int r0 = java.lang.reflect.Array.getLength(r3)
            boolean r3 = r1.containsKey(r3)
            if (r3 != 0) goto L13
            java.lang.String r1 = r1.length
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r4.put(r1, r3)
        L13:
            java.lang.Class r1 = r2.getComponentType()
            return r1
    }

    private boolean writeReference(java.lang.Object r3, org.simpleframework.xml.stream.NodeMap r4) {
            r2 = this;
            java.lang.Object r0 = r2.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r2.size()
            if (r0 == 0) goto L13
            java.lang.String r2 = r2.refer
            r4.put(r2, r0)
            r2 = 1
            return r2
        L13:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r2.mark
            r4.put(r1, r0)
            r2.put(r3, r0)
            r2 = 0
            return r2
    }

    public boolean write(org.simpleframework.xml.strategy.Type r3, java.lang.Object r4, org.simpleframework.xml.stream.NodeMap r5) {
            r2 = this;
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r3 = r3.getType()
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L13
            java.lang.Class r1 = r2.writeArray(r0, r4, r5)
            goto L14
        L13:
            r1 = r0
        L14:
            if (r0 == r3) goto L1f
            java.lang.String r3 = r2.label
            java.lang.String r0 = r1.getName()
            r5.put(r3, r0)
        L1f:
            boolean r2 = r2.writeReference(r4, r5)
            return r2
    }
}
