package com.android.dx.dex.file;

import com.android.dx.dex.file.OffsettedItem;

/* JADX INFO: loaded from: classes.dex */
public final class UniformListItem<T extends com.android.dx.dex.file.OffsettedItem> extends com.android.dx.dex.file.OffsettedItem {
    private static final int HEADER_SIZE = 4;
    private final com.android.dx.dex.file.ItemType itemType;
    private final java.util.List<T> items;

    public UniformListItem(com.android.dx.dex.file.ItemType r3, java.util.List<T> r4) {
            r2 = this;
            int r0 = getAlignment(r4)
            int r1 = writeSize(r4)
            r2.<init>(r0, r1)
            if (r3 == 0) goto L12
            r2.items = r4
            r2.itemType = r3
            return
        L12:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "itemType == null"
            r3.<init>(r4)
            throw r3
    }

    private static int getAlignment(java.util.List<? extends com.android.dx.dex.file.OffsettedItem> r1) {
            r0 = 0
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.NullPointerException -> L11 java.lang.IndexOutOfBoundsException -> L19
            com.android.dx.dex.file.OffsettedItem r1 = (com.android.dx.dex.file.OffsettedItem) r1     // Catch: java.lang.NullPointerException -> L11 java.lang.IndexOutOfBoundsException -> L19
            int r1 = r1.getAlignment()     // Catch: java.lang.NullPointerException -> L11 java.lang.IndexOutOfBoundsException -> L19
            r0 = 4
            int r1 = java.lang.Math.max(r0, r1)     // Catch: java.lang.NullPointerException -> L11 java.lang.IndexOutOfBoundsException -> L19
            return r1
        L11:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "items == null"
            r1.<init>(r0)
            throw r1
        L19:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "items.size() == 0"
            r1.<init>(r0)
            throw r1
    }

    private int headerSize() {
            r1 = this;
            int r0 = r1.getAlignment()
            return r0
    }

    private static int writeSize(java.util.List<? extends com.android.dx.dex.file.OffsettedItem> r2) {
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            com.android.dx.dex.file.OffsettedItem r0 = (com.android.dx.dex.file.OffsettedItem) r0
            int r1 = r2.size()
            int r0 = r0.writeSize()
            int r1 = r1 * r0
            int r2 = getAlignment(r2)
            int r1 = r1 + r2
            return r1
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r3) {
            r2 = this;
            java.util.List<T extends com.android.dx.dex.file.OffsettedItem> r0 = r2.items
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.android.dx.dex.file.OffsettedItem r1 = (com.android.dx.dex.file.OffsettedItem) r1
            r1.addContents(r3)
            goto L6
        L16:
            return
    }

    public final java.util.List<T> getItems() {
            r1 = this;
            java.util.List<T extends com.android.dx.dex.file.OffsettedItem> r0 = r1.items
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = r1.itemType
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void place0(com.android.dx.dex.file.Section r8, int r9) {
            r7 = this;
            int r0 = r7.headerSize()
            int r9 = r9 + r0
            java.util.List<T extends com.android.dx.dex.file.OffsettedItem> r0 = r7.items
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
            r2 = -1
            r3 = r2
        Le:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L47
            java.lang.Object r4 = r0.next()
            com.android.dx.dex.file.OffsettedItem r4 = (com.android.dx.dex.file.OffsettedItem) r4
            int r5 = r4.writeSize()
            if (r1 == 0) goto L29
            int r1 = r4.getAlignment()
            r2 = 0
            r3 = r1
            r1 = r2
            r2 = r5
            goto L31
        L29:
            if (r5 != r2) goto L3f
            int r6 = r4.getAlignment()
            if (r6 != r3) goto L37
        L31:
            int r9 = r4.place(r8, r9)
            int r9 = r9 + r5
            goto Le
        L37:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r9 = "item alignment mismatch"
            r8.<init>(r9)
            throw r8
        L3f:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r9 = "item size mismatch"
            r8.<init>(r9)
            throw r8
        L47:
            return
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public final java.lang.String toHuman() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            java.util.List<T extends com.android.dx.dex.file.OffsettedItem> r1 = r5.items
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L13:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r1.next()
            com.android.dx.dex.file.OffsettedItem r3 = (com.android.dx.dex.file.OffsettedItem) r3
            if (r2 == 0) goto L23
            r2 = 0
            goto L28
        L23:
            java.lang.String r4 = ", "
            r0.append(r4)
        L28:
            java.lang.String r3 = r3.toHuman()
            r0.append(r3)
            goto L13
        L30:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.Class<com.android.dx.dex.file.UniformListItem> r1 = com.android.dx.dex.file.UniformListItem.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.util.List<T extends com.android.dx.dex.file.OffsettedItem> r1 = r2.items
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void writeTo0(com.android.dx.dex.file.DexFile r4, com.android.dx.util.AnnotatedOutput r5) {
            r3 = this;
            java.util.List<T extends com.android.dx.dex.file.OffsettedItem> r0 = r3.items
            int r0 = r0.size()
            boolean r1 = r5.annotates()
            if (r1 == 0) goto L45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.offsetString()
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            java.lang.String r2 = r3.typeName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r5.annotate(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "  size: "
            r1.append(r2)
            java.lang.String r2 = com.android.dx.util.Hex.u4(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 4
            r5.annotate(r2, r1)
        L45:
            r5.writeInt(r0)
            java.util.List<T extends com.android.dx.dex.file.OffsettedItem> r0 = r3.items
            java.util.Iterator r0 = r0.iterator()
        L4e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r0.next()
            com.android.dx.dex.file.OffsettedItem r1 = (com.android.dx.dex.file.OffsettedItem) r1
            r1.writeTo(r4, r5)
            goto L4e
        L5e:
            return
    }
}
