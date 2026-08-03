package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public abstract class OffsettedItem extends com.android.dx.dex.file.Item implements java.lang.Comparable<com.android.dx.dex.file.OffsettedItem> {
    private com.android.dx.dex.file.Section addedTo;
    private final int alignment;
    private int offset;
    private int writeSize;

    public OffsettedItem(int r2, int r3) {
            r1 = this;
            r1.<init>()
            com.android.dx.dex.file.Section.validateAlignment(r2)
            r0 = -1
            if (r3 < r0) goto L13
            r1.alignment = r2
            r1.writeSize = r3
            r2 = 0
            r1.addedTo = r2
            r1.offset = r0
            return
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "writeSize < -1"
            r2.<init>(r3)
            throw r2
    }

    public static int getAbsoluteOffsetOr0(com.android.dx.dex.file.OffsettedItem r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0.getAbsoluteOffset()
            return r0
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final int compareTo2(com.android.dx.dex.file.OffsettedItem r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 0
            return r3
        L4:
            com.android.dx.dex.file.ItemType r0 = r2.itemType()
            com.android.dx.dex.file.ItemType r1 = r3.itemType()
            if (r0 == r1) goto L13
            int r3 = r0.compareTo(r1)
            return r3
        L13:
            int r3 = r2.compareTo0(r3)
            return r3
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dx.dex.file.OffsettedItem r1) {
            r0 = this;
            com.android.dx.dex.file.OffsettedItem r1 = (com.android.dx.dex.file.OffsettedItem) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public int compareTo0(com.android.dx.dex.file.OffsettedItem r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "unsupported"
            r2.<init>(r0)
            throw r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            com.android.dx.dex.file.OffsettedItem r5 = (com.android.dx.dex.file.OffsettedItem) r5
            com.android.dx.dex.file.ItemType r1 = r4.itemType()
            com.android.dx.dex.file.ItemType r2 = r5.itemType()
            r3 = 0
            if (r1 == r2) goto L12
            return r3
        L12:
            int r5 = r4.compareTo0(r5)
            if (r5 != 0) goto L19
            goto L1a
        L19:
            r0 = r3
        L1a:
            return r0
    }

    public final int getAbsoluteOffset() {
            r2 = this;
            int r0 = r2.offset
            if (r0 < 0) goto Lb
            com.android.dx.dex.file.Section r1 = r2.addedTo
            int r0 = r1.getAbsoluteOffset(r0)
            return r0
        Lb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "offset not yet known"
            r0.<init>(r1)
            throw r0
    }

    public final int getAlignment() {
            r1 = this;
            int r0 = r1.alignment
            return r0
    }

    public final int getRelativeOffset() {
            r2 = this;
            int r0 = r2.offset
            if (r0 < 0) goto L5
            return r0
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "offset not yet known"
            r0.<init>(r1)
            throw r0
    }

    public final java.lang.String offsetString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            int r1 = r2.getAbsoluteOffset()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final int place(com.android.dx.dex.file.Section r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L27
            if (r3 < 0) goto L1f
            com.android.dx.dex.file.Section r0 = r1.addedTo
            if (r0 != 0) goto L17
            int r0 = r1.alignment
            int r0 = r0 + (-1)
            int r3 = r3 + r0
            int r0 = ~r0
            r3 = r3 & r0
            r1.addedTo = r2
            r1.offset = r3
            r1.place0(r2, r3)
            return r3
        L17:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "already written"
            r2.<init>(r3)
            throw r2
        L1f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "offset < 0"
            r2.<init>(r3)
            throw r2
        L27:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "addedTo == null"
            r2.<init>(r3)
            throw r2
    }

    public void place0(com.android.dx.dex.file.Section r1, int r2) {
            r0 = this;
            return
    }

    public final void setWriteSize(int r2) {
            r1 = this;
            if (r2 < 0) goto L11
            int r0 = r1.writeSize
            if (r0 >= 0) goto L9
            r1.writeSize = r2
            return
        L9:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "writeSize already set"
            r2.<init>(r0)
            throw r2
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "writeSize < 0"
            r2.<init>(r0)
            throw r2
    }

    public abstract java.lang.String toHuman();

    @Override // com.android.dx.dex.file.Item
    public final int writeSize() {
            r2 = this;
            int r0 = r2.writeSize
            if (r0 < 0) goto L5
            return r0
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "writeSize is unknown"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.android.dx.dex.file.Item
    public final void writeTo(com.android.dx.dex.file.DexFile r2, com.android.dx.util.AnnotatedOutput r3) {
            r1 = this;
            int r0 = r1.alignment
            r3.alignTo(r0)
            int r0 = r1.writeSize     // Catch: java.lang.RuntimeException -> L14
            if (r0 < 0) goto L16
            int r0 = r1.getAbsoluteOffset()     // Catch: java.lang.RuntimeException -> L14
            r3.assertCursor(r0)     // Catch: java.lang.RuntimeException -> L14
            r1.writeTo0(r2, r3)
            return
        L14:
            r2 = move-exception
            goto L1e
        L16:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException     // Catch: java.lang.RuntimeException -> L14
            java.lang.String r3 = "writeSize is unknown"
            r2.<init>(r3)     // Catch: java.lang.RuntimeException -> L14
            throw r2     // Catch: java.lang.RuntimeException -> L14
        L1e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "...while writing "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.android.dex.util.ExceptionWithContext r2 = com.android.dex.util.ExceptionWithContext.withContext(r2, r3)
            throw r2
    }

    public abstract void writeTo0(com.android.dx.dex.file.DexFile r1, com.android.dx.util.AnnotatedOutput r2);
}
