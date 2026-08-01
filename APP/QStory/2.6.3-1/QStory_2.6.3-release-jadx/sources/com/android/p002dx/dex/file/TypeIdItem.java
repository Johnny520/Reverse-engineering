package com.android.p002dx.dex.file;

import androidx.profileinstaller.AbstractC3275;
import com.android.p002dx.rop.cst.CstString;
import com.android.p002dx.rop.cst.CstType;
import com.android.p002dx.util.AnnotatedOutput;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class TypeIdItem extends IdItem {
    public TypeIdItem(CstType cstType) {
        super(cstType);
    }

    @Override // com.android.p002dx.dex.file.IdItem, com.android.p002dx.dex.file.Item
    public void addContents(DexFile dexFile) {
        dexFile.getStringIds().intern(getDefiningClass().getDescriptor());
    }

    @Override // com.android.p002dx.dex.file.Item
    public ItemType itemType() {
        return ItemType.TYPE_TYPE_ID_ITEM;
    }

    @Override // com.android.p002dx.dex.file.Item
    public int writeSize() {
        return 4;
    }

    @Override // com.android.p002dx.dex.file.Item
    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        CstString descriptor = getDefiningClass().getDescriptor();
        int iIndexOf = dexFile.getStringIds().indexOf(descriptor);
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, indexString() + ' ' + descriptor.toHuman());
            AbstractC3275.m5123(iIndexOf, new StringBuilder("  descriptor_idx: "), annotatedOutput, 4);
        }
        annotatedOutput.writeInt(iIndexOf);
    }
}
