package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC2303
public final class C1761 extends java.io.InputStream {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.io.InputStream f5465;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0724 f5466;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f5467;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f5468;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final byte[] f5469;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final byte[] f5470;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final byte[] f5471;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f5472;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int f5473;

    public C1761(@Yue.InterfaceC4418 java.io.InputStream r2, @Yue.InterfaceC4418 Yue.C0724 r3) {
            r1 = this;
            java.lang.String r0 = "input"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "base64"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f5465 = r2
            r1.f5466 = r3
            r2 = 1
            byte[] r2 = new byte[r2]
            r1.f5469 = r2
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r2]
            r1.f5470 = r3
            byte[] r2 = new byte[r2]
            r1.f5471 = r2
            return
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            boolean r0 = r1.f5467
            if (r0 != 0) goto Lc
            r0 = 1
            r1.f5467 = r0
            java.io.InputStream r0 = r1.f5465
            r0.close()
        Lc:
            return
    }

    @Override // java.io.InputStream
    public int read() {
            r4 = this;
            int r0 = r4.f5472
            int r1 = r4.f5473
            r2 = 1
            if (r0 >= r1) goto L14
            byte[] r1 = r4.f5471
            r1 = r1[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r2
            r4.f5472 = r0
            r4.m8366()
            return r1
        L14:
            byte[] r0 = r4.f5469
            r1 = 0
            int r0 = r4.read(r0, r1, r2)
            r3 = -1
            if (r0 == r3) goto L33
            if (r0 != r2) goto L27
            byte[] r0 = r4.f5469
            r0 = r0[r1]
            r3 = r0 & 255(0xff, float:3.57E-43)
            goto L33
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unreachable"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L33:
            return r3
    }

    @Override // java.io.InputStream
    public int read(@Yue.InterfaceC4418 byte[] r10, int r11, int r12) {
            r9 = this;
            java.lang.String r0 = "destination"
            Yue.C3329.m13906(r10, r0)
            if (r11 < 0) goto L8b
            if (r12 < 0) goto L8b
            int r0 = r11 + r12
            int r1 = r10.length
            if (r0 > r1) goto L8b
            boolean r1 = r9.f5467
            if (r1 != 0) goto L83
            boolean r1 = r9.f5468
            r2 = -1
            if (r1 == 0) goto L18
            return r2
        L18:
            r1 = 0
            if (r12 != 0) goto L1c
            return r1
        L1c:
            int r3 = r9.m8363()
            if (r3 < r12) goto L26
            r9.m8361(r10, r11, r12)
            return r12
        L26:
            int r3 = r9.m8363()
            int r12 = r12 - r3
            int r12 = r12 + 2
            int r12 = r12 / 3
            int r12 = r12 * 4
            r3 = r11
        L32:
            boolean r4 = r9.f5468
            if (r4 != 0) goto L7b
            if (r12 <= 0) goto L7b
            byte[] r4 = r9.f5470
            int r4 = r4.length
            int r4 = java.lang.Math.min(r4, r12)
            r5 = r1
        L40:
            boolean r6 = r9.f5468
            if (r6 != 0) goto L63
            if (r5 >= r4) goto L63
            int r6 = r9.m8365()
            r7 = 1
            if (r6 == r2) goto L60
            r8 = 61
            if (r6 == r8) goto L59
            byte[] r7 = r9.f5470
            byte r6 = (byte) r6
            r7[r5] = r6
            int r5 = r5 + 1
            goto L40
        L59:
            int r5 = r9.m8364(r5)
            r9.f5468 = r7
            goto L40
        L60:
            r9.f5468 = r7
            goto L40
        L63:
            if (r6 != 0) goto L74
            if (r5 != r4) goto L68
            goto L74
        L68:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Check failed."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L74:
            int r12 = r12 - r5
            int r4 = r9.m8362(r10, r3, r0, r5)
            int r3 = r3 + r4
            goto L32
        L7b:
            if (r3 != r11) goto L80
            if (r4 == 0) goto L80
            goto L82
        L80:
            int r2 = r3 - r11
        L82:
            return r2
        L83:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "The input stream is closed."
            r10.<init>(r11)
            throw r10
        L8b:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "offset: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = ", length: "
            r1.append(r11)
            r1.append(r12)
            java.lang.String r11 = ", buffer size: "
            r1.append(r11)
            int r10 = r10.length
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m8361(byte[] r4, int r5, int r6) {
            r3 = this;
            byte[] r0 = r3.f5471
            int r1 = r3.f5472
            int r2 = r1 + r6
            Yue.C0586.m2170(r0, r4, r5, r1, r2)
            int r4 = r3.f5472
            int r4 = r4 + r6
            r3.f5472 = r4
            r3.m8366()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m8362(byte[] r8, int r9, int r10, int r11) {
            r7 = this;
            int r6 = r7.f5473
            Yue.ۥ۟ۢۥ r0 = r7.f5466
            byte[] r1 = r7.f5470
            byte[] r2 = r7.f5471
            r4 = 0
            r3 = r6
            r5 = r11
            int r11 = r0.m4501(r1, r2, r3, r4, r5)
            int r6 = r6 + r11
            r7.f5473 = r6
            int r11 = r7.m8363()
            int r10 = r10 - r9
            int r10 = java.lang.Math.min(r11, r10)
            r7.m8361(r8, r9, r10)
            r7.m8367()
            return r10
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m8363() {
            r2 = this;
            int r0 = r2.f5473
            int r1 = r2.f5472
            int r0 = r0 - r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m8364(int r5) {
            r4 = this;
            byte[] r0 = r4.f5470
            r1 = 61
            r0[r5] = r1
            r0 = r5 & 3
            r1 = 2
            if (r0 != r1) goto L1a
            int r0 = r4.m8365()
            if (r0 < 0) goto L18
            byte[] r2 = r4.f5470
            int r3 = r5 + 1
            byte r0 = (byte) r0
            r2[r3] = r0
        L18:
            int r5 = r5 + r1
            goto L1c
        L1a:
            int r5 = r5 + 1
        L1c:
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m8365() {
            r2 = this;
            Yue.ۥ۟ۢۥ r0 = r2.f5466
            boolean r0 = r0.m4511()
            if (r0 != 0) goto Lf
            java.io.InputStream r0 = r2.f5465
            int r0 = r0.read()
            return r0
        Lf:
            java.io.InputStream r0 = r2.f5465
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto L1e
            boolean r1 = Yue.C0729.m4541(r0)
            if (r1 == 0) goto Lf
        L1e:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m8366() {
            r2 = this;
            int r0 = r2.f5472
            int r1 = r2.f5473
            if (r0 != r1) goto Lb
            r0 = 0
            r2.f5472 = r0
            r2.f5473 = r0
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m8367() {
            r4 = this;
            byte[] r0 = r4.f5471
            int r1 = r0.length
            int r2 = r4.f5473
            int r1 = r1 - r2
            byte[] r3 = r4.f5470
            int r3 = r3.length
            int r3 = r3 / 4
            int r3 = r3 * 3
            if (r3 <= r1) goto L1e
            int r1 = r4.f5472
            r3 = 0
            Yue.C0586.m2170(r0, r0, r3, r1, r2)
            int r0 = r4.f5473
            int r1 = r4.f5472
            int r0 = r0 - r1
            r4.f5473 = r0
            r4.f5472 = r3
        L1e:
            return
    }
}
