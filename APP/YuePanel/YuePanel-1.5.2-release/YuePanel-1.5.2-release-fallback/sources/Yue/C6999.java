package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nWebSocketWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketWriter.kt\nokhttp3/internal/ws/WebSocketWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
public final class C6999 implements java.io.Closeable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f24458;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC0848 f24459;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.Random f24460;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean f24461;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean f24462;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final long f24463;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0843 f24464;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0843 f24465;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean f24466;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C4173 f24467;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final byte[] f24468;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.C0843.C0844 f24469;

    public C6999(boolean r2, @Yue.InterfaceC4418 Yue.InterfaceC0848 r3, @Yue.InterfaceC4418 java.util.Random r4, boolean r5, boolean r6, long r7) {
            r1 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "random"
            Yue.C3329.m13906(r4, r0)
            r1.<init>()
            r1.f24458 = r2
            r1.f24459 = r3
            r1.f24460 = r4
            r1.f24461 = r5
            r1.f24462 = r6
            r1.f24463 = r7
            Yue.ۥۣ۟ۢۨ r4 = new Yue.ۥۣ۟ۢۨ
            r4.<init>()
            r1.f24464 = r4
            Yue.ۥۣ۟ۢۨ r3 = r3.mo4810()
            r1.f24465 = r3
            r3 = 0
            if (r2 == 0) goto L2d
            r4 = 4
            byte[] r4 = new byte[r4]
            goto L2e
        L2d:
            r4 = r3
        L2e:
            r1.f24468 = r4
            if (r2 == 0) goto L37
            Yue.ۥۣ۟ۢۨ$ۥ r3 = new Yue.ۥۣ۟ۢۨ$ۥ
            r3.<init>()
        L37:
            r1.f24469 = r3
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            Yue.ۥۡۡ۟۟ r0 = r1.f24467
            if (r0 == 0) goto L7
            r0.close()
        L7:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.Random m27112() {
            r1 = this;
            java.util.Random r0 = r1.f24460
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.InterfaceC0848 m27113() {
            r1 = this;
            Yue.ۥۣۣ۟۟ r0 = r1.f24459
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m27114(int r2, @Yue.InterfaceC4543 Yue.C0879 r3) throws java.io.IOException {
            r1 = this;
            Yue.ۥۣ۟ۥۤ r0 = Yue.C0879.f2558
            if (r2 != 0) goto L6
            if (r3 == 0) goto L1e
        L6:
            if (r2 == 0) goto Ld
            Yue.ۥۢۥۡۨ r0 = Yue.C6992.f24398
            r0.m27053(r2)
        Ld:
            Yue.ۥۣ۟ۢۨ r0 = new Yue.ۥۣ۟ۢۨ
            r0.<init>()
            r0.m4905(r2)
            if (r3 == 0) goto L1a
            r0.m4893(r3)
        L1a:
            Yue.ۥۣ۟ۥۤ r0 = r0.mo4853()
        L1e:
            r2 = 8
            r3 = 1
            r1.m27115(r2, r0)     // Catch: java.lang.Throwable -> L27
            r1.f24466 = r3
            return
        L27:
            r2 = move-exception
            r1.f24466 = r3
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m27115(int r6, Yue.C0879 r7) throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.f24466
            if (r0 != 0) goto L79
            int r0 = r7.m5095()
            long r1 = (long) r0
            r3 = 125(0x7d, double:6.2E-322)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L6d
            r6 = r6 | 128(0x80, float:1.8E-43)
            Yue.ۥۣ۟ۢۨ r1 = r5.f24465
            r1.m4898(r6)
            boolean r6 = r5.f24458
            if (r6 == 0) goto L5d
            r6 = r0 | 128(0x80, float:1.8E-43)
            Yue.ۥۣ۟ۢۨ r1 = r5.f24465
            r1.m4898(r6)
            java.util.Random r6 = r5.f24460
            byte[] r1 = r5.f24468
            Yue.C3329.m13903(r1)
            r6.nextBytes(r1)
            Yue.ۥۣ۟ۢۨ r6 = r5.f24465
            byte[] r1 = r5.f24468
            r6.m4896(r1)
            if (r0 <= 0) goto L67
            Yue.ۥۣ۟ۢۨ r6 = r5.f24465
            long r0 = r6.m4889()
            Yue.ۥۣ۟ۢۨ r6 = r5.f24465
            r6.m4893(r7)
            Yue.ۥۣ۟ۢۨ r6 = r5.f24465
            Yue.ۥۣ۟ۢۨ$ۥ r7 = r5.f24469
            Yue.C3329.m13903(r7)
            r6.m4865(r7)
            Yue.ۥۣ۟ۢۨ$ۥ r6 = r5.f24469
            r6.m4918(r0)
            Yue.ۥۢۥۡۨ r6 = Yue.C6992.f24398
            Yue.ۥۣ۟ۢۨ$ۥ r7 = r5.f24469
            byte[] r0 = r5.f24468
            r6.m27052(r7, r0)
            Yue.ۥۣ۟ۢۨ$ۥ r6 = r5.f24469
            r6.close()
            goto L67
        L5d:
            Yue.ۥۣ۟ۢۨ r6 = r5.f24465
            r6.m4898(r0)
            Yue.ۥۣ۟ۢۨ r6 = r5.f24465
            r6.m4893(r7)
        L67:
            Yue.ۥۣۣ۟۟ r6 = r5.f24459
            r6.flush()
            return
        L6d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Payload size must be less than or equal to 125"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L79:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "closed"
            r6.<init>(r7)
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m27116(int r6, @Yue.InterfaceC4418 Yue.C0879 r7) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "data"
            Yue.C3329.m13906(r7, r0)
            boolean r0 = r5.f24466
            if (r0 != 0) goto Lba
            Yue.ۥۣ۟ۢۨ r0 = r5.f24464
            r0.m4893(r7)
            r0 = r6 | 128(0x80, float:1.8E-43)
            boolean r1 = r5.f24461
            if (r1 == 0) goto L33
            int r7 = r7.m5095()
            long r1 = (long) r7
            long r3 = r5.f24463
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 < 0) goto L33
            Yue.ۥۡۡ۟۟ r7 = r5.f24467
            if (r7 != 0) goto L2c
            Yue.ۥۡۡ۟۟ r7 = new Yue.ۥۡۡ۟۟
            boolean r0 = r5.f24462
            r7.<init>(r0)
            r5.f24467 = r7
        L2c:
            Yue.ۥۣ۟ۢۨ r0 = r5.f24464
            r7.m16309(r0)
            r0 = r6 | 192(0xc0, float:2.69E-43)
        L33:
            Yue.ۥۣ۟ۢۨ r6 = r5.f24464
            long r6 = r6.m4889()
            Yue.ۥۣ۟ۢۨ r1 = r5.f24465
            r1.m4898(r0)
            boolean r0 = r5.f24458
            if (r0 == 0) goto L45
            r0 = 128(0x80, float:1.8E-43)
            goto L46
        L45:
            r0 = 0
        L46:
            r1 = 125(0x7d, double:6.2E-322)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 > 0) goto L54
            int r1 = (int) r6
            r0 = r0 | r1
            Yue.ۥۣ۟ۢۨ r1 = r5.f24465
            r1.m4898(r0)
            goto L75
        L54:
            r1 = 65535(0xffff, double:3.23786E-319)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 > 0) goto L69
            r0 = r0 | 126(0x7e, float:1.77E-43)
            Yue.ۥۣ۟ۢۨ r1 = r5.f24465
            r1.m4898(r0)
            Yue.ۥۣ۟ۢۨ r0 = r5.f24465
            int r1 = (int) r6
            r0.m4905(r1)
            goto L75
        L69:
            r0 = r0 | 127(0x7f, float:1.78E-43)
            Yue.ۥۣ۟ۢۨ r1 = r5.f24465
            r1.m4898(r0)
            Yue.ۥۣ۟ۢۨ r0 = r5.f24465
            r0.m4903(r6)
        L75:
            boolean r0 = r5.f24458
            if (r0 == 0) goto Lad
            java.util.Random r0 = r5.f24460
            byte[] r1 = r5.f24468
            Yue.C3329.m13903(r1)
            r0.nextBytes(r1)
            Yue.ۥۣ۟ۢۨ r0 = r5.f24465
            byte[] r1 = r5.f24468
            r0.m4896(r1)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lad
            Yue.ۥۣ۟ۢۨ r2 = r5.f24464
            Yue.ۥۣ۟ۢۨ$ۥ r3 = r5.f24469
            Yue.C3329.m13903(r3)
            r2.m4865(r3)
            Yue.ۥۣ۟ۢۨ$ۥ r2 = r5.f24469
            r2.m4918(r0)
            Yue.ۥۢۥۡۨ r0 = Yue.C6992.f24398
            Yue.ۥۣ۟ۢۨ$ۥ r1 = r5.f24469
            byte[] r2 = r5.f24468
            r0.m27052(r1, r2)
            Yue.ۥۣ۟ۢۨ$ۥ r0 = r5.f24469
            r0.close()
        Lad:
            Yue.ۥۣ۟ۢۨ r0 = r5.f24465
            Yue.ۥۣ۟ۢۨ r1 = r5.f24464
            r0.mo4176(r1, r6)
            Yue.ۥۣۣ۟۟ r6 = r5.f24459
            r6.mo4819()
            return
        Lba:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "closed"
            r6.<init>(r7)
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m27117(@Yue.InterfaceC4418 Yue.C0879 r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "payload"
            Yue.C3329.m13906(r2, r0)
            r0 = 9
            r1.m27115(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m27118(@Yue.InterfaceC4418 Yue.C0879 r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "payload"
            Yue.C3329.m13906(r2, r0)
            r0 = 10
            r1.m27115(r0, r2)
            return
    }
}
