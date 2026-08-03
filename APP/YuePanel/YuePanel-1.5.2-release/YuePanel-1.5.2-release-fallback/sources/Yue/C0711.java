package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0711<T> {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f1959 = null;

    @Yue.InterfaceC4418
    volatile /* synthetic */ int notCompletedCount;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1796<T>[] f1960;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۤ$ۥ, reason: contains not printable characters */
    public final class C0712 extends Yue.AbstractC3402 {

        @Yue.InterfaceC4418
        private volatile /* synthetic */ java.lang.Object _disposer;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.InterfaceC0932<java.util.List<? extends T>> f1961;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public Yue.InterfaceC1892 f1962;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0711<T> f1963;

        public C0712(@Yue.InterfaceC4418 Yue.C0711 r1, Yue.InterfaceC0932<? super java.util.List<? extends T>> r2) {
                r0 = this;
                r0.f1963 = r1
                r0.<init>()
                r0.f1961 = r2
                r1 = 0
                r0._disposer = r1
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.mo4448(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        @Override // Yue.AbstractC1419
        /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
        public void mo4448(@Yue.InterfaceC4543 java.lang.Throwable r6) {
                r5 = this;
                if (r6 == 0) goto L19
                Yue.ۥۣ۟ۨ۟<java.util.List<? extends T>> r0 = r5.f1961
                java.lang.Object r6 = r0.mo5305(r6)
                if (r6 == 0) goto L4a
                Yue.ۥۣ۟ۨ۟<java.util.List<? extends T>> r0 = r5.f1961
                r0.mo5309(r6)
                Yue.ۥۣ۟ۢۤ$ۥ۟ r6 = r5.m4449()
                if (r6 == 0) goto L4a
                r6.m4453()
                goto L4a
            L19:
                Yue.ۥۣ۟ۢۤ<T> r6 = r5.f1963
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.C0711.f1959
                int r6 = r0.decrementAndGet(r6)
                if (r6 != 0) goto L4a
                Yue.ۥۣ۟ۨ۟<java.util.List<? extends T>> r6 = r5.f1961
                Yue.ۥۣ۟ۢۤ<T> r0 = r5.f1963
                Yue.ۥ۟ۨۧۥ[] r0 = Yue.C0711.m4446(r0)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.length
                r1.<init>(r2)
                int r2 = r0.length
                r3 = 0
            L33:
                if (r3 >= r2) goto L41
                r4 = r0[r3]
                java.lang.Object r4 = r4.mo7017()
                r1.add(r4)
                int r3 = r3 + 1
                goto L33
            L41:
                Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029
                java.lang.Object r0 = Yue.C5388.m20377(r1)
                r6.resumeWith(r0)
            L4a:
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
        public final Yue.C0711<T>.C0713 m4449() {
                r1 = this;
                java.lang.Object r0 = r1._disposer
                Yue.ۥۣ۟ۢۤ$ۥ۟ r0 = (Yue.C0711.C0713) r0
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
        public final Yue.InterfaceC1892 m4450() {
                r1 = this;
                Yue.ۥۣۣ۠۟ r0 = r1.f1962
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = "handle"
                Yue.C3329.m13935(r0)
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
        public final void m4451(@Yue.InterfaceC4543 Yue.C0711<T>.C0713 r1) {
                r0 = this;
                r0._disposer = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
        public final void m4452(@Yue.InterfaceC4418 Yue.InterfaceC1892 r1) {
                r0 = this;
                r0.f1962 = r1
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۤ$ۥ۟, reason: contains not printable characters */
    public final class C0713 extends Yue.AbstractC0928 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.C0711<T>.C0712[] f1964;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0711<T> f1965;

        public C0713(@Yue.InterfaceC4418 Yue.C0711 r1, Yue.C0711<T>.C0712[] r2) {
                r0 = this;
                r0.f1965 = r1
                r0.<init>()
                r0.f1964 = r2
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.mo353(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "DisposeHandlersOnCancel["
                r0.append(r1)
                Yue.ۥۣ۟ۢۤ<T>$ۥ[] r1 = r2.f1964
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.AbstractC0929
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo353(@Yue.InterfaceC4543 java.lang.Throwable r1) {
                r0 = this;
                r0.m4453()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m4453() {
                r4 = this;
                Yue.ۥۣ۟ۢۤ<T>$ۥ[] r0 = r4.f1964
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                Yue.ۥۣۣ۠۟ r3 = r3.m4450()
                r3.mo352()
                int r2 = r2 + 1
                goto L4
            L12:
                return
        }
    }

    static {
            java.lang.Class<Yue.ۥۣ۟ۢۤ> r0 = Yue.C0711.class
            java.lang.String r1 = "notCompletedCount"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            Yue.C0711.f1959 = r0
            return
    }

    public C0711(@Yue.InterfaceC4418 Yue.InterfaceC1796<? extends T>[] r1) {
            r0 = this;
            r0.<init>()
            r0.f1960 = r1
            int r1 = r1.length
            r0.notCompletedCount = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC1796[] m4446(Yue.C0711 r0) {
            Yue.ۥ۟ۨۧۥ<T>[] r0 = r0.f1960
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.Object m4447(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super java.util.List<? extends T>> r8) {
            r7 = this;
            Yue.ۥۣ۟ۨ۠ r0 = new Yue.ۥۣ۟ۨ۠
            Yue.ۥ۟ۧۤۢ r1 = Yue.C3332.m13940(r8)
            r2 = 1
            r0.<init>(r1, r2)
            r0.mo5307()
            Yue.ۥ۟ۨۧۥ[] r1 = m4446(r7)
            int r1 = r1.length
            Yue.ۥۣ۟ۢۤ$ۥ[] r2 = new Yue.C0711.C0712[r1]
            r3 = 0
            r4 = r3
        L16:
            if (r4 >= r1) goto L34
            Yue.ۥ۟ۨۧۥ[] r5 = m4446(r7)
            r5 = r5[r4]
            r5.start()
            Yue.ۥۣ۟ۢۤ$ۥ r6 = new Yue.ۥۣ۟ۢۤ$ۥ
            r6.<init>(r7, r0)
            Yue.ۥۣۣ۠۟ r5 = r5.mo13981(r6)
            r6.m4452(r5)
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            r2[r4] = r6
            int r4 = r4 + 1
            goto L16
        L34:
            Yue.ۥۣ۟ۢۤ$ۥ۟ r4 = new Yue.ۥۣ۟ۢۤ$ۥ۟
            r4.<init>(r7, r2)
        L39:
            if (r3 >= r1) goto L43
            r5 = r2[r3]
            r5.m4451(r4)
            int r3 = r3 + 1
            goto L39
        L43:
            boolean r1 = r0.mo5300()
            if (r1 == 0) goto L4d
            r4.m4453()
            goto L50
        L4d:
            r0.mo5308(r4)
        L50:
            java.lang.Object r0 = r0.m5329()
            java.lang.Object r1 = Yue.C3341.m13947()
            if (r0 != r1) goto L5d
            Yue.C1757.m8349(r8)
        L5d:
            return r0
    }
}
