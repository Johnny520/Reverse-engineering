package com.android.dx.cf.iface;

/* JADX INFO: loaded from: classes.dex */
public final class StdMethod extends com.android.dx.cf.iface.StdMember implements com.android.dx.cf.iface.Method {
    private final com.android.dx.rop.type.Prototype effectiveDescriptor;

    public StdMethod(com.android.dx.rop.cst.CstType r1, int r2, com.android.dx.rop.cst.CstNat r3, com.android.dx.cf.iface.AttributeList r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            com.android.dx.rop.cst.CstString r4 = r0.getDescriptor()
            java.lang.String r4 = r4.getString()
            com.android.dx.rop.type.Type r1 = r1.getClassType()
            boolean r2 = com.android.dx.rop.code.AccessFlags.isStatic(r2)
            boolean r3 = r3.isInstanceInit()
            com.android.dx.rop.type.Prototype r1 = com.android.dx.rop.type.Prototype.intern(r4, r1, r2, r3)
            r0.effectiveDescriptor = r1
            return
    }

    @Override // com.android.dx.cf.iface.Method
    public com.android.dx.rop.type.Prototype getEffectiveDescriptor() {
            r1 = this;
            com.android.dx.rop.type.Prototype r0 = r1.effectiveDescriptor
            return r0
    }
}
