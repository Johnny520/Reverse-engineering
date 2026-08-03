package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6586<T> implements Yue.InterfaceC2466<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1632 f23008;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Object f23009;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2839<T, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> f23010;

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    public static final class C6587 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<T, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f23011;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f23012;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2466<T> f23013;

        public C6587(Yue.InterfaceC2466<? super T> r1, Yue.InterfaceC1598<? super Yue.C6586.C6587> r2) {
                r0 = this;
                r0.f23013 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                r2 = this;
                Yue.ۥۣۢ۠$ۥ r0 = new Yue.ۥۣۢ۠$ۥ
                Yue.ۥۣۣ۠ۢ<T> r1 = r2.f23013
                r0.<init>(r1, r4)
                r0.f23012 = r3
                return r0
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m25372(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r3.f23011
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C5391.m20403(r4)
                goto L27
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                Yue.C5391.m20403(r4)
                java.lang.Object r4 = r3.f23012
                Yue.ۥۣۣ۠ۢ<T> r1 = r3.f23013
                r3.f23011 = r2
                java.lang.Object r4 = r1.mo5352(r4, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
                return r4
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m25372(T r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥۣۢ۠$ۥ r1 = (Yue.C6586.C6587) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    public C6586(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r2, @Yue.InterfaceC4418 Yue.InterfaceC1632 r3) {
            r1 = this;
            r1.<init>()
            r1.f23008 = r3
            java.lang.Object r3 = Yue.C6179.m23130(r3)
            r1.f23009 = r3
            Yue.ۥۣۢ۠$ۥ r3 = new Yue.ۥۣۢ۠$ۥ
            r0 = 0
            r3.<init>(r2, r0)
            r1.f23010 = r3
            return
    }

    @Override // Yue.InterfaceC2466
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public java.lang.Object mo5352(T r4, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r5) {
            r3 = this;
            Yue.ۥ۟ۧۦۥ r0 = r3.f23008
            java.lang.Object r1 = r3.f23009
            Yue.ۥۣ۠ۢۢ<T, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r2 = r3.f23010
            java.lang.Object r4 = Yue.C1005.m5540(r0, r4, r1, r2, r5)
            java.lang.Object r5 = Yue.C3341.m13947()
            if (r4 != r5) goto L11
            return r4
        L11:
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
            return r4
    }
}
