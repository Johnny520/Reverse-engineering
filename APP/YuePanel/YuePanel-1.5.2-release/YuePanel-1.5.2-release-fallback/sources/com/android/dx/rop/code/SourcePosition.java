package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class SourcePosition {
    public static final com.android.dx.rop.code.SourcePosition NO_INFO = null;
    private final int address;
    private final int line;
    private final com.android.dx.rop.cst.CstString sourceFile;

    static {
            com.android.dx.rop.code.SourcePosition r0 = new com.android.dx.rop.code.SourcePosition
            r1 = 0
            r2 = -1
            r0.<init>(r1, r2, r2)
            com.android.dx.rop.code.SourcePosition.NO_INFO = r0
            return
    }

    public SourcePosition(com.android.dx.rop.cst.CstString r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            if (r3 < r0) goto L17
            if (r4 < r0) goto Lf
            r1.sourceFile = r2
            r1.address = r3
            r1.line = r4
            return
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "line < -1"
            r2.<init>(r3)
            throw r2
        L17:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "address < -1"
            r2.<init>(r3)
            throw r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.android.dx.rop.code.SourcePosition
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r4 != r5) goto La
            return r0
        La:
            com.android.dx.rop.code.SourcePosition r5 = (com.android.dx.rop.code.SourcePosition) r5
            int r2 = r4.address
            int r3 = r5.address
            if (r2 != r3) goto L19
            boolean r5 = r4.sameLineAndFile(r5)
            if (r5 == 0) goto L19
            r1 = r0
        L19:
            return r1
    }

    public int getAddress() {
            r1 = this;
            int r0 = r1.address
            return r0
    }

    public int getLine() {
            r1 = this;
            int r0 = r1.line
            return r0
    }

    public com.android.dx.rop.cst.CstString getSourceFile() {
            r1 = this;
            com.android.dx.rop.cst.CstString r0 = r1.sourceFile
            return r0
    }

    public int hashCode() {
            r2 = this;
            com.android.dx.rop.cst.CstString r0 = r2.sourceFile
            int r0 = r0.hashCode()
            int r1 = r2.address
            int r0 = r0 + r1
            int r1 = r2.line
            int r0 = r0 + r1
            return r0
    }

    public boolean sameLine(com.android.dx.rop.code.SourcePosition r2) {
            r1 = this;
            int r0 = r1.line
            int r2 = r2.line
            if (r0 != r2) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            return r2
    }

    public boolean sameLineAndFile(com.android.dx.rop.code.SourcePosition r3) {
            r2 = this;
            int r0 = r2.line
            int r1 = r3.line
            if (r0 != r1) goto L16
            com.android.dx.rop.cst.CstString r0 = r2.sourceFile
            com.android.dx.rop.cst.CstString r3 = r3.sourceFile
            if (r0 == r3) goto L14
            if (r0 == 0) goto L16
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L16
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 50
            r0.<init>(r1)
            com.android.dx.rop.cst.CstString r1 = r2.sourceFile
            if (r1 == 0) goto L17
            java.lang.String r1 = r1.toHuman()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
        L17:
            int r1 = r2.line
            if (r1 < 0) goto L1e
            r0.append(r1)
        L1e:
            r1 = 64
            r0.append(r1)
            int r1 = r2.address
            if (r1 >= 0) goto L2d
            java.lang.String r1 = "????"
            r0.append(r1)
            goto L34
        L2d:
            java.lang.String r1 = com.android.dx.util.Hex.u2(r1)
            r0.append(r1)
        L34:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
