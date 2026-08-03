package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstBoolean extends com.android.dx.rop.cst.CstLiteral32 {
    public static final com.android.dx.rop.cst.CstBoolean VALUE_FALSE = null;
    public static final com.android.dx.rop.cst.CstBoolean VALUE_TRUE = null;

    static {
            com.android.dx.rop.cst.CstBoolean r0 = new com.android.dx.rop.cst.CstBoolean
            r1 = 0
            r0.<init>(r1)
            com.android.dx.rop.cst.CstBoolean.VALUE_FALSE = r0
            com.android.dx.rop.cst.CstBoolean r0 = new com.android.dx.rop.cst.CstBoolean
            r1 = 1
            r0.<init>(r1)
            com.android.dx.rop.cst.CstBoolean.VALUE_TRUE = r0
            return
    }

    private CstBoolean(boolean r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.android.dx.rop.cst.CstBoolean make(int r3) {
            if (r3 != 0) goto L5
            com.android.dx.rop.cst.CstBoolean r3 = com.android.dx.rop.cst.CstBoolean.VALUE_FALSE
            return r3
        L5:
            r0 = 1
            if (r3 != r0) goto Lb
            com.android.dx.rop.cst.CstBoolean r3 = com.android.dx.rop.cst.CstBoolean.VALUE_TRUE
            return r3
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bogus value: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static com.android.dx.rop.cst.CstBoolean make(boolean r0) {
            if (r0 == 0) goto L5
            com.android.dx.rop.cst.CstBoolean r0 = com.android.dx.rop.cst.CstBoolean.VALUE_TRUE
            goto L7
        L5:
            com.android.dx.rop.cst.CstBoolean r0 = com.android.dx.rop.cst.CstBoolean.VALUE_FALSE
        L7:
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.Type getType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.BOOLEAN
            return r0
    }

    public boolean getValue() {
            r1 = this;
            int r0 = r1.getIntBits()
            if (r0 != 0) goto L8
            r0 = 0
            goto L9
        L8:
            r0 = 1
        L9:
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r1 = this;
            boolean r0 = r1.getValue()
            if (r0 == 0) goto L9
            java.lang.String r0 = "true"
            goto Lb
        L9:
            java.lang.String r0 = "false"
        Lb:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.getValue()
            if (r0 == 0) goto L9
            java.lang.String r0 = "boolean{true}"
            goto Lb
        L9:
            java.lang.String r0 = "boolean{false}"
        Lb:
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "boolean"
            return r0
    }
}
