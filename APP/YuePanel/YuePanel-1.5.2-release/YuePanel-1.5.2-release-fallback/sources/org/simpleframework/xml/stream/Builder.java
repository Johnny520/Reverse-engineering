package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class Builder implements org.simpleframework.xml.stream.Style {
    private final org.simpleframework.xml.util.Cache<java.lang.String> attributes;
    private final org.simpleframework.xml.util.Cache<java.lang.String> elements;
    private final org.simpleframework.xml.stream.Style style;

    public Builder(org.simpleframework.xml.stream.Style r2) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.attributes = r0
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.elements = r0
            r1.style = r2
            return
    }

    @Override // org.simpleframework.xml.stream.Style
    public java.lang.String getAttribute(java.lang.String r3) {
            r2 = this;
            org.simpleframework.xml.util.Cache<java.lang.String> r0 = r2.attributes
            java.lang.Object r0 = r0.fetch(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            org.simpleframework.xml.stream.Style r0 = r2.style
            java.lang.String r0 = r0.getAttribute(r3)
            if (r0 == 0) goto L18
            org.simpleframework.xml.util.Cache<java.lang.String> r1 = r2.attributes
            r1.cache(r3, r0)
        L18:
            return r0
    }

    @Override // org.simpleframework.xml.stream.Style
    public java.lang.String getElement(java.lang.String r3) {
            r2 = this;
            org.simpleframework.xml.util.Cache<java.lang.String> r0 = r2.elements
            java.lang.Object r0 = r0.fetch(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            org.simpleframework.xml.stream.Style r0 = r2.style
            java.lang.String r0 = r0.getElement(r3)
            if (r0 == 0) goto L18
            org.simpleframework.xml.util.Cache<java.lang.String> r1 = r2.elements
            r1.cache(r3, r0)
        L18:
            return r0
    }

    public void setAttribute(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            org.simpleframework.xml.util.Cache<java.lang.String> r0 = r1.attributes
            r0.cache(r2, r3)
            return
    }

    public void setElement(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            org.simpleframework.xml.util.Cache<java.lang.String> r0 = r1.elements
            r0.cache(r2, r3)
            return
    }
}
