package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class OutputAttribute implements OutputNode {
    private String name;
    private String reference;
    private NamespaceMap scope;
    private OutputNode source;
    private String value;

    public OutputAttribute(OutputNode outputNode, String str, String str2) {
        this.scope = outputNode.getNamespaces();
        this.source = outputNode;
        this.value = str2;
        this.name = str;
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void commit() {
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public NodeMap<OutputNode> getAttributes() {
        return new OutputNodeMap(this);
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public OutputNode getChild(String str) {
        return null;
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public String getComment() {
        return null;
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public Mode getMode() {
        return Mode.INHERIT;
    }

    @Override // org.simpleframework.xml.stream.Node
    public String getName() {
        return this.name;
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public NamespaceMap getNamespaces() {
        return this.scope;
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public String getPrefix() {
        return this.scope.getPrefix(this.reference);
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public String getReference() {
        return this.reference;
    }

    @Override // org.simpleframework.xml.stream.Node
    public String getValue() {
        return this.value;
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public boolean isCommitted() {
        return true;
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public boolean isRoot() {
        return false;
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void remove() {
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public OutputNode setAttribute(String str, String str2) {
        return null;
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void setComment(String str) {
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void setData(boolean z) {
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void setMode(Mode mode) {
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void setName(String str) {
        this.name = str;
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void setReference(String str) {
        this.reference = str;
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "attribute " + this.name + "='" + this.value + "'";
    }

    @Override // org.simpleframework.xml.stream.Node
    public OutputNode getParent() {
        return this.source;
    }

    @Override // org.simpleframework.xml.stream.OutputNode
    public String getPrefix(boolean z) {
        return this.scope.getPrefix(this.reference);
    }
}
