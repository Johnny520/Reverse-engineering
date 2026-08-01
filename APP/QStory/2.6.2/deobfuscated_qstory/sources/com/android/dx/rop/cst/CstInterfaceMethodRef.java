package com.android.dx.rop.cst;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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

    @Override // com.android.dx.rop.cst.Constant
    public String typeName() {
        return "ifaceMethod";
    }
}
