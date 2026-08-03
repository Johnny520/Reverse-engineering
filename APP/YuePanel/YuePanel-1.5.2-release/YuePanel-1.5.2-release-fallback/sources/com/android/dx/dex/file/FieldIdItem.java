package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class FieldIdItem extends com.android.dx.dex.file.MemberIdItem {
    public FieldIdItem(com.android.dx.rop.cst.CstFieldRef r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.android.dx.dex.file.MemberIdItem, com.android.dx.dex.file.IdItem, com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r2) {
            r1 = this;
            super.addContents(r2)
            com.android.dx.dex.file.TypeIdsSection r2 = r2.getTypeIds()
            com.android.dx.rop.cst.CstFieldRef r0 = r1.getFieldRef()
            com.android.dx.rop.type.Type r0 = r0.getType()
            r2.intern(r0)
            return
    }

    public com.android.dx.rop.cst.CstFieldRef getFieldRef() {
            r1 = this;
            com.android.dx.rop.cst.CstMemberRef r0 = r1.getRef()
            com.android.dx.rop.cst.CstFieldRef r0 = (com.android.dx.rop.cst.CstFieldRef) r0
            return r0
    }

    @Override // com.android.dx.dex.file.MemberIdItem
    public int getTypoidIdx(com.android.dx.dex.file.DexFile r2) {
            r1 = this;
            com.android.dx.dex.file.TypeIdsSection r2 = r2.getTypeIds()
            com.android.dx.rop.cst.CstFieldRef r0 = r1.getFieldRef()
            com.android.dx.rop.type.Type r0 = r0.getType()
            int r2 = r2.indexOf(r0)
            return r2
    }

    @Override // com.android.dx.dex.file.MemberIdItem
    public java.lang.String getTypoidName() {
            r1 = this;
            java.lang.String r0 = "type_idx"
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_FIELD_ID_ITEM
            return r0
    }
}
