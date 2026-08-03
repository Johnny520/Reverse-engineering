package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4556
public final class C1470<E> implements Yue.InterfaceC0830<E> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1470.C1472 f4608 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f4609 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f4610 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f4611 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @java.lang.Deprecated
    public static final Yue.C1470.C1471 f4612 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @java.lang.Deprecated
    public static final Yue.C6075 f4613 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @java.lang.Deprecated
    public static final Yue.C1470.C1473<java.lang.Object> f4614 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object _state;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int _updating;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object onCloseHandler;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۡ$ۥ, reason: contains not printable characters */
    public static final class C1471 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC3417
        @Yue.InterfaceC4543
        public final java.lang.Throwable f4615;

        public C1471(@Yue.InterfaceC4543 java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.f4615 = r1
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.Throwable m7214() {
                r2 = this;
                java.lang.Throwable r0 = r2.f4615
                if (r0 != 0) goto Lb
                Yue.ۥ۟ۥۣ۟ r0 = new Yue.ۥ۟ۥۣ۟
                java.lang.String r1 = "Channel was closed"
                r0.<init>(r1)
            Lb:
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.lang.Throwable m7215() {
                r2 = this;
                java.lang.Throwable r0 = r2.f4615
                if (r0 != 0) goto Lb
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Channel was closed"
                r0.<init>(r1)
            Lb:
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۡ$ۥ۟, reason: contains not printable characters */
    public static final class C1472 {
        public C1472() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C1472(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۡ$ۥ۟۟, reason: contains not printable characters */
    public static final class C1473<E> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC3417
        @Yue.InterfaceC4543
        public final java.lang.Object f4616;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC3417
        @Yue.InterfaceC4543
        public final Yue.C1470.C1474<E>[] f4617;

        public C1473(@Yue.InterfaceC4543 java.lang.Object r1, @Yue.InterfaceC4543 Yue.C1470.C1474<E>[] r2) {
                r0 = this;
                r0.<init>()
                r0.f4616 = r1
                r0.f4617 = r2
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۡ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C1474<E> extends Yue.C1476<E> implements Yue.InterfaceC5242<E> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.C1470<E> f4618;

        public C1474(@Yue.InterfaceC4418 Yue.C1470<E> r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f4618 = r2
                return
        }

        @Override // Yue.C1476, Yue.AbstractC0085
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
        public java.lang.Object mo497(E r1) {
                r0 = this;
                java.lang.Object r1 = super.mo497(r1)
                return r1
        }

        @Override // Yue.C1476, Yue.AbstractC0028
        /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
        public void mo330(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L7
                Yue.ۥ۟ۦۧۡ<E> r1 = r0.f4618
                Yue.C1470.m7203(r1, r0)
            L7:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۡ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C1475 implements Yue.InterfaceC5563<E, Yue.InterfaceC5599<? super E>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1470<E> f4619;

        public C1475(Yue.C1470<E> r1) {
                r0 = this;
                r0.f4619 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC5563
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
        public <R> void mo512(@Yue.InterfaceC4418 Yue.InterfaceC5564<? super R> r2, E r3, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC5599<? super E>, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r4) {
                r1 = this;
                Yue.ۥ۟ۦۧۡ<E> r0 = r1.f4619
                Yue.C1470.m7204(r0, r2, r3, r4)
                return
        }
    }

    static {
            Yue.ۥ۟ۦۧۡ$ۥ۟ r0 = new Yue.ۥ۟ۦۧۡ$ۥ۟
            r1 = 0
            r0.<init>(r1)
            Yue.C1470.f4608 = r0
            Yue.ۥ۟ۦۧۡ$ۥ r0 = new Yue.ۥ۟ۦۧۡ$ۥ
            r0.<init>(r1)
            Yue.C1470.f4612 = r0
            Yue.ۥۢ۠ۦۢ r0 = new Yue.ۥۢ۠ۦۢ
            java.lang.String r2 = "UNDEFINED"
            r0.<init>(r2)
            Yue.C1470.f4613 = r0
            Yue.ۥ۟ۦۧۡ$ۥ۟۟ r2 = new Yue.ۥ۟ۦۧۡ$ۥ۟۟
            r2.<init>(r0, r1)
            Yue.C1470.f4614 = r2
            java.lang.String r0 = "_state"
            java.lang.Class<Yue.ۥ۟ۦۧۡ> r1 = Yue.C1470.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            Yue.C1470.f4609 = r0
            java.lang.String r0 = "_updating"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            Yue.C1470.f4610 = r0
            java.lang.String r0 = "onCloseHandler"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            Yue.C1470.f4611 = r0
            return
    }

    public C1470() {
            r1 = this;
            r1.<init>()
            Yue.ۥ۟ۦۧۡ$ۥ۟۟<java.lang.Object> r0 = Yue.C1470.f4614
            r1._state = r0
            r0 = 0
            r1._updating = r0
            r0 = 0
            r1.onCloseHandler = r0
            return
    }

    public C1470(E r4) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C1470.f4609
            Yue.ۥ۟ۦۧۡ$ۥ۟۟ r1 = new Yue.ۥ۟ۦۧۡ$ۥ۟۟
            r2 = 0
            r1.<init>(r4, r2)
            r0.lazySet(r3, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ void m7203(Yue.C1470 r0, Yue.C1470.C1474 r1) {
            r0.m7209(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ void m7204(Yue.C1470 r0, Yue.InterfaceC5564 r1, java.lang.Object r2, Yue.InterfaceC2839 r3) {
            r0.m7207(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ void m7205() {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    private final void m7206(java.lang.Throwable r4) {
            r3 = this;
            java.lang.Object r0 = r3.onCloseHandler
            if (r0 == 0) goto L1a
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f99
            if (r0 == r1) goto L1a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Yue.C1470.f4611
            boolean r1 = Yue.C0084.m471(r2, r3, r0, r1)
            if (r1 == 0) goto L1a
            r1 = 1
            java.lang.Object r0 = Yue.C6466.m23830(r0, r1)
            Yue.ۥۣ۠ۡ۟ r0 = (Yue.InterfaceC2825) r0
            r0.invoke(r4)
        L1a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    private final <R> void m7207(Yue.InterfaceC5564<? super R> r2, E r3, Yue.InterfaceC2839<? super Yue.InterfaceC5599<? super E>, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r4) {
            r1 = this;
            boolean r0 = r2.mo20844()
            if (r0 != 0) goto L7
            return
        L7:
            Yue.ۥ۟ۦۧۡ$ۥ r3 = r1.m7212(r3)
            if (r3 == 0) goto L15
            java.lang.Throwable r3 = r3.m7214()
            r2.mo20847(r3)
            return
        L15:
            Yue.ۥ۟ۧۤۢ r2 = r2.mo20846()
            Yue.C6589.m25378(r4, r1, r2)
            return
    }

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in the favour of 'trySend' method", replaceWith = @Yue.InterfaceC5313(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r1) {
            r0 = this;
            boolean r1 = Yue.InterfaceC0830.C0831.m4785(r0, r1)
            return r1
    }

    @Override // Yue.InterfaceC0830
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: ۥ۟۟ */
    public /* synthetic */ boolean mo1960(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.mo492(r1)
            return r1
    }

    @Override // Yue.InterfaceC0830
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo1961(@Yue.InterfaceC4543 java.util.concurrent.CancellationException r1) {
            r0 = this;
            r0.mo492(r1)
            return
    }

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public java.lang.Object mo476(E r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2) {
            r0 = this;
            Yue.ۥ۟ۦۧۡ$ۥ r1 = r0.m7212(r1)
            if (r1 != 0) goto L11
            java.lang.Object r1 = Yue.C3341.m13947()
            if (r1 != 0) goto Le
            r1 = 0
            return r1
        Le:
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            return r1
        L11:
            java.lang.Throwable r1 = r1.m7214()
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Yue.C1470.C1474<E>[] m7208(Yue.C1470.C1474<E>[] r1, Yue.C1470.C1474<E> r2) {
            r0 = this;
            if (r1 != 0) goto L7
            Yue.ۥ۟ۦۧۡ$ۥ۟۟۟[] r1 = new Yue.C1470.C1474[]{r2}
            return r1
        L7:
            java.lang.Object[] r1 = Yue.C0586.m2327(r1, r2)
            Yue.ۥ۟ۦۧۡ$ۥ۟۟۟[] r1 = (Yue.C1470.C1474[]) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m7209(Yue.C1470.C1474<E> r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof Yue.C1470.C1471
            if (r1 == 0) goto L7
            return
        L7:
            boolean r1 = r0 instanceof Yue.C1470.C1473
            if (r1 == 0) goto L27
            Yue.ۥ۟ۦۧۡ$ۥ۟۟ r1 = new Yue.ۥ۟ۦۧۡ$ۥ۟۟
            r2 = r0
            Yue.ۥ۟ۦۧۡ$ۥ۟۟ r2 = (Yue.C1470.C1473) r2
            java.lang.Object r3 = r2.f4616
            Yue.ۥ۟ۦۧۡ$ۥ۟۟۟<E>[] r2 = r2.f4617
            Yue.C3329.m13903(r2)
            Yue.ۥ۟ۦۧۡ$ۥ۟۟۟[] r2 = r4.m7213(r2, r5)
            r1.<init>(r3, r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Yue.C1470.f4609
            boolean r0 = Yue.C0084.m471(r2, r4, r0, r1)
            if (r0 == 0) goto L0
            return
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid state "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final E m7210() {
            r4 = this;
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof Yue.C1470.C1471
            if (r1 != 0) goto L36
            boolean r1 = r0 instanceof Yue.C1470.C1473
            if (r1 == 0) goto L1b
            Yue.ۥ۟ۦۧۡ$ۥ۟۟ r0 = (Yue.C1470.C1473) r0
            java.lang.Object r0 = r0.f4616
            Yue.ۥۢ۠ۦۢ r1 = Yue.C1470.f4613
            if (r0 == r1) goto L13
            return r0
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No value"
            r0.<init>(r1)
            throw r0
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid state "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L36:
            Yue.ۥ۟ۦۧۡ$ۥ r0 = (Yue.C1470.C1471) r0
            java.lang.Throwable r0 = r0.m7215()
            throw r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final E m7211() {
            r4 = this;
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof Yue.C1470.C1471
            r2 = 0
            if (r1 == 0) goto L8
            goto L16
        L8:
            boolean r1 = r0 instanceof Yue.C1470.C1473
            if (r1 == 0) goto L17
            Yue.ۥۢ۠ۦۢ r1 = Yue.C1470.f4613
            Yue.ۥ۟ۦۧۡ$ۥ۟۟ r0 = (Yue.C1470.C1473) r0
            java.lang.Object r0 = r0.f4616
            if (r0 != r1) goto L15
            goto L16
        L15:
            r2 = r0
        L16:
            return r2
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid state "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final Yue.C1470.C1471 m7212(E r7) {
            r6 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.C1470.f4610
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r6, r2, r1)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.lang.Object r0 = r6._state     // Catch: java.lang.Throwable -> L17
            boolean r3 = r0 instanceof Yue.C1470.C1471     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L19
            Yue.ۥ۟ۦۧۡ$ۥ r0 = (Yue.C1470.C1471) r0     // Catch: java.lang.Throwable -> L17
            r6._updating = r2
            return r0
        L17:
            r7 = move-exception
            goto L5f
        L19:
            boolean r3 = r0 instanceof Yue.C1470.C1473     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L44
            Yue.ۥ۟ۦۧۡ$ۥ۟۟ r3 = new Yue.ۥ۟ۦۧۡ$ۥ۟۟     // Catch: java.lang.Throwable -> L17
            r4 = r0
            Yue.ۥ۟ۦۧۡ$ۥ۟۟ r4 = (Yue.C1470.C1473) r4     // Catch: java.lang.Throwable -> L17
            Yue.ۥ۟ۦۧۡ$ۥ۟۟۟<E>[] r4 = r4.f4617     // Catch: java.lang.Throwable -> L17
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = Yue.C1470.f4609     // Catch: java.lang.Throwable -> L17
            boolean r3 = Yue.C0084.m471(r4, r6, r0, r3)     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto Lc
            Yue.ۥ۟ۦۧۡ$ۥ۟۟ r0 = (Yue.C1470.C1473) r0     // Catch: java.lang.Throwable -> L17
            Yue.ۥ۟ۦۧۡ$ۥ۟۟۟<E>[] r0 = r0.f4617     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L41
            int r3 = r0.length     // Catch: java.lang.Throwable -> L17
            r4 = r2
        L37:
            if (r4 >= r3) goto L41
            r5 = r0[r4]     // Catch: java.lang.Throwable -> L17
            r5.mo497(r7)     // Catch: java.lang.Throwable -> L17
            int r4 = r4 + 1
            goto L37
        L41:
            r6._updating = r2
            return r1
        L44:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = "Invalid state "
            r1.append(r3)     // Catch: java.lang.Throwable -> L17
            r1.append(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L17
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L17
            throw r7     // Catch: java.lang.Throwable -> L17
        L5f:
            r6._updating = r2
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final Yue.C1470.C1474<E>[] m7213(Yue.C1470.C1474<E>[] r9, Yue.C1470.C1474<E> r10) {
            r8 = this;
            int r0 = r9.length
            int r10 = Yue.C0595.m2995(r9, r10)
            r1 = 1
            if (r0 != r1) goto La
            r9 = 0
            return r9
        La:
            int r0 = r0 - r1
            Yue.ۥ۟ۦۧۡ$ۥ۟۟۟[] r0 = new Yue.C1470.C1474[r0]
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            r1 = r9
            r2 = r0
            r5 = r10
            Yue.C0586.m2185(r1, r2, r3, r4, r5, r6, r7)
            int r4 = r10 + 1
            r6 = 8
            r5 = 0
            r3 = r10
            Yue.C0586.m2185(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public Yue.InterfaceC5563<E, Yue.InterfaceC5599<E>> mo488() {
            r1 = this;
            Yue.ۥ۟ۦۧۡ$ۥ۟۟۟۟ r0 = new Yue.ۥ۟ۦۧۡ$ۥ۟۟۟۟
            r0.<init>(r1)
            return r0
    }

    @Override // Yue.InterfaceC5599
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo492(@Yue.InterfaceC4543 java.lang.Throwable r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof Yue.C1470.C1471
            r2 = 0
            if (r1 == 0) goto L8
            return r2
        L8:
            boolean r1 = r0 instanceof Yue.C1470.C1473
            if (r1 == 0) goto L34
            if (r5 != 0) goto L11
            Yue.ۥ۟ۦۧۡ$ۥ r1 = Yue.C1470.f4612
            goto L16
        L11:
            Yue.ۥ۟ۦۧۡ$ۥ r1 = new Yue.ۥ۟ۦۧۡ$ۥ
            r1.<init>(r5)
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = Yue.C1470.f4609
            boolean r1 = Yue.C0084.m471(r3, r4, r0, r1)
            if (r1 == 0) goto L0
            Yue.ۥ۟ۦۧۡ$ۥ۟۟ r0 = (Yue.C1470.C1473) r0
            Yue.ۥ۟ۦۧۡ$ۥ۟۟۟<E>[] r0 = r0.f4617
            if (r0 == 0) goto L2f
            int r1 = r0.length
        L25:
            if (r2 >= r1) goto L2f
            r3 = r0[r2]
            r3.mo492(r5)
            int r2 = r2 + 1
            goto L25
        L2f:
            r4.m7206(r5)
            r5 = 1
            return r5
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid state "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    @Override // Yue.InterfaceC0830
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public Yue.InterfaceC5242<E> mo1962() {
            r5 = this;
            Yue.ۥ۟ۦۧۡ$ۥ۟۟۟ r0 = new Yue.ۥ۟ۦۧۡ$ۥ۟۟۟
            r0.<init>(r5)
        L5:
            java.lang.Object r1 = r5._state
            boolean r2 = r1 instanceof Yue.C1470.C1471
            if (r2 == 0) goto L13
            Yue.ۥ۟ۦۧۡ$ۥ r1 = (Yue.C1470.C1471) r1
            java.lang.Throwable r1 = r1.f4615
            r0.mo492(r1)
            return r0
        L13:
            boolean r2 = r1 instanceof Yue.C1470.C1473
            if (r2 == 0) goto L39
            r2 = r1
            Yue.ۥ۟ۦۧۡ$ۥ۟۟ r2 = (Yue.C1470.C1473) r2
            java.lang.Object r3 = r2.f4616
            Yue.ۥۢ۠ۦۢ r4 = Yue.C1470.f4613
            if (r3 == r4) goto L23
            r0.mo497(r3)
        L23:
            Yue.ۥ۟ۦۧۡ$ۥ۟۟ r3 = new Yue.ۥ۟ۦۧۡ$ۥ۟۟
            java.lang.Object r4 = r2.f4616
            Yue.ۥ۟ۦۧۡ$ۥ۟۟۟<E>[] r2 = r2.f4617
            Yue.ۥ۟ۦۧۡ$ۥ۟۟۟[] r2 = r5.m7208(r2, r0)
            r3.<init>(r4, r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Yue.C1470.f4609
            boolean r1 = Yue.C0084.m471(r2, r5, r1, r3)
            if (r1 == 0) goto L5
            return r0
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid state "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public java.lang.Object mo495(E r2) {
            r1 = this;
            Yue.ۥ۟ۦۧۡ$ۥ r2 = r1.m7212(r2)
            if (r2 == 0) goto L11
            Yue.ۥ۟ۤۢ۟$ۥ۟ r0 = Yue.C1024.f2933
            java.lang.Throwable r2 = r2.m7214()
            java.lang.Object r2 = r0.m5575(r2)
            return r2
        L11:
            Yue.ۥ۟ۤۢ۟$ۥ۟ r2 = Yue.C1024.f2933
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
            java.lang.Object r2 = r2.m5577(r0)
            return r2
    }

    @Override // Yue.InterfaceC5599
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public void mo498(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C1470.f4611
            r1 = 0
            boolean r1 = Yue.C0084.m471(r0, r3, r1, r4)
            if (r1 != 0) goto L2e
            java.lang.Object r4 = r3.onCloseHandler
            Yue.ۥۢ۠ۦۢ r0 = Yue.C0040.f99
            if (r4 != r0) goto L17
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Another handler was already registered and successfully invoked"
            r4.<init>(r0)
            throw r4
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Another handler was already registered: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L2e:
            java.lang.Object r1 = r3._state
            boolean r2 = r1 instanceof Yue.C1470.C1471
            if (r2 == 0) goto L43
            Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f99
            boolean r0 = Yue.C0084.m471(r0, r3, r4, r2)
            if (r0 == 0) goto L43
            Yue.ۥ۟ۦۧۡ$ۥ r1 = (Yue.C1470.C1471) r1
            java.lang.Throwable r0 = r1.f4615
            r4.invoke(r0)
        L43:
            return
    }

    @Override // Yue.InterfaceC5599
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public boolean mo499() {
            r1 = this;
            java.lang.Object r0 = r1._state
            boolean r0 = r0 instanceof Yue.C1470.C1471
            return r0
    }
}
