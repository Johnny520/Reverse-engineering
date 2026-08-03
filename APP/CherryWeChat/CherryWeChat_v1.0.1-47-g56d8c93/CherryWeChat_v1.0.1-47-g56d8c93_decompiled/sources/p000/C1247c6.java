package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1247c6 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public final FileOutputStream f4238a;

    /* JADX INFO: renamed from: b */
    public byte[] f4239b;

    /* JADX INFO: renamed from: c */
    public final C2812zp f4240c;

    /* JADX INFO: renamed from: d */
    public int f4241d;

    public C1247c6(FileOutputStream fileOutputStream, C2812zp c2812zp) {
        this.f4238a = fileOutputStream;
        this.f4240c = c2812zp;
        this.f4239b = (byte[]) c2812zp.m5441c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f4238a;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f4239b;
            if (bArr != null) {
                this.f4240c.m5445g(bArr);
                this.f4239b = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f4241d;
        FileOutputStream fileOutputStream = this.f4238a;
        if (i > 0) {
            fileOutputStream.write(this.f4239b, 0, i);
            this.f4241d = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f4239b;
        int i2 = this.f4241d;
        int i3 = i2 + 1;
        this.f4241d = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f4238a.write(bArr, 0, i3);
        this.f4241d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f4241d;
            FileOutputStream fileOutputStream = this.f4238a;
            if (i6 == 0 && i4 >= this.f4239b.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f4239b.length - i6);
            System.arraycopy(bArr, i5, this.f4239b, this.f4241d, iMin);
            int i7 = this.f4241d + iMin;
            this.f4241d = i7;
            i3 += iMin;
            byte[] bArr2 = this.f4239b;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.f4241d = 0;
            }
        } while (i3 < i2);
    }
}
