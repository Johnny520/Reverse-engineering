package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getComment() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.Mode getMode() {
            r0 = this;
            org.simpleframework.xml.stream.Mode r0 = org.simpleframework.xml.stream.Mode.INHERIT
            return r0
    }

    @Override // org.simpleframework.xml.stream.Node
    public java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.name
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.NamespaceMap getNamespaces() {
            r0 = this;
            org.simpleframework.xml.stream.NamespaceMap r0 = r0.scope
            return r0
    }

    @Override // org.simpleframework.xml.stream.Node
    public /* bridge */ /* synthetic */ org.simpleframework.xml.stream.Node getParent() {
            r0 = this;
            org.simpleframework.xml.stream.OutputNode r0 = r0.getParent()
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode, org.simpleframework.xml.stream.Node
    public org.simpleframework.xml.stream.OutputNode getParent() {
            r0 = this;
            org.simpleframework.xml.stream.OutputNode r0 = r0.source
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getPrefix() {
            r1 = this;
            org.simpleframework.xml.stream.NamespaceMap r0 = r1.scope
            java.lang.String r1 = r1.reference
            java.lang.String r1 = r0.getPrefix(r1)
            return r1
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getPrefix(boolean r1) {
            r0 = this;
            org.simpleframework.xml.stream.NamespaceMap r1 = r0.scope
            java.lang.String r0 = r0.reference
            java.lang.String r0 = r1.getPrefix(r0)
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getReference() {
            r0 = this;
            java.lang.String r0 = r0.reference
            return r0
    }

    @Override // org.simpleframework.xml.stream.Node
    public java.lang.String getValue() {
            r0 = this;
            java.lang.String r0 = r0.value
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public boolean isCommitted() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public boolean isRoot() {
            r0 = this;
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
            r0 = 0
            return r0
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
            r3 = this;
            java.lang.String r0 = r3.name
            java.lang.String r3 = r3.value
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "attribute "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "='"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = "'"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
