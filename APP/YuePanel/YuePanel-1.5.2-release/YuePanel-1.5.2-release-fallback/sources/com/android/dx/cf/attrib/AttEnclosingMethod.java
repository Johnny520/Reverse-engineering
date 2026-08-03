package com.android.dx.cf.attrib;

/* JADX INFO: loaded from: classes.dex */
public final class AttEnclosingMethod extends com.android.dx.cf.attrib.BaseAttribute {
    public static final java.lang.String ATTRIBUTE_NAME = "EnclosingMethod";
    private final com.android.dx.rop.cst.CstNat method;
    private final com.android.dx.rop.cst.CstType type;

    public AttEnclosingMethod(com.android.dx.rop.cst.CstType r2, com.android.dx.rop.cst.CstNat r3) {
            r1 = this;
            java.lang.String r0 = "EnclosingMethod"
            r1.<init>(r0)
            if (r2 == 0) goto Lc
            r1.type = r2
            r1.method = r3
            return
        Lc:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "type == null"
            r2.<init>(r3)
            throw r2
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
            r1 = this;
            r0 = 10
            return r0
    }

    public com.android.dx.rop.cst.CstType getEnclosingClass() {
            r1 = this;
            com.android.dx.rop.cst.CstType r0 = r1.type
            return r0
    }

    public com.android.dx.rop.cst.CstNat getMethod() {
            r1 = this;
            com.android.dx.rop.cst.CstNat r0 = r1.method
            return r0
    }
}
