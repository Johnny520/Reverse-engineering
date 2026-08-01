package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class OutputDocument implements org.simpleframework.xml.stream.OutputNode {
    private java.lang.String comment;
    private org.simpleframework.xml.stream.Mode mode;
    private java.lang.String name;
    private java.lang.String reference;
    private org.simpleframework.xml.stream.OutputStack stack;
    private org.simpleframework.xml.stream.OutputNodeMap table;
    private java.lang.String value;
    private org.simpleframework.xml.stream.NodeWriter writer;

    public OutputDocument(org.simpleframework.xml.stream.NodeWriter r2, org.simpleframework.xml.stream.OutputStack r3) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.stream.OutputNodeMap r0 = new org.simpleframework.xml.stream.OutputNodeMap
            r0.<init>(r1)
            r1.table = r0
            org.simpleframework.xml.stream.Mode r0 = org.simpleframework.xml.stream.Mode.INHERIT
            r1.mode = r0
            r1.writer = r2
            r1.stack = r3
            return
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void commit() {
            r1 = this;
            org.simpleframework.xml.stream.OutputStack r0 = r1.stack
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            org.simpleframework.xml.stream.OutputStack r1 = r1.stack
            org.simpleframework.xml.stream.OutputNode r1 = r1.bottom()
            r1.commit()
            return
        L12:
            org.simpleframework.xml.stream.NodeException r1 = new org.simpleframework.xml.stream.NodeException
            java.lang.String r0 = "No root node"
            r1.<init>(r0)
            throw r1
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.OutputNode> getAttributes() {
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
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.NamespaceMap getNamespaces() {
            r0 = this;
            r0 = 0
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
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getPrefix() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getPrefix(boolean r1) {
            r0 = this;
            r0 = 0
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
            org.simpleframework.xml.stream.OutputStack r0 = r0.stack
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public boolean isRoot() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void remove() {
            r1 = this;
            org.simpleframework.xml.stream.OutputStack r0 = r1.stack
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            org.simpleframework.xml.stream.OutputStack r1 = r1.stack
            org.simpleframework.xml.stream.OutputNode r1 = r1.bottom()
            r1.remove()
            return
        L12:
            org.simpleframework.xml.stream.NodeException r1 = new org.simpleframework.xml.stream.NodeException
            java.lang.String r0 = "No root node"
            r1.<init>(r0)
            throw r1
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
}
