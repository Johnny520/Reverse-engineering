package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: dv */
/* JADX INFO: loaded from: classes.dex */
public final class C1340dv extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public volatile byte[] f4825a;

    /* JADX INFO: renamed from: b */
    public int f4826b;

    /* JADX INFO: renamed from: c */
    public int f4827c;

    /* JADX INFO: renamed from: d */
    public int f4828d;

    /* JADX INFO: renamed from: e */
    public int f4829e;

    /* JADX INFO: renamed from: f */
    public final C2812zp f4830f;

    public C1340dv(InputStream r2, C2812zp r3) {
        super(r2);
        this.f4828d = -1;
        this.f4830f = r3;
        this.f4825a = (byte[]) r3.m5441c(65536, byte[].class);
    }

    /* JADX INFO: renamed from: i */
    public static void m2595i() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        monitor-enter(this);
        InputStream r0 = ((FilterInputStream) this).in;     // Catch: Throwable -> L10
        if (this.f4825a == null) goto L12;
        if (r0 == null) goto L12;
        int r1 = (this.f4826b - this.f4829e) + r0.available();
        monitor-exit(this);
        return r1;
    L12:
        m2595i();     // Catch: Throwable -> L10
        throw null;     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4825a == null) goto L5;
        this.f4830f.m5445g(this.f4825a);
        this.f4825a = null;
    L5:
        InputStream r0 = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (r0 == null) goto L9;
        r0.close();
        return;
    }

    /* JADX INFO: renamed from: d */
    public final int m2596d(InputStream r6, byte[] r7) {
        int r0 = this.f4828d;
        if (r0 == (-1)) goto L25;
        int r3 = this.f4829e - r0;
        int r4 = this.f4827c;
        if (r3 >= r4) goto L25;
        if (r0 == 0) goto L9;
    L17:
        if (r0 <= 0) goto L19;
        System.arraycopy(r7, r0, r7, 0, r7.length - r0);
    L19:
        int r02 = this.f4829e - this.f4828d;
        this.f4829e = r02;
        this.f4828d = 0;
        this.f4826b = 0;
        int r62 = r6.read(r7, r02, r7.length - r02);
        int r72 = this.f4829e;
        if (r62 <= 0) goto L23;
        r72 = r72 + r62;
    L23:
        this.f4826b = r72;
        return r62;
    L9:
        if (r4 <= r7.length) goto L17;
        if (this.f4826b != r7.length) goto L17;
        int r03 = r7.length * 2;
        if (r03 > r4) goto L16;
        r4 = r03;
    L16:
        byte[] r04 = (byte[]) this.f4830f.m5441c(r4, byte[].class);
        System.arraycopy(r7, 0, r04, 0, r7.length);
        this.f4825a = r04;
        this.f4830f.m5445g(r7);
        r7 = r04;
    L25:
        int r63 = r6.read(r7);
        if (r63 <= 0) goto L28;
        this.f4828d = -1;
        this.f4829e = 0;
        this.f4826b = r63;
    L28:
        return r63;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m2597f() {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (this.f4825a == null) goto L9;
        this.f4830f.m5445g(this.f4825a);     // Catch: Throwable -> L7
        this.f4825a = null;     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int r2) {
        monitor-enter(this);
        this.f4827c = Math.max(this.f4827c, r2);     // Catch: Throwable -> L6
        this.f4828d = this.f4829e;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        monitor-enter(this);
        byte[] r0 = this.f4825a;     // Catch: Throwable -> L12
        InputStream r1 = ((FilterInputStream) this).in;     // Catch: Throwable -> L12
        if (r0 == null) goto L29;
        if (r1 == null) goto L29;
        if (this.f4829e < this.f4826b) goto L15;
        if (m2596d(r1, r0) != (-1)) goto L15;
        monitor-exit(this);
        return -1;
    L15:
        if (r0 == this.f4825a) goto L21;
        r0 = this.f4825a;     // Catch: Throwable -> L12
        if (r0 != null) goto L21;
        m2595i();     // Catch: Throwable -> L12
        throw null;     // Catch: Throwable -> L12
    L21:
        int r12 = this.f4826b;     // Catch: Throwable -> L12
        int r2 = this.f4829e;     // Catch: Throwable -> L12
        if ((r12 - r2) <= 0) goto L27;
        this.f4829e = r2 + 1;     // Catch: Throwable -> L12
        int r02 = r0[r2] & 255;
        monitor-exit(this);
        return r02;
    L27:
        monitor-exit(this);
        return -1;
    L29:
        m2595i();     // Catch: Throwable -> L12
        throw null;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (this.f4825a == null) goto L16;
        int r1 = this.f4828d;     // Catch: Throwable -> L11
        if ((-1) == r1) goto L14;
        this.f4829e = r1;     // Catch: Throwable -> L11
        monitor-exit(this);
        return;
    L14:
        throw new C2273na("Mark has been invalidated, pos: " + this.f4829e + " markLimit: " + this.f4827c);     // Catch: Throwable -> L11
    L16:
        throw new IOException("Stream is closed");     // Catch: Throwable -> L11
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long r11) {
        monitor-enter(this);
        if (r11 >= 1) goto L49;
        monitor-exit(this);
        return 0;
    L49:
        byte[] r0 = this.f4825a;     // Catch: Throwable -> L16
        if (r0 == null) goto L45;
        InputStream r4 = ((FilterInputStream) this).in;     // Catch: Throwable -> L16
        if (r4 == null) goto L43;
        int r3 = this.f4826b;     // Catch: Throwable -> L16
        int r5 = this.f4829e;     // Catch: Throwable -> L16
        if ((r3 - r5) < r11) goto L18;
        this.f4829e = (int) (((long) r5) + r11);     // Catch: Throwable -> L16
        monitor-exit(this);
        return r11;
    L18:
        long r6 = ((long) r3) - ((long) r5);
        this.f4829e = r3;     // Catch: Throwable -> L16
        if (this.f4828d == (-1)) goto L37;
        if (r11 > this.f4827c) goto L37;
        if (m2596d(r4, r0) != (-1)) goto L27;
        monitor-exit(this);
        return r6;
    L27:
        int r02 = this.f4826b;     // Catch: Throwable -> L16
        int r1 = this.f4829e;     // Catch: Throwable -> L16
        if ((r02 - r1) < (r11 - r6)) goto L32;
        this.f4829e = (int) ((((long) r1) + r11) - r6);     // Catch: Throwable -> L16
        monitor-exit(this);
        return r11;
    L32:
        long r62 = (r6 + ((long) r02)) - ((long) r1);
        this.f4829e = r02;     // Catch: Throwable -> L16
        monitor-exit(this);
        return r62;
    L37:
        long r112 = r4.skip(r11 - r6);     // Catch: Throwable -> L16
        if (r112 <= 0) goto L40;
        this.f4828d = -1;     // Catch: Throwable -> L16
    L40:
        long r63 = r6 + r112;
        monitor-exit(this);
        return r63;
    L43:
        m2595i();     // Catch: Throwable -> L16
        throw null;     // Catch: Throwable -> L16
    L45:
        m2595i();     // Catch: Throwable -> L16
        throw null;     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] r7, int r8, int r9) {
        monitor-enter(this);
        byte[] r0 = this.f4825a;     // Catch: Throwable -> L23
        if (r0 == null) goto L69;
        if (r9 != 0) goto L10;
        monitor-exit(this);
        return 0;
    L10:
        InputStream r2 = ((FilterInputStream) this).in;     // Catch: Throwable -> L23
        if (r2 == null) goto L67;
        int r3 = this.f4829e;     // Catch: Throwable -> L23
        int r4 = this.f4826b;     // Catch: Throwable -> L23
        if (r3 >= r4) goto L27;
        int r42 = r4 - r3;     // Catch: Throwable -> L23
        if (r42 < r9) goto L17;
        r42 = r9;
    L17:
        System.arraycopy(r0, r3, r7, r8, r42);     // Catch: Throwable -> L23
        this.f4829e += r42;
        if (r42 != r9) goto L20;
    L25:
        monitor-exit(this);
        return r42;
    L20:
        if (r2.available() == 0) goto L25;
        r8 = r8 + r42;
        int r32 = r9 - r42;
    L28:
        int r5 = -1;
        if (this.f4828d != (-1)) goto L40;
        if (r32 < r0.length) goto L40;
        int r43 = r2.read(r7, r8, r32);     // Catch: Throwable -> L23
        if (r43 == (-1)) goto L34;
    L57:
        r32 = r32 - r43;
        if (r32 == 0) goto L59;
        if (r2.available() == 0) goto L63;
        r8 = r8 + r43;
        goto L28
    L63:
        int r92 = r9 - r32;
        monitor-exit(this);
        return r92;
    L59:
        monitor-exit(this);
        return r9;
    L34:
        if (r32 == r9) goto L37;
        r5 = r9 - r32;
    L37:
        monitor-exit(this);
        return r5;
    L40:
        if (m2596d(r2, r0) == (-1)) goto L41;
        if (r0 == this.f4825a) goto L53;
        r0 = this.f4825a;     // Catch: Throwable -> L23
        if (r0 != null) goto L53;
        m2595i();     // Catch: Throwable -> L23
        throw null;     // Catch: Throwable -> L23
    L53:
        int r44 = this.f4826b;     // Catch: Throwable -> L23
        int r52 = this.f4829e;     // Catch: Throwable -> L23
        r43 = r44 - r52;     // Catch: Throwable -> L23
        if (r43 < r32) goto L56;
        r43 = r32;
    L56:
        System.arraycopy(r0, r52, r7, r8, r43);     // Catch: Throwable -> L23
        this.f4829e += r43;
        goto L57
    L41:
        if (r32 == r9) goto L44;
        r5 = r9 - r32;
    L44:
        monitor-exit(this);
        return r5;
    L27:
        r32 = r9;
        goto L28
    L67:
        m2595i();     // Catch: Throwable -> L23
        throw null;     // Catch: Throwable -> L23
    L69:
        m2595i();     // Catch: Throwable -> L23
        throw null;     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        throw th;
    }
}
