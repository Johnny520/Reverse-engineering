package com.android.dx.cf.direct;

/* JADX INFO: loaded from: classes.dex */
final class MethodListParser extends com.android.dx.cf.direct.MemberListParser {
    private final com.android.dx.cf.iface.StdMethodList methods;

    public MethodListParser(com.android.dx.cf.direct.DirectClassFile r1, com.android.dx.rop.cst.CstType r2, int r3, com.android.dx.cf.direct.AttributeFactory r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            com.android.dx.cf.iface.StdMethodList r1 = new com.android.dx.cf.iface.StdMethodList
            int r2 = r0.getCount()
            r1.<init>(r2)
            r0.methods = r1
            return
    }

    @Override // com.android.dx.cf.direct.MemberListParser
    public int getAttributeContext() {
            r1 = this;
            r0 = 2
            return r0
    }

    public com.android.dx.cf.iface.StdMethodList getList() {
            r1 = this;
            r1.parseIfNecessary()
            com.android.dx.cf.iface.StdMethodList r0 = r1.methods
            return r0
    }

    @Override // com.android.dx.cf.direct.MemberListParser
    public java.lang.String humanAccessFlags(int r1) {
            r0 = this;
            java.lang.String r1 = com.android.dx.rop.code.AccessFlags.methodString(r1)
            return r1
    }

    @Override // com.android.dx.cf.direct.MemberListParser
    public java.lang.String humanName() {
            r1 = this;
            java.lang.String r0 = "method"
            return r0
    }

    @Override // com.android.dx.cf.direct.MemberListParser
    public com.android.dx.cf.iface.Member set(int r3, int r4, com.android.dx.rop.cst.CstNat r5, com.android.dx.cf.iface.AttributeList r6) {
            r2 = this;
            com.android.dx.cf.iface.StdMethod r0 = new com.android.dx.cf.iface.StdMethod
            com.android.dx.rop.cst.CstType r1 = r2.getDefiner()
            r0.<init>(r1, r4, r5, r6)
            com.android.dx.cf.iface.StdMethodList r4 = r2.methods
            r4.set(r3, r0)
            return r0
    }
}
