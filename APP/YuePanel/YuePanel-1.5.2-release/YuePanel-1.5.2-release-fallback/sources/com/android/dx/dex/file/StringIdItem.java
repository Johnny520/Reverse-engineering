package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class StringIdItem extends com.android.dx.dex.file.IndexedItem implements java.lang.Comparable {
    private com.android.dx.dex.file.StringDataItem data;
    private final com.android.dx.rop.cst.CstString value;

    public StringIdItem(com.android.dx.rop.cst.CstString r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Lb
            r1.value = r2
            r2 = 0
            r1.data = r2
            return
        Lb:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "value == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r3) {
            r2 = this;
            com.android.dx.dex.file.StringDataItem r0 = r2.data
            if (r0 != 0) goto L14
            com.android.dx.dex.file.MixedItemSection r3 = r3.getStringData()
            com.android.dx.dex.file.StringDataItem r0 = new com.android.dx.dex.file.StringDataItem
            com.android.dx.rop.cst.CstString r1 = r2.value
            r0.<init>(r1)
            r2.data = r0
            r3.add(r0)
        L14:
            return
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object r2) {
            r1 = this;
            com.android.dx.dex.file.StringIdItem r2 = (com.android.dx.dex.file.StringIdItem) r2
            com.android.dx.rop.cst.CstString r0 = r1.value
            com.android.dx.rop.cst.CstString r2 = r2.value
            int r2 = r0.compareTo2(r2)
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.android.dx.dex.file.StringIdItem
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.android.dx.dex.file.StringIdItem r2 = (com.android.dx.dex.file.StringIdItem) r2
            com.android.dx.rop.cst.CstString r0 = r1.value
            com.android.dx.rop.cst.CstString r2 = r2.value
            boolean r2 = r0.equals(r2)
            return r2
    }

    public com.android.dx.dex.file.StringDataItem getData() {
            r1 = this;
            com.android.dx.dex.file.StringDataItem r0 = r1.data
            return r0
    }

    public com.android.dx.rop.cst.CstString getValue() {
            r1 = this;
            com.android.dx.rop.cst.CstString r0 = r1.value
            return r0
    }

    public int hashCode() {
            r1 = this;
            com.android.dx.rop.cst.CstString r0 = r1.value
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_STRING_ID_ITEM
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public int writeSize() {
            r1 = this;
            r0 = 4
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public void writeTo(com.android.dx.dex.file.DexFile r4, com.android.dx.util.AnnotatedOutput r5) {
            r3 = this;
            com.android.dx.dex.file.StringDataItem r4 = r3.data
            int r4 = r4.getAbsoluteOffset()
            boolean r0 = r5.annotates()
            if (r0 == 0) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.indexString()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            com.android.dx.rop.cst.CstString r1 = r3.value
            r2 = 100
            java.lang.String r1 = r1.toQuoted(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r5.annotate(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "  string_data_off: "
            r0.append(r1)
            java.lang.String r1 = com.android.dx.util.Hex.u4(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 4
            r5.annotate(r1, r0)
        L49:
            r5.writeInt(r4)
            return
    }
}
