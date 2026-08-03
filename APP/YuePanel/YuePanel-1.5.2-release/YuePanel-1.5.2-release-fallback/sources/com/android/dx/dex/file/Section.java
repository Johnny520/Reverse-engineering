package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public abstract class Section {
    private final int alignment;
    private final com.android.dx.dex.file.DexFile file;
    private int fileOffset;
    private final java.lang.String name;
    private boolean prepared;

    public Section(java.lang.String r1, com.android.dx.dex.file.DexFile r2, int r3) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto L15
            validateAlignment(r3)
            r0.name = r1
            r0.file = r2
            r0.alignment = r3
            r1 = -1
            r0.fileOffset = r1
            r1 = 0
            r0.prepared = r1
            return
        L15:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "file == null"
            r1.<init>(r2)
            throw r1
    }

    public static void validateAlignment(int r1) {
            if (r1 <= 0) goto L8
            int r0 = r1 + (-1)
            r1 = r1 & r0
            if (r1 != 0) goto L8
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid alignment"
            r1.<init>(r0)
            throw r1
    }

    public final void align(com.android.dx.util.AnnotatedOutput r2) {
            r1 = this;
            int r0 = r1.alignment
            r2.alignTo(r0)
            return
    }

    public abstract int getAbsoluteItemOffset(com.android.dx.dex.file.Item r1);

    public final int getAbsoluteOffset(int r2) {
            r1 = this;
            if (r2 < 0) goto L10
            int r0 = r1.fileOffset
            if (r0 < 0) goto L8
            int r0 = r0 + r2
            return r0
        L8:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "fileOffset not yet set"
            r2.<init>(r0)
            throw r2
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "relative < 0"
            r2.<init>(r0)
            throw r2
    }

    public final int getAlignment() {
            r1 = this;
            int r0 = r1.alignment
            return r0
    }

    public final com.android.dx.dex.file.DexFile getFile() {
            r1 = this;
            com.android.dx.dex.file.DexFile r0 = r1.file
            return r0
    }

    public final int getFileOffset() {
            r2 = this;
            int r0 = r2.fileOffset
            if (r0 < 0) goto L5
            return r0
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "fileOffset not set"
            r0.<init>(r1)
            throw r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public abstract java.util.Collection<? extends com.android.dx.dex.file.Item> items();

    public final void prepare() {
            r1 = this;
            r1.throwIfPrepared()
            r1.prepare0()
            r0 = 1
            r1.prepared = r0
            return
    }

    public abstract void prepare0();

    public final int setFileOffset(int r2) {
            r1 = this;
            if (r2 < 0) goto L18
            int r0 = r1.fileOffset
            if (r0 >= 0) goto L10
            int r0 = r1.alignment
            int r0 = r0 + (-1)
            int r2 = r2 + r0
            int r0 = ~r0
            r2 = r2 & r0
            r1.fileOffset = r2
            return r2
        L10:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "fileOffset already set"
            r2.<init>(r0)
            throw r2
        L18:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "fileOffset < 0"
            r2.<init>(r0)
            throw r2
    }

    public final void throwIfNotPrepared() {
            r2 = this;
            boolean r0 = r2.prepared
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "not prepared"
            r0.<init>(r1)
            throw r0
    }

    public final void throwIfPrepared() {
            r2 = this;
            boolean r0 = r2.prepared
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "already prepared"
            r0.<init>(r1)
            throw r0
    }

    public abstract int writeSize();

    public final void writeTo(com.android.dx.util.AnnotatedOutput r5) {
            r4 = this;
            r4.throwIfNotPrepared()
            r4.align(r5)
            int r0 = r5.getCursor()
            int r1 = r4.fileOffset
            if (r1 >= 0) goto L11
            r4.fileOffset = r0
            goto L13
        L11:
            if (r1 != r0) goto L43
        L13:
            boolean r1 = r5.annotates()
            if (r1 == 0) goto L3f
            java.lang.String r1 = r4.name
            java.lang.String r2 = "\n"
            r3 = 0
            if (r1 == 0) goto L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = r4.name
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.annotate(r3, r0)
            goto L3f
        L3a:
            if (r0 == 0) goto L3f
            r5.annotate(r3, r2)
        L3f:
            r4.writeTo0(r5)
            return
        L43:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "alignment mismatch: for "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", at "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", but expected "
            r1.append(r0)
            int r0 = r4.fileOffset
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
    }

    public abstract void writeTo0(com.android.dx.util.AnnotatedOutput r1);
}
