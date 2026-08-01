package com.android.dx.dex.file;

import bsh.C2633;
import com.android.dx.rop.cst.CstType;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class IdItem extends IndexedItem {
    private final CstType type;

    public IdItem(CstType cstType) {
        if (cstType != null) {
            this.type = cstType;
        } else {
            C2633.m5343("type == null");
            throw null;
        }
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(DexFile dexFile) {
        dexFile.getTypeIds().intern(this.type);
    }

    public final CstType getDefiningClass() {
        return this.type;
    }
}
