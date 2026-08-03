package com.android.dx.cf.attrib;

/* JADX INFO: loaded from: classes.dex */
public final class AttSourceDebugExtension extends com.android.dx.cf.attrib.BaseAttribute {
    public static final java.lang.String ATTRIBUTE_NAME = "SourceDebugExtension";
    private final com.android.dx.rop.cst.CstString smapString;

    public AttSourceDebugExtension(com.android.dx.rop.cst.CstString r2) {
            r1 = this;
            java.lang.String r0 = "SourceDebugExtension"
            r1.<init>(r0)
            if (r2 == 0) goto La
            r1.smapString = r2
            return
        La:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "smapString == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
            r1 = this;
            com.android.dx.rop.cst.CstString r0 = r1.smapString
            int r0 = r0.getUtf8Size()
            int r0 = r0 + 6
            return r0
    }

    public com.android.dx.rop.cst.CstString getSmapString() {
            r1 = this;
            com.android.dx.rop.cst.CstString r0 = r1.smapString
            return r0
    }
}
