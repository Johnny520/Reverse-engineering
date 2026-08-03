package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Ab */
/* JADX INFO: loaded from: classes.dex */
public final class C0018Ab extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public final long f34a;

    /* JADX INFO: renamed from: b */
    public int f35b;

    public C0018Ab(InputStream inputStream, long j) {
        super(inputStream);
        this.f34a = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f34a - ((long) this.f35b), ((FilterInputStream) this).in.available());
    }

    /* JADX INFO: renamed from: d */
    public final void m27d(int i) throws IOException {
        if (i >= 0) {
            this.f35b += i;
            return;
        }
        long j = this.f35b;
        long j2 = this.f34a;
        if (j2 - j <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j2 + ", but read: " + this.f35b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        m27d(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        m27d(i3);
        return i3;
    }
}
