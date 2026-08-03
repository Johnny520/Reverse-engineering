package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0938<T> implements Yue.InterfaceC0937<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2464<T> f2704;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۨۤ$ۥ, reason: contains not printable characters */
    public static final class C0939<T> implements Yue.InterfaceC2466 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2466<T> f2705;

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۨۤ$ۥ$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", i = {}, l = {275}, m = "emit", n = {}, s = {})
        public static final class C0940 extends Yue.AbstractC1600 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ java.lang.Object f2706;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C0938.C0939<T> f2707;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f2708;

            public C0940(Yue.C0938.C0939<? super T> r1, Yue.InterfaceC1598<? super Yue.C0938.C0939.C0940> r2) {
                    r0 = this;
                    r0.f2707 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4543
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                    r1 = this;
                    r1.f2706 = r2
                    int r2 = r1.f2708
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.f2708 = r2
                    Yue.ۥۣ۟ۨۤ$ۥ<T> r2 = r1.f2707
                    r0 = 0
                    java.lang.Object r2 = r2.mo5352(r0, r1)
                    return r2
            }
        }

        public C0939(Yue.InterfaceC2466<? super T> r1) {
                r0 = this;
                r0.f2705 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2466
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final java.lang.Object mo5352(T r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r6) {
                r4 = this;
                boolean r0 = r6 instanceof Yue.C0938.C0939.C0940
                if (r0 == 0) goto L13
                r0 = r6
                Yue.ۥۣ۟ۨۤ$ۥ$ۥ r0 = (Yue.C0938.C0939.C0940) r0
                int r1 = r0.f2708
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f2708 = r1
                goto L18
            L13:
                Yue.ۥۣ۟ۨۤ$ۥ$ۥ r0 = new Yue.ۥۣ۟ۨۤ$ۥ$ۥ
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f2706
                java.lang.Object r1 = Yue.C3341.m13947()
                int r2 = r0.f2708
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Yue.C5391.m20403(r6)
                goto L46
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                Yue.C5391.m20403(r6)
                Yue.ۥ۟ۧۦۥ r6 = r0.getContext()
                Yue.C3399.m14045(r6)
                Yue.ۥۣۣ۠ۢ<T> r6 = r4.f2705
                r0.f2708 = r3
                java.lang.Object r5 = r6.mo5352(r5, r0)
                if (r5 != r1) goto L46
                return r1
            L46:
                Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
                return r5
        }
    }

    public C0938(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.f2704 = r1
            return
    }

    @Override // Yue.InterfaceC2464
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ */
    public java.lang.Object mo392(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r4) {
            r2 = this;
            Yue.ۥۣ۠ۢۡ<T> r0 = r2.f2704
            Yue.ۥۣ۟ۨۤ$ۥ r1 = new Yue.ۥۣ۟ۨۤ$ۥ
            r1.<init>(r3)
            java.lang.Object r3 = r0.mo392(r1, r4)
            java.lang.Object r4 = Yue.C3341.m13947()
            if (r3 != r4) goto L12
            return r3
        L12:
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
            return r3
    }
}
