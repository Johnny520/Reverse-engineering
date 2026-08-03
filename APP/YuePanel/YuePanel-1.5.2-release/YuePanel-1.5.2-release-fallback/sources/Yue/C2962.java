package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2962 extends Yue.AbstractC2965 implements Yue.InterfaceC1802 {

    @Yue.InterfaceC4543
    private volatile Yue.C2962 _immediate;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final android.os.Handler f9591;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.String f9592;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean f9593;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C2962 f9594;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤ۠ۦ$ۥ, reason: contains not printable characters */
    public static final class RunnableC2963 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC0932 f9595;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2962 f9596;

        public RunnableC2963(Yue.InterfaceC0932 r1, Yue.C2962 r2) {
                r0 = this;
                r0.f9595 = r1
                r0.f9596 = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                Yue.ۥۣ۟ۨ۟ r0 = r3.f9595
                Yue.ۥ۠ۤ۠ۦ r1 = r3.f9596
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                r0.mo5303(r1, r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤ۠ۦ$ۥ۟, reason: contains not printable characters */
    public static final class C2964 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2962 f9597;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ java.lang.Runnable f9598;

        public C2964(Yue.C2962 r1, java.lang.Runnable r2) {
                r0 = this;
                r0.f9597 = r1
                r0.f9598 = r2
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.m12592(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m12592(@Yue.InterfaceC4543 java.lang.Throwable r2) {
                r1 = this;
                Yue.ۥ۠ۤ۠ۦ r2 = r1.f9597
                android.os.Handler r2 = Yue.C2962.m12586(r2)
                java.lang.Runnable r0 = r1.f9598
                r2.removeCallbacks(r0)
                return
        }
    }

    public C2962(@Yue.InterfaceC4418 android.os.Handler r2, @Yue.InterfaceC4543 java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public /* synthetic */ C2962(android.os.Handler r1, java.lang.String r2, int r3, Yue.C1769 r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    public C2962(android.os.Handler r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.f9591 = r2
            r1.f9592 = r3
            r1.f9593 = r4
            if (r4 == 0) goto Ld
            r0 = r1
        Ld:
            r1._immediate = r0
            Yue.ۥ۠ۤ۠ۦ r4 = r1._immediate
            if (r4 != 0) goto L1b
            Yue.ۥ۠ۤ۠ۦ r4 = new Yue.ۥ۠ۤ۠ۦ
            r0 = 1
            r4.<init>(r2, r3, r0)
            r1._immediate = r4
        L1b:
            r1.f9594 = r4
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static /* synthetic */ void m12585(Yue.C2962 r0, java.lang.Runnable r1) {
            m12587(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final /* synthetic */ android.os.Handler m12586(Yue.C2962 r0) {
            android.os.Handler r0 = r0.f9591
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final void m12587(Yue.C2962 r0, java.lang.Runnable r1) {
            android.os.Handler r0 = r0.f9591
            r0.removeCallbacks(r1)
            return
    }

    @Override // Yue.AbstractC1643
    public void dispatch(@Yue.InterfaceC4418 Yue.InterfaceC1632 r2, @Yue.InterfaceC4418 java.lang.Runnable r3) {
            r1 = this;
            android.os.Handler r0 = r1.f9591
            boolean r0 = r0.post(r3)
            if (r0 != 0) goto Lb
            r1.m12590(r2, r3)
        Lb:
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C2962
            if (r0 == 0) goto Le
            Yue.ۥ۠ۤ۠ۦ r2 = (Yue.C2962) r2
            android.os.Handler r2 = r2.f9591
            android.os.Handler r0 = r1.f9591
            if (r2 != r0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    public int hashCode() {
            r1 = this;
            android.os.Handler r0 = r1.f9591
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // Yue.AbstractC1643
    public boolean isDispatchNeeded(@Yue.InterfaceC4418 Yue.InterfaceC1632 r2) {
            r1 = this;
            boolean r2 = r1.f9593
            if (r2 == 0) goto L17
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Handler r0 = r1.f9591
            android.os.Looper r0 = r0.getLooper()
            boolean r2 = Yue.C3329.m13897(r2, r0)
            if (r2 != 0) goto L15
            goto L17
        L15:
            r2 = 0
            goto L18
        L17:
            r2 = 1
        L18:
            return r2
    }

    @Override // Yue.AbstractC3862, Yue.AbstractC1643
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.m15607()
            if (r0 != 0) goto L25
            java.lang.String r0 = r2.f9592
            if (r0 != 0) goto L10
            android.os.Handler r0 = r2.f9591
            java.lang.String r0 = r0.toString()
        L10:
            boolean r1 = r2.f9593
            if (r1 == 0) goto L25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ".immediate"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L25:
            return r0
    }

    @Override // Yue.AbstractC2965, Yue.InterfaceC1802
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public Yue.InterfaceC1892 mo8438(long r4, @Yue.InterfaceC4418 java.lang.Runnable r6, @Yue.InterfaceC4418 Yue.InterfaceC1632 r7) {
            r3 = this;
            android.os.Handler r0 = r3.f9591
            r1 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r4 = Yue.C5196.m19522(r4, r1)
            boolean r4 = r0.postDelayed(r6, r4)
            if (r4 == 0) goto L17
            Yue.ۥ۠ۤ۠ۥ r4 = new Yue.ۥ۠ۤ۠ۥ
            r4.<init>(r3, r6)
            return r4
        L17:
            r3.m12590(r7, r6)
            Yue.ۥۡۢۤۡ r4 = Yue.C4408.f13977
            return r4
    }

    @Override // Yue.InterfaceC1802
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public void mo8486(long r5, @Yue.InterfaceC4418 Yue.InterfaceC0932<? super Yue.C6593> r7) {
            r4 = this;
            Yue.ۥ۠ۤ۠ۦ$ۥ r0 = new Yue.ۥ۠ۤ۠ۦ$ۥ
            r0.<init>(r7, r4)
            android.os.Handler r1 = r4.f9591
            r2 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r5 = Yue.C5196.m19522(r5, r2)
            boolean r5 = r1.postDelayed(r0, r5)
            if (r5 == 0) goto L1f
            Yue.ۥ۠ۤ۠ۦ$ۥ۟ r5 = new Yue.ۥ۠ۤ۠ۦ$ۥ۟
            r5.<init>(r4, r0)
            r7.mo5308(r5)
            goto L26
        L1f:
            Yue.ۥ۟ۧۦۥ r5 = r7.getContext()
            r4.m12590(r5, r0)
        L26:
            return
    }

    @Override // Yue.AbstractC3862
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC3862 mo12588() {
            r1 = this;
            Yue.ۥ۠ۤ۠ۦ r0 = r1.m12591()
            return r0
    }

    @Override // Yue.AbstractC2965
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC2965 mo12589() {
            r1 = this;
            Yue.ۥ۠ۤ۠ۦ r0 = r1.m12591()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public final void m12590(Yue.InterfaceC1632 r4, java.lang.Runnable r5) {
            r3 = this;
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The task was rejected, the handler underlying the dispatcher '"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "' was closed"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            Yue.C3399.m14025(r4, r0)
            Yue.ۥ۟ۧۦۨ r0 = Yue.C1878.m8791()
            r0.dispatch(r4, r5)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public Yue.C2962 m12591() {
            r1 = this;
            Yue.ۥ۠ۤ۠ۦ r0 = r1.f9594
            return r0
    }
}
