package com.android.p001dx.rop.cst;

import com.android.p001dx.rop.type.Type;

/* JADX INFO: loaded from: classes.dex */
public final class CstEnumRef extends CstMemberRef {
    private CstFieldRef fieldRef;

    public CstEnumRef(CstNat cstNat) {
        super(new CstType(cstNat.getFieldType()), cstNat);
        this.fieldRef = null;
    }

    public CstFieldRef getFieldRef() {
        if (this.fieldRef == null) {
            this.fieldRef = new CstFieldRef(getDefiningClass(), getNat());
        }
        return this.fieldRef;
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public Type getType() {
        return getDefiningClass().getClassType();
    }

    @Override // com.android.p001dx.rop.cst.Constant
    public String typeName() {
        return "enum";
    }
}
