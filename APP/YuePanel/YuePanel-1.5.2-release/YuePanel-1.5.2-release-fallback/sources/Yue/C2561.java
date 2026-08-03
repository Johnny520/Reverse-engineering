package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2561 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {136}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    public static final class C2562<T> extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.Object f8516;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f8517;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f8518;

        public C2562(Yue.InterfaceC1598<? super Yue.C2561.C2562> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f8517 = r2
                int r2 = r1.f8518
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f8518 = r2
                r2 = 0
                java.lang.Object r2 = Yue.C2561.m11761(r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟, reason: contains not printable characters */
    public static final class C2563<T> implements Yue.InterfaceC2466<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2839<T, Yue.InterfaceC1598<? super java.lang.Boolean>, java.lang.Object> f8519;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", i = {0}, l = {130}, m = "emit", n = {"this"}, s = {"L$0"})
        public static final class C2564 extends Yue.AbstractC1600 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public java.lang.Object f8520;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ java.lang.Object f8521;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C2561.C2563 f8522;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public int f8523;

            public C2564(Yue.C2561.C2563 r1, Yue.InterfaceC1598<? super Yue.C2561.C2563.C2564> r2) {
                    r0 = this;
                    r0.f8522 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4543
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                    r1 = this;
                    r1.f8521 = r2
                    int r2 = r1.f8523
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.f8523 = r2
                    Yue.ۥ۠ۢۤۧ$ۥ۟ r2 = r1.f8522
                    r0 = 0
                    java.lang.Object r2 = r2.mo5352(r0, r1)
                    return r2
            }
        }

        public C2563(Yue.InterfaceC2839<? super T, ? super Yue.InterfaceC1598<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
                r0 = this;
                r0.f8519 = r1
                r0.<init>()
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.Object m11769(T r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r3) {
                r1 = this;
                r0 = 4
                Yue.C3249.m13688(r0)
                Yue.ۥ۠ۢۤۧ$ۥ۟$ۥ r0 = new Yue.ۥ۠ۢۤۧ$ۥ۟$ۥ
                r0.<init>(r1, r3)
                r0 = 5
                Yue.C3249.m13688(r0)
                Yue.ۥۣ۠ۢۢ<T, Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, java.lang.Object> r0 = r1.f8519
                java.lang.Object r2 = r0.invoke(r2, r3)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L1e
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                return r2
            L1e:
                Yue.ۥ۟۟۠ۡ r2 = new Yue.ۥ۟۟۠ۡ
                r2.<init>(r1)
                throw r2
        }

        @Override // Yue.InterfaceC2466
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public java.lang.Object mo5352(T r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r6) {
                r4 = this;
                boolean r0 = r6 instanceof Yue.C2561.C2563.C2564
                if (r0 == 0) goto L13
                r0 = r6
                Yue.ۥ۠ۢۤۧ$ۥ۟$ۥ r0 = (Yue.C2561.C2563.C2564) r0
                int r1 = r0.f8523
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f8523 = r1
                goto L18
            L13:
                Yue.ۥ۠ۢۤۧ$ۥ۟$ۥ r0 = new Yue.ۥ۠ۢۤۧ$ۥ۟$ۥ
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f8521
                java.lang.Object r1 = Yue.C3341.m13947()
                int r2 = r0.f8523
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f8520
                Yue.ۥ۠ۢۤۧ$ۥ۟ r5 = (Yue.C2561.C2563) r5
                Yue.C5391.m20403(r6)
                goto L46
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                Yue.C5391.m20403(r6)
                Yue.ۥۣ۠ۢۢ<T, Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f8519
                r0.f8520 = r4
                r0.f8523 = r3
                java.lang.Object r6 = r6.invoke(r5, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                r5 = r4
            L46:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L51
                Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
                return r5
            L51:
                Yue.ۥ۟۟۠ۡ r6 = new Yue.ۥ۟۟۠ۡ
                r6.<init>(r5)
                throw r6
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟, reason: contains not printable characters */
    public static final class C2565<T> implements Yue.InterfaceC2464<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2464 f8524;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ int f8525;

        public C2565(Yue.InterfaceC2464 r1, int r2) {
                r0 = this;
                r0.f8524 = r1
                r0.f8525 = r2
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2464
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ */
        public java.lang.Object mo392(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r6) {
                r4 = this;
                Yue.ۥۡۦۢۥ$ۥ۟۟۟۠ r0 = new Yue.ۥۡۦۢۥ$ۥ۟۟۟۠
                r0.<init>()
                Yue.ۥۣ۠ۢۡ r1 = r4.f8524
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ r2 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟
                int r3 = r4.f8525
                r2.<init>(r0, r3, r5)
                java.lang.Object r5 = r1.mo392(r2, r6)
                java.lang.Object r6 = Yue.C3341.m13947()
                if (r5 != r6) goto L19
                return r5
            L19:
                Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
                return r5
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C2566<T> implements Yue.InterfaceC2466 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5264.C5270 f8526;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ int f8527;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2466<T> f8528;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        public static final class C2567 extends Yue.AbstractC1600 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ java.lang.Object f8529;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C2561.C2566<T> f8530;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f8531;

            public C2567(Yue.C2561.C2566<? super T> r1, Yue.InterfaceC1598<? super Yue.C2561.C2566.C2567> r2) {
                    r0 = this;
                    r0.f8530 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4543
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                    r1 = this;
                    r1.f8529 = r2
                    int r2 = r1.f8531
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.f8531 = r2
                    Yue.ۥ۠ۢۤۧ$ۥ۟۟۟<T> r2 = r1.f8530
                    r0 = 0
                    java.lang.Object r2 = r2.mo5352(r0, r1)
                    return r2
            }
        }

        public C2566(Yue.C5264.C5270 r1, int r2, Yue.InterfaceC2466<? super T> r3) {
                r0 = this;
                r0.f8526 = r1
                r0.f8527 = r2
                r0.f8528 = r3
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2466
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public final java.lang.Object mo5352(T r6, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r7) {
                r5 = this;
                boolean r0 = r7 instanceof Yue.C2561.C2566.C2567
                if (r0 == 0) goto L13
                r0 = r7
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟$ۥ r0 = (Yue.C2561.C2566.C2567) r0
                int r1 = r0.f8531
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f8531 = r1
                goto L18
            L13:
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟$ۥ r0 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟$ۥ
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f8529
                java.lang.Object r1 = Yue.C3341.m13947()
                int r2 = r0.f8531
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Yue.C5391.m20403(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                Yue.C5391.m20403(r7)
                Yue.ۥۡۦۢۥ$ۥ۟۟۟۠ r7 = r5.f8526
                int r2 = r7.f19774
                int r4 = r5.f8527
                if (r2 < r4) goto L4a
                Yue.ۥۣۣ۠ۢ<T> r7 = r5.f8528
                r0.f8531 = r3
                java.lang.Object r6 = r7.mo5352(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
                return r6
            L4a:
                int r2 = r2 + r3
                r7.f19774 = r2
                Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
                return r6
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C2568<T> implements Yue.InterfaceC2464<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2464 f8532;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2839 f8533;

        public C2568(Yue.InterfaceC2464 r1, Yue.InterfaceC2839 r2) {
                r0 = this;
                r0.f8532 = r1
                r0.f8533 = r2
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2464
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ */
        public java.lang.Object mo392(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r6) {
                r4 = this;
                Yue.ۥۡۦۢۥ$ۥ r0 = new Yue.ۥۡۦۢۥ$ۥ
                r0.<init>()
                Yue.ۥۣ۠ۢۡ r1 = r4.f8532
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟۠ r2 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟۠
                Yue.ۥۣ۠ۢۢ r3 = r4.f8533
                r2.<init>(r0, r5, r3)
                java.lang.Object r5 = r1.mo392(r2, r6)
                java.lang.Object r6 = Yue.C3341.m13947()
                if (r5 != r6) goto L19
                return r5
            L19:
                Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
                return r5
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C2569<T> implements Yue.InterfaceC2466 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5264.C5265 f8534;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2466<T> f8535;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2839<T, Yue.InterfaceC1598<? super java.lang.Boolean>, java.lang.Object> f8536;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟۠$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {37, 38, 40}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
        public static final class C2570 extends Yue.AbstractC1600 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public java.lang.Object f8537;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public java.lang.Object f8538;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public /* synthetic */ java.lang.Object f8539;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C2561.C2569<T> f8540;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public int f8541;

            public C2570(Yue.C2561.C2569<? super T> r1, Yue.InterfaceC1598<? super Yue.C2561.C2569.C2570> r2) {
                    r0 = this;
                    r0.f8540 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4543
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                    r1 = this;
                    r1.f8539 = r2
                    int r2 = r1.f8541
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.f8541 = r2
                    Yue.ۥ۠ۢۤۧ$ۥ۟۟۟۠<T> r2 = r1.f8540
                    r0 = 0
                    java.lang.Object r2 = r2.mo5352(r0, r1)
                    return r2
            }
        }

        public C2569(Yue.C5264.C5265 r1, Yue.InterfaceC2466<? super T> r2, Yue.InterfaceC2839<? super T, ? super Yue.InterfaceC1598<? super java.lang.Boolean>, ? extends java.lang.Object> r3) {
                r0 = this;
                r0.f8534 = r1
                r0.f8535 = r2
                r0.f8536 = r3
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2466
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public final java.lang.Object mo5352(T r7, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r8) {
                r6 = this;
                boolean r0 = r8 instanceof Yue.C2561.C2569.C2570
                if (r0 == 0) goto L13
                r0 = r8
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟۠$ۥ r0 = (Yue.C2561.C2569.C2570) r0
                int r1 = r0.f8541
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f8541 = r1
                goto L18
            L13:
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟۠$ۥ r0 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟۠$ۥ
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f8539
                java.lang.Object r1 = Yue.C3341.m13947()
                int r2 = r0.f8541
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                Yue.C5391.m20403(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f8538
                java.lang.Object r2 = r0.f8537
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟۠ r2 = (Yue.C2561.C2569) r2
                Yue.C5391.m20403(r8)
                goto L6c
            L41:
                Yue.C5391.m20403(r8)
                goto L59
            L45:
                Yue.C5391.m20403(r8)
                Yue.ۥۡۦۢۥ$ۥ r8 = r6.f8534
                boolean r8 = r8.f19769
                if (r8 == 0) goto L5c
                Yue.ۥۣۣ۠ۢ<T> r8 = r6.f8535
                r0.f8541 = r5
                java.lang.Object r7 = r8.mo5352(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                Yue.ۥۣۢ۠ۤ r7 = Yue.C6593.f23016
                return r7
            L5c:
                Yue.ۥۣ۠ۢۢ<T, Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f8536
                r0.f8537 = r6
                r0.f8538 = r7
                r0.f8541 = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                Yue.ۥۡۦۢۥ$ۥ r8 = r2.f8534
                r8.f19769 = r5
                Yue.ۥۣۣ۠ۢ<T> r8 = r2.f8535
                r2 = 0
                r0.f8537 = r2
                r0.f8538 = r2
                r0.f8541 = r3
                java.lang.Object r7 = r8.mo5352(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                Yue.ۥۣۢ۠ۤ r7 = Yue.C6593.f23016
                return r7
            L8b:
                Yue.ۥۣۢ۠ۤ r7 = Yue.C6593.f23016
                return r7
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {73}, m = "emitAbort$FlowKt__LimitKt", n = {"$this$emitAbort"}, s = {"L$0"})
    public static final class C2571<T> extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.Object f8542;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f8543;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f8544;

        public C2571(Yue.InterfaceC1598<? super Yue.C2561.C2571> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f8543 = r2
                int r2 = r1.f8544
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f8544 = r2
                r2 = 0
                java.lang.Object r2 = Yue.C2561.m11760(r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C2572<T> implements Yue.InterfaceC2464<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2464 f8545;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ int f8546;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۢ$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {115}, m = "collect", n = {"$this$take_u24lambda_u2d4"}, s = {"L$0"})
        public static final class C2573 extends Yue.AbstractC1600 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ java.lang.Object f8547;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f8548;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C2561.C2572 f8549;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public java.lang.Object f8550;

            public C2573(Yue.C2561.C2572 r1, Yue.InterfaceC1598 r2) {
                    r0 = this;
                    r0.f8549 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4543
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                    r1 = this;
                    r1.f8547 = r2
                    int r2 = r1.f8548
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.f8548 = r2
                    Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۢ r2 = r1.f8549
                    r0 = 0
                    java.lang.Object r2 = r2.mo392(r0, r1)
                    return r2
            }
        }

        public C2572(Yue.InterfaceC2464 r1, int r2) {
                r0 = this;
                r0.f8545 = r1
                r0.f8546 = r2
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2464
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ */
        public java.lang.Object mo392(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r7, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r8) {
                r6 = this;
                boolean r0 = r8 instanceof Yue.C2561.C2572.C2573
                if (r0 == 0) goto L13
                r0 = r8
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۢ$ۥ r0 = (Yue.C2561.C2572.C2573) r0
                int r1 = r0.f8548
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f8548 = r1
                goto L18
            L13:
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۢ$ۥ r0 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۢ$ۥ
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f8547
                java.lang.Object r1 = Yue.C3341.m13947()
                int r2 = r0.f8548
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r7 = r0.f8550
                Yue.ۥۣۣ۠ۢ r7 = (Yue.InterfaceC2466) r7
                Yue.C5391.m20403(r8)     // Catch: Yue.C0021 -> L2d
                goto L56
            L2d:
                r8 = move-exception
                goto L53
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                Yue.C5391.m20403(r8)
                Yue.ۥۡۦۢۥ$ۥ۟۟۟۠ r8 = new Yue.ۥۡۦۢۥ$ۥ۟۟۟۠
                r8.<init>()
                Yue.ۥۣ۠ۢۡ r2 = r6.f8545     // Catch: Yue.C0021 -> L2d
                Yue.ۥ۠ۢۤۧ$ۥۣ۟۟۟ r4 = new Yue.ۥ۠ۢۤۧ$ۥۣ۟۟۟     // Catch: Yue.C0021 -> L2d
                int r5 = r6.f8546     // Catch: Yue.C0021 -> L2d
                r4.<init>(r8, r5, r7)     // Catch: Yue.C0021 -> L2d
                r0.f8550 = r7     // Catch: Yue.C0021 -> L2d
                r0.f8548 = r3     // Catch: Yue.C0021 -> L2d
                java.lang.Object r7 = r2.mo392(r4, r0)     // Catch: Yue.C0021 -> L2d
                if (r7 != r1) goto L56
                return r1
            L53:
                Yue.C2471.m11498(r8, r7)
            L56:
                Yue.ۥۣۢ۠ۤ r7 = Yue.C6593.f23016
                return r7
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static final class C2574<T> implements Yue.InterfaceC2466 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5264.C5270 f8551;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ int f8552;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2466<T> f8553;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥۣ۟۟۟$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {61, 63}, m = "emit", n = {}, s = {})
        public static final class C2575 extends Yue.AbstractC1600 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ java.lang.Object f8554;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C2561.C2574<T> f8555;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f8556;

            public C2575(Yue.C2561.C2574<? super T> r1, Yue.InterfaceC1598<? super Yue.C2561.C2574.C2575> r2) {
                    r0 = this;
                    r0.f8555 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4543
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                    r1 = this;
                    r1.f8554 = r2
                    int r2 = r1.f8556
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.f8556 = r2
                    Yue.ۥ۠ۢۤۧ$ۥۣ۟۟۟<T> r2 = r1.f8555
                    r0 = 0
                    java.lang.Object r2 = r2.mo5352(r0, r1)
                    return r2
            }
        }

        public C2574(Yue.C5264.C5270 r1, int r2, Yue.InterfaceC2466<? super T> r3) {
                r0 = this;
                r0.f8551 = r1
                r0.f8552 = r2
                r0.f8553 = r3
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2466
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public final java.lang.Object mo5352(T r6, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r7) {
                r5 = this;
                boolean r0 = r7 instanceof Yue.C2561.C2574.C2575
                if (r0 == 0) goto L13
                r0 = r7
                Yue.ۥ۠ۢۤۧ$ۥۣ۟۟۟$ۥ r0 = (Yue.C2561.C2574.C2575) r0
                int r1 = r0.f8556
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f8556 = r1
                goto L18
            L13:
                Yue.ۥ۠ۢۤۧ$ۥۣ۟۟۟$ۥ r0 = new Yue.ۥ۠ۢۤۧ$ۥۣ۟۟۟$ۥ
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f8554
                java.lang.Object r1 = Yue.C3341.m13947()
                int r2 = r0.f8556
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                Yue.C5391.m20403(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                Yue.C5391.m20403(r7)
                goto L51
            L38:
                Yue.C5391.m20403(r7)
                Yue.ۥۡۦۢۥ$ۥ۟۟۟۠ r7 = r5.f8551
                int r2 = r7.f19774
                int r2 = r2 + r4
                r7.f19774 = r2
                int r7 = r5.f8552
                if (r2 >= r7) goto L54
                Yue.ۥۣۣ۠ۢ<T> r7 = r5.f8553
                r0.f8556 = r4
                java.lang.Object r6 = r7.mo5352(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
                return r6
            L54:
                Yue.ۥۣۣ۠ۢ<T> r7 = r5.f8553
                r0.f8556 = r3
                java.lang.Object r6 = Yue.C2561.m11760(r7, r6, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
                return r6
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final class C2576<T> implements Yue.InterfaceC2464<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2464 f8557;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2839 f8558;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۤ$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {124}, m = "collect", n = {"collector$iv"}, s = {"L$0"})
        public static final class C2577 extends Yue.AbstractC1600 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ java.lang.Object f8559;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f8560;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C2561.C2576 f8561;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public java.lang.Object f8562;

            public C2577(Yue.C2561.C2576 r1, Yue.InterfaceC1598 r2) {
                    r0 = this;
                    r0.f8561 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4543
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                    r1 = this;
                    r1.f8559 = r2
                    int r2 = r1.f8560
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.f8560 = r2
                    Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۤ r2 = r1.f8561
                    r0 = 0
                    java.lang.Object r2 = r2.mo392(r0, r1)
                    return r2
            }
        }

        public C2576(Yue.InterfaceC2464 r1, Yue.InterfaceC2839 r2) {
                r0 = this;
                r0.f8557 = r1
                r0.f8558 = r2
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2464
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ */
        public java.lang.Object mo392(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r6, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r7) {
                r5 = this;
                boolean r0 = r7 instanceof Yue.C2561.C2576.C2577
                if (r0 == 0) goto L13
                r0 = r7
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۤ$ۥ r0 = (Yue.C2561.C2576.C2577) r0
                int r1 = r0.f8560
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f8560 = r1
                goto L18
            L13:
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۤ$ۥ r0 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۤ$ۥ
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f8559
                java.lang.Object r1 = Yue.C3341.m13947()
                int r2 = r0.f8560
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f8562
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۥ r6 = (Yue.C2561.C2578) r6
                Yue.C5391.m20403(r7)     // Catch: Yue.C0021 -> L2d
                goto L53
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                Yue.C5391.m20403(r7)
                Yue.ۥۣ۠ۢۡ r7 = r5.f8557
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۥ r2 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۥ
                Yue.ۥۣ۠ۢۢ r4 = r5.f8558
                r2.<init>(r4, r6)
                r0.f8562 = r2     // Catch: Yue.C0021 -> L4e
                r0.f8560 = r3     // Catch: Yue.C0021 -> L4e
                java.lang.Object r6 = r7.mo392(r2, r0)     // Catch: Yue.C0021 -> L4e
                if (r6 != r1) goto L53
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                Yue.C2471.m11498(r7, r6)
            L53:
                Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
                return r6
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final class C2578<T> implements Yue.InterfaceC2466<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2839 f8563;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2466 f8564;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۥ$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {142, 143}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
        public static final class C2579 extends Yue.AbstractC1600 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public java.lang.Object f8565;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ java.lang.Object f8566;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f8567;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C2561.C2578 f8568;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public java.lang.Object f8569;

            public C2579(Yue.C2561.C2578 r1, Yue.InterfaceC1598 r2) {
                    r0 = this;
                    r0.f8568 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4543
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                    r1 = this;
                    r1.f8566 = r2
                    int r2 = r1.f8567
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.f8567 = r2
                    Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۥ r2 = r1.f8568
                    r0 = 0
                    java.lang.Object r2 = r2.mo5352(r0, r1)
                    return r2
            }
        }

        public C2578(Yue.InterfaceC2839 r1, Yue.InterfaceC2466 r2) {
                r0 = this;
                r0.f8563 = r1
                r0.f8564 = r2
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2466
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public java.lang.Object mo5352(T r8, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r9) {
                r7 = this;
                boolean r0 = r9 instanceof Yue.C2561.C2578.C2579
                if (r0 == 0) goto L13
                r0 = r9
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۥ$ۥ r0 = (Yue.C2561.C2578.C2579) r0
                int r1 = r0.f8567
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f8567 = r1
                goto L18
            L13:
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۥ$ۥ r0 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۥ$ۥ
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f8566
                java.lang.Object r1 = Yue.C3341.m13947()
                int r2 = r0.f8567
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f8565
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۥ r8 = (Yue.C2561.C2578) r8
                Yue.C5391.m20403(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f8569
                java.lang.Object r2 = r0.f8565
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۥ r2 = (Yue.C2561.C2578) r2
                Yue.C5391.m20403(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                Yue.C5391.m20403(r9)
                Yue.ۥۣ۠ۢۢ r9 = r7.f8563
                r0.f8565 = r7
                r0.f8569 = r8
                r0.f8567 = r4
                r2 = 6
                Yue.C3249.m13688(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                Yue.C3249.m13688(r2)
                if (r9 != r1) goto L60
                return r1
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                Yue.ۥۣۣ۠ۢ r2 = r8.f8564
                r0.f8565 = r8
                r5 = 0
                r0.f8569 = r5
                r0.f8567 = r3
                java.lang.Object r9 = r2.mo5352(r9, r0)
                if (r9 != r1) goto L7c
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                Yue.ۥۣۢ۠ۤ r8 = Yue.C6593.f23016
                return r8
            L81:
                Yue.ۥ۟۟۠ۡ r9 = new Yue.ۥ۟۟۠ۡ
                r9.<init>(r8)
                throw r9
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
    public static final class C2580<R> extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC2466<? super R>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f8570;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f8571;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2464<T> f8572;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2841<Yue.InterfaceC2466<? super R>, T, Yue.InterfaceC1598<? super java.lang.Boolean>, java.lang.Object> f8573;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ, reason: contains not printable characters */
        public static final class C2581<T> implements Yue.InterfaceC2466<T> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Yue.InterfaceC2841 f8574;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Yue.InterfaceC2466 f8575;

            /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ$ۥ, reason: contains not printable characters */
            @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", i = {0}, l = {142}, m = "emit", n = {"this"}, s = {"L$0"})
            public static final class C2582 extends Yue.AbstractC1600 {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public java.lang.Object f8576;

                /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                public /* synthetic */ java.lang.Object f8577;

                /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                public int f8578;

                /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
                public final /* synthetic */ Yue.C2561.C2580.C2581 f8579;

                public C2582(Yue.C2561.C2580.C2581 r1, Yue.InterfaceC1598 r2) {
                        r0 = this;
                        r0.f8579 = r1
                        r0.<init>(r2)
                        return
                }

                @Override // Yue.AbstractC0730
                @Yue.InterfaceC4543
                public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                        r1 = this;
                        r1.f8577 = r2
                        int r2 = r1.f8578
                        r0 = -2147483648(0xffffffff80000000, float:-0.0)
                        r2 = r2 | r0
                        r1.f8578 = r2
                        Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ r2 = r1.f8579
                        r0 = 0
                        java.lang.Object r2 = r2.mo5352(r0, r1)
                        return r2
                }
            }

            public C2581(Yue.InterfaceC2841 r1, Yue.InterfaceC2466 r2) {
                    r0 = this;
                    r0.f8574 = r1
                    r0.f8575 = r2
                    r0.<init>()
                    return
            }

            @Override // Yue.InterfaceC2466
            @Yue.InterfaceC4543
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            public java.lang.Object mo5352(T r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r6) {
                    r4 = this;
                    boolean r0 = r6 instanceof Yue.C2561.C2580.C2581.C2582
                    if (r0 == 0) goto L13
                    r0 = r6
                    Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ$ۥ r0 = (Yue.C2561.C2580.C2581.C2582) r0
                    int r1 = r0.f8578
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f8578 = r1
                    goto L18
                L13:
                    Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ$ۥ r0 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ$ۥ
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f8577
                    java.lang.Object r1 = Yue.C3341.m13947()
                    int r2 = r0.f8578
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r5 = r0.f8576
                    Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ r5 = (Yue.C2561.C2580.C2581) r5
                    Yue.C5391.m20403(r6)
                    goto L50
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    Yue.C5391.m20403(r6)
                    Yue.ۥۣ۠ۢۤ r6 = r4.f8574
                    Yue.ۥۣۣ۠ۢ r2 = r4.f8575
                    r0.f8576 = r4
                    r0.f8578 = r3
                    r3 = 6
                    Yue.C3249.m13688(r3)
                    java.lang.Object r6 = r6.mo11720(r2, r5, r0)
                    r5 = 7
                    Yue.C3249.m13688(r5)
                    if (r6 != r1) goto L4f
                    return r1
                L4f:
                    r5 = r4
                L50:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L5b
                    Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
                    return r5
                L5b:
                    Yue.ۥ۟۟۠ۡ r6 = new Yue.ۥ۟۟۠ۡ
                    r6.<init>(r5)
                    throw r6
            }
        }

        public C2580(Yue.InterfaceC2464<? extends T> r1, Yue.InterfaceC2841<? super Yue.InterfaceC2466<? super R>, ? super T, ? super Yue.InterfaceC1598<? super java.lang.Boolean>, ? extends java.lang.Object> r2, Yue.InterfaceC1598<? super Yue.C2561.C2580> r3) {
                r0 = this;
                r0.f8572 = r1
                r0.f8573 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r4, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r5) {
                r3 = this;
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ r0 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ
                Yue.ۥۣ۠ۢۡ<T> r1 = r3.f8572
                Yue.ۥۣ۠ۢۤ<Yue.ۥۣۣ۠ۢ<? super R>, T, Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, java.lang.Object> r2 = r3.f8573
                r0.<init>(r1, r2, r5)
                r0.f8571 = r4
                return r0
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC2466) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m11770(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r5.f8570
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r5.f8571
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ r0 = (Yue.C2561.C2580.C2581) r0
                Yue.C5391.m20403(r6)     // Catch: Yue.C0021 -> L13
                goto L3d
            L13:
                r6 = move-exception
                goto L3a
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                Yue.C5391.m20403(r6)
                java.lang.Object r6 = r5.f8571
                Yue.ۥۣۣ۠ۢ r6 = (Yue.InterfaceC2466) r6
                Yue.ۥۣ۠ۢۡ<T> r1 = r5.f8572
                Yue.ۥۣ۠ۢۤ<Yue.ۥۣۣ۠ۢ<? super R>, T, Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, java.lang.Object> r3 = r5.f8573
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ r4 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ
                r4.<init>(r3, r6)
                r5.f8571 = r4     // Catch: Yue.C0021 -> L38
                r5.f8570 = r2     // Catch: Yue.C0021 -> L38
                java.lang.Object r6 = r1.mo392(r4, r5)     // Catch: Yue.C0021 -> L38
                if (r6 != r0) goto L3d
                return r0
            L38:
                r6 = move-exception
                r0 = r4
            L3a:
                Yue.C2471.m11498(r6, r0)
            L3d:
                Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
                return r6
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m11770(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super R> r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ r1 = (Yue.C2561.C2580) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object m11760(Yue.InterfaceC2466 r0, java.lang.Object r1, Yue.InterfaceC1598 r2) {
            java.lang.Object r0 = m11765(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T> java.lang.Object m11761(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r4, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super T, ? super Yue.InterfaceC1598<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r6) {
            boolean r0 = r6 instanceof Yue.C2561.C2562
            if (r0 == 0) goto L13
            r0 = r6
            Yue.ۥ۠ۢۤۧ$ۥ r0 = (Yue.C2561.C2562) r0
            int r1 = r0.f8518
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8518 = r1
            goto L18
        L13:
            Yue.ۥ۠ۢۤۧ$ۥ r0 = new Yue.ۥ۠ۢۤۧ$ۥ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8517
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f8518
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f8516
            Yue.ۥ۠ۢۤۧ$ۥ۟ r4 = (Yue.C2561.C2563) r4
            Yue.C5391.m20403(r6)     // Catch: Yue.C0021 -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L4c
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            Yue.C5391.m20403(r6)
            Yue.ۥ۠ۢۤۧ$ۥ۟ r6 = new Yue.ۥ۠ۢۤۧ$ۥ۟
            r6.<init>(r5)
            r0.f8516 = r6     // Catch: Yue.C0021 -> L4a
            r0.f8518 = r3     // Catch: Yue.C0021 -> L4a
            java.lang.Object r4 = r4.mo392(r6, r0)     // Catch: Yue.C0021 -> L4a
            if (r4 != r1) goto L4f
            return r1
        L4a:
            r5 = move-exception
            r4 = r6
        L4c:
            Yue.C2471.m11498(r5, r4)
        L4f:
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> java.lang.Object m11762(Yue.InterfaceC2464<? extends T> r1, Yue.InterfaceC2839<? super T, ? super Yue.InterfaceC1598<? super java.lang.Boolean>, ? extends java.lang.Object> r2, Yue.InterfaceC1598<? super Yue.C6593> r3) {
            Yue.ۥ۠ۢۤۧ$ۥ۟ r0 = new Yue.ۥ۠ۢۤۧ$ۥ۟
            r0.<init>(r2)
            r2 = 0
            Yue.C3249.m13688(r2)     // Catch: Yue.C0021 -> L11
            r1.mo392(r0, r3)     // Catch: Yue.C0021 -> L11
            r1 = 1
            Yue.C3249.m13688(r1)     // Catch: Yue.C0021 -> L11
            goto L15
        L11:
            r1 = move-exception
            Yue.C2471.m11498(r1, r0)
        L15:
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11763(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r1, int r2) {
            if (r2 < 0) goto L8
            Yue.ۥ۠ۢۤۧ$ۥ۟۟ r0 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟
            r0.<init>(r1, r2)
            return r0
        L8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Drop count should be non-negative, but had "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11764(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r1, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super T, ? super Yue.InterfaceC1598<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            Yue.ۥ۠ۢۤۧ$ۥ۟۟۟۟ r0 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟۟
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> java.lang.Object m11765(Yue.InterfaceC2466<? super T> r4, T r5, Yue.InterfaceC1598<? super Yue.C6593> r6) {
            boolean r0 = r6 instanceof Yue.C2561.C2571
            if (r0 == 0) goto L13
            r0 = r6
            Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۡ r0 = (Yue.C2561.C2571) r0
            int r1 = r0.f8544
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8544 = r1
            goto L18
        L13:
            Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۡ r0 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۡ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8543
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f8544
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f8542
            Yue.ۥۣۣ۠ۢ r4 = (Yue.InterfaceC2466) r4
            Yue.C5391.m20403(r6)
            goto L43
        L35:
            Yue.C5391.m20403(r6)
            r0.f8542 = r4
            r0.f8544 = r3
            java.lang.Object r5 = r4.mo5352(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            Yue.ۥ۟۟۠ۡ r5 = new Yue.ۥ۟۟۠ۡ
            r5.<init>(r4)
            throw r5
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11766(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r1, int r2) {
            if (r2 <= 0) goto L8
            Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۢ r0 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۢ
            r0.<init>(r1, r2)
            return r0
        L8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Requested element count "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = " should be positive"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11767(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r1, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super T, ? super Yue.InterfaceC1598<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۤ r0 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۤ
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T, R> Yue.InterfaceC2464<R> m11768(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r2, @Yue.InterfaceC4418 @Yue.InterfaceC0861 Yue.InterfaceC2841<? super Yue.InterfaceC2466<? super R>, ? super T, ? super Yue.InterfaceC1598<? super java.lang.Boolean>, ? extends java.lang.Object> r3) {
            Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ r0 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ
            r1 = 0
            r0.<init>(r2, r3, r1)
            Yue.ۥۣ۠ۢۡ r2 = Yue.C2472.m11585(r0)
            return r2
    }
}
