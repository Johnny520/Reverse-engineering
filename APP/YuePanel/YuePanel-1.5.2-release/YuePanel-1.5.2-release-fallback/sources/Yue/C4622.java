package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4622 {

    /* JADX INFO: renamed from: Yue.ۥۣۡۢۥ$ۥ, reason: contains not printable characters */
    public static final class C4623 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2825<E, Yue.C6593> f14727;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ E f14728;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC1632 f14729;

        public C4623(Yue.InterfaceC2825<? super E, Yue.C6593> r1, E r2, Yue.InterfaceC1632 r3) {
                r0 = this;
                r0.f14727 = r1
                r0.f14728 = r2
                r0.f14729 = r3
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.m18436(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m18436(@Yue.InterfaceC4418 java.lang.Throwable r3) {
                r2 = this;
                Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r3 = r2.f14727
                E r0 = r2.f14728
                Yue.ۥ۟ۧۦۥ r1 = r2.f14729
                Yue.C4622.m18433(r3, r0, r1)
                return
        }
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <E> Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> m18432(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super E, Yue.C6593> r1, E r2, @Yue.InterfaceC4418 Yue.InterfaceC1632 r3) {
            Yue.ۥۣۡۢۥ$ۥ r0 = new Yue.ۥۣۡۢۥ$ۥ
            r0.<init>(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <E> void m18433(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super E, Yue.C6593> r1, E r2, @Yue.InterfaceC4418 Yue.InterfaceC1632 r3) {
            r0 = 0
            Yue.ۥۣۢ۟ۨ r1 = m18434(r1, r2, r0)
            if (r1 == 0) goto La
            Yue.C1650.m7933(r3, r1)
        La:
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <E> Yue.C6585 m18434(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super E, Yue.C6593> r2, E r3, @Yue.InterfaceC4543 Yue.C6585 r4) {
            r2.invoke(r3)     // Catch: java.lang.Throwable -> L4
            goto L10
        L4:
            r2 = move-exception
            if (r4 == 0) goto L11
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == r2) goto L11
            Yue.C2268.m10468(r4, r2)
        L10:
            return r4
        L11:
            Yue.ۥۣۢ۟ۨ r4 = new Yue.ۥۣۢ۟ۨ
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Exception in undelivered element handler for "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3, r2)
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.C6585 m18435(Yue.InterfaceC2825 r0, java.lang.Object r1, Yue.C6585 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            Yue.ۥۣۢ۟ۨ r0 = m18434(r0, r1, r2)
            return r0
    }
}
