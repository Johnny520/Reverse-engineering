package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: mn */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0467mn extends OutputStream {

    /* JADX INFO: renamed from: h */
    public final FileOutputStream f6728h;

    /* JADX INFO: renamed from: i */
    public byte[] f6729i;

    /* JADX INFO: renamed from: j */
    public final td1 f6730j;

    /* JADX INFO: renamed from: k */
    public int f6731k;

    public C0467mn(FileOutputStream fileOutputStream, td1 td1Var) {
        this.f6728h = fileOutputStream;
        this.f6730j = td1Var;
        this.f6729i = (byte[]) td1Var.m5167c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f6728h;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f6729i;
            if (bArr != null) {
                this.f6730j.m5171g(bArr);
                this.f6729i = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f6731k;
        FileOutputStream fileOutputStream = this.f6728h;
        if (i > 0) {
            fileOutputStream.write(this.f6729i, 0, i);
            this.f6731k = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f6731k;
            FileOutputStream fileOutputStream = this.f6728h;
            if (i6 == 0 && i4 >= this.f6729i.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f6729i.length - i6);
            System.arraycopy(bArr, i5, this.f6729i, this.f6731k, iMin);
            int i7 = this.f6731k + iMin;
            this.f6731k = i7;
            i3 += iMin;
            byte[] bArr2 = this.f6729i;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.f6731k = 0;
            }
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f6729i;
        int i2 = this.f6731k;
        int i3 = i2 + 1;
        this.f6731k = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f6728h.write(bArr, 0, i3);
        this.f6731k = 0;
    }
}
