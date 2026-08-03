package com.android.dx.command.dump;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseDumper implements com.android.dx.cf.iface.ParseObserver {
    protected com.android.dx.command.dump.Args args;
    private final byte[] bytes;
    protected final com.android.dx.dex.DexOptions dexOptions;
    private final java.lang.String filePath;
    private final int hexCols;
    private int indent;
    private final java.io.PrintStream out;
    private final boolean rawBytes;
    private int readBytes;
    private java.lang.String separator;
    private final boolean strictParse;
    private final int width;

    public BaseDumper(byte[] r1, java.io.PrintStream r2, java.lang.String r3, com.android.dx.command.dump.Args r4) {
            r0 = this;
            r0.<init>()
            r0.bytes = r1
            boolean r1 = r4.rawBytes
            r0.rawBytes = r1
            r0.out = r2
            int r2 = r4.width
            if (r2 > 0) goto L11
            r2 = 79
        L11:
            r0.width = r2
            r0.filePath = r3
            boolean r3 = r4.strictParse
            r0.strictParse = r3
            r3 = 0
            r0.indent = r3
            if (r1 == 0) goto L21
            java.lang.String r1 = "|"
            goto L23
        L21:
            java.lang.String r1 = ""
        L23:
            r0.separator = r1
            r0.readBytes = r3
            r0.args = r4
            com.android.dx.dex.DexOptions r1 = new com.android.dx.dex.DexOptions
            r1.<init>()
            r0.dexOptions = r1
            int r2 = r2 + (-5)
            int r2 = r2 / 15
            int r2 = r2 + 1
            r1 = r2 & (-2)
            r2 = 6
            if (r1 >= r2) goto L3d
        L3b:
            r1 = r2
            goto L42
        L3d:
            r2 = 10
            if (r1 <= r2) goto L42
            goto L3b
        L42:
            r0.hexCols = r1
            return
    }

    public static int computeParamWidth(com.android.dx.cf.code.ConcreteMethod r0, boolean r1) {
            com.android.dx.rop.type.Prototype r0 = r0.getEffectiveDescriptor()
            com.android.dx.rop.type.StdTypeList r0 = r0.getParameterTypes()
            int r0 = r0.getWordCount()
            return r0
    }

    @Override // com.android.dx.cf.iface.ParseObserver
    public void changeIndent(int r3) {
            r2 = this;
            int r0 = r2.indent
            int r0 = r0 + r3
            r2.indent = r0
            boolean r3 = r2.rawBytes
            if (r3 == 0) goto Lc
            java.lang.String r3 = "|"
            goto Le
        Lc:
            java.lang.String r3 = ""
        Le:
            r2.separator = r3
            r3 = 0
        L11:
            int r0 = r2.indent
            if (r3 >= r0) goto L2d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.separator
            r0.append(r1)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.separator = r0
            int r3 = r3 + 1
            goto L11
        L2d:
            return
    }

    @Override // com.android.dx.cf.iface.ParseObserver
    public void endParsingMember(com.android.dx.util.ByteArray r1, int r2, java.lang.String r3, java.lang.String r4, com.android.dx.cf.iface.Member r5) {
            r0 = this;
            return
    }

    public final byte[] getBytes() {
            r1 = this;
            byte[] r0 = r1.bytes
            return r0
    }

    public final java.lang.String getFilePath() {
            r1 = this;
            java.lang.String r0 = r1.filePath
            return r0
    }

    public final boolean getRawBytes() {
            r1 = this;
            boolean r0 = r1.rawBytes
            return r0
    }

    public final int getReadBytes() {
            r1 = this;
            int r0 = r1.readBytes
            return r0
    }

    public final boolean getStrictParse() {
            r1 = this;
            boolean r0 = r1.strictParse
            return r0
    }

    public final int getWidth1() {
            r2 = this;
            boolean r0 = r2.rawBytes
            if (r0 == 0) goto Le
            int r0 = r2.hexCols
            int r1 = r0 * 2
            int r1 = r1 + 5
            int r0 = r0 / 2
            int r1 = r1 + r0
            return r1
        Le:
            r0 = 0
            return r0
    }

    public final int getWidth2() {
            r2 = this;
            boolean r0 = r2.rawBytes
            if (r0 == 0) goto Lb
            int r0 = r2.getWidth1()
            int r0 = r0 + 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r1 = r2.width
            int r1 = r1 - r0
            int r0 = r2.indent
            int r0 = r0 * 2
            int r1 = r1 - r0
            return r1
    }

    public final java.lang.String hexDump(int r7, int r8) {
            r6 = this;
            byte[] r0 = r6.bytes
            int r4 = r6.hexCols
            r5 = 4
            r1 = r7
            r2 = r8
            r3 = r7
            java.lang.String r7 = com.android.dx.util.Hex.dump(r0, r1, r2, r3, r4, r5)
            return r7
    }

    @Override // com.android.dx.cf.iface.ParseObserver
    public void parsed(com.android.dx.util.ByteArray r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            int r1 = r1.underlyingOffset(r2)
            boolean r2 = r0.getRawBytes()
            if (r2 == 0) goto Lf
            java.lang.String r1 = r0.hexDump(r1, r3)
            goto L11
        Lf:
            java.lang.String r1 = ""
        L11:
            java.lang.String r1 = r0.twoColumns(r1, r4)
            r0.print(r1)
            int r1 = r0.readBytes
            int r1 = r1 + r3
            r0.readBytes = r1
            return
    }

    public final void print(java.lang.String r2) {
            r1 = this;
            java.io.PrintStream r0 = r1.out
            r0.print(r2)
            return
    }

    public final void println(java.lang.String r2) {
            r1 = this;
            java.io.PrintStream r0 = r1.out
            r0.println(r2)
            return
    }

    @Override // com.android.dx.cf.iface.ParseObserver
    public void startParsingMember(com.android.dx.util.ByteArray r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            return
    }

    public final java.lang.String twoColumns(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            int r0 = r4.getWidth1()
            int r1 = r4.getWidth2()
            if (r0 != 0) goto L39
            int r5 = r6.length()     // Catch: java.io.IOException -> L2c
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.io.IOException -> L2c
            int r2 = r5 * 2
            r0.<init>(r2)     // Catch: java.io.IOException -> L2c
            com.android.dx.util.IndentingWriter r2 = new com.android.dx.util.IndentingWriter     // Catch: java.io.IOException -> L2c
            java.lang.String r3 = r4.separator     // Catch: java.io.IOException -> L2c
            r2.<init>(r0, r1, r3)     // Catch: java.io.IOException -> L2c
            r2.write(r6)     // Catch: java.io.IOException -> L2c
            r1 = 10
            if (r5 == 0) goto L2e
            int r5 = r5 + (-1)
            char r5 = r6.charAt(r5)     // Catch: java.io.IOException -> L2c
            if (r5 == r1) goto L31
            goto L2e
        L2c:
            r5 = move-exception
            goto L40
        L2e:
            r2.write(r1)     // Catch: java.io.IOException -> L2c
        L31:
            r2.flush()     // Catch: java.io.IOException -> L2c
            java.lang.String r5 = r0.toString()     // Catch: java.io.IOException -> L2c
            return r5
        L39:
            java.lang.String r2 = r4.separator     // Catch: java.io.IOException -> L2c
            java.lang.String r5 = com.android.dx.util.TwoColumnOutput.toString(r5, r0, r2, r6, r1)     // Catch: java.io.IOException -> L2c
            return r5
        L40:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
    }
}
