package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
interface EventNode extends java.lang.Iterable<org.simpleframework.xml.stream.Attribute> {
    int getLine();

    java.lang.String getName();

    java.lang.String getPrefix();

    java.lang.String getReference();

    java.lang.Object getSource();

    java.lang.String getValue();

    boolean isEnd();

    boolean isStart();

    boolean isText();
}
