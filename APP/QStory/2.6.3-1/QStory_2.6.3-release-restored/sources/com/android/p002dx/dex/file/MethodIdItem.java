package com.android.p002dx.dex.file;

import com.android.p002dx.rop.cst.CstBaseMethodRef;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class MethodIdItem extends MemberIdItem {
    public MethodIdItem(CstBaseMethodRef cstBaseMethodRef) {
        super(cstBaseMethodRef);
    }

    @Override // com.android.p002dx.dex.file.MemberIdItem, com.android.p002dx.dex.file.IdItem, com.android.p002dx.dex.file.Item
    public void addContents(DexFile dexFile) {
        super.addContents(dexFile);
        dexFile.getProtoIds().intern(getMethodRef().getPrototype());
    }

    public CstBaseMethodRef getMethodRef() {
        return (CstBaseMethodRef) getRef();
    }

    @Override // com.android.p002dx.dex.file.MemberIdItem
    public int getTypoidIdx(DexFile dexFile) {
        return dexFile.getProtoIds().indexOf(getMethodRef().getPrototype());
    }

    @Override // com.android.p002dx.dex.file.MemberIdItem
    public String getTypoidName() {
        return "proto_idx";
    }

    @Override // com.android.p002dx.dex.file.Item
    public ItemType itemType() {
        return ItemType.TYPE_METHOD_ID_ITEM;
    }
}
