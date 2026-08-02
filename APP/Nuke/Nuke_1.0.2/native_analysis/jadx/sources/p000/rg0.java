package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rg0 extends InputStream {

    /* JADX INFO: renamed from: j */
    public static final ArrayDeque f9549j;

    /* JADX INFO: renamed from: h */
    public r62 f9550h;

    /* JADX INFO: renamed from: i */
    public IOException f9551i;

    static {
        char[] cArr = b93.f747a;
        f9549j = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f9550h.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9550h.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f9550h.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f9550h.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f9550h.read();
        } catch (IOException e) {
            this.f9551i = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f9550h.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f9550h.skip(j);
        } catch (IOException e) {
            this.f9551i = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f9550h.read(bArr);
        } catch (IOException e) {
            this.f9551i = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f9550h.read(bArr, i, i2);
        } catch (IOException e) {
            this.f9551i = e;
            throw e;
        }
    }
}
