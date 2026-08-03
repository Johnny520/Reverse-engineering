package com.android.dx.cf.direct;

/* JADX INFO: loaded from: classes.dex */
final class FieldListParser extends com.android.dx.cf.direct.MemberListParser {
    private final com.android.dx.cf.iface.StdFieldList fields;

    public FieldListParser(com.android.dx.cf.direct.DirectClassFile r1, com.android.dx.rop.cst.CstType r2, int r3, com.android.dx.cf.direct.AttributeFactory r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            com.android.dx.cf.iface.StdFieldList r1 = new com.android.dx.cf.iface.StdFieldList
            int r2 = r0.getCount()
            r1.<init>(r2)
            r0.fields = r1
            return
    }

    @Override // com.android.dx.cf.direct.MemberListParser
    public int getAttributeContext() {
            r1 = this;
            r0 = 1
            return r0
    }

    public com.android.dx.cf.iface.StdFieldList getList() {
            r1 = this;
            r1.parseIfNecessary()
            com.android.dx.cf.iface.StdFieldList r0 = r1.fields
            return r0
    }

    @Override // com.android.dx.cf.direct.MemberListParser
    public java.lang.String humanAccessFlags(int r1) {
            r0 = this;
            java.lang.String r1 = com.android.dx.rop.code.AccessFlags.fieldString(r1)
            return r1
    }

    @Override // com.android.dx.cf.direct.MemberListParser
    public java.lang.String humanName() {
            r1 = this;
            java.lang.String r0 = "field"
            return r0
    }

    @Override // com.android.dx.cf.direct.MemberListParser
    public com.android.dx.cf.iface.Member set(int r3, int r4, com.android.dx.rop.cst.CstNat r5, com.android.dx.cf.iface.AttributeList r6) {
            r2 = this;
            com.android.dx.cf.iface.StdField r0 = new com.android.dx.cf.iface.StdField
            com.android.dx.rop.cst.CstType r1 = r2.getDefiner()
            r0.<init>(r1, r4, r5, r6)
            com.android.dx.cf.iface.StdFieldList r4 = r2.fields
            r4.set(r3, r0)
            return r0
    }
}
