package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: vg */
/* JADX INFO: loaded from: classes.dex */
public final class C2631vg extends InputStream {

    /* JADX INFO: renamed from: c */
    public static final ArrayDeque f9139c;

    /* JADX INFO: renamed from: a */
    public C1340dv f9140a;

    /* JADX INFO: renamed from: b */
    public IOException f9141b;

    static {
        char[] cArr = AbstractC2622vD.f9104a;
        f9139c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f9140a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9140a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f9140a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f9140a.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f9140a.read();
        } catch (IOException e) {
            this.f9141b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f9140a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f9140a.skip(j);
        } catch (IOException e) {
            this.f9141b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f9140a.read(bArr);
        } catch (IOException e) {
            this.f9141b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f9140a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f9141b = e;
            throw e;
        }
    }
}
