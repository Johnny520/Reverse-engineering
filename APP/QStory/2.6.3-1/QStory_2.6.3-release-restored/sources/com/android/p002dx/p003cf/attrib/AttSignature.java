package com.android.p002dx.p003cf.attrib;

import bsh.C3466;
import com.android.p002dx.rop.cst.CstString;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class AttSignature extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "Signature";
    private final CstString signature;

    public AttSignature(CstString cstString) {
        super(ATTRIBUTE_NAME);
        if (cstString != null) {
            this.signature = cstString;
        } else {
            C3466.m5903("signature == null");
            throw null;
        }
    }

    @Override // com.android.p002dx.p003cf.iface.Attribute
    public int byteLength() {
        return 8;
    }

    public CstString getSignature() {
        return this.signature;
    }
}
