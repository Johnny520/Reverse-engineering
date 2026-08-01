package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public interface InputNode extends org.simpleframework.xml.stream.Node {
    org.simpleframework.xml.stream.InputNode getAttribute(java.lang.String r1);

    org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.InputNode> getAttributes();

    org.simpleframework.xml.stream.InputNode getNext();

    org.simpleframework.xml.stream.InputNode getNext(java.lang.String r1);

    @Override // org.simpleframework.xml.stream.Node
    org.simpleframework.xml.stream.InputNode getParent();

    org.simpleframework.xml.stream.Position getPosition();

    java.lang.String getPrefix();

    java.lang.String getReference();

    java.lang.Object getSource();

    boolean isElement();

    boolean isEmpty();

    boolean isRoot();

    void skip();
}
