package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class TypeIdItem extends com.android.dx.dex.file.IdItem {
    public TypeIdItem(com.android.dx.rop.cst.CstType r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.android.dx.dex.file.IdItem, com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r2) {
            r1 = this;
            com.android.dx.dex.file.StringIdsSection r2 = r2.getStringIds()
            com.android.dx.rop.cst.CstType r0 = r1.getDefiningClass()
            com.android.dx.rop.cst.CstString r0 = r0.getDescriptor()
            r2.intern(r0)
            return
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_TYPE_ID_ITEM
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public int writeSize() {
            r1 = this;
            r0 = 4
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public void writeTo(com.android.dx.dex.file.DexFile r4, com.android.dx.util.AnnotatedOutput r5) {
            r3 = this;
            com.android.dx.rop.cst.CstType r0 = r3.getDefiningClass()
            com.android.dx.rop.cst.CstString r0 = r0.getDescriptor()
            com.android.dx.dex.file.StringIdsSection r4 = r4.getStringIds()
            int r4 = r4.indexOf(r0)
            boolean r1 = r5.annotates()
            if (r1 == 0) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.indexString()
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.String r0 = r0.toHuman()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 0
            r5.annotate(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "  descriptor_idx: "
            r0.append(r1)
            java.lang.String r1 = com.android.dx.util.Hex.u4(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 4
            r5.annotate(r1, r0)
        L4f:
            r5.writeInt(r4)
            return
    }
}
