package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class OutputNodeMap extends java.util.LinkedHashMap<java.lang.String, org.simpleframework.xml.stream.OutputNode> implements org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.OutputNode> {
    private final org.simpleframework.xml.stream.OutputNode source;

    public OutputNodeMap(org.simpleframework.xml.stream.OutputNode r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public /* bridge */ /* synthetic */ org.simpleframework.xml.stream.Node get(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.stream.OutputNode r1 = r0.get(r1)
            return r1
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public org.simpleframework.xml.stream.OutputNode get(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            org.simpleframework.xml.stream.OutputNode r1 = (org.simpleframework.xml.stream.OutputNode) r1
            return r1
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public java.lang.String getName() {
            r1 = this;
            org.simpleframework.xml.stream.OutputNode r0 = r1.source
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public /* bridge */ /* synthetic */ org.simpleframework.xml.stream.Node getNode() {
            r1 = this;
            org.simpleframework.xml.stream.OutputNode r0 = r1.getNode()
            return r0
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public org.simpleframework.xml.stream.OutputNode getNode() {
            r1 = this;
            org.simpleframework.xml.stream.OutputNode r0 = r1.source
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
    public /* bridge */ /* synthetic */ org.simpleframework.xml.stream.Node put(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            org.simpleframework.xml.stream.OutputNode r1 = r0.put(r1, r2)
            return r1
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public org.simpleframework.xml.stream.OutputNode put(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            org.simpleframework.xml.stream.OutputAttribute r0 = new org.simpleframework.xml.stream.OutputAttribute
            org.simpleframework.xml.stream.OutputNode r1 = r2.source
            r0.<init>(r1, r3, r4)
            org.simpleframework.xml.stream.OutputNode r4 = r2.source
            if (r4 == 0) goto Le
            r2.put(r3, r0)
        Le:
            return r0
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public /* bridge */ /* synthetic */ org.simpleframework.xml.stream.Node remove(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.stream.OutputNode r1 = r0.remove(r1)
            return r1
    }

    @Override // org.simpleframework.xml.stream.NodeMap
    public org.simpleframework.xml.stream.OutputNode remove(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = super.remove(r1)
            org.simpleframework.xml.stream.OutputNode r1 = (org.simpleframework.xml.stream.OutputNode) r1
            return r1
    }
}
