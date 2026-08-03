package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nGzipSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,220:1\n1#2:221\n62#3:222\n62#3:224\n62#3:226\n62#3:227\n62#3:228\n62#3:230\n62#3:232\n202#4:223\n202#4:225\n202#4:229\n202#4:231\n89#5:233\n*S KotlinDebug\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n*L\n105#1:222\n107#1:224\n119#1:226\n120#1:227\n122#1:228\n133#1:230\n144#1:232\n106#1:223\n117#1:225\n130#1:229\n141#1:231\n187#1:233\n*E\n"})
public final class C2953 implements Yue.InterfaceC5839 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public byte f9574;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C5213 f9575;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.zip.Inflater f9576;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C3244 f9577;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.zip.CRC32 f9578;

    public C2953(@Yue.InterfaceC4418 Yue.InterfaceC5839 r3) {
            r2 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r3, r0)
            r2.<init>()
            Yue.ۥۡۦۣ۠ r0 = new Yue.ۥۡۦۣ۠
            r0.<init>(r3)
            r2.f9575 = r0
            java.util.zip.Inflater r3 = new java.util.zip.Inflater
            r1 = 1
            r3.<init>(r1)
            r2.f9576 = r3
            Yue.ۥ۠ۥۡۨ r1 = new Yue.ۥ۠ۥۡۨ
            r1.<init>(r0, r3)
            r2.f9577 = r1
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32
            r3.<init>()
            r2.f9578 = r3
            return
    }

    @Override // Yue.InterfaceC5839, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            Yue.ۥ۠ۥۡۨ r0 = r1.f9577
            r0.close()
            return
    }

    @Override // Yue.InterfaceC5839
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.C6250 mo4177() {
            r1 = this;
            Yue.ۥۡۦۣ۠ r0 = r1.f9575
            Yue.ۥۢۡۤۧ r0 = r0.mo4177()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m12569(java.lang.String r2, int r3, int r4) {
            r1 = this;
            if (r4 != r3) goto L3
            return
        L3:
            java.io.IOException r0 = new java.io.IOException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r4, r3}
            r3 = 3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r3 = "%s: actual 0x%08x != expected 0x%08x"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "format(this, *args)"
            Yue.C3329.m13905(r2, r3)
            r0.<init>(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m12570() throws java.io.IOException {
            r17 = this;
            r6 = r17
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            r1 = 10
            r0.mo4875(r1)
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            Yue.ۥۣ۟ۢۨ r0 = r0.f19561
            r1 = 3
            byte r7 = r0.m4855(r1)
            int r0 = r7 >> 1
            r8 = 1
            r0 = r0 & r8
            r9 = 0
            if (r0 != r8) goto L1c
            r10 = r8
            goto L1d
        L1c:
            r10 = r9
        L1d:
            if (r10 == 0) goto L2c
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            Yue.ۥۣ۟ۢۨ r1 = r0.f19561
            r2 = 0
            r4 = 10
            r0 = r17
            r0.m12572(r1, r2, r4)
        L2c:
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            short r0 = r0.readShort()
            java.lang.String r1 = "ID1ID2"
            r2 = 8075(0x1f8b, float:1.1315E-41)
            r6.m12569(r1, r2, r0)
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            r1 = 8
            r0.skip(r1)
            int r0 = r7 >> 2
            r0 = r0 & r8
            if (r0 != r8) goto L80
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            r1 = 2
            r0.mo4875(r1)
            if (r10 == 0) goto L5b
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            Yue.ۥۣ۟ۢۨ r1 = r0.f19561
            r2 = 0
            r4 = 2
            r0 = r17
            r0.m12572(r1, r2, r4)
        L5b:
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            Yue.ۥۣ۟ۢۨ r0 = r0.f19561
            short r0 = r0.mo4871()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            long r11 = (long) r0
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            r0.mo4875(r11)
            if (r10 == 0) goto L7b
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            Yue.ۥۣ۟ۢۨ r1 = r0.f19561
            r2 = 0
            r0 = r17
            r4 = r11
            r0.m12572(r1, r2, r4)
        L7b:
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            r0.skip(r11)
        L80:
            int r0 = r7 >> 3
            r0 = r0 & r8
            r11 = -1
            r13 = 1
            if (r0 != r8) goto Lb0
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            long r15 = r0.mo4878(r9)
            int r0 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r0 == 0) goto Laa
            if (r10 == 0) goto La2
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            Yue.ۥۣ۟ۢۨ r1 = r0.f19561
            r2 = 0
            long r4 = r15 + r13
            r0 = r17
            r0.m12572(r1, r2, r4)
        La2:
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            long r1 = r15 + r13
            r0.skip(r1)
            goto Lb0
        Laa:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Lb0:
            int r0 = r7 >> 4
            r0 = r0 & r8
            if (r0 != r8) goto Ldb
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            long r7 = r0.mo4878(r9)
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 == 0) goto Ld5
            if (r10 == 0) goto Lce
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            Yue.ۥۣ۟ۢۨ r1 = r0.f19561
            r2 = 0
            long r4 = r7 + r13
            r0 = r17
            r0.m12572(r1, r2, r4)
        Lce:
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            long r7 = r7 + r13
            r0.skip(r7)
            goto Ldb
        Ld5:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Ldb:
            if (r10 == 0) goto Lf5
            Yue.ۥۡۦۣ۠ r0 = r6.f9575
            short r0 = r0.mo4871()
            java.util.zip.CRC32 r1 = r6.f9578
            long r1 = r1.getValue()
            int r1 = (int) r1
            short r1 = (short) r1
            java.lang.String r2 = "FHCRC"
            r6.m12569(r2, r0, r1)
            java.util.zip.CRC32 r0 = r6.f9578
            r0.reset()
        Lf5:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m12571() throws java.io.IOException {
            r3 = this;
            Yue.ۥۡۦۣ۠ r0 = r3.f9575
            int r0 = r0.mo4862()
            java.util.zip.CRC32 r1 = r3.f9578
            long r1 = r1.getValue()
            int r1 = (int) r1
            java.lang.String r2 = "CRC"
            r3.m12569(r2, r0, r1)
            Yue.ۥۡۦۣ۠ r0 = r3.f9575
            int r0 = r0.mo4862()
            java.util.zip.Inflater r1 = r3.f9576
            long r1 = r1.getBytesWritten()
            int r1 = (int) r1
            java.lang.String r2 = "ISIZE"
            r3.m12569(r2, r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m12572(Yue.C0843 r5, long r6, long r8) {
            r4 = this;
            Yue.ۥۡۧۨ r5 = r5.f2378
            Yue.C3329.m13903(r5)
        L5:
            int r0 = r5.f20492
            int r1 = r5.f20491
            int r2 = r0 - r1
            long r2 = (long) r2
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L19
            int r0 = r0 - r1
            long r0 = (long) r0
            long r6 = r6 - r0
            Yue.ۥۡۧۨ r5 = r5.f20495
            Yue.C3329.m13903(r5)
            goto L5
        L19:
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3d
            int r2 = r5.f20491
            long r2 = (long) r2
            long r2 = r2 + r6
            int r6 = (int) r2
            int r7 = r5.f20492
            int r7 = r7 - r6
            long r2 = (long) r7
            long r2 = java.lang.Math.min(r2, r8)
            int r7 = (int) r2
            java.util.zip.CRC32 r2 = r4.f9578
            byte[] r3 = r5.f20490
            r2.update(r3, r6, r7)
            long r6 = (long) r7
            long r8 = r8 - r6
            Yue.ۥۡۧۨ r5 = r5.f20495
            Yue.C3329.m13903(r5)
            r6 = r0
            goto L19
        L3d:
            return
    }

    @Override // Yue.InterfaceC5839
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public long mo4179(@Yue.InterfaceC4418 Yue.C0843 r12, long r13) throws java.io.IOException {
            r11 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L52
            if (r2 != 0) goto Le
            return r0
        Le:
            byte r0 = r11.f9574
            r1 = 1
            if (r0 != 0) goto L18
            r11.m12570()
            r11.f9574 = r1
        L18:
            byte r0 = r11.f9574
            r2 = 2
            r3 = -1
            if (r0 != r1) goto L36
            long r7 = r12.m4889()
            Yue.ۥ۠ۥۡۨ r0 = r11.f9577
            long r13 = r0.mo4179(r12, r13)
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 == 0) goto L34
            r5 = r11
            r6 = r12
            r9 = r13
            r5.m12572(r6, r7, r9)
            return r13
        L34:
            r11.f9574 = r2
        L36:
            byte r12 = r11.f9574
            if (r12 != r2) goto L51
            r11.m12571()
            r12 = 3
            r11.f9574 = r12
            Yue.ۥۡۦۣ۠ r12 = r11.f9575
            boolean r12 = r12.mo4827()
            if (r12 == 0) goto L49
            goto L51
        L49:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "gzip finished without exhausting source"
            r12.<init>(r13)
            throw r12
        L51:
            return r3
        L52:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r12.append(r0)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
    }
}
