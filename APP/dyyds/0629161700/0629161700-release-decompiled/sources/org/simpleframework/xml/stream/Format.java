package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class Format {
    private final int indent;
    private final java.lang.String prolog;
    private final org.simpleframework.xml.stream.Style style;
    private final org.simpleframework.xml.stream.Verbosity verbosity;

    public Format() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    public Format(int r3) {
            r2 = this;
            org.simpleframework.xml.stream.IdentityStyle r0 = new org.simpleframework.xml.stream.IdentityStyle
            r0.<init>()
            r1 = 0
            r2.<init>(r3, r1, r0)
            return
    }

    public Format(int r2, java.lang.String r3) {
            r1 = this;
            org.simpleframework.xml.stream.IdentityStyle r0 = new org.simpleframework.xml.stream.IdentityStyle
            r0.<init>()
            r1.<init>(r2, r3, r0)
            return
    }

    public Format(int r2, java.lang.String r3, org.simpleframework.xml.stream.Style r4) {
            r1 = this;
            org.simpleframework.xml.stream.Verbosity r0 = org.simpleframework.xml.stream.Verbosity.HIGH
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public Format(int r1, java.lang.String r2, org.simpleframework.xml.stream.Style r3, org.simpleframework.xml.stream.Verbosity r4) {
            r0 = this;
            r0.<init>()
            r0.verbosity = r4
            r0.prolog = r2
            r0.indent = r1
            r0.style = r3
            return
    }

    public Format(int r2, org.simpleframework.xml.stream.Style r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public Format(int r2, org.simpleframework.xml.stream.Style r3, org.simpleframework.xml.stream.Verbosity r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3, r4)
            return
    }

    public Format(int r2, org.simpleframework.xml.stream.Verbosity r3) {
            r1 = this;
            org.simpleframework.xml.stream.IdentityStyle r0 = new org.simpleframework.xml.stream.IdentityStyle
            r0.<init>()
            r1.<init>(r2, r0, r3)
            return
    }

    public Format(java.lang.String r2) {
            r1 = this;
            r0 = 3
            r1.<init>(r0, r2)
            return
    }

    public Format(org.simpleframework.xml.stream.Style r2) {
            r1 = this;
            r0 = 3
            r1.<init>(r0, r2)
            return
    }

    public Format(org.simpleframework.xml.stream.Style r2, org.simpleframework.xml.stream.Verbosity r3) {
            r1 = this;
            r0 = 3
            r1.<init>(r0, r2, r3)
            return
    }

    public Format(org.simpleframework.xml.stream.Verbosity r2) {
            r1 = this;
            r0 = 3
            r1.<init>(r0, r2)
            return
    }

    public int getIndent() {
            r0 = this;
            int r0 = r0.indent
            return r0
    }

    public java.lang.String getProlog() {
            r0 = this;
            java.lang.String r0 = r0.prolog
            return r0
    }

    public org.simpleframework.xml.stream.Style getStyle() {
            r0 = this;
            org.simpleframework.xml.stream.Style r0 = r0.style
            return r0
    }

    public org.simpleframework.xml.stream.Verbosity getVerbosity() {
            r0 = this;
            org.simpleframework.xml.stream.Verbosity r0 = r0.verbosity
            return r0
    }
}
