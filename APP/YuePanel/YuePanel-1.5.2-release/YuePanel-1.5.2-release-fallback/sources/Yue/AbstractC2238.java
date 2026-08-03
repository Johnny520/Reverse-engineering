package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2238 extends Yue.AbstractC2243 implements Yue.InterfaceC1802 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f6913 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f6914 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object _delayed;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int _isCompleted;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object _queue;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۡۡ$ۥ, reason: contains not printable characters */
    public final class C2239 extends Yue.AbstractC2238.AbstractRunnableC2241 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.InterfaceC0932<Yue.C6593> f6915;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC2238 f6916;

        public C2239(Yue.AbstractC2238 r1, @Yue.InterfaceC4418 long r2, Yue.InterfaceC0932<? super Yue.C6593> r4) {
                r0 = this;
                r0.f6916 = r1
                r0.<init>(r2)
                r0.f6915 = r4
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                Yue.ۥۣ۟ۨ۟<Yue.ۥۣۢ۠ۤ> r0 = r3.f6915
                Yue.ۥ۠ۡۡۡ r1 = r3.f6916
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                r0.mo5303(r1, r2)
                return
        }

        @Override // Yue.AbstractC2238.AbstractRunnableC2241
        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                r0.append(r1)
                Yue.ۥۣ۟ۨ۟<Yue.ۥۣۢ۠ۤ> r1 = r2.f6915
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۡۡ$ۥ۟, reason: contains not printable characters */
    public static final class C2240 extends Yue.AbstractC2238.AbstractRunnableC2241 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.lang.Runnable f6917;

        public C2240(long r1, @Yue.InterfaceC4418 java.lang.Runnable r3) {
                r0 = this;
                r0.<init>(r1)
                r0.f6917 = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.lang.Runnable r0 = r1.f6917
                r0.run()
                return
        }

        @Override // Yue.AbstractC2238.AbstractRunnableC2241
        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                r0.append(r1)
                java.lang.Runnable r1 = r2.f6917
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۡۡ$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractRunnableC2241 implements java.lang.Runnable, java.lang.Comparable<Yue.AbstractC2238.AbstractRunnableC2241>, Yue.InterfaceC1892, Yue.InterfaceC6190 {

        @Yue.InterfaceC4543
        private volatile java.lang.Object _heap;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC3417
        public long f6918;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f6919;

        public AbstractRunnableC2241(long r1) {
                r0 = this;
                r0.<init>()
                r0.f6918 = r1
                r1 = -1
                r0.f6919 = r1
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Yue.AbstractC2238.AbstractRunnableC2241 r1) {
                r0 = this;
                Yue.ۥ۠ۡۡۡ$ۥ۟۟ r1 = (Yue.AbstractC2238.AbstractRunnableC2241) r1
                int r1 = r0.m10280(r1)
                return r1
        }

        @Override // Yue.InterfaceC6190
        public int getIndex() {
                r1 = this;
                int r0 = r1.f6919
                return r0
        }

        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Delayed[nanos="
                r0.append(r1)
                long r1 = r3.f6918
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.InterfaceC6190
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo10277(@Yue.InterfaceC4543 Yue.C6189<?> r3) {
                r2 = this;
                java.lang.Object r0 = r2._heap
                Yue.ۥۢ۠ۦۢ r1 = Yue.C2245.m10288()
                if (r0 == r1) goto Lb
                r2._heap = r3
                return
            Lb:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Failed requirement."
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // Yue.InterfaceC6190
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Yue.C6189<?> mo10278() {
                r2 = this;
                java.lang.Object r0 = r2._heap
                boolean r1 = r0 instanceof Yue.C6189
                if (r1 == 0) goto L9
                Yue.ۥۢۡۢۢ r0 = (Yue.C6189) r0
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // Yue.InterfaceC6190
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo10279(int r1) {
                r0 = this;
                r0.f6919 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int m10280(@Yue.InterfaceC4418 Yue.AbstractC2238.AbstractRunnableC2241 r5) {
                r4 = this;
                long r0 = r4.f6918
                long r2 = r5.f6918
                long r0 = r0 - r2
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto Ld
                r5 = 1
                goto L12
            Ld:
                if (r5 >= 0) goto L11
                r5 = -1
                goto L12
            L11:
                r5 = 0
            L12:
                return r5
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final synchronized int m10281(long r8, @Yue.InterfaceC4418 Yue.AbstractC2238.C2242 r10, @Yue.InterfaceC4418 Yue.AbstractC2238 r11) {
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L1d
                Yue.ۥۢ۠ۦۢ r1 = Yue.C2245.m10288()     // Catch: java.lang.Throwable -> L1d
                if (r0 != r1) goto Lc
                monitor-exit(r7)
                r8 = 2
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L1d
                Yue.ۥۣۢۡۢ r0 = r10.m23152()     // Catch: java.lang.Throwable -> L26
                Yue.ۥ۠ۡۡۡ$ۥ۟۟ r0 = (Yue.AbstractC2238.AbstractRunnableC2241) r0     // Catch: java.lang.Throwable -> L26
                boolean r11 = Yue.AbstractC2238.m10266(r11)     // Catch: java.lang.Throwable -> L26
                if (r11 == 0) goto L1f
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r7)
                r8 = 1
                return r8
            L1d:
                r8 = move-exception
                goto L50
            L1f:
                r1 = 0
                if (r0 != 0) goto L28
                r10.f6920 = r8     // Catch: java.lang.Throwable -> L26
                goto L3c
            L26:
                r8 = move-exception
                goto L4e
            L28:
                long r3 = r0.f6918     // Catch: java.lang.Throwable -> L26
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L31
                goto L32
            L31:
                r8 = r3
            L32:
                long r3 = r10.f6920     // Catch: java.lang.Throwable -> L26
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L3c
                r10.f6920 = r8     // Catch: java.lang.Throwable -> L26
            L3c:
                long r8 = r7.f6918     // Catch: java.lang.Throwable -> L26
                long r3 = r10.f6920     // Catch: java.lang.Throwable -> L26
                long r8 = r8 - r3
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 >= 0) goto L47
                r7.f6918 = r3     // Catch: java.lang.Throwable -> L26
            L47:
                r10.m23147(r7)     // Catch: java.lang.Throwable -> L26
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r7)
                r8 = 0
                return r8
            L4e:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1d
                throw r8     // Catch: java.lang.Throwable -> L1d
            L50:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L1d
                throw r8
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final boolean m10282(long r3) {
                r2 = this;
                long r0 = r2.f6918
                long r3 = r3 - r0
                r0 = 0
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 < 0) goto Lb
                r3 = 1
                goto Lc
            Lb:
                r3 = 0
            Lc:
                return r3
        }

        @Override // Yue.InterfaceC1892
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
        public final synchronized void mo352() {
                r2 = this;
                monitor-enter(r2)
                java.lang.Object r0 = r2._heap     // Catch: java.lang.Throwable -> L12
                Yue.ۥۢ۠ۦۢ r1 = Yue.C2245.m10288()     // Catch: java.lang.Throwable -> L12
                if (r0 != r1) goto Lb
                monitor-exit(r2)
                return
            Lb:
                boolean r1 = r0 instanceof Yue.AbstractC2238.C2242     // Catch: java.lang.Throwable -> L12
                if (r1 == 0) goto L14
                Yue.ۥ۠ۡۡۡ$ۥ۟۟۟ r0 = (Yue.AbstractC2238.C2242) r0     // Catch: java.lang.Throwable -> L12
                goto L15
            L12:
                r0 = move-exception
                goto L22
            L14:
                r0 = 0
            L15:
                if (r0 == 0) goto L1a
                r0.m23157(r2)     // Catch: java.lang.Throwable -> L12
            L1a:
                Yue.ۥۢ۠ۦۢ r0 = Yue.C2245.m10288()     // Catch: java.lang.Throwable -> L12
                r2._heap = r0     // Catch: java.lang.Throwable -> L12
                monitor-exit(r2)
                return
            L22:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
                throw r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۡۡ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C2242 extends Yue.C6189<Yue.AbstractC2238.AbstractRunnableC2241> {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC3417
        public long f6920;

        public C2242(long r1) {
                r0 = this;
                r0.<init>()
                r0.f6920 = r1
                return
        }
    }

    static {
            java.lang.String r0 = "_queue"
            java.lang.Class<Yue.ۥ۠ۡۡۡ> r1 = Yue.AbstractC2238.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            Yue.AbstractC2238.f6913 = r0
            java.lang.String r0 = "_delayed"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            Yue.AbstractC2238.f6914 = r0
            return
    }

    public AbstractC2238() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._queue = r0
            r1._delayed = r0
            r0 = 0
            r1._isCompleted = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    private final boolean m10265() {
            r1 = this;
            int r0 = r1._isCompleted
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m10266(Yue.AbstractC2238 r0) {
            boolean r0 = r0.m10265()
            return r0
    }

    @Override // Yue.AbstractC1643
    public final void dispatch(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, @Yue.InterfaceC4418 java.lang.Runnable r2) {
            r0 = this;
            r0.mo8440(r2)
            return
    }

    @Override // Yue.AbstractC2237
    public void shutdown() {
            r4 = this;
            Yue.ۥۢۡۡۨ r0 = Yue.C6184.f22161
            r0.m23137()
            r0 = 1
            r4.m10275(r0)
            r4.m10267()
        Lc:
            long r0 = r4.mo10262()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lc
            r4.m10270()
            return
    }

    @Override // Yue.InterfaceC1802
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated without replacement as an internal method never intended for public use")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public java.lang.Object mo8485(long r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r3) {
            r0 = this;
            java.lang.Object r1 = Yue.InterfaceC1802.C1803.m8487(r0, r1, r3)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public Yue.InterfaceC1892 mo8438(long r1, @Yue.InterfaceC4418 java.lang.Runnable r3, @Yue.InterfaceC4418 Yue.InterfaceC1632 r4) {
            r0 = this;
            Yue.ۥۣۣ۠۟ r1 = Yue.InterfaceC1802.C1803.m8488(r0, r1, r3, r4)
            return r1
    }

    @Override // Yue.InterfaceC1802
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public void mo8486(long r4, @Yue.InterfaceC4418 Yue.InterfaceC0932<? super Yue.C6593> r6) {
            r3 = this;
            long r4 = Yue.C2245.m10290(r4)
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L28
            Yue.ۥ۟۟ۢۧ r0 = Yue.C0098.m539()
            if (r0 == 0) goto L18
            long r0 = r0.m530()
            goto L1c
        L18:
            long r0 = java.lang.System.nanoTime()
        L1c:
            Yue.ۥ۠ۡۡۡ$ۥ r2 = new Yue.ۥ۠ۡۡۡ$ۥ
            long r4 = r4 + r0
            r2.<init>(r3, r4, r6)
            r3.m10272(r0, r2)
            Yue.C0936.m5345(r6, r2)
        L28:
            return
    }

    @Override // Yue.AbstractC2237
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    public long mo10257() {
            r6 = this;
            long r0 = super.mo10257()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lb
            return r2
        Lb:
            java.lang.Object r0 = r6._queue
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L29
            boolean r1 = r0 instanceof Yue.C3793
            if (r1 == 0) goto L21
            Yue.ۥ۠ۨ۠ۨ r0 = (Yue.C3793) r0
            boolean r0 = r0.m15209()
            if (r0 != 0) goto L29
            return r2
        L21:
            Yue.ۥۢ۠ۦۢ r1 = Yue.C2245.m10287()
            if (r0 != r1) goto L28
            return r4
        L28:
            return r2
        L29:
            java.lang.Object r0 = r6._delayed
            Yue.ۥ۠ۡۡۡ$ۥ۟۟۟ r0 = (Yue.AbstractC2238.C2242) r0
            if (r0 == 0) goto L4f
            Yue.ۥۣۢۡۢ r0 = r0.m23155()
            Yue.ۥ۠ۡۡۡ$ۥ۟۟ r0 = (Yue.AbstractC2238.AbstractRunnableC2241) r0
            if (r0 != 0) goto L38
            goto L4f
        L38:
            long r0 = r0.f6918
            Yue.ۥ۟۟ۢۧ r4 = Yue.C0098.m539()
            if (r4 == 0) goto L45
            long r4 = r4.m530()
            goto L49
        L45:
            long r4 = java.lang.System.nanoTime()
        L49:
            long r0 = r0 - r4
            long r0 = Yue.C5196.m19515(r0, r2)
            return r0
        L4f:
            return r4
    }

    @Override // Yue.AbstractC2237
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ */
    public boolean mo10259() {
            r4 = this;
            boolean r0 = r4.m10261()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Object r0 = r4._delayed
            Yue.ۥ۠ۡۡۡ$ۥ۟۟۟ r0 = (Yue.AbstractC2238.C2242) r0
            if (r0 == 0) goto L15
            boolean r0 = r0.m23154()
            if (r0 != 0) goto L15
            return r1
        L15:
            java.lang.Object r0 = r4._queue
            r2 = 1
            if (r0 != 0) goto L1c
        L1a:
            r1 = r2
            goto L2e
        L1c:
            boolean r3 = r0 instanceof Yue.C3793
            if (r3 == 0) goto L27
            Yue.ۥ۠ۨ۠ۨ r0 = (Yue.C3793) r0
            boolean r1 = r0.m15209()
            goto L2e
        L27:
            Yue.ۥۢ۠ۦۢ r3 = Yue.C2245.m10287()
            if (r0 != r3) goto L2e
            goto L1a
        L2e:
            return r1
    }

    @Override // Yue.AbstractC2237
    /* JADX INFO: renamed from: ۥ۟۟ۨ */
    public long mo10262() {
            r9 = this;
            boolean r0 = r9.m10263()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r9._delayed
            Yue.ۥ۠ۡۡۡ$ۥ۟۟۟ r0 = (Yue.AbstractC2238.C2242) r0
            if (r0 == 0) goto L4d
            boolean r3 = r0.m23154()
            if (r3 != 0) goto L4d
            Yue.ۥ۟۟ۢۧ r3 = Yue.C0098.m539()
            if (r3 == 0) goto L20
            long r3 = r3.m530()
            goto L24
        L20:
            long r3 = java.lang.System.nanoTime()
        L24:
            monitor-enter(r0)
            Yue.ۥۣۢۡۢ r5 = r0.m23152()     // Catch: java.lang.Throwable -> L3c
            r6 = 0
            if (r5 != 0) goto L2e
            monitor-exit(r0)
            goto L46
        L2e:
            Yue.ۥ۠ۡۡۡ$ۥ۟۟ r5 = (Yue.AbstractC2238.AbstractRunnableC2241) r5     // Catch: java.lang.Throwable -> L3c
            boolean r7 = r5.m10282(r3)     // Catch: java.lang.Throwable -> L3c
            r8 = 0
            if (r7 == 0) goto L3e
            boolean r5 = r9.m10269(r5)     // Catch: java.lang.Throwable -> L3c
            goto L3f
        L3c:
            r1 = move-exception
            goto L4b
        L3e:
            r5 = r8
        L3f:
            if (r5 == 0) goto L45
            Yue.ۥۣۢۡۢ r6 = r0.m23158(r8)     // Catch: java.lang.Throwable -> L3c
        L45:
            monitor-exit(r0)
        L46:
            Yue.ۥ۠ۡۡۡ$ۥ۟۟ r6 = (Yue.AbstractC2238.AbstractRunnableC2241) r6
            if (r6 != 0) goto L24
            goto L4d
        L4b:
            monitor-exit(r0)
            throw r1
        L4d:
            java.lang.Runnable r0 = r9.m10268()
            if (r0 == 0) goto L57
            r0.run()
            return r1
        L57:
            long r0 = r9.mo10257()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public final void m10267() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._queue
            if (r0 != 0) goto L12
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.AbstractC2238.f6913
            r1 = 0
            Yue.ۥۢ۠ۦۢ r2 = Yue.C2245.m10287()
            boolean r0 = Yue.C0084.m471(r0, r4, r1, r2)
            if (r0 == 0) goto L0
            return
        L12:
            boolean r1 = r0 instanceof Yue.C3793
            if (r1 == 0) goto L1c
            Yue.ۥ۠ۨ۠ۨ r0 = (Yue.C3793) r0
            r0.m15205()
            return
        L1c:
            Yue.ۥۢ۠ۦۢ r1 = Yue.C2245.m10287()
            if (r0 != r1) goto L23
            return
        L23:
            Yue.ۥ۠ۨ۠ۨ r1 = new Yue.ۥ۠ۨ۠ۨ
            r2 = 8
            r3 = 1
            r1.<init>(r2, r3)
            r2 = r0
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1.m15202(r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Yue.AbstractC2238.f6913
            boolean r0 = Yue.C0084.m471(r2, r4, r0, r1)
            if (r0 == 0) goto L0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public final java.lang.Runnable m10268() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._queue
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r0 instanceof Yue.C3793
            if (r2 == 0) goto L22
            r1 = r0
            Yue.ۥ۠ۨ۠ۨ r1 = (Yue.C3793) r1
            java.lang.Object r2 = r1.m15213()
            Yue.ۥۢ۠ۦۢ r3 = Yue.C3793.f12025
            if (r2 == r3) goto L18
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            return r2
        L18:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Yue.AbstractC2238.f6913
            Yue.ۥ۠ۨ۠ۨ r1 = r1.m15212()
            Yue.C0084.m471(r2, r4, r0, r1)
            goto L0
        L22:
            Yue.ۥۢ۠ۦۢ r2 = Yue.C2245.m10287()
            if (r0 != r2) goto L29
            return r1
        L29:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Yue.AbstractC2238.f6913
            boolean r1 = Yue.C0084.m471(r2, r4, r0, r1)
            if (r1 == 0) goto L0
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ */
    public void mo8440(@Yue.InterfaceC4418 java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.m10269(r2)
            if (r0 == 0) goto La
            r1.m10283()
            goto Lf
        La:
            Yue.ۥ۟ۨۥۤ r0 = Yue.RunnableC1771.f5485
            r0.mo8440(r2)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public final boolean m10269(java.lang.Runnable r6) {
            r5 = this;
        L0:
            java.lang.Object r0 = r5._queue
            boolean r1 = r5.m10265()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            r1 = 1
            if (r0 != 0) goto L17
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.AbstractC2238.f6913
            r2 = 0
            boolean r0 = Yue.C0084.m471(r0, r5, r2, r6)
            if (r0 == 0) goto L0
            return r1
        L17:
            boolean r3 = r0 instanceof Yue.C3793
            if (r3 == 0) goto L36
            r3 = r0
            Yue.ۥ۠ۨ۠ۨ r3 = (Yue.C3793) r3
            int r4 = r3.m15202(r6)
            if (r4 == 0) goto L35
            if (r4 == r1) goto L2b
            r0 = 2
            if (r4 == r0) goto L2a
            goto L0
        L2a:
            return r2
        L2b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.AbstractC2238.f6913
            Yue.ۥ۠ۨ۠ۨ r2 = r3.m15212()
            Yue.C0084.m471(r1, r5, r0, r2)
            goto L0
        L35:
            return r1
        L36:
            Yue.ۥۢ۠ۦۢ r3 = Yue.C2245.m10287()
            if (r0 != r3) goto L3d
            return r2
        L3d:
            Yue.ۥ۠ۨ۠ۨ r2 = new Yue.ۥ۠ۨ۠ۨ
            r3 = 8
            r2.<init>(r3, r1)
            r3 = r0
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.m15202(r3)
            r2.m15202(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = Yue.AbstractC2238.f6913
            boolean r0 = Yue.C0084.m471(r3, r5, r0, r2)
            if (r0 == 0) goto L0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final void m10270() {
            r3 = this;
            Yue.ۥ۟۟ۢۧ r0 = Yue.C0098.m539()
            if (r0 == 0) goto Lb
            long r0 = r0.m530()
            goto Lf
        Lb:
            long r0 = java.lang.System.nanoTime()
        Lf:
            java.lang.Object r2 = r3._delayed
            Yue.ۥ۠ۡۡۡ$ۥ۟۟۟ r2 = (Yue.AbstractC2238.C2242) r2
            if (r2 == 0) goto L22
            Yue.ۥۣۢۡۢ r2 = r2.m23160()
            Yue.ۥ۠ۡۡۡ$ۥ۟۟ r2 = (Yue.AbstractC2238.AbstractRunnableC2241) r2
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            r3.mo8439(r0, r2)
            goto Lf
        L22:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public final void m10271() {
            r1 = this;
            r0 = 0
            r1._queue = r0
            r1._delayed = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public final void m10272(long r3, @Yue.InterfaceC4418 Yue.AbstractC2238.AbstractRunnableC2241 r5) {
            r2 = this;
            int r0 = r2.m10273(r3, r5)
            if (r0 == 0) goto L1d
            r1 = 1
            if (r0 == r1) goto L19
            r3 = 2
            if (r0 != r3) goto Ld
            goto L26
        Ld:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "unexpected result"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L19:
            r2.mo8439(r3, r5)
            goto L26
        L1d:
            boolean r3 = r2.m10276(r5)
            if (r3 == 0) goto L26
            r2.m10283()
        L26:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public final int m10273(long r4, Yue.AbstractC2238.AbstractRunnableC2241 r6) {
            r3 = this;
            boolean r0 = r3.m10265()
            if (r0 == 0) goto L8
            r4 = 1
            return r4
        L8:
            java.lang.Object r0 = r3._delayed
            Yue.ۥ۠ۡۡۡ$ۥ۟۟۟ r0 = (Yue.AbstractC2238.C2242) r0
            if (r0 != 0) goto L20
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.AbstractC2238.f6914
            Yue.ۥ۠ۡۡۡ$ۥ۟۟۟ r1 = new Yue.ۥ۠ۡۡۡ$ۥ۟۟۟
            r1.<init>(r4)
            r2 = 0
            Yue.C0084.m471(r0, r3, r2, r1)
            java.lang.Object r0 = r3._delayed
            Yue.C3329.m13903(r0)
            Yue.ۥ۠ۡۡۡ$ۥ۟۟۟ r0 = (Yue.AbstractC2238.C2242) r0
        L20:
            int r4 = r6.m10281(r4, r0, r3)
            return r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public final Yue.InterfaceC1892 m10274(long r4, @Yue.InterfaceC4418 java.lang.Runnable r6) {
            r3 = this;
            long r4 = Yue.C2245.m10290(r4)
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L26
            Yue.ۥ۟۟ۢۧ r0 = Yue.C0098.m539()
            if (r0 == 0) goto L18
            long r0 = r0.m530()
            goto L1c
        L18:
            long r0 = java.lang.System.nanoTime()
        L1c:
            Yue.ۥ۠ۡۡۡ$ۥ۟ r2 = new Yue.ۥ۠ۡۡۡ$ۥ۟
            long r4 = r4 + r0
            r2.<init>(r4, r6)
            r3.m10272(r0, r2)
            goto L28
        L26:
            Yue.ۥۡۢۤۡ r2 = Yue.C4408.f13977
        L28:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public final void m10275(boolean r1) {
            r0 = this;
            r0._isCompleted = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public final boolean m10276(Yue.AbstractC2238.AbstractRunnableC2241 r2) {
            r1 = this;
            java.lang.Object r0 = r1._delayed
            Yue.ۥ۠ۡۡۡ$ۥ۟۟۟ r0 = (Yue.AbstractC2238.C2242) r0
            if (r0 == 0) goto Ld
            Yue.ۥۣۢۡۢ r0 = r0.m23155()
            Yue.ۥ۠ۡۡۡ$ۥ۟۟ r0 = (Yue.AbstractC2238.AbstractRunnableC2241) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != r2) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }
}
