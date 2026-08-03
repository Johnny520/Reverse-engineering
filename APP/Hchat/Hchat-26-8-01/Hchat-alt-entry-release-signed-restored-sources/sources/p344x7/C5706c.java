package p344x7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: x7.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5706c extends InputStream {

    /* JADX INFO: renamed from: g */
    public final FileChannel f23182g;

    /* JADX INFO: renamed from: h */
    public final long f23183h;

    /* JADX INFO: renamed from: i */
    public long f23184i;

    /* JADX INFO: renamed from: j */
    public long f23185j;

    /* JADX INFO: renamed from: k */
    public final byte[] f23186k;

    /* JADX INFO: renamed from: l */
    public int f23187l;

    /* JADX INFO: renamed from: m */
    public int f23188m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5706c(FileChannel fileChannel, long j3) {
        this.f23182g = fileChannel;
        this.f23183h = j3;
        int i9 = j3 < ((long) 102400) ? (int) j3 : 102400;
        this.f23186k = new byte[i9];
        this.f23188m = i9;
        this.f23187l = i9;
        this.f23184i = fileChannel.position();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m10311a() {
        if (this.f23187l < this.f23188m) {
            return;
        }
        byte[] bArr = this.f23186k;
        int length = bArr.length;
        long j3 = this.f23183h - this.f23185j;
        if (length > j3) {
            length = (int) j3;
        }
        this.f23188m = this.f23182g.read(ByteBuffer.wrap(bArr, 0, length));
        this.f23187l = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int available() {
        return (int) (this.f23183h - this.f23185j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m10312b(byte[] bArr, int i9, int i10) {
        int i11 = this.f23188m;
        int i12 = this.f23187l;
        int i13 = i11 - i12;
        if (i13 == 0) {
            return 0;
        }
        if (i10 > i13) {
            i10 = i13;
        }
        System.arraycopy(this.f23186k, i12, bArr, i9, i10);
        this.f23187l += i10;
        this.f23185j += (long) i10;
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final synchronized void mark(int i9) {
        if (i9 < 0) {
            i9 = 0;
        }
        this.f23184i = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        long j3 = this.f23185j;
        long j4 = this.f23183h;
        if (j3 >= j4) {
            return -1;
        }
        if (i10 == 0) {
            return 0;
        }
        m10311a();
        int iM10312b = m10312b(bArr, i9, i10);
        int i11 = i10 - iM10312b;
        int i12 = i9 + iM10312b;
        while (i11 > 0) {
            if (this.f23185j >= j4) {
                return iM10312b;
            }
            m10311a();
            int iM10312b2 = m10312b(bArr, i12, i11);
            iM10312b += iM10312b2;
            i11 -= iM10312b2;
            i12 += iM10312b2;
        }
        return iM10312b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.f23185j = 0L;
        this.f23187l = this.f23188m;
        this.f23182g.position(this.f23184i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final long skip(long j3) throws IOException {
        if (j3 > 0) {
            int i9 = this.f23188m;
            int i10 = this.f23187l;
            int i11 = i9 - i10;
            if (i11 > j3) {
                i11 = (int) j3;
            }
            this.f23187l = i10 + i11;
            long j4 = i11;
            long j5 = this.f23185j + j4;
            this.f23185j = j5;
            long j10 = j3 - j4;
            if (j10 != 0) {
                long j11 = this.f23183h - j5;
                if (j11 > j10) {
                    j11 = j10;
                }
                this.f23185j = j5 + j11;
                long j12 = j3 - (j10 - j11);
                FileChannel fileChannel = this.f23182g;
                fileChannel.position(fileChannel.position() + j11);
                return j12;
            }
        }
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f23185j + " / " + this.f23183h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final long transferTo(OutputStream outputStream) throws IOException {
        long j3 = this.f23185j;
        long j4 = this.f23183h;
        long j5 = 0;
        if (j3 >= j4) {
            return 0L;
        }
        while (this.f23185j < j4) {
            m10311a();
            int i9 = this.f23187l;
            int i10 = this.f23188m - i9;
            if (i10 <= 0) {
                return j5;
            }
            outputStream.write(this.f23186k, i9, i10);
            this.f23187l += i10;
            long j10 = i10;
            this.f23185j += j10;
            j5 += j10;
        }
        return j5;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        int i9 = read(bArr, 0, 1);
        return i9 < 0 ? i9 : bArr[0] & 255;
    }
}
