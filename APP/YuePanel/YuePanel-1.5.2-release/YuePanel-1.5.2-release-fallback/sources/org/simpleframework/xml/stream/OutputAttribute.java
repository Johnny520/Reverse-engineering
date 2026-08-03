package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class OutputAttribute implements org.simpleframework.xml.stream.OutputNode {
    private java.lang.String name;
    private java.lang.String reference;
    private org.simpleframework.xml.stream.NamespaceMap scope;
    private org.simpleframework.xml.stream.OutputNode source;
    private java.lang.String value;

    public OutputAttribute(org.simpleframework.xml.stream.OutputNode r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.stream.NamespaceMap r0 = r2.getNamespaces()
            r1.scope = r0
            r1.source = r2
            r1.value = r4
            r1.name = r3
            return
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void commit() {
            r0 = this;
            return
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.OutputNode> getAttributes() {
            r1 = this;
            org.simpleframework.xml.stream.OutputNodeMap r0 = new org.simpleframework.xml.stream.OutputNodeMap
            r0.<init>(r1)
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.OutputNode getChild(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getComment() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.Mode getMode() {
            r1 = this;
            org.simpleframework.xml.stream.Mode r0 = org.simpleframework.xml.stream.Mode.INHERIT
            return r0
    }

    @Override // org.simpleframework.xml.stream.Node
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.NamespaceMap getNamespaces() {
            r1 = this;
            org.simpleframework.xml.stream.NamespaceMap r0 = r1.scope
            return r0
    }

    @Override // org.simpleframework.xml.stream.Node
    public /* bridge */ /* synthetic */ org.simpleframework.xml.stream.Node getParent() {
            r1 = this;
            org.simpleframework.xml.stream.OutputNode r0 = r1.getParent()
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode, org.simpleframework.xml.stream.Node
    public org.simpleframework.xml.stream.OutputNode getParent() {
            r1 = this;
            org.simpleframework.xml.stream.OutputNode r0 = r1.source
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getPrefix() {
            r2 = this;
            org.simpleframework.xml.stream.NamespaceMap r0 = r2.scope
            java.lang.String r1 = r2.reference
            java.lang.String r0 = r0.getPrefix(r1)
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getPrefix(boolean r2) {
            r1 = this;
            org.simpleframework.xml.stream.NamespaceMap r2 = r1.scope
            java.lang.String r0 = r1.reference
            java.lang.String r2 = r2.getPrefix(r0)
            return r2
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getReference() {
            r1 = this;
            java.lang.String r0 = r1.reference
            return r0
    }

    @Override // org.simpleframework.xml.stream.Node
    public java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public boolean isCommitted() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public boolean isRoot() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void remove() {
            r0 = this;
            return
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.OutputNode setAttribute(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void setComment(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void setData(boolean r1) {
            r0 = this;
            return
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void setMode(org.simpleframework.xml.stream.Mode r1) {
            r0 = this;
            return
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void setName(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void setReference(java.lang.String r1) {
            r0 = this;
            r0.reference = r1
            return
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void setValue(java.lang.String r1) {
            r0 = this;
            r0.value = r1
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
