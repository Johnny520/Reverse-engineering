package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1412 {
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC1409<T> m7021(@Yue.InterfaceC4543 Yue.InterfaceC3383 r1) {
            Yue.ۥ۟ۦۢۨ r0 = new Yue.ۥ۟ۦۢۨ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC1409<T> m7022(T r2) {
            Yue.ۥ۟ۦۢۨ r0 = new Yue.ۥ۟ۦۢۨ
            r1 = 0
            r0.<init>(r1)
            r0.mo7010(r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC1409 m7023(Yue.InterfaceC3383 r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            Yue.ۥ۟ۦۢۧ r0 = m7021(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> boolean m7024(@Yue.InterfaceC4418 Yue.InterfaceC1409<T> r1, @Yue.InterfaceC4418 java.lang.Object r2) {
            java.lang.Throwable r0 = Yue.C5388.m20380(r2)
            if (r0 != 0) goto Lb
            boolean r1 = r1.mo7010(r2)
            goto Lf
        Lb:
            boolean r1 = r1.mo7009(r0)
        Lf:
            return r1
    }
}
