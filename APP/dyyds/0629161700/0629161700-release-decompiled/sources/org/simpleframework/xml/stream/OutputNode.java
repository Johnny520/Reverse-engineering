package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public interface OutputNode extends org.simpleframework.xml.stream.Node {
    void commit();

    org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.OutputNode> getAttributes();

    org.simpleframework.xml.stream.OutputNode getChild(java.lang.String r1);

    java.lang.String getComment();

    org.simpleframework.xml.stream.Mode getMode();

    org.simpleframework.xml.stream.NamespaceMap getNamespaces();

    @Override // org.simpleframework.xml.stream.Node
    org.simpleframework.xml.stream.OutputNode getParent();

    java.lang.String getPrefix();

    java.lang.String getPrefix(boolean r1);

    java.lang.String getReference();

    boolean isCommitted();

    boolean isRoot();

    void remove();

    org.simpleframework.xml.stream.OutputNode setAttribute(java.lang.String r1, java.lang.String r2);

    void setComment(java.lang.String r1);

    void setData(boolean r1);

    void setMode(org.simpleframework.xml.stream.Mode r1);

    void setName(java.lang.String r1);

    void setReference(java.lang.String r1);

    void setValue(java.lang.String r1);
}
