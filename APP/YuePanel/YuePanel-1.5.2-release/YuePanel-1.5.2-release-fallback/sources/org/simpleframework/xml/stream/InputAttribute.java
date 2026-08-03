package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class InputAttribute implements org.simpleframework.xml.stream.InputNode {
    private java.lang.String name;
    private org.simpleframework.xml.stream.InputNode parent;
    private java.lang.String prefix;
    private java.lang.String reference;
    private java.lang.Object source;
    private java.lang.String value;

    public InputAttribute(org.simpleframework.xml.stream.InputNode r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.parent = r1
            r0.value = r3
            r0.name = r2
            return
    }

    public InputAttribute(org.simpleframework.xml.stream.InputNode r2, org.simpleframework.xml.stream.Attribute r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r3.getReference()
            r1.reference = r0
            java.lang.String r0 = r3.getPrefix()
            r1.prefix = r0
            java.lang.Object r0 = r3.getSource()
            r1.source = r0
            java.lang.String r0 = r3.getValue()
            r1.value = r0
            java.lang.String r3 = r3.getName()
            r1.name = r3
            r1.parent = r2
            return
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public org.simpleframework.xml.stream.InputNode getAttribute(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.InputNode> getAttributes() {
            r1 = this;
            org.simpleframework.xml.stream.InputNodeMap r0 = new org.simpleframework.xml.stream.InputNodeMap
            r0.<init>(r1)
            return r0
    }

    @Override // org.simpleframework.xml.stream.Node
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public org.simpleframework.xml.stream.InputNode getNext() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public org.simpleframework.xml.stream.InputNode getNext(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
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
            r1 = this;
            org.simpleframework.xml.stream.InputNode r0 = r1.parent
            org.simpleframework.xml.stream.Position r0 = r0.getPosition()
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public java.lang.String getPrefix() {
            r1 = this;
            java.lang.String r0 = r1.prefix
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public java.lang.String getReference() {
            r1 = this;
            java.lang.String r0 = r1.reference
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public java.lang.Object getSource() {
            r1 = this;
            java.lang.Object r0 = r1.source
            return r0
    }

    @Override // org.simpleframework.xml.stream.Node
    public java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public boolean isElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public boolean isEmpty() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public boolean isRoot() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public void skip() {
            r0 = this;
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.name
            java.lang.String r1 = r2.value
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "attribute %s='%s'"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
