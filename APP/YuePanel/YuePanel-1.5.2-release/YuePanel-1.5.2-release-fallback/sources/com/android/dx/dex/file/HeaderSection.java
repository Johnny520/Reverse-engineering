package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class HeaderSection extends com.android.dx.dex.file.UniformItemSection {
    private final java.util.List<com.android.dx.dex.file.HeaderItem> list;

    public HeaderSection(com.android.dx.dex.file.DexFile r3) {
            r2 = this;
            r0 = 0
            r1 = 4
            r2.<init>(r0, r3, r1)
            com.android.dx.dex.file.HeaderItem r3 = new com.android.dx.dex.file.HeaderItem
            r3.<init>()
            r0 = 0
            r3.setIndex(r0)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r2.list = r3
            return
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public com.android.dx.dex.file.IndexedItem get(com.android.dx.rop.cst.Constant r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.android.dx.dex.file.Section
    public java.util.Collection<? extends com.android.dx.dex.file.Item> items() {
            r1 = this;
            java.util.List<com.android.dx.dex.file.HeaderItem> r0 = r1.list
            return r0
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public void orderItems() {
            r0 = this;
            return
    }
}
