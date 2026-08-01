package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class EmptyExpression implements org.simpleframework.xml.core.Expression {
    private final java.util.List<java.lang.String> list;
    private final org.simpleframework.xml.stream.Style style;

    public EmptyExpression(org.simpleframework.xml.stream.Format r2) {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.list = r0
            org.simpleframework.xml.stream.Style r2 = r2.getStyle()
            r1.style = r2
            return
    }

    @Override // org.simpleframework.xml.core.Expression
    public java.lang.String getAttribute(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.stream.Style r0 = r0.style
            java.lang.String r0 = r0.getAttribute(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public java.lang.String getElement(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.stream.Style r0 = r0.style
            java.lang.String r0 = r0.getElement(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public java.lang.String getFirst() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public int getIndex() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public java.lang.String getLast() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public java.lang.String getPath() {
            r0 = this;
            java.lang.String r0 = ""
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public org.simpleframework.xml.core.Expression getPath(int r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public org.simpleframework.xml.core.Expression getPath(int r1, int r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public java.lang.String getPrefix() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public boolean isAttribute() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public boolean isEmpty() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public boolean isPath() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.String> iterator() {
            r0 = this;
            java.util.List<java.lang.String> r0 = r0.list
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
