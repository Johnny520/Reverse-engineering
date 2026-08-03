package com.android.dx.util;

/* JADX INFO: loaded from: classes.dex */
public final class TwoColumnOutput {
    private final java.lang.StringBuffer leftBuf;
    private final com.android.dx.util.IndentingWriter leftColumn;
    private final int leftWidth;
    private final java.io.Writer out;
    private final java.lang.StringBuffer rightBuf;
    private final com.android.dx.util.IndentingWriter rightColumn;

    public TwoColumnOutput(java.io.OutputStream r2, int r3, int r4, java.lang.String r5) {
            r1 = this;
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r2)
            r1.<init>(r0, r3, r4, r5)
            return
    }

    public TwoColumnOutput(java.io.Writer r4, int r5, int r6, java.lang.String r7) {
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L4f
            r0 = 1
            if (r5 < r0) goto L47
            if (r6 < r0) goto L3f
            if (r7 == 0) goto L37
            java.io.StringWriter r0 = new java.io.StringWriter
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.<init>(r1)
            java.io.StringWriter r2 = new java.io.StringWriter
            r2.<init>(r1)
            r3.out = r4
            r3.leftWidth = r5
            java.lang.StringBuffer r4 = r0.getBuffer()
            r3.leftBuf = r4
            java.lang.StringBuffer r4 = r2.getBuffer()
            r3.rightBuf = r4
            com.android.dx.util.IndentingWriter r4 = new com.android.dx.util.IndentingWriter
            r4.<init>(r0, r5)
            r3.leftColumn = r4
            com.android.dx.util.IndentingWriter r4 = new com.android.dx.util.IndentingWriter
            r4.<init>(r2, r6, r7)
            r3.rightColumn = r4
            return
        L37:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "spacer == null"
            r4.<init>(r5)
            throw r4
        L3f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "rightWidth < 1"
            r4.<init>(r5)
            throw r4
        L47:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "leftWidth < 1"
            r4.<init>(r5)
            throw r4
        L4f:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "out == null"
            r4.<init>(r5)
            throw r4
    }

    private static void appendNewlineIfNecessary(java.lang.StringBuffer r1, java.io.Writer r2) throws java.io.IOException {
            int r0 = r1.length()
            if (r0 == 0) goto L13
            int r0 = r0 + (-1)
            char r1 = r1.charAt(r0)
            r0 = 10
            if (r1 == r0) goto L13
            r2.write(r0)
        L13:
            return
    }

    private void flushLeft() throws java.io.IOException {
            r2 = this;
            java.lang.StringBuffer r0 = r2.leftBuf
            com.android.dx.util.IndentingWriter r1 = r2.leftColumn
            appendNewlineIfNecessary(r0, r1)
        L7:
            java.lang.StringBuffer r0 = r2.leftBuf
            int r0 = r0.length()
            if (r0 == 0) goto L1a
            com.android.dx.util.IndentingWriter r0 = r2.rightColumn
            r1 = 10
            r0.write(r1)
            r2.outputFullLines()
            goto L7
        L1a:
            return
    }

    private void flushRight() throws java.io.IOException {
            r2 = this;
            java.lang.StringBuffer r0 = r2.rightBuf
            com.android.dx.util.IndentingWriter r1 = r2.rightColumn
            appendNewlineIfNecessary(r0, r1)
        L7:
            java.lang.StringBuffer r0 = r2.rightBuf
            int r0 = r0.length()
            if (r0 == 0) goto L1a
            com.android.dx.util.IndentingWriter r0 = r2.leftColumn
            r1 = 10
            r0.write(r1)
            r2.outputFullLines()
            goto L7
        L1a:
            return
    }

    private void outputFullLines() throws java.io.IOException {
            r5 = this;
        L0:
            java.lang.StringBuffer r0 = r5.leftBuf
            java.lang.String r1 = "\n"
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto Lb
            return
        Lb:
            java.lang.StringBuffer r2 = r5.rightBuf
            int r1 = r2.indexOf(r1)
            if (r1 >= 0) goto L14
            return
        L14:
            r2 = 0
            if (r0 == 0) goto L22
            java.io.Writer r3 = r5.out
            java.lang.StringBuffer r4 = r5.leftBuf
            java.lang.String r4 = r4.substring(r2, r0)
            r3.write(r4)
        L22:
            if (r1 == 0) goto L37
            java.io.Writer r3 = r5.out
            int r4 = r5.leftWidth
            int r4 = r4 - r0
            writeSpaces(r3, r4)
            java.io.Writer r3 = r5.out
            java.lang.StringBuffer r4 = r5.rightBuf
            java.lang.String r4 = r4.substring(r2, r1)
            r3.write(r4)
        L37:
            java.io.Writer r3 = r5.out
            r4 = 10
            r3.write(r4)
            java.lang.StringBuffer r3 = r5.leftBuf
            int r0 = r0 + 1
            r3.delete(r2, r0)
            java.lang.StringBuffer r0 = r5.rightBuf
            int r1 = r1 + 1
            r0.delete(r2, r1)
            goto L0
    }

    public static java.lang.String toString(java.lang.String r3, int r4, java.lang.String r5, java.lang.String r6, int r7) {
            int r0 = r3.length()
            int r1 = r6.length()
            java.io.StringWriter r2 = new java.io.StringWriter
            int r0 = r0 + r1
            int r0 = r0 * 3
            r2.<init>(r0)
            com.android.dx.util.TwoColumnOutput r0 = new com.android.dx.util.TwoColumnOutput
            r0.<init>(r2, r4, r7, r5)
            java.io.Writer r4 = r0.getLeft()     // Catch: java.io.IOException -> L2b
            r4.write(r3)     // Catch: java.io.IOException -> L2b
            java.io.Writer r3 = r0.getRight()     // Catch: java.io.IOException -> L2b
            r3.write(r6)     // Catch: java.io.IOException -> L2b
            r0.flush()
            java.lang.String r3 = r2.toString()
            return r3
        L2b:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "shouldn't happen"
            r4.<init>(r5, r3)
            throw r4
    }

    private static void writeSpaces(java.io.Writer r1, int r2) throws java.io.IOException {
        L0:
            if (r2 <= 0) goto La
            r0 = 32
            r1.write(r0)
            int r2 = r2 + (-1)
            goto L0
        La:
            return
    }

    public void flush() {
            r2 = this;
            java.lang.StringBuffer r0 = r2.leftBuf     // Catch: java.io.IOException -> L18
            com.android.dx.util.IndentingWriter r1 = r2.leftColumn     // Catch: java.io.IOException -> L18
            appendNewlineIfNecessary(r0, r1)     // Catch: java.io.IOException -> L18
            java.lang.StringBuffer r0 = r2.rightBuf     // Catch: java.io.IOException -> L18
            com.android.dx.util.IndentingWriter r1 = r2.rightColumn     // Catch: java.io.IOException -> L18
            appendNewlineIfNecessary(r0, r1)     // Catch: java.io.IOException -> L18
            r2.outputFullLines()     // Catch: java.io.IOException -> L18
            r2.flushLeft()     // Catch: java.io.IOException -> L18
            r2.flushRight()     // Catch: java.io.IOException -> L18
            return
        L18:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public java.io.Writer getLeft() {
            r1 = this;
            com.android.dx.util.IndentingWriter r0 = r1.leftColumn
            return r0
    }

    public java.io.Writer getRight() {
            r1 = this;
            com.android.dx.util.IndentingWriter r0 = r1.rightColumn
            return r0
    }
}
