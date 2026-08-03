package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6039<T> implements Yue.InterfaceC5741<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5741<T> f21837;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2839<Yue.InterfaceC2466<? super T>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> f21838;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {409}, m = "collect", n = {}, s = {})
    public static final class C6040 extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f21839;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6039<T> f21840;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f21841;

        public C6040(Yue.C6039<T> r1, Yue.InterfaceC1598<? super Yue.C6039.C6040> r2) {
                r0 = this;
                r0.f21840 = r1
                r0.<init>(r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f21839 = r2
                int r2 = r1.f21841
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f21841 = r2
                Yue.ۥۢ۠ۤ<T> r2 = r1.f21840
                r0 = 0
                java.lang.Object r2 = r2.mo392(r0, r1)
                return r2
        }
    }

    public C6039(@Yue.InterfaceC4418 Yue.InterfaceC5741<? extends T> r1, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC2466<? super T>, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r2) {
            r0 = this;
            r0.<init>()
            r0.f21837 = r1
            r0.f21838 = r2
            return
    }

    @Override // Yue.InterfaceC5741, Yue.InterfaceC2464
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ */
    public java.lang.Object mo392(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r6, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r7) {
            r5 = this;
            boolean r0 = r7 instanceof Yue.C6039.C6040
            if (r0 == 0) goto L13
            r0 = r7
            Yue.ۥۢ۠ۤ$ۥ r0 = (Yue.C6039.C6040) r0
            int r1 = r0.f21841
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21841 = r1
            goto L18
        L13:
            Yue.ۥۢ۠ۤ$ۥ r0 = new Yue.ۥۢ۠ۤ$ۥ
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f21839
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f21841
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            Yue.C5391.m20403(r7)
            goto L46
        L31:
            Yue.C5391.m20403(r7)
            Yue.ۥۡۨۨ۠<T> r7 = r5.f21837
            Yue.ۥۣۢ۠ۨ r2 = new Yue.ۥۣۢ۠ۨ
            Yue.ۥۣ۠ۢۢ<Yue.ۥۣۣ۠ۢ<? super T>, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r4 = r5.f21838
            r2.<init>(r6, r4)
            r0.f21841 = r3
            java.lang.Object r6 = r7.mo392(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            Yue.ۥ۠ۦۧۤ r6 = new Yue.ۥ۠ۦۧۤ
            r6.<init>()
            throw r6
    }

    @Override // Yue.InterfaceC5741
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ */
    public java.util.List<T> mo19669() {
            r1 = this;
            Yue.ۥۡۨۨ۠<T> r0 = r1.f21837
            java.util.List r0 = r0.mo19669()
            return r0
    }
}
