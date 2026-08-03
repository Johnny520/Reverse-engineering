package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1450<K, V> extends Yue.AbstractC0070<K, V> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f4548 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int _size;

    @Yue.InterfaceC4418
    volatile /* synthetic */ java.lang.Object core;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.ref.ReferenceQueue<K> f4549;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۦ۟$ۥ, reason: contains not printable characters */
    public final class C1451 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f4550 = null;

        @Yue.InterfaceC4418
        private volatile /* synthetic */ int load;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int f4551;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int f4552;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f4553;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f4554;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f4555;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1450<K, V> f4556;

        /* JADX INFO: renamed from: Yue.ۥ۟ۦۦ۟$ۥ$ۥ, reason: contains not printable characters */
        public final class C1452<E> implements java.util.Iterator<E>, Yue.InterfaceC3446 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            @Yue.InterfaceC4418
            public final Yue.InterfaceC2839<K, V, E> f4557;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f4558;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public K f4559;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public V f4560;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C1450<K, V>.C1451 f4561;

            public C1452(@Yue.InterfaceC4418 Yue.C1450.C1451 r1, Yue.InterfaceC2839<? super K, ? super V, ? extends E> r2) {
                    r0 = this;
                    r0.f4561 = r1
                    r0.<init>()
                    r0.f4557 = r2
                    r1 = -1
                    r0.f4558 = r1
                    r0.m7134()
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r2 = this;
                    int r0 = r2.f4558
                    Yue.ۥ۟ۦۦ۟<K, V>$ۥ r1 = r2.f4561
                    int r1 = Yue.C1450.C1451.m7125(r1)
                    if (r0 >= r1) goto Lc
                    r0 = 1
                    goto Ld
                Lc:
                    r0 = 0
                Ld:
                    return r0
            }

            @Override // java.util.Iterator
            public E next() {
                    r3 = this;
                    int r0 = r3.f4558
                    Yue.ۥ۟ۦۦ۟<K, V>$ۥ r1 = r3.f4561
                    int r1 = Yue.C1450.C1451.m7125(r1)
                    if (r0 >= r1) goto L2a
                    Yue.ۥۣ۠ۢۢ<K, V, E> r0 = r3.f4557
                    K r1 = r3.f4559
                    if (r1 != 0) goto L17
                    java.lang.String r1 = "key"
                    Yue.C3329.m13935(r1)
                    Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                L17:
                    V r2 = r3.f4560
                    if (r2 != 0) goto L22
                    java.lang.String r2 = "value"
                    Yue.C3329.m13935(r2)
                    Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                L22:
                    java.lang.Object r0 = r0.invoke(r1, r2)
                    r3.m7134()
                    return r0
                L2a:
                    java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ void remove() {
                    r0 = this;
                    r0.m7135()
                    return
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final void m7134() {
                    r2 = this;
                L0:
                    int r0 = r2.f4558
                    int r0 = r0 + 1
                    r2.f4558 = r0
                    Yue.ۥ۟ۦۦ۟<K, V>$ۥ r1 = r2.f4561
                    int r1 = Yue.C1450.C1451.m7125(r1)
                    if (r0 >= r1) goto L3b
                    Yue.ۥ۟ۦۦ۟<K, V>$ۥ r0 = r2.f4561
                    java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.f4554
                    int r1 = r2.f4558
                    java.lang.Object r0 = r0.get(r1)
                    Yue.ۥ۠ۤۢ r0 = (Yue.C2987) r0
                    if (r0 == 0) goto L0
                    java.lang.Object r0 = r0.get()
                    if (r0 != 0) goto L23
                    goto L0
                L23:
                    r2.f4559 = r0
                    Yue.ۥ۟ۦۦ۟<K, V>$ۥ r0 = r2.f4561
                    java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.f4555
                    int r1 = r2.f4558
                    java.lang.Object r0 = r0.get(r1)
                    boolean r1 = r0 instanceof Yue.C3906
                    if (r1 == 0) goto L37
                    Yue.ۥ۠ۨۨۡ r0 = (Yue.C3906) r0
                    java.lang.Object r0 = r0.f12445
                L37:
                    if (r0 == 0) goto L0
                    r2.f4560 = r0
                L3b:
                    return
            }

            @Yue.InterfaceC4418
            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public java.lang.Void m7135() {
                    r1 = this;
                    Yue.C1457.m7139()
                    Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
                    r0.<init>()
                    throw r0
            }
        }

        static {
                java.lang.Class<Yue.ۥ۟ۦۦ۟$ۥ> r0 = Yue.C1450.C1451.class
                java.lang.String r1 = "load"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
                Yue.C1450.C1451.f4550 = r0
                return
        }

        public C1451(Yue.C1450 r1, int r2) {
                r0 = this;
                r0.f4556 = r1
                r0.<init>()
                r0.f4551 = r2
                int r1 = java.lang.Integer.numberOfLeadingZeros(r2)
                int r1 = r1 + 1
                r0.f4552 = r1
                int r1 = r2 * 2
                int r1 = r1 / 3
                r0.f4553 = r1
                r1 = 0
                r0.load = r1
                java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
                r1.<init>(r2)
                r0.f4554 = r1
                java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
                r1.<init>(r2)
                r0.f4555 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int m7125(Yue.C1450.C1451 r0) {
                int r0 = r0.f4551
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static /* synthetic */ java.lang.Object m7126(Yue.C1450.C1451 r0, java.lang.Object r1, java.lang.Object r2, Yue.C2987 r3, int r4, java.lang.Object r5) {
                r4 = r4 & 4
                if (r4 == 0) goto L5
                r3 = 0
            L5:
                java.lang.Object r0 = r0.m7131(r1, r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final void m7127(@Yue.InterfaceC4418 Yue.C2987<?> r3) {
                r2 = this;
                int r0 = r3.f9645
                int r0 = r2.m7129(r0)
            L6:
                java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.f4554
                java.lang.Object r1 = r1.get(r0)
                Yue.ۥ۠ۤۢ r1 = (Yue.C2987) r1
                if (r1 != 0) goto L11
                return
            L11:
                if (r1 != r3) goto L17
                r2.m7133(r0)
                return
            L17:
                if (r0 != 0) goto L1b
                int r0 = r2.f4551
            L1b:
                int r0 = r0 + (-1)
                goto L6
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final V m7128(@Yue.InterfaceC4418 K r4) {
                r3 = this;
                int r0 = r4.hashCode()
                int r0 = r3.m7129(r0)
            L8:
                java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.f4554
                java.lang.Object r1 = r1.get(r0)
                Yue.ۥ۠ۤۢ r1 = (Yue.C2987) r1
                if (r1 != 0) goto L14
                r4 = 0
                return r4
            L14:
                java.lang.Object r1 = r1.get()
                boolean r2 = Yue.C3329.m13897(r4, r1)
                if (r2 == 0) goto L2d
                java.util.concurrent.atomic.AtomicReferenceArray r4 = r3.f4555
                java.lang.Object r4 = r4.get(r0)
                boolean r0 = r4 instanceof Yue.C3906
                if (r0 == 0) goto L2c
                Yue.ۥ۠ۨۨۡ r4 = (Yue.C3906) r4
                java.lang.Object r4 = r4.f12445
            L2c:
                return r4
            L2d:
                if (r1 != 0) goto L32
                r3.m7133(r0)
            L32:
                if (r0 != 0) goto L36
                int r0 = r3.f4551
            L36:
                int r0 = r0 + (-1)
                goto L8
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int m7129(int r2) {
                r1 = this;
                r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
                int r2 = r2 * r0
                int r0 = r1.f4552
                int r2 = r2 >>> r0
                return r2
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final <E> java.util.Iterator<E> m7130(@Yue.InterfaceC4418 Yue.InterfaceC2839<? super K, ? super V, ? extends E> r2) {
                r1 = this;
                Yue.ۥ۟ۦۦ۟$ۥ$ۥ r0 = new Yue.ۥ۟ۦۦ۟$ۥ$ۥ
                r0.<init>(r1, r2)
                return r0
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final java.lang.Object m7131(@Yue.InterfaceC4418 K r6, @Yue.InterfaceC4543 V r7, @Yue.InterfaceC4543 Yue.C2987<K> r8) {
                r5 = this;
                int r0 = r6.hashCode()
                int r0 = r5.m7129(r0)
                r1 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r5.f4554
                java.lang.Object r2 = r2.get(r0)
                Yue.ۥ۠ۤۢ r2 = (Yue.C2987) r2
                if (r2 != 0) goto L46
                r2 = 0
                if (r7 != 0) goto L17
                return r2
            L17:
                if (r1 != 0) goto L30
            L19:
                int r1 = r5.load
                int r3 = r5.f4553
                if (r1 < r3) goto L24
                Yue.ۥۢ۠ۦۢ r6 = Yue.C1457.m7137()
                return r6
            L24:
                int r3 = r1 + 1
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = Yue.C1450.C1451.f4550
                boolean r1 = r4.compareAndSet(r5, r1, r3)
                if (r1 != 0) goto L2f
                goto L19
            L2f:
                r1 = 1
            L30:
                if (r8 != 0) goto L3d
                Yue.ۥ۠ۤۢ r8 = new Yue.ۥ۠ۤۢ
                Yue.ۥ۟ۦۦ۟<K, V> r3 = r5.f4556
                java.lang.ref.ReferenceQueue r3 = Yue.C1450.m7120(r3)
                r8.<init>(r6, r3)
            L3d:
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.f4554
                boolean r2 = Yue.C1449.m7118(r3, r0, r2, r8)
                if (r2 != 0) goto L57
                goto L9
            L46:
                java.lang.Object r2 = r2.get()
                boolean r3 = Yue.C3329.m13897(r6, r2)
                if (r3 == 0) goto L6f
                if (r1 == 0) goto L57
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = Yue.C1450.C1451.f4550
                r6.decrementAndGet(r5)
            L57:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r5.f4555
                java.lang.Object r6 = r6.get(r0)
                boolean r8 = r6 instanceof Yue.C3906
                if (r8 == 0) goto L66
                Yue.ۥۢ۠ۦۢ r6 = Yue.C1457.m7137()
                return r6
            L66:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r5.f4555
                boolean r8 = Yue.C1449.m7118(r8, r0, r6, r7)
                if (r8 == 0) goto L57
                return r6
            L6f:
                if (r2 != 0) goto L74
                r5.m7133(r0)
            L74:
                if (r0 != 0) goto L78
                int r0 = r5.f4551
            L78:
                int r0 = r0 + (-1)
                goto L9
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final Yue.C1450<K, V>.C1451 m7132() {
                r8 = this;
            L0:
                Yue.ۥ۟ۦۦ۟<K, V> r0 = r8.f4556
                int r0 = r0.size()
                r1 = 4
                int r0 = Yue.C5196.m19514(r0, r1)
                int r0 = java.lang.Integer.highestOneBit(r0)
                int r0 = r0 * r1
                Yue.ۥ۟ۦۦ۟$ۥ r1 = new Yue.ۥ۟ۦۦ۟$ۥ
                Yue.ۥ۟ۦۦ۟<K, V> r2 = r8.f4556
                r1.<init>(r2, r0)
                int r0 = r8.f4551
                r2 = 0
            L1a:
                if (r2 >= r0) goto L5f
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r8.f4554
                java.lang.Object r3 = r3.get(r2)
                Yue.ۥ۠ۤۢ r3 = (Yue.C2987) r3
                if (r3 == 0) goto L2b
                java.lang.Object r4 = r3.get()
                goto L2c
            L2b:
                r4 = 0
            L2c:
                if (r3 == 0) goto L33
                if (r4 != 0) goto L33
                r8.m7133(r2)
            L33:
                java.util.concurrent.atomic.AtomicReferenceArray r5 = r8.f4555
                java.lang.Object r5 = r5.get(r2)
                boolean r6 = r5 instanceof Yue.C3906
                if (r6 == 0) goto L42
                Yue.ۥ۠ۨۨۡ r5 = (Yue.C3906) r5
                java.lang.Object r5 = r5.f12445
                goto L4e
            L42:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r8.f4555
                Yue.ۥ۠ۨۨۡ r7 = Yue.C1457.m7138(r5)
                boolean r6 = Yue.C1449.m7118(r6, r2, r5, r7)
                if (r6 == 0) goto L33
            L4e:
                if (r4 == 0) goto L5c
                if (r5 == 0) goto L5c
                java.lang.Object r3 = r1.m7131(r4, r5, r3)
                Yue.ۥۢ۠ۦۢ r4 = Yue.C1457.m7137()
                if (r3 == r4) goto L0
            L5c:
                int r2 = r2 + 1
                goto L1a
            L5f:
                return r1
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m7133(int r4) {
                r3 = this;
            L0:
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r3.f4555
                java.lang.Object r0 = r0.get(r4)
                if (r0 != 0) goto L9
                return
            L9:
                boolean r1 = r0 instanceof Yue.C3906
                if (r1 == 0) goto Le
                return
            Le:
                java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.f4555
                r2 = 0
                boolean r0 = Yue.C1449.m7118(r1, r4, r0, r2)
                if (r0 == 0) goto L0
                Yue.ۥ۟ۦۦ۟<K, V> r4 = r3.f4556
                Yue.C1450.m7119(r4)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۦ۟$ۥ۟, reason: contains not printable characters */
    public static final class C1453<K, V> implements java.util.Map.Entry<K, V>, Yue.InterfaceC3449.InterfaceC3450 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final K f4562;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final V f4563;

        public C1453(K r1, V r2) {
                r0 = this;
                r0.<init>()
                r0.f4562 = r1
                r0.f4563 = r2
                return
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.f4562
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.f4563
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r1) {
                r0 = this;
                Yue.C1457.m7139()
                Yue.ۥ۠ۦۧۤ r1 = new Yue.ۥ۠ۦۧۤ
                r1.<init>()
                throw r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۦ۟$ۥ۟۟, reason: contains not printable characters */
    public final class C1454<E> extends Yue.AbstractC0071<E> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.InterfaceC2839<K, V, E> f4564;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1450<K, V> f4565;

        public C1454(@Yue.InterfaceC4418 Yue.C1450 r1, Yue.InterfaceC2839<? super K, ? super V, ? extends E> r2) {
                r0 = this;
                r0.f4565 = r1
                r0.<init>()
                r0.f4564 = r2
                return
        }

        @Override // Yue.AbstractC0071, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E r1) {
                r0 = this;
                Yue.C1457.m7139()
                Yue.ۥ۠ۦۧۤ r1 = new Yue.ۥ۠ۦۧۤ
                r1.<init>()
                throw r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @Yue.InterfaceC4418
        public java.util.Iterator<E> iterator() {
                r2 = this;
                Yue.ۥ۟ۦۦ۟<K, V> r0 = r2.f4565
                java.lang.Object r0 = r0.core
                Yue.ۥ۟ۦۦ۟$ۥ r0 = (Yue.C1450.C1451) r0
                Yue.ۥۣ۠ۢۢ<K, V, E> r1 = r2.f4564
                java.util.Iterator r0 = r0.m7130(r1)
                return r0
        }

        @Override // Yue.AbstractC0071
        /* JADX INFO: renamed from: ۥ */
        public int mo434() {
                r1 = this;
                Yue.ۥ۟ۦۦ۟<K, V> r0 = r1.f4565
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۦ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C1455 extends Yue.AbstractC3560 implements Yue.InterfaceC2839<K, V, java.util.Map.Entry<K, V>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.C1450.C1455 f4566 = null;

        static {
                Yue.ۥ۟ۦۦ۟$ۥ۟۟۟ r0 = new Yue.ۥ۟ۦۦ۟$ۥ۟۟۟
                r0.<init>()
                Yue.C1450.C1455.f4566 = r0
                return
        }

        public C1455() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map$Entry r1 = r0.m7136(r1, r2)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.util.Map.Entry<K, V> m7136(@Yue.InterfaceC4418 K r2, @Yue.InterfaceC4418 V r3) {
                r1 = this;
                Yue.ۥ۟ۦۦ۟$ۥ۟ r0 = new Yue.ۥ۟ۦۦ۟$ۥ۟
                r0.<init>(r2, r3)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۦ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C1456 extends Yue.AbstractC3560 implements Yue.InterfaceC2839<K, V, K> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.C1450.C1456 f4567 = null;

        static {
                Yue.ۥ۟ۦۦ۟$ۥ۟۟۟۟ r0 = new Yue.ۥ۟ۦۦ۟$ۥ۟۟۟۟
                r0.<init>()
                Yue.C1450.C1456.f4567 = r0
                return
        }

        public C1456() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // Yue.InterfaceC2839
        @Yue.InterfaceC4418
        public final K invoke(@Yue.InterfaceC4418 K r1, @Yue.InterfaceC4418 V r2) {
                r0 = this;
                return r1
        }
    }

    static {
            java.lang.Class<Yue.ۥ۟ۦۦ۟> r0 = Yue.C1450.class
            java.lang.String r1 = "_size"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            Yue.C1450.f4548 = r0
            return
    }

    public C1450() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public C1450(boolean r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2._size = r0
            Yue.ۥ۟ۦۦ۟$ۥ r0 = new Yue.ۥ۟ۦۦ۟$ۥ
            r1 = 16
            r0.<init>(r2, r1)
            r2.core = r0
            if (r3 == 0) goto L17
            java.lang.ref.ReferenceQueue r3 = new java.lang.ref.ReferenceQueue
            r3.<init>()
            goto L18
        L17:
            r3 = 0
        L18:
            r2.f4549 = r3
            return
    }

    public /* synthetic */ C1450(boolean r1, int r2, Yue.C1769 r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ void m7119(Yue.C1450 r0) {
            r0.m7122()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.ref.ReferenceQueue m7120(Yue.C1450 r0) {
            java.lang.ref.ReferenceQueue<K> r0 = r0.f4549
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r2 = this;
            java.util.Set r0 = r2.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            r2.remove(r1)
            goto L8
        L16:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Yue.InterfaceC4543
    public V get(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.Object r0 = r1.core
            Yue.ۥ۟ۦۦ۟$ۥ r0 = (Yue.C1450.C1451) r0
            java.lang.Object r2 = r0.m7128(r2)
            return r2
    }

    @Override // Yue.AbstractC0070, java.util.AbstractMap, java.util.Map
    @Yue.InterfaceC4543
    public V put(@Yue.InterfaceC4418 K r8, @Yue.InterfaceC4418 V r9) {
            r7 = this;
            java.lang.Object r0 = r7.core
            r1 = r0
            Yue.ۥ۟ۦۦ۟$ۥ r1 = (Yue.C1450.C1451) r1
            r5 = 4
            r6 = 0
            r4 = 0
            r2 = r8
            r3 = r9
            java.lang.Object r0 = Yue.C1450.C1451.m7126(r1, r2, r3, r4, r5, r6)
            Yue.ۥۢ۠ۦۢ r1 = Yue.C1457.m7137()
            if (r0 != r1) goto L18
            java.lang.Object r0 = r7.m7123(r8, r9)
        L18:
            if (r0 != 0) goto L1f
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = Yue.C1450.f4548
            r8.incrementAndGet(r7)
        L1f:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Yue.InterfaceC4543
    public V remove(@Yue.InterfaceC4543 java.lang.Object r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = r8.core
            r2 = r1
            Yue.ۥ۟ۦۦ۟$ۥ r2 = (Yue.C1450.C1451) r2
            r6 = 4
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = r9
            java.lang.Object r1 = Yue.C1450.C1451.m7126(r2, r3, r4, r5, r6, r7)
            Yue.ۥۢ۠ۦۢ r2 = Yue.C1457.m7137()
            if (r1 != r2) goto L1c
            java.lang.Object r1 = r8.m7123(r9, r0)
        L1c:
            if (r1 == 0) goto L23
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r9 = Yue.C1450.f4548
            r9.decrementAndGet(r8)
        L23:
            return r1
    }

    @Override // Yue.AbstractC0070
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public java.util.Set<java.util.Map.Entry<K, V>> mo430() {
            r2 = this;
            Yue.ۥ۟ۦۦ۟$ۥ۟۟ r0 = new Yue.ۥ۟ۦۦ۟$ۥ۟۟
            Yue.ۥ۟ۦۦ۟$ۥ۟۟۟ r1 = Yue.C1450.C1455.f4566
            r0.<init>(r2, r1)
            return r0
    }

    @Override // Yue.AbstractC0070
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ */
    public java.util.Set<K> mo431() {
            r2 = this;
            Yue.ۥ۟ۦۦ۟$ۥ۟۟ r0 = new Yue.ۥ۟ۦۦ۟$ۥ۟۟
            Yue.ۥ۟ۦۦ۟$ۥ۟۟۟۟ r1 = Yue.C1450.C1456.f4567
            r0.<init>(r2, r1)
            return r0
    }

    @Override // Yue.AbstractC0070
    /* JADX INFO: renamed from: ۥ۟۟ */
    public int mo432() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m7121(Yue.C2987<?> r2) {
            r1 = this;
            java.lang.Object r0 = r1.core
            Yue.ۥ۟ۦۦ۟$ۥ r0 = (Yue.C1450.C1451) r0
            r0.m7127(r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m7122() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.C1450.f4548
            r0.decrementAndGet(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final synchronized V m7123(K r8, V r9) {
            r7 = this;
            monitor-enter(r7)
            java.lang.Object r0 = r7.core     // Catch: java.lang.Throwable -> L1e
            Yue.ۥ۟ۦۦ۟$ۥ r0 = (Yue.C1450.C1451) r0     // Catch: java.lang.Throwable -> L1e
        L5:
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r0
            r2 = r8
            r3 = r9
            java.lang.Object r1 = Yue.C1450.C1451.m7126(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1e
            Yue.ۥۢ۠ۦۢ r2 = Yue.C1457.m7137()     // Catch: java.lang.Throwable -> L1e
            if (r1 == r2) goto L17
            monitor-exit(r7)
            return r1
        L17:
            Yue.ۥ۟ۦۦ۟$ۥ r0 = r0.m7132()     // Catch: java.lang.Throwable -> L1e
            r7.core = r0     // Catch: java.lang.Throwable -> L1e
            goto L5
        L1e:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1e
            throw r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m7124() {
            r2 = this;
            java.lang.ref.ReferenceQueue<K> r0 = r2.f4549
            if (r0 == 0) goto L22
        L4:
            java.lang.ref.ReferenceQueue<K> r0 = r2.f4549     // Catch: java.lang.InterruptedException -> L1a
            java.lang.ref.Reference r0 = r0.remove()     // Catch: java.lang.InterruptedException -> L1a
            if (r0 == 0) goto L12
            Yue.ۥ۠ۤۢ r0 = (Yue.C2987) r0     // Catch: java.lang.InterruptedException -> L1a
            r2.m7121(r0)     // Catch: java.lang.InterruptedException -> L1a
            goto L4
        L12:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.InterruptedException -> L1a
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>"
            r0.<init>(r1)     // Catch: java.lang.InterruptedException -> L1a
            throw r0     // Catch: java.lang.InterruptedException -> L1a
        L1a:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must be created with weakRefQueue = true"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
