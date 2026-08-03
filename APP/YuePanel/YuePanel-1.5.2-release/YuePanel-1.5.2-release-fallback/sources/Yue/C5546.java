package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Segment.kt\nokio/Segment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
public final class C5546 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5546.C5547 f20487 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f20488 = 8192;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f20489 = 1024;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final byte[] f20490;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    public int f20491;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    public int f20492;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    public boolean f20493;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    public boolean f20494;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public Yue.C5546 f20495;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public Yue.C5546 f20496;

    /* JADX INFO: renamed from: Yue.ۥۡۧۨ$ۥ, reason: contains not printable characters */
    public static final class C5547 {
        public C5547() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C5547(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥۡۧۨ$ۥ r0 = new Yue.ۥۡۧۨ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C5546.f20487 = r0
            return
    }

    public C5546() {
            r1 = this;
            r1.<init>()
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1.f20490 = r0
            r0 = 1
            r1.f20494 = r0
            r0 = 0
            r1.f20493 = r0
            return
    }

    public C5546(@Yue.InterfaceC4418 byte[] r2, int r3, int r4, boolean r5, boolean r6) {
            r1 = this;
            java.lang.String r0 = "data"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f20490 = r2
            r1.f20491 = r3
            r1.f20492 = r4
            r1.f20493 = r5
            r1.f20494 = r6
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m20803() {
            r3 = this;
            Yue.ۥۡۧۨ r0 = r3.f20496
            if (r0 == r3) goto L3f
            Yue.C3329.m13903(r0)
            boolean r0 = r0.f20494
            if (r0 != 0) goto Lc
            return
        Lc:
            int r0 = r3.f20492
            int r1 = r3.f20491
            int r0 = r0 - r1
            Yue.ۥۡۧۨ r1 = r3.f20496
            Yue.C3329.m13903(r1)
            int r1 = r1.f20492
            int r1 = 8192 - r1
            Yue.ۥۡۧۨ r2 = r3.f20496
            Yue.C3329.m13903(r2)
            boolean r2 = r2.f20493
            if (r2 == 0) goto L25
            r2 = 0
            goto L2c
        L25:
            Yue.ۥۡۧۨ r2 = r3.f20496
            Yue.C3329.m13903(r2)
            int r2 = r2.f20491
        L2c:
            int r1 = r1 + r2
            if (r0 <= r1) goto L30
            return
        L30:
            Yue.ۥۡۧۨ r1 = r3.f20496
            Yue.C3329.m13903(r1)
            r3.m20809(r1, r0)
            r3.m20804()
            Yue.C5550.m20825(r3)
            return
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot compact"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C5546 m20804() {
            r4 = this;
            Yue.ۥۡۧۨ r0 = r4.f20495
            r1 = 0
            if (r0 == r4) goto L6
            goto L7
        L6:
            r0 = r1
        L7:
            Yue.ۥۡۧۨ r2 = r4.f20496
            Yue.C3329.m13903(r2)
            Yue.ۥۡۧۨ r3 = r4.f20495
            r2.f20495 = r3
            Yue.ۥۡۧۨ r2 = r4.f20495
            Yue.C3329.m13903(r2)
            Yue.ۥۡۧۨ r3 = r4.f20496
            r2.f20496 = r3
            r4.f20495 = r1
            r4.f20496 = r1
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C5546 m20805(@Yue.InterfaceC4418 Yue.C5546 r2) {
            r1 = this;
            java.lang.String r0 = "segment"
            Yue.C3329.m13906(r2, r0)
            r2.f20496 = r1
            Yue.ۥۡۧۨ r0 = r1.f20495
            r2.f20495 = r0
            Yue.ۥۡۧۨ r0 = r1.f20495
            Yue.C3329.m13903(r0)
            r0.f20496 = r2
            r1.f20495 = r2
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.C5546 m20806() {
            r7 = this;
            r0 = 1
            r7.f20493 = r0
            Yue.ۥۡۧۨ r0 = new Yue.ۥۡۧۨ
            byte[] r2 = r7.f20490
            int r3 = r7.f20491
            int r4 = r7.f20492
            r5 = 1
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Yue.C5546 m20807(int r9) {
            r8 = this;
            if (r9 <= 0) goto L37
            int r0 = r8.f20492
            int r1 = r8.f20491
            int r0 = r0 - r1
            if (r9 > r0) goto L37
            r0 = 1024(0x400, float:1.435E-42)
            if (r9 < r0) goto L12
            Yue.ۥۡۧۨ r0 = r8.m20806()
            goto L24
        L12:
            Yue.ۥۡۧۨ r0 = Yue.C5550.m20826()
            byte[] r1 = r8.f20490
            byte[] r2 = r0.f20490
            int r4 = r8.f20491
            int r5 = r4 + r9
            r6 = 2
            r7 = 0
            r3 = 0
            Yue.C0586.m2179(r1, r2, r3, r4, r5, r6, r7)
        L24:
            int r1 = r0.f20491
            int r1 = r1 + r9
            r0.f20492 = r1
            int r1 = r8.f20491
            int r1 = r1 + r9
            r8.f20491 = r1
            Yue.ۥۡۧۨ r9 = r8.f20496
            Yue.C3329.m13903(r9)
            r9.m20805(r0)
            return r0
        L37:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "byteCount out of range"
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Yue.C5546 m20808() {
            r7 = this;
            Yue.ۥۡۧۨ r6 = new Yue.ۥۡۧۨ
            byte[] r0 = r7.f20490
            int r1 = r0.length
            byte[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "copyOf(this, size)"
            Yue.C3329.m13905(r1, r0)
            int r2 = r7.f20491
            int r3 = r7.f20492
            r4 = 0
            r5 = 1
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m20809(@Yue.InterfaceC4418 Yue.C5546 r9, int r10) {
            r8 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r9, r0)
            boolean r0 = r9.f20494
            if (r0 == 0) goto L54
            int r5 = r9.f20492
            int r0 = r5 + r10
            r1 = 8192(0x2000, float:1.148E-41)
            if (r0 <= r1) goto L3c
            boolean r0 = r9.f20493
            if (r0 != 0) goto L36
            int r0 = r5 + r10
            int r4 = r9.f20491
            int r0 = r0 - r4
            if (r0 > r1) goto L30
            byte[] r2 = r9.f20490
            r6 = 2
            r7 = 0
            r3 = 0
            r1 = r2
            Yue.C0586.m2179(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r9.f20492
            int r1 = r9.f20491
            int r0 = r0 - r1
            r9.f20492 = r0
            r0 = 0
            r9.f20491 = r0
            goto L3c
        L30:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        L36:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        L3c:
            byte[] r0 = r8.f20490
            byte[] r1 = r9.f20490
            int r2 = r9.f20492
            int r3 = r8.f20491
            int r4 = r3 + r10
            Yue.C0586.m2170(r0, r1, r2, r3, r4)
            int r0 = r9.f20492
            int r0 = r0 + r10
            r9.f20492 = r0
            int r9 = r8.f20491
            int r9 = r9 + r10
            r8.f20491 = r9
            return
        L54:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "only owner can write"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }
}
