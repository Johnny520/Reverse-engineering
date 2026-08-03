package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1006<T> extends Yue.AbstractC1001<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2464<Yue.InterfaceC2464<T>> f2888;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int f2889;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۡ$ۥ, reason: contains not printable characters */
    public static final class C1007<T> implements Yue.InterfaceC2466 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC3383 f2890;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC5576 f2891;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC4951<T> f2892;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5607<T> f2893;

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۡ$ۥ$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        public static final class C1008 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public int f2894;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Yue.InterfaceC2464<T> f2895;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C5607<T> f2896;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ Yue.InterfaceC5576 f2897;

            public C1008(Yue.InterfaceC2464<? extends T> r1, Yue.C5607<T> r2, Yue.InterfaceC5576 r3, Yue.InterfaceC1598<? super Yue.C1006.C1007.C1008> r4) {
                    r0 = this;
                    r0.f2895 = r1
                    r0.f2896 = r2
                    r0.f2897 = r3
                    r1 = 2
                    r0.<init>(r1, r4)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4418
            public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r4, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r5) {
                    r3 = this;
                    Yue.ۥۣ۟ۤۡ$ۥ$ۥ r4 = new Yue.ۥۣ۟ۤۡ$ۥ$ۥ
                    Yue.ۥۣ۠ۢۡ<T> r0 = r3.f2895
                    Yue.ۥۡۨۡۧ<T> r1 = r3.f2896
                    Yue.ۥۣۡۨ۟ r2 = r3.f2897
                    r4.<init>(r0, r1, r2, r5)
                    return r4
            }

            @Yue.InterfaceC4543
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(@Yue.InterfaceC4418 Yue.InterfaceC1662 r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                    r0 = this;
                    Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                    Yue.ۥۣ۟ۤۡ$ۥ$ۥ r1 = (Yue.C1006.C1007.C1008) r1
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
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r4) {
                    r3 = this;
                    java.lang.Object r0 = Yue.C3341.m13947()
                    int r1 = r3.f2894
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    Yue.C5391.m20403(r4)     // Catch: java.lang.Throwable -> Lf
                    goto L29
                Lf:
                    r4 = move-exception
                    goto L31
                L11:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L19:
                    Yue.C5391.m20403(r4)
                    Yue.ۥۣ۠ۢۡ<T> r4 = r3.f2895     // Catch: java.lang.Throwable -> Lf
                    Yue.ۥۡۨۡۧ<T> r1 = r3.f2896     // Catch: java.lang.Throwable -> Lf
                    r3.f2894 = r2     // Catch: java.lang.Throwable -> Lf
                    java.lang.Object r4 = r4.mo392(r1, r3)     // Catch: java.lang.Throwable -> Lf
                    if (r4 != r0) goto L29
                    return r0
                L29:
                    Yue.ۥۣۡۨ۟ r4 = r3.f2897
                    r4.release()
                    Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
                    return r4
                L31:
                    Yue.ۥۣۡۨ۟ r0 = r3.f2897
                    r0.release()
                    throw r4
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۡ$ۥ$ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {66}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
        public static final class C1009 extends Yue.AbstractC1600 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public java.lang.Object f2898;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public java.lang.Object f2899;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public /* synthetic */ java.lang.Object f2900;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C1006.C1007<T> f2901;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public int f2902;

            public C1009(Yue.C1006.C1007<? super T> r1, Yue.InterfaceC1598<? super Yue.C1006.C1007.C1009> r2) {
                    r0 = this;
                    r0.f2901 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4543
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                    r1 = this;
                    r1.f2900 = r2
                    int r2 = r1.f2902
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.f2902 = r2
                    Yue.ۥۣ۟ۤۡ$ۥ<T> r2 = r1.f2901
                    r0 = 0
                    java.lang.Object r2 = r2.m5543(r0, r1)
                    return r2
            }
        }

        public C1007(Yue.InterfaceC3383 r1, Yue.InterfaceC5576 r2, Yue.InterfaceC4951<? super T> r3, Yue.C5607<T> r4) {
                r0 = this;
                r0.f2890 = r1
                r0.f2891 = r2
                r0.f2892 = r3
                r0.f2893 = r4
                r0.<init>()
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.Object m5543(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r8, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r9) {
                r7 = this;
                boolean r0 = r9 instanceof Yue.C1006.C1007.C1009
                if (r0 == 0) goto L13
                r0 = r9
                Yue.ۥۣ۟ۤۡ$ۥ$ۥ۟ r0 = (Yue.C1006.C1007.C1009) r0
                int r1 = r0.f2902
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f2902 = r1
                goto L18
            L13:
                Yue.ۥۣ۟ۤۡ$ۥ$ۥ۟ r0 = new Yue.ۥۣ۟ۤۡ$ۥ$ۥ۟
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f2900
                java.lang.Object r1 = Yue.C3341.m13947()
                int r2 = r0.f2902
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.f2899
                Yue.ۥۣ۠ۢۡ r8 = (Yue.InterfaceC2464) r8
                java.lang.Object r0 = r0.f2898
                Yue.ۥۣ۟ۤۡ$ۥ r0 = (Yue.C1006.C1007) r0
                Yue.C5391.m20403(r9)
                goto L53
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                Yue.C5391.m20403(r9)
                Yue.ۥ۠ۦ۟ۡ r9 = r7.f2890
                if (r9 == 0) goto L43
                Yue.C3399.m14046(r9)
            L43:
                Yue.ۥۣۡۨ۟ r9 = r7.f2891
                r0.f2898 = r7
                r0.f2899 = r8
                r0.f2902 = r3
                java.lang.Object r9 = r9.mo20887(r0)
                if (r9 != r1) goto L52
                return r1
            L52:
                r0 = r7
            L53:
                Yue.ۥۡۥۡۤ<T> r1 = r0.f2892
                Yue.ۥۣ۟ۤۡ$ۥ$ۥ r4 = new Yue.ۥۣ۟ۤۡ$ۥ$ۥ
                Yue.ۥۡۨۡۧ<T> r9 = r0.f2893
                Yue.ۥۣۡۨ۟ r0 = r0.f2891
                r2 = 0
                r4.<init>(r8, r9, r0, r2)
                r5 = 3
                r6 = 0
                r3 = 0
                Yue.C0862.m4971(r1, r2, r3, r4, r5, r6)
                Yue.ۥۣۢ۠ۤ r8 = Yue.C6593.f23016
                return r8
        }

        @Override // Yue.InterfaceC2466
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public /* bridge */ /* synthetic */ java.lang.Object mo5352(java.lang.Object r1, Yue.InterfaceC1598 r2) {
                r0 = this;
                Yue.ۥۣ۠ۢۡ r1 = (Yue.InterfaceC2464) r1
                java.lang.Object r1 = r0.m5543(r1, r2)
                return r1
        }
    }

    public C1006(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends Yue.InterfaceC2464<? extends T>> r1, int r2, @Yue.InterfaceC4418 Yue.InterfaceC1632 r3, int r4, @Yue.InterfaceC4418 Yue.EnumC0847 r5) {
            r0 = this;
            r0.<init>(r3, r4, r5)
            r0.f2888 = r1
            r0.f2889 = r2
            return
    }

    public /* synthetic */ C1006(Yue.InterfaceC2464 r7, int r8, Yue.InterfaceC1632 r9, int r10, Yue.EnumC0847 r11, int r12, Yue.C1769 r13) {
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

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public java.lang.String mo5526() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "concurrency="
            r0.append(r1)
            int r1 = r2.f2889
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public java.lang.Object mo5253(@Yue.InterfaceC4418 Yue.InterfaceC4951<? super T> r6, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r7) {
            r5 = this;
            int r0 = r5.f2889
            r1 = 2
            r2 = 0
            r3 = 0
            Yue.ۥۣۡۨ۟ r0 = Yue.C5579.m20898(r0, r3, r1, r2)
            Yue.ۥۡۨۡۧ r1 = new Yue.ۥۡۨۡۧ
            r1.<init>(r6)
            Yue.ۥ۟ۧۦۥ r2 = r7.getContext()
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r3 = Yue.InterfaceC3383.f10824
            Yue.ۥ۟ۧۦۥ$ۥ۟ r2 = r2.get(r3)
            Yue.ۥ۠ۦ۟ۡ r2 = (Yue.InterfaceC3383) r2
            Yue.ۥۣ۠ۢۡ<Yue.ۥۣ۠ۢۡ<T>> r3 = r5.f2888
            Yue.ۥۣ۟ۤۡ$ۥ r4 = new Yue.ۥۣ۟ۤۡ$ۥ
            r4.<init>(r2, r0, r6, r1)
            java.lang.Object r6 = r3.mo392(r4, r7)
            java.lang.Object r7 = Yue.C3341.m13947()
            if (r6 != r7) goto L2c
            return r6
        L2c:
            Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
            return r6
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public Yue.AbstractC1001<T> mo5254(@Yue.InterfaceC4418 Yue.InterfaceC1632 r8, int r9, @Yue.InterfaceC4418 Yue.EnumC0847 r10) {
            r7 = this;
            Yue.ۥۣ۟ۤۡ r6 = new Yue.ۥۣ۟ۤۡ
            Yue.ۥۣ۠ۢۡ<Yue.ۥۣ۠ۢۡ<T>> r1 = r7.f2888
            int r2 = r7.f2889
            r0 = r6
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public Yue.InterfaceC5242<T> mo5528(@Yue.InterfaceC4418 Yue.InterfaceC1662 r4) {
            r3 = this;
            Yue.ۥ۟ۧۦۥ r0 = r3.f2877
            int r1 = r3.f2878
            Yue.ۥۣ۠ۢۢ r2 = r3.m5534()
            Yue.ۥۡۦۡۡ r4 = Yue.C4946.m19336(r4, r0, r1, r2)
            return r4
    }
}
