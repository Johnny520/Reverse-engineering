package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstFieldRef extends com.android.dx.rop.cst.CstMemberRef {
    public CstFieldRef(com.android.dx.rop.cst.CstType r1, com.android.dx.rop.cst.CstNat r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.android.dx.rop.cst.CstFieldRef forPrimitiveType(com.android.dx.rop.type.Type r2) {
            com.android.dx.rop.cst.CstFieldRef r0 = new com.android.dx.rop.cst.CstFieldRef
            com.android.dx.rop.cst.CstType r2 = com.android.dx.rop.cst.CstType.forBoxedPrimitiveType(r2)
            com.android.dx.rop.cst.CstNat r1 = com.android.dx.rop.cst.CstNat.PRIMITIVE_TYPE_NAT
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.android.dx.rop.cst.CstMemberRef, com.android.dx.rop.cst.Constant
    public int compareTo0(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            int r0 = super.compareTo0(r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            com.android.dx.rop.cst.CstFieldRef r2 = (com.android.dx.rop.cst.CstFieldRef) r2
            com.android.dx.rop.cst.CstNat r0 = r1.getNat()
            com.android.dx.rop.cst.CstString r0 = r0.getDescriptor()
            com.android.dx.rop.cst.CstNat r2 = r2.getNat()
            com.android.dx.rop.cst.CstString r2 = r2.getDescriptor()
            int r2 = r0.compareTo2(r2)
            return r2
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.Type getType() {
            r1 = this;
            com.android.dx.rop.cst.CstNat r0 = r1.getNat()
            com.android.dx.rop.type.Type r0 = r0.getFieldType()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "field"
            return r0
    }
}
