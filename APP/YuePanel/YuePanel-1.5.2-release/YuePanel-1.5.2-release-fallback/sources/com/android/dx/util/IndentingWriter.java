package com.android.dx.util;

/* JADX INFO: loaded from: classes.dex */
public final class IndentingWriter extends java.io.FilterWriter {
    private boolean collectingIndent;
    private int column;
    private int indent;
    private final int maxIndent;
    private final java.lang.String prefix;
    private final int width;

    public IndentingWriter(java.io.Writer r2, int r3) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r2, r3, r0)
            return
    }

    public IndentingWriter(java.io.Writer r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1)
            if (r1 == 0) goto L33
            if (r2 < 0) goto L2b
            if (r3 == 0) goto L23
            if (r2 == 0) goto Ld
            r1 = r2
            goto L10
        Ld:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L10:
            r0.width = r1
            int r1 = r2 >> 1
            r0.maxIndent = r1
            int r1 = r3.length()
            if (r1 != 0) goto L1d
            r3 = 0
        L1d:
            r0.prefix = r3
            r0.bol()
            return
        L23:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "prefix == null"
            r1.<init>(r2)
            throw r1
        L2b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "width < 0"
            r1.<init>(r2)
            throw r1
        L33:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "out == null"
            r1.<init>(r2)
            throw r1
    }

    private void bol() {
            r2 = this;
            r0 = 0
            r2.column = r0
            int r1 = r2.maxIndent
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = r0
        La:
            r2.collectingIndent = r1
            r2.indent = r0
            return
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int r7) throws java.io.IOException {
            r6 = this;
            java.lang.Object r0 = r6.lock
            monitor-enter(r0)
            boolean r1 = r6.collectingIndent     // Catch: java.lang.Throwable -> L1b
            r2 = 32
            r3 = 0
            if (r1 == 0) goto L1f
            if (r7 != r2) goto L1d
            int r1 = r6.indent     // Catch: java.lang.Throwable -> L1b
            int r1 = r1 + 1
            r6.indent = r1     // Catch: java.lang.Throwable -> L1b
            int r4 = r6.maxIndent     // Catch: java.lang.Throwable -> L1b
            if (r1 < r4) goto L1f
            r6.indent = r4     // Catch: java.lang.Throwable -> L1b
            r6.collectingIndent = r3     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r7 = move-exception
            goto L62
        L1d:
            r6.collectingIndent = r3     // Catch: java.lang.Throwable -> L1b
        L1f:
            int r1 = r6.column     // Catch: java.lang.Throwable -> L1b
            int r4 = r6.width     // Catch: java.lang.Throwable -> L1b
            r5 = 10
            if (r1 != r4) goto L30
            if (r7 == r5) goto L30
            java.io.Writer r1 = r6.out     // Catch: java.lang.Throwable -> L1b
            r1.write(r5)     // Catch: java.lang.Throwable -> L1b
            r6.column = r3     // Catch: java.lang.Throwable -> L1b
        L30:
            int r1 = r6.column     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L4f
            java.lang.String r1 = r6.prefix     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L3d
            java.io.Writer r4 = r6.out     // Catch: java.lang.Throwable -> L1b
            r4.write(r1)     // Catch: java.lang.Throwable -> L1b
        L3d:
            boolean r1 = r6.collectingIndent     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L4f
        L41:
            int r1 = r6.indent     // Catch: java.lang.Throwable -> L1b
            if (r3 >= r1) goto L4d
            java.io.Writer r1 = r6.out     // Catch: java.lang.Throwable -> L1b
            r1.write(r2)     // Catch: java.lang.Throwable -> L1b
            int r3 = r3 + 1
            goto L41
        L4d:
            r6.column = r1     // Catch: java.lang.Throwable -> L1b
        L4f:
            java.io.Writer r1 = r6.out     // Catch: java.lang.Throwable -> L1b
            r1.write(r7)     // Catch: java.lang.Throwable -> L1b
            if (r7 != r5) goto L5a
            r6.bol()     // Catch: java.lang.Throwable -> L1b
            goto L60
        L5a:
            int r7 = r6.column     // Catch: java.lang.Throwable -> L1b
            int r7 = r7 + 1
            r6.column = r7     // Catch: java.lang.Throwable -> L1b
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r7
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(java.lang.String r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
        L3:
            if (r5 <= 0) goto L13
            char r1 = r3.charAt(r4)     // Catch: java.lang.Throwable -> L11
            r2.write(r1)     // Catch: java.lang.Throwable -> L11
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L3
        L11:
            r3 = move-exception
            goto L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
        L3:
            if (r5 <= 0) goto L11
            char r1 = r3[r4]     // Catch: java.lang.Throwable -> Lf
            r2.write(r1)     // Catch: java.lang.Throwable -> Lf
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L3
        Lf:
            r3 = move-exception
            goto L13
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }
}
