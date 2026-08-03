package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationSetRefItem extends com.android.dx.dex.file.OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int WRITE_SIZE = 4;
    private com.android.dx.dex.file.AnnotationSetItem annotations;

    public AnnotationSetRefItem(com.android.dx.dex.file.AnnotationSetItem r2) {
            r1 = this;
            r0 = 4
            r1.<init>(r0, r0)
            if (r2 == 0) goto L9
            r1.annotations = r2
            return
        L9:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "annotations == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r2) {
            r1 = this;
            com.android.dx.dex.file.MixedItemSection r2 = r2.getWordData()
            com.android.dx.dex.file.AnnotationSetItem r0 = r1.annotations
            com.android.dx.dex.file.OffsettedItem r2 = r2.intern(r0)
            com.android.dx.dex.file.AnnotationSetItem r2 = (com.android.dx.dex.file.AnnotationSetItem) r2
            r1.annotations = r2
            return
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_ANNOTATION_SET_REF_ITEM
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public java.lang.String toHuman() {
            r1 = this;
            com.android.dx.dex.file.AnnotationSetItem r0 = r1.annotations
            java.lang.String r0 = r0.toHuman()
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void writeTo0(com.android.dx.dex.file.DexFile r3, com.android.dx.util.AnnotatedOutput r4) {
            r2 = this;
            com.android.dx.dex.file.AnnotationSetItem r3 = r2.annotations
            int r3 = r3.getAbsoluteOffset()
            boolean r0 = r4.annotates()
            if (r0 == 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "  annotations_off: "
            r0.append(r1)
            java.lang.String r1 = com.android.dx.util.Hex.u4(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 4
            r4.annotate(r1, r0)
        L25:
            r4.writeInt(r3)
            return
    }
}
