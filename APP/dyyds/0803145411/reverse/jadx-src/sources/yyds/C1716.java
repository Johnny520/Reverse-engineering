package yyds;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: yyds.ᛸᛲᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1716 extends InputStream {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final ArrayDeque f8697 = new ArrayDeque(0);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C0839 f8698;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public IOException f8699;

    @Override // java.io.InputStream
    public final int available() {
        return this.f8698.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f8698.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f8698.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f8698.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f8698.read();
        } catch (IOException e) {
            this.f8699 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f8698.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f8698.skip(j);
        } catch (IOException e) {
            this.f8699 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f8698.read(bArr);
        } catch (IOException e) {
            this.f8699 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f8698.read(bArr, i, i2);
        } catch (IOException e) {
            this.f8699 = e;
            throw e;
        }
    }
}
