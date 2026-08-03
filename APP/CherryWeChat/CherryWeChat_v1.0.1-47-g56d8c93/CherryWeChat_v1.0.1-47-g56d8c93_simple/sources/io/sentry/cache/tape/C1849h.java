package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p000.AbstractC0213Ey;
import p000.AbstractC2374ph;

/* JADX INFO: renamed from: io.sentry.cache.tape.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1849h implements Closeable, Iterable {

    /* JADX INFO: renamed from: k */
    public static final byte[] f6658k = null;

    /* JADX INFO: renamed from: a */
    public RandomAccessFile f6659a;

    /* JADX INFO: renamed from: b */
    public final File f6660b;

    /* JADX INFO: renamed from: c */
    public long f6661c;

    /* JADX INFO: renamed from: d */
    public int f6662d;

    /* JADX INFO: renamed from: e */
    public C1847f f6663e;

    /* JADX INFO: renamed from: f */
    public C1847f f6664f;

    /* JADX INFO: renamed from: g */
    public final byte[] f6665g;

    /* JADX INFO: renamed from: h */
    public int f6666h;

    /* JADX INFO: renamed from: i */
    public final int f6667i;

    /* JADX INFO: renamed from: j */
    public boolean f6668j;

    static {
        f6658k = new byte[4096];
    }

    public C1849h(File r2, RandomAccessFile r3, int r4) {
        this.f6665g = new byte[32];
        this.f6666h = 0;
        this.f6660b = r2;
        this.f6659a = r3;
        this.f6667i = r4;
        m4024s();
    }

    /* JADX INFO: renamed from: A */
    public static void m4018A(byte[] r2, int r3, int r4) {
        r2[r3] = (byte) (r4 >> 24);
        r2[r3 + 1] = (byte) (r4 >> 16);
        r2[r3 + 2] = (byte) (r4 >> 8);
        r2[r3 + 3] = (byte) r4;
    }

    /* JADX INFO: renamed from: B */
    public static void m4019B(int r3, long r4, byte[] r6) {
        r6[r3] = (byte) (r4 >> 56);
        r6[r3 + 1] = (byte) (r4 >> 48);
        r6[r3 + 2] = (byte) (r4 >> 40);
        r6[r3 + 3] = (byte) (r4 >> 32);
        r6[r3 + 4] = (byte) (r4 >> 24);
        r6[r3 + 5] = (byte) (r4 >> 16);
        r6[r3 + 6] = (byte) (r4 >> 8);
        r6[r3 + 7] = (byte) r4;
    }

    /* JADX INFO: renamed from: q */
    public static RandomAccessFile m4020q(File r7) {
        if (r7.exists() == true) goto L15;
        File r0 = new File(r7.getPath() + ".tmp");
        RandomAccessFile r2 = new RandomAccessFile(r0, "rwd");
        r2.setLength(4096);     // Catch: Throwable -> L11
        r2.seek(0);     // Catch: Throwable -> L11
        r2.writeInt(-2147483647);     // Catch: Throwable -> L11
        r2.writeLong(4096);     // Catch: Throwable -> L11
        r2.close();
        if (r0.renameTo(r7) == true) goto L15;
        throw new IOException("Rename failed!");
    L11:
        th = move-exception;
        r2.close();
        throw th;
    L15:
        return new RandomAccessFile(r7, "rwd");
    }

    /* JADX INFO: renamed from: t */
    public static int m4021t(int r2, byte[] r3) {
        return ((((r3[r2] & 255) << 24) + ((r3[r2 + 1] & 255) << 16)) + ((r3[r2 + 2] & 255) << 8)) + (r3[r2 + 3] & 255);
    }

    /* JADX INFO: renamed from: u */
    public static long m4022u(int r7, byte[] r8) {
        return ((((((((((long) r8[r7]) & 255) << 56) + ((((long) r8[r7 + 1]) & 255) << 48)) + ((((long) r8[r7 + 2]) & 255) << 40)) + ((((long) r8[r7 + 3]) & 255) << 32)) + ((((long) r8[r7 + 4]) & 255) << 24)) + ((((long) r8[r7 + 5]) & 255) << 16)) + ((((long) r8[r7 + 6]) & 255) << 8)) + (((long) r8[r7 + 7]) & 255);
    }

    public final void clear() {
        if (this.f6668j == true) goto L10;
        m4029z(4096, 0, 0, 0);
        this.f6659a.seek(32);
        this.f6659a.write(f6658k, 0, 4064);
        this.f6662d = 0;
        C1847f r0 = C1847f.f6651c;
        this.f6663e = r0;
        this.f6664f = r0;
        if (this.f6661c <= 4096) goto L7;
        this.f6659a.setLength(4096);
        this.f6659a.getChannel().force(true);
    L7:
        this.f6661c = 4096;
        this.f6666h++;
        return;
    L10:
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6668j = true;
        this.f6659a.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1848g(this);
    }

    /* JADX INFO: renamed from: r */
    public final C1847f m4023r(long r3) {
        if (r3 == 0) goto L8;
        byte[] r1 = this.f6665g;
        if (m4026w(4, r3, r1) == false) goto L8;
        return new C1847f(m4021t(0, r1), r3);
    L8:
        return C1847f.f6651c;
    }

    public final void remove(int r17) {
        if (r17 < 0) goto L28;
        if (r17 == 0) goto L22;
        int r1 = this.f6662d;
        if (r17 != r1) goto L10;
        clear();
        return;
    L10:
        if (r1 == 0) goto L26;
        if (r17 > r1) goto L24;
        C1847f r12 = this.f6663e;
        long r9 = r12.f6652a;
        int r13 = r12.f6653b;
        int r14 = 0;
        long r4 = r9;
        long r142 = 0;
    L13:
        if (r14 >= r17) goto L18;
        r142 = r142 + ((long) (r13 + 4));
        r4 = m4028y((r4 + 4) + ((long) r13));
        byte[] r6 = this.f6665g;
        if (m4026w(4, r4, r6) == false) goto L32;
        r13 = m4021t(0, r6);
        r14 = r14 + 1;
        goto L13
    L32:
        return;
    L18:
        m4029z(this.f6661c, this.f6662d - r17, r4, this.f6664f.f6652a);
        this.f6662d -= r17;
        this.f6666h++;
        this.f6663e = new C1847f(r13, r4);
    L20:
        if (r142 <= 0) goto L33;
        int r15 = (int) Math.min(r142, 4096);
        m4027x(r15, r9, f6658k);
        long r16 = r15;
        r142 = r142 - r16;
        r9 = r9 + r16;
        goto L20
    L33:
        return;
    L24:
        throw new IllegalArgumentException(AbstractC0213Ey.m409g(AbstractC2374ph.m4816m(r17, "Cannot remove more elements (", ") than present in queue ("), this.f6662d, ")."));
    L26:
        throw new NoSuchElementException();
    L22:
        return;
    L28:
        throw new IllegalArgumentException(AbstractC2374ph.m4813j(r17, "Cannot remove negative (", ") number of elements."));
    }

    /* JADX INFO: renamed from: s */
    public final void m4024s() {
        this.f6659a.seek(0);
        RandomAccessFile r0 = this.f6659a;
        byte[] r1 = this.f6665g;
        r0.readFully(r1);
        this.f6661c = m4022u(4, r1);
        this.f6662d = m4021t(12, r1);
        long r2 = m4022u(16, r1);
        long r02 = m4022u(24, r1);
        if (this.f6661c > this.f6659a.length()) goto L11;
        if (this.f6661c <= 32) goto L9;
        this.f6663e = m4023r(r2);
        this.f6664f = m4023r(r02);
        return;
    L9:
        throw new IOException("File is corrupt; length stored in header (" + this.f6661c + ") is invalid.");
    L11:
        throw new IOException("File is truncated. Expected length: " + this.f6661c + ", Actual length: " + this.f6659a.length());
    }

    public final String toString() {
        return "QueueFile{file=" + this.f6660b + ", zero=true, length=" + this.f6661c + ", size=" + this.f6662d + ", first=" + this.f6663e + ", last=" + this.f6664f + '}';
    }

    /* JADX INFO: renamed from: v */
    public final void m4025v() {
        this.f6659a.close();
        File r0 = this.f6660b;
        r0.delete();
        this.f6659a = m4020q(r0);
        m4024s();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m4026w(int r6, long r7, byte[] r9) {
        long r72 = m4028y(r7);     // Catch: IOException -> L6 Throwable -> L11 EOFException -> L13
        long r1 = ((long) r6) + r72;     // Catch: IOException -> L6 Throwable -> L11 EOFException -> L13
        long r3 = this.f6661c;     // Catch: IOException -> L6 Throwable -> L11 EOFException -> L13
        if (r1 > r3) goto L8;
        this.f6659a.seek(r72);     // Catch: IOException -> L6 Throwable -> L11 EOFException -> L13
        this.f6659a.readFully(r9, 0, r6);     // Catch: IOException -> L6 Throwable -> L11 EOFException -> L13
        return true;
    L8:
        int r12 = (int) (r3 - r72);     // Catch: IOException -> L6 Throwable -> L11 EOFException -> L13
        this.f6659a.seek(r72);     // Catch: IOException -> L6 Throwable -> L11 EOFException -> L13
        this.f6659a.readFully(r9, 0, r12);     // Catch: IOException -> L6 Throwable -> L11 EOFException -> L13
        this.f6659a.seek(32);     // Catch: IOException -> L6 Throwable -> L11 EOFException -> L13
        this.f6659a.readFully(r9, r12, r6 - r12);     // Catch: IOException -> L6 Throwable -> L11 EOFException -> L13
        return true;
    L13:
        m4025v();
    L14:
        return false;
    L6:
        e = move-exception;
        throw e;
    L11:
        m4025v();
        goto L14
    }

    /* JADX INFO: renamed from: x */
    public final void m4027x(int r5, long r6, byte[] r8) {
        long r62 = m4028y(r6);
        long r0 = ((long) r5) + r62;
        long r2 = this.f6661c;
        if (r0 > r2) goto L6;
        this.f6659a.seek(r62);
        this.f6659a.write(r8, 0, r5);
        return;
    L6:
        int r02 = (int) (r2 - r62);
        this.f6659a.seek(r62);
        this.f6659a.write(r8, 0, r02);
        this.f6659a.seek(32);
        this.f6659a.write(r8, r02, r5 - r02);
    }

    /* JADX INFO: renamed from: y */
    public final long m4028y(long r5) {
        long r0 = this.f6661c;
        if (r5 >= r0) goto L6;
        return r5;
    L6:
        return (r5 + 32) - r0;
    }

    /* JADX INFO: renamed from: z */
    public final void m4029z(long r4, int r6, long r7, long r9) {
        this.f6659a.seek(0);
        byte[] r1 = this.f6665g;
        m4018A(r1, 0, -2147483647);
        m4019B(4, r4, r1);
        m4018A(r1, 12, r6);
        m4019B(16, r7, r1);
        m4019B(24, r9, r1);
        this.f6659a.write(r1, 0, 32);
    }
}
