package org.simpleframework.xml.strategy;

/* JADX INFO: loaded from: classes2.dex */
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
            r1 = this;
            java.lang.String r0 = r1.mark
            return r0
    }

    public java.lang.String getLabel() {
            r1 = this;
            java.lang.String r0 = r1.label
            return r0
    }

    public java.lang.String getLength() {
            r1 = this;
            java.lang.String r0 = r1.length
            return r0
    }

    public java.lang.String getReference() {
            r1 = this;
            java.lang.String r0 = r1.refer
            return r0
    }
}
