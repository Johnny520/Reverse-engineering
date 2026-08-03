package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class CallSiteItem extends com.android.dx.dex.file.OffsettedItem {
    private byte[] encodedForm;
    private final com.android.dx.rop.cst.CstCallSite value;

    public CallSiteItem(com.android.dx.rop.cst.CstCallSite r3) {
            r2 = this;
            r0 = 1
            int r1 = writeSize(r3)
            r2.<init>(r0, r1)
            r2.value = r3
            return
    }

    private static int writeSize(com.android.dx.rop.cst.CstCallSite r0) {
            r0 = -1
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r2) {
            r1 = this;
            com.android.dx.rop.cst.CstCallSite r0 = r1.value
            com.android.dx.dex.file.ValueEncoder.addContents(r2, r0)
            return
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
            com.android.dx.rop.cst.CstCallSite r3 = r2.value
            r1 = 1
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
            com.android.dx.rop.cst.CstCallSite r0 = r1.value
            java.lang.String r0 = r0.toHuman()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            com.android.dx.rop.cst.CstCallSite r0 = r1.value
            java.lang.String r0 = r0.toString()
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
            java.lang.String r1 = " call site"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r4.annotate(r1, r0)
            com.android.dx.dex.file.ValueEncoder r0 = new com.android.dx.dex.file.ValueEncoder
            r0.<init>(r3, r4)
            com.android.dx.rop.cst.CstCallSite r3 = r2.value
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
