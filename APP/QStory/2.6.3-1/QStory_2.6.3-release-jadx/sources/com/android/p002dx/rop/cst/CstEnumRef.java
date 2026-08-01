package com.android.p002dx.rop.cst;

import com.android.p002dx.rop.type.Type;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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

    @Override // com.android.p002dx.rop.type.TypeBearer
    public Type getType() {
        return getDefiningClass().getClassType();
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public String typeName() {
        return "enum";
    }
}
