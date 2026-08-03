package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nRealInterceptorChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealInterceptorChain.kt\nokhttp3/internal/http/RealInterceptorChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class C5228 implements Yue.InterfaceC3318.InterfaceC3319 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C5215 f19621;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<Yue.InterfaceC3318> f19622;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f19623;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.C2269 f19624;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C5317 f19625;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int f19626;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int f19627;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int f19628;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f19629;

    public C5228(@Yue.InterfaceC4418 Yue.C5215 r2, @Yue.InterfaceC4418 java.util.List<? extends Yue.InterfaceC3318> r3, int r4, @Yue.InterfaceC4543 Yue.C2269 r5, @Yue.InterfaceC4418 Yue.C5317 r6, int r7, int r8, int r9) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "interceptors"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "request"
            Yue.C3329.m13906(r6, r0)
            r1.<init>()
            r1.f19621 = r2
            r1.f19622 = r3
            r1.f19623 = r4
            r1.f19624 = r5
            r1.f19625 = r6
            r1.f19626 = r7
            r1.f19627 = r8
            r1.f19628 = r9
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ Yue.C5228 m19749(Yue.C5228 r4, int r5, Yue.C2269 r6, Yue.C5317 r7, int r8, int r9, int r10, int r11, java.lang.Object r12) {
            r12 = r11 & 1
            if (r12 == 0) goto L6
            int r5 = r4.f19623
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            Yue.ۥۣ۠ۡ۟ r6 = r4.f19624
        Lc:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L13
            Yue.ۥۡۦۤۧ r7 = r4.f19625
        L13:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L1a
            int r8 = r4.f19626
        L1a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L21
            int r9 = r4.f19627
        L21:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L28
            int r10 = r4.f19628
        L28:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            Yue.ۥۡۦ۠ۧ r4 = r6.m19750(r7, r8, r9, r10, r11, r12)
            return r4
    }

    @Override // Yue.InterfaceC3318.InterfaceC3319
    @Yue.InterfaceC4418
    public Yue.InterfaceC0904 call() {
            r1 = this;
            Yue.ۥۡۦ۠ۤ r0 = r1.f19621
            return r0
    }

    @Override // Yue.InterfaceC3318.InterfaceC3319
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.InterfaceC3318.InterfaceC3319 mo13870(int r13, @Yue.InterfaceC4418 java.util.concurrent.TimeUnit r14) {
            r12 = this;
            java.lang.String r0 = "unit"
            Yue.C3329.m13906(r14, r0)
            Yue.ۥۣ۠ۡ۟ r0 = r12.f19624
            if (r0 != 0) goto L1e
            java.lang.String r0 = "writeTimeout"
            long r1 = (long) r13
            int r9 = Yue.C6656.m25565(r0, r1, r14)
            r10 = 31
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r12
            Yue.ۥۡۦ۠ۧ r13 = m19749(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        L1e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Timeouts can't be adjusted in a network interceptor"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
    }

    @Override // Yue.InterfaceC3318.InterfaceC3319
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ */
    public Yue.C5317 mo13871() {
            r1 = this;
            Yue.ۥۡۦۤۧ r0 = r1.f19625
            return r0
    }

    @Override // Yue.InterfaceC3318.InterfaceC3319
    /* JADX INFO: renamed from: ۥ۟۟ */
    public int mo13872() {
            r1 = this;
            int r0 = r1.f19627
            return r0
    }

    @Override // Yue.InterfaceC3318.InterfaceC3319
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public int mo13873() {
            r1 = this;
            int r0 = r1.f19628
            return r0
    }

    @Override // Yue.InterfaceC3318.InterfaceC3319
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public Yue.InterfaceC3318.InterfaceC3319 mo13874(int r13, @Yue.InterfaceC4418 java.util.concurrent.TimeUnit r14) {
            r12 = this;
            java.lang.String r0 = "unit"
            Yue.C3329.m13906(r14, r0)
            Yue.ۥۣ۠ۡ۟ r0 = r12.f19624
            if (r0 != 0) goto L1e
            java.lang.String r0 = "connectTimeout"
            long r1 = (long) r13
            int r7 = Yue.C6656.m25565(r0, r1, r14)
            r10 = 55
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r3 = r12
            Yue.ۥۡۦ۠ۧ r13 = m19749(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        L1e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Timeouts can't be adjusted in a network interceptor"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
    }

    @Override // Yue.InterfaceC3318.InterfaceC3319
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public Yue.InterfaceC1484 mo13875() {
            r1 = this;
            Yue.ۥۣ۠ۡ۟ r0 = r1.f19624
            if (r0 == 0) goto L9
            Yue.ۥۡۦ۠ۥ r0 = r0.m10484()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.InterfaceC3318.InterfaceC3319
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public Yue.InterfaceC3318.InterfaceC3319 mo13876(int r13, @Yue.InterfaceC4418 java.util.concurrent.TimeUnit r14) {
            r12 = this;
            java.lang.String r0 = "unit"
            Yue.C3329.m13906(r14, r0)
            Yue.ۥۣ۠ۡ۟ r0 = r12.f19624
            if (r0 != 0) goto L1e
            java.lang.String r0 = "readTimeout"
            long r1 = (long) r13
            int r8 = Yue.C6656.m25565(r0, r1, r14)
            r10 = 47
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r3 = r12
            Yue.ۥۡۦ۠ۧ r13 = m19749(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        L1e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Timeouts can't be adjusted in a network interceptor"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
    }

    @Override // Yue.InterfaceC3318.InterfaceC3319
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public int mo13877() {
            r1 = this;
            int r0 = r1.f19626
            return r0
    }

    @Override // Yue.InterfaceC3318.InterfaceC3319
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public Yue.C5377 mo13878(@Yue.InterfaceC4418 Yue.C5317 r14) throws java.io.IOException {
            r13 = this;
            java.lang.String r0 = "request"
            Yue.C3329.m13906(r14, r0)
            int r0 = r13.f19623
            java.util.List<Yue.ۥ۠ۥۦۤ> r1 = r13.f19622
            int r1 = r1.size()
            if (r0 >= r1) goto L10e
            int r0 = r13.f19629
            r1 = 1
            int r0 = r0 + r1
            r13.f19629 = r0
            Yue.ۥۣ۠ۡ۟ r0 = r13.f19624
            java.lang.String r2 = " must call proceed() exactly once"
            java.lang.String r3 = "network interceptor "
            if (r0 == 0) goto L7c
            Yue.ۥۣ۠ۡۡ r0 = r0.m10486()
            Yue.ۥ۠ۤۨۥ r4 = r14.m20090()
            boolean r0 = r0.m10518(r4)
            if (r0 == 0) goto L55
            int r0 = r13.f19629
            if (r0 != r1) goto L30
            goto L7c
        L30:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r3)
            java.util.List<Yue.ۥ۠ۥۦۤ> r0 = r13.f19622
            int r3 = r13.f19623
            int r3 = r3 - r1
            java.lang.Object r0 = r0.get(r3)
            r14.append(r0)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L55:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r3)
            java.util.List<Yue.ۥ۠ۥۦۤ> r0 = r13.f19622
            int r2 = r13.f19623
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)
            r14.append(r0)
            java.lang.String r0 = " must retain the same host and port"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L7c:
            int r0 = r13.f19623
            int r5 = r0 + 1
            r11 = 58
            r12 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r13
            r7 = r14
            Yue.ۥۡۦ۠ۧ r14 = m19749(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.List<Yue.ۥ۠ۥۦۤ> r0 = r13.f19622
            int r4 = r13.f19623
            java.lang.Object r0 = r0.get(r4)
            Yue.ۥ۠ۥۦۤ r0 = (Yue.InterfaceC3318) r0
            Yue.ۥۡۦۧ r4 = r0.mo4781(r14)
            java.lang.String r5 = "interceptor "
            if (r4 == 0) goto Lf4
            Yue.ۥۣ۠ۡ۟ r6 = r13.f19624
            if (r6 == 0) goto Lcf
            int r6 = r13.f19623
            int r6 = r6 + r1
            java.util.List<Yue.ۥ۠ۥۦۤ> r7 = r13.f19622
            int r7 = r7.size()
            if (r6 >= r7) goto Lcf
            int r14 = r14.f19629
            if (r14 != r1) goto Lb3
            goto Lcf
        Lb3:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r3)
            r14.append(r0)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        Lcf:
            Yue.ۥۡۦۧ۟ r14 = r4.m20280()
            if (r14 == 0) goto Ld6
            return r4
        Ld6:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r5)
            r14.append(r0)
            java.lang.String r0 = " returned a response with no body"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        Lf4:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r0)
            java.lang.String r0 = " returned null"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.<init>(r0)
            throw r14
        L10e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Yue.C5228 m19750(int r12, @Yue.InterfaceC4543 Yue.C2269 r13, @Yue.InterfaceC4418 Yue.C5317 r14, int r15, int r16, int r17) {
            r11 = this;
            r0 = r11
            java.lang.String r1 = "request"
            r7 = r14
            Yue.C3329.m13906(r14, r1)
            Yue.ۥۡۦ۠ۧ r1 = new Yue.ۥۡۦ۠ۧ
            Yue.ۥۡۦ۠ۤ r3 = r0.f19621
            java.util.List<Yue.ۥ۠ۥۦۤ> r4 = r0.f19622
            r2 = r1
            r5 = r12
            r6 = r13
            r8 = r15
            r9 = r16
            r10 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final Yue.C5215 m19751() {
            r1 = this;
            Yue.ۥۡۦ۠ۤ r0 = r1.f19621
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int m19752() {
            r1 = this;
            int r0 = r1.f19626
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final Yue.C2269 m19753() {
            r1 = this;
            Yue.ۥۣ۠ۡ۟ r0 = r1.f19624
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final int m19754() {
            r1 = this;
            int r0 = r1.f19627
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final Yue.C5317 m19755() {
            r1 = this;
            Yue.ۥۡۦۤۧ r0 = r1.f19625
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final int m19756() {
            r1 = this;
            int r0 = r1.f19628
            return r0
    }
}
