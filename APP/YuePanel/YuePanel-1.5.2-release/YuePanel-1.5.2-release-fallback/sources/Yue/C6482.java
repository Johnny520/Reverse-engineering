package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6482 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final Yue.C6489 f22789 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final Yue.C3835<java.lang.String, android.graphics.Typeface> f22790 = null;

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public static class C6483 extends Yue.C2736.C2740 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public Yue.C5362.AbstractC5368 f22791;

        public C6483(@Yue.InterfaceC4544 Yue.C5362.AbstractC5368 r1) {
                r0 = this;
                r0.<init>()
                r0.f22791 = r1
                return
        }

        @Override // Yue.C2736.C2740
        /* JADX INFO: renamed from: ۥ */
        public void mo12017(int r2) {
                r1 = this;
                Yue.ۥۡۦۦۣ$ۥ۟۟۟۠ r0 = r1.f22791
                if (r0 == 0) goto L7
                r0.onFontRetrievalFailed(r2)
            L7:
                return
        }

        @Override // Yue.C2736.C2740
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo12018(@Yue.InterfaceC4410 android.graphics.Typeface r2) {
                r1 = this;
                Yue.ۥۡۦۦۣ$ۥ۟۟۟۠ r0 = r1.f22791
                if (r0 == 0) goto L7
                r0.onFontRetrieved(r2)
            L7:
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            Yue.ۥۢۢۤۢ r0 = new Yue.ۥۢۢۤۢ
            r0.<init>()
            Yue.C6482.f22789 = r0
            goto L21
        Le:
            r1 = 28
            if (r0 < r1) goto L1a
            Yue.ۥۢۢۤۡ r0 = new Yue.ۥۢۢۤۡ
            r0.<init>()
            Yue.C6482.f22789 = r0
            goto L21
        L1a:
            Yue.ۥۢۢۤ۠ r0 = new Yue.ۥۢۢۤ۠
            r0.<init>()
            Yue.C6482.f22789 = r0
        L21:
            Yue.ۥۣ۠ۨۨ r0 = new Yue.ۥۣ۠ۨۨ
            r1 = 16
            r0.<init>(r1)
            Yue.C6482.f22790 = r0
            return
    }

    public C6482() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m23915() {
            Yue.ۥۣ۠ۨۨ<java.lang.String, android.graphics.Typeface> r0 = Yue.C6482.f22790
            r0.m15360()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.graphics.Typeface m23916(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC4544 android.graphics.Typeface r1, int r2) {
            if (r0 == 0) goto L7
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r1, r2)
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Context cannot be null"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.graphics.Typeface m23917(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4544 android.graphics.Typeface r4, @Yue.InterfaceC3281(from = 1, to = 1000) int r5, boolean r6) {
            if (r3 == 0) goto L15
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r1 = "weight"
            r2 = 1
            Yue.C4868.m19176(r5, r2, r0, r1)
            if (r4 != 0) goto Le
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
        Le:
            Yue.ۥۣۢۢۤ r0 = Yue.C6482.f22789
            android.graphics.Typeface r3 = r0.mo23934(r3, r4, r5, r6)
            return r3
        L15:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Context cannot be null"
            r3.<init>(r4)
            throw r3
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static android.graphics.Typeface m23918(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.os.CancellationSignal r2, @Yue.InterfaceC4410 Yue.C2736.C2739[] r3, int r4) {
            Yue.ۥۣۢۢۤ r0 = Yue.C6482.f22789
            android.graphics.Typeface r1 = r0.mo23933(r1, r2, r3, r4)
            return r1
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static android.graphics.Typeface m23919(@Yue.InterfaceC4410 android.content.Context r10, @Yue.InterfaceC4410 Yue.C2729.InterfaceC2731 r11, @Yue.InterfaceC4410 android.content.res.Resources r12, int r13, int r14, @Yue.InterfaceC4544 Yue.C5362.AbstractC5368 r15, @Yue.InterfaceC4544 android.os.Handler r16, boolean r17) {
            r4 = 0
            r5 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            android.graphics.Typeface r0 = m23920(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static android.graphics.Typeface m23920(@Yue.InterfaceC4410 android.content.Context r13, @Yue.InterfaceC4410 Yue.C2729.InterfaceC2731 r14, @Yue.InterfaceC4410 android.content.res.Resources r15, int r16, @Yue.InterfaceC4544 java.lang.String r17, int r18, int r19, @Yue.InterfaceC4544 Yue.C5362.AbstractC5368 r20, @Yue.InterfaceC4544 android.os.Handler r21, boolean r22) {
            r0 = r14
            r1 = r20
            r2 = r21
            boolean r3 = r0 instanceof Yue.C2729.C2735
            if (r3 == 0) goto L4e
            Yue.ۥ۠ۢۦۡ$ۥ۟۟۟۠ r0 = (Yue.C2729.C2735) r0
            java.lang.String r3 = r0.m11997()
            android.graphics.Typeface r3 = m23927(r3)
            if (r3 == 0) goto L1b
            if (r1 == 0) goto L1a
            r1.callbackSuccessAsync(r3, r2)
        L1a:
            return r3
        L1b:
            r3 = 0
            r4 = 1
            if (r22 == 0) goto L29
            int r5 = r0.m11995()
            if (r5 != 0) goto L27
        L25:
            r9 = r4
            goto L2c
        L27:
            r9 = r3
            goto L2c
        L29:
            if (r1 != 0) goto L27
            goto L25
        L2c:
            if (r22 == 0) goto L34
            int r3 = r0.m11998()
        L32:
            r10 = r3
            goto L36
        L34:
            r3 = -1
            goto L32
        L36:
            android.os.Handler r11 = Yue.C5362.AbstractC5368.getHandler(r21)
            Yue.ۥۣۢۢۨ$ۥ r12 = new Yue.ۥۣۢۢۨ$ۥ
            r12.<init>(r1)
            Yue.ۥ۠ۢۥۧ r7 = r0.m11996()
            r6 = r13
            r8 = r19
            android.graphics.Typeface r0 = Yue.C2736.m12004(r6, r7, r8, r9, r10, r11, r12)
            r5 = r15
            r6 = r19
            goto L66
        L4e:
            Yue.ۥۣۢۢۤ r3 = Yue.C6482.f22789
            Yue.ۥ۠ۢۦۡ$ۥ۟۟۟ r0 = (Yue.C2729.C2733) r0
            r4 = r13
            r5 = r15
            r6 = r19
            android.graphics.Typeface r0 = r3.mo23932(r13, r0, r15, r6)
            if (r1 == 0) goto L66
            if (r0 == 0) goto L62
            r1.callbackSuccessAsync(r0, r2)
            goto L66
        L62:
            r3 = -3
            r1.callbackFailAsync(r3, r2)
        L66:
            if (r0 == 0) goto L71
            Yue.ۥۣ۠ۨۨ<java.lang.String, android.graphics.Typeface> r1 = Yue.C6482.f22790
            java.lang.String r2 = m23923(r15, r16, r17, r18, r19)
            r1.m15366(r2, r0)
        L71:
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static android.graphics.Typeface m23921(@Yue.InterfaceC4410 android.content.Context r6, @Yue.InterfaceC4410 android.content.res.Resources r7, int r8, java.lang.String r9, int r10) {
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            android.graphics.Typeface r6 = m23922(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static android.graphics.Typeface m23922(@Yue.InterfaceC4410 android.content.Context r6, @Yue.InterfaceC4410 android.content.res.Resources r7, int r8, java.lang.String r9, int r10, int r11) {
            Yue.ۥۣۢۢۤ r0 = Yue.C6482.f22789
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r11
            android.graphics.Typeface r6 = r0.mo23940(r1, r2, r3, r4, r5)
            if (r6 == 0) goto L16
            java.lang.String r7 = m23923(r7, r8, r9, r10, r11)
            Yue.ۥۣ۠ۨۨ<java.lang.String, android.graphics.Typeface> r8 = Yue.C6482.f22790
            r8.m15366(r7, r6)
        L16:
            return r6
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static java.lang.String m23923(android.content.res.Resources r1, int r2, java.lang.String r3, int r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getResourcePackageName(r2)
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            r0.append(r3)
            r0.append(r1)
            r0.append(r4)
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static android.graphics.Typeface m23924(@Yue.InterfaceC4410 android.content.res.Resources r2, int r3, int r4) {
            r0 = 0
            r1 = 0
            android.graphics.Typeface r2 = m23925(r2, r3, r0, r1, r4)
            return r2
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static android.graphics.Typeface m23925(@Yue.InterfaceC4410 android.content.res.Resources r1, int r2, @Yue.InterfaceC4544 java.lang.String r3, int r4, int r5) {
            Yue.ۥۣ۠ۨۨ<java.lang.String, android.graphics.Typeface> r0 = Yue.C6482.f22790
            java.lang.String r1 = m23923(r1, r2, r3, r4, r5)
            java.lang.Object r1 = r0.m15362(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static android.graphics.Typeface m23926(android.content.Context r2, android.graphics.Typeface r3, int r4) {
            Yue.ۥۣۢۢۤ r0 = Yue.C6482.f22789
            Yue.ۥ۠ۢۦۡ$ۥ۟۟۟ r3 = r0.m23966(r3)
            if (r3 != 0) goto La
            r2 = 0
            return r2
        La:
            android.content.res.Resources r1 = r2.getResources()
            android.graphics.Typeface r2 = r0.mo23932(r2, r3, r1, r4)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static android.graphics.Typeface m23927(@Yue.InterfaceC4544 java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L1e
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto La
            goto L1e
        La:
            r1 = 0
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r1)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r2, r1)
            if (r3 == 0) goto L1e
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L1e
            r0 = r3
        L1e:
            return r0
    }
}
