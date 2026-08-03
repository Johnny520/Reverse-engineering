package com.android.dx.cf.iface;

/* JADX INFO: loaded from: classes.dex */
public abstract class StdMember implements com.android.dx.cf.iface.Member {
    private final int accessFlags;
    private final com.android.dx.cf.iface.AttributeList attributes;
    private final com.android.dx.rop.cst.CstType definingClass;
    private final com.android.dx.rop.cst.CstNat nat;

    public StdMember(com.android.dx.rop.cst.CstType r1, int r2, com.android.dx.rop.cst.CstNat r3, com.android.dx.cf.iface.AttributeList r4) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L22
            if (r3 == 0) goto L1a
            if (r4 == 0) goto L12
            r0.definingClass = r1
            r0.accessFlags = r2
            r0.nat = r3
            r0.attributes = r4
            return
        L12:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "attributes == null"
            r1.<init>(r2)
            throw r1
        L1a:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "nat == null"
            r1.<init>(r2)
            throw r1
        L22:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "definingClass == null"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.android.dx.cf.iface.Member
    public final int getAccessFlags() {
            r1 = this;
            int r0 = r1.accessFlags
            return r0
    }

    @Override // com.android.dx.cf.iface.Member, com.android.dx.cf.iface.HasAttribute
    public final com.android.dx.cf.iface.AttributeList getAttributes() {
            r1 = this;
            com.android.dx.cf.iface.AttributeList r0 = r1.attributes
            return r0
    }

    @Override // com.android.dx.cf.iface.Member
    public final com.android.dx.rop.cst.CstType getDefiningClass() {
            r1 = this;
            com.android.dx.rop.cst.CstType r0 = r1.definingClass
            return r0
    }

    @Override // com.android.dx.cf.iface.Member
    public final com.android.dx.rop.cst.CstString getDescriptor() {
            r1 = this;
            com.android.dx.rop.cst.CstNat r0 = r1.nat
            com.android.dx.rop.cst.CstString r0 = r0.getDescriptor()
            return r0
    }

    @Override // com.android.dx.cf.iface.Member
    public final com.android.dx.rop.cst.CstString getName() {
            r1 = this;
            com.android.dx.rop.cst.CstNat r0 = r1.nat
            com.android.dx.rop.cst.CstString r0 = r0.getName()
            return r0
    }

    @Override // com.android.dx.cf.iface.Member
    public final com.android.dx.rop.cst.CstNat getNat() {
            r1 = this;
            com.android.dx.rop.cst.CstNat r0 = r1.nat
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            com.android.dx.rop.cst.CstNat r1 = r2.nat
            java.lang.String r1 = r1.toHuman()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
