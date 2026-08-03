package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public abstract class MemberIdItem extends com.android.dx.dex.file.IdItem {
    private final com.android.dx.rop.cst.CstMemberRef cst;

    public MemberIdItem(com.android.dx.rop.cst.CstMemberRef r2) {
            r1 = this;
            com.android.dx.rop.cst.CstType r0 = r2.getDefiningClass()
            r1.<init>(r0)
            r1.cst = r2
            return
    }

    @Override // com.android.dx.dex.file.IdItem, com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r2) {
            r1 = this;
            super.addContents(r2)
            com.android.dx.dex.file.StringIdsSection r2 = r2.getStringIds()
            com.android.dx.rop.cst.CstMemberRef r0 = r1.getRef()
            com.android.dx.rop.cst.CstNat r0 = r0.getNat()
            com.android.dx.rop.cst.CstString r0 = r0.getName()
            r2.intern(r0)
            return
    }

    public final com.android.dx.rop.cst.CstMemberRef getRef() {
            r1 = this;
            com.android.dx.rop.cst.CstMemberRef r0 = r1.cst
            return r0
    }

    public abstract int getTypoidIdx(com.android.dx.dex.file.DexFile r1);

    public abstract java.lang.String getTypoidName();

    @Override // com.android.dx.dex.file.Item
    public int writeSize() {
            r1 = this;
            r0 = 8
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public final void writeTo(com.android.dx.dex.file.DexFile r6, com.android.dx.util.AnnotatedOutput r7) {
            r5 = this;
            com.android.dx.dex.file.TypeIdsSection r0 = r6.getTypeIds()
            com.android.dx.dex.file.StringIdsSection r1 = r6.getStringIds()
            com.android.dx.rop.cst.CstMemberRef r2 = r5.cst
            com.android.dx.rop.cst.CstNat r2 = r2.getNat()
            com.android.dx.rop.cst.CstType r3 = r5.getDefiningClass()
            int r0 = r0.indexOf(r3)
            com.android.dx.rop.cst.CstString r2 = r2.getName()
            int r1 = r1.indexOf(r2)
            int r6 = r5.getTypoidIdx(r6)
            boolean r2 = r7.annotates()
            if (r2 == 0) goto La2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r5.indexString()
            r2.append(r3)
            r3 = 32
            r2.append(r3)
            com.android.dx.rop.cst.CstMemberRef r3 = r5.cst
            java.lang.String r3 = r3.toHuman()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            r7.annotate(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "  class_idx: "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u2(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 2
            r7.annotate(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r5.getTypoidName()
            r2.append(r4)
            r4 = 58
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = com.android.dx.util.Hex.u2(r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r4}
            java.lang.String r4 = "  %-10s %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            r7.annotate(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "  name_idx:  "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u4(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 4
            r7.annotate(r3, r2)
        La2:
            r7.writeShort(r0)
            r7.writeShort(r6)
            r7.writeInt(r1)
            return
    }
}
