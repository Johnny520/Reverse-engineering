package com.android.dx.dex.file;

import com.android.dx.rop.cst.CstBaseMethodRef;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class MethodIdItem extends MemberIdItem {
    public MethodIdItem(CstBaseMethodRef cstBaseMethodRef) {
        super(cstBaseMethodRef);
    }

    @Override // com.android.dx.dex.file.MemberIdItem, com.android.dx.dex.file.IdItem, com.android.dx.dex.file.Item
    public void addContents(DexFile dexFile) {
        super.addContents(dexFile);
        dexFile.getProtoIds().intern(getMethodRef().getPrototype());
    }

    public CstBaseMethodRef getMethodRef() {
        return (CstBaseMethodRef) getRef();
    }

    @Override // com.android.dx.dex.file.MemberIdItem
    public int getTypoidIdx(DexFile dexFile) {
        return dexFile.getProtoIds().indexOf(getMethodRef().getPrototype());
    }

    @Override // com.android.dx.dex.file.MemberIdItem
    public String getTypoidName() {
        return "proto_idx";
    }

    @Override // com.android.dx.dex.file.Item
    public ItemType itemType() {
        return ItemType.TYPE_METHOD_ID_ITEM;
    }
}
