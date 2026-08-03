package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5925 implements Yue.InterfaceC5754 {

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۨۧ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    public static final class C5926 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC2466<? super Yue.EnumC5752>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f21596;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f21597;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC5941<java.lang.Integer> f21598;

        /* JADX INFO: renamed from: Yue.ۥۢ۟ۨۧ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C5927<T> implements Yue.InterfaceC2466 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Yue.C5264.C5265 f21599;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Yue.InterfaceC2466<Yue.EnumC5752> f21600;

            /* JADX INFO: renamed from: Yue.ۥۢ۟ۨۧ$ۥ$ۥ$ۥ, reason: contains not printable characters */
            @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {158}, m = "emit", n = {}, s = {})
            public static final class C5928 extends Yue.AbstractC1600 {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public /* synthetic */ java.lang.Object f21601;

                /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                public final /* synthetic */ Yue.C5925.C5926.C5927<T> f21602;

                /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                public int f21603;

                public C5928(Yue.C5925.C5926.C5927<? super T> r1, Yue.InterfaceC1598<? super Yue.C5925.C5926.C5927.C5928> r2) {
                        r0 = this;
                        r0.f21602 = r1
                        r0.<init>(r2)
                        return
                }

                @Override // Yue.AbstractC0730
                @Yue.InterfaceC4543
                public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                        r1 = this;
                        r1.f21601 = r2
                        int r2 = r1.f21603
                        r0 = -2147483648(0xffffffff80000000, float:-0.0)
                        r2 = r2 | r0
                        r1.f21603 = r2
                        Yue.ۥۢ۟ۨۧ$ۥ$ۥ<T> r2 = r1.f21602
                        r0 = 0
                        java.lang.Object r2 = r2.m22003(r0, r1)
                        return r2
                }
            }

            public C5927(Yue.C5264.C5265 r1, Yue.InterfaceC2466<? super Yue.EnumC5752> r2) {
                    r0 = this;
                    r0.f21599 = r1
                    r0.f21600 = r2
                    r0.<init>()
                    return
            }

            @Yue.InterfaceC4543
            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final java.lang.Object m22003(int r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r6) {
                    r4 = this;
                    boolean r0 = r6 instanceof Yue.C5925.C5926.C5927.C5928
                    if (r0 == 0) goto L13
                    r0 = r6
                    Yue.ۥۢ۟ۨۧ$ۥ$ۥ$ۥ r0 = (Yue.C5925.C5926.C5927.C5928) r0
                    int r1 = r0.f21603
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f21603 = r1
                    goto L18
                L13:
                    Yue.ۥۢ۟ۨۧ$ۥ$ۥ$ۥ r0 = new Yue.ۥۢ۟ۨۧ$ۥ$ۥ$ۥ
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f21601
                    java.lang.Object r1 = Yue.C3341.m13947()
                    int r2 = r0.f21603
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Yue.C5391.m20403(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    Yue.C5391.m20403(r6)
                    if (r5 <= 0) goto L4e
                    Yue.ۥۡۦۢۥ$ۥ r5 = r4.f21599
                    boolean r6 = r5.f19769
                    if (r6 != 0) goto L4e
                    r5.f19769 = r3
                    Yue.ۥۣۣ۠ۢ<Yue.ۥۡۨۨۦ> r5 = r4.f21600
                    Yue.ۥۡۨۨۦ r6 = Yue.EnumC5752.f21193
                    r0.f21603 = r3
                    java.lang.Object r5 = r5.mo5352(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
                    return r5
                L4e:
                    Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
                    return r5
            }

            @Override // Yue.InterfaceC2466
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            public /* bridge */ /* synthetic */ java.lang.Object mo5352(java.lang.Object r1, Yue.InterfaceC1598 r2) {
                    r0 = this;
                    java.lang.Number r1 = (java.lang.Number) r1
                    int r1 = r1.intValue()
                    java.lang.Object r1 = r0.m22003(r1, r2)
                    return r1
            }
        }

        public C5926(Yue.InterfaceC5941<java.lang.Integer> r1, Yue.InterfaceC1598<? super Yue.C5925.C5926> r2) {
                r0 = this;
                r0.f21598 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                r2 = this;
                Yue.ۥۢ۟ۨۧ$ۥ r0 = new Yue.ۥۢ۟ۨۧ$ۥ
                Yue.ۥۢ۠۟ۡ<java.lang.Integer> r1 = r2.f21598
                r0.<init>(r1, r4)
                r0.f21597 = r3
                return r0
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.InterfaceC2466<? super Yue.EnumC5752> r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC2466) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m22002(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r5.f21596
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 == r2) goto L13
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L13:
                Yue.C5391.m20403(r6)
                goto L33
            L17:
                Yue.C5391.m20403(r6)
                java.lang.Object r6 = r5.f21597
                Yue.ۥۣۣ۠ۢ r6 = (Yue.InterfaceC2466) r6
                Yue.ۥۡۦۢۥ$ۥ r1 = new Yue.ۥۡۦۢۥ$ۥ
                r1.<init>()
                Yue.ۥۢ۠۟ۡ<java.lang.Integer> r3 = r5.f21598
                Yue.ۥۢ۟ۨۧ$ۥ$ۥ r4 = new Yue.ۥۢ۟ۨۧ$ۥ$ۥ
                r4.<init>(r1, r6)
                r5.f21596 = r2
                java.lang.Object r6 = r3.mo392(r4, r5)
                if (r6 != r0) goto L33
                return r0
            L33:
                Yue.ۥ۠ۦۧۤ r6 = new Yue.ۥ۠ۦۧۤ
                r6.<init>()
                throw r6
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m22002(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super Yue.EnumC5752> r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥۢ۟ۨۧ$ۥ r1 = (Yue.C5925.C5926) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    public C5925() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "SharingStarted.Lazily"
            return r0
    }

    @Override // Yue.InterfaceC5754
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.InterfaceC2464<Yue.EnumC5752> mo21487(@Yue.InterfaceC4418 Yue.InterfaceC5941<java.lang.Integer> r3) {
            r2 = this;
            Yue.ۥۢ۟ۨۧ$ۥ r0 = new Yue.ۥۢ۟ۨۧ$ۥ
            r1 = 0
            r0.<init>(r3, r1)
            Yue.ۥۣ۠ۢۡ r3 = Yue.C2472.m11585(r0)
            return r3
    }
}
