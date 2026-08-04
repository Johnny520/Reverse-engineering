package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public interface OutputNode extends Node {
    void commit();

    NodeMap<OutputNode> getAttributes();

    OutputNode getChild(String str);

    String getComment();

    Mode getMode();

    NamespaceMap getNamespaces();

    @Override // org.simpleframework.xml.stream.Node
    OutputNode getParent();

    String getPrefix();

    String getPrefix(boolean z);

    String getReference();

    boolean isCommitted();

    boolean isRoot();

    void remove();

    OutputNode setAttribute(String str, String str2);

    void setComment(String str);

    void setData(boolean z);

    void setMode(Mode mode);

    void setName(String str);

    void setReference(String str);

    void setValue(String str);
}
