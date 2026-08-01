package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class NodeWriter {
    private final java.util.Set active;
    private final org.simpleframework.xml.stream.OutputStack stack;
    private final boolean verbose;
    private final org.simpleframework.xml.stream.Formatter writer;

    public NodeWriter(java.io.Writer r2) {
            r1 = this;
            org.simpleframework.xml.stream.Format r0 = new org.simpleframework.xml.stream.Format
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public NodeWriter(java.io.Writer r2, org.simpleframework.xml.stream.Format r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private NodeWriter(java.io.Writer r2, org.simpleframework.xml.stream.Format r3, boolean r4) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.stream.Formatter r0 = new org.simpleframework.xml.stream.Formatter
            r0.<init>(r2, r3)
            r1.writer = r0
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1.active = r2
            org.simpleframework.xml.stream.OutputStack r3 = new org.simpleframework.xml.stream.OutputStack
            r3.<init>(r2)
            r1.stack = r3
            r1.verbose = r4
            return
    }

    private void writeAttributes(org.simpleframework.xml.stream.OutputNode r7) {
            r6 = this;
            org.simpleframework.xml.stream.NodeMap r0 = r7.getAttributes()
            java.util.Iterator r1 = r0.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            org.simpleframework.xml.stream.Node r3 = r0.get(r2)
            org.simpleframework.xml.stream.OutputNode r3 = (org.simpleframework.xml.stream.OutputNode) r3
            java.lang.String r4 = r3.getValue()
            boolean r5 = r6.verbose
            java.lang.String r3 = r3.getPrefix(r5)
            org.simpleframework.xml.stream.Formatter r5 = r6.writer
            r5.writeAttribute(r2, r4, r3)
            goto L8
        L2a:
            java.util.Set r6 = r6.active
            r6.remove(r7)
            return
    }

    private void writeComment(org.simpleframework.xml.stream.OutputNode r1) {
            r0 = this;
            java.lang.String r1 = r1.getComment()
            if (r1 == 0) goto Lb
            org.simpleframework.xml.stream.Formatter r0 = r0.writer
            r0.writeComment(r1)
        Lb:
            return
    }

    private void writeEnd(org.simpleframework.xml.stream.OutputNode r4) {
            r3 = this;
            java.lang.String r0 = r4.getName()
            boolean r1 = r3.verbose
            java.lang.String r1 = r4.getPrefix(r1)
            java.lang.String r2 = r4.getValue()
            if (r2 == 0) goto L13
            r3.writeValue(r4)
        L13:
            if (r0 == 0) goto L1f
            org.simpleframework.xml.stream.Formatter r4 = r3.writer
            r4.writeEnd(r0, r1)
            org.simpleframework.xml.stream.Formatter r3 = r3.writer
            r3.flush()
        L1f:
            return
    }

    private void writeName(org.simpleframework.xml.stream.OutputNode r2) {
            r1 = this;
            boolean r0 = r1.verbose
            java.lang.String r0 = r2.getPrefix(r0)
            java.lang.String r2 = r2.getName()
            if (r2 == 0) goto L11
            org.simpleframework.xml.stream.Formatter r1 = r1.writer
            r1.writeStart(r2, r0)
        L11:
            return
    }

    private void writeNamespaces(org.simpleframework.xml.stream.OutputNode r5) {
            r4 = this;
            org.simpleframework.xml.stream.NamespaceMap r5 = r5.getNamespaces()
            java.util.Iterator r0 = r5.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r5.getPrefix(r1)
            org.simpleframework.xml.stream.Formatter r3 = r4.writer
            r3.writeNamespace(r1, r2)
            goto L8
        L1e:
            return
    }

    private org.simpleframework.xml.stream.OutputNode writeStart(org.simpleframework.xml.stream.OutputNode r2, java.lang.String r3) {
            r1 = this;
            org.simpleframework.xml.stream.OutputElement r0 = new org.simpleframework.xml.stream.OutputElement
            r0.<init>(r2, r1, r3)
            if (r3 == 0) goto Le
            org.simpleframework.xml.stream.OutputStack r1 = r1.stack
            org.simpleframework.xml.stream.OutputNode r1 = r1.push(r0)
            return r1
        Le:
            org.simpleframework.xml.stream.NodeException r1 = new org.simpleframework.xml.stream.NodeException
            java.lang.String r2 = "Can not have a null name"
            r1.<init>(r2)
            throw r1
    }

    private void writeStart(org.simpleframework.xml.stream.OutputNode r1) {
            r0 = this;
            r0.writeComment(r1)
            r0.writeName(r1)
            r0.writeAttributes(r1)
            r0.writeNamespaces(r1)
            return
    }

    private void writeValue(org.simpleframework.xml.stream.OutputNode r6) {
            r5 = this;
            org.simpleframework.xml.stream.Mode r0 = r6.getMode()
            java.lang.String r1 = r6.getValue()
            if (r1 == 0) goto L2b
            org.simpleframework.xml.stream.OutputStack r2 = r5.stack
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.next()
            org.simpleframework.xml.stream.OutputNode r3 = (org.simpleframework.xml.stream.OutputNode) r3
            org.simpleframework.xml.stream.Mode r4 = org.simpleframework.xml.stream.Mode.INHERIT
            if (r0 == r4) goto L21
            goto L26
        L21:
            org.simpleframework.xml.stream.Mode r0 = r3.getMode()
            goto L10
        L26:
            org.simpleframework.xml.stream.Formatter r5 = r5.writer
            r5.writeText(r1, r0)
        L2b:
            r5 = 0
            r6.setValue(r5)
            return
    }

    public void commit(org.simpleframework.xml.stream.OutputNode r3) {
            r2 = this;
            org.simpleframework.xml.stream.OutputStack r0 = r2.stack
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L31
            org.simpleframework.xml.stream.OutputStack r0 = r2.stack
            org.simpleframework.xml.stream.OutputNode r0 = r0.top()
            boolean r1 = r2.isCommitted(r0)
            if (r1 != 0) goto L17
            r2.writeStart(r0)
        L17:
            org.simpleframework.xml.stream.OutputStack r0 = r2.stack
            org.simpleframework.xml.stream.OutputNode r0 = r0.top()
            if (r0 == r3) goto L29
            org.simpleframework.xml.stream.OutputStack r0 = r2.stack
            org.simpleframework.xml.stream.OutputNode r0 = r0.pop()
            r2.writeEnd(r0)
            goto L17
        L29:
            r2.writeEnd(r3)
            org.simpleframework.xml.stream.OutputStack r2 = r2.stack
            r2.pop()
        L31:
            return
    }

    public boolean isCommitted(org.simpleframework.xml.stream.OutputNode r1) {
            r0 = this;
            java.util.Set r0 = r0.active
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ 1
            return r0
    }

    public boolean isRoot(org.simpleframework.xml.stream.OutputNode r1) {
            r0 = this;
            org.simpleframework.xml.stream.OutputStack r0 = r0.stack
            org.simpleframework.xml.stream.OutputNode r0 = r0.bottom()
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public void remove(org.simpleframework.xml.stream.OutputNode r2) {
            r1 = this;
            org.simpleframework.xml.stream.OutputStack r0 = r1.stack
            org.simpleframework.xml.stream.OutputNode r0 = r0.top()
            if (r0 != r2) goto Le
            org.simpleframework.xml.stream.OutputStack r1 = r1.stack
            r1.pop()
            return
        Le:
            org.simpleframework.xml.stream.NodeException r1 = new org.simpleframework.xml.stream.NodeException
            java.lang.String r2 = "Cannot remove node"
            r1.<init>(r2)
            throw r1
    }

    public org.simpleframework.xml.stream.OutputNode writeElement(org.simpleframework.xml.stream.OutputNode r3, java.lang.String r4) {
            r2 = this;
            org.simpleframework.xml.stream.OutputStack r0 = r2.stack
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            org.simpleframework.xml.stream.OutputNode r2 = r2.writeStart(r3, r4)
            return r2
        Ld:
            org.simpleframework.xml.stream.OutputStack r0 = r2.stack
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L44
            org.simpleframework.xml.stream.OutputStack r0 = r2.stack
            org.simpleframework.xml.stream.OutputNode r0 = r0.top()
            boolean r1 = r2.isCommitted(r0)
            if (r1 != 0) goto L24
            r2.writeStart(r0)
        L24:
            org.simpleframework.xml.stream.OutputStack r0 = r2.stack
            org.simpleframework.xml.stream.OutputNode r0 = r0.top()
            org.simpleframework.xml.stream.OutputStack r1 = r2.stack
            if (r0 == r3) goto L36
            org.simpleframework.xml.stream.OutputNode r0 = r1.pop()
            r2.writeEnd(r0)
            goto L24
        L36:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L3f
            r2.writeValue(r3)
        L3f:
            org.simpleframework.xml.stream.OutputNode r2 = r2.writeStart(r3, r4)
            return r2
        L44:
            r2 = 0
            return r2
    }

    public org.simpleframework.xml.stream.OutputNode writeRoot() {
            r2 = this;
            org.simpleframework.xml.stream.OutputDocument r0 = new org.simpleframework.xml.stream.OutputDocument
            org.simpleframework.xml.stream.OutputStack r1 = r2.stack
            r0.<init>(r2, r1)
            org.simpleframework.xml.stream.OutputStack r1 = r2.stack
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L14
            org.simpleframework.xml.stream.Formatter r2 = r2.writer
            r2.writeProlog()
        L14:
            return r0
    }
}
