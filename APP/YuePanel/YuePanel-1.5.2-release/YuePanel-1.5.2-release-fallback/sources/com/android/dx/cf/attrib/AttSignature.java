package com.android.dx.cf.attrib;

/* JADX INFO: loaded from: classes.dex */
public final class AttSignature extends com.android.dx.cf.attrib.BaseAttribute {
    public static final java.lang.String ATTRIBUTE_NAME = "Signature";
    private final com.android.dx.rop.cst.CstString signature;

    public AttSignature(com.android.dx.rop.cst.CstString r2) {
            r1 = this;
            java.lang.String r0 = "Signature"
            r1.<init>(r0)
            if (r2 == 0) goto La
            r1.signature = r2
            return
        La:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "signature == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
            r1 = this;
            r0 = 8
            return r0
    }

    public com.android.dx.rop.cst.CstString getSignature() {
            r1 = this;
            com.android.dx.rop.cst.CstString r0 = r1.signature
            return r0
    }
}
