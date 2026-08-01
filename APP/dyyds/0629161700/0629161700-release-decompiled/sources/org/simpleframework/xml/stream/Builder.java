package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
    public java.lang.String getAttribute(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.util.Cache<java.lang.String> r0 = r1.attributes
            java.lang.Object r0 = r0.fetch(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            org.simpleframework.xml.stream.Style r0 = r1.style
            java.lang.String r0 = r0.getAttribute(r2)
            if (r0 == 0) goto L18
            org.simpleframework.xml.util.Cache<java.lang.String> r1 = r1.attributes
            r1.cache(r2, r0)
        L18:
            return r0
    }

    @Override // org.simpleframework.xml.stream.Style
    public java.lang.String getElement(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.util.Cache<java.lang.String> r0 = r1.elements
            java.lang.Object r0 = r0.fetch(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            org.simpleframework.xml.stream.Style r0 = r1.style
            java.lang.String r0 = r0.getElement(r2)
            if (r0 == 0) goto L18
            org.simpleframework.xml.util.Cache<java.lang.String> r1 = r1.elements
            r1.cache(r2, r0)
        L18:
            return r0
    }

    public void setAttribute(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            org.simpleframework.xml.util.Cache<java.lang.String> r0 = r0.attributes
            r0.cache(r1, r2)
            return
    }

    public void setElement(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            org.simpleframework.xml.util.Cache<java.lang.String> r0 = r0.elements
            r0.cache(r1, r2)
            return
    }
}
