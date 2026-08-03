package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
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
    public void commit() throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.stream.OutputStack r0 = r2.stack
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            org.simpleframework.xml.stream.OutputStack r0 = r2.stack
            org.simpleframework.xml.stream.OutputNode r0 = r0.bottom()
            r0.commit()
            return
        L12:
            org.simpleframework.xml.stream.NodeException r0 = new org.simpleframework.xml.stream.NodeException
            java.lang.String r1 = "No root node"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.OutputNode> getAttributes() {
            r1 = this;
            org.simpleframework.xml.stream.OutputNodeMap r0 = r1.table
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.OutputNode getChild(java.lang.String r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.stream.NodeWriter r0 = r1.writer
            org.simpleframework.xml.stream.OutputNode r2 = r0.writeElement(r1, r2)
            return r2
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getComment() {
            r1 = this;
            java.lang.String r0 = r1.comment
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.Mode getMode() {
            r1 = this;
            org.simpleframework.xml.stream.Mode r0 = r1.mode
            return r0
    }

    @Override // org.simpleframework.xml.stream.Node
    public java.lang.String getName() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.NamespaceMap getNamespaces() {
            r1 = this;
            r0 = 0
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
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getPrefix() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getPrefix(boolean r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public java.lang.String getReference() {
            r1 = this;
            java.lang.String r0 = r1.reference
            return r0
    }

    @Override // org.simpleframework.xml.stream.Node
    public java.lang.String getValue() throws java.lang.Exception {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public boolean isCommitted() {
            r1 = this;
            org.simpleframework.xml.stream.OutputStack r0 = r1.stack
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public boolean isRoot() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void remove() throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.stream.OutputStack r0 = r2.stack
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            org.simpleframework.xml.stream.OutputStack r0 = r2.stack
            org.simpleframework.xml.stream.OutputNode r0 = r0.bottom()
            r0.remove()
            return
        L12:
            org.simpleframework.xml.stream.NodeException r0 = new org.simpleframework.xml.stream.NodeException
            java.lang.String r1 = "No root node"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public org.simpleframework.xml.stream.OutputNode setAttribute(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            org.simpleframework.xml.stream.OutputNodeMap r0 = r1.table
            org.simpleframework.xml.stream.OutputNode r2 = r0.put(r2, r3)
            return r2
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
            goto Lb
        L7:
            org.simpleframework.xml.stream.Mode r1 = org.simpleframework.xml.stream.Mode.ESCAPE
            r0.mode = r1
        Lb:
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
