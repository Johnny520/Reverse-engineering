package com.android.dx.cf.iface;

/* JADX INFO: loaded from: classes.dex */
public final class StdField extends com.android.dx.cf.iface.StdMember implements com.android.dx.cf.iface.Field {
    public StdField(com.android.dx.rop.cst.CstType r1, int r2, com.android.dx.rop.cst.CstNat r3, com.android.dx.cf.iface.AttributeList r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // com.android.dx.cf.iface.Field
    public com.android.dx.rop.cst.TypedConstant getConstantValue() {
            r2 = this;
            com.android.dx.cf.iface.AttributeList r0 = r2.getAttributes()
            java.lang.String r1 = "ConstantValue"
            com.android.dx.cf.iface.Attribute r0 = r0.findFirst(r1)
            com.android.dx.cf.attrib.AttConstantValue r0 = (com.android.dx.cf.attrib.AttConstantValue) r0
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            com.android.dx.rop.cst.TypedConstant r0 = r0.getConstantValue()
            return r0
    }
}
