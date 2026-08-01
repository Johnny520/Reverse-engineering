package defpackage;

/* JADX INFO: renamed from: ᲈᛵᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2250 extends java.io.FilterInputStream {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C2063 f9570;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f9571;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f9572;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public volatile byte[] f9573;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f9574;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f9575;

    public C2250(java.io.InputStream r2, defpackage.C2063 r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = -1
            r1.f9574 = r2
            r1.f9570 = r3
            java.lang.Class<byte[]> r2 = byte[].class
            r0 = 65536(0x10000, float:9.1835E-41)
            java.lang.Object r2 = r3.m3464(r2, r0)
            byte[] r2 = (byte[]) r2
            r1.f9573 = r2
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static void m3635() {
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "BufferedInputStream is closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
            r3 = this;
            monitor-enter(r3)
            java.io.InputStream r0 = r3.in     // Catch: java.lang.Throwable -> L15
            byte[] r1 = r3.f9573     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            if (r0 == 0) goto L17
            int r1 = r3.f9572     // Catch: java.lang.Throwable -> L15
            int r2 = r3.f9575     // Catch: java.lang.Throwable -> L15
            int r1 = r1 - r2
            int r0 = r0.available()     // Catch: java.lang.Throwable -> L15
            int r1 = r1 + r0
            monitor-exit(r3)
            return r1
        L15:
            r0 = move-exception
            goto L1c
        L17:
            m3635()     // Catch: java.lang.Throwable -> L15
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L15
        L1c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r3 = this;
            byte[] r0 = r3.f9573
            r1 = 0
            if (r0 == 0) goto Le
            ᲇᛶᛳᛱ r0 = r3.f9570
            byte[] r2 = r3.f9573
            r0.m3468(r2)
            r3.f9573 = r1
        Le:
            java.io.InputStream r0 = r3.in
            r3.in = r1
            if (r0 == 0) goto L17
            r0.close()
        L17:
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int r2) {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f9571     // Catch: java.lang.Throwable -> Lf
            int r2 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> Lf
            r1.f9571 = r2     // Catch: java.lang.Throwable -> Lf
            int r2 = r1.f9575     // Catch: java.lang.Throwable -> Lf
            r1.f9574 = r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Lf:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f9573     // Catch: java.lang.Throwable -> L19
            java.io.InputStream r1 = r6.in     // Catch: java.lang.Throwable -> L19
            r2 = 0
            if (r0 == 0) goto L3b
            if (r1 == 0) goto L3b
            int r3 = r6.f9575     // Catch: java.lang.Throwable -> L19
            int r4 = r6.f9572     // Catch: java.lang.Throwable -> L19
            r5 = -1
            if (r3 < r4) goto L1b
            int r1 = r6.m3636(r1, r0)     // Catch: java.lang.Throwable -> L19
            if (r1 != r5) goto L1b
            monitor-exit(r6)
            return r5
        L19:
            r0 = move-exception
            goto L3f
        L1b:
            byte[] r1 = r6.f9573     // Catch: java.lang.Throwable -> L19
            if (r0 == r1) goto L28
            byte[] r0 = r6.f9573     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L24
            goto L28
        L24:
            m3635()     // Catch: java.lang.Throwable -> L19
            throw r2     // Catch: java.lang.Throwable -> L19
        L28:
            int r1 = r6.f9572     // Catch: java.lang.Throwable -> L19
            int r2 = r6.f9575     // Catch: java.lang.Throwable -> L19
            int r1 = r1 - r2
            if (r1 <= 0) goto L39
            int r1 = r2 + 1
            r6.f9575 = r1     // Catch: java.lang.Throwable -> L19
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L19
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L39:
            monitor-exit(r6)
            return r5
        L3b:
            m3635()     // Catch: java.lang.Throwable -> L19
            throw r2     // Catch: java.lang.Throwable -> L19
        L3f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] r7, int r8, int r9) {
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f9573     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            if (r0 == 0) goto L86
            if (r9 != 0) goto Lb
            monitor-exit(r6)
            r6 = 0
            return r6
        Lb:
            java.io.InputStream r2 = r6.in     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L82
            int r3 = r6.f9575     // Catch: java.lang.Throwable -> L2e
            int r4 = r6.f9572     // Catch: java.lang.Throwable -> L2e
            if (r3 >= r4) goto L32
            int r4 = r4 - r3
            if (r4 < r9) goto L19
            r4 = r9
        L19:
            java.lang.System.arraycopy(r0, r3, r7, r8, r4)     // Catch: java.lang.Throwable -> L2e
            int r3 = r6.f9575     // Catch: java.lang.Throwable -> L2e
            int r3 = r3 + r4
            r6.f9575 = r3     // Catch: java.lang.Throwable -> L2e
            if (r4 == r9) goto L30
            int r3 = r2.available()     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L2a
            goto L30
        L2a:
            int r8 = r8 + r4
            int r3 = r9 - r4
            goto L33
        L2e:
            r7 = move-exception
            goto L8a
        L30:
            monitor-exit(r6)
            return r4
        L32:
            r3 = r9
        L33:
            int r4 = r6.f9574     // Catch: java.lang.Throwable -> L2e
            r5 = -1
            if (r4 != r5) goto L48
            int r4 = r0.length     // Catch: java.lang.Throwable -> L2e
            if (r3 < r4) goto L48
            int r4 = r2.read(r7, r8, r3)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r5) goto L72
            if (r3 != r9) goto L44
            goto L46
        L44:
            int r5 = r9 - r3
        L46:
            monitor-exit(r6)
            return r5
        L48:
            int r4 = r6.m3636(r2, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r5) goto L55
            if (r3 != r9) goto L51
            goto L53
        L51:
            int r5 = r9 - r3
        L53:
            monitor-exit(r6)
            return r5
        L55:
            byte[] r4 = r6.f9573     // Catch: java.lang.Throwable -> L2e
            if (r0 == r4) goto L62
            byte[] r0 = r6.f9573     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L5e
            goto L62
        L5e:
            m3635()     // Catch: java.lang.Throwable -> L2e
            throw r1     // Catch: java.lang.Throwable -> L2e
        L62:
            int r4 = r6.f9572     // Catch: java.lang.Throwable -> L2e
            int r5 = r6.f9575     // Catch: java.lang.Throwable -> L2e
            int r4 = r4 - r5
            if (r4 < r3) goto L6a
            r4 = r3
        L6a:
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)     // Catch: java.lang.Throwable -> L2e
            int r5 = r6.f9575     // Catch: java.lang.Throwable -> L2e
            int r5 = r5 + r4
            r6.f9575 = r5     // Catch: java.lang.Throwable -> L2e
        L72:
            int r3 = r3 - r4
            if (r3 != 0) goto L77
            monitor-exit(r6)
            return r9
        L77:
            int r5 = r2.available()     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L80
            int r9 = r9 - r3
            monitor-exit(r6)
            return r9
        L80:
            int r8 = r8 + r4
            goto L33
        L82:
            m3635()     // Catch: java.lang.Throwable -> L2e
            throw r1     // Catch: java.lang.Throwable -> L2e
        L86:
            m3635()     // Catch: java.lang.Throwable -> L2e
            throw r1     // Catch: java.lang.Throwable -> L2e
        L8a:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2e
            throw r7
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
            r3 = this;
            java.lang.String r0 = "Mark has been invalidated, pos: "
            monitor-enter(r3)
            byte[] r1 = r3.f9573     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L30
            int r1 = r3.f9574     // Catch: java.lang.Throwable -> L10
            r2 = -1
            if (r2 == r1) goto L12
            r3.f9575 = r1     // Catch: java.lang.Throwable -> L10
            monitor-exit(r3)
            return
        L10:
            r0 = move-exception
            goto L38
        L12:
            ᛳᛳᛵᛶ r1 = new ᛳᛳᛵᛶ     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L10
            int r0 = r3.f9575     // Catch: java.lang.Throwable -> L10
            r2.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = " markLimit: "
            r2.append(r0)     // Catch: java.lang.Throwable -> L10
            int r0 = r3.f9571     // Catch: java.lang.Throwable -> L10
            r2.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L10
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L10
            throw r1     // Catch: java.lang.Throwable -> L10
        L30:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = "Stream is closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L10
            throw r0     // Catch: java.lang.Throwable -> L10
        L38:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long r11) {
            r10 = this;
            monitor-enter(r10)
            r0 = 1
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto Lb
            monitor-exit(r10)
            return r1
        Lb:
            byte[] r0 = r10.f9573     // Catch: java.lang.Throwable -> L26
            r3 = 0
            if (r0 == 0) goto L70
            java.io.InputStream r4 = r10.in     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L6c
            int r3 = r10.f9572     // Catch: java.lang.Throwable -> L26
            int r5 = r10.f9575     // Catch: java.lang.Throwable -> L26
            int r6 = r3 - r5
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L26
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 < 0) goto L28
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L26
            long r0 = r0 + r11
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L26
            r10.f9575 = r0     // Catch: java.lang.Throwable -> L26
            monitor-exit(r10)
            return r11
        L26:
            r11 = move-exception
            goto L74
        L28:
            long r6 = (long) r3
            long r8 = (long) r5
            long r6 = r6 - r8
            r10.f9575 = r3     // Catch: java.lang.Throwable -> L26
            int r3 = r10.f9574     // Catch: java.lang.Throwable -> L26
            r5 = -1
            if (r3 == r5) goto L5e
            int r3 = r10.f9571     // Catch: java.lang.Throwable -> L26
            long r8 = (long) r3     // Catch: java.lang.Throwable -> L26
            int r3 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r3 > 0) goto L5e
            int r0 = r10.m3636(r4, r0)     // Catch: java.lang.Throwable -> L26
            if (r0 != r5) goto L41
            monitor-exit(r10)
            return r6
        L41:
            int r0 = r10.f9572     // Catch: java.lang.Throwable -> L26
            int r1 = r10.f9575     // Catch: java.lang.Throwable -> L26
            int r2 = r0 - r1
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L26
            long r4 = r11 - r6
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L56
            long r0 = (long) r1     // Catch: java.lang.Throwable -> L26
            long r0 = r0 + r11
            long r0 = r0 - r6
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L26
            r10.f9575 = r0     // Catch: java.lang.Throwable -> L26
            monitor-exit(r10)
            return r11
        L56:
            long r11 = (long) r0
            long r6 = r6 + r11
            long r11 = (long) r1
            long r6 = r6 - r11
            r10.f9575 = r0     // Catch: java.lang.Throwable -> L26
            monitor-exit(r10)
            return r6
        L5e:
            long r11 = r11 - r6
            long r11 = r4.skip(r11)     // Catch: java.lang.Throwable -> L26
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L69
            r10.f9574 = r5     // Catch: java.lang.Throwable -> L26
        L69:
            long r6 = r6 + r11
            monitor-exit(r10)
            return r6
        L6c:
            m3635()     // Catch: java.lang.Throwable -> L26
            throw r3     // Catch: java.lang.Throwable -> L26
        L70:
            m3635()     // Catch: java.lang.Throwable -> L26
            throw r3     // Catch: java.lang.Throwable -> L26
        L74:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L26
            throw r11
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int m3636(java.io.InputStream r6, byte[] r7) {
            r5 = this;
            int r0 = r5.f9574
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L57
            int r3 = r5.f9575
            int r3 = r3 - r0
            int r4 = r5.f9571
            if (r3 < r4) goto Le
            goto L57
        Le:
            if (r0 != 0) goto L36
            int r2 = r7.length
            if (r4 <= r2) goto L36
            int r2 = r5.f9572
            int r3 = r7.length
            if (r2 != r3) goto L36
            int r0 = r7.length
            int r0 = r0 * 2
            if (r0 <= r4) goto L1e
            goto L1f
        L1e:
            r4 = r0
        L1f:
            ᲇᛶᛳᛱ r0 = r5.f9570
            java.lang.Class<byte[]> r2 = byte[].class
            java.lang.Object r0 = r0.m3464(r2, r4)
            byte[] r0 = (byte[]) r0
            int r2 = r7.length
            java.lang.System.arraycopy(r7, r1, r0, r1, r2)
            r5.f9573 = r0
            ᲇᛶᛳᛱ r2 = r5.f9570
            r2.m3468(r7)
            r7 = r0
            goto L3d
        L36:
            if (r0 <= 0) goto L3d
            int r2 = r7.length
            int r2 = r2 - r0
            java.lang.System.arraycopy(r7, r0, r7, r1, r2)
        L3d:
            int r0 = r5.f9575
            int r2 = r5.f9574
            int r0 = r0 - r2
            r5.f9575 = r0
            r5.f9574 = r1
            r5.f9572 = r1
            int r1 = r7.length
            int r1 = r1 - r0
            int r6 = r6.read(r7, r0, r1)
            int r7 = r5.f9575
            if (r6 > 0) goto L53
            goto L54
        L53:
            int r7 = r7 + r6
        L54:
            r5.f9572 = r7
            return r6
        L57:
            int r6 = r6.read(r7)
            if (r6 <= 0) goto L63
            r5.f9574 = r2
            r5.f9575 = r1
            r5.f9572 = r6
        L63:
            return r6
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final synchronized void m3637() {
            r2 = this;
            monitor-enter(r2)
            byte[] r0 = r2.f9573     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            ᲇᛶᛳᛱ r0 = r2.f9570     // Catch: java.lang.Throwable -> L10
            byte[] r1 = r2.f9573     // Catch: java.lang.Throwable -> L10
            r0.m3468(r1)     // Catch: java.lang.Throwable -> L10
            r0 = 0
            r2.f9573 = r0     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r0 = move-exception
            goto L14
        L12:
            monitor-exit(r2)
            return
        L14:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r0
    }
}
