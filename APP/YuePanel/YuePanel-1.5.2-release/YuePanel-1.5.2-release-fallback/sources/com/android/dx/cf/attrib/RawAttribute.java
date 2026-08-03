package com.android.dx.cf.attrib;

/* JADX INFO: loaded from: classes.dex */
public final class RawAttribute extends com.android.dx.cf.attrib.BaseAttribute {
    private final com.android.dx.util.ByteArray data;
    private final com.android.dx.rop.cst.ConstantPool pool;

    public RawAttribute(java.lang.String r1, com.android.dx.util.ByteArray r2, int r3, int r4, com.android.dx.rop.cst.ConstantPool r5) {
            r0 = this;
            int r4 = r4 + r3
            com.android.dx.util.ByteArray r2 = r2.slice(r3, r4)
            r0.<init>(r1, r2, r5)
            return
    }

    public RawAttribute(java.lang.String r1, com.android.dx.util.ByteArray r2, com.android.dx.rop.cst.ConstantPool r3) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto La
            r0.data = r2
            r0.pool = r3
            return
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "data == null"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
            r1 = this;
            com.android.dx.util.ByteArray r0 = r1.data
            int r0 = r0.size()
            int r0 = r0 + 6
            return r0
    }

    public com.android.dx.util.ByteArray getData() {
            r1 = this;
            com.android.dx.util.ByteArray r0 = r1.data
            return r0
    }

    public com.android.dx.rop.cst.ConstantPool getPool() {
            r1 = this;
            com.android.dx.rop.cst.ConstantPool r0 = r1.pool
            return r0
    }
}
