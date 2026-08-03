package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstInterfaceMethodRef extends com.android.dx.rop.cst.CstBaseMethodRef {
    private com.android.dx.rop.cst.CstMethodRef methodRef;

    public CstInterfaceMethodRef(com.android.dx.rop.cst.CstType r1, com.android.dx.rop.cst.CstNat r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.methodRef = r1
            return
    }

    public com.android.dx.rop.cst.CstMethodRef toMethodRef() {
            r3 = this;
            com.android.dx.rop.cst.CstMethodRef r0 = r3.methodRef
            if (r0 != 0) goto L13
            com.android.dx.rop.cst.CstMethodRef r0 = new com.android.dx.rop.cst.CstMethodRef
            com.android.dx.rop.cst.CstType r1 = r3.getDefiningClass()
            com.android.dx.rop.cst.CstNat r2 = r3.getNat()
            r0.<init>(r1, r2)
            r3.methodRef = r0
        L13:
            com.android.dx.rop.cst.CstMethodRef r0 = r3.methodRef
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "ifaceMethod"
            return r0
    }
}
