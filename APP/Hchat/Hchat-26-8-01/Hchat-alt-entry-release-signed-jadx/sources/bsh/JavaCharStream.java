package bsh;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JavaCharStream extends AbstractCharStream {
    protected static final int NEXTCHAR_BUF_SIZE = 4096;
    private Reader m_aIS;
    private char[] m_aNextCharBuf;
    private int nextCharInd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JavaCharStream(Reader reader, int i9, int i10, int i11) {
        super(i9, i10, i11);
        this.nextCharInd = -1;
        this.m_aNextCharBuf = new char[4096];
        this.m_aIS = reader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private char readByte() throws IOException {
        int i9 = this.nextCharInd + 1;
        this.nextCharInd = i9;
        if (i9 >= this.maxNextCharInd) {
            fillBuff();
        }
        return this.m_aNextCharBuf[this.nextCharInd];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.AbstractCharStream, bsh.CharStream
    public char beginToken() {
        int i9 = this.inBuf;
        if (i9 <= 0) {
            this.tokenBegin = 0;
            this.bufpos = -1;
            return readChar();
        }
        this.inBuf = i9 - 1;
        int i10 = this.bufpos + 1;
        this.bufpos = i10;
        if (i10 == this.bufsize) {
            this.bufpos = 0;
        }
        int i11 = this.bufpos;
        this.tokenBegin = i11;
        return this.buffer[i11];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.AbstractCharStream, bsh.CharStream
    public void done() {
        this.m_aNextCharBuf = null;
        super.done();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.AbstractCharStream
    public void fillBuff() throws IOException {
        if (this.maxNextCharInd == 4096) {
            this.maxNextCharInd = 0;
            this.nextCharInd = 0;
        }
        try {
            char[] cArr = this.m_aNextCharBuf;
            int i9 = this.maxNextCharInd;
            int iStreamRead = streamRead(cArr, i9, 4096 - i9);
            if (iStreamRead != -1) {
                this.maxNextCharInd += iStreamRead;
            } else {
                streamClose();
                throw new IOException();
            }
        } catch (IOException e6) {
            int i10 = this.bufpos;
            if (i10 != 0) {
                this.bufpos = i10 - 1;
                backup(0);
            } else {
                internalSetBufLineColumn(getLine(), getColumn());
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void reInit(Reader reader, int i9, int i10, int i11) {
        this.m_aNextCharBuf = new char[4096];
        this.nextCharInd = -1;
        this.m_aIS = reader;
        reInit(i9, i10, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.AbstractCharStream, bsh.CharStream
    public char readChar() throws IOException {
        char c10;
        char c11;
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
        if (i11 == this.available) {
            internalAdjustBuffSize();
        }
        char c12 = readByte();
        this.buffer[this.bufpos] = c12;
        if (c12 != '\\') {
            if (isTrackLineColumn()) {
                internalUpdateLineColumn(c12);
            }
            return c12;
        }
        if (isTrackLineColumn()) {
            internalUpdateLineColumn(c12);
        }
        int i12 = 1;
        while (true) {
            int i13 = this.bufpos + 1;
            this.bufpos = i13;
            if (i13 == this.available) {
                internalAdjustBuffSize();
            }
            try {
                c10 = readByte();
                this.buffer[this.bufpos] = c10;
                if (c10 != '\\') {
                    break;
                }
                if (isTrackLineColumn()) {
                    internalUpdateLineColumn(c10);
                }
                i12++;
            } catch (IOException unused) {
                if (i12 > 1) {
                    backup(i12 - 1);
                }
                return '\\';
            }
        }
        if (isTrackLineColumn()) {
            internalUpdateLineColumn(c10);
        }
        if (c10 != 'u' || (i12 & 1) != 1) {
            backup(i12);
            return '\\';
        }
        int i14 = this.bufpos - 1;
        this.bufpos = i14;
        if (i14 < 0) {
            this.bufpos = this.bufsize - 1;
        }
        while (true) {
            try {
                c11 = readByte();
                if (c11 != 'u') {
                    break;
                }
                if (isTrackLineColumn()) {
                    internalUpdateLineColumn(c11);
                }
            } catch (IOException unused2) {
                throw new IllegalStateException("Invalid escape character at line " + getLine() + " column " + getColumn() + ".");
            }
        }
        char c13 = readByte();
        char c14 = readByte();
        char c15 = readByte();
        char cHexval = (char) ((AbstractCharStream.hexval(c11) << 12) | (AbstractCharStream.hexval(c13) << 8) | (AbstractCharStream.hexval(c14) << 4) | AbstractCharStream.hexval(c15));
        this.buffer[this.bufpos] = cHexval;
        if (isTrackLineColumn()) {
            internalUpdateLineColumn(c11);
            internalUpdateLineColumn(c13);
            internalUpdateLineColumn(c14);
            internalUpdateLineColumn(c15);
        }
        if (i12 == 1) {
            return cHexval;
        }
        backup(i12 - 1);
        return '\\';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.AbstractCharStream
    public void streamClose() throws IOException {
        this.m_aIS.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.AbstractCharStream
    public int streamRead(char[] cArr, int i9, int i10) {
        return this.m_aIS.read(cArr, i9, i10);
    }

    public JavaCharStream(Reader reader, int i9, int i10) {
        this(reader, i9, i10, 4096);
    }

    public void reInit(Reader reader, int i9, int i10) {
        reInit(reader, i9, i10, 4096);
    }

    public JavaCharStream(Reader reader) {
        this(reader, 1, 1, 4096);
    }

    public void reInit(Reader reader) {
        reInit(reader, 1, 1, 4096);
    }

    public JavaCharStream(InputStream inputStream, Charset charset, int i9, int i10, int i11) {
        this(new InputStreamReader(inputStream, charset), i9, i10, i11);
    }

    public void reInit(InputStream inputStream, Charset charset) {
        reInit(inputStream, charset, 1, 1, 4096);
    }

    public JavaCharStream(InputStream inputStream, Charset charset, int i9, int i10) {
        this(inputStream, charset, i9, i10, 4096);
    }

    public void reInit(InputStream inputStream, Charset charset, int i9, int i10) {
        reInit(inputStream, charset, i9, i10, 4096);
    }

    public JavaCharStream(InputStream inputStream, Charset charset) {
        this(inputStream, charset, 1, 1, 4096);
    }

    public void reInit(InputStream inputStream, Charset charset, int i9, int i10, int i11) {
        reInit(new InputStreamReader(inputStream, charset), i9, i10, i11);
    }
}
