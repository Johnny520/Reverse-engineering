package com.android.dx.dex.file;

import com.android.dx.rop.cst.CstFieldRef;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldIdItem extends MemberIdItem {
    public FieldIdItem(CstFieldRef cstFieldRef) {
        super(cstFieldRef);
    }

    @Override // com.android.dx.dex.file.MemberIdItem, com.android.dx.dex.file.IdItem, com.android.dx.dex.file.Item
    public void addContents(DexFile dexFile) {
        super.addContents(dexFile);
        dexFile.getTypeIds().intern(getFieldRef().getType());
    }

    public CstFieldRef getFieldRef() {
        return (CstFieldRef) getRef();
    }

    @Override // com.android.dx.dex.file.MemberIdItem
    public int getTypoidIdx(DexFile dexFile) {
        return dexFile.getTypeIds().indexOf(getFieldRef().getType());
    }

    @Override // com.android.dx.dex.file.MemberIdItem
    public String getTypoidName() {
        return "type_idx";
    }

    @Override // com.android.dx.dex.file.Item
    public ItemType itemType() {
        return ItemType.TYPE_FIELD_ID_ITEM;
    }
}
