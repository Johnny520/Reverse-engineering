package com.android.p002dx.dex.file;

import bsh.C3466;
import com.android.p002dx.rop.cst.CstType;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class IdItem extends IndexedItem {
    private final CstType type;

    public IdItem(CstType cstType) {
        if (cstType != null) {
            this.type = cstType;
        } else {
            C3466.m5903("type == null");
            throw null;
        }
    }

    @Override // com.android.p002dx.dex.file.Item
    public void addContents(DexFile dexFile) {
        dexFile.getTypeIds().intern(this.type);
    }

    public final CstType getDefiningClass() {
        return this.type;
    }
}
