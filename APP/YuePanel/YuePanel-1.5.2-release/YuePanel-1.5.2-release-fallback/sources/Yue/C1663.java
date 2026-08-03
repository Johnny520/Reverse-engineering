package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1663 {
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final Yue.InterfaceC1662 m8001(@Yue.InterfaceC4418 Yue.InterfaceC1632 r3) {
            Yue.ۥ۟ۧۤ۠ r0 = new Yue.ۥ۟ۧۤ۠
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r1 = Yue.InterfaceC3383.f10824
            Yue.ۥ۟ۧۦۥ$ۥ۟ r1 = r3.get(r1)
            if (r1 == 0) goto Lb
            goto L15
        Lb:
            r1 = 1
            r2 = 0
            Yue.ۥ۟ۦۣ۟ r1 = Yue.C3399.m14022(r2, r1, r2)
            Yue.ۥ۟ۧۦۥ r3 = r3.plus(r1)
        L15:
            r0.<init>(r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final Yue.InterfaceC1662 m8002() {
            Yue.ۥ۟ۧۤ۠ r0 = new Yue.ۥ۟ۧۤ۠
            r1 = 0
            r2 = 1
            Yue.ۥ۟ۦۣ۟ r1 = Yue.C6053.m22764(r1, r2, r1)
            Yue.ۥ۠ۨۥۥ r2 = Yue.C1878.m8793()
            Yue.ۥ۟ۧۦۥ r1 = r1.plus(r2)
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m8003(@Yue.InterfaceC4418 Yue.InterfaceC1662 r0, @Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4543 java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r1 = Yue.C2266.m10466(r1, r2)
            m8004(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m8004(@Yue.InterfaceC4418 Yue.InterfaceC1662 r2, @Yue.InterfaceC4543 java.util.concurrent.CancellationException r3) {
            Yue.ۥ۟ۧۦۥ r0 = r2.getCoroutineContext()
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r1 = Yue.InterfaceC3383.f10824
            Yue.ۥ۟ۧۦۥ$ۥ۟ r0 = r0.get(r1)
            Yue.ۥ۠ۦ۟ۡ r0 = (Yue.InterfaceC3383) r0
            if (r0 == 0) goto L12
            r0.mo1961(r3)
            return
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Scope cannot be cancelled because it does not have a job: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m8005(Yue.InterfaceC1662 r0, java.lang.String r1, java.lang.Throwable r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            m8003(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m8006(Yue.InterfaceC1662 r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            m8004(r0, r1)
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <R> java.lang.Object m8007(@Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super R> r3) {
            Yue.ۥۡۧۥ r0 = new Yue.ۥۡۧۥ
            Yue.ۥ۟ۧۦۥ r1 = r3.getContext()
            r0.<init>(r1, r3)
            java.lang.Object r2 = Yue.C6589.m25380(r0, r0, r2)
            java.lang.Object r0 = Yue.C3341.m13947()
            if (r2 != r0) goto L16
            Yue.C1757.m8349(r3)
        L16:
            return r2
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.Object m8008(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.InterfaceC1632> r0) {
            Yue.ۥ۟ۧۦۥ r0 = r0.getContext()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.Object m8009(Yue.InterfaceC1598<? super Yue.InterfaceC1632> r0) {
            r0 = 3
            Yue.C3249.m13688(r0)
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m8010(@Yue.InterfaceC4418 Yue.InterfaceC1662 r0) {
            Yue.ۥ۟ۧۦۥ r0 = r0.getCoroutineContext()
            Yue.C3399.m14045(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean m8011(@Yue.InterfaceC4418 Yue.InterfaceC1662 r1) {
            Yue.ۥ۟ۧۦۥ r1 = r1.getCoroutineContext()
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r0 = Yue.InterfaceC3383.f10824
            Yue.ۥ۟ۧۦۥ$ۥ۟ r1 = r1.get(r0)
            Yue.ۥ۠ۦ۟ۡ r1 = (Yue.InterfaceC3383) r1
            if (r1 == 0) goto L13
            boolean r1 = r1.mo371()
            goto L14
        L13:
            r1 = 1
        L14:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m8012(Yue.InterfaceC1662 r0) {
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final Yue.InterfaceC1662 m8013(@Yue.InterfaceC4418 Yue.InterfaceC1662 r1, @Yue.InterfaceC4418 Yue.InterfaceC1632 r2) {
            Yue.ۥ۟ۧۤ۠ r0 = new Yue.ۥ۟ۧۤ۠
            Yue.ۥ۟ۧۦۥ r1 = r1.getCoroutineContext()
            Yue.ۥ۟ۧۦۥ r1 = r1.plus(r2)
            r0.<init>(r1)
            return r0
    }
}
