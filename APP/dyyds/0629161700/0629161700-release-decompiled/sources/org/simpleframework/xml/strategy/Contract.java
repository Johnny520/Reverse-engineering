package org.simpleframework.xml.strategy;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class Contract {
    private java.lang.String label;
    private java.lang.String length;
    private java.lang.String mark;
    private java.lang.String refer;

    public Contract(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.length = r4
            r0.label = r3
            r0.refer = r2
            r0.mark = r1
            return
    }

    public java.lang.String getIdentity() {
            r0 = this;
            java.lang.String r0 = r0.mark
            return r0
    }

    public java.lang.String getLabel() {
            r0 = this;
            java.lang.String r0 = r0.label
            return r0
    }

    public java.lang.String getLength() {
            r0 = this;
            java.lang.String r0 = r0.length
            return r0
    }

    public java.lang.String getReference() {
            r0 = this;
            java.lang.String r0 = r0.refer
            return r0
    }
}
