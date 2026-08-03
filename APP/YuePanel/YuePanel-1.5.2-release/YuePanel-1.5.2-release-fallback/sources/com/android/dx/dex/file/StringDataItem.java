package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class StringDataItem extends com.android.dx.dex.file.OffsettedItem {
    private final com.android.dx.rop.cst.CstString value;

    public StringDataItem(com.android.dx.rop.cst.CstString r3) {
            r2 = this;
            r0 = 1
            int r1 = writeSize(r3)
            r2.<init>(r0, r1)
            r2.value = r3
            return
    }

    private static int writeSize(com.android.dx.rop.cst.CstString r1) {
            int r0 = r1.getUtf16Size()
            int r0 = com.android.dex.Leb128.unsignedLeb128Size(r0)
            int r1 = r1.getUtf8Size()
            int r0 = r0 + r1
            int r0 = r0 + 1
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r1) {
            r0 = this;
            return
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public int compareTo0(com.android.dx.dex.file.OffsettedItem r2) {
            r1 = this;
            com.android.dx.dex.file.StringDataItem r2 = (com.android.dx.dex.file.StringDataItem) r2
            com.android.dx.rop.cst.CstString r0 = r1.value
            com.android.dx.rop.cst.CstString r2 = r2.value
            int r2 = r0.compareTo2(r2)
            return r2
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_STRING_DATA_ITEM
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public java.lang.String toHuman() {
            r1 = this;
            com.android.dx.rop.cst.CstString r0 = r1.value
            java.lang.String r0 = r0.toQuoted()
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void writeTo0(com.android.dx.dex.file.DexFile r5, com.android.dx.util.AnnotatedOutput r6) {
            r4 = this;
            com.android.dx.rop.cst.CstString r5 = r4.value
            com.android.dx.util.ByteArray r5 = r5.getBytes()
            com.android.dx.rop.cst.CstString r0 = r4.value
            int r0 = r0.getUtf16Size()
            boolean r1 = r6.annotates()
            if (r1 == 0) goto L3d
            int r1 = com.android.dex.Leb128.unsignedLeb128Size(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "utf16_size: "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u4(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r6.annotate(r1, r2)
            int r1 = r5.size()
            int r1 = r1 + 1
            com.android.dx.rop.cst.CstString r2 = r4.value
            java.lang.String r2 = r2.toQuoted()
            r6.annotate(r1, r2)
        L3d:
            r6.writeUleb128(r0)
            r6.write(r5)
            r5 = 0
            r6.writeByte(r5)
            return
    }
}
