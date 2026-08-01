package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2964 extends OutputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9374;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public byte[] f9375;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2974 f9376;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final FileOutputStream f9377;

    public C2964(FileOutputStream fileOutputStream, C2974 c2974) {
        this.f9377 = fileOutputStream;
        this.f9376 = c2974;
        this.f9375 = (byte[]) c2974.m6446(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f9377;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f9375;
            if (bArr != null) {
                this.f9376.m6449(bArr);
                this.f9375 = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f9374;
        FileOutputStream fileOutputStream = this.f9377;
        if (i > 0) {
            fileOutputStream.write(this.f9375, 0, i);
            this.f9374 = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f9374;
            FileOutputStream fileOutputStream = this.f9377;
            if (i6 == 0 && i4 >= this.f9375.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f9375.length - i6);
            System.arraycopy(bArr, i5, this.f9375, this.f9374, iMin);
            int i7 = this.f9374 + iMin;
            this.f9374 = i7;
            i3 += iMin;
            byte[] bArr2 = this.f9375;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.f9374 = 0;
            }
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f9375;
        int i2 = this.f9374;
        int i3 = i2 + 1;
        this.f9374 = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f9377.write(bArr, 0, i3);
        this.f9374 = 0;
    }
}
