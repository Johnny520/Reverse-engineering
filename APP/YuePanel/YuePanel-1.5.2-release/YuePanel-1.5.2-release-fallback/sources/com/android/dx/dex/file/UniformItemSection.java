package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public abstract class UniformItemSection extends com.android.dx.dex.file.Section {
    public UniformItemSection(java.lang.String r1, com.android.dx.dex.file.DexFile r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public abstract com.android.dx.dex.file.IndexedItem get(com.android.dx.rop.cst.Constant r1);

    @Override // com.android.dx.dex.file.Section
    public final int getAbsoluteItemOffset(com.android.dx.dex.file.Item r2) {
            r1 = this;
            com.android.dx.dex.file.IndexedItem r2 = (com.android.dx.dex.file.IndexedItem) r2
            int r0 = r2.getIndex()
            int r2 = r2.writeSize()
            int r0 = r0 * r2
            int r2 = r1.getAbsoluteOffset(r0)
            return r2
    }

    public abstract void orderItems();

    @Override // com.android.dx.dex.file.Section
    public final void prepare0() {
            r3 = this;
            com.android.dx.dex.file.DexFile r0 = r3.getFile()
            r3.orderItems()
            java.util.Collection r1 = r3.items()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            com.android.dx.dex.file.Item r2 = (com.android.dx.dex.file.Item) r2
            r2.addContents(r0)
            goto Lf
        L1f:
            return
    }

    @Override // com.android.dx.dex.file.Section
    public final int writeSize() {
            r2 = this;
            java.util.Collection r0 = r2.items()
            int r1 = r0.size()
            if (r1 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            com.android.dx.dex.file.Item r0 = (com.android.dx.dex.file.Item) r0
            int r0 = r0.writeSize()
            int r1 = r1 * r0
            return r1
    }

    @Override // com.android.dx.dex.file.Section
    public final void writeTo0(com.android.dx.util.AnnotatedOutput r5) {
            r4 = this;
            com.android.dx.dex.file.DexFile r0 = r4.getFile()
            int r1 = r4.getAlignment()
            java.util.Collection r2 = r4.items()
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r3 = r2.next()
            com.android.dx.dex.file.Item r3 = (com.android.dx.dex.file.Item) r3
            r3.writeTo(r0, r5)
            r5.alignTo(r1)
            goto L10
        L23:
            return
    }
}
