package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1447 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f4544 = 16;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C6075 f4545 = null;

    static {
            Yue.ۥۢ۠ۦۢ r0 = new Yue.ۥۢ۠ۦۢ
            java.lang.String r1 = "CLOSED"
            r0.<init>(r1)
            Yue.C1447.f4545 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C6075 m7101() {
            Yue.ۥۢ۠ۦۢ r0 = Yue.C1447.f4545
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <N extends Yue.AbstractC1448<N>> N m7102(@Yue.InterfaceC4418 N r2) {
        L0:
            java.lang.Object r0 = Yue.AbstractC1448.m7105(r2)
            Yue.ۥۢ۠ۦۢ r1 = m7101()
            if (r0 != r1) goto Lb
            return r2
        Lb:
            Yue.ۥ۟ۦۥۨ r0 = (Yue.AbstractC1448) r0
            if (r0 != 0) goto L16
            boolean r0 = r2.m7114()
            if (r0 == 0) goto L0
            return r2
        L16:
            r2 = r0
            goto L0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <S extends Yue.AbstractC5548<S>> java.lang.Object m7103(S r4, long r5, Yue.InterfaceC2839<? super java.lang.Long, ? super S, ? extends S> r7) {
        L0:
            long r0 = r4.m20811()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L14
            boolean r0 = r4.mo7111()
            if (r0 == 0) goto Lf
            goto L14
        Lf:
            java.lang.Object r4 = Yue.C5549.m20816(r4)
            return r4
        L14:
            java.lang.Object r0 = Yue.AbstractC1448.m7105(r4)
            Yue.ۥۢ۠ۦۢ r1 = m7101()
            if (r0 != r1) goto L27
            Yue.ۥۢ۠ۦۢ r4 = m7101()
            java.lang.Object r4 = Yue.C5549.m20816(r4)
            return r4
        L27:
            Yue.ۥ۟ۦۥۨ r0 = (Yue.AbstractC1448) r0
            Yue.ۥۡۧۨ۟ r0 = (Yue.AbstractC5548) r0
            if (r0 == 0) goto L2f
        L2d:
            r4 = r0
            goto L0
        L2f:
            long r0 = r4.m20811()
            r2 = 1
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.invoke(r0, r4)
            Yue.ۥۡۧۨ۟ r0 = (Yue.AbstractC5548) r0
            boolean r1 = r4.m7117(r0)
            if (r1 == 0) goto L0
            boolean r1 = r4.mo7111()
            if (r1 == 0) goto L2d
            r4.m7116()
            goto L2d
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m7104() {
            return
    }
}
