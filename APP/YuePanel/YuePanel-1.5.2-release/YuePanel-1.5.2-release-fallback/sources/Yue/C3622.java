package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3622 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢ۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C3623 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<java.lang.Throwable, Yue.InterfaceC1598<? super java.lang.Boolean>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f11536;

        public C3623(Yue.InterfaceC1598<? super Yue.C3622.C3623> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r2) {
                r0 = this;
                Yue.ۥ۠ۧۢ۠$ۥ r1 = new Yue.ۥ۠ۧۢ۠$ۥ
                r1.<init>(r2)
                return r1
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Throwable r1, Yue.InterfaceC1598<? super java.lang.Boolean> r2) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m14650(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                Yue.C3341.m13947()
                int r0 = r1.f11536
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
        public final java.lang.Object m14650(@Yue.InterfaceC4418 java.lang.Throwable r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super java.lang.Boolean> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥ۠ۧۢ۠$ۥ r1 = (Yue.C3622.C3623) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @Yue.InterfaceC5313(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m14633(@Yue.InterfaceC4418 Yue.InterfaceC2466<?> r0, @Yue.InterfaceC4543 java.util.concurrent.CancellationException r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ void m14634(Yue.InterfaceC2466 r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            m14633(r0, r1)
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @Yue.InterfaceC5313(expression = "this", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m14635(@Yue.InterfaceC4418 Yue.InterfaceC5741<? extends T> r0) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @Yue.InterfaceC5313(expression = "this", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m14636(Yue.InterfaceC5741<? extends T> r0, Yue.InterfaceC2841<? super Yue.InterfaceC2466<? super T>, ? super java.lang.Throwable, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r1) {
            Yue.ۥۣ۠ۢۡ r0 = Yue.C2472.m11519(r0, r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @Yue.InterfaceC5313(expression = "this", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m14637(@Yue.InterfaceC4418 Yue.InterfaceC5941<? extends T> r0) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "SharedFlow never completes, so this terminal operation never completes.")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> java.lang.Object m14638(Yue.InterfaceC5741<? extends T> r1, Yue.InterfaceC1598<? super java.lang.Integer> r2) {
            r0 = 0
            Yue.C3249.m13688(r0)
            java.lang.Object r1 = Yue.C2472.m11549(r1, r2)
            r2 = 1
            Yue.C3249.m13688(r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @Yue.InterfaceC5313(expression = "this", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m14639(@Yue.InterfaceC4418 Yue.InterfaceC5941<? extends T> r0) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @Yue.InterfaceC5313(expression = "this", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m14640(@Yue.InterfaceC4418 Yue.InterfaceC5741<? extends T> r0, @Yue.InterfaceC4418 Yue.InterfaceC1632 r1) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Yue.InterfaceC1632 m14641(@Yue.InterfaceC4418 Yue.InterfaceC2466<?> r0) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @Yue.InterfaceC5313(expression = "currentCoroutineContext()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ void m14642(Yue.InterfaceC2466 r0) {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean m14643(@Yue.InterfaceC4418 Yue.InterfaceC2466<?> r0) {
            Yue.C2472.m11604()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @Yue.InterfaceC5313(expression = "currentCoroutineContext().isActive", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m14644(Yue.InterfaceC2466 r0) {
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @Yue.InterfaceC5313(expression = "this", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m14645(Yue.InterfaceC5741<? extends T> r0, long r1, Yue.InterfaceC2839<? super java.lang.Throwable, ? super Yue.InterfaceC1598<? super java.lang.Boolean>, ? extends java.lang.Object> r3) {
            Yue.ۥۣ۠ۢۡ r0 = Yue.C2472.m11624(r0, r1, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC2464 m14646(Yue.InterfaceC5741 r0, long r1, Yue.InterfaceC2839 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L9
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L9:
            r4 = r4 & 2
            if (r4 == 0) goto L13
            Yue.ۥ۠ۧۢ۠$ۥ r3 = new Yue.ۥ۠ۧۢ۠$ۥ
            r4 = 0
            r3.<init>(r4)
        L13:
            Yue.ۥۣ۠ۢۡ r0 = Yue.C2472.m11624(r0, r1, r3)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @Yue.InterfaceC5313(expression = "this", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m14647(Yue.InterfaceC5741<? extends T> r0, Yue.InterfaceC2842<? super Yue.InterfaceC2466<? super T>, ? super java.lang.Throwable, ? super java.lang.Long, ? super Yue.InterfaceC1598<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            Yue.ۥۣ۠ۢۡ r0 = Yue.C2472.m11626(r0, r1)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "SharedFlow never completes, so this terminal operation never completes.")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final <T> java.lang.Object m14648(Yue.InterfaceC5741<? extends T> r2, Yue.InterfaceC1598<? super java.util.List<? extends T>> r3) {
            r0 = 0
            Yue.C3249.m13688(r0)
            r0 = 0
            r1 = 1
            java.lang.Object r2 = Yue.C2472.m11652(r2, r0, r3, r1, r0)
            Yue.C3249.m13688(r1)
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "SharedFlow never completes, so this terminal operation never completes.")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final <T> java.lang.Object m14649(Yue.InterfaceC5741<? extends T> r2, Yue.InterfaceC1598<? super java.util.Set<? extends T>> r3) {
            r0 = 0
            Yue.C3249.m13688(r0)
            r0 = 0
            r1 = 1
            java.lang.Object r2 = Yue.C2472.m11654(r2, r0, r3, r1, r0)
            Yue.C3249.m13688(r1)
            return r2
    }
}
