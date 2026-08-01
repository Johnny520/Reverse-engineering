package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p093S1.C1294f;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1932b extends OutputStream {

    /* JADX INFO: renamed from: d */
    public final FileOutputStream f6565d;

    /* JADX INFO: renamed from: e */
    public byte[] f6566e;

    /* JADX INFO: renamed from: f */
    public final C1294f f6567f;

    /* JADX INFO: renamed from: g */
    public int f6568g;

    public C1932b(FileOutputStream fileOutputStream, C1294f c1294f) {
        this.f6565d = fileOutputStream;
        this.f6567f = c1294f;
        this.f6566e = (byte[]) c1294f.m2384c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f6565d;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f6566e;
            if (bArr != null) {
                this.f6567f.m2388g(bArr);
                this.f6566e = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i5 = this.f6568g;
        FileOutputStream fileOutputStream = this.f6565d;
        if (i5 > 0) {
            fileOutputStream.write(this.f6566e, 0, i5);
            this.f6568g = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i5) throws IOException {
        byte[] bArr = this.f6566e;
        int i6 = this.f6568g;
        int i7 = i6 + 1;
        this.f6568g = i7;
        bArr[i6] = (byte) i5;
        if (i7 != bArr.length || i7 <= 0) {
            return;
        }
        this.f6565d.write(bArr, 0, i7);
        this.f6568g = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i5, int i6) throws IOException {
        int i7 = 0;
        do {
            int i8 = i6 - i7;
            int i9 = i5 + i7;
            int i10 = this.f6568g;
            FileOutputStream fileOutputStream = this.f6565d;
            if (i10 == 0 && i8 >= this.f6566e.length) {
                fileOutputStream.write(bArr, i9, i8);
                return;
            }
            int iMin = Math.min(i8, this.f6566e.length - i10);
            System.arraycopy(bArr, i9, this.f6566e, this.f6568g, iMin);
            int i11 = this.f6568g + iMin;
            this.f6568g = i11;
            i7 += iMin;
            byte[] bArr2 = this.f6566e;
            if (i11 == bArr2.length && i11 > 0) {
                fileOutputStream.write(bArr2, 0, i11);
                this.f6568g = 0;
            }
        } while (i7 < i6);
    }
}
