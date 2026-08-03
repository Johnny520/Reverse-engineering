package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1013<T, R> extends Yue.AbstractC1010<T, R> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2841<Yue.InterfaceC2466<? super R>, T, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> f2907;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۡۦ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    public static final class C1014 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f2908;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f2909;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1013<T, R> f2910;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2466<R> f2911;

        /* JADX INFO: renamed from: Yue.ۥ۟ۤۡۦ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C1015<T> implements Yue.InterfaceC2466 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Yue.C5264.C5272<Yue.InterfaceC3383> f2912;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Yue.InterfaceC1662 f2913;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C1013<T, R> f2914;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ Yue.InterfaceC2466<R> f2915;

            /* JADX INFO: renamed from: Yue.ۥ۟ۤۡۦ$ۥ$ۥ$ۥ, reason: contains not printable characters */
            @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
            public static final class C1016 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public int f2916;

                /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                public final /* synthetic */ Yue.C1013<T, R> f2917;

                /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                public final /* synthetic */ Yue.InterfaceC2466<R> f2918;

                /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
                public final /* synthetic */ T f2919;

                public C1016(Yue.C1013<T, R> r1, Yue.InterfaceC2466<? super R> r2, T r3, Yue.InterfaceC1598<? super Yue.C1013.C1014.C1015.C1016> r4) {
                        r0 = this;
                        r0.f2917 = r1
                        r0.f2918 = r2
                        r0.f2919 = r3
                        r1 = 2
                        r0.<init>(r1, r4)
                        return
                }

                @Override // Yue.AbstractC0730
                @Yue.InterfaceC4418
                public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r4, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r5) {
                        r3 = this;
                        Yue.ۥ۟ۤۡۦ$ۥ$ۥ$ۥ r4 = new Yue.ۥ۟ۤۡۦ$ۥ$ۥ$ۥ
                        Yue.ۥ۟ۤۡۦ<T, R> r0 = r3.f2917
                        Yue.ۥۣۣ۠ۢ<R> r1 = r3.f2918
                        T r2 = r3.f2919
                        r4.<init>(r0, r1, r2, r5)
                        return r4
                }

                @Yue.InterfaceC4543
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final java.lang.Object invoke2(@Yue.InterfaceC4418 Yue.InterfaceC1662 r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                        r0 = this;
                        Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                        Yue.ۥ۟ۤۡۦ$ۥ$ۥ$ۥ r1 = (Yue.C1013.C1014.C1015.C1016) r1
                        Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                        java.lang.Object r1 = r1.invokeSuspend(r2)
                        return r1
                }

                @Override // Yue.InterfaceC2839
                public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.InterfaceC1662 r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                        r0 = this;
                        Yue.ۥ۟ۧۧۥ r1 = (Yue.InterfaceC1662) r1
                        Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                        java.lang.Object r1 = r0.invoke2(r1, r2)
                        return r1
                }

                @Override // Yue.AbstractC0730
                @Yue.InterfaceC4543
                public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r5) {
                        r4 = this;
                        java.lang.Object r0 = Yue.C3341.m13947()
                        int r1 = r4.f2916
                        r2 = 1
                        if (r1 == 0) goto L17
                        if (r1 != r2) goto Lf
                        Yue.C5391.m20403(r5)
                        goto L2d
                    Lf:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L17:
                        Yue.C5391.m20403(r5)
                        Yue.ۥ۟ۤۡۦ<T, R> r5 = r4.f2917
                        Yue.ۥۣ۠ۢۤ r5 = Yue.C1013.m5550(r5)
                        Yue.ۥۣۣ۠ۢ<R> r1 = r4.f2918
                        T r3 = r4.f2919
                        r4.f2916 = r2
                        java.lang.Object r5 = r5.mo11720(r1, r3, r4)
                        if (r5 != r0) goto L2d
                        return r0
                    L2d:
                        Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
                        return r5
                }
            }

            /* JADX INFO: renamed from: Yue.ۥ۟ۤۡۦ$ۥ$ۥ$ۥ۟, reason: contains not printable characters */
            @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {30}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
            public static final class C1017 extends Yue.AbstractC1600 {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public java.lang.Object f2920;

                /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                public java.lang.Object f2921;

                /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                public java.lang.Object f2922;

                /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
                public /* synthetic */ java.lang.Object f2923;

                /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
                public final /* synthetic */ Yue.C1013.C1014.C1015<T> f2924;

                /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
                public int f2925;

                public C1017(Yue.C1013.C1014.C1015<? super T> r1, Yue.InterfaceC1598<? super Yue.C1013.C1014.C1015.C1017> r2) {
                        r0 = this;
                        r0.f2924 = r1
                        r0.<init>(r2)
                        return
                }

                @Override // Yue.AbstractC0730
                @Yue.InterfaceC4543
                public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                        r1 = this;
                        r1.f2923 = r2
                        int r2 = r1.f2925
                        r0 = -2147483648(0xffffffff80000000, float:-0.0)
                        r2 = r2 | r0
                        r1.f2925 = r2
                        Yue.ۥ۟ۤۡۦ$ۥ$ۥ<T> r2 = r1.f2924
                        r0 = 0
                        java.lang.Object r2 = r2.mo5352(r0, r1)
                        return r2
                }
            }

            public C1015(Yue.C5264.C5272<Yue.InterfaceC3383> r1, Yue.InterfaceC1662 r2, Yue.C1013<T, R> r3, Yue.InterfaceC2466<? super R> r4) {
                    r0 = this;
                    r0.f2912 = r1
                    r0.f2913 = r2
                    r0.f2914 = r3
                    r0.f2915 = r4
                    r0.<init>()
                    return
            }

            @Override // Yue.InterfaceC2466
            @Yue.InterfaceC4543
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            public final java.lang.Object mo5352(T r8, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r9) {
                    r7 = this;
                    boolean r0 = r9 instanceof Yue.C1013.C1014.C1015.C1017
                    if (r0 == 0) goto L13
                    r0 = r9
                    Yue.ۥ۟ۤۡۦ$ۥ$ۥ$ۥ۟ r0 = (Yue.C1013.C1014.C1015.C1017) r0
                    int r1 = r0.f2925
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f2925 = r1
                    goto L18
                L13:
                    Yue.ۥ۟ۤۡۦ$ۥ$ۥ$ۥ۟ r0 = new Yue.ۥ۟ۤۡۦ$ۥ$ۥ$ۥ۟
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f2923
                    java.lang.Object r1 = Yue.C3341.m13947()
                    int r2 = r0.f2925
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f2922
                    Yue.ۥ۠ۦ۟ۡ r8 = (Yue.InterfaceC3383) r8
                    java.lang.Object r8 = r0.f2921
                    java.lang.Object r0 = r0.f2920
                    Yue.ۥ۟ۤۡۦ$ۥ$ۥ r0 = (Yue.C1013.C1014.C1015) r0
                    Yue.C5391.m20403(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    Yue.C5391.m20403(r9)
                    Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ<Yue.ۥ۠ۦ۟ۡ> r9 = r7.f2912
                    T r9 = r9.f19776
                    Yue.ۥ۠ۦ۟ۡ r9 = (Yue.InterfaceC3383) r9
                    if (r9 == 0) goto L5d
                    Yue.ۥ۟ۤۥۦ r2 = new Yue.ۥ۟ۤۥۦ
                    r2.<init>()
                    r9.mo1961(r2)
                    r0.f2920 = r7
                    r0.f2921 = r8
                    r0.f2922 = r9
                    r0.f2925 = r3
                    java.lang.Object r9 = r9.mo13984(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ<Yue.ۥ۠ۦ۟ۡ> r9 = r0.f2912
                    Yue.ۥ۟ۧۧۥ r1 = r0.f2913
                    Yue.ۥ۟ۧۨ r3 = Yue.EnumC1666.f5155
                    Yue.ۥ۟ۤۡۦ$ۥ$ۥ$ۥ r4 = new Yue.ۥ۟ۤۡۦ$ۥ$ۥ$ۥ
                    Yue.ۥ۟ۤۡۦ<T, R> r2 = r0.f2914
                    Yue.ۥۣۣ۠ۢ<R> r0 = r0.f2915
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    Yue.ۥ۠ۦ۟ۡ r8 = Yue.C0862.m4971(r1, r2, r3, r4, r5, r6)
                    r9.f19776 = r8
                    Yue.ۥۣۢ۠ۤ r8 = Yue.C6593.f23016
                    return r8
            }
        }

        public C1014(Yue.C1013<T, R> r1, Yue.InterfaceC2466<? super R> r2, Yue.InterfaceC1598<? super Yue.C1013.C1014> r3) {
                r0 = this;
                r0.f2910 = r1
                r0.f2911 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r4, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r5) {
                r3 = this;
                Yue.ۥ۟ۤۡۦ$ۥ r0 = new Yue.ۥ۟ۤۡۦ$ۥ
                Yue.ۥ۟ۤۡۦ<T, R> r1 = r3.f2910
                Yue.ۥۣۣ۠ۢ<R> r2 = r3.f2911
                r0.<init>(r1, r2, r5)
                r0.f2909 = r4
                return r0
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@Yue.InterfaceC4418 Yue.InterfaceC1662 r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥ۟ۤۡۦ$ۥ r1 = (Yue.C1013.C1014) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.InterfaceC1662 r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۧۥ r1 = (Yue.InterfaceC1662) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r7.f2908
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C5391.m20403(r8)
                goto L37
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                Yue.C5391.m20403(r8)
                java.lang.Object r8 = r7.f2909
                Yue.ۥ۟ۧۧۥ r8 = (Yue.InterfaceC1662) r8
                Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ r1 = new Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ
                r1.<init>()
                Yue.ۥ۟ۤۡۦ<T, R> r3 = r7.f2910
                Yue.ۥۣ۠ۢۡ<S> r4 = r3.f2903
                Yue.ۥ۟ۤۡۦ$ۥ$ۥ r5 = new Yue.ۥ۟ۤۡۦ$ۥ$ۥ
                Yue.ۥۣۣ۠ۢ<R> r6 = r7.f2911
                r5.<init>(r1, r8, r3, r6)
                r7.f2908 = r2
                java.lang.Object r8 = r4.mo392(r5, r7)
                if (r8 != r0) goto L37
                return r0
            L37:
                Yue.ۥۣۢ۠ۤ r8 = Yue.C6593.f23016
                return r8
        }
    }

    public C1013(@Yue.InterfaceC4418 Yue.InterfaceC2841<? super Yue.InterfaceC2466<? super R>, ? super T, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r1, @Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r2, @Yue.InterfaceC4418 Yue.InterfaceC1632 r3, int r4, @Yue.InterfaceC4418 Yue.EnumC0847 r5) {
            r0 = this;
            r0.<init>(r2, r3, r4, r5)
            r0.f2907 = r1
            return
    }

    public /* synthetic */ C1013(Yue.InterfaceC2841 r7, Yue.InterfaceC2464 r8, Yue.InterfaceC1632 r9, int r10, Yue.EnumC0847 r11, int r12, Yue.C1769 r13) {
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L6
            Yue.ۥ۠۠ۧۦ r9 = Yue.C2141.f6728
        L6:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto Lc
            r10 = -2
        Lc:
            r4 = r10
            r9 = r12 & 16
            if (r9 == 0) goto L13
            Yue.ۥۣۣ۟ r11 = Yue.EnumC0847.f2389
        L13:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2841 m5550(Yue.C1013 r0) {
            Yue.ۥۣ۠ۢۤ<Yue.ۥۣۣ۠ۢ<? super R>, T, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r0 = r0.f2907
            return r0
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public Yue.AbstractC1001<R> mo5254(@Yue.InterfaceC4418 Yue.InterfaceC1632 r8, int r9, @Yue.InterfaceC4418 Yue.EnumC0847 r10) {
            r7 = this;
            Yue.ۥ۟ۤۡۦ r6 = new Yue.ۥ۟ۤۡۦ
            Yue.ۥۣ۠ۢۤ<Yue.ۥۣۣ۠ۢ<? super R>, T, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r1 = r7.f2907
            Yue.ۥۣ۠ۢۡ<S> r2 = r7.f2903
            r0 = r6
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // Yue.AbstractC1010
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public java.lang.Object mo5548(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super R> r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r4) {
            r2 = this;
            Yue.ۥ۟ۤۡۦ$ۥ r0 = new Yue.ۥ۟ۤۡۦ$ۥ
            r1 = 0
            r0.<init>(r2, r3, r1)
            java.lang.Object r3 = Yue.C1663.m8007(r0, r4)
            java.lang.Object r4 = Yue.C3341.m13947()
            if (r3 != r4) goto L11
            return r3
        L11:
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
            return r3
    }
}
