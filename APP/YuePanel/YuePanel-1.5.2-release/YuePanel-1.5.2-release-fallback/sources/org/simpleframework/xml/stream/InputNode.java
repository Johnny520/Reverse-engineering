package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
public interface InputNode extends org.simpleframework.xml.stream.Node {
    org.simpleframework.xml.stream.InputNode getAttribute(java.lang.String r1);

    org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.InputNode> getAttributes();

    org.simpleframework.xml.stream.InputNode getNext() throws java.lang.Exception;

    org.simpleframework.xml.stream.InputNode getNext(java.lang.String r1) throws java.lang.Exception;

    @Override // org.simpleframework.xml.stream.Node
    org.simpleframework.xml.stream.InputNode getParent();

    org.simpleframework.xml.stream.Position getPosition();

    java.lang.String getPrefix();

    java.lang.String getReference();

    java.lang.Object getSource();

    boolean isElement();

    boolean isEmpty() throws java.lang.Exception;

    boolean isRoot();

    void skip() throws java.lang.Exception;
}
