package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public abstract class CstMemberRef extends com.android.dx.rop.cst.TypedConstant {
    private final com.android.dx.rop.cst.CstType definingClass;
    private final com.android.dx.rop.cst.CstNat nat;

    public CstMemberRef(com.android.dx.rop.cst.CstType r1, com.android.dx.rop.cst.CstNat r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            r0.definingClass = r1
            r0.nat = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "nat == null"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "definingClass == null"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.android.dx.rop.cst.Constant
    public int compareTo0(com.android.dx.rop.cst.Constant r3) {
            r2 = this;
            com.android.dx.rop.cst.CstMemberRef r3 = (com.android.dx.rop.cst.CstMemberRef) r3
            com.android.dx.rop.cst.CstType r0 = r2.definingClass
            com.android.dx.rop.cst.CstType r1 = r3.definingClass
            int r0 = r0.compareTo2(r1)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            com.android.dx.rop.cst.CstNat r0 = r2.nat
            com.android.dx.rop.cst.CstString r0 = r0.getName()
            com.android.dx.rop.cst.CstNat r3 = r3.nat
            com.android.dx.rop.cst.CstString r3 = r3.getName()
            int r3 = r0.compareTo2(r3)
            return r3
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L25
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto Le
            goto L25
        Le:
            com.android.dx.rop.cst.CstMemberRef r4 = (com.android.dx.rop.cst.CstMemberRef) r4
            com.android.dx.rop.cst.CstType r1 = r3.definingClass
            com.android.dx.rop.cst.CstType r2 = r4.definingClass
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L25
            com.android.dx.rop.cst.CstNat r1 = r3.nat
            com.android.dx.rop.cst.CstNat r4 = r4.nat
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L25
            r0 = 1
        L25:
            return r0
    }

    public final com.android.dx.rop.cst.CstType getDefiningClass() {
            r1 = this;
            com.android.dx.rop.cst.CstType r0 = r1.definingClass
            return r0
    }

    public final com.android.dx.rop.cst.CstNat getNat() {
            r1 = this;
            com.android.dx.rop.cst.CstNat r0 = r1.nat
            return r0
    }

    public final int hashCode() {
            r2 = this;
            com.android.dx.rop.cst.CstType r0 = r2.definingClass
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            com.android.dx.rop.cst.CstNat r1 = r2.nat
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public final boolean isCategory2() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public final java.lang.String toHuman() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.android.dx.rop.cst.CstType r1 = r2.definingClass
            java.lang.String r1 = r1.toHuman()
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            com.android.dx.rop.cst.CstNat r1 = r2.nat
            java.lang.String r1 = r1.toHuman()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.typeName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            java.lang.String r1 = r2.toHuman()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
