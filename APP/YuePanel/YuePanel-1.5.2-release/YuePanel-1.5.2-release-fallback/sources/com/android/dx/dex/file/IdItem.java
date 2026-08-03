package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public abstract class IdItem extends com.android.dx.dex.file.IndexedItem {
    private final com.android.dx.rop.cst.CstType type;

    public IdItem(com.android.dx.rop.cst.CstType r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.type = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "type == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r2) {
            r1 = this;
            com.android.dx.dex.file.TypeIdsSection r2 = r2.getTypeIds()
            com.android.dx.rop.cst.CstType r0 = r1.type
            r2.intern(r0)
            return
    }

    public final com.android.dx.rop.cst.CstType getDefiningClass() {
            r1 = this;
            com.android.dx.rop.cst.CstType r0 = r1.type
            return r0
    }
}
