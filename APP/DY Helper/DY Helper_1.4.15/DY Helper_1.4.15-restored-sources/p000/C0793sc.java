package p000;

/* JADX INFO: renamed from: sc */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0793sc implements p000.InterfaceC0014ad, p000.InterfaceC1053zc, java.lang.Cloneable, java.nio.channels.ByteChannel {

    /* JADX INFO: renamed from: ε */
    public p000.rr1 f9827;

    /* JADX INFO: renamed from: ζ */
    public long f9828;

    public final java.lang.Object clone() {
            r6 = this;
            sc r0 = new sc
            r0.<init>()
            long r1 = r6.f9828
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto Le
            return r0
        Le:
            rr1 r1 = r6.f9827
            r1.getClass()
            rr1 r2 = r1.m5125()
            r0.f9827 = r2
            r2.f9477 = r2
            r2.f9476 = r2
            rr1 r3 = r1.f9476
        L1f:
            if (r3 == r1) goto L33
            rr1 r4 = r2.f9477
            r4.getClass()
            r3.getClass()
            rr1 r5 = r3.m5125()
            r4.m5124(r5)
            rr1 r3 = r3.f9476
            goto L1f
        L33:
            long r1 = r6.f9828
            r0.f9828 = r1
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p000.iw1
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
            boolean r3 = r1 instanceof p000.C0793sc
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            long r5 = r0.f9828
            sc r1 = (p000.C0793sc) r1
            long r7 = r1.f9828
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L19
            return r4
        L19:
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L20
            return r2
        L20:
            rr1 r3 = r0.f9827
            r3.getClass()
            rr1 r1 = r1.f9827
            r1.getClass()
            int r5 = r3.f9472
            int r6 = r1.f9472
            r9 = r7
        L2f:
            long r11 = r0.f9828
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L74
            int r11 = r3.f9473
            int r11 = r11 - r5
            int r12 = r1.f9473
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L41:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L5c
            byte[] r15 = r3.f9471
            int r16 = r5 + 1
            r5 = r15[r5]
            byte[] r15 = r1.f9471
            int r17 = r6 + 1
            r6 = r15[r6]
            if (r5 == r6) goto L54
            return r4
        L54:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L41
        L5c:
            int r13 = r3.f9473
            if (r5 != r13) goto L67
            rr1 r3 = r3.f9476
            r3.getClass()
            int r5 = r3.f9472
        L67:
            int r13 = r1.f9473
            if (r6 != r13) goto L72
            rr1 r1 = r1.f9476
            r1.getClass()
            int r6 = r1.f9472
        L72:
            long r9 = r9 + r11
            goto L2f
        L74:
            return r2
    }

    @Override // p000.InterfaceC1053zc, p000.iw1, java.io.Flushable
    public final void flush() {
            r0 = this;
            return
    }

    public final int hashCode() {
            r5 = this;
            rr1 r0 = r5.f9827
            if (r0 != 0) goto L6
            r5 = 0
            return r5
        L6:
            r1 = 1
        L7:
            int r2 = r0.f9472
            int r3 = r0.f9473
        Lb:
            if (r2 >= r3) goto L17
            int r1 = r1 * 31
            byte[] r4 = r0.f9471
            r4 = r4[r2]
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto Lb
        L17:
            rr1 r0 = r0.f9476
            r0.getClass()
            rr1 r2 = r5.f9827
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
            r7.getClass()
            rr1 r0 = r6.f9827
            if (r0 != 0) goto L9
            r6 = -1
            return r6
        L9:
            int r1 = r7.remaining()
            int r2 = r0.f9473
            int r3 = r0.f9472
            int r2 = r2 - r3
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = r0.f9471
            int r3 = r0.f9472
            r7.put(r2, r3, r1)
            int r7 = r0.f9472
            int r7 = r7 + r1
            r0.f9472 = r7
            long r2 = r6.f9828
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.f9828 = r2
            int r2 = r0.f9473
            if (r7 != r2) goto L35
            rr1 r7 = r0.m5123()
            r6.f9827 = r7
            p000.tr1.m5737(r0)
        L35:
            return r1
    }

    public final int read(byte[] r8, int r9, int r10) {
            r7 = this;
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            p000.ln0.m3629(r1, r3, r5)
            rr1 r0 = r7.f9827
            if (r0 != 0) goto Ld
            r7 = -1
            return r7
        Ld:
            int r1 = r0.f9473
            int r2 = r0.f9472
            int r1 = r1 - r2
            int r10 = java.lang.Math.min(r10, r1)
            byte[] r1 = r0.f9471
            int r2 = r0.f9472
            int r3 = r2 + r10
            p000.AbstractC0312g7.m2236(r1, r8, r9, r2, r3)
            int r8 = r0.f9472
            int r8 = r8 + r10
            r0.f9472 = r8
            long r1 = r7.f9828
            long r3 = (long) r10
            long r1 = r1 - r3
            r7.f9828 = r1
            int r9 = r0.f9473
            if (r8 != r9) goto L37
            rr1 r8 = r0.m5123()
            r7.f9827 = r8
            p000.tr1.m5737(r0)
        L37:
            return r10
    }

    @Override // p000.InterfaceC0014ad
    public final byte readByte() {
            r9 = this;
            long r0 = r9.f9828
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2d
            rr1 r0 = r9.f9827
            r0.getClass()
            int r1 = r0.f9472
            int r2 = r0.f9473
            byte[] r3 = r0.f9471
            int r4 = r1 + 1
            r1 = r3[r1]
            long r5 = r9.f9828
            r7 = 1
            long r5 = r5 - r7
            r9.f9828 = r5
            if (r4 != r2) goto L2a
            rr1 r2 = r0.m5123()
            r9.f9827 = r2
            p000.tr1.m5737(r0)
            return r1
        L2a:
            r0.f9472 = r4
            return r1
        L2d:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>()
            throw r9
    }

    @Override // p000.InterfaceC0014ad
    public final int readInt() {
            r9 = this;
            long r0 = r9.f9828
            r2 = 4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L71
            rr1 r0 = r9.f9827
            r0.getClass()
            int r1 = r0.f9472
            int r4 = r0.f9473
            int r5 = r4 - r1
            long r5 = (long) r5
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L3a
            byte r0 = r9.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r0
            return r9
        L3a:
            byte[] r5 = r0.f9471
            int r6 = r1 + 1
            r7 = r5[r1]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 24
            int r8 = r1 + 2
            r6 = r5[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r6 = r6 | r7
            int r7 = r1 + 3
            r8 = r5[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r6 = r6 | r8
            int r1 = r1 + 4
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            long r6 = r9.f9828
            long r6 = r6 - r2
            r9.f9828 = r6
            if (r1 != r4) goto L6e
            rr1 r1 = r0.m5123()
            r9.f9827 = r1
            p000.tr1.m5737(r0)
            return r5
        L6e:
            r0.f9472 = r1
            return r5
        L71:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>()
            throw r9
    }

    @Override // p000.InterfaceC0014ad
    public final short readShort() {
            r9 = this;
            long r0 = r9.f9828
            r2 = 2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L4c
            rr1 r0 = r9.f9827
            r0.getClass()
            int r1 = r0.f9472
            int r4 = r0.f9473
            int r5 = r4 - r1
            r6 = 2
            if (r5 >= r6) goto L27
            byte r0 = r9.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r0
            short r9 = (short) r9
            return r9
        L27:
            byte[] r5 = r0.f9471
            int r7 = r1 + 1
            r8 = r5[r1]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            int r1 = r1 + r6
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r8
            long r6 = r9.f9828
            long r6 = r6 - r2
            r9.f9828 = r6
            if (r1 != r4) goto L48
            rr1 r1 = r0.m5123()
            r9.f9827 = r1
            p000.tr1.m5737(r0)
            goto L4a
        L48:
            r0.f9472 = r1
        L4a:
            short r9 = (short) r5
            return r9
        L4c:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>()
            throw r9
    }

    @Override // p000.InterfaceC0014ad
    public final void skip(long r7) {
            r6 = this;
        L0:
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L35
            rr1 r0 = r6.f9827
            if (r0 == 0) goto L2f
            int r1 = r0.f9473
            int r2 = r0.f9472
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r7, r1)
            int r1 = (int) r1
            long r2 = r6.f9828
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.f9828 = r2
            long r7 = r7 - r4
            int r2 = r0.f9472
            int r2 = r2 + r1
            r0.f9472 = r2
            int r1 = r0.f9473
            if (r2 != r1) goto L0
            rr1 r1 = r0.m5123()
            r6.f9827 = r1
            p000.tr1.m5737(r0)
            goto L0
        L2f:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L35:
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            long r0 = r4.f9828
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L13
            int r0 = (int) r0
            dd r4 = r4.m5461(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L13:
            long r0 = r4.f9828
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
            r7.getClass()
            int r0 = r7.remaining()
            r1 = r0
        L8:
            if (r1 <= 0) goto L25
            r2 = 1
            rr1 r2 = r6.m5462(r2)
            int r3 = r2.f9473
            int r3 = 8192 - r3
            int r3 = java.lang.Math.min(r1, r3)
            byte[] r4 = r2.f9471
            int r5 = r2.f9473
            r7.get(r4, r5, r3)
            int r1 = r1 - r3
            int r4 = r2.f9473
            int r4 = r4 + r3
            r2.f9473 = r4
            goto L8
        L25:
            long r1 = r6.f9828
            long r3 = (long) r0
            long r1 = r1 + r3
            r6.f9828 = r1
            return r0
    }

    @Override // p000.InterfaceC1053zc
    public final p000.InterfaceC1053zc write(byte[] r2) {
            r1 = this;
            int r0 = r2.length
            r1.m5464(r2, r0)
            return r1
    }

    @Override // p000.InterfaceC1053zc
    public final /* bridge */ /* synthetic */ p000.InterfaceC1053zc writeByte(int r1) {
            r0 = this;
            r0.m5466(r1)
            return r0
    }

    @Override // p000.InterfaceC1053zc
    public final /* bridge */ /* synthetic */ p000.InterfaceC1053zc writeInt(int r1) {
            r0 = this;
            r0.m5448(r1)
            return r0
    }

    @Override // p000.InterfaceC1053zc
    public final /* bridge */ /* synthetic */ p000.InterfaceC1053zc writeShort(int r1) {
            r0 = this;
            r0.m5449(r1)
            return r0
    }

    /* JADX INFO: renamed from: Α */
    public final void m5446(long r13) {
            r12 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            r13 = 48
            r12.m5466(r13)
            return
        Lc:
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L1d
            long r13 = -r13
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1b
            java.lang.String r13 = "-9223372036854775808"
            r12.m5451(r13)
            return
        L1b:
            r2 = r4
            goto L1e
        L1d:
            r2 = r3
        L1e:
            byte[] r5 = p000.AbstractC1079.f13387
            int r5 = java.lang.Long.numberOfLeadingZeros(r13)
            int r5 = 64 - r5
            r6 = 10
            int r5 = r5 * r6
            int r5 = r5 >>> 5
            long[] r7 = p000.AbstractC1079.f13388
            r7 = r7[r5]
            int r7 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r7 <= 0) goto L34
            r3 = r4
        L34:
            int r5 = r5 + r3
            if (r2 == 0) goto L39
            int r5 = r5 + 1
        L39:
            rr1 r3 = r12.m5462(r5)
            byte[] r4 = r3.f9471
            int r7 = r3.f9473
            int r7 = r7 + r5
        L42:
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 == 0) goto L54
            long r8 = (long) r6
            long r10 = r13 % r8
            int r10 = (int) r10
            int r7 = r7 + (-1)
            byte[] r11 = p000.AbstractC1079.f13387
            r10 = r11[r10]
            r4[r7] = r10
            long r13 = r13 / r8
            goto L42
        L54:
            if (r2 == 0) goto L5c
            int r7 = r7 + (-1)
            r13 = 45
            r4[r7] = r13
        L5c:
            int r13 = r3.f9473
            int r13 = r13 + r5
            r3.f9473 = r13
            long r13 = r12.f9828
            long r0 = (long) r5
            long r13 = r13 + r0
            r12.f9828 = r13
            return
    }

    /* JADX INFO: renamed from: Β */
    public final void m5447(long r13) {
            r12 = this;
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            r13 = 48
            r12.m5466(r13)
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
            long r1 = (long) r1
            long r8 = r8 + r1
            long r1 = (long) r4
            long r8 = r8 / r1
            int r1 = (int) r8
            rr1 r2 = r12.m5462(r1)
            byte[] r3 = r2.f9471
            int r5 = r2.f9473
            int r6 = r5 + r1
            int r6 = r6 - r0
        L61:
            if (r6 < r5) goto L71
            byte[] r0 = p000.AbstractC1079.f13387
            r7 = 15
            long r7 = r7 & r13
            int r7 = (int) r7
            r0 = r0[r7]
            r3[r6] = r0
            long r13 = r13 >>> r4
            int r6 = r6 + (-1)
            goto L61
        L71:
            int r13 = r2.f9473
            int r13 = r13 + r1
            r2.f9473 = r13
            long r13 = r12.f9828
            long r0 = (long) r1
            long r13 = r13 + r0
            r12.f9828 = r13
            return
    }

    /* JADX INFO: renamed from: Γ */
    public final void m5448(int r8) {
            r7 = this;
            r0 = 4
            rr1 r1 = r7.m5462(r0)
            byte[] r2 = r1.f9471
            int r3 = r1.f9473
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
            r1.f9473 = r3
            long r0 = r7.f9828
            r2 = 4
            long r0 = r0 + r2
            r7.f9828 = r0
            return
    }

    /* JADX INFO: renamed from: Δ */
    public final void m5449(int r7) {
            r6 = this;
            r0 = 2
            rr1 r1 = r6.m5462(r0)
            byte[] r2 = r1.f9471
            int r3 = r1.f9473
            int r4 = r3 + 1
            int r5 = r7 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r3 = r3 + r0
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r2[r4] = r7
            r1.f9473 = r3
            long r0 = r6.f9828
            r2 = 2
            long r0 = r0 + r2
            r6.f9828 = r0
            return
    }

    /* JADX INFO: renamed from: Ε */
    public final void m5450(int r10, int r11, java.lang.String r12) {
            r9 = this;
            r12.getClass()
            if (r10 < 0) goto L138
            if (r11 < r10) goto L12c
            int r0 = r12.length()
            if (r11 > r0) goto L10f
        Ld:
            if (r10 >= r11) goto L10e
            char r0 = r12.charAt(r10)
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L4b
            r2 = 1
            rr1 r2 = r9.m5462(r2)
            byte[] r3 = r2.f9471
            int r4 = r2.f9473
            int r4 = r4 - r10
            int r5 = 8192 - r4
            int r5 = java.lang.Math.min(r11, r5)
            int r6 = r10 + 1
            int r10 = r10 + r4
            byte r0 = (byte) r0
            r3[r10] = r0
        L2d:
            r10 = r6
            if (r10 >= r5) goto L3d
            char r0 = r12.charAt(r10)
            if (r0 >= r1) goto L3d
            int r6 = r10 + 1
            int r10 = r10 + r4
            byte r0 = (byte) r0
            r3[r10] = r0
            goto L2d
        L3d:
            int r4 = r4 + r10
            int r0 = r2.f9473
            int r4 = r4 - r0
            int r0 = r0 + r4
            r2.f9473 = r0
            long r0 = r9.f9828
            long r2 = (long) r4
            long r0 = r0 + r2
            r9.f9828 = r0
            goto Ld
        L4b:
            r2 = 2048(0x800, float:2.87E-42)
            if (r0 >= r2) goto L74
            r2 = 2
            rr1 r3 = r9.m5462(r2)
            byte[] r4 = r3.f9471
            int r5 = r3.f9473
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
            r3.f9473 = r5
            long r0 = r9.f9828
            r2 = 2
            long r0 = r0 + r2
            r9.f9828 = r0
        L71:
            int r10 = r10 + 1
            goto Ld
        L74:
            r2 = 55296(0xd800, float:7.7486E-41)
            r3 = 63
            if (r0 < r2) goto Le1
            r2 = 57343(0xdfff, float:8.0355E-41)
            if (r0 <= r2) goto L81
            goto Le1
        L81:
            int r2 = r10 + 1
            if (r2 >= r11) goto L8a
            char r4 = r12.charAt(r2)
            goto L8b
        L8a:
            r4 = 0
        L8b:
            r5 = 56319(0xdbff, float:7.892E-41)
            if (r0 > r5) goto Ldb
            r5 = 56320(0xdc00, float:7.8921E-41)
            if (r5 > r4) goto Ldb
            r5 = 57344(0xe000, float:8.0356E-41)
            if (r4 >= r5) goto Ldb
            r0 = r0 & 1023(0x3ff, float:1.434E-42)
            int r0 = r0 << 10
            r2 = r4 & 1023(0x3ff, float:1.434E-42)
            r0 = r0 | r2
            r2 = 65536(0x10000, float:9.1835E-41)
            int r0 = r0 + r2
            r2 = 4
            rr1 r4 = r9.m5462(r2)
            byte[] r5 = r4.f9471
            int r6 = r4.f9473
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
            r4.f9473 = r6
            long r0 = r9.f9828
            r2 = 4
            long r0 = r0 + r2
            r9.f9828 = r0
            int r10 = r10 + 2
            goto Ld
        Ldb:
            r9.m5466(r3)
            r10 = r2
            goto Ld
        Le1:
            r2 = 3
            rr1 r4 = r9.m5462(r2)
            byte[] r5 = r4.f9471
            int r6 = r4.f9473
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
            r4.f9473 = r6
            long r0 = r9.f9828
            r2 = 3
            long r0 = r0 + r2
            r9.f9828 = r0
            goto L71
        L10e:
            return
        L10f:
            java.lang.String r9 = "endIndex > string.length: "
            java.lang.String r10 = " > "
            java.lang.StringBuilder r9 = p000.a12.m19(r11, r9, r10)
            int r10 = r12.length()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L12c:
            java.lang.String r9 = "endIndex < beginIndex: "
            java.lang.String r12 = " < "
            java.lang.String r9 = p000.AbstractC0602nx.m4125(r11, r10, r9, r12)
            p000.C1080.m7266(r9)
            return
        L138:
            java.lang.String r9 = "beginIndex < 0: "
            java.lang.String r9 = p000.a12.m17(r9, r10)
            p000.C1080.m7266(r9)
            return
    }

    /* JADX INFO: renamed from: Ζ */
    public final void m5451(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            int r1 = r3.length()
            r2.m5450(r0, r1, r3)
            return
    }

    /* JADX INFO: renamed from: Η */
    public final void m5452(int r9) {
            r8 = this;
            r0 = 128(0x80, float:1.8E-43)
            if (r9 >= r0) goto L8
            r8.m5466(r9)
            return
        L8:
            r1 = 2048(0x800, float:2.87E-42)
            r2 = 63
            if (r9 >= r1) goto L30
            r1 = 2
            rr1 r3 = r8.m5462(r1)
            byte[] r4 = r3.f9471
            int r5 = r3.f9473
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
            r3.f9473 = r5
            long r0 = r8.f9828
            r2 = 2
            long r0 = r0 + r2
            r8.f9828 = r0
            return
        L30:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r1 > r9) goto L3e
            r1 = 57344(0xe000, float:8.0356E-41)
            if (r9 >= r1) goto L3e
            r8.m5466(r2)
            return
        L3e:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r9 >= r1) goto L6d
            r1 = 3
            rr1 r3 = r8.m5462(r1)
            byte[] r4 = r3.f9471
            int r5 = r3.f9473
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
            r3.f9473 = r5
            long r0 = r8.f9828
            r2 = 3
            long r0 = r0 + r2
            r8.f9828 = r0
            return
        L6d:
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r1) goto La6
            r1 = 4
            rr1 r3 = r8.m5462(r1)
            byte[] r4 = r3.f9471
            int r5 = r3.f9473
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
            r3.f9473 = r5
            long r0 = r8.f9828
            r2 = 4
            long r0 = r0 + r2
            r8.f9828 = r0
            return
        La6:
            java.lang.String r8 = p000.ln0.m3651(r9)
            java.lang.String r9 = "Unexpected code point: 0x"
            java.lang.String r8 = r9.concat(r8)
            p000.C1080.m7275(r8)
            return
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: α */
    public final p000.m42 mo2105() {
            r0 = this;
            l42 r0 = p000.m42.f6935
            return r0
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: β */
    public final long mo2106(long r5, p000.C0793sc r7) {
            r4 = this;
            r7.getClass()
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L1b
            long r2 = r4.f9828
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L12
            r4 = -1
            return r4
        L12:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            r5 = r2
        L17:
            r7.mo2507(r5, r4)
            return r5
        L1b:
            java.lang.String r4 = "byteCount < 0: "
            java.lang.String r4 = p000.AbstractC0602nx.m4126(r5, r4)
            p000.C1080.m7266(r4)
            r4 = 0
            return r4
    }

    @Override // p000.InterfaceC0014ad
    /* JADX INFO: renamed from: γ */
    public final p000.C0208dd mo58(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L32
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L32
            long r0 = r2.f9828
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L2c
            r0 = 4096(0x1000, double:2.0237E-320)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L22
            int r0 = (int) r3
            dd r0 = r2.m5461(r0)
            r2.skip(r3)
            return r0
        L22:
            dd r0 = new dd
            byte[] r2 = r2.m5457(r3)
            r0.<init>(r2)
            return r0
        L2c:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L32:
            java.lang.String r2 = "byteCount: "
            java.lang.String r2 = p000.AbstractC0602nx.m4126(r3, r2)
            p000.C1080.m7266(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public final void m5453(p000.C0793sc r7, long r8, long r10) {
            r6 = this;
            r7.getClass()
            long r0 = r6.f9828
            r2 = r8
            r4 = r10
            p000.ln0.m3629(r0, r2, r4)
            r8 = 0
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 != 0) goto L11
            goto L63
        L11:
            long r10 = r7.f9828
            long r10 = r10 + r4
            r7.f9828 = r10
            rr1 r6 = r6.f9827
        L18:
            r6.getClass()
            int r10 = r6.f9473
            int r11 = r6.f9472
            int r10 = r10 - r11
            long r10 = (long) r10
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 < 0) goto L29
            long r2 = r2 - r10
            rr1 r6 = r6.f9476
            goto L18
        L29:
            r10 = r4
        L2a:
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L63
            r6.getClass()
            rr1 r0 = r6.m5125()
            int r1 = r0.f9472
            int r2 = (int) r2
            int r1 = r1 + r2
            r0.f9472 = r1
            int r2 = (int) r10
            int r1 = r1 + r2
            int r2 = r0.f9473
            int r1 = java.lang.Math.min(r1, r2)
            r0.f9473 = r1
            rr1 r1 = r7.f9827
            if (r1 != 0) goto L50
            r0.f9477 = r0
            r0.f9476 = r0
            r7.f9827 = r0
            goto L58
        L50:
            rr1 r1 = r1.f9477
            r1.getClass()
            r1.m5124(r0)
        L58:
            int r1 = r0.f9473
            int r0 = r0.f9472
            int r1 = r1 - r0
            long r0 = (long) r1
            long r10 = r10 - r0
            rr1 r6 = r6.f9476
            r2 = r8
            goto L2a
        L63:
            return
    }

    @Override // p000.InterfaceC0014ad
    /* JADX INFO: renamed from: ε */
    public final byte[] mo59() {
            r2 = this;
            long r0 = r2.f9828
            byte[] r2 = r2.m5457(r0)
            return r2
    }

    @Override // p000.iw1
    /* JADX INFO: renamed from: ζ */
    public final void mo2507(long r9, p000.C0793sc r11) {
            r8 = this;
            r11.getClass()
            if (r11 == r8) goto L114
            long r0 = r11.f9828
            r2 = 0
            r4 = r9
            p000.ln0.m3629(r0, r2, r4)
        Ld:
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L113
            rr1 r0 = r11.f9827
            r0.getClass()
            int r0 = r0.f9473
            rr1 r1 = r11.f9827
            r1.getClass()
            int r1 = r1.f9472
            int r0 = r0 - r1
            long r0 = (long) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto La0
            rr1 r0 = r8.f9827
            if (r0 == 0) goto L2f
            rr1 r0 = r0.f9477
            goto L30
        L2f:
            r0 = 0
        L30:
            if (r0 == 0) goto L5e
            boolean r2 = r0.f9475
            if (r2 == 0) goto L5e
            int r2 = r0.f9473
            long r2 = (long) r2
            long r2 = r2 + r9
            boolean r4 = r0.f9474
            if (r4 == 0) goto L40
            r4 = r1
            goto L42
        L40:
            int r4 = r0.f9472
        L42:
            long r4 = (long) r4
            long r2 = r2 - r4
            r4 = 8192(0x2000, double:4.0474E-320)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L5e
            rr1 r1 = r11.f9827
            r1.getClass()
            int r2 = (int) r9
            r1.m5126(r0, r2)
            long r0 = r11.f9828
            long r0 = r0 - r9
            r11.f9828 = r0
            long r0 = r8.f9828
            long r0 = r0 + r9
            r8.f9828 = r0
            return
        L5e:
            rr1 r0 = r11.f9827
            r0.getClass()
            int r2 = (int) r9
            if (r2 <= 0) goto L9a
            int r3 = r0.f9473
            int r4 = r0.f9472
            int r3 = r3 - r4
            if (r2 > r3) goto L9a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L76
            rr1 r3 = r0.m5125()
            goto L85
        L76:
            rr1 r3 = p000.tr1.m5738()
            byte[] r4 = r0.f9471
            byte[] r5 = r3.f9471
            int r6 = r0.f9472
            int r7 = r6 + r2
            p000.AbstractC0312g7.m2236(r4, r5, r1, r6, r7)
        L85:
            int r4 = r3.f9472
            int r4 = r4 + r2
            r3.f9473 = r4
            int r4 = r0.f9472
            int r4 = r4 + r2
            r0.f9472 = r4
            rr1 r0 = r0.f9477
            r0.getClass()
            r0.m5124(r3)
            r11.f9827 = r3
            goto La0
        L9a:
            java.lang.String r8 = "byteCount out of range"
            p000.C1080.m7275(r8)
            return
        La0:
            rr1 r0 = r11.f9827
            r0.getClass()
            int r2 = r0.f9473
            int r3 = r0.f9472
            int r2 = r2 - r3
            long r2 = (long) r2
            rr1 r4 = r0.m5123()
            r11.f9827 = r4
            rr1 r4 = r8.f9827
            if (r4 != 0) goto Lbc
            r8.f9827 = r0
            r0.f9477 = r0
            r0.f9476 = r0
            goto L101
        Lbc:
            rr1 r4 = r4.f9477
            r4.getClass()
            r4.m5124(r0)
            rr1 r4 = r0.f9477
            if (r4 == r0) goto L10e
            r4.getClass()
            boolean r4 = r4.f9475
            if (r4 != 0) goto Ld0
            goto L101
        Ld0:
            int r4 = r0.f9473
            int r5 = r0.f9472
            int r4 = r4 - r5
            rr1 r5 = r0.f9477
            r5.getClass()
            int r5 = r5.f9473
            int r5 = 8192 - r5
            rr1 r6 = r0.f9477
            r6.getClass()
            boolean r6 = r6.f9474
            if (r6 == 0) goto Le8
            goto Lef
        Le8:
            rr1 r1 = r0.f9477
            r1.getClass()
            int r1 = r1.f9472
        Lef:
            int r5 = r5 + r1
            if (r4 <= r5) goto Lf3
            goto L101
        Lf3:
            rr1 r1 = r0.f9477
            r1.getClass()
            r0.m5126(r1, r4)
            r0.m5123()
            p000.tr1.m5737(r0)
        L101:
            long r0 = r11.f9828
            long r0 = r0 - r2
            r11.f9828 = r0
            long r0 = r8.f9828
            long r0 = r0 + r2
            r8.f9828 = r0
            long r9 = r9 - r2
            goto Ld
        L10e:
            java.lang.String r8 = "cannot compact"
            p000.C1080.m7279(r8)
        L113:
            return
        L114:
            java.lang.String r8 = "source == this"
            p000.C1080.m7275(r8)
            return
    }

    /* JADX INFO: renamed from: η */
    public final boolean m5454() {
            r4 = this;
            long r0 = r4.f9828
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r4 = 1
            return r4
        La:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: θ */
    public final byte m5455(long r7) {
            r6 = this;
            long r0 = r6.f9828
            r4 = 1
            r2 = r7
            p000.ln0.m3629(r0, r2, r4)
            rr1 r7 = r6.f9827
            r7.getClass()
            long r0 = r6.f9828
            long r4 = r0 - r2
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L31
        L15:
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L26
            rr1 r7 = r7.f9477
            r7.getClass()
            int r6 = r7.f9473
            int r8 = r7.f9472
            int r6 = r6 - r8
            long r4 = (long) r6
            long r0 = r0 - r4
            goto L15
        L26:
            byte[] r6 = r7.f9471
            int r7 = r7.f9472
            long r7 = (long) r7
            long r7 = r7 + r2
            long r7 = r7 - r0
            int r7 = (int) r7
            r6 = r6[r7]
            return r6
        L31:
            r0 = 0
        L33:
            int r6 = r7.f9473
            int r8 = r7.f9472
            int r6 = r6 - r8
            long r4 = (long) r6
            long r4 = r4 + r0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L45
            rr1 r7 = r7.f9476
            r7.getClass()
            r0 = r4
            goto L33
        L45:
            byte[] r6 = r7.f9471
            long r7 = (long) r8
            long r7 = r7 + r2
            long r7 = r7 - r0
            int r7 = (int) r7
            r6 = r6[r7]
            return r6
    }

    @Override // p000.InterfaceC0014ad
    /* JADX INFO: renamed from: ι */
    public final java.lang.String mo60(long r12) {
            r11 = this;
            r0 = 0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 < 0) goto L8c
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r7 = 1
            if (r2 != 0) goto L13
        L11:
            r4 = r0
            goto L16
        L13:
            long r0 = r12 + r7
            goto L11
        L16:
            r1 = 10
            r2 = 0
            r0 = r11
            long r1 = r0.m5456(r1, r2, r4)
            r9 = -1
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 == 0) goto L2a
            java.lang.String r0 = p000.AbstractC1079.m7263(r1, r11)
            return r0
        L2a:
            long r1 = r11.f9828
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 >= 0) goto L47
            long r1 = r4 - r7
            byte r1 = r11.m5455(r1)
            r2 = 13
            if (r1 != r2) goto L47
            byte r1 = r11.m5455(r4)
            r2 = 10
            if (r1 != r2) goto L47
            java.lang.String r0 = p000.AbstractC1079.m7263(r4, r11)
            return r0
        L47:
            sc r1 = new sc
            r1.<init>()
            long r2 = r11.f9828
            r4 = 32
            long r4 = (long) r4
            long r4 = java.lang.Math.min(r4, r2)
            r2 = 0
            r0 = r11
            r0.m5453(r1, r2, r4)
            java.io.EOFException r2 = new java.io.EOFException
            long r3 = r11.f9828
            long r3 = java.lang.Math.min(r3, r12)
            long r5 = r1.f9828
            dd r0 = r1.mo58(r5)
            java.lang.String r0 = r0.mo1702()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "\\n not found: limit="
            r1.<init>(r5)
            r1.append(r3)
            java.lang.String r3 = " content="
            r1.append(r3)
            r1.append(r0)
            r0 = 8230(0x2026, float:1.1533E-41)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        L8c:
            java.lang.String r0 = "limit < 0: "
            java.lang.String r0 = p000.AbstractC0602nx.m4126(r12, r0)
            p000.C1080.m7266(r0)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public final long m5456(byte r9, long r10, long r12) {
            r8 = this;
            r0 = 0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 > 0) goto Lb5
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 > 0) goto Lb5
            long r2 = r8.f9828
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 <= 0) goto L11
            r12 = r2
        L11:
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 != 0) goto L17
            goto Lb2
        L17:
            rr1 r8 = r8.f9827
            if (r8 != 0) goto L1d
            goto Lb2
        L1d:
            long r4 = r2 - r10
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L6a
        L23:
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L34
            rr1 r8 = r8.f9477
            r8.getClass()
            int r0 = r8.f9473
            int r1 = r8.f9472
            int r0 = r0 - r1
            long r0 = (long) r0
            long r2 = r2 - r0
            goto L23
        L34:
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto Lb2
            byte[] r0 = r8.f9471
            int r1 = r8.f9473
            long r4 = (long) r1
            int r1 = r8.f9472
            long r6 = (long) r1
            long r6 = r6 + r12
            long r6 = r6 - r2
            long r4 = java.lang.Math.min(r4, r6)
            int r1 = (int) r4
            int r4 = r8.f9472
            long r4 = (long) r4
            long r4 = r4 + r10
            long r4 = r4 - r2
            int r10 = (int) r4
        L4d:
            if (r10 >= r1) goto L5c
            r11 = r0[r10]
            if (r11 != r9) goto L59
            int r8 = r8.f9472
            int r10 = r10 - r8
            long r8 = (long) r10
            long r8 = r8 + r2
            return r8
        L59:
            int r10 = r10 + 1
            goto L4d
        L5c:
            int r10 = r8.f9473
            int r11 = r8.f9472
            int r10 = r10 - r11
            long r10 = (long) r10
            long r2 = r2 + r10
            rr1 r8 = r8.f9476
            r8.getClass()
            r10 = r2
            goto L34
        L6a:
            int r2 = r8.f9473
            int r3 = r8.f9472
            int r2 = r2 - r3
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 > 0) goto L7c
            rr1 r8 = r8.f9476
            r8.getClass()
            r0 = r2
            goto L6a
        L7c:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 >= 0) goto Lb2
            byte[] r2 = r8.f9471
            int r3 = r8.f9473
            long r3 = (long) r3
            int r5 = r8.f9472
            long r5 = (long) r5
            long r5 = r5 + r12
            long r5 = r5 - r0
            long r3 = java.lang.Math.min(r3, r5)
            int r3 = (int) r3
            int r4 = r8.f9472
            long r4 = (long) r4
            long r4 = r4 + r10
            long r4 = r4 - r0
            int r10 = (int) r4
        L95:
            if (r10 >= r3) goto La4
            r11 = r2[r10]
            if (r11 != r9) goto La1
            int r8 = r8.f9472
            int r10 = r10 - r8
            long r8 = (long) r10
            long r8 = r8 + r0
            return r8
        La1:
            int r10 = r10 + 1
            goto L95
        La4:
            int r10 = r8.f9473
            int r11 = r8.f9472
            int r10 = r10 - r11
            long r10 = (long) r10
            long r0 = r0 + r10
            rr1 r8 = r8.f9476
            r8.getClass()
            r10 = r0
            goto L7c
        Lb2:
            r8 = -1
            return r8
        Lb5:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "size="
            r9.<init>(r0)
            long r0 = r8.f9828
            r9.append(r0)
            java.lang.String r8 = " fromIndex="
            java.lang.String r0 = " toIndex="
            p000.AbstractC0602nx.m4118(r9, r8, r10, r0)
            r9.append(r12)
            java.lang.String r8 = r9.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
    }

    /* JADX INFO: renamed from: λ */
    public final byte[] m5457(long r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L31
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L31
            long r0 = r3.f9828
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
            java.lang.String r3 = p000.AbstractC0602nx.m4126(r4, r3)
            p000.C1080.m7266(r3)
            r3 = 0
            return r3
    }

    @Override // p000.InterfaceC0014ad
    /* JADX INFO: renamed from: μ */
    public final void mo61(long r3) {
            r2 = this;
            long r0 = r2.f9828
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L7
            return
        L7:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    @Override // p000.InterfaceC1053zc
    /* JADX INFO: renamed from: ν */
    public final /* bridge */ /* synthetic */ p000.InterfaceC1053zc mo4893(java.lang.String r1) {
            r0 = this;
            r0.m5451(r1)
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public final long m5458() {
            r15 = this;
            long r0 = r15.f9828
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La9
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            rr1 r7 = r15.f9827
            r7.getClass()
            byte[] r8 = r7.f9471
            int r9 = r7.f9472
            int r10 = r7.f9473
        L17:
            if (r9 >= r10) goto L8e
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L66
            r12 = 70
            if (r11 > r12) goto L66
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            sc r15 = new sc
            r15.<init>()
            r15.m5447(r4)
            r15.m5466(r11)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r15 = r15.m5460()
            java.lang.String r1 = "Number too large: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        L66:
            r6 = 1
            if (r1 == 0) goto L6a
            goto L8e
        L6a:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            char[] r1 = p000.AbstractC0782s1.f9641
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
        L8e:
            if (r9 != r10) goto L9a
            rr1 r8 = r7.m5123()
            r15.f9827 = r8
            p000.tr1.m5737(r7)
            goto L9c
        L9a:
            r7.f9472 = r9
        L9c:
            if (r6 != 0) goto La2
            rr1 r7 = r15.f9827
            if (r7 != 0) goto Lc
        La2:
            long r2 = r15.f9828
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f9828 = r2
            return r4
        La9:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
    }

    @Override // p000.InterfaceC1053zc
    /* JADX INFO: renamed from: ο */
    public final /* bridge */ /* synthetic */ p000.InterfaceC1053zc mo4894(p000.C0208dd r1) {
            r0 = this;
            r0.m5463(r1)
            return r0
    }

    @Override // p000.InterfaceC0014ad
    /* JADX INFO: renamed from: π */
    public final java.io.InputStream mo62() {
            r2 = this;
            rc r0 = new rc
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public final java.lang.String m5459(long r7, java.nio.charset.Charset r9) {
            r6 = this;
            r9.getClass()
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L5b
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 > 0) goto L5b
            long r1 = r6.f9828
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 < 0) goto L55
            if (r0 != 0) goto L1b
            java.lang.String r6 = ""
            return r6
        L1b:
            rr1 r0 = r6.f9827
            r0.getClass()
            int r1 = r0.f9472
            long r2 = (long) r1
            long r2 = r2 + r7
            int r4 = r0.f9473
            long r4 = (long) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L35
            java.lang.String r0 = new java.lang.String
            byte[] r6 = r6.m5457(r7)
            r0.<init>(r6, r9)
            return r0
        L35:
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r0.f9471
            int r4 = (int) r7
            r2.<init>(r3, r1, r4, r9)
            int r9 = r0.f9472
            int r9 = r9 + r4
            r0.f9472 = r9
            long r3 = r6.f9828
            long r3 = r3 - r7
            r6.f9828 = r3
            int r7 = r0.f9473
            if (r9 != r7) goto L54
            rr1 r7 = r0.m5123()
            r6.f9827 = r7
            p000.tr1.m5737(r0)
        L54:
            return r2
        L55:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L5b:
            java.lang.String r6 = "byteCount: "
            java.lang.String r6 = p000.AbstractC0602nx.m4126(r7, r6)
            p000.C1080.m7266(r6)
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: σ */
    public final java.lang.String m5460() {
            r3 = this;
            long r0 = r3.f9828
            java.nio.charset.Charset r2 = p000.AbstractC0547mf.f7105
            java.lang.String r3 = r3.m5459(r0, r2)
            return r3
    }

    /* JADX INFO: renamed from: τ */
    public final p000.C0208dd m5461(int r8) {
            r7 = this;
            if (r8 != 0) goto L5
            dd r7 = p000.C0208dd.f3085
            return r7
        L5:
            long r0 = r7.f9828
            r2 = 0
            long r4 = (long) r8
            p000.ln0.m3629(r0, r2, r4)
            rr1 r0 = r7.f9827
            r1 = 0
            r2 = r1
            r3 = r2
        L12:
            if (r2 >= r8) goto L2c
            r0.getClass()
            int r4 = r0.f9473
            int r5 = r0.f9472
            if (r4 == r5) goto L24
            int r4 = r4 - r5
            int r2 = r2 + r4
            int r3 = r3 + 1
            rr1 r0 = r0.f9476
            goto L12
        L24:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "s.limit == s.pos"
            r7.<init>(r8)
            throw r7
        L2c:
            byte[][] r0 = new byte[r3][]
            int r2 = r3 * 2
            int[] r2 = new int[r2]
            rr1 r7 = r7.f9827
            r4 = r1
        L35:
            if (r1 >= r8) goto L57
            r7.getClass()
            byte[] r5 = r7.f9471
            r0[r4] = r5
            int r5 = r7.f9473
            int r6 = r7.f9472
            int r5 = r5 - r6
            int r1 = r1 + r5
            int r5 = java.lang.Math.min(r1, r8)
            r2[r4] = r5
            int r5 = r4 + r3
            int r6 = r7.f9472
            r2[r5] = r6
            r5 = 1
            r7.f9474 = r5
            int r4 = r4 + r5
            rr1 r7 = r7.f9476
            goto L35
        L57:
            ur1 r7 = new ur1
            r7.<init>(r0, r2)
            return r7
    }

    /* JADX INFO: renamed from: υ */
    public final p000.rr1 m5462(int r3) {
            r2 = this;
            r0 = 1
            if (r3 < r0) goto L2e
            r0 = 8192(0x2000, float:1.148E-41)
            if (r3 > r0) goto L2e
            rr1 r1 = r2.f9827
            if (r1 != 0) goto L16
            rr1 r3 = p000.tr1.m5738()
            r2.f9827 = r3
            r3.f9477 = r3
            r3.f9476 = r3
            return r3
        L16:
            rr1 r2 = r1.f9477
            r2.getClass()
            int r1 = r2.f9473
            int r1 = r1 + r3
            if (r1 > r0) goto L26
            boolean r3 = r2.f9475
            if (r3 != 0) goto L25
            goto L26
        L25:
            return r2
        L26:
            rr1 r3 = p000.tr1.m5738()
            r2.m5124(r3)
            return r3
        L2e:
            java.lang.String r2 = "unexpected capacity"
            p000.C1080.m7275(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: φ */
    public final void m5463(p000.C0208dd r2) {
            r1 = this;
            r2.getClass()
            int r0 = r2.mo1701()
            r2.mo1711(r1, r0)
            return
    }

    /* JADX INFO: renamed from: χ */
    public final void m5464(byte[] r9, int r10) {
            r8 = this;
            r9.getClass()
            int r0 = r9.length
            long r1 = (long) r0
            r0 = 0
            long r3 = (long) r0
            long r5 = (long) r10
            p000.ln0.m3629(r1, r3, r5)
        Lb:
            if (r0 >= r10) goto L2c
            r1 = 1
            rr1 r1 = r8.m5462(r1)
            int r2 = r10 - r0
            int r3 = r1.f9473
            int r3 = 8192 - r3
            int r2 = java.lang.Math.min(r2, r3)
            byte[] r3 = r1.f9471
            int r4 = r1.f9473
            int r7 = r0 + r2
            p000.AbstractC0312g7.m2236(r9, r3, r4, r0, r7)
            int r0 = r1.f9473
            int r0 = r0 + r2
            r1.f9473 = r0
            r0 = r7
            goto Lb
        L2c:
            long r9 = r8.f9828
            long r9 = r9 + r5
            r8.f9828 = r9
            return
    }

    /* JADX INFO: renamed from: ψ */
    public final void m5465(p000.rx1 r5) {
            r4 = this;
            r5.getClass()
        L3:
            r0 = 8192(0x2000, double:4.0474E-320)
            long r0 = r5.mo2106(r0, r4)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L10
            goto L3
        L10:
            return
    }

    /* JADX INFO: renamed from: ω */
    public final void m5466(int r5) {
            r4 = this;
            r0 = 1
            rr1 r0 = r4.m5462(r0)
            byte[] r1 = r0.f9471
            int r2 = r0.f9473
            int r3 = r2 + 1
            r0.f9473 = r3
            byte r5 = (byte) r5
            r1[r2] = r5
            long r0 = r4.f9828
            r2 = 1
            long r0 = r0 + r2
            r4.f9828 = r0
            return
    }
}
