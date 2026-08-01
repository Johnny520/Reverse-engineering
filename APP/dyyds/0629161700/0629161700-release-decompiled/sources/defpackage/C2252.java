package defpackage;

/* JADX INFO: renamed from: ᲈᛵᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2252 implements defpackage.InterfaceC1810 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f9577;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1569 f9578;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC2182 f9579;

    public C2252(defpackage.InterfaceC2182 r1) {
            r0 = this;
            r0.<init>()
            r0.f9579 = r1
            ᛸᲁᛵ r1 = new ᛸᲁᛵ
            r1.<init>()
            r0.f9578 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
            r2 = this;
            boolean r0 = r2.f9577
            if (r0 != 0) goto L13
            r0 = 1
            r2.f9577 = r0
            ᲈᛱᲇᛳ r0 = r2.f9579
            r0.close()
            ᛸᲁᛵ r2 = r2.f9578
            long r0 = r2.f6928
            r2.m2847(r0)
        L13:
            return
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
            r0 = this;
            boolean r0 = r0.f9577
            r0 = r0 ^ 1
            return r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer r6) {
            r5 = this;
            ᛸᲁᛵ r0 = r5.f9578
            long r1 = r0.f6928
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1a
            ᲈᛱᲇᛳ r5 = r5.f9579
            r1 = 8192(0x2000, double:4.0474E-320)
            long r1 = r5.mo782(r1, r0)
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1a
            r5 = -1
            return r5
        L1a:
            int r5 = r0.read(r6)
            return r5
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffer("
            r0.<init>(r1)
            ᲈᛱᲇᛳ r2 = r2.f9579
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.C1128 m3638(long r1) {
            r0 = this;
            r0.m3644(r1)
            ᛸᲁᛵ r0 = r0.f9578
            ᛶᛸᛸᛶ r0 = r0.m2839(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public final boolean m3639(long r7) {
            r6 = this;
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L2a
            boolean r0 = r6.f9577
            if (r0 != 0) goto L24
        Lb:
            ᛸᲁᛵ r0 = r6.f9578
            long r2 = r0.f6928
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 >= 0) goto L22
            ᲈᛱᲇᛳ r2 = r6.f9579
            r3 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.mo782(r3, r0)
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto Lb
            return r1
        L22:
            r6 = 1
            return r6
        L24:
            java.lang.String r6 = "closed"
            defpackage.C2264.m3676(r6)
            return r1
        L2a:
            java.lang.String r6 = "byteCount < 0: "
            defpackage.C2264.m3672(r6, r7)
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final int m3640() {
            r2 = this;
            r0 = 4
            r2.m3644(r0)
            ᛸᲁᛵ r2 = r2.f9578
            int r2 = r2.m2852()
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final byte m3641() {
            r2 = this;
            r0 = 1
            r2.m3644(r0)
            ᛸᲁᛵ r2 = r2.f9578
            byte r2 = r2.m2831()
            return r2
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final short m3642() {
            r2 = this;
            r0 = 2
            r2.m3644(r0)
            ᛸᲁᛵ r2 = r2.f9578
            short r2 = r2.m2832()
            return r2
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final int m3643() {
            r2 = this;
            r0 = 4
            r2.m3644(r0)
            ᛸᲁᛵ r2 = r2.f9578
            int r2 = r2.m2852()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r2
            int r0 = r0 >>> 24
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r2
            int r1 = r1 >>> 8
            r0 = r0 | r1
            r1 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            int r1 = r1 << 8
            r0 = r0 | r1
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    @Override // defpackage.InterfaceC1810
    /* JADX INFO: renamed from: ᛴᲀᲁᛴ */
    public final java.lang.String mo2840(java.nio.charset.Charset r3) {
            r2 = this;
            ᲈᛱᲇᛳ r0 = r2.f9579
            ᛸᲁᛵ r2 = r2.f9578
            r2.m2836(r0)
            long r0 = r2.f6928
            java.lang.String r2 = r2.m2842(r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public final void m3644(long r1) {
            r0 = this;
            boolean r0 = r0.m3639(r1)
            if (r0 == 0) goto L7
            return
        L7:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1077 mo1707() {
            r0 = this;
            ᲈᛱᲇᛳ r0 = r0.f9579
            ᛶᛵᛸᛱ r0 = r0.mo1707()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean m3645() {
            r6 = this;
            boolean r0 = r6.f9577
            r1 = 0
            if (r0 != 0) goto L1e
            ᛸᲁᛵ r0 = r6.f9578
            boolean r2 = r0.m2848()
            if (r2 == 0) goto L1d
            ᲈᛱᲇᛳ r6 = r6.f9579
            r2 = 8192(0x2000, double:4.0474E-320)
            long r2 = r6.mo782(r2, r0)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1d
            r6 = 1
            return r6
        L1d:
            return r1
        L1e:
            java.lang.String r6 = "closed"
            defpackage.C2264.m3676(r6)
            return r1
    }

    @Override // defpackage.InterfaceC1810
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final byte[] mo2851() {
            r2 = this;
            ᲈᛱᲇᛳ r0 = r2.f9579
            ᛸᲁᛵ r2 = r2.f9578
            r2.m2836(r0)
            long r0 = r2.f6928
            byte[] r2 = r2.m2833(r0)
            return r2
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public final java.lang.String m3646(long r22) {
            r21 = this;
            r6 = r22
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto Lf0
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r12 = 1
            if (r0 != 0) goto L15
            r4 = r10
            goto L18
        L15:
            long r0 = r6 + r12
            r4 = r0
        L18:
            r1 = 10
            r2 = 0
            r0 = r21
            long r1 = r0.m3648(r1, r2, r4)
            r14 = -1
            int r3 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            ᛸᲁᛵ r14 = r0.f9578
            if (r3 == 0) goto L2f
            java.lang.String r0 = defpackage.AbstractC2066.m3472(r1, r14)
            return r0
        L2f:
            int r1 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r1 >= 0) goto L58
            boolean r1 = r0.m3639(r4)
            if (r1 == 0) goto L58
            long r1 = r4 - r12
            byte r1 = r14.m2857(r1)
            r2 = 13
            if (r1 != r2) goto L58
            long r1 = r4 + r12
            boolean r0 = r0.m3639(r1)
            if (r0 == 0) goto L58
            byte r0 = r14.m2857(r4)
            r1 = 10
            if (r0 != r1) goto L58
            java.lang.String r0 = defpackage.AbstractC2066.m3472(r4, r14)
            return r0
        L58:
            ᛸᲁᛵ r0 = new ᛸᲁᛵ
            r0.<init>()
            long r1 = r14.f6928
            r3 = 32
            long r19 = java.lang.Math.min(r3, r1)
            long r1 = r14.f6928
            r17 = 0
            r15 = r1
            defpackage.AbstractC1171.m2271(r15, r17, r19)
            int r1 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r1 == 0) goto Lbf
            long r1 = r0.f6928
            long r1 = r1 + r19
            r0.f6928 = r1
            ᲁᲇᛶᛶ r1 = r14.f6929
        L79:
            int r2 = r1.f8466
            int r3 = r1.f8468
            int r2 = r2 - r3
            long r2 = (long) r2
            int r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r4 < 0) goto L88
            long r17 = r17 - r2
            ᲁᲇᛶᛶ r1 = r1.f8469
            goto L79
        L88:
            r2 = r17
            r4 = r19
        L8c:
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 <= 0) goto Lbf
            ᲁᲇᛶᛶ r10 = r1.m3360()
            int r11 = r10.f8468
            int r2 = (int) r2
            int r11 = r11 + r2
            r10.f8468 = r11
            int r2 = (int) r4
            int r11 = r11 + r2
            int r2 = r10.f8466
            int r2 = java.lang.Math.min(r11, r2)
            r10.f8466 = r2
            ᲁᲇᛶᛶ r2 = r0.f6929
            if (r2 != 0) goto Laf
            r10.f8470 = r10
            r10.f8469 = r10
            r0.f6929 = r10
            goto Lb4
        Laf:
            ᲁᲇᛶᛶ r2 = r2.f8470
            r2.m3362(r10)
        Lb4:
            int r2 = r10.f8466
            int r3 = r10.f8468
            int r2 = r2 - r3
            long r2 = (long) r2
            long r4 = r4 - r2
            ᲁᲇᛶᛶ r1 = r1.f8469
            r2 = r8
            goto L8c
        Lbf:
            java.io.EOFException r1 = new java.io.EOFException
            long r2 = r14.f6928
            long r2 = java.lang.Math.min(r2, r6)
            long r4 = r0.f6928
            ᛶᛸᛸᛶ r0 = r0.m2839(r4)
            java.lang.String r0 = r0.mo2162()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "\\n not found: limit="
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " content="
            r4.append(r2)
            r4.append(r0)
            r0 = 8230(0x2026, float:1.1533E-41)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        Lf0:
            java.lang.String r0 = "limit < 0: "
            defpackage.C2264.m3672(r0, r6)
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC1810
    /* JADX INFO: renamed from: ᲁᛱᛲᲈ */
    public final java.io.InputStream mo2853() {
            r2 = this;
            ᲇᛱᛶᲀ r0 = new ᲇᛱᛶᲀ
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @Override // defpackage.InterfaceC1810
    /* JADX INFO: renamed from: ᲇᛱᛸᲇ */
    public final int mo2854(defpackage.C2248 r7) {
            r6 = this;
            boolean r0 = r6.f9577
            if (r0 != 0) goto L2d
        L4:
            r0 = 1
            ᛸᲁᛵ r1 = r6.f9578
            int r0 = defpackage.AbstractC2066.m3473(r1, r7, r0)
            r2 = -2
            r3 = -1
            if (r0 == r2) goto L1e
            if (r0 == r3) goto L2c
            ᛶᛸᛸᛶ[] r6 = r7.f9566
            r6 = r6[r0]
            int r6 = r6.mo2165()
            long r6 = (long) r6
            r1.m2847(r6)
            return r0
        L1e:
            ᲈᛱᲇᛳ r0 = r6.f9579
            r4 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.mo782(r4, r1)
            r4 = -1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L4
        L2c:
            return r3
        L2d:
            java.lang.String r6 = "closed"
            defpackage.C2264.m3676(r6)
            r6 = 0
            return r6
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final long mo782(long r7, defpackage.C1569 r9) {
            r6 = this;
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L35
            boolean r3 = r6.f9577
            if (r3 != 0) goto L2f
            ᛸᲁᛵ r3 = r6.f9578
            long r4 = r3.f6928
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L24
            if (r2 != 0) goto L15
            return r0
        L15:
            ᲈᛱᲇᛳ r6 = r6.f9579
            r0 = 8192(0x2000, double:4.0474E-320)
            long r0 = r6.mo782(r0, r3)
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L24
            return r4
        L24:
            long r0 = r3.f6928
            long r6 = java.lang.Math.min(r7, r0)
            long r6 = r3.mo782(r6, r9)
            return r6
        L2f:
            java.lang.String r6 = "closed"
            defpackage.C2264.m3676(r6)
            return r0
        L35:
            java.lang.String r6 = "byteCount < 0: "
            defpackage.C2264.m3672(r6, r7)
            return r0
    }

    /* JADX INFO: renamed from: ᲈᛸᲇ, reason: contains not printable characters */
    public final void m3647(long r6) {
            r5 = this;
            boolean r0 = r5.f9577
            if (r0 != 0) goto L33
        L4:
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L32
            ᛸᲁᛵ r2 = r5.f9578
            long r3 = r2.f6928
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L27
            ᲈᛱᲇᛳ r0 = r5.f9579
            r3 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.mo782(r3, r2)
            r3 = -1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L21
            goto L27
        L21:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L27:
            long r0 = r2.f6928
            long r0 = java.lang.Math.min(r6, r0)
            r2.m2847(r0)
            long r6 = r6 - r0
            goto L4
        L32:
            return
        L33:
            java.lang.String r5 = "closed"
            defpackage.C2264.m3676(r5)
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final long m3648(byte r23, long r24, long r26) {
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r26
            boolean r4 = r0.f9577
            r5 = 0
            if (r4 != 0) goto L133
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 > 0) goto L12b
            r7 = r5
        L11:
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L128
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            ᛸᲁᛵ r11 = r0.f9578
            if (r4 > 0) goto Lfe
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 > 0) goto Lfe
            long r12 = r11.f6928
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 <= 0) goto L27
            r14 = r12
            goto L28
        L27:
            r14 = r2
        L28:
            int r4 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r4 != 0) goto L32
        L2c:
            r24 = r5
        L2e:
            r16 = -1
            goto Ldc
        L32:
            ᲁᲇᛶᛶ r4 = r11.f6929
            if (r4 != 0) goto L37
            goto L2c
        L37:
            long r16 = r12 - r7
            int r16 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r16 >= 0) goto L8c
        L3d:
            int r16 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r16 <= 0) goto L4f
            ᲁᲇᛶᛶ r4 = r4.f8470
            r24 = r5
            int r5 = r4.f8466
            int r6 = r4.f8468
            int r5 = r5 - r6
            long r5 = (long) r5
            long r12 = r12 - r5
            r5 = r24
            goto L3d
        L4f:
            r24 = r5
            r5 = r7
        L52:
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L2e
            r16 = -1
            byte[] r9 = r4.f8467
            int r10 = r4.f8466
            r18 = r5
            long r5 = (long) r10
            int r10 = r4.f8468
            r20 = r9
            long r9 = (long) r10
            long r9 = r9 + r14
            long r9 = r9 - r12
            long r5 = java.lang.Math.min(r5, r9)
            int r5 = (int) r5
            int r6 = r4.f8468
            long r9 = (long) r6
            long r9 = r9 + r18
            long r9 = r9 - r12
            int r6 = (int) r9
        L72:
            if (r6 >= r5) goto L81
            r9 = r20[r6]
            if (r9 != r1) goto L7e
            int r4 = r4.f8468
            int r6 = r6 - r4
            long r4 = (long) r6
            long r4 = r4 + r12
            goto Lde
        L7e:
            int r6 = r6 + 1
            goto L72
        L81:
            int r5 = r4.f8466
            int r6 = r4.f8468
            int r5 = r5 - r6
            long r5 = (long) r5
            long r5 = r5 + r12
            ᲁᲇᛶᛶ r4 = r4.f8469
            r12 = r5
            goto L52
        L8c:
            r24 = r5
            r16 = -1
        L90:
            int r9 = r4.f8466
            int r10 = r4.f8468
            int r9 = r9 - r10
            long r9 = (long) r9
            long r9 = r9 + r5
            int r12 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r12 > 0) goto L9f
            ᲁᲇᛶᛶ r4 = r4.f8469
            r5 = r9
            goto L90
        L9f:
            r9 = r7
        La0:
            int r12 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r12 >= 0) goto Ldc
            byte[] r12 = r4.f8467
            int r13 = r4.f8466
            r18 = r5
            long r5 = (long) r13
            int r13 = r4.f8468
            r20 = r9
            long r9 = (long) r13
            long r9 = r9 + r14
            long r9 = r9 - r18
            long r5 = java.lang.Math.min(r5, r9)
            int r5 = (int) r5
            int r6 = r4.f8468
            long r9 = (long) r6
            long r9 = r9 + r20
            long r9 = r9 - r18
            int r6 = (int) r9
        Lc0:
            if (r6 >= r5) goto Ld0
            r9 = r12[r6]
            if (r9 != r1) goto Lcd
            int r4 = r4.f8468
            int r6 = r6 - r4
            long r4 = (long) r6
            long r4 = r4 + r18
            goto Lde
        Lcd:
            int r6 = r6 + 1
            goto Lc0
        Ld0:
            int r5 = r4.f8466
            int r6 = r4.f8468
            int r5 = r5 - r6
            long r5 = (long) r5
            long r9 = r18 + r5
            ᲁᲇᛶᛶ r4 = r4.f8469
            r5 = r9
            goto La0
        Ldc:
            r4 = r16
        Lde:
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 == 0) goto Le3
            return r4
        Le3:
            long r4 = r11.f6928
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L12a
            ᲈᛱᲇᛳ r6 = r0.f9579
            r9 = 8192(0x2000, double:4.0474E-320)
            long r9 = r6.mo782(r9, r11)
            int r6 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r6 != 0) goto Lf6
            goto L12a
        Lf6:
            long r7 = java.lang.Math.max(r7, r4)
            r5 = r24
            goto L11
        Lfe:
            long r0 = r11.f6928
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "size="
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " fromIndex="
            r4.append(r0)
            r4.append(r7)
            java.lang.String r0 = " toIndex="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L128:
            r16 = -1
        L12a:
            return r16
        L12b:
            r24 = r5
            java.lang.String r0 = "fromIndex=0 toIndex="
            defpackage.C2264.m3672(r0, r2)
            return r24
        L133:
            r24 = r5
            java.lang.String r0 = "closed"
            defpackage.C2264.m3676(r0)
            return r24
    }
}
