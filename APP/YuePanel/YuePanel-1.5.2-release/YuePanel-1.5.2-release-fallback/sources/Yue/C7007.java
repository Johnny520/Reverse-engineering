package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7007 {

    /* JADX INFO: renamed from: Yue.ۥۢۥۢۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {37}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
    public static final class C7008 extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.Object f24508;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f24509;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f24510;

        public C7008(Yue.InterfaceC1598<? super Yue.C7007.C7008> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f24509 = r2
                int r2 = r1.f24510
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f24510 = r2
                r2 = 0
                java.lang.Object r2 = Yue.C7007.m27136(r2, r1)
                return r2
        }
    }

    @Yue.InterfaceC2302
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.Object m27136(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.InterfaceC5553<? super java.lang.Boolean>, Yue.C6593> r4, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r5) {
            boolean r0 = r5 instanceof Yue.C7007.C7008
            if (r0 == 0) goto L13
            r0 = r5
            Yue.ۥۢۥۢۨ$ۥ r0 = (Yue.C7007.C7008) r0
            int r1 = r0.f24510
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24510 = r1
            goto L18
        L13:
            Yue.ۥۢۥۢۨ$ۥ r0 = new Yue.ۥۢۥۢۨ$ۥ
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f24509
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f24510
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f24508
            Yue.ۥۣ۠ۡ۟ r4 = (Yue.InterfaceC2825) r4
            Yue.C5391.m20403(r5)
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            Yue.C5391.m20403(r5)
        L38:
            r0.f24508 = r4
            r0.f24510 = r3
            Yue.ۥۡۧۨۥ r5 = new Yue.ۥۡۧۨۥ
            r5.<init>(r0)
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L45
            goto L49
        L45:
            r2 = move-exception
            r5.m20853(r2)
        L49:
            java.lang.Object r5 = r5.m20852()
            java.lang.Object r2 = Yue.C3341.m13947()
            if (r5 != r2) goto L56
            Yue.C1757.m8349(r0)
        L56:
            if (r5 != r1) goto L59
            return r1
        L59:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L38
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
            return r4
    }

    @Yue.InterfaceC2302
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.Object m27137(Yue.InterfaceC2825<? super Yue.InterfaceC5553<? super java.lang.Boolean>, Yue.C6593> r2, Yue.InterfaceC1598<? super Yue.C6593> r3) {
        L0:
            r0 = 0
            Yue.C3249.m13688(r0)
            Yue.ۥۡۧۨۥ r0 = new Yue.ۥۡۧۨۥ
            r0.<init>(r3)
            r2.invoke(r0)     // Catch: java.lang.Throwable -> Ld
            goto L11
        Ld:
            r1 = move-exception
            r0.m20853(r1)
        L11:
            java.lang.Object r0 = r0.m20852()
            java.lang.Object r1 = Yue.C3341.m13947()
            if (r0 != r1) goto L1e
            Yue.C1757.m8349(r3)
        L1e:
            r1 = 1
            Yue.C3249.m13688(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L0
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
            return r2
    }
}
