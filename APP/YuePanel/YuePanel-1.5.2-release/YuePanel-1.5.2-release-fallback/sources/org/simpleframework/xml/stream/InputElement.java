package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class InputElement implements org.simpleframework.xml.stream.InputNode {
    private final org.simpleframework.xml.stream.InputNodeMap map;
    private final org.simpleframework.xml.stream.EventNode node;
    private final org.simpleframework.xml.stream.InputNode parent;
    private final org.simpleframework.xml.stream.NodeReader reader;

    public InputElement(org.simpleframework.xml.stream.InputNode r2, org.simpleframework.xml.stream.NodeReader r3, org.simpleframework.xml.stream.EventNode r4) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.stream.InputNodeMap r0 = new org.simpleframework.xml.stream.InputNodeMap
            r0.<init>(r1, r4)
            r1.map = r0
            r1.reader = r3
            r1.parent = r2
            r1.node = r4
            return
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public org.simpleframework.xml.stream.InputNode getAttribute(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.stream.InputNodeMap r0 = r1.map
            org.simpleframework.xml.stream.InputNode r2 = r0.get(r2)
            return r2
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.InputNode> getAttributes() {
            r1 = this;
            org.simpleframework.xml.stream.InputNodeMap r0 = r1.map
            return r0
    }

    @Override // org.simpleframework.xml.stream.Node
    public java.lang.String getName() {
            r1 = this;
            org.simpleframework.xml.stream.EventNode r0 = r1.node
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public org.simpleframework.xml.stream.InputNode getNext() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.stream.NodeReader r0 = r1.reader
            org.simpleframework.xml.stream.InputNode r0 = r0.readElement(r1)
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public org.simpleframework.xml.stream.InputNode getNext(java.lang.String r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.stream.NodeReader r0 = r1.reader
            org.simpleframework.xml.stream.InputNode r2 = r0.readElement(r1, r2)
            return r2
    }

    @Override // org.simpleframework.xml.stream.InputNode, org.simpleframework.xml.stream.Node
    public org.simpleframework.xml.stream.InputNode getParent() {
            r1 = this;
            org.simpleframework.xml.stream.InputNode r0 = r1.parent
            return r0
    }

    @Override // org.simpleframework.xml.stream.Node
    public /* bridge */ /* synthetic */ org.simpleframework.xml.stream.Node getParent() {
            r1 = this;
            org.simpleframework.xml.stream.InputNode r0 = r1.getParent()
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public org.simpleframework.xml.stream.Position getPosition() {
            r2 = this;
            org.simpleframework.xml.stream.InputPosition r0 = new org.simpleframework.xml.stream.InputPosition
            org.simpleframework.xml.stream.EventNode r1 = r2.node
            r0.<init>(r1)
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public java.lang.String getPrefix() {
            r1 = this;
            org.simpleframework.xml.stream.EventNode r0 = r1.node
            java.lang.String r0 = r0.getPrefix()
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public java.lang.String getReference() {
            r1 = this;
            org.simpleframework.xml.stream.EventNode r0 = r1.node
            java.lang.String r0 = r0.getReference()
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public java.lang.Object getSource() {
            r1 = this;
            org.simpleframework.xml.stream.EventNode r0 = r1.node
            java.lang.Object r0 = r0.getSource()
            return r0
    }

    @Override // org.simpleframework.xml.stream.Node
    public java.lang.String getValue() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.stream.NodeReader r0 = r1.reader
            java.lang.String r0 = r0.readValue(r1)
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public boolean isElement() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public boolean isEmpty() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.stream.InputNodeMap r0 = r1.map
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            org.simpleframework.xml.stream.NodeReader r0 = r1.reader
            boolean r0 = r0.isEmpty(r1)
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public boolean isRoot() {
            r1 = this;
            org.simpleframework.xml.stream.NodeReader r0 = r1.reader
            boolean r0 = r0.isRoot(r1)
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public void skip() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.stream.NodeReader r0 = r1.reader
            r0.skipElement(r1)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.getName()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "element %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
