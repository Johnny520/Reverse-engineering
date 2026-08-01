package defpackage;

/* JADX INFO: renamed from: ᛸᲁᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1569 implements defpackage.InterfaceC1810, defpackage.InterfaceC0172, java.lang.Cloneable, java.nio.channels.ByteChannel {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public long f6928;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C1946 f6929;

    public final java.lang.Object clone() {
            r6 = this;
            ᛸᲁᛵ r0 = new ᛸᲁᛵ
            r0.<init>()
            long r1 = r6.f6928
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto Le
            return r0
        Le:
            ᲁᲇᛶᛶ r1 = r6.f6929
            ᲁᲇᛶᛶ r2 = r1.m3360()
            r0.f6929 = r2
            r2.f8470 = r2
            r2.f8469 = r2
            ᲁᲇᛶᛶ r3 = r1.f8469
        L1c:
            if (r3 == r1) goto L2a
            ᲁᲇᛶᛶ r4 = r2.f8470
            ᲁᲇᛶᛶ r5 = r3.m3360()
            r4.m3362(r5)
            ᲁᲇᛶᛶ r3 = r3.f8469
            goto L1c
        L2a:
            long r1 = r6.f6928
            r0.f6928 = r1
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.InterfaceC2085
    public final void close() {
            r0 = this;
            return
    }

    public final boolean equals(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r0 != r1) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof defpackage.C1569
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            long r5 = r0.f6928
            ᛸᲁᛵ r1 = (defpackage.C1569) r1
            long r7 = r1.f6928
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L19
            return r4
        L19:
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L20
            return r2
        L20:
            ᲁᲇᛶᛶ r3 = r0.f6929
            ᲁᲇᛶᛶ r1 = r1.f6929
            int r5 = r3.f8468
            int r6 = r1.f8468
            r9 = r7
        L29:
            long r11 = r0.f6928
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L68
            int r11 = r3.f8466
            int r11 = r11 - r5
            int r12 = r1.f8466
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L3b:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L56
            byte[] r15 = r3.f8467
            int r16 = r5 + 1
            r5 = r15[r5]
            byte[] r15 = r1.f8467
            int r17 = r6 + 1
            r6 = r15[r6]
            if (r5 == r6) goto L4e
            return r4
        L4e:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L3b
        L56:
            int r13 = r3.f8466
            if (r5 != r13) goto L5e
            ᲁᲇᛶᛶ r3 = r3.f8469
            int r5 = r3.f8468
        L5e:
            int r13 = r1.f8466
            if (r6 != r13) goto L66
            ᲁᲇᛶᛶ r1 = r1.f8469
            int r6 = r1.f8468
        L66:
            long r9 = r9 + r11
            goto L29
        L68:
            return r2
    }

    @Override // defpackage.InterfaceC2085, java.io.Flushable
    public final void flush() {
            r0 = this;
            return
    }

    public final int hashCode() {
            r5 = this;
            ᲁᲇᛶᛶ r0 = r5.f6929
            if (r0 != 0) goto L6
            r5 = 0
            return r5
        L6:
            r1 = 1
        L7:
            int r2 = r0.f8468
            int r3 = r0.f8466
        Lb:
            if (r2 >= r3) goto L17
            int r1 = r1 * 31
            byte[] r4 = r0.f8467
            r4 = r4[r2]
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto Lb
        L17:
            ᲁᲇᛶᛶ r0 = r0.f8469
            ᲁᲇᛶᛶ r2 = r5.f6929
            if (r0 != r2) goto L7
            return r1
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer r7) {
            r6 = this;
            ᲁᲇᛶᛶ r0 = r6.f6929
            if (r0 != 0) goto L6
            r6 = -1
            return r6
        L6:
            int r1 = r7.remaining()
            int r2 = r0.f8466
            int r3 = r0.f8468
            int r2 = r2 - r3
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = r0.f8467
            int r3 = r0.f8468
            r7.put(r2, r3, r1)
            int r7 = r0.f8468
            int r7 = r7 + r1
            r0.f8468 = r7
            long r2 = r6.f6928
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.f6928 = r2
            int r2 = r0.f8466
            if (r7 != r2) goto L32
            ᲁᲇᛶᛶ r7 = r0.m3361()
            r6.f6929 = r7
            defpackage.AbstractC1590.m2869(r0)
        L32:
            return r1
    }

    public final int read(byte[] r8, int r9, int r10) {
            r7 = this;
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            defpackage.AbstractC1171.m2271(r1, r3, r5)
            ᲁᲇᛶᛶ r0 = r7.f6929
            if (r0 != 0) goto Ld
            r7 = -1
            return r7
        Ld:
            int r1 = r0.f8466
            int r2 = r0.f8468
            int r1 = r1 - r2
            int r10 = java.lang.Math.min(r10, r1)
            byte[] r1 = r0.f8467
            int r2 = r0.f8468
            int r3 = r2 + r10
            int r3 = r3 - r2
            java.lang.System.arraycopy(r1, r2, r8, r9, r3)
            int r8 = r0.f8468
            int r8 = r8 + r10
            r0.f8468 = r8
            long r1 = r7.f6928
            long r3 = (long) r10
            long r1 = r1 - r3
            r7.f6928 = r1
            int r9 = r0.f8466
            if (r8 != r9) goto L38
            ᲁᲇᛶᛶ r8 = r0.m3361()
            r7.f6929 = r8
            defpackage.AbstractC1590.m2869(r0)
        L38:
            return r10
    }

    public final java.lang.String toString() {
            r4 = this;
            long r0 = r4.f6928
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L13
            int r0 = (int) r0
            ᛶᛸᛸᛶ r4 = r4.m2835(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L13:
            long r0 = r4.f6928
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "size > Int.MAX_VALUE: "
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer r7) {
            r6 = this;
            int r0 = r7.remaining()
            r1 = r0
        L5:
            if (r1 <= 0) goto L22
            r2 = 1
            ᲁᲇᛶᛶ r2 = r6.m2846(r2)
            int r3 = r2.f8466
            int r3 = 8192 - r3
            int r3 = java.lang.Math.min(r1, r3)
            byte[] r4 = r2.f8467
            int r5 = r2.f8466
            r7.get(r4, r5, r3)
            int r1 = r1 - r3
            int r4 = r2.f8466
            int r4 = r4 + r3
            r2.f8466 = r4
            goto L5
        L22:
            long r1 = r6.f6928
            long r3 = (long) r0
            long r1 = r1 + r3
            r6.f6928 = r1
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛳᛷ, reason: contains not printable characters */
    public final void m2830(int r8) {
            r7 = this;
            r0 = 4
            ᲁᲇᛶᛶ r1 = r7.m2846(r0)
            byte[] r2 = r1.f8467
            int r3 = r1.f8466
            int r4 = r3 + 1
            int r5 = r8 >>> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r5 = r3 + 2
            int r6 = r8 >>> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 3
            int r6 = r8 >>> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r2[r5] = r6
            int r3 = r3 + r0
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r2[r4] = r8
            r1.f8466 = r3
            long r0 = r7.f6928
            r2 = 4
            long r0 = r0 + r2
            r7.f6928 = r0
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final byte m2831() {
            r9 = this;
            long r0 = r9.f6928
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L28
            ᲁᲇᛶᛶ r2 = r9.f6929
            int r3 = r2.f8468
            int r4 = r2.f8466
            byte[] r5 = r2.f8467
            int r6 = r3 + 1
            r3 = r5[r3]
            r7 = 1
            long r0 = r0 - r7
            r9.f6928 = r0
            if (r6 != r4) goto L25
            ᲁᲇᛶᛶ r0 = r2.m3361()
            r9.f6929 = r0
            defpackage.AbstractC1590.m2869(r2)
            return r3
        L25:
            r2.f8468 = r6
            return r3
        L28:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>()
            throw r9
    }

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public final short m2832() {
            r11 = this;
            long r0 = r11.f6928
            r2 = 2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L47
            ᲁᲇᛶᛶ r4 = r11.f6929
            int r5 = r4.f8468
            int r6 = r4.f8466
            int r7 = r6 - r5
            r8 = 2
            if (r7 >= r8) goto L24
            byte r0 = r11.m2831()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            byte r11 = r11.m2831()
            r11 = r11 & 255(0xff, float:3.57E-43)
            r11 = r11 | r0
            short r11 = (short) r11
            return r11
        L24:
            byte[] r7 = r4.f8467
            int r9 = r5 + 1
            r10 = r7[r5]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 8
            int r5 = r5 + r8
            r7 = r7[r9]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r7 | r10
            long r0 = r0 - r2
            r11.f6928 = r0
            if (r5 != r6) goto L43
            ᲁᲇᛶᛶ r0 = r4.m3361()
            r11.f6929 = r0
            defpackage.AbstractC1590.m2869(r4)
            goto L45
        L43:
            r4.f8468 = r5
        L45:
            short r11 = (short) r7
            return r11
        L47:
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            throw r11
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final byte[] m2833(long r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L31
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L31
            long r0 = r3.f6928
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L2b
            int r4 = (int) r4
            byte[] r5 = new byte[r4]
            r0 = 0
        L17:
            if (r0 >= r4) goto L2a
            int r1 = r4 - r0
            int r1 = r3.read(r5, r0, r1)
            r2 = -1
            if (r1 == r2) goto L24
            int r0 = r0 + r1
            goto L17
        L24:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L2a:
            return r5
        L2b:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L31:
            java.lang.String r3 = "byteCount: "
            defpackage.C2264.m3672(r3, r4)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final long m2834(defpackage.C1128 r12) {
            r11 = this;
            ᲁᲇᛶᛶ r0 = r11.f6929
            if (r0 != 0) goto L6
            goto L105
        L6:
            long r1 = r11.f6928
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 >= 0) goto L8e
        L11:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L1f
            ᲁᲇᛶᛶ r0 = r0.f8470
            int r5 = r0.f8466
            int r9 = r0.f8468
            int r5 = r5 - r9
            long r9 = (long) r5
            long r1 = r1 - r9
            goto L11
        L1f:
            int r5 = r12.mo2165()
            if (r5 != r6) goto L5a
            byte r5 = r12.mo2160(r7)
            byte r12 = r12.mo2160(r8)
        L2d:
            long r6 = r11.f6928
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L105
            byte[] r6 = r0.f8467
            int r7 = r0.f8468
            long r7 = (long) r7
            long r7 = r7 + r3
            long r7 = r7 - r1
            int r3 = (int) r7
            int r4 = r0.f8466
        L3d:
            if (r3 >= r4) goto L4f
            r7 = r6[r3]
            if (r7 == r5) goto L49
            if (r7 != r12) goto L46
            goto L49
        L46:
            int r3 = r3 + 1
            goto L3d
        L49:
            int r11 = r0.f8468
        L4b:
            int r3 = r3 - r11
            long r11 = (long) r3
            long r11 = r11 + r1
            return r11
        L4f:
            int r3 = r0.f8466
            int r4 = r0.f8468
            int r3 = r3 - r4
            long r3 = (long) r3
            long r3 = r3 + r1
            ᲁᲇᛶᛶ r0 = r0.f8469
            r1 = r3
            goto L2d
        L5a:
            byte[] r12 = r12.mo2161()
        L5e:
            long r5 = r11.f6928
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 >= 0) goto L105
            byte[] r5 = r0.f8467
            int r6 = r0.f8468
            long r8 = (long) r6
            long r8 = r8 + r3
            long r8 = r8 - r1
            int r3 = (int) r8
            int r4 = r0.f8466
        L6e:
            if (r3 >= r4) goto L83
            r6 = r5[r3]
            int r8 = r12.length
            r9 = r7
        L74:
            if (r9 >= r8) goto L80
            r10 = r12[r9]
            if (r6 != r10) goto L7d
        L7a:
            int r11 = r0.f8468
            goto L4b
        L7d:
            int r9 = r9 + 1
            goto L74
        L80:
            int r3 = r3 + 1
            goto L6e
        L83:
            int r3 = r0.f8466
            int r4 = r0.f8468
            int r3 = r3 - r4
            long r3 = (long) r3
            long r3 = r3 + r1
            ᲁᲇᛶᛶ r0 = r0.f8469
            r1 = r3
            goto L5e
        L8e:
            r1 = r3
        L8f:
            int r5 = r0.f8466
            int r9 = r0.f8468
            int r5 = r5 - r9
            long r9 = (long) r5
            long r9 = r9 + r1
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 > 0) goto L9e
            ᲁᲇᛶᛶ r0 = r0.f8469
            r1 = r9
            goto L8f
        L9e:
            int r5 = r12.mo2165()
            if (r5 != r6) goto Ld3
            byte r5 = r12.mo2160(r7)
            byte r12 = r12.mo2160(r8)
        Lac:
            long r6 = r11.f6928
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L105
            byte[] r6 = r0.f8467
            int r7 = r0.f8468
            long r7 = (long) r7
            long r7 = r7 + r3
            long r7 = r7 - r1
            int r3 = (int) r7
            int r4 = r0.f8466
        Lbc:
            if (r3 >= r4) goto Lc8
            r7 = r6[r3]
            if (r7 == r5) goto L49
            if (r7 != r12) goto Lc5
            goto L49
        Lc5:
            int r3 = r3 + 1
            goto Lbc
        Lc8:
            int r3 = r0.f8466
            int r4 = r0.f8468
            int r3 = r3 - r4
            long r3 = (long) r3
            long r3 = r3 + r1
            ᲁᲇᛶᛶ r0 = r0.f8469
            r1 = r3
            goto Lac
        Ld3:
            byte[] r12 = r12.mo2161()
        Ld7:
            long r5 = r11.f6928
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 >= 0) goto L105
            byte[] r5 = r0.f8467
            int r6 = r0.f8468
            long r8 = (long) r6
            long r8 = r8 + r3
            long r8 = r8 - r1
            int r3 = (int) r8
            int r4 = r0.f8466
        Le7:
            if (r3 >= r4) goto Lfa
            r6 = r5[r3]
            int r8 = r12.length
            r9 = r7
        Led:
            if (r9 >= r8) goto Lf7
            r10 = r12[r9]
            if (r6 != r10) goto Lf4
            goto L7a
        Lf4:
            int r9 = r9 + 1
            goto Led
        Lf7:
            int r3 = r3 + 1
            goto Le7
        Lfa:
            int r3 = r0.f8466
            int r4 = r0.f8468
            int r3 = r3 - r4
            long r3 = (long) r3
            long r3 = r3 + r1
            ᲁᲇᛶᛶ r0 = r0.f8469
            r1 = r3
            goto Ld7
        L105:
            r11 = -1
            return r11
    }

    /* JADX INFO: renamed from: ᛳᛳᛳᲈ, reason: contains not printable characters */
    public final defpackage.C1128 m2835(int r8) {
            r7 = this;
            if (r8 != 0) goto L5
            ᛶᛸᛸᛶ r7 = defpackage.C1128.f5017
            return r7
        L5:
            long r0 = r7.f6928
            r2 = 0
            long r4 = (long) r8
            defpackage.AbstractC1171.m2271(r0, r2, r4)
            ᲁᲇᛶᛶ r0 = r7.f6929
            r1 = 0
            r2 = r1
            r3 = r2
        L12:
            if (r2 >= r8) goto L29
            int r4 = r0.f8466
            int r5 = r0.f8468
            if (r4 == r5) goto L21
            int r4 = r4 - r5
            int r2 = r2 + r4
            int r3 = r3 + 1
            ᲁᲇᛶᛶ r0 = r0.f8469
            goto L12
        L21:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "s.limit == s.pos"
            r7.<init>(r8)
            throw r7
        L29:
            byte[][] r0 = new byte[r3][]
            int r2 = r3 * 2
            int[] r2 = new int[r2]
            ᲁᲇᛶᛶ r7 = r7.f6929
            r4 = r1
        L32:
            if (r1 >= r8) goto L51
            byte[] r5 = r7.f8467
            r0[r4] = r5
            int r5 = r7.f8466
            int r6 = r7.f8468
            int r5 = r5 - r6
            int r1 = r1 + r5
            int r5 = java.lang.Math.min(r1, r8)
            r2[r4] = r5
            int r5 = r4 + r3
            int r6 = r7.f8468
            r2[r5] = r6
            r5 = 1
            r7.f8465 = r5
            int r4 = r4 + r5
            ᲁᲇᛶᛶ r7 = r7.f8469
            goto L32
        L51:
            ᛸᛲᛷᲇ r7 = new ᛸᛲᛷᲇ
            r7.<init>(r0, r2)
            return r7
    }

    /* JADX INFO: renamed from: ᛳᛸᛱᲇ, reason: contains not printable characters */
    public final void m2836(defpackage.InterfaceC2182 r5) {
            r4 = this;
        L0:
            r0 = 8192(0x2000, double:4.0474E-320)
            long r0 = r5.mo782(r0, r4)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld
            goto L0
        Ld:
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final long m2837() {
            r15 = this;
            long r0 = r15.f6928
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La6
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            ᲁᲇᛶᛶ r7 = r15.f6929
            byte[] r8 = r7.f8467
            int r9 = r7.f8468
            int r10 = r7.f8466
        L14:
            if (r9 >= r10) goto L8b
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L23
            r12 = 57
            if (r11 > r12) goto L23
            int r12 = r11 + (-48)
            goto L38
        L23:
            r12 = 97
            if (r11 < r12) goto L2e
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L2e
            int r12 = r11 + (-87)
            goto L38
        L2e:
            r12 = 65
            if (r11 < r12) goto L63
            r12 = 70
            if (r11 > r12) goto L63
            int r12 = r11 + (-55)
        L38:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L48
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L14
        L48:
            ᛸᲁᛵ r15 = new ᛸᲁᛵ
            r15.<init>()
            r15.m2843(r4)
            r15.m2855(r11)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r15 = r15.m2856()
            java.lang.String r1 = "Number too large: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        L63:
            r6 = 1
            if (r1 == 0) goto L67
            goto L8b
        L67:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            char[] r1 = defpackage.AbstractC1754.f7742
            int r2 = r11 >> 4
            r2 = r2 & 15
            char r2 = r1[r2]
            r3 = r11 & 15
            char r1 = r1[r3]
            r3 = 2
            char[] r3 = new char[r3]
            r3[r0] = r2
            r3[r6] = r1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r15.<init>(r0)
            throw r15
        L8b:
            if (r9 != r10) goto L97
            ᲁᲇᛶᛶ r8 = r7.m3361()
            r15.f6929 = r8
            defpackage.AbstractC1590.m2869(r7)
            goto L99
        L97:
            r7.f8468 = r9
        L99:
            if (r6 != 0) goto L9f
            ᲁᲇᛶᛶ r7 = r15.f6929
            if (r7 != 0) goto Lc
        L9f:
            long r2 = r15.f6928
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f6928 = r2
            return r4
        La6:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
    }

    /* JADX INFO: renamed from: ᛴᛴᛲᲈ, reason: contains not printable characters */
    public final void m2838(java.lang.String r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length()
            r2.m2844(r3, r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final defpackage.C1128 m2839(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L32
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L32
            long r0 = r2.f6928
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L2c
            r0 = 4096(0x1000, double:2.0237E-320)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L22
            int r0 = (int) r3
            ᛶᛸᛸᛶ r0 = r2.m2835(r0)
            r2.m2847(r3)
            return r0
        L22:
            ᛶᛸᛸᛶ r0 = new ᛶᛸᛸᛶ
            byte[] r2 = r2.m2833(r3)
            r0.<init>(r2)
            return r0
        L2c:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L32:
            java.lang.String r2 = "byteCount: "
            defpackage.C2264.m3672(r2, r3)
            r2 = 0
            return r2
    }

    @Override // defpackage.InterfaceC2085
    /* JADX INFO: renamed from: ᛴᛸᲈᲈ */
    public final void mo484(long r9, defpackage.C1569 r11) {
            r8 = this;
            if (r11 == r8) goto Ld9
            long r0 = r11.f6928
            r2 = 0
            r4 = r9
            defpackage.AbstractC1171.m2271(r0, r2, r4)
        La:
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto Ld8
            ᲁᲇᛶᛶ r0 = r11.f6929
            int r1 = r0.f8466
            int r2 = r0.f8468
            int r1 = r1 - r2
            long r2 = (long) r1
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r3 = 0
            if (r2 >= 0) goto L84
            ᲁᲇᛶᛶ r2 = r8.f6929
            if (r2 == 0) goto L24
            ᲁᲇᛶᛶ r2 = r2.f8470
            goto L25
        L24:
            r2 = 0
        L25:
            if (r2 == 0) goto L4e
            boolean r4 = r2.f8464
            if (r4 == 0) goto L4e
            int r4 = r2.f8466
            long r4 = (long) r4
            long r4 = r4 + r9
            boolean r6 = r2.f8465
            if (r6 == 0) goto L35
            r6 = r3
            goto L37
        L35:
            int r6 = r2.f8468
        L37:
            long r6 = (long) r6
            long r4 = r4 - r6
            r6 = 8192(0x2000, double:4.0474E-320)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L4e
            int r1 = (int) r9
            r0.m3359(r2, r1)
            long r0 = r11.f6928
            long r0 = r0 - r9
            r11.f6928 = r0
            long r0 = r8.f6928
            long r0 = r0 + r9
            r8.f6928 = r0
            return
        L4e:
            int r2 = (int) r9
            if (r2 <= 0) goto L7e
            if (r2 > r1) goto L7e
            r1 = 1024(0x400, float:1.435E-42)
            if (r2 < r1) goto L5c
            ᲁᲇᛶᛶ r1 = r0.m3360()
            goto L6b
        L5c:
            ᲁᲇᛶᛶ r1 = defpackage.AbstractC1590.m2870()
            byte[] r4 = r0.f8467
            byte[] r5 = r1.f8467
            int r6 = r0.f8468
            int r7 = r6 + r2
            defpackage.AbstractC2315.m3772(r4, r5, r6, r7)
        L6b:
            int r4 = r1.f8468
            int r4 = r4 + r2
            r1.f8466 = r4
            int r4 = r0.f8468
            int r4 = r4 + r2
            r0.f8468 = r4
            ᲁᲇᛶᛶ r0 = r0.f8470
            r0.m3362(r1)
            r11.f6929 = r1
            r0 = r1
            goto L84
        L7e:
            java.lang.String r8 = "byteCount out of range"
            defpackage.C2264.m3684(r8)
            return
        L84:
            int r1 = r0.f8466
            int r2 = r0.f8468
            int r1 = r1 - r2
            long r1 = (long) r1
            ᲁᲇᛶᛶ r4 = r0.m3361()
            r11.f6929 = r4
            ᲁᲇᛶᛶ r4 = r8.f6929
            if (r4 != 0) goto L9b
            r8.f6929 = r0
            r0.f8470 = r0
            r0.f8469 = r0
            goto Lc6
        L9b:
            ᲁᲇᛶᛶ r4 = r4.f8470
            r4.m3362(r0)
            ᲁᲇᛶᛶ r4 = r0.f8470
            if (r4 == r0) goto Ld3
            boolean r5 = r4.f8464
            if (r5 != 0) goto La9
            goto Lc6
        La9:
            int r5 = r0.f8466
            int r6 = r0.f8468
            int r5 = r5 - r6
            int r6 = r4.f8466
            int r6 = 8192 - r6
            boolean r7 = r4.f8465
            if (r7 == 0) goto Lb7
            goto Lb9
        Lb7:
            int r3 = r4.f8468
        Lb9:
            int r6 = r6 + r3
            if (r5 <= r6) goto Lbd
            goto Lc6
        Lbd:
            r0.m3359(r4, r5)
            r0.m3361()
            defpackage.AbstractC1590.m2869(r0)
        Lc6:
            long r3 = r11.f6928
            long r3 = r3 - r1
            r11.f6928 = r3
            long r3 = r8.f6928
            long r3 = r3 + r1
            r8.f6928 = r3
            long r9 = r9 - r1
            goto La
        Ld3:
            java.lang.String r8 = "cannot compact"
            defpackage.C2264.m3676(r8)
        Ld8:
            return
        Ld9:
            java.lang.String r8 = "source == this"
            defpackage.C2264.m3684(r8)
            return
    }

    @Override // defpackage.InterfaceC1810
    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public final java.lang.String mo2840(java.nio.charset.Charset r3) {
            r2 = this;
            long r0 = r2.f6928
            java.lang.String r2 = r2.m2842(r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: ᛵᛵᲀᛲ, reason: contains not printable characters */
    public final void m2841(int r9) {
            r8 = this;
            r0 = 128(0x80, float:1.8E-43)
            if (r9 >= r0) goto L8
            r8.m2855(r9)
            return
        L8:
            r1 = 2048(0x800, float:2.87E-42)
            r2 = 63
            if (r9 >= r1) goto L30
            r1 = 2
            ᲁᲇᛶᛶ r3 = r8.m2846(r1)
            byte[] r4 = r3.f8467
            int r5 = r3.f8466
            int r6 = r9 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.f8466 = r5
            long r0 = r8.f6928
            r2 = 2
            long r0 = r0 + r2
            r8.f6928 = r0
            return
        L30:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r1 > r9) goto L3e
            r1 = 57344(0xe000, float:8.0356E-41)
            if (r9 >= r1) goto L3e
            r8.m2855(r2)
            return
        L3e:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r9 >= r1) goto L6d
            r1 = 3
            ᲁᲇᛶᛶ r3 = r8.m2846(r1)
            byte[] r4 = r3.f8467
            int r5 = r3.f8466
            int r6 = r9 >> 12
            r6 = r6 | 224(0xe0, float:3.14E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            int r7 = r9 >> 6
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 2
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.f8466 = r5
            long r0 = r8.f6928
            r2 = 3
            long r0 = r0 + r2
            r8.f6928 = r0
            return
        L6d:
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r1) goto La6
            r1 = 4
            ᲁᲇᛶᛶ r3 = r8.m2846(r1)
            byte[] r4 = r3.f8467
            int r5 = r3.f8466
            int r6 = r9 >> 18
            r6 = r6 | 240(0xf0, float:3.36E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            int r7 = r9 >> 12
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 2
            int r7 = r9 >> 6
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 3
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.f8466 = r5
            long r0 = r8.f6928
            r2 = 4
            long r0 = r0 + r2
            r8.f6928 = r0
            return
        La6:
            java.lang.String r8 = defpackage.AbstractC1171.m2255(r9)
            java.lang.String r9 = "Unexpected code point: 0x"
            java.lang.String r8 = r9.concat(r8)
            defpackage.C2264.m3684(r8)
            return
    }

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public final java.lang.String m2842(long r7, java.nio.charset.Charset r9) {
            r6 = this;
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L55
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 > 0) goto L55
            long r1 = r6.f6928
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 < 0) goto L4f
            if (r0 != 0) goto L18
            java.lang.String r6 = ""
            return r6
        L18:
            ᲁᲇᛶᛶ r0 = r6.f6929
            int r1 = r0.f8468
            long r2 = (long) r1
            long r2 = r2 + r7
            int r4 = r0.f8466
            long r4 = (long) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L2f
            java.lang.String r0 = new java.lang.String
            byte[] r6 = r6.m2833(r7)
            r0.<init>(r6, r9)
            return r0
        L2f:
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r0.f8467
            int r4 = (int) r7
            r2.<init>(r3, r1, r4, r9)
            int r9 = r0.f8468
            int r9 = r9 + r4
            r0.f8468 = r9
            long r3 = r6.f6928
            long r3 = r3 - r7
            r6.f6928 = r3
            int r7 = r0.f8466
            if (r9 != r7) goto L4e
            ᲁᲇᛶᛶ r7 = r0.m3361()
            r6.f6929 = r7
            defpackage.AbstractC1590.m2869(r0)
        L4e:
            return r2
        L4f:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L55:
            java.lang.String r6 = "byteCount: "
            defpackage.C2264.m3672(r6, r7)
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: ᛷᛲᲁᛳ, reason: contains not printable characters */
    public final void m2843(long r13) {
            r12 = this;
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            r13 = 48
            r12.m2855(r13)
            return
        Lc:
            r0 = 1
            long r1 = r13 >>> r0
            long r1 = r1 | r13
            r3 = 2
            long r4 = r1 >>> r3
            long r1 = r1 | r4
            r4 = 4
            long r5 = r1 >>> r4
            long r1 = r1 | r5
            r5 = 8
            long r6 = r1 >>> r5
            long r1 = r1 | r6
            r6 = 16
            long r7 = r1 >>> r6
            long r1 = r1 | r7
            r7 = 32
            long r8 = r1 >>> r7
            long r1 = r1 | r8
            long r8 = r1 >>> r0
            r10 = 6148914691236517205(0x5555555555555555, double:1.1945305291614955E103)
            long r8 = r8 & r10
            long r1 = r1 - r8
            long r8 = r1 >>> r3
            r10 = 3689348814741910323(0x3333333333333333, double:4.667261458395856E-62)
            long r8 = r8 & r10
            long r1 = r1 & r10
            long r8 = r8 + r1
            long r1 = r8 >>> r4
            long r1 = r1 + r8
            r8 = 1085102592571150095(0xf0f0f0f0f0f0f0f, double:3.815736827118017E-236)
            long r1 = r1 & r8
            long r8 = r1 >>> r5
            long r1 = r1 + r8
            long r5 = r1 >>> r6
            long r1 = r1 + r5
            r5 = 63
            long r8 = r1 & r5
            long r1 = r1 >>> r7
            long r1 = r1 & r5
            long r8 = r8 + r1
            r1 = 3
            long r8 = r8 + r1
            r1 = 4
            long r8 = r8 / r1
            int r1 = (int) r8
            ᲁᲇᛶᛶ r2 = r12.m2846(r1)
            byte[] r3 = r2.f8467
            int r5 = r2.f8466
            int r6 = r5 + r1
            int r6 = r6 - r0
        L62:
            if (r6 < r5) goto L72
            byte[] r0 = defpackage.AbstractC2066.f8879
            r7 = 15
            long r7 = r7 & r13
            int r7 = (int) r7
            r0 = r0[r7]
            r3[r6] = r0
            long r13 = r13 >>> r4
            int r6 = r6 + (-1)
            goto L62
        L72:
            int r13 = r2.f8466
            int r13 = r13 + r1
            r2.f8466 = r13
            long r13 = r12.f6928
            long r0 = (long) r1
            long r13 = r13 + r0
            r12.f6928 = r13
            return
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1077 mo1707() {
            r0 = this;
            ᛳᲇᛲ r0 = defpackage.C1077.f4838
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛴᲈ, reason: contains not printable characters */
    public final void m2844(java.lang.String r10, int r11, int r12) {
            r9 = this;
            if (r11 < 0) goto L124
            if (r12 < r11) goto L118
            int r0 = r10.length()
            if (r12 > r0) goto L10c
        La:
            if (r11 >= r12) goto L10b
            char r0 = r10.charAt(r11)
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L48
            r2 = 1
            ᲁᲇᛶᛶ r2 = r9.m2846(r2)
            byte[] r3 = r2.f8467
            int r4 = r2.f8466
            int r4 = r4 - r11
            int r5 = 8192 - r4
            int r5 = java.lang.Math.min(r12, r5)
            int r6 = r11 + 1
            int r11 = r11 + r4
            byte r0 = (byte) r0
            r3[r11] = r0
        L2a:
            r11 = r6
            if (r11 >= r5) goto L3a
            char r0 = r10.charAt(r11)
            if (r0 >= r1) goto L3a
            int r6 = r11 + 1
            int r11 = r11 + r4
            byte r0 = (byte) r0
            r3[r11] = r0
            goto L2a
        L3a:
            int r4 = r4 + r11
            int r0 = r2.f8466
            int r4 = r4 - r0
            int r0 = r0 + r4
            r2.f8466 = r0
            long r0 = r9.f6928
            long r2 = (long) r4
            long r0 = r0 + r2
            r9.f6928 = r0
            goto La
        L48:
            r2 = 2048(0x800, float:2.87E-42)
            if (r0 >= r2) goto L71
            r2 = 2
            ᲁᲇᛶᛶ r3 = r9.m2846(r2)
            byte[] r4 = r3.f8467
            int r5 = r3.f8466
            int r6 = r0 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r4[r6] = r0
            int r5 = r5 + r2
            r3.f8466 = r5
            long r0 = r9.f6928
            r2 = 2
            long r0 = r0 + r2
            r9.f6928 = r0
        L6e:
            int r11 = r11 + 1
            goto La
        L71:
            r2 = 55296(0xd800, float:7.7486E-41)
            r3 = 63
            if (r0 < r2) goto Lde
            r2 = 57343(0xdfff, float:8.0355E-41)
            if (r0 <= r2) goto L7e
            goto Lde
        L7e:
            int r2 = r11 + 1
            if (r2 >= r12) goto L87
            char r4 = r10.charAt(r2)
            goto L88
        L87:
            r4 = 0
        L88:
            r5 = 56319(0xdbff, float:7.892E-41)
            if (r0 > r5) goto Ld8
            r5 = 56320(0xdc00, float:7.8921E-41)
            if (r5 > r4) goto Ld8
            r5 = 57344(0xe000, float:8.0356E-41)
            if (r4 >= r5) goto Ld8
            r0 = r0 & 1023(0x3ff, float:1.434E-42)
            int r0 = r0 << 10
            r2 = r4 & 1023(0x3ff, float:1.434E-42)
            r0 = r0 | r2
            r2 = 65536(0x10000, float:9.1835E-41)
            int r0 = r0 + r2
            r2 = 4
            ᲁᲇᛶᛶ r4 = r9.m2846(r2)
            byte[] r5 = r4.f8467
            int r6 = r4.f8466
            int r7 = r0 >> 18
            r7 = r7 | 240(0xf0, float:3.36E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            int r8 = r0 >> 12
            r8 = r8 & r3
            r8 = r8 | r1
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r6 + 2
            int r8 = r0 >> 6
            r8 = r8 & r3
            r8 = r8 | r1
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r6 + 3
            r0 = r0 & r3
            r0 = r0 | r1
            byte r0 = (byte) r0
            r5[r7] = r0
            int r6 = r6 + r2
            r4.f8466 = r6
            long r0 = r9.f6928
            r2 = 4
            long r0 = r0 + r2
            r9.f6928 = r0
            int r11 = r11 + 2
            goto La
        Ld8:
            r9.m2855(r3)
            r11 = r2
            goto La
        Lde:
            r2 = 3
            ᲁᲇᛶᛶ r4 = r9.m2846(r2)
            byte[] r5 = r4.f8467
            int r6 = r4.f8466
            int r7 = r0 >> 12
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            int r8 = r0 >> 6
            r3 = r3 & r8
            r3 = r3 | r1
            byte r3 = (byte) r3
            r5[r7] = r3
            int r3 = r6 + 2
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r5[r3] = r0
            int r6 = r6 + r2
            r4.f8466 = r6
            long r0 = r9.f6928
            r2 = 3
            long r0 = r0 + r2
            r9.f6928 = r0
            goto L6e
        L10b:
            return
        L10c:
            java.lang.String r9 = " > "
            int r10 = r10.length()
            java.lang.String r11 = "endIndex > string.length: "
            defpackage.C2264.m3669(r11, r12, r9, r10)
            return
        L118:
            java.lang.String r9 = "endIndex < beginIndex: "
            java.lang.String r10 = " < "
            java.lang.String r9 = defpackage.AbstractC1124.m2143(r12, r11, r9, r10)
            defpackage.C2264.m3678(r9)
            return
        L124:
            java.lang.String r9 = "beginIndex < 0: "
            java.lang.String r9 = defpackage.AbstractC1124.m2145(r11, r9)
            defpackage.C2264.m3678(r9)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛷᛷ, reason: contains not printable characters */
    public final void m2845(int r10, byte[] r11) {
            r9 = this;
            int r0 = r11.length
            long r1 = (long) r0
            long r5 = (long) r10
            r3 = 0
            defpackage.AbstractC1171.m2271(r1, r3, r5)
            r0 = 0
        L9:
            if (r0 >= r10) goto L2c
            r1 = 1
            ᲁᲇᛶᛶ r1 = r9.m2846(r1)
            int r2 = r10 - r0
            int r3 = r1.f8466
            int r3 = 8192 - r3
            int r2 = java.lang.Math.min(r2, r3)
            byte[] r3 = r1.f8467
            int r4 = r1.f8466
            int r7 = r0 + r2
            int r8 = r7 - r0
            java.lang.System.arraycopy(r11, r0, r3, r4, r8)
            int r0 = r1.f8466
            int r0 = r0 + r2
            r1.f8466 = r0
            r0 = r7
            goto L9
        L2c:
            long r10 = r9.f6928
            long r10 = r10 + r5
            r9.f6928 = r10
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᛶ, reason: contains not printable characters */
    public final defpackage.C1946 m2846(int r3) {
            r2 = this;
            r0 = 1
            if (r3 < r0) goto L2b
            r0 = 8192(0x2000, float:1.148E-41)
            if (r3 > r0) goto L2b
            ᲁᲇᛶᛶ r1 = r2.f6929
            if (r1 != 0) goto L16
            ᲁᲇᛶᛶ r3 = defpackage.AbstractC1590.m2870()
            r2.f6929 = r3
            r3.f8470 = r3
            r3.f8469 = r3
            return r3
        L16:
            ᲁᲇᛶᛶ r2 = r1.f8470
            int r1 = r2.f8466
            int r1 = r1 + r3
            if (r1 > r0) goto L23
            boolean r3 = r2.f8464
            if (r3 != 0) goto L22
            goto L23
        L22:
            return r2
        L23:
            ᲁᲇᛶᛶ r3 = defpackage.AbstractC1590.m2870()
            r2.m3362(r3)
            return r3
        L2b:
            java.lang.String r2 = "unexpected capacity"
            defpackage.C2264.m3684(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛷᛱᛱ, reason: contains not printable characters */
    public final void m2847(long r7) {
            r6 = this;
        L0:
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L35
            ᲁᲇᛶᛶ r0 = r6.f6929
            if (r0 == 0) goto L2f
            int r1 = r0.f8466
            int r2 = r0.f8468
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r7, r1)
            int r1 = (int) r1
            long r2 = r6.f6928
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.f6928 = r2
            long r7 = r7 - r4
            int r2 = r0.f8468
            int r2 = r2 + r1
            r0.f8468 = r2
            int r1 = r0.f8466
            if (r2 != r1) goto L0
            ᲁᲇᛶᛶ r1 = r0.m3361()
            r6.f6929 = r1
            defpackage.AbstractC1590.m2869(r0)
            goto L0
        L2f:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L35:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean m2848() {
            r4 = this;
            long r0 = r4.f6928
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r4 = 1
            return r4
        La:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᛷᲇᛷᛶ, reason: contains not printable characters */
    public final void m2849(defpackage.C1128 r2) {
            r1 = this;
            int r0 = r2.mo2165()
            r2.mo2158(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ᛸᛱᲈᛳ, reason: contains not printable characters */
    public final void m2850(long r12) {
            r11 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            r12 = 48
            r11.m2855(r12)
            return
        Lc:
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L1d
            long r12 = -r12
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1b
            java.lang.String r12 = "-9223372036854775808"
            r11.m2838(r12)
            return
        L1b:
            r2 = r4
            goto L1e
        L1d:
            r2 = r3
        L1e:
            byte[] r5 = defpackage.AbstractC2066.f8879
            int r5 = java.lang.Long.numberOfLeadingZeros(r12)
            int r5 = 64 - r5
            int r5 = r5 * 10
            int r5 = r5 >>> 5
            long[] r6 = defpackage.AbstractC2066.f8880
            r6 = r6[r5]
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 <= 0) goto L33
            r3 = r4
        L33:
            int r5 = r5 + r3
            if (r2 == 0) goto L38
            int r5 = r5 + 1
        L38:
            ᲁᲇᛶᛶ r3 = r11.m2846(r5)
            byte[] r4 = r3.f8467
            int r6 = r3.f8466
            int r6 = r6 + r5
        L41:
            int r7 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r7 == 0) goto L54
            r7 = 10
            long r9 = r12 % r7
            int r9 = (int) r9
            int r6 = r6 + (-1)
            byte[] r10 = defpackage.AbstractC2066.f8879
            r9 = r10[r9]
            r4[r6] = r9
            long r12 = r12 / r7
            goto L41
        L54:
            if (r2 == 0) goto L5c
            int r6 = r6 + (-1)
            r12 = 45
            r4[r6] = r12
        L5c:
            int r12 = r3.f8466
            int r12 = r12 + r5
            r3.f8466 = r12
            long r12 = r11.f6928
            long r0 = (long) r5
            long r12 = r12 + r0
            r11.f6928 = r12
            return
    }

    @Override // defpackage.InterfaceC1810
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final byte[] mo2851() {
            r2 = this;
            long r0 = r2.f6928
            byte[] r2 = r2.m2833(r0)
            return r2
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public final int m2852() {
            r11 = this;
            long r0 = r11.f6928
            r2 = 4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L6c
            ᲁᲇᛶᛶ r4 = r11.f6929
            int r5 = r4.f8468
            int r6 = r4.f8466
            int r7 = r6 - r5
            long r7 = (long) r7
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L37
            byte r0 = r11.m2831()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            byte r1 = r11.m2831()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            byte r1 = r11.m2831()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r11 = r11.m2831()
            r11 = r11 & 255(0xff, float:3.57E-43)
            r11 = r11 | r0
            return r11
        L37:
            byte[] r7 = r4.f8467
            int r8 = r5 + 1
            r9 = r7[r5]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 24
            int r10 = r5 + 2
            r8 = r7[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 16
            r8 = r8 | r9
            int r9 = r5 + 3
            r10 = r7[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 8
            r8 = r8 | r10
            int r5 = r5 + 4
            r7 = r7[r9]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r7 | r8
            long r0 = r0 - r2
            r11.f6928 = r0
            if (r5 != r6) goto L69
            ᲁᲇᛶᛶ r0 = r4.m3361()
            r11.f6929 = r0
            defpackage.AbstractC1590.m2869(r4)
            return r7
        L69:
            r4.f8468 = r5
            return r7
        L6c:
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            throw r11
    }

    @Override // defpackage.InterfaceC1810
    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public final java.io.InputStream mo2853() {
            r2 = this;
            ᲇᛱᛶᲀ r0 = new ᲇᛱᛶᲀ
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // defpackage.InterfaceC1810
    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public final int mo2854(defpackage.C2248 r4) {
            r3 = this;
            r0 = 0
            int r0 = defpackage.AbstractC2066.m3473(r3, r4, r0)
            r1 = -1
            if (r0 != r1) goto L9
            return r1
        L9:
            ᛶᛸᛸᛶ[] r4 = r4.f9566
            r4 = r4[r0]
            int r4 = r4.mo2165()
            long r1 = (long) r4
            r3.m2847(r1)
            return r0
    }

    @Override // defpackage.InterfaceC0172
    /* JADX INFO: renamed from: ᲇᛳᛴᲈ */
    public final /* bridge */ /* synthetic */ defpackage.InterfaceC0172 mo706(java.lang.String r1) {
            r0 = this;
            r0.m2838(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛱᛱ, reason: contains not printable characters */
    public final void m2855(int r5) {
            r4 = this;
            r0 = 1
            ᲁᲇᛶᛶ r0 = r4.m2846(r0)
            byte[] r1 = r0.f8467
            int r2 = r0.f8466
            int r3 = r2 + 1
            r0.f8466 = r3
            byte r5 = (byte) r5
            r1[r2] = r5
            long r0 = r4.f6928
            r2 = 1
            long r0 = r0 + r2
            r4.f6928 = r0
            return
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final long mo782(long r5, defpackage.C1569 r7) {
            r4 = this;
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L18
            long r2 = r4.f6928
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            r4 = -1
            return r4
        Lf:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L14
            r5 = r2
        L14:
            r7.mo484(r5, r4)
            return r5
        L18:
            java.lang.String r4 = "byteCount < 0: "
            defpackage.C2264.m3672(r4, r5)
            return r0
    }

    /* JADX INFO: renamed from: ᲈᛸᲇ, reason: contains not printable characters */
    public final java.lang.String m2856() {
            r3 = this;
            long r0 = r3.f6928
            java.nio.charset.Charset r2 = defpackage.AbstractC1422.f6221
            java.lang.String r3 = r3.m2842(r0, r2)
            return r3
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final byte m2857(long r7) {
            r6 = this;
            long r0 = r6.f6928
            r4 = 1
            r2 = r7
            defpackage.AbstractC1171.m2271(r0, r2, r4)
            ᲁᲇᛶᛶ r7 = r6.f6929
            r7.getClass()
            long r0 = r6.f6928
            long r4 = r0 - r2
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L2e
        L15:
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L23
            ᲁᲇᛶᛶ r7 = r7.f8470
            int r6 = r7.f8466
            int r8 = r7.f8468
            int r6 = r6 - r8
            long r4 = (long) r6
            long r0 = r0 - r4
            goto L15
        L23:
            byte[] r6 = r7.f8467
            int r7 = r7.f8468
            long r7 = (long) r7
            long r7 = r7 + r2
            long r7 = r7 - r0
            int r7 = (int) r7
            r6 = r6[r7]
            return r6
        L2e:
            r0 = 0
        L30:
            int r6 = r7.f8466
            int r8 = r7.f8468
            int r6 = r6 - r8
            long r4 = (long) r6
            long r4 = r4 + r0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L3f
            ᲁᲇᛶᛶ r7 = r7.f8469
            r0 = r4
            goto L30
        L3f:
            byte[] r6 = r7.f8467
            long r7 = (long) r8
            long r7 = r7 + r2
            long r7 = r7 - r0
            int r7 = (int) r7
            r6 = r6[r7]
            return r6
    }
}
