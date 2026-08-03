package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
abstract class EventElement extends java.util.ArrayList<org.simpleframework.xml.stream.Attribute> implements org.simpleframework.xml.stream.EventNode {
    public EventElement() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.simpleframework.xml.stream.EventNode
    public int getLine() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // org.simpleframework.xml.stream.EventNode
    public java.lang.String getValue() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.EventNode
    public boolean isEnd() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.stream.EventNode
    public boolean isStart() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.stream.EventNode
    public boolean isText() {
            r1 = this;
            r0 = 0
            return r0
    }
}
