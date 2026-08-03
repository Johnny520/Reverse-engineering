package com.android.dx.cf.attrib;

/* JADX INFO: loaded from: classes.dex */
public final class AttSourceFile extends com.android.dx.cf.attrib.BaseAttribute {
    public static final java.lang.String ATTRIBUTE_NAME = "SourceFile";
    private final com.android.dx.rop.cst.CstString sourceFile;

    public AttSourceFile(com.android.dx.rop.cst.CstString r2) {
            r1 = this;
            java.lang.String r0 = "SourceFile"
            r1.<init>(r0)
            if (r2 == 0) goto La
            r1.sourceFile = r2
            return
        La:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "sourceFile == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
            r1 = this;
            r0 = 8
            return r0
    }

    public com.android.dx.rop.cst.CstString getSourceFile() {
            r1 = this;
            com.android.dx.rop.cst.CstString r0 = r1.sourceFile
            return r0
    }
}
