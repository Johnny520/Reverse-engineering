package com.android.p002dx.rop.cst;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CstInterfaceMethodRef extends CstBaseMethodRef {
    private CstMethodRef methodRef;

    public CstInterfaceMethodRef(CstType cstType, CstNat cstNat) {
        super(cstType, cstNat);
        this.methodRef = null;
    }

    public CstMethodRef toMethodRef() {
        if (this.methodRef == null) {
            this.methodRef = new CstMethodRef(getDefiningClass(), getNat());
        }
        return this.methodRef;
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public String typeName() {
        return "ifaceMethod";
    }
}
