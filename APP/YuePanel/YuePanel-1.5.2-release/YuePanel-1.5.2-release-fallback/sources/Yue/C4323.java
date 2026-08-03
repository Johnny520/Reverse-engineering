package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4323 implements Yue.InterfaceC4321, Yue.InterfaceC5563<java.lang.Object, Yue.InterfaceC4321> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f13651 = null;

    @Yue.InterfaceC4418
    volatile /* synthetic */ java.lang.Object _state;

    /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ, reason: contains not printable characters */
    public final class C4324 extends Yue.C4323.AbstractC4328 {

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.InterfaceC0932<Yue.C6593> f13652;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4323 f13653;

        /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C4325 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Yue.C4323 f13654;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C4323.C4324 f13655;

            public C4325(Yue.C4323 r1, Yue.C4323.C4324 r2) {
                    r0 = this;
                    r0.f13654 = r1
                    r0.f13655 = r2
                    r1 = 1
                    r0.<init>(r1)
                    return
            }

            @Override // Yue.InterfaceC2825
            public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
                    r0 = this;
                    java.lang.Throwable r1 = (java.lang.Throwable) r1
                    r0.m16945(r1)
                    Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                    return r1
            }

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final void m16945(@Yue.InterfaceC4418 java.lang.Throwable r2) {
                    r1 = this;
                    Yue.ۥۡۡۧۨ r2 = r1.f13654
                    Yue.ۥۡۡۧۨ$ۥ r0 = r1.f13655
                    java.lang.Object r0 = r0.f13662
                    r2.mo16933(r0)
                    return
            }
        }

        public C4324(@Yue.InterfaceC4543 Yue.C4323 r1, @Yue.InterfaceC4418 java.lang.Object r2, Yue.InterfaceC0932<? super Yue.C6593> r3) {
                r0 = this;
                r0.f13653 = r1
                r0.<init>(r1, r2)
                r0.f13652 = r3
                return
        }

        @Override // Yue.C3783
        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "LockCont["
                r0.append(r1)
                java.lang.Object r1 = r2.f13662
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                Yue.ۥۣ۟ۨ۟<Yue.ۥۣۢ۠ۤ> r1 = r2.f13652
                r0.append(r1)
                java.lang.String r1 = "] for "
                r0.append(r1)
                Yue.ۥۡۡۧۨ r1 = r2.f13653
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.C4323.AbstractC4328
        /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
        public void mo16943() {
                r2 = this;
                Yue.ۥۣ۟ۨ۟<Yue.ۥۣۢ۠ۤ> r0 = r2.f13652
                Yue.ۥۢ۠ۦۢ r1 = Yue.C0935.f2703
                r0.mo5309(r1)
                return
        }

        @Override // Yue.C4323.AbstractC4328
        /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
        public boolean mo16944() {
                r5 = this;
                boolean r0 = r5.m16947()
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                Yue.ۥۣ۟ۨ۟<Yue.ۥۣۢ۠ۤ> r0 = r5.f13652
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                Yue.ۥۡۡۧۨ$ۥ$ۥ r3 = new Yue.ۥۡۡۧۨ$ۥ$ۥ
                Yue.ۥۡۡۧۨ r4 = r5.f13653
                r3.<init>(r4, r5)
                r4 = 0
                java.lang.Object r0 = r0.mo5306(r2, r4, r3)
                if (r0 == 0) goto L1b
                r1 = 1
            L1b:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ۟, reason: contains not printable characters */
    public final class C4326<R> extends Yue.C4323.AbstractC4328 {

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.InterfaceC5564<R> f13656;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.InterfaceC2839<Yue.InterfaceC4321, Yue.InterfaceC1598<? super R>, java.lang.Object> f13657;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4323 f13658;

        /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C4327 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Yue.C4323 f13659;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C4323.C4326<R> f13660;

            public C4327(Yue.C4323 r1, Yue.C4323.C4326<R> r2) {
                    r0 = this;
                    r0.f13659 = r1
                    r0.f13660 = r2
                    r1 = 1
                    r0.<init>(r1)
                    return
            }

            @Override // Yue.InterfaceC2825
            public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
                    r0 = this;
                    java.lang.Throwable r1 = (java.lang.Throwable) r1
                    r0.m16946(r1)
                    Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                    return r1
            }

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final void m16946(@Yue.InterfaceC4418 java.lang.Throwable r2) {
                    r1 = this;
                    Yue.ۥۡۡۧۨ r2 = r1.f13659
                    Yue.ۥۡۡۧۨ$ۥ۟<R> r0 = r1.f13660
                    java.lang.Object r0 = r0.f13662
                    r2.mo16933(r0)
                    return
            }
        }

        public C4326(@Yue.InterfaceC4543 Yue.C4323 r1, @Yue.InterfaceC4418 java.lang.Object r2, @Yue.InterfaceC4418 Yue.InterfaceC5564<? super R> r3, Yue.InterfaceC2839<? super Yue.InterfaceC4321, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r4) {
                r0 = this;
                r0.f13658 = r1
                r0.<init>(r1, r2)
                r0.f13656 = r3
                r0.f13657 = r4
                return
        }

        @Override // Yue.C3783
        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "LockSelect["
                r0.append(r1)
                java.lang.Object r1 = r2.f13662
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                Yue.ۥۡۨ<R> r1 = r2.f13656
                r0.append(r1)
                java.lang.String r1 = "] for "
                r0.append(r1)
                Yue.ۥۡۡۧۨ r1 = r2.f13658
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.C4323.AbstractC4328
        /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
        public void mo16943() {
                r5 = this;
                Yue.ۥۣ۠ۢۢ<Yue.ۥۡۡۧۧ, Yue.ۥ۟ۧۤۢ<? super R>, java.lang.Object> r0 = r5.f13657
                Yue.ۥۡۡۧۨ r1 = r5.f13658
                Yue.ۥۡۨ<R> r2 = r5.f13656
                Yue.ۥ۟ۧۤۢ r2 = r2.mo20846()
                Yue.ۥۡۡۧۨ$ۥ۟$ۥ r3 = new Yue.ۥۡۡۧۨ$ۥ۟$ۥ
                Yue.ۥۡۡۧۨ r4 = r5.f13658
                r3.<init>(r4, r5)
                Yue.C0941.m5357(r0, r1, r2, r3)
                return
        }

        @Override // Yue.C4323.AbstractC4328
        /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
        public boolean mo16944() {
                r1 = this;
                boolean r0 = r1.m16947()
                if (r0 == 0) goto L10
                Yue.ۥۡۨ<R> r0 = r1.f13656
                boolean r0 = r0.mo20844()
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ۟۟, reason: contains not printable characters */
    public abstract class AbstractC4328 extends Yue.C3783 implements Yue.InterfaceC1892 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f13661 = null;

        @Yue.InterfaceC4418
        private volatile /* synthetic */ int isTaken;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @Yue.InterfaceC3417
        @Yue.InterfaceC4543
        public final java.lang.Object f13662;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4323 f13663;

        static {
                java.lang.Class<Yue.ۥۡۡۧۨ$ۥ۟۟> r0 = Yue.C4323.AbstractC4328.class
                java.lang.String r1 = "isTaken"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
                Yue.C4323.AbstractC4328.f13661 = r0
                return
        }

        public AbstractC4328(@Yue.InterfaceC4543 Yue.C4323 r1, java.lang.Object r2) {
                r0 = this;
                r0.f13663 = r1
                r0.<init>()
                r0.f13662 = r2
                r1 = 0
                r0.isTaken = r1
                return
        }

        @Override // Yue.InterfaceC1892
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
        public final void mo352() {
                r0 = this;
                r0.mo15143()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
        public abstract void mo16943();

        /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
        public final boolean m16947() {
                r3 = this;
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.C4323.AbstractC4328.f13661
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r3, r1, r2)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
        public abstract boolean mo16944();
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C4329 extends Yue.C3781 {

        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public volatile java.lang.Object owner;

        public C4329(@Yue.InterfaceC4418 java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.owner = r1
                return
        }

        @Override // Yue.C3783
        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "LockedQueue["
                r0.append(r1)
                java.lang.Object r1 = r2.owner
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C4330 extends Yue.AbstractC0637 {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.C4323 f13664;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC3417
        @Yue.InterfaceC4543
        public final java.lang.Object f13665;

        /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ۟۟۟۟$ۥ, reason: contains not printable characters */
        public final class C4331 extends Yue.AbstractC4632 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            @Yue.InterfaceC4418
            public final Yue.AbstractC0641<?> f13666;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public final /* synthetic */ Yue.C4323.C4330 f13667;

            public C4331(@Yue.InterfaceC4418 Yue.C4323.C4330 r1, Yue.AbstractC0641<?> r2) {
                    r0 = this;
                    r0.f13667 = r1
                    r0.<init>()
                    r0.f13666 = r2
                    return
            }

            @Override // Yue.AbstractC4632
            @Yue.InterfaceC4418
            /* JADX INFO: renamed from: ۥ */
            public Yue.AbstractC0641<?> mo4202() {
                    r1 = this;
                    Yue.ۥ۟ۢ۠<?> r0 = r1.f13666
                    return r0
            }

            @Override // Yue.AbstractC4632
            @Yue.InterfaceC4543
            /* JADX INFO: renamed from: ۥ۟۟ */
            public java.lang.Object mo4203(@Yue.InterfaceC4543 java.lang.Object r3) {
                    r2 = this;
                    Yue.ۥ۟ۢ۠ r0 = r2.mo4202()
                    boolean r0 = r0.m4208()
                    if (r0 == 0) goto Lf
                    Yue.ۥ۠۠ۧۤ r0 = Yue.C4334.m16954()
                    goto L13
                Lf:
                    Yue.ۥ۟ۢ۠ r0 = r2.mo4202()
                L13:
                    if (r3 == 0) goto L1e
                    Yue.ۥۡۡۧۨ r3 = (Yue.C4323) r3
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C4323.f13651
                    Yue.C0084.m471(r1, r3, r2, r0)
                    r3 = 0
                    return r3
                L1e:
                    java.lang.NullPointerException r3 = new java.lang.NullPointerException
                    java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl"
                    r3.<init>(r0)
                    throw r3
            }
        }

        public C4330(@Yue.InterfaceC4418 Yue.C4323 r1, @Yue.InterfaceC4543 java.lang.Object r2) {
                r0 = this;
                r0.<init>()
                r0.f13664 = r1
                r0.f13665 = r2
                return
        }

        @Override // Yue.AbstractC0637
        /* JADX INFO: renamed from: ۥ */
        public void mo4180(@Yue.InterfaceC4418 Yue.AbstractC0641<?> r3, @Yue.InterfaceC4543 java.lang.Object r4) {
                r2 = this;
                if (r4 == 0) goto L7
                Yue.ۥ۠۠ۧۤ r4 = Yue.C4334.m16954()
                goto L16
            L7:
                java.lang.Object r4 = r2.f13665
                if (r4 != 0) goto L10
                Yue.ۥ۠۠ۧۤ r4 = Yue.C4334.m16953()
                goto L16
            L10:
                Yue.ۥ۠۠ۧۤ r0 = new Yue.ۥ۠۠ۧۤ
                r0.<init>(r4)
                r4 = r0
            L16:
                Yue.ۥۡۡۧۨ r0 = r2.f13664
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C4323.f13651
                Yue.C0084.m471(r1, r0, r3, r4)
                return
        }

        @Override // Yue.AbstractC0637
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟ */
        public java.lang.Object mo4182(@Yue.InterfaceC4418 Yue.AbstractC0641<?> r4) {
                r3 = this;
                Yue.ۥۡۡۧۨ$ۥ۟۟۟۟$ۥ r0 = new Yue.ۥۡۡۧۨ$ۥ۟۟۟۟$ۥ
                r0.<init>(r3, r4)
                Yue.ۥۡۡۧۨ r4 = r3.f13664
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C4323.f13651
                Yue.ۥ۠۠ۧۤ r2 = Yue.C4334.m16954()
                boolean r4 = Yue.C0084.m471(r1, r4, r2, r0)
                if (r4 != 0) goto L18
                Yue.ۥۢ۠ۦۢ r4 = Yue.C4334.m16956()
                return r4
            L18:
                Yue.ۥۡۡۧۨ r4 = r3.f13664
                java.lang.Object r4 = r0.mo4203(r4)
                return r4
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C4332 extends Yue.AbstractC0641<Yue.C4323> {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.C4323.C4329 f13668;

        public C4332(@Yue.InterfaceC4418 Yue.C4323.C4329 r1) {
                r0 = this;
                r0.<init>()
                r0.f13668 = r1
                return
        }

        @Override // Yue.AbstractC0641
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public /* bridge */ /* synthetic */ void mo4204(Yue.C4323 r1, java.lang.Object r2) {
                r0 = this;
                Yue.ۥۡۡۧۨ r1 = (Yue.C4323) r1
                r0.m16948(r1, r2)
                return
        }

        @Override // Yue.AbstractC0641
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public /* bridge */ /* synthetic */ java.lang.Object mo357(Yue.C4323 r1) {
                r0 = this;
                Yue.ۥۡۡۧۨ r1 = (Yue.C4323) r1
                java.lang.Object r1 = r0.m16949(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m16948(@Yue.InterfaceC4418 Yue.C4323 r2, @Yue.InterfaceC4543 java.lang.Object r3) {
                r1 = this;
                if (r3 != 0) goto L7
                Yue.ۥ۠۠ۧۤ r3 = Yue.C4334.m16954()
                goto L9
            L7:
                Yue.ۥۡۡۧۨ$ۥ۟۟۟ r3 = r1.f13668
            L9:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C4323.f13651
                Yue.C0084.m471(r0, r2, r1, r3)
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public java.lang.Object m16949(@Yue.InterfaceC4418 Yue.C4323 r1) {
                r0 = this;
                Yue.ۥۡۡۧۨ$ۥ۟۟۟ r1 = r0.f13668
                boolean r1 = r1.m15145()
                if (r1 == 0) goto La
                r1 = 0
                goto Le
            La:
                Yue.ۥۢ۠ۦۢ r1 = Yue.C4334.m16958()
            Le:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C4333 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4323 f13669;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ java.lang.Object f13670;

        public C4333(Yue.C4323 r1, java.lang.Object r2) {
                r0 = this;
                r0.f13669 = r1
                r0.f13670 = r2
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.m16950(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m16950(@Yue.InterfaceC4418 java.lang.Throwable r2) {
                r1 = this;
                Yue.ۥۡۡۧۨ r2 = r1.f13669
                java.lang.Object r0 = r1.f13670
                r2.mo16933(r0)
                return
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state"
            java.lang.Class<Yue.ۥۡۡۧۨ> r2 = Yue.C4323.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            Yue.C4323.f13651 = r0
            return
    }

    public C4323(boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            Yue.ۥ۠۠ۧۤ r1 = Yue.C4334.m16953()
            goto Le
        La:
            Yue.ۥ۠۠ۧۤ r1 = Yue.C4334.m16954()
        Le:
            r0._state = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object m16940(Yue.C4323 r0, java.lang.Object r1, Yue.InterfaceC1598 r2) {
            java.lang.Object r0 = r0.m16942(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof Yue.C2139
            r2 = 93
            java.lang.String r3 = "Mutex["
            if (r1 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            Yue.ۥ۠۠ۧۤ r0 = (Yue.C2139) r0
            java.lang.Object r0 = r0.f6726
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
        L21:
            boolean r1 = r0 instanceof Yue.AbstractC4632
            if (r1 == 0) goto L2b
            Yue.ۥۣۣۡۡ r0 = (Yue.AbstractC4632) r0
            r0.mo4203(r4)
            goto L0
        L2b:
            boolean r1 = r0 instanceof Yue.C4323.C4329
            if (r1 == 0) goto L46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            Yue.ۥۡۡۧۨ$ۥ۟۟۟ r0 = (Yue.C4323.C4329) r0
            java.lang.Object r0 = r0.owner
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Illegal state "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // Yue.InterfaceC4321
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ */
    public java.lang.Object mo16930(@Yue.InterfaceC4543 java.lang.Object r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r3) {
            r1 = this;
            boolean r0 = r1.mo16931(r2)
            if (r0 == 0) goto L9
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
            return r2
        L9:
            java.lang.Object r2 = r1.m16942(r2, r3)
            java.lang.Object r3 = Yue.C3341.m13947()
            if (r2 != r3) goto L14
            return r2
        L14:
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
            return r2
    }

    @Override // Yue.InterfaceC4321
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo16931(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof Yue.C2139
            r2 = 0
            if (r1 == 0) goto L29
            r1 = r0
            Yue.ۥ۠۠ۧۤ r1 = (Yue.C2139) r1
            java.lang.Object r1 = r1.f6726
            Yue.ۥۢ۠ۦۢ r3 = Yue.C4334.m16957()
            if (r1 == r3) goto L13
            return r2
        L13:
            if (r5 != 0) goto L1a
            Yue.ۥ۠۠ۧۤ r1 = Yue.C4334.m16953()
            goto L1f
        L1a:
            Yue.ۥ۠۠ۧۤ r1 = new Yue.ۥ۠۠ۧۤ
            r1.<init>(r5)
        L1f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Yue.C4323.f13651
            boolean r0 = Yue.C0084.m471(r2, r4, r0, r1)
            if (r0 == 0) goto L0
            r5 = 1
            return r5
        L29:
            boolean r1 = r0 instanceof Yue.C4323.C4329
            if (r1 == 0) goto L4f
            Yue.ۥۡۡۧۨ$ۥ۟۟۟ r0 = (Yue.C4323.C4329) r0
            java.lang.Object r0 = r0.owner
            if (r0 == r5) goto L34
            return r2
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Already locked by "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L4f:
            boolean r1 = r0 instanceof Yue.AbstractC4632
            if (r1 == 0) goto L59
            Yue.ۥۣۣۡۡ r0 = (Yue.AbstractC4632) r0
            r0.mo4203(r4)
            goto L0
        L59:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal state "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    @Override // Yue.InterfaceC4321
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo16932() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof Yue.C2139
            r2 = 1
            if (r1 == 0) goto L14
            Yue.ۥ۠۠ۧۤ r0 = (Yue.C2139) r0
            java.lang.Object r0 = r0.f6726
            Yue.ۥۢ۠ۦۢ r1 = Yue.C4334.m16957()
            if (r0 == r1) goto L12
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
        L14:
            boolean r1 = r0 instanceof Yue.C4323.C4329
            if (r1 == 0) goto L19
            return r2
        L19:
            boolean r1 = r0 instanceof Yue.AbstractC4632
            if (r1 == 0) goto L23
            Yue.ۥۣۣۡۡ r0 = (Yue.AbstractC4632) r0
            r0.mo4203(r4)
            goto L0
        L23:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Illegal state "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // Yue.InterfaceC4321
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo16933(@Yue.InterfaceC4543 java.lang.Object r6) {
            r5 = this;
        L0:
            java.lang.Object r0 = r5._state
            boolean r1 = r0 instanceof Yue.C2139
            java.lang.String r2 = " but expected "
            java.lang.String r3 = "Mutex is locked by "
            if (r1 == 0) goto L59
            if (r6 != 0) goto L24
            r1 = r0
            Yue.ۥ۠۠ۧۤ r1 = (Yue.C2139) r1
            java.lang.Object r1 = r1.f6726
            Yue.ۥۢ۠ۦۢ r2 = Yue.C4334.m16957()
            if (r1 == r2) goto L18
            goto L2b
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Mutex is not locked"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L24:
            r1 = r0
            Yue.ۥ۠۠ۧۤ r1 = (Yue.C2139) r1
            java.lang.Object r4 = r1.f6726
            if (r4 != r6) goto L38
        L2b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C4323.f13651
            Yue.ۥ۠۠ۧۤ r2 = Yue.C4334.m16954()
            boolean r0 = Yue.C0084.m471(r1, r5, r0, r2)
            if (r0 == 0) goto L0
            return
        L38:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.Object r1 = r1.f6726
            r0.append(r1)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L59:
            boolean r1 = r0 instanceof Yue.AbstractC4632
            if (r1 == 0) goto L63
            Yue.ۥۣۣۡۡ r0 = (Yue.AbstractC4632) r0
            r0.mo4203(r5)
            goto L0
        L63:
            boolean r1 = r0 instanceof Yue.C4323.C4329
            if (r1 == 0) goto Lc5
            if (r6 == 0) goto L92
            r1 = r0
            Yue.ۥۡۡۧۨ$ۥ۟۟۟ r1 = (Yue.C4323.C4329) r1
            java.lang.Object r4 = r1.owner
            if (r4 != r6) goto L71
            goto L92
        L71:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.Object r1 = r1.owner
            r0.append(r1)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L92:
            r1 = r0
            Yue.ۥۡۡۧۨ$ۥ۟۟۟ r1 = (Yue.C4323.C4329) r1
            Yue.ۥ۠ۨ۠ۥ r2 = r1.m15177()
            if (r2 != 0) goto Laf
            Yue.ۥۡۡۧۨ$ۥ۟۟۟۠ r2 = new Yue.ۥۡۡۧۨ$ۥ۟۟۟۠
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C4323.f13651
            boolean r0 = Yue.C0084.m471(r1, r5, r0, r2)
            if (r0 == 0) goto L0
            java.lang.Object r0 = r2.mo4203(r5)
            if (r0 != 0) goto L0
            return
        Laf:
            Yue.ۥۡۡۧۨ$ۥ۟۟ r2 = (Yue.C4323.AbstractC4328) r2
            boolean r0 = r2.mo16944()
            if (r0 == 0) goto L0
            java.lang.Object r6 = r2.f13662
            if (r6 != 0) goto Lbf
            Yue.ۥۢ۠ۦۢ r6 = Yue.C4334.m16955()
        Lbf:
            r1.owner = r6
            r2.mo16943()
            return
        Lc5:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal state "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    @Override // Yue.InterfaceC4321
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo16934(@Yue.InterfaceC4418 java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof Yue.C2139
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L11
            Yue.ۥ۠۠ۧۤ r0 = (Yue.C2139) r0
            java.lang.Object r0 = r0.f6726
            if (r0 != r5) goto Lf
            goto L1b
        Lf:
            r2 = r3
            goto L1b
        L11:
            boolean r1 = r0 instanceof Yue.C4323.C4329
            if (r1 == 0) goto Lf
            Yue.ۥۡۡۧۨ$ۥ۟۟۟ r0 = (Yue.C4323.C4329) r0
            java.lang.Object r0 = r0.owner
            if (r0 != r5) goto Lf
        L1b:
            return r2
    }

    @Override // Yue.InterfaceC4321
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public Yue.InterfaceC5563<java.lang.Object, Yue.InterfaceC4321> mo16935() {
            r0 = this;
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m16941() {
            r2 = this;
            java.lang.Object r0 = r2._state
            boolean r1 = r0 instanceof Yue.C4323.C4329
            if (r1 == 0) goto L10
            Yue.ۥۡۡۧۨ$ۥ۟۟۟ r0 = (Yue.C4323.C4329) r0
            boolean r0 = r0.m15145()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final java.lang.Object m16942(java.lang.Object r7, Yue.InterfaceC1598<? super Yue.C6593> r8) {
            r6 = this;
            Yue.ۥ۟ۧۤۢ r0 = Yue.C3332.m13940(r8)
            Yue.ۥۣ۟ۨ۠ r0 = Yue.C0936.m5346(r0)
            Yue.ۥۡۡۧۨ$ۥ r1 = new Yue.ۥۡۡۧۨ$ۥ
            r1.<init>(r6, r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof Yue.C2139
            if (r3 == 0) goto L4a
            r3 = r2
            Yue.ۥ۠۠ۧۤ r3 = (Yue.C2139) r3
            java.lang.Object r4 = r3.f6726
            Yue.ۥۢ۠ۦۢ r5 = Yue.C4334.m16957()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = Yue.C4323.f13651
            Yue.ۥۡۡۧۨ$ۥ۟۟۟ r5 = new Yue.ۥۡۡۧۨ$ۥ۟۟۟
            java.lang.Object r3 = r3.f6726
            r5.<init>(r3)
            Yue.C0084.m471(r4, r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            Yue.ۥ۠۠ۧۤ r3 = Yue.C4334.m16953()
            goto L37
        L32:
            Yue.ۥ۠۠ۧۤ r3 = new Yue.ۥ۠۠ۧۤ
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = Yue.C4323.f13651
            boolean r2 = Yue.C0084.m471(r4, r6, r2, r3)
            if (r2 == 0) goto Ld
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            Yue.ۥۡۡۧۨ$ۥ۟۟۟ۡ r2 = new Yue.ۥۡۡۧۨ$ۥ۟۟۟ۡ
            r2.<init>(r6, r7)
            r0.mo5301(r1, r2)
            goto L6c
        L4a:
            boolean r3 = r2 instanceof Yue.C4323.C4329
            if (r3 == 0) goto L9e
            r3 = r2
            Yue.ۥۡۡۧۨ$ۥ۟۟۟ r3 = (Yue.C4323.C4329) r3
            java.lang.Object r4 = r3.owner
            if (r4 == r7) goto L83
            r3.m15159(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L69
            boolean r2 = r1.m16947()
            if (r2 != 0) goto L63
            goto L69
        L63:
            Yue.ۥۡۡۧۨ$ۥ r1 = new Yue.ۥۡۡۧۨ$ۥ
            r1.<init>(r6, r7, r0)
            goto Ld
        L69:
            Yue.C0936.m5347(r0, r1)
        L6c:
            java.lang.Object r7 = r0.m5329()
            java.lang.Object r0 = Yue.C3341.m13947()
            if (r7 != r0) goto L79
            Yue.C1757.m8349(r8)
        L79:
            java.lang.Object r8 = Yue.C3341.m13947()
            if (r7 != r8) goto L80
            return r7
        L80:
            Yue.ۥۣۢ۠ۤ r7 = Yue.C6593.f23016
            return r7
        L83:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Already locked by "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L9e:
            boolean r3 = r2 instanceof Yue.AbstractC4632
            if (r3 == 0) goto La9
            Yue.ۥۣۣۡۡ r2 = (Yue.AbstractC4632) r2
            r2.mo4203(r6)
            goto Ld
        La9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Illegal state "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    @Override // Yue.InterfaceC5563
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public <R> void mo512(@Yue.InterfaceC4418 Yue.InterfaceC5564<? super R> r5, @Yue.InterfaceC4543 java.lang.Object r6, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC4321, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r7) {
            r4 = this;
        L0:
            boolean r0 = r5.mo20845()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof Yue.C2139
            if (r1 == 0) goto L65
            r1 = r0
            Yue.ۥ۠۠ۧۤ r1 = (Yue.C2139) r1
            java.lang.Object r2 = r1.f6726
            Yue.ۥۢ۠ۦۢ r3 = Yue.C4334.m16957()
            if (r2 == r3) goto L25
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Yue.C4323.f13651
            Yue.ۥۡۡۧۨ$ۥ۟۟۟ r3 = new Yue.ۥۡۡۧۨ$ۥ۟۟۟
            java.lang.Object r1 = r1.f6726
            r3.<init>(r1)
            Yue.C0084.m471(r2, r4, r0, r3)
            goto L0
        L25:
            Yue.ۥۡۡۧۨ$ۥ۟۟۟۟ r0 = new Yue.ۥۡۡۧۨ$ۥ۟۟۟۟
            r0.<init>(r4, r6)
            java.lang.Object r0 = r5.mo20843(r0)
            if (r0 != 0) goto L38
            Yue.ۥ۟ۧۤۢ r5 = r5.mo20846()
            Yue.C6589.m25378(r7, r4, r5)
            return
        L38:
            java.lang.Object r1 = Yue.C5566.m20861()
            if (r0 != r1) goto L3f
            return
        L3f:
            Yue.ۥۢ۠ۦۢ r1 = Yue.C4334.m16956()
            if (r0 == r1) goto L0
            java.lang.Object r1 = Yue.C0640.f1626
            if (r0 != r1) goto L4a
            goto L0
        L4a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "performAtomicTrySelect(TryLockDesc) returned "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L65:
            boolean r1 = r0 instanceof Yue.C4323.C4329
            if (r1 == 0) goto La1
            r1 = r0
            Yue.ۥۡۡۧۨ$ۥ۟۟۟ r1 = (Yue.C4323.C4329) r1
            java.lang.Object r2 = r1.owner
            if (r2 == r6) goto L86
            Yue.ۥۡۡۧۨ$ۥ۟ r2 = new Yue.ۥۡۡۧۨ$ۥ۟
            r2.<init>(r4, r6, r5, r7)
            r1.m15159(r2)
            java.lang.Object r1 = r4._state
            if (r1 == r0) goto L82
            boolean r0 = r2.m16947()
            if (r0 != 0) goto L0
        L82:
            r5.mo20848(r2)
            return
        L86:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Already locked by "
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        La1:
            boolean r1 = r0 instanceof Yue.AbstractC4632
            if (r1 == 0) goto Lac
            Yue.ۥۣۣۡۡ r0 = (Yue.AbstractC4632) r0
            r0.mo4203(r4)
            goto L0
        Lac:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Illegal state "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }
}
