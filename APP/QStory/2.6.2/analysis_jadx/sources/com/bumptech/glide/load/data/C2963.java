package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2963 extends OutputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9372;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public byte[] f9373;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2973 f9374;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final FileOutputStream f9375;

    public C2963(FileOutputStream fileOutputStream, C2973 c2973) {
        this.f9375 = fileOutputStream;
        this.f9374 = c2973;
        this.f9373 = (byte[]) c2973.m6388(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f9375;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f9373;
            if (bArr != null) {
                this.f9374.m6391(bArr);
                this.f9373 = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f9372;
        FileOutputStream fileOutputStream = this.f9375;
        if (i > 0) {
            fileOutputStream.write(this.f9373, 0, i);
            this.f9372 = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f9372;
            FileOutputStream fileOutputStream = this.f9375;
            if (i6 == 0 && i4 >= this.f9373.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f9373.length - i6);
            System.arraycopy(bArr, i5, this.f9373, this.f9372, iMin);
            int i7 = this.f9372 + iMin;
            this.f9372 = i7;
            i3 += iMin;
            byte[] bArr2 = this.f9373;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.f9372 = 0;
            }
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f9373;
        int i2 = this.f9372;
        int i3 = i2 + 1;
        this.f9372 = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f9375.write(bArr, 0, i3);
        this.f9372 = 0;
    }
}
