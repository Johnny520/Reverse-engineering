package com.android.dx.cf.attrib;

/* JADX INFO: loaded from: classes.dex */
public final class AttConstantValue extends com.android.dx.cf.attrib.BaseAttribute {
    public static final java.lang.String ATTRIBUTE_NAME = "ConstantValue";
    private final com.android.dx.rop.cst.TypedConstant constantValue;

    public AttConstantValue(com.android.dx.rop.cst.TypedConstant r2) {
            r1 = this;
            java.lang.String r0 = "ConstantValue"
            r1.<init>(r0)
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstString
            if (r0 != 0) goto L2b
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstInteger
            if (r0 != 0) goto L2b
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstLong
            if (r0 != 0) goto L2b
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstFloat
            if (r0 != 0) goto L2b
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstDouble
            if (r0 != 0) goto L2b
            if (r2 != 0) goto L23
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "constantValue == null"
            r2.<init>(r0)
            throw r2
        L23:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bad type for constantValue"
            r2.<init>(r0)
            throw r2
        L2b:
            r1.constantValue = r2
            return
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
            r1 = this;
            r0 = 8
            return r0
    }

    public com.android.dx.rop.cst.TypedConstant getConstantValue() {
            r1 = this;
            com.android.dx.rop.cst.TypedConstant r0 = r1.constantValue
            return r0
    }
}
