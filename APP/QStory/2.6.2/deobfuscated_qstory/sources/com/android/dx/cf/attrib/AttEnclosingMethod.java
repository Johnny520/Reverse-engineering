package com.android.dx.cf.attrib;

import bsh.C2632;
import com.android.dx.rop.cst.CstNat;
import com.android.dx.rop.cst.CstType;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class AttEnclosingMethod extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "EnclosingMethod";
    private final CstNat method;
    private final CstType type;

    public AttEnclosingMethod(CstType cstType, CstNat cstNat) {
        super(ATTRIBUTE_NAME);
        if (cstType == null) {
            C2632.m5298("type == null");
            throw null;
        }
        this.type = cstType;
        this.method = cstNat;
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
        return 10;
    }

    public CstType getEnclosingClass() {
        return this.type;
    }

    public CstNat getMethod() {
        return this.method;
    }
}
