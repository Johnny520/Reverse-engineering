package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class InputPosition implements org.simpleframework.xml.stream.Position {
    private org.simpleframework.xml.stream.EventNode source;

    public InputPosition(org.simpleframework.xml.stream.EventNode r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // org.simpleframework.xml.stream.Position
    public int getLine() {
            r0 = this;
            org.simpleframework.xml.stream.EventNode r0 = r0.source
            int r0 = r0.getLine()
            return r0
    }

    @Override // org.simpleframework.xml.stream.Position
    public java.lang.String toString() {
            r1 = this;
            int r1 = r1.getLine()
            java.lang.String r0 = "line "
            java.lang.String r1 = defpackage.AbstractC1124.m2145(r1, r0)
            return r1
    }
}
