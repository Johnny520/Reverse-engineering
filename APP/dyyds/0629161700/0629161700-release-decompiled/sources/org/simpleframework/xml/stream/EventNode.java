package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
