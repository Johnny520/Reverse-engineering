package com.android.p001dx.p002cf.attrib;

import com.android.p001dx.rop.cst.CstString;

/* JADX INFO: loaded from: classes.dex */
public final class AttSourceFile extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "SourceFile";
    private final CstString sourceFile;

    public AttSourceFile(CstString cstString) {
        super(ATTRIBUTE_NAME);
        if (cstString == null) {
            throw new NullPointerException("sourceFile == null");
        }
        this.sourceFile = cstString;
    }

    @Override // com.android.p001dx.p002cf.iface.Attribute
    public int byteLength() {
        return 8;
    }

    public CstString getSourceFile() {
        return this.sourceFile;
    }
}
