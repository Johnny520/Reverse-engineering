package com.android.p001dx.p002cf.attrib;

import com.android.p001dx.rop.cst.CstNat;
import com.android.p001dx.rop.cst.CstType;

/* JADX INFO: loaded from: classes.dex */
public final class AttEnclosingMethod extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "EnclosingMethod";
    private final CstNat method;
    private final CstType type;

    public AttEnclosingMethod(CstType cstType, CstNat cstNat) {
        super(ATTRIBUTE_NAME);
        if (cstType == null) {
            throw new NullPointerException("type == null");
        }
        this.type = cstType;
        this.method = cstNat;
    }

    @Override // com.android.p001dx.p002cf.iface.Attribute
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
