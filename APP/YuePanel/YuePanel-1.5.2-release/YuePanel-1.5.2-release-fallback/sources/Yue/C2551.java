package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2551 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ, reason: contains not printable characters */
    public static final class C2552<T> implements Yue.InterfaceC2464<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2464 f8484;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2841 f8485;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {113, 114}, m = "collect", n = {"this", "$this$catch_u24lambda_u2d0"}, s = {"L$0", "L$1"})
        public static final class C2553 extends Yue.AbstractC1600 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ java.lang.Object f8486;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f8487;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C2551.C2552 f8488;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public java.lang.Object f8489;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public java.lang.Object f8490;

            public C2553(Yue.C2551.C2552 r1, Yue.InterfaceC1598 r2) {
                    r0 = this;
                    r0.f8488 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4543
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                    r1 = this;
                    r1.f8486 = r2
                    int r2 = r1.f8487
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.f8487 = r2
                    Yue.ۥ۠ۢۤۦ$ۥ r2 = r1.f8488
                    r0 = 0
                    java.lang.Object r2 = r2.mo392(r0, r1)
                    return r2
            }
        }

        public C2552(Yue.InterfaceC2464 r1, Yue.InterfaceC2841 r2) {
                r0 = this;
                r0.f8484 = r1
                r0.f8485 = r2
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2464
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ */
        public java.lang.Object mo392(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r6, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r7) {
                r5 = this;
                boolean r0 = r7 instanceof Yue.C2551.C2552.C2553
                if (r0 == 0) goto L13
                r0 = r7
                Yue.ۥ۠ۢۤۦ$ۥ$ۥ r0 = (Yue.C2551.C2552.C2553) r0
                int r1 = r0.f8487
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f8487 = r1
                goto L18
            L13:
                Yue.ۥ۠ۢۤۦ$ۥ$ۥ r0 = new Yue.ۥ۠ۢۤۦ$ۥ$ۥ
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f8486
                java.lang.Object r1 = Yue.C3341.m13947()
                int r2 = r0.f8487
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                Yue.C5391.m20403(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f8490
                Yue.ۥۣۣ۠ۢ r6 = (Yue.InterfaceC2466) r6
                java.lang.Object r2 = r0.f8489
                Yue.ۥ۠ۢۤۦ$ۥ r2 = (Yue.C2551.C2552) r2
                Yue.C5391.m20403(r7)
                goto L53
            L40:
                Yue.C5391.m20403(r7)
                Yue.ۥۣ۠ۢۡ r7 = r5.f8484
                r0.f8489 = r5
                r0.f8490 = r6
                r0.f8487 = r4
                java.lang.Object r7 = Yue.C2472.m11520(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                Yue.ۥۣ۠ۢۤ r2 = r2.f8485
                r4 = 0
                r0.f8489 = r4
                r0.f8490 = r4
                r0.f8487 = r3
                r3 = 6
                Yue.C3249.m13688(r3)
                java.lang.Object r6 = r2.mo11720(r6, r7, r0)
                r7 = 7
                Yue.C3249.m13688(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
                return r6
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {156}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    public static final class C2554<T> extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.Object f8491;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f8492;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f8493;

        public C2554(Yue.InterfaceC1598<? super Yue.C2551.C2554> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f8492 = r2
                int r2 = r1.f8493
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f8493 = r2
                r2 = 0
                java.lang.Object r2 = Yue.C2472.m11520(r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ۟۟, reason: contains not printable characters */
    public static final class C2555<T> implements Yue.InterfaceC2466 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2466<T> f8494;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5264.C5272<java.lang.Throwable> f8495;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ۟۟$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {158}, m = "emit", n = {"this"}, s = {"L$0"})
        public static final class C2556 extends Yue.AbstractC1600 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public java.lang.Object f8496;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ java.lang.Object f8497;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C2551.C2555<T> f8498;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public int f8499;

            public C2556(Yue.C2551.C2555<? super T> r1, Yue.InterfaceC1598<? super Yue.C2551.C2555.C2556> r2) {
                    r0 = this;
                    r0.f8498 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4543
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                    r1 = this;
                    r1.f8497 = r2
                    int r2 = r1.f8499
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.f8499 = r2
                    Yue.ۥ۠ۢۤۦ$ۥ۟۟<T> r2 = r1.f8498
                    r0 = 0
                    java.lang.Object r2 = r2.mo5352(r0, r1)
                    return r2
            }
        }

        public C2555(Yue.InterfaceC2466<? super T> r1, Yue.C5264.C5272<java.lang.Throwable> r2) {
                r0 = this;
                r0.f8494 = r1
                r0.f8495 = r2
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2466
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public final java.lang.Object mo5352(T r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r6) {
                r4 = this;
                boolean r0 = r6 instanceof Yue.C2551.C2555.C2556
                if (r0 == 0) goto L13
                r0 = r6
                Yue.ۥ۠ۢۤۦ$ۥ۟۟$ۥ r0 = (Yue.C2551.C2555.C2556) r0
                int r1 = r0.f8499
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f8499 = r1
                goto L18
            L13:
                Yue.ۥ۠ۢۤۦ$ۥ۟۟$ۥ r0 = new Yue.ۥ۠ۢۤۦ$ۥ۟۟$ۥ
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f8497
                java.lang.Object r1 = Yue.C3341.m13947()
                int r2 = r0.f8499
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f8496
                Yue.ۥ۠ۢۤۦ$ۥ۟۟ r5 = (Yue.C2551.C2555) r5
                Yue.C5391.m20403(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                Yue.C5391.m20403(r6)
                Yue.ۥۣۣ۠ۢ<T> r6 = r4.f8494     // Catch: java.lang.Throwable -> L4a
                r0.f8496 = r4     // Catch: java.lang.Throwable -> L4a
                r0.f8499 = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.mo5352(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ<java.lang.Throwable> r5 = r5.f8495
                r5.f19776 = r6
                throw r6
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C2557 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<java.lang.Throwable, Yue.InterfaceC1598<? super java.lang.Boolean>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f8500;

        public C2557(Yue.InterfaceC1598<? super Yue.C2551.C2557> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r2) {
                r0 = this;
                Yue.ۥ۠ۢۤۦ$ۥ۟۟۟ r1 = new Yue.ۥ۠ۢۤۦ$ۥ۟۟۟
                r1.<init>(r2)
                return r1
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Throwable r1, Yue.InterfaceC1598<? super java.lang.Boolean> r2) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m11757(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                Yue.C3341.m13947()
                int r0 = r1.f8500
                if (r0 != 0) goto L10
                Yue.C5391.m20403(r2)
                r2 = 1
                java.lang.Boolean r2 = Yue.C0828.m4773(r2)
                return r2
            L10:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m11757(@Yue.InterfaceC4418 java.lang.Throwable r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super java.lang.Boolean> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥ۠ۢۤۦ$ۥ۟۟۟ r1 = (Yue.C2551.C2557) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    public static final class C2558<T> extends Yue.AbstractC6067 implements Yue.InterfaceC2842<Yue.InterfaceC2466<? super T>, java.lang.Throwable, java.lang.Long, Yue.InterfaceC1598<? super java.lang.Boolean>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f8501;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f8502;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ long f8503;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ long f8504;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2839<java.lang.Throwable, Yue.InterfaceC1598<? super java.lang.Boolean>, java.lang.Object> f8505;

        public C2558(long r1, Yue.InterfaceC2839<? super java.lang.Throwable, ? super Yue.InterfaceC1598<? super java.lang.Boolean>, ? extends java.lang.Object> r3, Yue.InterfaceC1598<? super Yue.C2551.C2558> r4) {
                r0 = this;
                r0.f8504 = r1
                r0.f8505 = r3
                r1 = 4
                r0.<init>(r1, r4)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r7.f8501
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C5391.m20403(r8)
                goto L31
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                Yue.C5391.m20403(r8)
                java.lang.Object r8 = r7.f8502
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                long r3 = r7.f8503
                long r5 = r7.f8504
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L3a
                Yue.ۥۣ۠ۢۢ<java.lang.Throwable, Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, java.lang.Object> r1 = r7.f8505
                r7.f8501 = r2
                java.lang.Object r8 = r1.invoke(r8, r7)
                if (r8 != r0) goto L31
                return r0
            L31:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L3a
                goto L3b
            L3a:
                r2 = 0
            L3b:
                java.lang.Boolean r8 = Yue.C0828.m4773(r2)
                return r8
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m11758(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r4, @Yue.InterfaceC4418 java.lang.Throwable r5, long r6, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super java.lang.Boolean> r8) {
                r3 = this;
                Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۟ r4 = new Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۟
                long r0 = r3.f8504
                Yue.ۥۣ۠ۢۢ<java.lang.Throwable, Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, java.lang.Object> r2 = r3.f8505
                r4.<init>(r0, r2, r8)
                r4.f8502 = r5
                r4.f8503 = r6
                Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
                java.lang.Object r4 = r4.invokeSuspend(r5)
                return r4
        }

        @Override // Yue.InterfaceC2842
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public /* bridge */ /* synthetic */ java.lang.Object mo11759(java.lang.Object r7, java.lang.Throwable r8, java.lang.Long r9, Yue.InterfaceC1598<? super java.lang.Boolean> r10) {
                r6 = this;
                r1 = r7
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC2466) r1
                r2 = r8
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                java.lang.Number r9 = (java.lang.Number) r9
                long r3 = r9.longValue()
                r5 = r10
                Yue.ۥ۟ۧۤۢ r5 = (Yue.InterfaceC1598) r5
                r0 = r6
                java.lang.Object r7 = r0.m11758(r1, r2, r3, r5)
                return r7
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C2559<T> implements Yue.InterfaceC2464<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2464 f8506;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2842 f8507;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {117, 119}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u2d2", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u2d2", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
        public static final class C2560 extends Yue.AbstractC1600 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ java.lang.Object f8508;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f8509;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C2551.C2559 f8510;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public java.lang.Object f8511;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public java.lang.Object f8512;

            /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
            public java.lang.Object f8513;

            /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
            public long f8514;

            /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
            public int f8515;

            public C2560(Yue.C2551.C2559 r1, Yue.InterfaceC1598 r2) {
                    r0 = this;
                    r0.f8510 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4543
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                    r1 = this;
                    r1.f8508 = r2
                    int r2 = r1.f8509
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.f8509 = r2
                    Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۠ r2 = r1.f8510
                    r0 = 0
                    java.lang.Object r2 = r2.mo392(r0, r1)
                    return r2
            }
        }

        public C2559(Yue.InterfaceC2464 r1, Yue.InterfaceC2842 r2) {
                r0 = this;
                r0.f8506 = r1
                r0.f8507 = r2
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2464
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ */
        public java.lang.Object mo392(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r12, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r13) {
                r11 = this;
                boolean r0 = r13 instanceof Yue.C2551.C2559.C2560
                if (r0 == 0) goto L13
                r0 = r13
                Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ r0 = (Yue.C2551.C2559.C2560) r0
                int r1 = r0.f8509
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f8509 = r1
                goto L18
            L13:
                Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ r0 = new Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ
                r0.<init>(r11, r13)
            L18:
                java.lang.Object r13 = r0.f8508
                java.lang.Object r1 = Yue.C3341.m13947()
                int r2 = r0.f8509
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L52
                if (r2 == r4) goto L42
                if (r2 != r3) goto L3a
                long r5 = r0.f8514
                java.lang.Object r12 = r0.f8513
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                java.lang.Object r2 = r0.f8512
                Yue.ۥۣۣ۠ۢ r2 = (Yue.InterfaceC2466) r2
                java.lang.Object r7 = r0.f8511
                Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۠ r7 = (Yue.C2551.C2559) r7
                Yue.C5391.m20403(r13)
                goto L9a
            L3a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L42:
                int r12 = r0.f8515
                long r5 = r0.f8514
                java.lang.Object r2 = r0.f8512
                Yue.ۥۣۣ۠ۢ r2 = (Yue.InterfaceC2466) r2
                java.lang.Object r7 = r0.f8511
                Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۠ r7 = (Yue.C2551.C2559) r7
                Yue.C5391.m20403(r13)
                goto L74
            L52:
                Yue.C5391.m20403(r13)
                r5 = 0
                r13 = r11
            L58:
                Yue.ۥۣ۠ۢۡ r2 = r13.f8506
                r0.f8511 = r13
                r0.f8512 = r12
                r7 = 0
                r0.f8513 = r7
                r0.f8514 = r5
                r7 = 0
                r0.f8515 = r7
                r0.f8509 = r4
                java.lang.Object r2 = Yue.C2472.m11520(r2, r12, r0)
                if (r2 != r1) goto L6f
                return r1
            L6f:
                r10 = r2
                r2 = r12
                r12 = r7
                r7 = r13
                r13 = r10
            L74:
                java.lang.Throwable r13 = (java.lang.Throwable) r13
                if (r13 == 0) goto La6
                Yue.ۥۣ۠ۢۥ r12 = r7.f8507
                java.lang.Long r8 = Yue.C0828.m4779(r5)
                r0.f8511 = r7
                r0.f8512 = r2
                r0.f8513 = r13
                r0.f8514 = r5
                r0.f8509 = r3
                r9 = 6
                Yue.C3249.m13688(r9)
                java.lang.Object r12 = r12.mo11759(r2, r13, r8, r0)
                r8 = 7
                Yue.C3249.m13688(r8)
                if (r12 != r1) goto L97
                return r1
            L97:
                r10 = r13
                r13 = r12
                r12 = r10
            L9a:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto La8
                r12 = 1
                long r5 = r5 + r12
                r12 = r4
            La6:
                r13 = r7
                goto La9
            La8:
                throw r12
            La9:
                if (r12 != 0) goto Lae
                Yue.ۥۣۢ۠ۤ r12 = Yue.C6593.f23016
                return r12
            Lae:
                r12 = r2
                goto L58
        }
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11750(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r1, @Yue.InterfaceC4418 Yue.InterfaceC2841<? super Yue.InterfaceC2466<? super T>, ? super java.lang.Throwable, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r2) {
            Yue.ۥ۠ۢۤۦ$ۥ r0 = new Yue.ۥ۠ۢۤۦ$ۥ
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T> java.lang.Object m11751(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r4, @Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super java.lang.Throwable> r6) {
            boolean r0 = r6 instanceof Yue.C2551.C2554
            if (r0 == 0) goto L13
            r0 = r6
            Yue.ۥ۠ۢۤۦ$ۥ۟ r0 = (Yue.C2551.C2554) r0
            int r1 = r0.f8493
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8493 = r1
            goto L18
        L13:
            Yue.ۥ۠ۢۤۦ$ۥ۟ r0 = new Yue.ۥ۠ۢۤۦ$ۥ۟
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8492
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f8493
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f8491
            Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ r4 = (Yue.C5264.C5272) r4
            Yue.C5391.m20403(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            Yue.C5391.m20403(r6)
            Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ r6 = new Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ
            r6.<init>()
            Yue.ۥ۠ۢۤۦ$ۥ۟۟ r2 = new Yue.ۥ۠ۢۤۦ$ۥ۟۟     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f8491 = r6     // Catch: java.lang.Throwable -> L51
            r0.f8493 = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.mo392(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.f19776
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = m11753(r5, r4)
            if (r6 != 0) goto L76
            Yue.ۥ۟ۧۦۥ r6 = r0.getContext()
            boolean r6 = m11752(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            Yue.C2268.m10468(r4, r5)
            throw r4
        L72:
            Yue.C2268.m10468(r5, r4)
            throw r5
        L76:
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m11752(java.lang.Throwable r1, Yue.InterfaceC1632 r2) {
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r0 = Yue.InterfaceC3383.f10824
            Yue.ۥ۟ۧۦۥ$ۥ۟ r2 = r2.get(r0)
            Yue.ۥ۠ۦ۟ۡ r2 = (Yue.InterfaceC3383) r2
            if (r2 == 0) goto L1a
            boolean r0 = r2.isCancelled()
            if (r0 != 0) goto L11
            goto L1a
        L11:
            java.util.concurrent.CancellationException r2 = r2.mo13982()
            boolean r1 = m11753(r1, r2)
            return r1
        L1a:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m11753(java.lang.Throwable r0, java.lang.Throwable r1) {
            if (r1 == 0) goto La
            boolean r0 = Yue.C3329.m13897(r1, r0)
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11754(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r2, long r3, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.lang.Throwable, ? super Yue.InterfaceC1598<? super java.lang.Boolean>, ? extends java.lang.Object> r5) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L11
            Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۟ r0 = new Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۟
            r1 = 0
            r0.<init>(r3, r5, r1)
            Yue.ۥۣ۠ۢۡ r2 = Yue.C2472.m11626(r2, r0)
            return r2
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Expected positive amount of retries, but had "
            r2.append(r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC2464 m11755(Yue.InterfaceC2464 r0, long r1, Yue.InterfaceC2839 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L9
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L9:
            r4 = r4 & 2
            if (r4 == 0) goto L13
            Yue.ۥ۠ۢۤۦ$ۥ۟۟۟ r3 = new Yue.ۥ۠ۢۤۦ$ۥ۟۟۟
            r4 = 0
            r3.<init>(r4)
        L13:
            Yue.ۥۣ۠ۢۡ r0 = Yue.C2472.m11624(r0, r1, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11756(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r1, @Yue.InterfaceC4418 Yue.InterfaceC2842<? super Yue.InterfaceC2466<? super T>, ? super java.lang.Throwable, ? super java.lang.Long, ? super Yue.InterfaceC1598<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۠ r0 = new Yue.ۥ۠ۢۤۦ$ۥ۟۟۟۠
            r0.<init>(r1, r2)
            return r0
    }
}
