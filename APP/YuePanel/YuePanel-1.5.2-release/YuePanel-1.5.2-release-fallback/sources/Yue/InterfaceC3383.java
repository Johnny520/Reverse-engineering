package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3383 extends Yue.InterfaceC1632.InterfaceC1635 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.InterfaceC3383.C3385 f10824 = null;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۡ$ۥ, reason: contains not printable characters */
    public static final class C3384 {
        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m13987(Yue.InterfaceC3383 r1) {
                r0 = 0
                r1.mo1961(r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m13988(Yue.InterfaceC3383 r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lb
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                r0.mo1961(r1)
                return
            Lb:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: cancel"
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m13989(Yue.InterfaceC3383 r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lc
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                boolean r0 = r0.mo1960(r1)
                return r0
            Lc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: cancel"
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <R> R m13990(@Yue.InterfaceC4418 Yue.InterfaceC3383 r0, R r1, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super R, ? super Yue.InterfaceC1632.InterfaceC1635, ? extends R> r2) {
                java.lang.Object r0 = Yue.InterfaceC1632.InterfaceC1635.C1636.m7908(r0, r1, r2)
                return r0
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static <E extends Yue.InterfaceC1632.InterfaceC1635> E m13991(@Yue.InterfaceC4418 Yue.InterfaceC3383 r0, @Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<E> r1) {
                Yue.ۥ۟ۧۦۥ$ۥ۟ r0 = Yue.InterfaceC1632.InterfaceC1635.C1636.m7909(r0, r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ Yue.InterfaceC1892 m13992(Yue.InterfaceC3383 r0, boolean r1, boolean r2, Yue.InterfaceC2825 r3, int r4, java.lang.Object r5) {
                if (r5 != 0) goto L11
                r5 = r4 & 1
                if (r5 == 0) goto L7
                r1 = 0
            L7:
                r4 = r4 & 2
                if (r4 == 0) goto Lc
                r2 = 1
            Lc:
                Yue.ۥۣۣ۠۟ r0 = r0.mo13983(r1, r2, r3)
                return r0
            L11:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: invokeOnCompletion"
                r0.<init>(r1)
                throw r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static Yue.InterfaceC1632 m13993(@Yue.InterfaceC4418 Yue.InterfaceC3383 r0, @Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<?> r1) {
                Yue.ۥ۟ۧۦۥ r0 = Yue.InterfaceC1632.InterfaceC1635.C1636.m7910(r0, r1)
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static Yue.InterfaceC1632 m13994(@Yue.InterfaceC4418 Yue.InterfaceC3383 r0, @Yue.InterfaceC4418 Yue.InterfaceC1632 r1) {
                Yue.ۥ۟ۧۦۥ r0 = Yue.InterfaceC1632.InterfaceC1635.C1636.m7911(r0, r1)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static Yue.InterfaceC3383 m13995(@Yue.InterfaceC4418 Yue.InterfaceC3383 r0, @Yue.InterfaceC4418 Yue.InterfaceC3383 r1) {
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۡ$ۥ۟, reason: contains not printable characters */
    public static final class C3385 implements Yue.InterfaceC1632.InterfaceC1637<Yue.InterfaceC3383> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final /* synthetic */ Yue.InterfaceC3383.C3385 f10825 = null;

        static {
                Yue.ۥ۠ۦ۟ۡ$ۥ۟ r0 = new Yue.ۥ۠ۦ۟ۡ$ۥ۟
                r0.<init>()
                Yue.InterfaceC3383.C3385.f10825 = r0
                return
        }

        public C3385() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r0 = Yue.InterfaceC3383.C3385.f10825
            Yue.InterfaceC3383.f10824 = r0
            return
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    boolean isCancelled();

    boolean start();

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: ۥ۟۟ */
    /* synthetic */ boolean mo1960(java.lang.Throwable r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    boolean mo371();

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    void mo1961(@Yue.InterfaceC4543 java.util.concurrent.CancellationException r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    boolean mo13978();

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    Yue.InterfaceC3383 mo13979(@Yue.InterfaceC4418 Yue.InterfaceC3383 r1);

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    Yue.InterfaceC5609<Yue.InterfaceC3383> mo13980();

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    Yue.InterfaceC1892 mo13981(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r1);

    @Yue.InterfaceC4418
    @Yue.InterfaceC3324
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    java.util.concurrent.CancellationException mo13982();

    @Yue.InterfaceC4418
    @Yue.InterfaceC3324
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    Yue.InterfaceC1892 mo13983(boolean r1, boolean r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r3);

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    java.lang.Object mo13984(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r1);

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    Yue.InterfaceC5561 mo13985();

    @Yue.InterfaceC4418
    @Yue.InterfaceC3324
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    Yue.InterfaceC1126 mo13986(@Yue.InterfaceC4418 Yue.InterfaceC1129 r1);
}
