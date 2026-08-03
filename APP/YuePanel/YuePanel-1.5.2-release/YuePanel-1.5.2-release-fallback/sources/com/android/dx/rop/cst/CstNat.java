package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstNat extends com.android.dx.rop.cst.Constant {
    public static final com.android.dx.rop.cst.CstNat PRIMITIVE_TYPE_NAT = null;
    private final com.android.dx.rop.cst.CstString descriptor;
    private final com.android.dx.rop.cst.CstString name;

    static {
            com.android.dx.rop.cst.CstNat r0 = new com.android.dx.rop.cst.CstNat
            com.android.dx.rop.cst.CstString r1 = new com.android.dx.rop.cst.CstString
            java.lang.String r2 = "TYPE"
            r1.<init>(r2)
            com.android.dx.rop.cst.CstString r2 = new com.android.dx.rop.cst.CstString
            java.lang.String r3 = "Ljava/lang/Class;"
            r2.<init>(r3)
            r0.<init>(r1, r2)
            com.android.dx.rop.cst.CstNat.PRIMITIVE_TYPE_NAT = r0
            return
    }

    public CstNat(com.android.dx.rop.cst.CstString r1, com.android.dx.rop.cst.CstString r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            r0.name = r1
            r0.descriptor = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "descriptor == null"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "name == null"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.android.dx.rop.cst.Constant
    public int compareTo0(com.android.dx.rop.cst.Constant r3) {
            r2 = this;
            com.android.dx.rop.cst.CstNat r3 = (com.android.dx.rop.cst.CstNat) r3
            com.android.dx.rop.cst.CstString r0 = r2.name
            com.android.dx.rop.cst.CstString r1 = r3.name
            int r0 = r0.compareTo2(r1)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            com.android.dx.rop.cst.CstString r0 = r2.descriptor
            com.android.dx.rop.cst.CstString r3 = r3.descriptor
            int r3 = r0.compareTo2(r3)
            return r3
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.android.dx.rop.cst.CstNat
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.android.dx.rop.cst.CstNat r4 = (com.android.dx.rop.cst.CstNat) r4
            com.android.dx.rop.cst.CstString r0 = r3.name
            com.android.dx.rop.cst.CstString r2 = r4.name
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1d
            com.android.dx.rop.cst.CstString r0 = r3.descriptor
            com.android.dx.rop.cst.CstString r4 = r4.descriptor
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L1d
            r1 = 1
        L1d:
            return r1
    }

    public com.android.dx.rop.cst.CstString getDescriptor() {
            r1 = this;
            com.android.dx.rop.cst.CstString r0 = r1.descriptor
            return r0
    }

    public com.android.dx.rop.type.Type getFieldType() {
            r1 = this;
            com.android.dx.rop.cst.CstString r0 = r1.descriptor
            java.lang.String r0 = r0.getString()
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.intern(r0)
            return r0
    }

    public com.android.dx.rop.cst.CstString getName() {
            r1 = this;
            com.android.dx.rop.cst.CstString r0 = r1.name
            return r0
    }

    public int hashCode() {
            r2 = this;
            com.android.dx.rop.cst.CstString r0 = r2.name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            com.android.dx.rop.cst.CstString r1 = r2.descriptor
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean isClassInit() {
            r2 = this;
            com.android.dx.rop.cst.CstString r0 = r2.name
            java.lang.String r0 = r0.getString()
            java.lang.String r1 = "<clinit>"
            boolean r0 = r0.equals(r1)
            return r0
    }

    public final boolean isInstanceInit() {
            r2 = this;
            com.android.dx.rop.cst.CstString r0 = r2.name
            java.lang.String r0 = r0.getString()
            java.lang.String r1 = "<init>"
            boolean r0 = r0.equals(r1)
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.android.dx.rop.cst.CstString r1 = r2.name
            java.lang.String r1 = r1.toHuman()
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            com.android.dx.rop.cst.CstString r1 = r2.descriptor
            java.lang.String r1 = r1.toHuman()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "nat{"
            r0.append(r1)
            java.lang.String r1 = r2.toHuman()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "nat"
            return r0
    }
}
