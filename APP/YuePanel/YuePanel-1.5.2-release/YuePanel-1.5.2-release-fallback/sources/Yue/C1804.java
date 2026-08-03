package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1804 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۨ۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {148}, m = "awaitCancellation", n = {}, s = {})
    public static final class C1805 extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f5534;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f5535;

        public C1805(Yue.InterfaceC1598<? super Yue.C1804.C1805> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f5534 = r2
                int r2 = r1.f5535
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f5535 = r2
                java.lang.Object r2 = Yue.C1804.m8489(r1)
                return r2
        }
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.Object m8489(@Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
            boolean r0 = r4 instanceof Yue.C1804.C1805
            if (r0 == 0) goto L13
            r0 = r4
            Yue.ۥ۟ۨۨ۟$ۥ r0 = (Yue.C1804.C1805) r0
            int r1 = r0.f5535
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5535 = r1
            goto L18
        L13:
            Yue.ۥ۟ۨۨ۟$ۥ r0 = new Yue.ۥ۟ۨۨ۟$ۥ
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f5534
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f5535
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            Yue.C5391.m20403(r4)
            goto L52
        L31:
            Yue.C5391.m20403(r4)
            r0.f5535 = r3
            Yue.ۥۣ۟ۨ۠ r4 = new Yue.ۥۣ۟ۨ۠
            Yue.ۥ۟ۧۤۢ r2 = Yue.C3332.m13940(r0)
            r4.<init>(r2, r3)
            r4.mo5307()
            java.lang.Object r4 = r4.m5329()
            java.lang.Object r2 = Yue.C3341.m13947()
            if (r4 != r2) goto L4f
            Yue.C1757.m8349(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            Yue.ۥ۠ۦۧۤ r4 = new Yue.ۥ۠ۦۧۤ
            r4.<init>()
            throw r4
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.Object m8490(long r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r5) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L9
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
            return r3
        L9:
            Yue.ۥۣ۟ۨ۠ r0 = new Yue.ۥۣ۟ۨ۠
            Yue.ۥ۟ۧۤۢ r1 = Yue.C3332.m13940(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.mo5307()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L2a
            Yue.ۥ۟ۧۦۥ r1 = r0.getContext()
            Yue.ۥ۟ۨۨ r1 = m8492(r1)
            r1.mo8486(r3, r0)
        L2a:
            java.lang.Object r3 = r0.m5329()
            java.lang.Object r4 = Yue.C3341.m13947()
            if (r3 != r4) goto L37
            Yue.C1757.m8349(r5)
        L37:
            java.lang.Object r4 = Yue.C3341.m13947()
            if (r3 != r4) goto L3e
            return r3
        L3e:
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
            return r3
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.Object m8491(long r0, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2) {
            long r0 = m8493(r0)
            java.lang.Object r0 = m8490(r0, r2)
            java.lang.Object r1 = Yue.C3341.m13947()
            if (r0 != r1) goto Lf
            return r0
        Lf:
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Yue.InterfaceC1802 m8492(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1) {
            Yue.ۥ۟ۧۤۥ$ۥ۟ r0 = Yue.InterfaceC1601.f5016
            Yue.ۥ۟ۧۦۥ$ۥ۟ r1 = r1.get(r0)
            boolean r0 = r1 instanceof Yue.InterfaceC1802
            if (r0 == 0) goto Ld
            Yue.ۥ۟ۨۨ r1 = (Yue.InterfaceC1802) r1
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 != 0) goto L14
            Yue.ۥ۟ۨۨ r1 = Yue.C1772.m8450()
        L14:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final long m8493(long r2) {
            Yue.ۥ۠۠ۢۥ$ۥ r0 = Yue.C2045.f6532
            long r0 = r0.m9558()
            int r0 = Yue.C2045.m9442(r2, r0)
            if (r0 <= 0) goto L17
            long r2 = Yue.C2045.m9469(r2)
            r0 = 1
            long r2 = Yue.C5196.m19515(r2, r0)
            goto L19
        L17:
            r2 = 0
        L19:
            return r2
    }
}
