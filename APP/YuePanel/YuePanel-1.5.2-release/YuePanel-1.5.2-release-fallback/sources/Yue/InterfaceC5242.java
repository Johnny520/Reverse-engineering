package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5242<E> {

    /* JADX INFO: renamed from: Yue.ۥۡۦۡۡ$ۥ, reason: contains not printable characters */
    public static final class C5243 {

        /* JADX INFO: renamed from: Yue.ۥۡۦۡۡ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C5244 implements Yue.InterfaceC5562<E> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Yue.InterfaceC5242<E> f19690;

            /* JADX INFO: Add missing generic type declarations: [R] */
            /* JADX INFO: renamed from: Yue.ۥۡۦۡۡ$ۥ$ۥ$ۥ, reason: contains not printable characters */
            @Yue.InterfaceC1744(c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", f = "Channel.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
            public static final class C5245<R> extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.C1024<? extends E>, Yue.InterfaceC1598<? super R>, java.lang.Object> {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public int f19691;

                /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                public /* synthetic */ java.lang.Object f19692;

                /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                public final /* synthetic */ Yue.InterfaceC2839<E, Yue.InterfaceC1598<? super R>, java.lang.Object> f19693;

                public C5245(Yue.InterfaceC2839<? super E, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r1, Yue.InterfaceC1598<? super Yue.InterfaceC5242.C5243.C5244.C5245> r2) {
                        r0 = this;
                        r0.f19693 = r1
                        r1 = 2
                        r0.<init>(r1, r2)
                        return
                }

                @Override // Yue.AbstractC0730
                @Yue.InterfaceC4418
                public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                        r2 = this;
                        Yue.ۥۡۦۡۡ$ۥ$ۥ$ۥ r0 = new Yue.ۥۡۦۡۡ$ۥ$ۥ$ۥ
                        Yue.ۥۣ۠ۢۢ<E, Yue.ۥ۟ۧۤۢ<? super R>, java.lang.Object> r1 = r2.f19693
                        r0.<init>(r1, r4)
                        r0.f19692 = r3
                        return r0
                }

                @Override // Yue.InterfaceC2839
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                        r0 = this;
                        Yue.ۥ۟ۤۢ۟ r1 = (Yue.C1024) r1
                        java.lang.Object r1 = r1.m5574()
                        Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                        java.lang.Object r1 = r0.m19809(r1, r2)
                        return r1
                }

                @Override // Yue.AbstractC0730
                @Yue.InterfaceC4543
                public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r4) {
                        r3 = this;
                        java.lang.Object r0 = Yue.C3341.m13947()
                        int r1 = r3.f19691
                        r2 = 1
                        if (r1 == 0) goto L17
                        if (r1 != r2) goto Lf
                        Yue.C5391.m20403(r4)
                        goto L37
                    Lf:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r0)
                        throw r4
                    L17:
                        Yue.C5391.m20403(r4)
                        java.lang.Object r4 = r3.f19692
                        Yue.ۥ۟ۤۢ۟ r4 = (Yue.C1024) r4
                        java.lang.Object r4 = r4.m5574()
                        java.lang.Throwable r1 = Yue.C1024.m5565(r4)
                        if (r1 != 0) goto L38
                        Yue.ۥۣ۠ۢۢ<E, Yue.ۥ۟ۧۤۢ<? super R>, java.lang.Object> r1 = r3.f19693
                        java.lang.Object r4 = Yue.C1024.m5567(r4)
                        r3.f19691 = r2
                        java.lang.Object r4 = r1.invoke(r4, r3)
                        if (r4 != r0) goto L37
                        return r0
                    L37:
                        return r4
                    L38:
                        throw r1
                }

                @Yue.InterfaceC4543
                /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
                public final java.lang.Object m19809(@Yue.InterfaceC4418 java.lang.Object r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super R> r2) {
                        r0 = this;
                        Yue.ۥ۟ۤۢ۟ r1 = Yue.C1024.m5561(r1)
                        Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                        Yue.ۥۡۦۡۡ$ۥ$ۥ$ۥ r1 = (Yue.InterfaceC5242.C5243.C5244.C5245) r1
                        Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                        java.lang.Object r1 = r1.invokeSuspend(r2)
                        return r1
                }
            }

            public C5244(Yue.InterfaceC5242<? extends E> r1) {
                    r0 = this;
                    r0.f19690 = r1
                    r0.<init>()
                    return
            }

            @Override // Yue.InterfaceC5562
            @Yue.InterfaceC3324
            /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
            public <R> void mo359(@Yue.InterfaceC4418 Yue.InterfaceC5564<? super R> r4, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super E, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r5) {
                    r3 = this;
                    Yue.ۥۡۦۡۡ<E> r0 = r3.f19690
                    Yue.ۥۡۧۨۧ r0 = r0.mo315()
                    Yue.ۥۡۦۡۡ$ۥ$ۥ$ۥ r1 = new Yue.ۥۡۦۡۡ$ۥ$ۥ$ۥ
                    r2 = 0
                    r1.<init>(r5, r2)
                    r0.mo359(r4, r1)
                    return
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۦۡۡ$ۥ$ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC1744(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {354}, m = "receiveOrNull", n = {}, s = {})
        public static final class C5246<E> extends Yue.AbstractC1600 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ java.lang.Object f19694;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f19695;

            public C5246(Yue.InterfaceC1598<? super Yue.InterfaceC5242.C5243.C5246> r1) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4543
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                    r1 = this;
                    r1.f19694 = r2
                    int r2 = r1.f19695
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.f19695 = r2
                    r2 = 0
                    java.lang.Object r2 = Yue.InterfaceC5242.C5243.m19808(r2, r1)
                    return r2
            }
        }

        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m19800(Yue.InterfaceC5242 r1) {
                r0 = 0
                r1.mo311(r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m19801(Yue.InterfaceC5242 r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lb
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                r0.mo311(r1)
                return
            Lb:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: cancel"
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m19802(Yue.InterfaceC5242 r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lc
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                boolean r0 = r0.mo310(r1)
                return r0
            Lc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: cancel"
                r0.<init>(r1)
                throw r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <E> Yue.InterfaceC5562<E> m19803(@Yue.InterfaceC4418 Yue.InterfaceC5242<? extends E> r1) {
                Yue.ۥۡۦۡۡ$ۥ$ۥ r0 = new Yue.ۥۡۦۡۡ$ۥ$ۥ
                r0.<init>(r1)
                return r0
        }

        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @Yue.InterfaceC5313(expression = "onReceiveCatching", imports = {}))
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m19804() {
                return
        }

        @Yue.InterfaceC2302
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ void m19805() {
                return
        }

        @Yue.InterfaceC2302
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static /* synthetic */ void m19806() {
                return
        }

        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @Yue.InterfaceC5313(expression = "tryReceive().getOrNull()", imports = {}))
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static <E> E m19807(@Yue.InterfaceC4418 Yue.InterfaceC5242<? extends E> r1) {
                java.lang.Object r1 = r1.mo317()
                boolean r0 = Yue.C1024.m5572(r1)
                if (r0 == 0) goto Lf
                java.lang.Object r1 = Yue.C1024.m5568(r1)
                return r1
            Lf:
                java.lang.Throwable r1 = Yue.C1024.m5565(r1)
                if (r1 != 0) goto L17
                r1 = 0
                return r1
            L17:
                java.lang.Throwable r1 = Yue.C5912.m21959(r1)
                throw r1
        }

        @Yue.InterfaceC3834
        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @Yue.InterfaceC5313(expression = "receiveCatching().getOrNull()", imports = {}))
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static <E> java.lang.Object m19808(@Yue.InterfaceC4418 Yue.InterfaceC5242<? extends E> r4, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super E> r5) {
                boolean r0 = r5 instanceof Yue.InterfaceC5242.C5243.C5246
                if (r0 == 0) goto L13
                r0 = r5
                Yue.ۥۡۦۡۡ$ۥ$ۥ۟ r0 = (Yue.InterfaceC5242.C5243.C5246) r0
                int r1 = r0.f19695
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19695 = r1
                goto L18
            L13:
                Yue.ۥۡۦۡۡ$ۥ$ۥ۟ r0 = new Yue.ۥۡۦۡۡ$ۥ$ۥ۟
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f19694
                java.lang.Object r1 = Yue.C3341.m13947()
                int r2 = r0.f19695
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                Yue.C5391.m20403(r5)
                Yue.ۥ۟ۤۢ۟ r5 = (Yue.C1024) r5
                java.lang.Object r4 = r5.m5574()
                goto L43
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                Yue.C5391.m20403(r5)
                r0.f19695 = r3
                java.lang.Object r4 = r4.mo319(r0)
                if (r4 != r1) goto L43
                return r1
            L43:
                java.lang.Object r4 = Yue.C1024.m5567(r4)
                return r4
        }
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    boolean isEmpty();

    @Yue.InterfaceC4418
    Yue.InterfaceC1018<E> iterator();

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @Yue.InterfaceC5313(expression = "tryReceive().getOrNull()", imports = {}))
    @Yue.InterfaceC4543
    E poll();

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: ۥ۟۟ */
    /* synthetic */ boolean mo310(java.lang.Throwable r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    void mo311(@Yue.InterfaceC4543 java.util.concurrent.CancellationException r1);

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    java.lang.Object mo312(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super E> r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    boolean mo313();

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    Yue.InterfaceC5562<E> mo314();

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    Yue.InterfaceC5562<Yue.C1024<E>> mo315();

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    Yue.InterfaceC5562<E> mo316();

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    java.lang.Object mo317();

    @Yue.InterfaceC3834
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @Yue.InterfaceC5313(expression = "receiveCatching().getOrNull()", imports = {}))
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    java.lang.Object mo318(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super E> r1);

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    java.lang.Object mo319(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C1024<? extends E>> r1);
}
