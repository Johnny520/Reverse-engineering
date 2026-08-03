package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1895<T> implements Yue.InterfaceC2464<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2464<T> f5821;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final Yue.InterfaceC2825<T, java.lang.Object> f5822;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final Yue.InterfaceC2839<java.lang.Object, java.lang.Object, java.lang.Boolean> f5823;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۦ$ۥ, reason: contains not printable characters */
    public static final class C1896<T> implements Yue.InterfaceC2466 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1895<T> f5824;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5264.C5272<java.lang.Object> f5825;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2466<T> f5826;

        /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۦ$ۥ$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {81}, m = "emit", n = {}, s = {})
        public static final class C1897 extends Yue.AbstractC1600 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ java.lang.Object f5827;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C1895.C1896<T> f5828;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f5829;

            public C1897(Yue.C1895.C1896<? super T> r1, Yue.InterfaceC1598<? super Yue.C1895.C1896.C1897> r2) {
                    r0 = this;
                    r0.f5828 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4543
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                    r1 = this;
                    r1.f5827 = r2
                    int r2 = r1.f5829
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.f5829 = r2
                    Yue.ۥۣ۠۟ۦ$ۥ<T> r2 = r1.f5828
                    r0 = 0
                    java.lang.Object r2 = r2.mo5352(r0, r1)
                    return r2
            }
        }

        public C1896(Yue.C1895<T> r1, Yue.C5264.C5272<java.lang.Object> r2, Yue.InterfaceC2466<? super T> r3) {
                r0 = this;
                r0.f5824 = r1
                r0.f5825 = r2
                r0.f5826 = r3
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2466
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public final java.lang.Object mo5352(T r6, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r7) {
                r5 = this;
                boolean r0 = r7 instanceof Yue.C1895.C1896.C1897
                if (r0 == 0) goto L13
                r0 = r7
                Yue.ۥۣ۠۟ۦ$ۥ$ۥ r0 = (Yue.C1895.C1896.C1897) r0
                int r1 = r0.f5829
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f5829 = r1
                goto L18
            L13:
                Yue.ۥۣ۠۟ۦ$ۥ$ۥ r0 = new Yue.ۥۣ۠۟ۦ$ۥ$ۥ
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f5827
                java.lang.Object r1 = Yue.C3341.m13947()
                int r2 = r0.f5829
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Yue.C5391.m20403(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                Yue.C5391.m20403(r7)
                Yue.ۥۣ۠۟ۦ<T> r7 = r5.f5824
                Yue.ۥۣ۠ۡ۟<T, java.lang.Object> r7 = r7.f5822
                java.lang.Object r7 = r7.invoke(r6)
                Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ<java.lang.Object> r2 = r5.f5825
                T r2 = r2.f19776
                Yue.ۥۢ۠ۦۢ r4 = Yue.C4542.f14549
                if (r2 == r4) goto L58
                Yue.ۥۣ۠۟ۦ<T> r4 = r5.f5824
                Yue.ۥۣ۠ۢۢ<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f5823
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
                return r6
            L58:
                Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ<java.lang.Object> r2 = r5.f5825
                r2.f19776 = r7
                Yue.ۥۣۣ۠ۢ<T> r7 = r5.f5826
                r0.f5829 = r3
                java.lang.Object r6 = r7.mo5352(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
                return r6
        }
    }

    public C1895(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, ? extends java.lang.Object> r2, @Yue.InterfaceC4418 Yue.InterfaceC2839<java.lang.Object, java.lang.Object, java.lang.Boolean> r3) {
            r0 = this;
            r0.<init>()
            r0.f5821 = r1
            r0.f5822 = r2
            r0.f5823 = r3
            return
    }

    @Override // Yue.InterfaceC2464
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ */
    public java.lang.Object mo392(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r4, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r5) {
            r3 = this;
            Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ r0 = new Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ
            r0.<init>()
            Yue.ۥۢ۠ۦۢ r1 = Yue.C4542.f14549
            r0.f19776 = r1
            Yue.ۥۣ۠ۢۡ<T> r1 = r3.f5821
            Yue.ۥۣ۠۟ۦ$ۥ r2 = new Yue.ۥۣ۠۟ۦ$ۥ
            r2.<init>(r3, r0, r4)
            java.lang.Object r4 = r1.mo392(r2, r5)
            java.lang.Object r5 = Yue.C3341.m13947()
            if (r4 != r5) goto L1b
            return r4
        L1b:
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
            return r4
    }
}
