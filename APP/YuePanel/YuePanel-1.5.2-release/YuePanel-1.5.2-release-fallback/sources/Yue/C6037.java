package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6037<T> implements Yue.InterfaceC2466<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2466<T> f21830;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2839<Yue.InterfaceC2466<? super T>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> f21831;

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠ۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {419, 423}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    public static final class C6038 extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.Object f21832;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public java.lang.Object f21833;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f21834;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6037<T> f21835;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f21836;

        public C6038(Yue.C6037<T> r1, Yue.InterfaceC1598<? super Yue.C6037.C6038> r2) {
                r0 = this;
                r0.f21835 = r1
                r0.<init>(r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f21834 = r2
                int r2 = r1.f21836
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f21836 = r2
                Yue.ۥۣۢ۠ۨ<T> r2 = r1.f21835
                java.lang.Object r2 = r2.m22715(r1)
                return r2
        }
    }

    public C6037(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r1, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC2466<? super T>, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r2) {
            r0 = this;
            r0.<init>()
            r0.f21830 = r1
            r0.f21831 = r2
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object m22715(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r7) {
            r6 = this;
            boolean r0 = r7 instanceof Yue.C6037.C6038
            if (r0 == 0) goto L13
            r0 = r7
            Yue.ۥۣۢ۠ۨ$ۥ r0 = (Yue.C6037.C6038) r0
            int r1 = r0.f21836
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21836 = r1
            goto L18
        L13:
            Yue.ۥۣۢ۠ۨ$ۥ r0 = new Yue.ۥۣۢ۠ۨ$ۥ
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f21834
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f21836
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Yue.C5391.m20403(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f21833
            Yue.ۥۡۧۢ۠ r2 = (Yue.C5460) r2
            java.lang.Object r4 = r0.f21832
            Yue.ۥۣۢ۠ۨ r4 = (Yue.C6037) r4
            Yue.C5391.m20403(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            Yue.C5391.m20403(r7)
            Yue.ۥۡۧۢ۠ r2 = new Yue.ۥۡۧۢ۠
            Yue.ۥۣۣ۠ۢ<T> r7 = r6.f21830
            Yue.ۥ۟ۧۦۥ r5 = r0.getContext()
            r2.<init>(r7, r5)
            Yue.ۥۣ۠ۢۢ<Yue.ۥۣۣ۠ۢ<? super T>, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r7 = r6.f21831     // Catch: java.lang.Throwable -> L40
            r0.f21832 = r6     // Catch: java.lang.Throwable -> L40
            r0.f21833 = r2     // Catch: java.lang.Throwable -> L40
            r0.f21836 = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r4 = r6
        L60:
            r2.releaseIntercepted()
            Yue.ۥۣۣ۠ۢ<T> r7 = r4.f21830
            boolean r2 = r7 instanceof Yue.C6037
            if (r2 == 0) goto L7c
            Yue.ۥۣۢ۠ۨ r7 = (Yue.C6037) r7
            r2 = 0
            r0.f21832 = r2
            r0.f21833 = r2
            r0.f21836 = r3
            java.lang.Object r7 = r7.m22715(r0)
            if (r7 != r1) goto L79
            return r1
        L79:
            Yue.ۥۣۢ۠ۤ r7 = Yue.C6593.f23016
            return r7
        L7c:
            Yue.ۥۣۢ۠ۤ r7 = Yue.C6593.f23016
            return r7
        L7f:
            r2.releaseIntercepted()
            throw r7
    }

    @Override // Yue.InterfaceC2466
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public java.lang.Object mo5352(T r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r3) {
            r1 = this;
            Yue.ۥۣۣ۠ۢ<T> r0 = r1.f21830
            java.lang.Object r2 = r0.mo5352(r2, r3)
            return r2
    }
}
