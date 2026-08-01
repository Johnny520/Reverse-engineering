package p195l2;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import p121Y1.C1733A;

/* JADX INFO: renamed from: l2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2501e extends InputStream {

    /* JADX INFO: renamed from: f */
    public static final ArrayDeque f8011f;

    /* JADX INFO: renamed from: d */
    public C1733A f8012d;

    /* JADX INFO: renamed from: e */
    public IOException f8013e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        char[] cArr = AbstractC2511o.f8029a;
        f8011f = new ArrayDeque(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int available() {
        return this.f8012d.available();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f8012d.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final void mark(int i5) {
        this.f8012d.mark(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f8012d.getClass();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f8012d.read();
        } catch (IOException e5) {
            this.f8013e = e5;
            throw e5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f8012d.reset();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final long skip(long j5) throws IOException {
        try {
            return this.f8012d.skip(j5);
        } catch (IOException e5) {
            this.f8013e = e5;
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f8012d.read(bArr);
        } catch (IOException e5) {
            this.f8013e = e5;
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i6) throws IOException {
        try {
            return this.f8012d.read(bArr, i5, i6);
        } catch (IOException e5) {
            this.f8013e = e5;
            throw e5;
        }
    }
}
