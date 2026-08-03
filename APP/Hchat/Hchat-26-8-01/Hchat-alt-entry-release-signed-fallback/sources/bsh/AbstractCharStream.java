package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractCharStream implements bsh.CharStream {
    public static final int DEFAULT_BUF_SIZE = 4096;
    protected int available;
    protected char[] buffer;
    protected int bufpos;
    protected int bufsize;
    protected int inBuf;
    private int[] m_aBufColumn;
    private int[] m_aBufLine;
    private boolean m_bPrevCharIsCR;
    private boolean m_bPrevCharIsLF;
    private boolean m_bTrackLineColumn;
    private int m_nColumnNo;
    private int m_nLineNo;
    private int m_nTabSize;
    protected int maxNextCharInd;
    protected int tokenBegin;

    public AbstractCharStream(int r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.m_nTabSize = r0
            r1.m_bTrackLineColumn = r0
            r1.reInit(r2, r3, r4)
            return
    }

    public static final int hexval(char r3) {
            switch(r3) {
                case 48: goto L50;
                case 49: goto L4e;
                case 50: goto L4c;
                case 51: goto L4a;
                case 52: goto L48;
                case 53: goto L46;
                case 54: goto L44;
                case 55: goto L42;
                case 56: goto L3f;
                case 57: goto L3c;
                default: goto L3;
            }
        L3:
            switch(r3) {
                case 65: goto L39;
                case 66: goto L36;
                case 67: goto L33;
                case 68: goto L30;
                case 69: goto L2d;
                case 70: goto L2a;
                default: goto L6;
            }
        L6:
            switch(r3) {
                case 97: goto L39;
                case 98: goto L36;
                case 99: goto L33;
                case 100: goto L30;
                case 101: goto L2d;
                case 102: goto L2a;
                default: goto L9;
            }
        L9:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid hex char '"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = "' (="
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ") provided!"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L2a:
            r3 = 15
            return r3
        L2d:
            r3 = 14
            return r3
        L30:
            r3 = 13
            return r3
        L33:
            r3 = 12
            return r3
        L36:
            r3 = 11
            return r3
        L39:
            r3 = 10
            return r3
        L3c:
            r3 = 9
            return r3
        L3f:
            r3 = 8
            return r3
        L42:
            r3 = 7
            return r3
        L44:
            r3 = 6
            return r3
        L46:
            r3 = 5
            return r3
        L48:
            r3 = 4
            return r3
        L4a:
            r3 = 3
            return r3
        L4c:
            r3 = 2
            return r3
        L4e:
            r3 = 1
            return r3
        L50:
            r3 = 0
            return r3
    }

    public final void adjustBeginLineColumn(int r10, int r11) {
            r9 = this;
            int r0 = r9.tokenBegin
            int r1 = r9.bufpos
            if (r1 < r0) goto Ld
            int r1 = r1 - r0
            int r2 = r9.inBuf
            int r1 = r1 + r2
            int r1 = r1 + 1
            goto L16
        Ld:
            int r2 = r9.bufsize
            int r2 = r2 - r0
            int r2 = r2 + r1
            int r2 = r2 + 1
            int r1 = r9.inBuf
            int r1 = r1 + r2
        L16:
            r2 = 0
            r3 = r2
            r4 = r3
        L19:
            if (r2 >= r1) goto L3e
            int[] r3 = r9.m_aBufLine
            int r5 = r9.bufsize
            int r6 = r0 % r5
            r7 = r3[r6]
            int r0 = r0 + 1
            int r5 = r0 % r5
            r8 = r3[r5]
            if (r7 != r8) goto L3d
            r3[r6] = r10
            int[] r3 = r9.m_aBufColumn
            r5 = r3[r5]
            int r5 = r5 + r4
            r7 = r3[r6]
            int r5 = r5 - r7
            int r4 = r4 + r11
            r3[r6] = r4
            int r2 = r2 + 1
            r4 = r5
            r3 = r6
            goto L19
        L3d:
            r3 = r6
        L3e:
            if (r2 >= r1) goto L69
            int[] r5 = r9.m_aBufLine
            int r6 = r10 + 1
            r5[r3] = r10
            int[] r10 = r9.m_aBufColumn
            int r11 = r11 + r4
            r10[r3] = r11
        L4b:
            int r10 = r2 + 1
            if (r2 >= r1) goto L69
            int[] r11 = r9.m_aBufLine
            int r2 = r9.bufsize
            int r3 = r0 % r2
            r4 = r11[r3]
            int r0 = r0 + 1
            int r2 = r0 % r2
            r2 = r11[r2]
            if (r4 == r2) goto L66
            int r2 = r6 + 1
            r11[r3] = r6
            r6 = r2
        L64:
            r2 = r10
            goto L4b
        L66:
            r11[r3] = r6
            goto L64
        L69:
            int[] r10 = r9.m_aBufLine
            r10 = r10[r3]
            r9.m_nLineNo = r10
            int[] r10 = r9.m_aBufColumn
            r10 = r10[r3]
            r9.m_nColumnNo = r10
            return
    }

    @Override // bsh.CharStream
    public void backup(int r3) {
            r2 = this;
            int r0 = r2.bufsize
            if (r3 > r0) goto L14
            int r1 = r2.inBuf
            int r1 = r1 + r3
            r2.inBuf = r1
            int r1 = r2.bufpos
            int r1 = r1 - r3
            r2.bufpos = r1
            if (r1 >= 0) goto L13
            int r1 = r1 + r0
            r2.bufpos = r1
        L13:
            return
        L14:
            java.lang.String r0 = "Cannot back "
            java.lang.String r1 = " chars which is larger than the internal buffer size ("
            java.lang.StringBuilder r3 = eh.a.t(r3, r0, r1)
            int r0 = r2.bufsize
            java.lang.String r1 = ")"
            java.lang.String r3 = j8.b.j(r3, r0, r1)
            j8.o.A(r3)
            return
    }

    @Override // bsh.CharStream
    public char beginToken() {
            r2 = this;
            r0 = -1
            r2.tokenBegin = r0
            char r0 = r2.readChar()
            int r1 = r2.bufpos
            r2.tokenBegin = r1
            return r0
    }

    @Override // bsh.CharStream
    public void done() {
            r1 = this;
            r0 = 0
            r1.buffer = r0
            r1.m_aBufLine = r0
            r1.m_aBufColumn = r0
            return
    }

    public void expandBuff(boolean r9) {
            r8 = this;
            int r0 = r8.getBufSizeAfterExpansion()
            char[] r1 = new char[r0]
            int[] r2 = new int[r0]
            int[] r3 = new int[r0]
            int r4 = r8.bufsize
            int r5 = r8.tokenBegin
            int r4 = r4 - r5
            char[] r6 = r8.buffer
            r7 = 0
            if (r9 == 0) goto L46
            java.lang.System.arraycopy(r6, r5, r1, r7, r4)
            char[] r9 = r8.buffer
            int r5 = r8.bufpos
            java.lang.System.arraycopy(r9, r7, r1, r4, r5)
            r8.buffer = r1
            int[] r9 = r8.m_aBufLine
            int r1 = r8.tokenBegin
            java.lang.System.arraycopy(r9, r1, r2, r7, r4)
            int[] r9 = r8.m_aBufLine
            int r1 = r8.bufpos
            java.lang.System.arraycopy(r9, r7, r2, r4, r1)
            r8.m_aBufLine = r2
            int[] r9 = r8.m_aBufColumn
            int r1 = r8.tokenBegin
            java.lang.System.arraycopy(r9, r1, r3, r7, r4)
            int[] r9 = r8.m_aBufColumn
            int r1 = r8.bufpos
            java.lang.System.arraycopy(r9, r7, r3, r4, r1)
            r8.m_aBufColumn = r3
            int r9 = r8.bufpos
            int r9 = r9 + r4
            r8.bufpos = r9
            goto L64
        L46:
            java.lang.System.arraycopy(r6, r5, r1, r7, r4)
            r8.buffer = r1
            int[] r9 = r8.m_aBufLine
            int r1 = r8.tokenBegin
            java.lang.System.arraycopy(r9, r1, r2, r7, r4)
            r8.m_aBufLine = r2
            int[] r9 = r8.m_aBufColumn
            int r1 = r8.tokenBegin
            java.lang.System.arraycopy(r9, r1, r3, r7, r4)
            r8.m_aBufColumn = r3
            int r9 = r8.bufpos
            int r1 = r8.tokenBegin
            int r9 = r9 - r1
            r8.bufpos = r9
        L64:
            r8.bufsize = r0
            r8.available = r0
            r8.tokenBegin = r7
            return
    }

    public void fillBuff() {
            r4 = this;
            int r0 = r4.maxNextCharInd
            int r1 = r4.available
            if (r0 != r1) goto L9
            r4.internalAdjustBuffSize()
        L9:
            r0 = -1
            char[] r1 = r4.buffer     // Catch: java.io.IOException -> L1d
            int r2 = r4.maxNextCharInd     // Catch: java.io.IOException -> L1d
            int r3 = r4.available     // Catch: java.io.IOException -> L1d
            int r3 = r3 - r2
            int r1 = r4.streamRead(r1, r2, r3)     // Catch: java.io.IOException -> L1d
            if (r1 == r0) goto L1f
            int r2 = r4.maxNextCharInd     // Catch: java.io.IOException -> L1d
            int r2 = r2 + r1
            r4.maxNextCharInd = r2     // Catch: java.io.IOException -> L1d
            return
        L1d:
            r1 = move-exception
            goto L2a
        L1f:
            r4.streamClose()     // Catch: java.io.IOException -> L1d
            java.io.IOException r1 = new java.io.IOException     // Catch: java.io.IOException -> L1d
            java.lang.String r2 = "PGCC end of stream"
            r1.<init>(r2)     // Catch: java.io.IOException -> L1d
            throw r1     // Catch: java.io.IOException -> L1d
        L2a:
            int r2 = r4.bufpos
            int r2 = r2 + (-1)
            r4.bufpos = r2
            r2 = 0
            r4.backup(r2)
            int r2 = r4.tokenBegin
            if (r2 != r0) goto L3c
            int r0 = r4.bufpos
            r4.tokenBegin = r0
        L3c:
            throw r1
    }

    @Override // bsh.CharStream
    public int getBeginColumn() {
            r2 = this;
            int[] r0 = r2.m_aBufColumn
            int r1 = r2.tokenBegin
            r0 = r0[r1]
            return r0
    }

    @Override // bsh.CharStream
    public int getBeginLine() {
            r2 = this;
            int[] r0 = r2.m_aBufLine
            int r1 = r2.tokenBegin
            r0 = r0[r1]
            return r0
    }

    public int getBufSizeAfterExpansion() {
            r1 = this;
            int r0 = r1.bufsize
            int r0 = r0 * 2
            return r0
    }

    public final int getColumn() {
            r1 = this;
            int r0 = r1.m_nColumnNo
            return r0
    }

    @Override // bsh.CharStream
    public int getEndColumn() {
            r2 = this;
            int[] r0 = r2.m_aBufColumn
            int r1 = r2.bufpos
            r0 = r0[r1]
            return r0
    }

    @Override // bsh.CharStream
    public int getEndLine() {
            r2 = this;
            int[] r0 = r2.m_aBufLine
            int r1 = r2.bufpos
            r0 = r0[r1]
            return r0
    }

    @Override // bsh.CharStream
    public java.lang.String getImage() {
            r5 = this;
            int r0 = r5.bufpos
            int r1 = r5.tokenBegin
            char[] r2 = r5.buffer
            if (r0 < r1) goto L11
            java.lang.String r3 = new java.lang.String
            int r0 = r0 - r1
            int r0 = r0 + 1
            r3.<init>(r2, r1, r0)
            return r3
        L11:
            java.lang.String r0 = new java.lang.String
            int r3 = r5.bufsize
            int r3 = r3 - r1
            r0.<init>(r2, r1, r3)
            java.lang.String r1 = new java.lang.String
            char[] r2 = r5.buffer
            int r3 = r5.bufpos
            int r3 = r3 + 1
            r4 = 0
            r1.<init>(r2, r4, r3)
            java.lang.String r0 = r0.concat(r1)
            return r0
    }

    public final int getLine() {
            r1 = this;
            int r0 = r1.m_nLineNo
            return r0
    }

    @Override // bsh.CharStream
    public char[] getSuffix(int r6) {
            r5 = this;
            char[] r0 = new char[r6]
            int r1 = r5.bufpos
            int r2 = r1 + 1
            char[] r3 = r5.buffer
            r4 = 0
            if (r2 < r6) goto L12
            int r1 = r1 - r6
            int r1 = r1 + 1
            java.lang.System.arraycopy(r3, r1, r0, r4, r6)
            return r0
        L12:
            int r6 = r6 - r1
            int r6 = r6 + (-1)
            int r1 = r5.bufsize
            int r1 = r1 - r6
            java.lang.System.arraycopy(r3, r1, r0, r4, r6)
            char[] r1 = r5.buffer
            int r2 = r5.bufpos
            int r2 = r2 + 1
            java.lang.System.arraycopy(r1, r4, r0, r6, r2)
            return r0
    }

    @Override // bsh.CharStream
    public final int getTabSize() {
            r1 = this;
            int r0 = r1.m_nTabSize
            return r0
    }

    public final void internalAdjustBuffSize() {
            r4 = this;
            int r0 = r4.bufsize
            int r1 = r0 / 2
            int r2 = r4.available
            int r3 = r4.tokenBegin
            if (r2 != r0) goto L1f
            r0 = 0
            if (r3 >= 0) goto L12
            r4.bufpos = r0
            r4.maxNextCharInd = r0
            return
        L12:
            if (r3 <= r1) goto L1b
            r4.bufpos = r0
            r4.maxNextCharInd = r0
            r4.available = r3
            return
        L1b:
            r4.expandBuff(r0)
            return
        L1f:
            if (r2 <= r3) goto L24
            r4.available = r0
            return
        L24:
            int r0 = r3 - r2
            if (r0 >= r1) goto L2d
            r0 = 1
            r4.expandBuff(r0)
            return
        L2d:
            r4.available = r3
            return
    }

    public final void internalSetBufLineColumn(int r3, int r4) {
            r2 = this;
            int[] r0 = r2.m_aBufLine
            int r1 = r2.bufpos
            r0[r1] = r3
            int[] r3 = r2.m_aBufColumn
            r3[r1] = r4
            return
    }

    public final void internalUpdateLineColumn(char r5) {
            r4 = this;
            int r0 = r4.m_nColumnNo
            r1 = 1
            int r0 = r0 + r1
            r4.m_nColumnNo = r0
            boolean r0 = r4.m_bPrevCharIsLF
            r2 = 10
            r3 = 0
            if (r0 == 0) goto L17
            r4.m_bPrevCharIsLF = r3
            r4.m_nColumnNo = r1
            int r0 = r4.m_nLineNo
            int r0 = r0 + r1
            r4.m_nLineNo = r0
            goto L29
        L17:
            boolean r0 = r4.m_bPrevCharIsCR
            if (r0 == 0) goto L29
            r4.m_bPrevCharIsCR = r3
            if (r5 != r2) goto L22
            r4.m_bPrevCharIsLF = r1
            goto L29
        L22:
            r4.m_nColumnNo = r1
            int r0 = r4.m_nLineNo
            int r0 = r0 + r1
            r4.m_nLineNo = r0
        L29:
            r0 = 9
            if (r5 == r0) goto L3a
            if (r5 == r2) goto L37
            r0 = 13
            if (r5 == r0) goto L34
            goto L47
        L34:
            r4.m_bPrevCharIsCR = r1
            goto L47
        L37:
            r4.m_bPrevCharIsLF = r1
            goto L47
        L3a:
            int r5 = r4.m_nColumnNo
            int r5 = r5 - r1
            r4.m_nColumnNo = r5
            int r0 = r4.m_nTabSize
            int r1 = r5 % r0
            int r0 = r0 - r1
            int r0 = r0 + r5
            r4.m_nColumnNo = r0
        L47:
            int r5 = r4.m_nLineNo
            int r0 = r4.m_nColumnNo
            r4.internalSetBufLineColumn(r5, r0)
            return
    }

    @Override // bsh.CharStream
    public final boolean isTrackLineColumn() {
            r1 = this;
            boolean r0 = r1.m_bTrackLineColumn
            return r0
    }

    public final void reInit(int r1, int r2, int r3) {
            r0 = this;
            r0.m_nLineNo = r1
            int r2 = r2 + (-1)
            r0.m_nColumnNo = r2
            r1 = 0
            r0.m_bPrevCharIsCR = r1
            r0.m_bPrevCharIsLF = r1
            char[] r2 = r0.buffer
            if (r2 == 0) goto L12
            int r2 = r2.length
            if (r3 == r2) goto L22
        L12:
            r0.bufsize = r3
            r0.available = r3
            char[] r2 = new char[r3]
            r0.buffer = r2
            int[] r2 = new int[r3]
            r0.m_aBufLine = r2
            int[] r2 = new int[r3]
            r0.m_aBufColumn = r2
        L22:
            r0.maxNextCharInd = r1
            r0.inBuf = r1
            r0.tokenBegin = r1
            r1 = -1
            r0.bufpos = r1
            return
    }

    @Override // bsh.CharStream
    public char readChar() {
            r2 = this;
            int r0 = r2.inBuf
            if (r0 <= 0) goto L1c
            int r0 = r0 + (-1)
            r2.inBuf = r0
            int r0 = r2.bufpos
            int r0 = r0 + 1
            r2.bufpos = r0
            int r1 = r2.bufsize
            if (r0 != r1) goto L15
            r0 = 0
            r2.bufpos = r0
        L15:
            char[] r0 = r2.buffer
            int r1 = r2.bufpos
            char r0 = r0[r1]
            return r0
        L1c:
            int r0 = r2.bufpos
            int r0 = r0 + 1
            r2.bufpos = r0
            int r1 = r2.maxNextCharInd
            if (r0 < r1) goto L29
            r2.fillBuff()
        L29:
            char[] r0 = r2.buffer
            int r1 = r2.bufpos
            char r0 = r0[r1]
            boolean r1 = r2.m_bTrackLineColumn
            if (r1 == 0) goto L36
            r2.internalUpdateLineColumn(r0)
        L36:
            return r0
    }

    @Override // bsh.CharStream
    public final void setTabSize(int r1) {
            r0 = this;
            r0.m_nTabSize = r1
            return
    }

    @Override // bsh.CharStream
    public final void setTrackLineColumn(boolean r1) {
            r0 = this;
            r0.m_bTrackLineColumn = r1
            return
    }

    public abstract void streamClose();

    public abstract int streamRead(char[] r1, int r2, int r3);
}
