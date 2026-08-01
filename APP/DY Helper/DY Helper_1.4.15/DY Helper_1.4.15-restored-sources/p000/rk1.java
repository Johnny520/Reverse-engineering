package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class rk1 implements p000.InterfaceC0014ad {

    /* JADX INFO: renamed from: ε */
    public final p000.rx1 f9395;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0793sc f9396;

    /* JADX INFO: renamed from: η */
    public boolean f9397;

    public rk1(p000.rx1 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f9395 = r1
            sc r1 = new sc
            r1.<init>()
            r0.f9396 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
            r2 = this;
            boolean r0 = r2.f9397
            if (r0 != 0) goto L13
            r0 = 1
            r2.f9397 = r0
            rx1 r0 = r2.f9395
            r0.close()
            sc r2 = r2.f9396
            long r0 = r2.f9828
            r2.skip(r0)
        L13:
            return
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
            r0 = this;
            boolean r0 = r0.f9397
            r0 = r0 ^ 1
            return r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer r6) {
            r5 = this;
            r6.getClass()
            sc r0 = r5.f9396
            long r1 = r0.f9828
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1d
            rx1 r5 = r5.f9395
            r1 = 8192(0x2000, double:4.0474E-320)
            long r1 = r5.mo2106(r1, r0)
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1d
            r5 = -1
            return r5
        L1d:
            int r5 = r0.read(r6)
            return r5
    }

    @Override // p000.InterfaceC0014ad
    public final byte readByte() {
            r2 = this;
            r0 = 1
            r2.mo61(r0)
            sc r2 = r2.f9396
            byte r2 = r2.readByte()
            return r2
    }

    @Override // p000.InterfaceC0014ad
    public final int readInt() {
            r2 = this;
            r0 = 4
            r2.mo61(r0)
            sc r2 = r2.f9396
            int r2 = r2.readInt()
            return r2
    }

    @Override // p000.InterfaceC0014ad
    public final short readShort() {
            r2 = this;
            r0 = 2
            r2.mo61(r0)
            sc r2 = r2.f9396
            short r2 = r2.readShort()
            return r2
    }

    @Override // p000.InterfaceC0014ad
    public final void skip(long r6) {
            r5 = this;
            boolean r0 = r5.f9397
            if (r0 != 0) goto L33
        L4:
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L32
            sc r2 = r5.f9396
            long r3 = r2.f9828
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L27
            rx1 r0 = r5.f9395
            r3 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.mo2106(r3, r2)
            r3 = -1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L21
            goto L27
        L21:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L27:
            long r0 = r2.f9828
            long r0 = java.lang.Math.min(r6, r0)
            r2.skip(r0)
            long r6 = r6 - r0
            goto L4
        L32:
            return
        L33:
            java.lang.String r5 = "closed"
            p000.C1080.m7279(r5)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffer("
            r0.<init>(r1)
            rx1 r2 = r2.f9395
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: α */
    public final p000.m42 mo2105() {
            r0 = this;
            rx1 r0 = r0.f9395
            m42 r0 = r0.mo2105()
            return r0
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: β */
    public final long mo2106(long r7, p000.C0793sc r9) {
            r6 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L3a
            boolean r3 = r6.f9397
            if (r3 != 0) goto L32
            sc r3 = r6.f9396
            long r4 = r3.f9828
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L27
            if (r2 != 0) goto L18
            return r0
        L18:
            rx1 r6 = r6.f9395
            r0 = 8192(0x2000, double:4.0474E-320)
            long r0 = r6.mo2106(r0, r3)
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L27
            return r4
        L27:
            long r0 = r3.f9828
            long r6 = java.lang.Math.min(r7, r0)
            long r6 = r3.mo2106(r6, r9)
            return r6
        L32:
            java.lang.String r6 = "closed"
            p000.C1080.m7279(r6)
            r6 = 0
            return r6
        L3a:
            java.lang.String r6 = "byteCount < 0: "
            java.lang.String r6 = p000.AbstractC0602nx.m4126(r7, r6)
            p000.C1080.m7266(r6)
            r6 = 0
            return r6
    }

    @Override // p000.InterfaceC0014ad
    /* JADX INFO: renamed from: γ */
    public final p000.C0208dd mo58(long r1) {
            r0 = this;
            r0.mo61(r1)
            sc r0 = r0.f9396
            dd r0 = r0.mo58(r1)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final boolean m5109() {
            r4 = this;
            boolean r0 = r4.f9397
            if (r0 != 0) goto L1e
            sc r0 = r4.f9396
            boolean r1 = r0.m5454()
            if (r1 == 0) goto L1c
            rx1 r4 = r4.f9395
            r1 = 8192(0x2000, double:4.0474E-320)
            long r0 = r4.mo2106(r1, r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1c
            r4 = 1
            return r4
        L1c:
            r4 = 0
            return r4
        L1e:
            java.lang.String r4 = "closed"
            p000.C1080.m7279(r4)
            r4 = 0
            return r4
    }

    @Override // p000.InterfaceC0014ad
    /* JADX INFO: renamed from: ε */
    public final byte[] mo59() {
            r2 = this;
            rx1 r0 = r2.f9395
            sc r2 = r2.f9396
            r2.m5465(r0)
            long r0 = r2.f9828
            byte[] r2 = r2.m5457(r0)
            return r2
    }

    /* JADX INFO: renamed from: η */
    public final long m5110(byte r10, long r11, long r13) {
            r9 = this;
            boolean r11 = r9.f9397
            if (r11 != 0) goto L46
            r11 = 0
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 > 0) goto L39
            r3 = r11
        Lb:
            int r11 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            r7 = -1
            if (r11 >= 0) goto L38
            sc r1 = r9.f9396
            r2 = r10
            r5 = r13
            long r10 = r1.m5456(r2, r3, r5)
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L1e
            return r10
        L1e:
            long r10 = r1.f9828
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 >= 0) goto L38
            rx1 r12 = r9.f9395
            r13 = 8192(0x2000, double:4.0474E-320)
            long r12 = r12.mo2106(r13, r1)
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 != 0) goto L31
            goto L38
        L31:
            long r3 = java.lang.Math.max(r3, r10)
            r10 = r2
            r13 = r5
            goto Lb
        L38:
            return r7
        L39:
            r5 = r13
            java.lang.String r9 = "fromIndex=0 toIndex="
            java.lang.String r9 = p000.AbstractC0602nx.m4126(r5, r9)
            p000.C1080.m7266(r9)
        L43:
            r9 = 0
            return r9
        L46:
            java.lang.String r9 = "closed"
            p000.C1080.m7279(r9)
            goto L43
    }

    /* JADX INFO: renamed from: θ */
    public final int m5111() {
            r2 = this;
            r0 = 4
            r2.mo61(r0)
            sc r2 = r2.f9396
            int r2 = r2.readInt()
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

    @Override // p000.InterfaceC0014ad
    /* JADX INFO: renamed from: ι */
    public final java.lang.String mo60(long r19) {
            r18 = this;
            r6 = r19
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L9c
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r10 = 1
            if (r0 != 0) goto L15
            r4 = r8
            goto L18
        L15:
            long r0 = r6 + r10
            r4 = r0
        L18:
            r1 = 10
            r2 = 0
            r0 = r18
            long r1 = r0.m5110(r1, r2, r4)
            r12 = -1
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            sc r12 = r0.f9396
            if (r3 == 0) goto L2f
            java.lang.String r0 = p000.AbstractC1079.m7263(r1, r12)
            return r0
        L2f:
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L58
            boolean r1 = r0.m5112(r4)
            if (r1 == 0) goto L58
            long r1 = r4 - r10
            byte r1 = r12.m5455(r1)
            r2 = 13
            if (r1 != r2) goto L58
            long r1 = r4 + r10
            boolean r0 = r0.m5112(r1)
            if (r0 == 0) goto L58
            byte r0 = r12.m5455(r4)
            r1 = 10
            if (r0 != r1) goto L58
            java.lang.String r0 = p000.AbstractC1079.m7263(r4, r12)
            return r0
        L58:
            sc r13 = new sc
            r13.<init>()
            long r0 = r12.f9828
            r2 = 32
            long r2 = (long) r2
            long r16 = java.lang.Math.min(r2, r0)
            r14 = 0
            r12.m5453(r13, r14, r16)
            java.io.EOFException r0 = new java.io.EOFException
            long r1 = r12.f9828
            long r1 = java.lang.Math.min(r1, r6)
            long r3 = r13.f9828
            dd r3 = r13.mo58(r3)
            java.lang.String r3 = r3.mo1702()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "\\n not found: limit="
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = " content="
            r4.append(r1)
            r4.append(r3)
            r1 = 8230(0x2026, float:1.1533E-41)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L9c:
            java.lang.String r0 = "limit < 0: "
            java.lang.String r0 = p000.AbstractC0602nx.m4126(r6, r0)
            p000.C1080.m7266(r0)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public final boolean m5112(long r5) {
            r4 = this;
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L2b
            boolean r0 = r4.f9397
            if (r0 != 0) goto L24
        La:
            sc r0 = r4.f9396
            long r1 = r0.f9828
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L22
            rx1 r1 = r4.f9395
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r1.mo2106(r2, r0)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto La
            r4 = 0
            return r4
        L22:
            r4 = 1
            return r4
        L24:
            java.lang.String r4 = "closed"
            p000.C1080.m7279(r4)
        L29:
            r4 = 0
            return r4
        L2b:
            java.lang.String r4 = "byteCount < 0: "
            java.lang.String r4 = p000.AbstractC0602nx.m4126(r5, r4)
            p000.C1080.m7266(r4)
            goto L29
    }

    @Override // p000.InterfaceC0014ad
    /* JADX INFO: renamed from: μ */
    public final void mo61(long r1) {
            r0 = this;
            boolean r0 = r0.m5112(r1)
            if (r0 == 0) goto L7
            return
        L7:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // p000.InterfaceC0014ad
    /* JADX INFO: renamed from: π */
    public final java.io.InputStream mo62() {
            r2 = this;
            rc r0 = new rc
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }
}
