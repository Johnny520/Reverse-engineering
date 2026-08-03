package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JavaCharStream extends bsh.AbstractCharStream {
    protected static final int NEXTCHAR_BUF_SIZE = 4096;
    private java.io.Reader m_aIS;
    private char[] m_aNextCharBuf;
    private int nextCharInd;

    public JavaCharStream(java.io.InputStream r7, java.nio.charset.Charset r8) {
            r6 = this;
            r4 = 1
            r5 = 4096(0x1000, float:5.74E-42)
            r3 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public JavaCharStream(java.io.InputStream r7, java.nio.charset.Charset r8, int r9, int r10) {
            r6 = this;
            r5 = 4096(0x1000, float:5.74E-42)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public JavaCharStream(java.io.InputStream r2, java.nio.charset.Charset r3, int r4, int r5, int r6) {
            r1 = this;
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r2, r3)
            r1.<init>(r0, r4, r5, r6)
            return
    }

    public JavaCharStream(java.io.Reader r3) {
            r2 = this;
            r0 = 1
            r1 = 4096(0x1000, float:5.74E-42)
            r2.<init>(r3, r0, r0, r1)
            return
    }

    public JavaCharStream(java.io.Reader r2, int r3, int r4) {
            r1 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public JavaCharStream(java.io.Reader r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r2 = -1
            r0.nextCharInd = r2
            r2 = 4096(0x1000, float:5.74E-42)
            char[] r2 = new char[r2]
            r0.m_aNextCharBuf = r2
            r0.m_aIS = r1
            return
    }

    private char readByte() {
            r2 = this;
            int r0 = r2.nextCharInd
            int r0 = r0 + 1
            r2.nextCharInd = r0
            int r1 = r2.maxNextCharInd
            if (r0 < r1) goto Ld
            r2.fillBuff()
        Ld:
            char[] r0 = r2.m_aNextCharBuf
            int r1 = r2.nextCharInd
            char r0 = r0[r1]
            return r0
    }

    @Override // bsh.AbstractCharStream, bsh.CharStream
    public char beginToken() {
            r3 = this;
            int r0 = r3.inBuf
            r1 = 0
            if (r0 <= 0) goto L1e
            int r0 = r0 + (-1)
            r3.inBuf = r0
            int r0 = r3.bufpos
            int r0 = r0 + 1
            r3.bufpos = r0
            int r2 = r3.bufsize
            if (r0 != r2) goto L15
            r3.bufpos = r1
        L15:
            int r0 = r3.bufpos
            r3.tokenBegin = r0
            char[] r1 = r3.buffer
            char r0 = r1[r0]
            return r0
        L1e:
            r3.tokenBegin = r1
            r0 = -1
            r3.bufpos = r0
            char r0 = r3.readChar()
            return r0
    }

    @Override // bsh.AbstractCharStream, bsh.CharStream
    public void done() {
            r1 = this;
            r0 = 0
            r1.m_aNextCharBuf = r0
            super.done()
            return
    }

    @Override // bsh.AbstractCharStream
    public void fillBuff() {
            r4 = this;
            int r0 = r4.maxNextCharInd
            r1 = 4096(0x1000, float:5.74E-42)
            r2 = 0
            if (r0 != r1) goto Lb
            r4.maxNextCharInd = r2
            r4.nextCharInd = r2
        Lb:
            char[] r0 = r4.m_aNextCharBuf     // Catch: java.io.IOException -> L1e
            int r1 = r4.maxNextCharInd     // Catch: java.io.IOException -> L1e
            int r3 = 4096 - r1
            int r0 = r4.streamRead(r0, r1, r3)     // Catch: java.io.IOException -> L1e
            r1 = -1
            if (r0 == r1) goto L20
            int r1 = r4.maxNextCharInd     // Catch: java.io.IOException -> L1e
            int r1 = r1 + r0
            r4.maxNextCharInd = r1     // Catch: java.io.IOException -> L1e
            return
        L1e:
            r0 = move-exception
            goto L29
        L20:
            r4.streamClose()     // Catch: java.io.IOException -> L1e
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.IOException -> L1e
            r0.<init>()     // Catch: java.io.IOException -> L1e
            throw r0     // Catch: java.io.IOException -> L1e
        L29:
            int r1 = r4.bufpos
            if (r1 == 0) goto L35
            int r1 = r1 + (-1)
            r4.bufpos = r1
            r4.backup(r2)
            goto L40
        L35:
            int r1 = r4.getLine()
            int r2 = r4.getColumn()
            r4.internalSetBufLineColumn(r1, r2)
        L40:
            throw r0
    }

    public void reInit(java.io.InputStream r7, java.nio.charset.Charset r8) {
            r6 = this;
            r4 = 1
            r5 = 4096(0x1000, float:5.74E-42)
            r3 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r0.reInit(r1, r2, r3, r4, r5)
            return
    }

    public void reInit(java.io.InputStream r7, java.nio.charset.Charset r8, int r9, int r10) {
            r6 = this;
            r5 = 4096(0x1000, float:5.74E-42)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.reInit(r1, r2, r3, r4, r5)
            return
    }

    public void reInit(java.io.InputStream r2, java.nio.charset.Charset r3, int r4, int r5, int r6) {
            r1 = this;
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r2, r3)
            r1.reInit(r0, r4, r5, r6)
            return
    }

    public void reInit(java.io.Reader r3) {
            r2 = this;
            r0 = 1
            r1 = 4096(0x1000, float:5.74E-42)
            r2.reInit(r3, r0, r0, r1)
            return
    }

    public void reInit(java.io.Reader r2, int r3, int r4) {
            r1 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            r1.reInit(r2, r3, r4, r0)
            return
    }

    public void reInit(java.io.Reader r2, int r3, int r4, int r5) {
            r1 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            char[] r0 = new char[r0]
            r1.m_aNextCharBuf = r0
            r0 = -1
            r1.nextCharInd = r0
            r1.m_aIS = r2
            r1.reInit(r3, r4, r5)
            return
    }

    @Override // bsh.AbstractCharStream, bsh.CharStream
    public char readChar() {
            r10 = this;
            int r0 = r10.inBuf
            r1 = 1
            if (r0 <= 0) goto L1b
            int r0 = r0 - r1
            r10.inBuf = r0
            int r0 = r10.bufpos
            int r0 = r0 + r1
            r10.bufpos = r0
            int r1 = r10.bufsize
            if (r0 != r1) goto L14
            r0 = 0
            r10.bufpos = r0
        L14:
            char[] r0 = r10.buffer
            int r1 = r10.bufpos
            char r0 = r0[r1]
            return r0
        L1b:
            int r0 = r10.bufpos
            int r0 = r0 + r1
            r10.bufpos = r0
            int r2 = r10.available
            if (r0 != r2) goto L27
            r10.internalAdjustBuffSize()
        L27:
            char r0 = r10.readByte()
            char[] r2 = r10.buffer
            int r3 = r10.bufpos
            r2[r3] = r0
            r2 = 92
            if (r0 == r2) goto L3f
            boolean r1 = r10.isTrackLineColumn()
            if (r1 == 0) goto L3e
            r10.internalUpdateLineColumn(r0)
        L3e:
            return r0
        L3f:
            boolean r3 = r10.isTrackLineColumn()
            if (r3 == 0) goto L48
            r10.internalUpdateLineColumn(r0)
        L48:
            r0 = r1
        L49:
            int r3 = r10.bufpos
            int r3 = r3 + r1
            r10.bufpos = r3
            int r4 = r10.available
            if (r3 != r4) goto L55
            r10.internalAdjustBuffSize()
        L55:
            char r3 = r10.readByte()     // Catch: java.io.IOException -> L10e
            char[] r4 = r10.buffer     // Catch: java.io.IOException -> L10e
            int r5 = r10.bufpos     // Catch: java.io.IOException -> L10e
            r4[r5] = r3     // Catch: java.io.IOException -> L10e
            if (r3 == r2) goto L101
            boolean r4 = r10.isTrackLineColumn()     // Catch: java.io.IOException -> L10e
            if (r4 == 0) goto L6a
            r10.internalUpdateLineColumn(r3)     // Catch: java.io.IOException -> L10e
        L6a:
            r4 = 117(0x75, float:1.64E-43)
            if (r3 != r4) goto Lfd
            r3 = r0 & 1
            if (r3 != r1) goto Lfd
            int r3 = r10.bufpos     // Catch: java.io.IOException -> L10e
            int r3 = r3 - r1
            r10.bufpos = r3     // Catch: java.io.IOException -> L10e
            if (r3 >= 0) goto L7e
            int r3 = r10.bufsize     // Catch: java.io.IOException -> L10e
            int r3 = r3 - r1
            r10.bufpos = r3     // Catch: java.io.IOException -> L10e
        L7e:
            char r3 = r10.readByte()     // Catch: java.io.IOException -> Ld4
            if (r3 != r4) goto L8e
            boolean r5 = r10.isTrackLineColumn()     // Catch: java.io.IOException -> Ld4
            if (r5 == 0) goto L7e
            r10.internalUpdateLineColumn(r3)     // Catch: java.io.IOException -> Ld4
            goto L7e
        L8e:
            char r4 = r10.readByte()     // Catch: java.io.IOException -> Ld4
            char r5 = r10.readByte()     // Catch: java.io.IOException -> Ld4
            char r6 = r10.readByte()     // Catch: java.io.IOException -> Ld4
            int r7 = bsh.AbstractCharStream.hexval(r3)     // Catch: java.io.IOException -> Ld4
            int r7 = r7 << 12
            int r8 = bsh.AbstractCharStream.hexval(r4)     // Catch: java.io.IOException -> Ld4
            int r8 = r8 << 8
            r7 = r7 | r8
            int r8 = bsh.AbstractCharStream.hexval(r5)     // Catch: java.io.IOException -> Ld4
            int r8 = r8 << 4
            r7 = r7 | r8
            int r8 = bsh.AbstractCharStream.hexval(r6)     // Catch: java.io.IOException -> Ld4
            r7 = r7 | r8
            char r7 = (char) r7     // Catch: java.io.IOException -> Ld4
            char[] r8 = r10.buffer     // Catch: java.io.IOException -> Ld4
            int r9 = r10.bufpos     // Catch: java.io.IOException -> Ld4
            r8[r9] = r7     // Catch: java.io.IOException -> Ld4
            boolean r8 = r10.isTrackLineColumn()     // Catch: java.io.IOException -> Ld4
            if (r8 == 0) goto Lcc
            r10.internalUpdateLineColumn(r3)     // Catch: java.io.IOException -> Ld4
            r10.internalUpdateLineColumn(r4)     // Catch: java.io.IOException -> Ld4
            r10.internalUpdateLineColumn(r5)     // Catch: java.io.IOException -> Ld4
            r10.internalUpdateLineColumn(r6)     // Catch: java.io.IOException -> Ld4
        Lcc:
            if (r0 != r1) goto Lcf
            return r7
        Lcf:
            int r0 = r0 - r1
            r10.backup(r0)
            return r2
        Ld4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r1 = r10.getLine()
            int r2 = r10.getColumn()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid escape character at line "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " column "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = "."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        Lfd:
            r10.backup(r0)     // Catch: java.io.IOException -> L10e
            return r2
        L101:
            boolean r4 = r10.isTrackLineColumn()
            if (r4 == 0) goto L10a
            r10.internalUpdateLineColumn(r3)
        L10a:
            int r0 = r0 + 1
            goto L49
        L10e:
            if (r0 <= r1) goto L114
            int r0 = r0 - r1
            r10.backup(r0)
        L114:
            return r2
    }

    @Override // bsh.AbstractCharStream
    public void streamClose() {
            r1 = this;
            java.io.Reader r0 = r1.m_aIS
            r0.close()
            return
    }

    @Override // bsh.AbstractCharStream
    public int streamRead(char[] r2, int r3, int r4) {
            r1 = this;
            java.io.Reader r0 = r1.m_aIS
            int r2 = r0.read(r2, r3, r4)
            return r2
    }
}
