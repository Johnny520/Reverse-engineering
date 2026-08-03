package p000;

import java.io.FileOutputStream;
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

    public C1247c6(FileOutputStream r2, C2812zp r3) {
        this.f4238a = r2;
        this.f4240c = r3;
        this.f4239b = (byte[]) r3.m5441c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream r0 = this.f4238a;
        flush();     // Catch: Throwable -> L8
        r0.close();
        byte[] r02 = this.f4239b;
        if (r02 == null) goto L13;
        this.f4240c.m5445g(r02);
        this.f4239b = null;
        return;
    L13:
        return;
    L8:
        th = move-exception;
        r0.close();
        throw th;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int r0 = this.f4241d;
        FileOutputStream r1 = this.f4238a;
        if (r0 <= 0) goto L5;
        r1.write(this.f4239b, 0, r0);
        this.f4241d = 0;
    L5:
        r1.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int r4) {
        byte[] r0 = this.f4239b;
        int r1 = this.f4241d;
        int r2 = r1 + 1;
        this.f4241d = r2;
        r0[r1] = (byte) r4;
        if (r2 != r0.length) goto L7;
        if (r2 <= 0) goto L8;
        this.f4238a.write(r0, 0, r2);
        this.f4241d = 0;
        return;
    L8:
        return;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r3) {
        write(r3, 0, r3.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r8, int r9, int r10) {
        int r1 = 0;
    L3:
        int r2 = r10 - r1;
        int r3 = r9 + r1;
        int r4 = this.f4241d;
        FileOutputStream r5 = this.f4238a;
        if (r4 == 0) goto L6;
    L9:
        int r22 = Math.min(r2, this.f4239b.length - r4);
        System.arraycopy(r8, r3, this.f4239b, this.f4241d, r22);
        int r32 = this.f4241d + r22;
        this.f4241d = r32;
        r1 = r1 + r22;
        byte[] r23 = this.f4239b;
        if (r32 != r23.length) goto L13;
        if (r32 <= 0) goto L13;
        r5.write(r23, 0, r32);
        this.f4241d = 0;
    L13:
        if (r1 < r10) goto L3;
        return;
    L6:
        if (r2 < this.f4239b.length) goto L9;
        r5.write(r8, r3, r2);
    }
}
