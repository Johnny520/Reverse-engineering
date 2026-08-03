package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstEnumRef extends com.android.dx.rop.cst.CstMemberRef {
    private com.android.dx.rop.cst.CstFieldRef fieldRef;

    public CstEnumRef(com.android.dx.rop.cst.CstNat r3) {
            r2 = this;
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r1 = r3.getFieldType()
            r0.<init>(r1)
            r2.<init>(r0, r3)
            r3 = 0
            r2.fieldRef = r3
            return
    }

    public com.android.dx.rop.cst.CstFieldRef getFieldRef() {
            r3 = this;
            com.android.dx.rop.cst.CstFieldRef r0 = r3.fieldRef
            if (r0 != 0) goto L13
            com.android.dx.rop.cst.CstFieldRef r0 = new com.android.dx.rop.cst.CstFieldRef
            com.android.dx.rop.cst.CstType r1 = r3.getDefiningClass()
            com.android.dx.rop.cst.CstNat r2 = r3.getNat()
            r0.<init>(r1, r2)
            r3.fieldRef = r0
        L13:
            com.android.dx.rop.cst.CstFieldRef r0 = r3.fieldRef
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.Type getType() {
            r1 = this;
            com.android.dx.rop.cst.CstType r0 = r1.getDefiningClass()
            com.android.dx.rop.type.Type r0 = r0.getClassType()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "enum"
            return r0
    }
}
