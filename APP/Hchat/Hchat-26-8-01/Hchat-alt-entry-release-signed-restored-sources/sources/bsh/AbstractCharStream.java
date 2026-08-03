package bsh;

import java.io.IOException;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractCharStream implements CharStream {
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
    private int m_nColumnNo;
    private int m_nLineNo;
    protected int maxNextCharInd;
    protected int tokenBegin;
    private int m_nTabSize = 1;
    private boolean m_bTrackLineColumn = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractCharStream(int i9, int i10, int i11) {
        reInit(i9, i10, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int hexval(char c10) throws IOException {
        switch (c10) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                switch (c10) {
                    case 'A':
                        return 10;
                    case 'B':
                        return 11;
                    case 'C':
                        return 12;
                    case 'D':
                        return 13;
                    case 'E':
                        return 14;
                    case 'F':
                        return 15;
                    default:
                        switch (c10) {
                            case 'a':
                                return 10;
                            case 'b':
                                return 11;
                            case 'c':
                                return 12;
                            case 'd':
                                return 13;
                            case 'e':
                                return 14;
                            case 'f':
                                return 15;
                            default:
                                throw new IOException("Invalid hex char '" + c10 + "' (=" + ((int) c10) + ") provided!");
                        }
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void adjustBeginLineColumn(int i9, int i10) {
        int i11;
        int i12 = this.tokenBegin;
        int i13 = this.bufpos;
        if (i13 >= i12) {
            i11 = (i13 - i12) + this.inBuf + 1;
        } else {
            i11 = this.inBuf + (this.bufsize - i12) + i13 + 1;
        }
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i14 >= i11) {
                break;
            }
            int[] iArr = this.m_aBufLine;
            int i17 = this.bufsize;
            int i18 = i12 % i17;
            i12++;
            int i19 = i12 % i17;
            if (iArr[i18] != iArr[i19]) {
                i15 = i18;
                break;
            }
            iArr[i18] = i9;
            int[] iArr2 = this.m_aBufColumn;
            int i20 = (iArr2[i19] + i16) - iArr2[i18];
            iArr2[i18] = i16 + i10;
            i14++;
            i16 = i20;
            i15 = i18;
        }
        if (i14 < i11) {
            int i21 = i9 + 1;
            this.m_aBufLine[i15] = i9;
            this.m_aBufColumn[i15] = i10 + i16;
            while (true) {
                int i22 = i14 + 1;
                if (i14 >= i11) {
                    break;
                }
                int[] iArr3 = this.m_aBufLine;
                int i23 = this.bufsize;
                i15 = i12 % i23;
                i12++;
                if (iArr3[i15] != iArr3[i12 % i23]) {
                    iArr3[i15] = i21;
                    i21++;
                } else {
                    iArr3[i15] = i21;
                }
                i14 = i22;
            }
        }
        this.m_nLineNo = this.m_aBufLine[i15];
        this.m_nColumnNo = this.m_aBufColumn[i15];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.CharStream
    public void backup(int i9) {
        int i10 = this.bufsize;
        if (i9 > i10) {
            C2104o.m5276A(AbstractC2091b.m5163j(AbstractC0921a.m2257t(i9, "Cannot back ", " chars which is larger than the internal buffer size ("), this.bufsize, ")"));
            return;
        }
        this.inBuf += i9;
        int i11 = this.bufpos - i9;
        this.bufpos = i11;
        if (i11 < 0) {
            this.bufpos = i11 + i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.CharStream
    public char beginToken() throws IOException {
        this.tokenBegin = -1;
        char c10 = readChar();
        this.tokenBegin = this.bufpos;
        return c10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.CharStream
    public void done() {
        this.buffer = null;
        this.m_aBufLine = null;
        this.m_aBufColumn = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void expandBuff(boolean z9) {
        int bufSizeAfterExpansion = getBufSizeAfterExpansion();
        char[] cArr = new char[bufSizeAfterExpansion];
        int[] iArr = new int[bufSizeAfterExpansion];
        int[] iArr2 = new int[bufSizeAfterExpansion];
        int i9 = this.bufsize;
        int i10 = this.tokenBegin;
        int i11 = i9 - i10;
        char[] cArr2 = this.buffer;
        if (z9) {
            System.arraycopy(cArr2, i10, cArr, 0, i11);
            System.arraycopy(this.buffer, 0, cArr, i11, this.bufpos);
            this.buffer = cArr;
            System.arraycopy(this.m_aBufLine, this.tokenBegin, iArr, 0, i11);
            System.arraycopy(this.m_aBufLine, 0, iArr, i11, this.bufpos);
            this.m_aBufLine = iArr;
            System.arraycopy(this.m_aBufColumn, this.tokenBegin, iArr2, 0, i11);
            System.arraycopy(this.m_aBufColumn, 0, iArr2, i11, this.bufpos);
            this.m_aBufColumn = iArr2;
            this.bufpos += i11;
        } else {
            System.arraycopy(cArr2, i10, cArr, 0, i11);
            this.buffer = cArr;
            System.arraycopy(this.m_aBufLine, this.tokenBegin, iArr, 0, i11);
            this.m_aBufLine = iArr;
            System.arraycopy(this.m_aBufColumn, this.tokenBegin, iArr2, 0, i11);
            this.m_aBufColumn = iArr2;
            this.bufpos -= this.tokenBegin;
        }
        this.bufsize = bufSizeAfterExpansion;
        this.available = bufSizeAfterExpansion;
        this.tokenBegin = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void fillBuff() throws IOException {
        if (this.maxNextCharInd == this.available) {
            internalAdjustBuffSize();
        }
        try {
            char[] cArr = this.buffer;
            int i9 = this.maxNextCharInd;
            int iStreamRead = streamRead(cArr, i9, this.available - i9);
            if (iStreamRead != -1) {
                this.maxNextCharInd += iStreamRead;
            } else {
                streamClose();
                throw new IOException("PGCC end of stream");
            }
        } catch (IOException e6) {
            this.bufpos--;
            backup(0);
            if (this.tokenBegin == -1) {
                this.tokenBegin = this.bufpos;
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.CharStream
    public int getBeginColumn() {
        return this.m_aBufColumn[this.tokenBegin];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.CharStream
    public int getBeginLine() {
        return this.m_aBufLine[this.tokenBegin];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getBufSizeAfterExpansion() {
        return this.bufsize * 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getColumn() {
        return this.m_nColumnNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.CharStream
    public int getEndColumn() {
        return this.m_aBufColumn[this.bufpos];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.CharStream
    public int getEndLine() {
        return this.m_aBufLine[this.bufpos];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.CharStream
    public String getImage() {
        int i9 = this.bufpos;
        int i10 = this.tokenBegin;
        char[] cArr = this.buffer;
        return i9 >= i10 ? new String(cArr, i10, (i9 - i10) + 1) : new String(cArr, i10, this.bufsize - i10).concat(new String(this.buffer, 0, this.bufpos + 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getLine() {
        return this.m_nLineNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.CharStream
    public char[] getSuffix(int i9) {
        char[] cArr = new char[i9];
        int i10 = this.bufpos;
        int i11 = i10 + 1;
        char[] cArr2 = this.buffer;
        if (i11 >= i9) {
            System.arraycopy(cArr2, (i10 - i9) + 1, cArr, 0, i9);
            return cArr;
        }
        int i12 = (i9 - i10) - 1;
        System.arraycopy(cArr2, this.bufsize - i12, cArr, 0, i12);
        System.arraycopy(this.buffer, 0, cArr, i12, this.bufpos + 1);
        return cArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.CharStream
    public final int getTabSize() {
        return this.m_nTabSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void internalAdjustBuffSize() {
        int i9 = this.bufsize;
        int i10 = i9 / 2;
        int i11 = this.available;
        int i12 = this.tokenBegin;
        if (i11 != i9) {
            if (i11 > i12) {
                this.available = i9;
                return;
            } else if (i12 - i11 < i10) {
                expandBuff(true);
                return;
            } else {
                this.available = i12;
                return;
            }
        }
        if (i12 < 0) {
            this.bufpos = 0;
            this.maxNextCharInd = 0;
        } else {
            if (i12 <= i10) {
                expandBuff(false);
                return;
            }
            this.bufpos = 0;
            this.maxNextCharInd = 0;
            this.available = i12;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void internalSetBufLineColumn(int i9, int i10) {
        int[] iArr = this.m_aBufLine;
        int i11 = this.bufpos;
        iArr[i11] = i9;
        this.m_aBufColumn[i11] = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void internalUpdateLineColumn(char c10) {
        this.m_nColumnNo++;
        if (this.m_bPrevCharIsLF) {
            this.m_bPrevCharIsLF = false;
            this.m_nColumnNo = 1;
            this.m_nLineNo++;
        } else if (this.m_bPrevCharIsCR) {
            this.m_bPrevCharIsCR = false;
            if (c10 == '\n') {
                this.m_bPrevCharIsLF = true;
            } else {
                this.m_nColumnNo = 1;
                this.m_nLineNo++;
            }
        }
        if (c10 == '\t') {
            int i9 = this.m_nColumnNo - 1;
            this.m_nColumnNo = i9;
            int i10 = this.m_nTabSize;
            this.m_nColumnNo = (i10 - (i9 % i10)) + i9;
        } else if (c10 == '\n') {
            this.m_bPrevCharIsLF = true;
        } else if (c10 == '\r') {
            this.m_bPrevCharIsCR = true;
        }
        internalSetBufLineColumn(this.m_nLineNo, this.m_nColumnNo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.CharStream
    public final boolean isTrackLineColumn() {
        return this.m_bTrackLineColumn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void reInit(int i9, int i10, int i11) {
        this.m_nLineNo = i9;
        this.m_nColumnNo = i10 - 1;
        this.m_bPrevCharIsCR = false;
        this.m_bPrevCharIsLF = false;
        char[] cArr = this.buffer;
        if (cArr == null || i11 != cArr.length) {
            this.bufsize = i11;
            this.available = i11;
            this.buffer = new char[i11];
            this.m_aBufLine = new int[i11];
            this.m_aBufColumn = new int[i11];
        }
        this.maxNextCharInd = 0;
        this.inBuf = 0;
        this.tokenBegin = 0;
        this.bufpos = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.CharStream
    public char readChar() throws IOException {
        int i9 = this.inBuf;
        if (i9 > 0) {
            this.inBuf = i9 - 1;
            int i10 = this.bufpos + 1;
            this.bufpos = i10;
            if (i10 == this.bufsize) {
                this.bufpos = 0;
            }
            return this.buffer[this.bufpos];
        }
        int i11 = this.bufpos + 1;
        this.bufpos = i11;
        if (i11 >= this.maxNextCharInd) {
            fillBuff();
        }
        char c10 = this.buffer[this.bufpos];
        if (this.m_bTrackLineColumn) {
            internalUpdateLineColumn(c10);
        }
        return c10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.CharStream
    public final void setTabSize(int i9) {
        this.m_nTabSize = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.CharStream
    public final void setTrackLineColumn(boolean z9) {
        this.m_bTrackLineColumn = z9;
    }

    public abstract void streamClose();

    public abstract int streamRead(char[] cArr, int i9, int i10);
}
