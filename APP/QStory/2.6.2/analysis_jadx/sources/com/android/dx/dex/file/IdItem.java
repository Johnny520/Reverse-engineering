package com.android.dx.dex.file;

import bsh.C2632;
import com.android.dx.rop.cst.CstType;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class IdItem extends IndexedItem {
    private final CstType type;

    public IdItem(CstType cstType) {
        if (cstType != null) {
            this.type = cstType;
        } else {
            C2632.m5298("type == null");
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
