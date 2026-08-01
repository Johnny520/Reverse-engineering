package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class HyphenStyle implements org.simpleframework.xml.stream.Style {
    private final org.simpleframework.xml.stream.Builder builder;
    private final org.simpleframework.xml.stream.Style style;

    public HyphenStyle() {
            r2 = this;
            r2.<init>()
            org.simpleframework.xml.stream.HyphenBuilder r0 = new org.simpleframework.xml.stream.HyphenBuilder
            r0.<init>()
            r2.style = r0
            org.simpleframework.xml.stream.Builder r1 = new org.simpleframework.xml.stream.Builder
            r1.<init>(r0)
            r2.builder = r1
            return
    }

    @Override // org.simpleframework.xml.stream.Style
    public java.lang.String getAttribute(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.stream.Builder r0 = r0.builder
            java.lang.String r0 = r0.getAttribute(r1)
            return r0
    }

    @Override // org.simpleframework.xml.stream.Style
    public java.lang.String getElement(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.stream.Builder r0 = r0.builder
            java.lang.String r0 = r0.getElement(r1)
            return r0
    }

    public void setAttribute(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            org.simpleframework.xml.stream.Builder r0 = r0.builder
            r0.setAttribute(r1, r2)
            return
    }

    public void setElement(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            org.simpleframework.xml.stream.Builder r0 = r0.builder
            r0.setElement(r1, r2)
            return
    }
}
