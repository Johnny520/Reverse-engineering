package com.android.dx.rop.cst;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CstMethodRef extends CstBaseMethodRef {
    public CstMethodRef(CstType cstType, CstNat cstNat) {
        super(cstType, cstNat);
    }

    @Override // com.android.dx.rop.cst.Constant
    public String typeName() {
        return "method";
    }
}
