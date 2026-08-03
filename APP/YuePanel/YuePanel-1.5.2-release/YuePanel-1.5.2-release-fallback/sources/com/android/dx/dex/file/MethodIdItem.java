package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class MethodIdItem extends com.android.dx.dex.file.MemberIdItem {
    public MethodIdItem(com.android.dx.rop.cst.CstBaseMethodRef r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.android.dx.dex.file.MemberIdItem, com.android.dx.dex.file.IdItem, com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r2) {
            r1 = this;
            super.addContents(r2)
            com.android.dx.dex.file.ProtoIdsSection r2 = r2.getProtoIds()
            com.android.dx.rop.cst.CstBaseMethodRef r0 = r1.getMethodRef()
            com.android.dx.rop.type.Prototype r0 = r0.getPrototype()
            r2.intern(r0)
            return
    }

    public com.android.dx.rop.cst.CstBaseMethodRef getMethodRef() {
            r1 = this;
            com.android.dx.rop.cst.CstMemberRef r0 = r1.getRef()
            com.android.dx.rop.cst.CstBaseMethodRef r0 = (com.android.dx.rop.cst.CstBaseMethodRef) r0
            return r0
    }

    @Override // com.android.dx.dex.file.MemberIdItem
    public int getTypoidIdx(com.android.dx.dex.file.DexFile r2) {
            r1 = this;
            com.android.dx.dex.file.ProtoIdsSection r2 = r2.getProtoIds()
            com.android.dx.rop.cst.CstBaseMethodRef r0 = r1.getMethodRef()
            com.android.dx.rop.type.Prototype r0 = r0.getPrototype()
            int r2 = r2.indexOf(r0)
            return r2
    }

    @Override // com.android.dx.dex.file.MemberIdItem
    public java.lang.String getTypoidName() {
            r1 = this;
            java.lang.String r0 = "proto_idx"
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_METHOD_ID_ITEM
            return r0
    }
}
