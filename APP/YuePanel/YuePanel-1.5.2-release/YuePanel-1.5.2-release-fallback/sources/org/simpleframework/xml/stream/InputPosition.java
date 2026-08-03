package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
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
            r1 = this;
            org.simpleframework.xml.stream.EventNode r0 = r1.source
            int r0 = r0.getLine()
            return r0
    }

    @Override // org.simpleframework.xml.stream.Position
    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.getLine()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "line %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
