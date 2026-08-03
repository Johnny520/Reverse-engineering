package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2595 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    public static final class C2596<T> extends Yue.AbstractC6067 implements Yue.InterfaceC2839<T, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f8610;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ long f8611;

        public C2596(long r1, Yue.InterfaceC1598<? super Yue.C2595.C2596> r3) {
                r0 = this;
                r0.f8611 = r1
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                r2 = this;
                Yue.ۥ۠ۢۥ$ۥ r3 = new Yue.ۥ۠ۢۥ$ۥ
                long r0 = r2.f8611
                r3.<init>(r0, r4)
                return r3
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m11826(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r5.f8610
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C5391.m20403(r6)
                goto L25
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                Yue.C5391.m20403(r6)
                long r3 = r5.f8611
                r5.f8610 = r2
                java.lang.Object r6 = Yue.C1804.m8490(r3, r5)
                if (r6 != r0) goto L25
                return r0
            L25:
                Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
                return r6
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m11826(T r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥ۠ۢۥ$ۥ r1 = (Yue.C2595.C2596) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {415}, m = "invokeSuspend", n = {}, s = {})
    public static final class C2597<T> extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC2466<? super T>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f8612;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ long f8613;

        public C2597(long r1, Yue.InterfaceC1598<? super Yue.C2595.C2597> r3) {
                r0 = this;
                r0.f8613 = r1
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                r2 = this;
                Yue.ۥ۠ۢۥ$ۥ۟ r3 = new Yue.ۥ۠ۢۥ$ۥ۟
                long r0 = r2.f8613
                r3.<init>(r0, r4)
                return r3
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC2466) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m11827(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r5.f8612
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C5391.m20403(r6)
                goto L25
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                Yue.C5391.m20403(r6)
                long r3 = r5.f8613
                r5.f8612 = r2
                java.lang.Object r6 = Yue.C1804.m8490(r3, r5)
                if (r6 != r0) goto L25
                return r0
            L25:
                Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
                return r6
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m11827(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥ۠ۢۥ$ۥ۟ r1 = (Yue.C2595.C2597) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ$ۥ۟۟, reason: contains not printable characters */
    public static final class C2598 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Throwable, java.lang.Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.C2595.C2598 f8614 = null;

        static {
                Yue.ۥ۠ۢۥ$ۥ۟۟ r0 = new Yue.ۥ۠ۢۥ$ۥ۟۟
                r0.<init>()
                Yue.C2595.C2598.f8614 = r0
                return
        }

        public C2598() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Boolean r1 = r0.m11828(r1)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.Boolean m11828(@Yue.InterfaceC4418 java.lang.Throwable r1) {
                r0 = this;
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
    public static final class C2599<T> extends Yue.AbstractC6067 implements Yue.InterfaceC2841<Yue.InterfaceC2466<? super T>, java.lang.Throwable, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f8615;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f8616;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f8617;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2825<java.lang.Throwable, java.lang.Boolean> f8618;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ T f8619;

        public C2599(Yue.InterfaceC2825<? super java.lang.Throwable, java.lang.Boolean> r1, T r2, Yue.InterfaceC1598<? super Yue.C2595.C2599> r3) {
                r0 = this;
                r0.f8618 = r1
                r0.f8619 = r2
                r1 = 3
                r0.<init>(r1, r3)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r4.f8615
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C5391.m20403(r5)
                goto L3e
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                Yue.C5391.m20403(r5)
                java.lang.Object r5 = r4.f8616
                Yue.ۥۣۣ۠ۢ r5 = (Yue.InterfaceC2466) r5
                java.lang.Object r1 = r4.f8617
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                Yue.ۥۣ۠ۡ۟<java.lang.Throwable, java.lang.Boolean> r3 = r4.f8618
                java.lang.Object r3 = r3.invoke(r1)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L41
                T r1 = r4.f8619
                r3 = 0
                r4.f8616 = r3
                r4.f8615 = r2
                java.lang.Object r5 = r5.mo5352(r1, r4)
                if (r5 != r0) goto L3e
                return r0
            L3e:
                Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
                return r5
            L41:
                throw r1
        }

        @Override // Yue.InterfaceC2841
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public /* bridge */ /* synthetic */ java.lang.Object mo11720(java.lang.Object r1, java.lang.Throwable r2, Yue.InterfaceC1598<? super Yue.C6593> r3) {
                r0 = this;
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC2466) r1
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                Yue.ۥ۟ۧۤۢ r3 = (Yue.InterfaceC1598) r3
                java.lang.Object r1 = r0.m11829(r1, r2, r3)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m11829(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r4, @Yue.InterfaceC4418 java.lang.Throwable r5, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r6) {
                r3 = this;
                Yue.ۥ۠ۢۥ$ۥ۟۟۟ r0 = new Yue.ۥ۠ۢۥ$ۥ۟۟۟
                Yue.ۥۣ۠ۡ۟<java.lang.Throwable, java.lang.Boolean> r1 = r3.f8618
                T r2 = r3.f8619
                r0.<init>(r1, r2, r6)
                r0.f8616 = r4
                r0.f8617 = r5
                Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
                java.lang.Object r4 = r0.invokeSuspend(r4)
                return r4
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", i = {}, l = {190, 190}, m = "invokeSuspend", n = {}, s = {})
    public static final class C2600<R, T> extends Yue.AbstractC6067 implements Yue.InterfaceC2841<Yue.InterfaceC2466<? super R>, T, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f8620;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f8621;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f8622;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2839 f8623;

        public C2600(Yue.InterfaceC2839 r1, Yue.InterfaceC1598 r2) {
                r0 = this;
                r0.f8623 = r1
                r1 = 3
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r5.f8620
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Yue.C5391.m20403(r6)
                goto L47
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f8621
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC2466) r1
                Yue.C5391.m20403(r6)
                goto L39
            L22:
                Yue.C5391.m20403(r6)
                java.lang.Object r6 = r5.f8621
                r1 = r6
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC2466) r1
                java.lang.Object r6 = r5.f8622
                Yue.ۥۣ۠ۢۢ r4 = r5.f8623
                r5.f8621 = r1
                r5.f8620 = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                return r0
            L39:
                Yue.ۥۣ۠ۢۡ r6 = (Yue.InterfaceC2464) r6
                r3 = 0
                r5.f8621 = r3
                r5.f8620 = r2
                java.lang.Object r6 = Yue.C2472.m11562(r1, r6, r5)
                if (r6 != r0) goto L47
                return r0
            L47:
                Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
                return r6
        }

        @Override // Yue.InterfaceC2841
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public /* bridge */ /* synthetic */ java.lang.Object mo11720(java.lang.Object r1, java.lang.Object r2, Yue.InterfaceC1598<? super Yue.C6593> r3) {
                r0 = this;
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC2466) r1
                Yue.ۥ۟ۧۤۢ r3 = (Yue.InterfaceC1598) r3
                java.lang.Object r1 = r0.m11830(r1, r2, r3)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m11830(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super R> r3, T r4, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r5) {
                r2 = this;
                Yue.ۥ۠ۢۥ$ۥ۟۟۟۟ r0 = new Yue.ۥ۠ۢۥ$ۥ۟۟۟۟
                Yue.ۥۣ۠ۢۢ r1 = r2.f8623
                r0.<init>(r1, r5)
                r0.f8621 = r3
                r0.f8622 = r4
                Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
                java.lang.Object r3 = r0.invokeSuspend(r3)
                return r3
        }
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @Yue.InterfaceC5313(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11789(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @Yue.InterfaceC5313(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T1, T2, T3, T4, T5, R> Yue.InterfaceC2464<R> m11790(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T1> r0, @Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T2> r1, @Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T3> r2, @Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T4> r3, @Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T5> r4, @Yue.InterfaceC4418 Yue.InterfaceC2844<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r5) {
            Yue.ۥۣ۠ۢۡ r0 = Yue.C2472.m11527(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @Yue.InterfaceC5313(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T1, T2, T3, T4, R> Yue.InterfaceC2464<R> m11791(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T1> r0, @Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T2> r1, @Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T3> r2, @Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T4> r3, @Yue.InterfaceC4418 Yue.InterfaceC2843<? super T1, ? super T2, ? super T3, ? super T4, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r4) {
            Yue.ۥۣ۠ۢۡ r0 = Yue.C2472.m11528(r0, r1, r2, r3, r4)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @Yue.InterfaceC5313(expression = "combine(this, other, other2, transform)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T1, T2, T3, R> Yue.InterfaceC2464<R> m11792(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T1> r0, @Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T2> r1, @Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T3> r2, @Yue.InterfaceC4418 Yue.InterfaceC2842<? super T1, ? super T2, ? super T3, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r3) {
            Yue.ۥۣ۠ۢۡ r0 = Yue.C2472.m11529(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @Yue.InterfaceC5313(expression = "this.combine(other, transform)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T1, T2, R> Yue.InterfaceC2464<R> m11793(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T1> r0, @Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T2> r1, @Yue.InterfaceC4418 Yue.InterfaceC2841<? super T1, ? super T2, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r2) {
            Yue.ۥۣ۠ۢۡ r0 = Yue.C2472.m11530(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'compose' is 'let'", replaceWith = @Yue.InterfaceC5313(expression = "let(transformer)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T, R> Yue.InterfaceC2464<R> m11794(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.InterfaceC2464<? extends T>, ? extends Yue.InterfaceC2464<? extends R>> r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @Yue.InterfaceC5313(expression = "flatMapConcat(mapper)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T, R> Yue.InterfaceC2464<R> m11795(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, ? extends Yue.InterfaceC2464<? extends R>> r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @Yue.InterfaceC5313(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11796(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, @Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @Yue.InterfaceC5313(expression = "onCompletion { emit(value) }", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11797(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, T r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @Yue.InterfaceC5313(expression = "onEach { delay(timeMillis) }", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11798(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r2, long r3) {
            Yue.ۥ۠ۢۥ$ۥ r0 = new Yue.ۥ۠ۢۥ$ۥ
            r1 = 0
            r0.<init>(r3, r1)
            Yue.ۥۣ۠ۢۡ r2 = Yue.C2472.m11607(r2, r0)
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @Yue.InterfaceC5313(expression = "onStart { delay(timeMillis) }", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11799(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r2, long r3) {
            Yue.ۥ۠ۢۥ$ۥ۟ r0 = new Yue.ۥ۠ۢۥ$ۥ۟
            r1 = 0
            r0.<init>(r3, r1)
            Yue.ۥۣ۠ۢۡ r2 = Yue.C2472.m11614(r2, r0)
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue is 'flatMapConcat'", replaceWith = @Yue.InterfaceC5313(expression = "flatMapConcat(mapper)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <T, R> Yue.InterfaceC2464<R> m11800(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super T, ? super Yue.InterfaceC1598<? super Yue.InterfaceC2464<? extends R>>, ? extends java.lang.Object> r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @Yue.InterfaceC5313(expression = "flattenConcat()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11801(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends Yue.InterfaceC2464<? extends T>> r0) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @Yue.InterfaceC5313(expression = "collect(action)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final <T> void m11802(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super T, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @Yue.InterfaceC5313(expression = "flattenConcat()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11803(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends Yue.InterfaceC2464<? extends T>> r0) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final java.lang.Void m11804() {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Not implemented, should not be called"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Collect flow in the desired context instead")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11805(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, @Yue.InterfaceC4418 Yue.InterfaceC1632 r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @Yue.InterfaceC5313(expression = "catch { emitAll(fallback) }", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11806(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, @Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @Yue.InterfaceC5313(expression = "catch { emitAll(fallback) }", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11807(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, @Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @Yue.InterfaceC5313(expression = "catch { emit(fallback) }", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11808(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, T r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @Yue.InterfaceC5313(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11809(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r2, T r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, java.lang.Boolean> r4) {
            Yue.ۥ۠ۢۥ$ۥ۟۟۟ r0 = new Yue.ۥ۠ۢۥ$ۥ۟۟۟
            r1 = 0
            r0.<init>(r4, r3, r1)
            Yue.ۥۣ۠ۢۡ r2 = Yue.C2472.m11519(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC2464 m11810(Yue.InterfaceC2464 r0, java.lang.Object r1, Yue.InterfaceC2825 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            Yue.ۥ۠ۢۥ$ۥ۟۟ r2 = Yue.C2595.C2598.f8614
        L6:
            Yue.ۥۣ۠ۢۡ r0 = Yue.C2472.m11612(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @Yue.InterfaceC5313(expression = "this.shareIn(scope, 0)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11811(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @Yue.InterfaceC5313(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11812(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, int r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Collect flow in the desired context instead")
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11813(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, @Yue.InterfaceC4418 Yue.InterfaceC1632 r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @Yue.InterfaceC5313(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11814(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @Yue.InterfaceC5313(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11815(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, int r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow has less verbose 'scan' shortcut", replaceWith = @Yue.InterfaceC5313(expression = "scan(initial, operation)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final <T, R> Yue.InterfaceC2464<R> m11816(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, R r1, @Yue.InterfaceC4418 @Yue.InterfaceC0861 Yue.InterfaceC2841<? super R, ? super T, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r2) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @Yue.InterfaceC5313(expression = "runningReduce(operation)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11817(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, @Yue.InterfaceC4418 Yue.InterfaceC2841<? super T, ? super T, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r1) {
            Yue.ۥۣ۠ۢۡ r0 = Yue.C2472.m11628(r0, r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @Yue.InterfaceC5313(expression = "drop(count)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11818(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, int r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @Yue.InterfaceC5313(expression = "onStart { emitAll(other) }", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11819(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, @Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @Yue.InterfaceC5313(expression = "onStart { emit(value) }", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11820(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, T r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final <T> void m11821(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final <T> void m11822(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super T, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final <T> void m11823(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super T, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r1, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.lang.Throwable, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r2) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Use 'flowOn' instead")
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11824(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, @Yue.InterfaceC4418 Yue.InterfaceC1632 r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @Yue.InterfaceC5313(expression = "this.flatMapLatest(transform)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final <T, R> Yue.InterfaceC2464<R> m11825(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r2, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super T, ? super Yue.InterfaceC1598<? super Yue.InterfaceC2464<? extends R>>, ? extends java.lang.Object> r3) {
            Yue.ۥ۠ۢۥ$ۥ۟۟۟۟ r0 = new Yue.ۥ۠ۢۥ$ۥ۟۟۟۟
            r1 = 0
            r0.<init>(r3, r1)
            Yue.ۥۣ۠ۢۡ r2 = Yue.C2472.m11656(r2, r0)
            return r2
    }
}
