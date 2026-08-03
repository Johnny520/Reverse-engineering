package com.android.p001dx.p002cf.attrib;

import com.android.p001dx.rop.cst.CstString;

/* JADX INFO: loaded from: classes.dex */
public final class AttSignature extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "Signature";
    private final CstString signature;

    public AttSignature(CstString cstString) {
        super(ATTRIBUTE_NAME);
        if (cstString == null) {
            throw new NullPointerException("signature == null");
        }
        this.signature = cstString;
    }

    @Override // com.android.p001dx.p002cf.iface.Attribute
    public int byteLength() {
        return 8;
    }

    public CstString getSignature() {
        return this.signature;
    }
}
