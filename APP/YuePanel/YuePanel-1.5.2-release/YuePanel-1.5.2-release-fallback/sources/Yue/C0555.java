package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0555<E> extends Yue.AbstractC0085<E> implements Yue.InterfaceC0830<E> {

    @Yue.InterfaceC4418
    private volatile /* synthetic */ long _head;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int _size;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ long _tail;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f1445;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.locks.ReentrantLock f1446;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Object[] f1447;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<Yue.C0555.C0556<E>> f1448;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۦۨ$ۥ, reason: contains not printable characters */
    public static final class C0556<E> extends Yue.AbstractC0028<E> implements Yue.InterfaceC5242<E> {

        @Yue.InterfaceC4418
        private volatile /* synthetic */ long _subHead;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.C0555<E> f1449;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.concurrent.locks.ReentrantLock f1450;

        public C0556(@Yue.InterfaceC4418 Yue.C0555<E> r3) {
                r2 = this;
                r0 = 0
                r2.<init>(r0)
                r2.f1449 = r3
                java.util.concurrent.locks.ReentrantLock r3 = new java.util.concurrent.locks.ReentrantLock
                r3.<init>()
                r2.f1450 = r3
                r0 = 0
                r2._subHead = r0
                return
        }

        @Override // Yue.AbstractC0085, Yue.InterfaceC5599
        /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
        public boolean mo492(@Yue.InterfaceC4543 java.lang.Throwable r4) {
                r3 = this;
                boolean r4 = super.mo492(r4)
                if (r4 == 0) goto L26
                Yue.ۥ۟ۡۦۨ<E> r0 = r3.f1449
                r1 = 1
                r2 = 0
                Yue.C0555.m1959(r0, r2, r3, r1, r2)
                java.util.concurrent.locks.ReentrantLock r0 = r3.f1450
                r0.lock()
                Yue.ۥ۟ۡۦۨ<E> r1 = r3.f1449     // Catch: java.lang.Throwable -> L21
                long r1 = Yue.C0555.m1956(r1)     // Catch: java.lang.Throwable -> L21
                r3.m1978(r1)     // Catch: java.lang.Throwable -> L21
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L21
                r0.unlock()
                goto L26
            L21:
                r4 = move-exception
                r0.unlock()
                throw r4
            L26:
                return r4
        }

        @Override // Yue.AbstractC0085
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
        public boolean mo493() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Should not be used"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // Yue.AbstractC0085
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
        public boolean mo494() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Should not be used"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // Yue.AbstractC0028
        /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
        public boolean mo327() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // Yue.AbstractC0028
        /* JADX INFO: renamed from: ۥ۟۟ۤ */
        public boolean mo328() {
                r4 = this;
                long r0 = r4.m1975()
                Yue.ۥ۟ۡۦۨ<E> r2 = r4.f1449
                long r2 = Yue.C0555.m1956(r2)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        @Override // Yue.AbstractC0028
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟ۤۤ */
        public java.lang.Object mo334() {
                r8 = this;
                java.util.concurrent.locks.ReentrantLock r0 = r8.f1450
                r0.lock()
                java.lang.Object r1 = r8.m1977()     // Catch: java.lang.Throwable -> L1e
                boolean r2 = r1 instanceof Yue.C1174     // Catch: java.lang.Throwable -> L1e
                r3 = 1
                if (r2 != 0) goto L20
                Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f97     // Catch: java.lang.Throwable -> L1e
                if (r1 == r2) goto L20
                long r4 = r8.m1975()     // Catch: java.lang.Throwable -> L1e
                r6 = 1
                long r4 = r4 + r6
                r8.m1978(r4)     // Catch: java.lang.Throwable -> L1e
                r2 = r3
                goto L21
            L1e:
                r1 = move-exception
                goto L46
            L20:
                r2 = 0
            L21:
                r0.unlock()
                boolean r0 = r1 instanceof Yue.C1174
                r4 = 0
                if (r0 == 0) goto L2d
                r0 = r1
                Yue.ۥ۟ۥ r0 = (Yue.C1174) r0
                goto L2e
            L2d:
                r0 = r4
            L2e:
                if (r0 == 0) goto L35
                java.lang.Throwable r0 = r0.f3661
                r8.mo492(r0)
            L35:
                boolean r0 = r8.m1974()
                if (r0 == 0) goto L3c
                goto L3d
            L3c:
                r3 = r2
            L3d:
                if (r3 == 0) goto L45
                Yue.ۥ۟ۡۦۨ<E> r0 = r8.f1449
                r2 = 3
                Yue.C0555.m1959(r0, r4, r4, r2, r4)
            L45:
                return r1
            L46:
                r0.unlock()
                throw r1
        }

        @Override // Yue.AbstractC0028
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
        public java.lang.Object mo335(@Yue.InterfaceC4418 Yue.InterfaceC5564<?> r9) {
                r8 = this;
                java.util.concurrent.locks.ReentrantLock r0 = r8.f1450
                r0.lock()
                java.lang.Object r1 = r8.m1977()     // Catch: java.lang.Throwable -> L1e
                boolean r2 = r1 instanceof Yue.C1174     // Catch: java.lang.Throwable -> L1e
                r3 = 1
                r4 = 0
                if (r2 != 0) goto L2b
                Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f97     // Catch: java.lang.Throwable -> L1e
                if (r1 == r2) goto L2b
                boolean r9 = r9.mo20844()     // Catch: java.lang.Throwable -> L1e
                if (r9 != 0) goto L20
                java.lang.Object r1 = Yue.C5566.m20861()     // Catch: java.lang.Throwable -> L1e
                goto L2b
            L1e:
                r9 = move-exception
                goto L50
            L20:
                long r4 = r8.m1975()     // Catch: java.lang.Throwable -> L1e
                r6 = 1
                long r4 = r4 + r6
                r8.m1978(r4)     // Catch: java.lang.Throwable -> L1e
                r4 = r3
            L2b:
                r0.unlock()
                boolean r9 = r1 instanceof Yue.C1174
                r0 = 0
                if (r9 == 0) goto L37
                r9 = r1
                Yue.ۥ۟ۥ r9 = (Yue.C1174) r9
                goto L38
            L37:
                r9 = r0
            L38:
                if (r9 == 0) goto L3f
                java.lang.Throwable r9 = r9.f3661
                r8.mo492(r9)
            L3f:
                boolean r9 = r8.m1974()
                if (r9 == 0) goto L46
                goto L47
            L46:
                r3 = r4
            L47:
                if (r3 == 0) goto L4f
                Yue.ۥ۟ۡۦۨ<E> r9 = r8.f1449
                r2 = 3
                Yue.C0555.m1959(r9, r0, r0, r2, r0)
            L4f:
                return r1
            L50:
                r0.unlock()
                throw r9
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
        public final boolean m1974() {
                r8 = this;
                r0 = 0
            L1:
                boolean r1 = r8.m1976()
                r2 = 0
                if (r1 == 0) goto L5a
                java.util.concurrent.locks.ReentrantLock r1 = r8.f1450
                boolean r1 = r1.tryLock()
                if (r1 == 0) goto L5a
                java.lang.Object r1 = r8.m1977()     // Catch: java.lang.Throwable -> L2b
                Yue.ۥۢ۠ۦۢ r3 = Yue.C0040.f97     // Catch: java.lang.Throwable -> L2b
                if (r1 != r3) goto L1e
            L18:
                java.util.concurrent.locks.ReentrantLock r1 = r8.f1450
                r1.unlock()
                goto L1
            L1e:
                boolean r3 = r1 instanceof Yue.C1174     // Catch: java.lang.Throwable -> L2b
                if (r3 == 0) goto L2d
                r2 = r1
                Yue.ۥ۟ۥ r2 = (Yue.C1174) r2     // Catch: java.lang.Throwable -> L2b
            L25:
                java.util.concurrent.locks.ReentrantLock r1 = r8.f1450
                r1.unlock()
                goto L5a
            L2b:
                r0 = move-exception
                goto L54
            L2d:
                Yue.ۥۡۦۡۢ r3 = r8.mo320()     // Catch: java.lang.Throwable -> L2b
                if (r3 != 0) goto L34
                goto L25
            L34:
                boolean r4 = r3 instanceof Yue.C1174     // Catch: java.lang.Throwable -> L2b
                if (r4 == 0) goto L39
                goto L25
            L39:
                Yue.ۥۢ۠ۦۢ r2 = r3.mo347(r1, r2)     // Catch: java.lang.Throwable -> L2b
                if (r2 != 0) goto L40
                goto L18
            L40:
                long r4 = r8.m1975()     // Catch: java.lang.Throwable -> L2b
                r6 = 1
                long r4 = r4 + r6
                r8.m1978(r4)     // Catch: java.lang.Throwable -> L2b
                java.util.concurrent.locks.ReentrantLock r0 = r8.f1450
                r0.unlock()
                r3.mo348(r1)
                r0 = 1
                goto L1
            L54:
                java.util.concurrent.locks.ReentrantLock r1 = r8.f1450
                r1.unlock()
                throw r0
            L5a:
                if (r2 == 0) goto L61
                java.lang.Throwable r1 = r2.f3661
                r8.mo492(r1)
            L61:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
        public final long m1975() {
                r2 = this;
                long r0 = r2._subHead
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
        public final boolean m1976() {
                r2 = this;
                Yue.ۥ۟ۥ r0 = r2.m482()
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                boolean r0 = r2.mo328()
                if (r0 == 0) goto L17
                Yue.ۥ۟ۡۦۨ<E> r0 = r2.f1449
                Yue.ۥ۟ۥ r0 = r0.m482()
                if (r0 != 0) goto L17
                return r1
            L17:
                r0 = 1
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
        public final java.lang.Object m1977() {
                r5 = this;
                long r0 = r5.m1975()
                Yue.ۥ۟ۡۦۨ<E> r2 = r5.f1449
                Yue.ۥ۟ۥ r2 = r2.m482()
                Yue.ۥ۟ۡۦۨ<E> r3 = r5.f1449
                long r3 = Yue.C0555.m1956(r3)
                int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r3 < 0) goto L1f
                if (r2 != 0) goto L1e
                Yue.ۥ۟ۥ r2 = r5.m482()
                if (r2 != 0) goto L1e
                Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f97
            L1e:
                return r2
            L1f:
                Yue.ۥ۟ۡۦۨ<E> r2 = r5.f1449
                java.lang.Object r0 = Yue.C0555.m1955(r2, r0)
                Yue.ۥ۟ۥ r1 = r5.m482()
                if (r1 == 0) goto L2c
                return r1
            L2c:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
        public final void m1978(long r1) {
                r0 = this;
                r0._subHead = r1
                return
        }
    }

    public C0555(int r3) {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            r2.f1445 = r3
            r0 = 1
            if (r3 < r0) goto L24
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.f1446 = r0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.f1447 = r3
            r0 = 0
            r2._head = r0
            r2._tail = r0
            r3 = 0
            r2._size = r3
            java.util.List r3 = Yue.C1446.m7099()
            r2.f1448 = r3
            return
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ArrayBroadcastChannel capacity must be at least 1, but "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was specified"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object m1955(Yue.C0555 r0, long r1) {
            java.lang.Object r0 = r0.m1966(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ long m1956(Yue.C0555 r2) {
            long r0 = r2.m1969()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    private final int m1957() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m1958() {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static /* synthetic */ void m1959(Yue.C0555 r1, Yue.C0555.C0556 r2, Yue.C0555.C0556 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L6
            r2 = r0
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lb
            r3 = r0
        Lb:
            r1.m1973(r2, r3)
            return
    }

    @Override // Yue.InterfaceC0830
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public /* synthetic */ boolean mo1960(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.m1963(r1)
            return r1
    }

    @Override // Yue.InterfaceC0830
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo1961(@Yue.InterfaceC4543 java.util.concurrent.CancellationException r1) {
            r0 = this;
            r0.m1963(r1)
            return
    }

    @Override // Yue.AbstractC0085
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public java.lang.String mo481() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "(buffer:capacity="
            r0.append(r1)
            java.lang.Object[] r1 = r2.f1447
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = ",size="
            r0.append(r1)
            int r1 = r2.m1957()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC0085, Yue.InterfaceC5599
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo492(@Yue.InterfaceC4543 java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = super.mo492(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r0.m1964()
            r1 = 1
            return r1
    }

    @Override // Yue.InterfaceC0830
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public Yue.InterfaceC5242<E> mo1962() {
            r3 = this;
            Yue.ۥ۟ۡۦۨ$ۥ r0 = new Yue.ۥ۟ۡۦۨ$ۥ
            r0.<init>(r3)
            r1 = 0
            r2 = 2
            m1959(r3, r0, r1, r2, r1)
            return r0
    }

    @Override // Yue.AbstractC0085
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public boolean mo493() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC0085
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public boolean mo494() {
            r2 = this;
            int r0 = r2.m1957()
            int r1 = r2.f1445
            if (r0 < r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // Yue.AbstractC0085
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public java.lang.Object mo497(E r8) {
            r7 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r7.f1446
            r0.lock()
            Yue.ۥ۟ۥ r1 = r7.m483()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto Lf
            r0.unlock()
            return r1
        Lf:
            int r1 = r7.m1957()     // Catch: java.lang.Throwable -> L1d
            int r2 = r7.f1445     // Catch: java.lang.Throwable -> L1d
            if (r1 < r2) goto L1f
            Yue.ۥۢ۠ۦۢ r8 = Yue.C0040.f96     // Catch: java.lang.Throwable -> L1d
            r0.unlock()
            return r8
        L1d:
            r8 = move-exception
            goto L43
        L1f:
            long r2 = r7.m1969()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object[] r4 = r7.f1447     // Catch: java.lang.Throwable -> L1d
            int r5 = r7.f1445     // Catch: java.lang.Throwable -> L1d
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L1d
            long r5 = r2 % r5
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L1d
            r4[r5] = r8     // Catch: java.lang.Throwable -> L1d
            int r1 = r1 + 1
            r7.m1971(r1)     // Catch: java.lang.Throwable -> L1d
            r4 = 1
            long r2 = r2 + r4
            r7.m1972(r2)     // Catch: java.lang.Throwable -> L1d
            Yue.ۥۣۢ۠ۤ r8 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1d
            r0.unlock()
            r7.m1964()
            Yue.ۥۢ۠ۦۢ r8 = Yue.C0040.f95
            return r8
        L43:
            r0.unlock()
            throw r8
    }

    @Override // Yue.AbstractC0085
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public java.lang.Object mo500(E r7, @Yue.InterfaceC4418 Yue.InterfaceC5564<?> r8) {
            r6 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r6.f1446
            r0.lock()
            Yue.ۥ۟ۥ r1 = r6.m483()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto Lf
            r0.unlock()
            return r1
        Lf:
            int r1 = r6.m1957()     // Catch: java.lang.Throwable -> L1d
            int r2 = r6.f1445     // Catch: java.lang.Throwable -> L1d
            if (r1 < r2) goto L1f
            Yue.ۥۢ۠ۦۢ r7 = Yue.C0040.f96     // Catch: java.lang.Throwable -> L1d
            r0.unlock()
            return r7
        L1d:
            r7 = move-exception
            goto L51
        L1f:
            boolean r8 = r8.mo20844()     // Catch: java.lang.Throwable -> L1d
            if (r8 != 0) goto L2d
            java.lang.Object r7 = Yue.C5566.m20861()     // Catch: java.lang.Throwable -> L1d
            r0.unlock()
            return r7
        L2d:
            long r2 = r6.m1969()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object[] r8 = r6.f1447     // Catch: java.lang.Throwable -> L1d
            int r4 = r6.f1445     // Catch: java.lang.Throwable -> L1d
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L1d
            long r4 = r2 % r4
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L1d
            r8[r4] = r7     // Catch: java.lang.Throwable -> L1d
            int r1 = r1 + 1
            r6.m1971(r1)     // Catch: java.lang.Throwable -> L1d
            r7 = 1
            long r2 = r2 + r7
            r6.m1972(r2)     // Catch: java.lang.Throwable -> L1d
            Yue.ۥۣۢ۠ۤ r7 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1d
            r0.unlock()
            r6.m1964()
            Yue.ۥۢ۠ۦۢ r7 = Yue.C0040.f95
            return r7
        L51:
            r0.unlock()
            throw r7
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m1963(java.lang.Throwable r4) {
            r3 = this;
            boolean r0 = r3.mo492(r4)
            java.util.List<Yue.ۥ۟ۡۦۨ$ۥ<E>> r1 = r3.f1448
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r1.next()
            Yue.ۥ۟ۡۦۨ$ۥ r2 = (Yue.C0555.C0556) r2
            r2.m321(r4)
            goto La
        L1a:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m1964() {
            r4 = this;
            java.util.List<Yue.ۥ۟ۡۦۨ$ۥ<E>> r0 = r4.f1448
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1f
            java.lang.Object r2 = r0.next()
            Yue.ۥ۟ۡۦۨ$ۥ r2 = (Yue.C0555.C0556) r2
            boolean r2 = r2.m1974()
            r3 = 1
            if (r2 == 0) goto L1d
            r1 = r3
            goto L7
        L1d:
            r2 = r3
            goto L8
        L1f:
            if (r1 != 0) goto L23
            if (r2 != 0) goto L28
        L23:
            r0 = 3
            r1 = 0
            m1959(r4, r1, r1, r0, r1)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final long m1965() {
            r5 = this;
            java.util.List<Yue.ۥ۟ۡۦۨ$ۥ<E>> r0 = r5.f1448
            java.util.Iterator r0 = r0.iterator()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lb:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L20
            java.lang.Object r3 = r0.next()
            Yue.ۥ۟ۡۦۨ$ۥ r3 = (Yue.C0555.C0556) r3
            long r3 = r3.m1975()
            long r1 = Yue.C5196.m19522(r1, r3)
            goto Lb
        L20:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final E m1966(long r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.f1447
            int r1 = r3.f1445
            long r1 = (long) r1
            long r4 = r4 % r1
            int r4 = (int) r4
            r4 = r0[r4]
            return r4
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final int m1967() {
            r1 = this;
            int r0 = r1.f1445
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public final long m1968() {
            r2 = this;
            long r0 = r2._head
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public final long m1969() {
            r2 = this;
            long r0 = r2._tail
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public final void m1970(long r1) {
            r0 = this;
            r0._head = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public final void m1971(int r1) {
            r0 = this;
            r0._size = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public final void m1972(long r1) {
            r0 = this;
            r0._tail = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public final void m1973(Yue.C0555.C0556<E> r13, Yue.C0555.C0556<E> r14) {
            r12 = this;
        L0:
            java.util.concurrent.locks.ReentrantLock r0 = r12.f1446
            r0.lock()
            if (r13 == 0) goto L22
            long r1 = r12.m1969()     // Catch: java.lang.Throwable -> L1f
            r13.m1978(r1)     // Catch: java.lang.Throwable -> L1f
            java.util.List<Yue.ۥ۟ۡۦۨ$ۥ<E>> r1 = r12.f1448     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1f
            java.util.List<Yue.ۥ۟ۡۦۨ$ۥ<E>> r2 = r12.f1448     // Catch: java.lang.Throwable -> L1f
            r2.add(r13)     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L22
            r0.unlock()
            return
        L1f:
            r13 = move-exception
            goto Lb4
        L22:
            if (r14 == 0) goto L39
            java.util.List<Yue.ۥ۟ۡۦۨ$ۥ<E>> r13 = r12.f1448     // Catch: java.lang.Throwable -> L1f
            r13.remove(r14)     // Catch: java.lang.Throwable -> L1f
            long r1 = r12.m1968()     // Catch: java.lang.Throwable -> L1f
            long r13 = r14.m1975()     // Catch: java.lang.Throwable -> L1f
            int r13 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r13 == 0) goto L39
            r0.unlock()
            return
        L39:
            long r13 = r12.m1965()     // Catch: java.lang.Throwable -> L1f
            long r1 = r12.m1969()     // Catch: java.lang.Throwable -> L1f
            long r3 = r12.m1968()     // Catch: java.lang.Throwable -> L1f
            long r13 = Yue.C5196.m19522(r13, r1)     // Catch: java.lang.Throwable -> L1f
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 > 0) goto L51
            r0.unlock()
            return
        L51:
            int r5 = r12.m1957()     // Catch: java.lang.Throwable -> L1f
        L55:
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 >= 0) goto Lb0
            java.lang.Object[] r6 = r12.f1447     // Catch: java.lang.Throwable -> L1f
            int r7 = r12.f1445     // Catch: java.lang.Throwable -> L1f
            long r8 = (long) r7     // Catch: java.lang.Throwable -> L1f
            long r8 = r3 % r8
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L1f
            r9 = 0
            r6[r8] = r9     // Catch: java.lang.Throwable -> L1f
            if (r5 < r7) goto L68
            r6 = 1
            goto L69
        L68:
            r6 = 0
        L69:
            r7 = 1
            long r3 = r3 + r7
            r12.m1970(r3)     // Catch: java.lang.Throwable -> L1f
            int r10 = r5 + (-1)
            r12.m1971(r10)     // Catch: java.lang.Throwable -> L1f
            if (r6 == 0) goto Lae
        L76:
            Yue.ۥۡۨ۠ۦ r6 = r12.m505()     // Catch: java.lang.Throwable -> L1f
            if (r6 != 0) goto L7d
            goto Lae
        L7d:
            boolean r11 = r6 instanceof Yue.C1174     // Catch: java.lang.Throwable -> L1f
            if (r11 != 0) goto Lae
            Yue.C3329.m13903(r6)     // Catch: java.lang.Throwable -> L1f
            Yue.ۥۢ۠ۦۢ r11 = r6.mo509(r9)     // Catch: java.lang.Throwable -> L1f
            if (r11 == 0) goto L76
            java.lang.Object[] r13 = r12.f1447     // Catch: java.lang.Throwable -> L1f
            int r14 = r12.f1445     // Catch: java.lang.Throwable -> L1f
            long r3 = (long) r14     // Catch: java.lang.Throwable -> L1f
            long r3 = r1 % r3
            int r14 = (int) r3     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r3 = r6.mo507()     // Catch: java.lang.Throwable -> L1f
            r13[r14] = r3     // Catch: java.lang.Throwable -> L1f
            r12.m1971(r5)     // Catch: java.lang.Throwable -> L1f
            long r1 = r1 + r7
            r12.m1972(r1)     // Catch: java.lang.Throwable -> L1f
            Yue.ۥۣۢ۠ۤ r13 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1f
            r0.unlock()
            r6.mo506()
            r12.m1964()
            r13 = r9
            r14 = r13
            goto L0
        Lae:
            r5 = r10
            goto L55
        Lb0:
            r0.unlock()
            return
        Lb4:
            r0.unlock()
            throw r13
    }
}
