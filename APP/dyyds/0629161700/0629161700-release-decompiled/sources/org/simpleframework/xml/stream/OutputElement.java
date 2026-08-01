package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class OutputElement implements org.simpleframework.xml.stream.OutputNode {
    private java.lang.String comment;
    private org.simpleframework.xml.stream.Mode mode;
    private java.lang.String name;
    private org.simpleframework.xml.stream.OutputNode parent;
    private java.lang.String reference;
    private org.simpleframework.xml.stream.NamespaceMap scope;
    private org.simpleframework.xml.stream.OutputNodeMap table;
    private java.lang.String value;
    private org.simpleframework.xml.stream.NodeWriter writer;

    public OutputElement(org.simpleframework.xml.stream.OutputNode r2, org.simpleframework.xml.stream.NodeWriter r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.stream.PrefixResolver r0 = new org.simpleframework.xml.stream.PrefixResolver
            r0.<init>(r2)
            r1.scope = r0
            org.simpleframework.xml.stream.OutputNodeMap r0 = new org.simpleframework.xml.stream.OutputNodeMap
            r0.<init>(r1)
            r1.table = r0
            org.simpleframework.xml.stream.Mode r0 = org.simpleframework.xml.stream.Mode.INHERIT
            r1.mode = r0
            r1.writer = r3
            r1.parent = r2
            r1.name = r4
            return
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void commit() {
            r1 = this;
            org.simpleframework.xml.stream.NodeWriter r0 = r1.writer
            r0.commit(r1)
            return
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public /* bridge */ /* synthetic */ org.simpleframework.xml.stream.NodeMap getAttributes() {
            r0 = this;
            org.simpleframework.xml.stream.OutputNodeMap r0 = r0.getAttributes()
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.OutputNodeMap getAttributes() {
            r0 = this;
            org.simpleframework.xml.stream.OutputNodeMap r0 = r0.table
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.OutputNode getChild(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.stream.NodeWriter r0 = r1.writer
            org.simpleframework.xml.stream.OutputNode r1 = r0.writeElement(r1, r2)
            return r1
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getComment() {
            r0 = this;
            java.lang.String r0 = r0.comment
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.Mode getMode() {
            r0 = this;
            org.simpleframework.xml.stream.Mode r0 = r0.mode
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
            org.simpleframework.xml.stream.OutputNode r0 = r0.parent
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getPrefix() {
            r1 = this;
            r0 = 1
            java.lang.String r1 = r1.getPrefix(r0)
            return r1
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getPrefix(boolean r3) {
            r2 = this;
            org.simpleframework.xml.stream.NamespaceMap r0 = r2.scope
            java.lang.String r1 = r2.reference
            java.lang.String r0 = r0.getPrefix(r1)
            if (r3 == 0) goto L13
            if (r0 != 0) goto L13
            org.simpleframework.xml.stream.OutputNode r2 = r2.parent
            java.lang.String r2 = r2.getPrefix()
            return r2
        L13:
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
            r1 = this;
            org.simpleframework.xml.stream.NodeWriter r0 = r1.writer
            boolean r1 = r0.isCommitted(r1)
            return r1
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public boolean isRoot() {
            r1 = this;
            org.simpleframework.xml.stream.NodeWriter r0 = r1.writer
            boolean r1 = r0.isRoot(r1)
            return r1
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void remove() {
            r1 = this;
            org.simpleframework.xml.stream.NodeWriter r0 = r1.writer
            r0.remove(r1)
            return
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.OutputNode setAttribute(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            org.simpleframework.xml.stream.OutputNodeMap r0 = r0.table
            org.simpleframework.xml.stream.OutputNode r0 = r0.put(r1, r2)
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void setComment(java.lang.String r1) {
            r0 = this;
            r0.comment = r1
            return
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void setData(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L7
            org.simpleframework.xml.stream.Mode r1 = org.simpleframework.xml.stream.Mode.DATA
            r0.mode = r1
            return
        L7:
            org.simpleframework.xml.stream.Mode r1 = org.simpleframework.xml.stream.Mode.ESCAPE
            r0.mode = r1
            return
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void setMode(org.simpleframework.xml.stream.Mode r1) {
            r0 = this;
            r0.mode = r1
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
            java.lang.String r2 = r2.name
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "element "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
