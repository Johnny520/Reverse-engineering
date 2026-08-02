package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h00 extends FilterInputStream {

    /* JADX INFO: renamed from: h */
    public final long f3752h;

    /* JADX INFO: renamed from: i */
    public int f3753i;

    public h00(InputStream inputStream, long j) {
        super(inputStream);
        this.f3752h = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f3752h - ((long) this.f3753i), ((FilterInputStream) this).in.available());
    }

    /* JADX INFO: renamed from: b */
    public final void m2039b(int i) throws IOException {
        int i2 = this.f3753i;
        if (i >= 0) {
            this.f3753i = i2 + i;
            return;
        }
        long j = this.f3752h;
        if (j - ((long) i2) <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j + ", but read: " + this.f3753i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        m2039b(i >= 0 ? 1 : -1);
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
        m2039b(i3);
        return i3;
    }
}
