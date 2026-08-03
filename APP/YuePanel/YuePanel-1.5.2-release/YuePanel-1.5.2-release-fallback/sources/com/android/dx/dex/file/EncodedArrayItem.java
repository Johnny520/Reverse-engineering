package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class EncodedArrayItem extends com.android.dx.dex.file.OffsettedItem {
    private static final int ALIGNMENT = 1;
    private final com.android.dx.rop.cst.CstArray array;
    private byte[] encodedForm;

    public EncodedArrayItem(com.android.dx.rop.cst.CstArray r3) {
            r2 = this;
            r0 = 1
            r1 = -1
            r2.<init>(r0, r1)
            if (r3 == 0) goto Ld
            r2.array = r3
            r3 = 0
            r2.encodedForm = r3
            return
        Ld:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "array == null"
            r3.<init>(r0)
            throw r3
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r2) {
            r1 = this;
            com.android.dx.rop.cst.CstArray r0 = r1.array
            com.android.dx.dex.file.ValueEncoder.addContents(r2, r0)
            return
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public int compareTo0(com.android.dx.dex.file.OffsettedItem r2) {
            r1 = this;
            com.android.dx.dex.file.EncodedArrayItem r2 = (com.android.dx.dex.file.EncodedArrayItem) r2
            com.android.dx.rop.cst.CstArray r0 = r1.array
            com.android.dx.rop.cst.CstArray r2 = r2.array
            int r2 = r0.compareTo2(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            com.android.dx.rop.cst.CstArray r0 = r1.array
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_ENCODED_ARRAY_ITEM
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void place0(com.android.dx.dex.file.Section r3, int r4) {
            r2 = this;
            com.android.dx.util.ByteArrayAnnotatedOutput r4 = new com.android.dx.util.ByteArrayAnnotatedOutput
            r4.<init>()
            com.android.dx.dex.file.ValueEncoder r0 = new com.android.dx.dex.file.ValueEncoder
            com.android.dx.dex.file.DexFile r3 = r3.getFile()
            r0.<init>(r3, r4)
            com.android.dx.rop.cst.CstArray r3 = r2.array
            r1 = 0
            r0.writeArray(r3, r1)
            byte[] r3 = r4.toByteArray()
            r2.encodedForm = r3
            int r3 = r3.length
            r2.setWriteSize(r3)
            return
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public java.lang.String toHuman() {
            r1 = this;
            com.android.dx.rop.cst.CstArray r0 = r1.array
            java.lang.String r0 = r0.toHuman()
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void writeTo0(com.android.dx.dex.file.DexFile r3, com.android.dx.util.AnnotatedOutput r4) {
            r2 = this;
            boolean r0 = r4.annotates()
            if (r0 == 0) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.offsetString()
            r0.append(r1)
            java.lang.String r1 = " encoded array"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r4.annotate(r1, r0)
            com.android.dx.dex.file.ValueEncoder r0 = new com.android.dx.dex.file.ValueEncoder
            r0.<init>(r3, r4)
            com.android.dx.rop.cst.CstArray r3 = r2.array
            r4 = 1
            r0.writeArray(r3, r4)
            goto L30
        L2b:
            byte[] r3 = r2.encodedForm
            r4.write(r3)
        L30:
            return
    }
}
