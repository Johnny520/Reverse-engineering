package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class InputNodeMap extends java.util.LinkedHashMap<java.lang.String, org.simpleframework.xml.stream.InputNode> implements org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.InputNode> {
    private final org.simpleframework.xml.stream.InputNode source;

    public InputNodeMap(org.simpleframework.xml.stream.InputNode r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    public InputNodeMap(org.simpleframework.xml.stream.InputNode r1, org.simpleframework.xml.stream.EventNode r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.build(r2)
            return
    }

    private void build(org.simpleframework.xml.stream.EventNode r4) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r4.next()
            org.simpleframework.xml.stream.Attribute r0 = (org.simpleframework.xml.stream.Attribute) r0
            org.simpleframework.xml.stream.InputAttribute r1 = new org.simpleframework.xml.stream.InputAttribute
            org.simpleframework.xml.stream.InputNode r2 = r3.source
            r1.<init>(r2, r0)
            boolean r0 = r0.isReserved()
            if (r0 != 0) goto L4
            java.lang.String r0 = r1.getName()
            r3.put(r0, r1)
            goto L4
        L25:
            return
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public org.simpleframework.xml.stream.InputNode get(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            org.simpleframework.xml.stream.InputNode r1 = (org.simpleframework.xml.stream.InputNode) r1
            return r1
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public /* bridge */ /* synthetic */ org.simpleframework.xml.stream.Node get(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.stream.InputNode r1 = r0.get(r1)
            return r1
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public java.lang.String getName() {
            r1 = this;
            org.simpleframework.xml.stream.InputNode r0 = r1.source
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public org.simpleframework.xml.stream.InputNode getNode() {
            r1 = this;
            org.simpleframework.xml.stream.InputNode r0 = r1.source
            return r0
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public /* bridge */ /* synthetic */ org.simpleframework.xml.stream.Node getNode() {
            r1 = this;
            org.simpleframework.xml.stream.InputNode r0 = r1.getNode()
            return r0
    }

    @Override // org.simpleframework.xml.stream.NodeMap, java.lang.Iterable
    public java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            java.util.Set r0 = r1.keySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public org.simpleframework.xml.stream.InputNode put(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            org.simpleframework.xml.stream.InputAttribute r0 = new org.simpleframework.xml.stream.InputAttribute
            org.simpleframework.xml.stream.InputNode r1 = r2.source
            r0.<init>(r1, r3, r4)
            if (r3 == 0) goto Lc
            r2.put(r3, r0)
        Lc:
            return r0
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public /* bridge */ /* synthetic */ org.simpleframework.xml.stream.Node put(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            org.simpleframework.xml.stream.InputNode r1 = r0.put(r1, r2)
            return r1
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public org.simpleframework.xml.stream.InputNode remove(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = super.remove(r1)
            org.simpleframework.xml.stream.InputNode r1 = (org.simpleframework.xml.stream.InputNode) r1
            return r1
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public /* bridge */ /* synthetic */ org.simpleframework.xml.stream.Node remove(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.stream.InputNode r1 = r0.remove(r1)
            return r1
    }
}
