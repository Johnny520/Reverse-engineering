package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
public class CamelCaseStyle implements org.simpleframework.xml.stream.Style {
    private final org.simpleframework.xml.stream.Builder builder;
    private final org.simpleframework.xml.stream.Style style;

    public CamelCaseStyle() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public CamelCaseStyle(boolean r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CamelCaseStyle(boolean r2, boolean r3) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.stream.CamelCaseBuilder r0 = new org.simpleframework.xml.stream.CamelCaseBuilder
            r0.<init>(r2, r3)
            r1.style = r0
            org.simpleframework.xml.stream.Builder r2 = new org.simpleframework.xml.stream.Builder
            r2.<init>(r0)
            r1.builder = r2
            return
    }

    @Override // org.simpleframework.xml.stream.Style
    public java.lang.String getAttribute(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.stream.Builder r0 = r1.builder
            java.lang.String r2 = r0.getAttribute(r2)
            return r2
    }

    @Override // org.simpleframework.xml.stream.Style
    public java.lang.String getElement(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.stream.Builder r0 = r1.builder
            java.lang.String r2 = r0.getElement(r2)
            return r2
    }

    public void setAttribute(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            org.simpleframework.xml.stream.Builder r0 = r1.builder
            r0.setAttribute(r2, r3)
            return
    }

    public void setElement(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            org.simpleframework.xml.stream.Builder r0 = r1.builder
            r0.setElement(r2, r3)
            return
    }
}
