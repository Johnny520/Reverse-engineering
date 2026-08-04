package yyds;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: yyds.ᛲᛷᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0402 extends OutputStream {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2267 f2122;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final FileOutputStream f2123;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f2124;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public byte[] f2125;

    public C0402(FileOutputStream fileOutputStream, C2267 c2267) {
        this.f2123 = fileOutputStream;
        this.f2122 = c2267;
        this.f2125 = (byte[]) c2267.m4272(byte[].class, 65536);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f2123;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f2125;
            if (bArr != null) {
                this.f2122.m4271(bArr);
                this.f2125 = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f2124;
        FileOutputStream fileOutputStream = this.f2123;
        if (i > 0) {
            fileOutputStream.write(this.f2125, 0, i);
            this.f2124 = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f2124;
            FileOutputStream fileOutputStream = this.f2123;
            if (i6 == 0 && i4 >= this.f2125.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f2125.length - i6);
            System.arraycopy(bArr, i5, this.f2125, this.f2124, iMin);
            int i7 = this.f2124 + iMin;
            this.f2124 = i7;
            i3 += iMin;
            byte[] bArr2 = this.f2125;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.f2124 = 0;
            }
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f2125;
        int i2 = this.f2124;
        int i3 = i2 + 1;
        this.f2124 = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f2123.write(bArr, 0, i3);
        this.f2124 = 0;
    }
}
