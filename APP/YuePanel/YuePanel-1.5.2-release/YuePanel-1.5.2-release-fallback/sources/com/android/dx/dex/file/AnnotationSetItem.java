package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationSetItem extends com.android.dx.dex.file.OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int ENTRY_WRITE_SIZE = 4;
    private final com.android.dx.rop.annotation.Annotations annotations;
    private final com.android.dx.dex.file.AnnotationItem[] items;

    public AnnotationSetItem(com.android.dx.rop.annotation.Annotations r5, com.android.dx.dex.file.DexFile r6) {
            r4 = this;
            r0 = 4
            int r1 = writeSize(r5)
            r4.<init>(r0, r1)
            r4.annotations = r5
            int r0 = r5.size()
            com.android.dx.dex.file.AnnotationItem[] r0 = new com.android.dx.dex.file.AnnotationItem[r0]
            r4.items = r0
            java.util.Collection r5 = r5.getAnnotations()
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        L1b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r5.next()
            com.android.dx.rop.annotation.Annotation r1 = (com.android.dx.rop.annotation.Annotation) r1
            com.android.dx.dex.file.AnnotationItem[] r2 = r4.items
            com.android.dx.dex.file.AnnotationItem r3 = new com.android.dx.dex.file.AnnotationItem
            r3.<init>(r1, r6)
            r2[r0] = r3
            int r0 = r0 + 1
            goto L1b
        L33:
            return
    }

    private static int writeSize(com.android.dx.rop.annotation.Annotations r1) {
            int r1 = r1.size()     // Catch: java.lang.NullPointerException -> L9
            int r1 = r1 * 4
            int r1 = r1 + 4
            return r1
        L9:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "list == null"
            r1.<init>(r0)
            throw r1
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r5) {
            r4 = this;
            com.android.dx.dex.file.MixedItemSection r5 = r5.getByteData()
            com.android.dx.dex.file.AnnotationItem[] r0 = r4.items
            int r0 = r0.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L19
            com.android.dx.dex.file.AnnotationItem[] r2 = r4.items
            r3 = r2[r1]
            com.android.dx.dex.file.OffsettedItem r3 = r5.intern(r3)
            com.android.dx.dex.file.AnnotationItem r3 = (com.android.dx.dex.file.AnnotationItem) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L8
        L19:
            return
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public int compareTo0(com.android.dx.dex.file.OffsettedItem r2) {
            r1 = this;
            com.android.dx.dex.file.AnnotationSetItem r2 = (com.android.dx.dex.file.AnnotationSetItem) r2
            com.android.dx.rop.annotation.Annotations r0 = r1.annotations
            com.android.dx.rop.annotation.Annotations r2 = r2.annotations
            int r2 = r0.compareTo2(r2)
            return r2
    }

    public com.android.dx.rop.annotation.Annotations getAnnotations() {
            r1 = this;
            com.android.dx.rop.annotation.Annotations r0 = r1.annotations
            return r0
    }

    public int hashCode() {
            r1 = this;
            com.android.dx.rop.annotation.Annotations r0 = r1.annotations
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_ANNOTATION_SET_ITEM
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void place0(com.android.dx.dex.file.Section r1, int r2) {
            r0 = this;
            com.android.dx.dex.file.AnnotationItem[] r1 = r0.items
            com.android.dx.dex.file.AnnotationItem.sortByTypeIdIndex(r1)
            return
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public java.lang.String toHuman() {
            r1 = this;
            com.android.dx.rop.annotation.Annotations r0 = r1.annotations
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void writeTo0(com.android.dx.dex.file.DexFile r7, com.android.dx.util.AnnotatedOutput r8) {
            r6 = this;
            boolean r7 = r8.annotates()
            com.android.dx.dex.file.AnnotationItem[] r0 = r6.items
            int r0 = r0.length
            r1 = 4
            r2 = 0
            if (r7 == 0) goto L3b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r6.offsetString()
            r3.append(r4)
            java.lang.String r4 = " annotation set"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r8.annotate(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "  size: "
            r3.append(r4)
            java.lang.String r4 = com.android.dx.util.Hex.u4(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r8.annotate(r1, r3)
        L3b:
            r8.writeInt(r0)
        L3e:
            if (r2 >= r0) goto L7d
            com.android.dx.dex.file.AnnotationItem[] r3 = r6.items
            r3 = r3[r2]
            int r3 = r3.getAbsoluteOffset()
            if (r7 == 0) goto L77
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "  entries["
            r4.append(r5)
            java.lang.String r5 = java.lang.Integer.toHexString(r2)
            r4.append(r5)
            java.lang.String r5 = "]: "
            r4.append(r5)
            java.lang.String r5 = com.android.dx.util.Hex.u4(r3)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r8.annotate(r1, r4)
            com.android.dx.dex.file.AnnotationItem[] r4 = r6.items
            r4 = r4[r2]
            java.lang.String r5 = "    "
            r4.annotateTo(r8, r5)
        L77:
            r8.writeInt(r3)
            int r2 = r2 + 1
            goto L3e
        L7d:
            return
    }
}
