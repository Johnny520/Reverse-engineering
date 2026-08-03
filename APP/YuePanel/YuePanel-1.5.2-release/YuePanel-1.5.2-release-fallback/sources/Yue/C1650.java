package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1650 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۧ۠$ۥ, reason: contains not printable characters */
    public static final class C1651 extends Yue.AbstractC0044 implements Yue.InterfaceC1646 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2839<Yue.InterfaceC1632, java.lang.Throwable, Yue.C6593> f5102;

        public C1651(Yue.InterfaceC2839<? super Yue.InterfaceC1632, ? super java.lang.Throwable, Yue.C6593> r1, Yue.InterfaceC1646.C1648 r2) {
                r0 = this;
                r0.f5102 = r1
                r0.<init>(r2)
                return
        }

        @Override // Yue.InterfaceC1646
        /* JADX INFO: renamed from: ۥ۟۟ۢ */
        public void mo1412(@Yue.InterfaceC4418 Yue.InterfaceC1632 r2, @Yue.InterfaceC4418 java.lang.Throwable r3) {
                r1 = this;
                Yue.ۥۣ۠ۢۢ<Yue.ۥ۟ۧۦۥ, java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r0 = r1.f5102
                r0.invoke(r2, r3)
                return
        }
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final Yue.InterfaceC1646 m7932(@Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC1632, ? super java.lang.Throwable, Yue.C6593> r2) {
            Yue.ۥ۟ۧۧ$ۥ۟ r0 = Yue.InterfaceC1646.f5099
            Yue.ۥ۟ۧۧ۠$ۥ r1 = new Yue.ۥ۟ۧۧ۠$ۥ
            r1.<init>(r2, r0)
            return r1
    }

    @Yue.InterfaceC3324
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final void m7933(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, @Yue.InterfaceC4418 java.lang.Throwable r2) {
            Yue.ۥ۟ۧۧ$ۥ۟ r0 = Yue.InterfaceC1646.f5099     // Catch: java.lang.Throwable -> Le
            Yue.ۥ۟ۧۦۥ$ۥ۟ r0 = r1.get(r0)     // Catch: java.lang.Throwable -> Le
            Yue.ۥ۟ۧۧ r0 = (Yue.InterfaceC1646) r0     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            r0.mo1412(r1, r2)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r0 = move-exception
            goto L14
        L10:
            Yue.C1649.m7931(r1, r2)
            return
        L14:
            java.lang.Throwable r2 = m7934(r2, r0)
            Yue.C1649.m7931(r1, r2)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.Throwable m7934(@Yue.InterfaceC4418 java.lang.Throwable r2, @Yue.InterfaceC4418 java.lang.Throwable r3) {
            if (r2 != r3) goto L3
            return r2
        L3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Exception while trying to handle coroutine exception"
            r0.<init>(r1, r3)
            Yue.C2268.m10468(r0, r2)
            return r0
    }
}
