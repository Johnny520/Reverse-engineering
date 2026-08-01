package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
abstract class EventElement extends java.util.ArrayList<org.simpleframework.xml.stream.Attribute> implements org.simpleframework.xml.stream.EventNode {
    public EventElement() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.simpleframework.xml.stream.EventNode
    public int getLine() {
            r0 = this;
            r0 = -1
            return r0
    }

    @Override // org.simpleframework.xml.stream.EventNode
    public java.lang.String getValue() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.EventNode
    public boolean isEnd() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.EventNode
    public boolean isStart() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.stream.EventNode
    public boolean isText() {
            r0 = this;
            r0 = 0
            return r0
    }
}
