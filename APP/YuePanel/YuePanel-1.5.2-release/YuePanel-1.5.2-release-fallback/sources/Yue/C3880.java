package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,697:1\n1#2:698\n*E\n"})
public final class C3880<K, V> implements java.util.Map<K, V>, java.io.Serializable, Yue.InterfaceC3449 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3880.C3881 f12400 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f12401 = -1640531527;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f12402 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f12403 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f12404 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3880 f12405 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public K[] f12406;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public V[] f12407;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public int[] f12408;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public int[] f12409;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f12410;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f12411;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f12412;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f12413;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C3888<K> f12414;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C3889<V> f12415;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C3887<K, V> f12416;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean f12417;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۦۨ$ۥ, reason: contains not printable characters */
    public static final class C3881 {
        public C3881() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C3881(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int m15680(Yue.C3880.C3881 r0, int r1) {
                int r0 = r0.m15682(r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final /* synthetic */ int m15681(Yue.C3880.C3881 r0, int r1) {
                int r0 = r0.m15683(r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m15682(int r2) {
                r1 = this;
                r0 = 1
                int r2 = Yue.C5196.m19514(r2, r0)
                int r2 = r2 * 3
                int r2 = java.lang.Integer.highestOneBit(r2)
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int m15683(int r1) {
                r0 = this;
                int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
                int r1 = r1 + 1
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final Yue.C3880 m15684() {
                r1 = this;
                Yue.ۥ۠ۨۦۨ r0 = Yue.C3880.m15640()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۦۨ$ۥ۟, reason: contains not printable characters */
    public static final class C3882<K, V> extends Yue.C3880.C3884<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>>, Yue.InterfaceC3446 {
        public C3882(@Yue.InterfaceC4418 Yue.C3880<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "map"
                Yue.C3329.m13906(r2, r0)
                r1.<init>(r2)
                return
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                Yue.ۥ۠ۨۦۨ$ۥ۟۟ r0 = r1.m15685()
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public Yue.C3880.C3883<K, V> m15685() {
                r3 = this;
                int r0 = r3.m15688()
                Yue.ۥ۠ۨۦۨ r1 = r3.m15690()
                int r1 = Yue.C3880.m15642(r1)
                if (r0 >= r1) goto L2b
                int r0 = r3.m15688()
                int r1 = r0 + 1
                r3.m15692(r1)
                r3.m15693(r0)
                Yue.ۥ۠ۨۦۨ$ۥ۟۟ r0 = new Yue.ۥ۠ۨۦۨ$ۥ۟۟
                Yue.ۥ۠ۨۦۨ r1 = r3.m15690()
                int r2 = r3.m15689()
                r0.<init>(r1, r2)
                r3.m15691()
                return r0
            L2b:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m15686(@Yue.InterfaceC4418 java.lang.StringBuilder r4) {
                r3 = this;
                java.lang.String r0 = "sb"
                Yue.C3329.m13906(r4, r0)
                int r0 = r3.m15688()
                Yue.ۥ۠ۨۦۨ r1 = r3.m15690()
                int r1 = Yue.C3880.m15642(r1)
                if (r0 >= r1) goto L6b
                int r0 = r3.m15688()
                int r1 = r0 + 1
                r3.m15692(r1)
                r3.m15693(r0)
                Yue.ۥ۠ۨۦۨ r0 = r3.m15690()
                java.lang.Object[] r0 = Yue.C3880.m15641(r0)
                int r1 = r3.m15689()
                r0 = r0[r1]
                Yue.ۥ۠ۨۦۨ r1 = r3.m15690()
                boolean r1 = Yue.C3329.m13897(r0, r1)
                java.lang.String r2 = "(this Map)"
                if (r1 == 0) goto L3d
                r4.append(r2)
                goto L40
            L3d:
                r4.append(r0)
            L40:
                r0 = 61
                r4.append(r0)
                Yue.ۥ۠ۨۦۨ r0 = r3.m15690()
                java.lang.Object[] r0 = Yue.C3880.m15644(r0)
                Yue.C3329.m13903(r0)
                int r1 = r3.m15689()
                r0 = r0[r1]
                Yue.ۥ۠ۨۦۨ r1 = r3.m15690()
                boolean r1 = Yue.C3329.m13897(r0, r1)
                if (r1 == 0) goto L64
                r4.append(r2)
                goto L67
            L64:
                r4.append(r0)
            L67:
                r3.m15691()
                return
            L6b:
                java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
                r4.<init>()
                throw r4
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final int m15687() {
                r4 = this;
                int r0 = r4.m15688()
                Yue.ۥ۠ۨۦۨ r1 = r4.m15690()
                int r1 = Yue.C3880.m15642(r1)
                if (r0 >= r1) goto L4d
                int r0 = r4.m15688()
                int r1 = r0 + 1
                r4.m15692(r1)
                r4.m15693(r0)
                Yue.ۥ۠ۨۦۨ r0 = r4.m15690()
                java.lang.Object[] r0 = Yue.C3880.m15641(r0)
                int r1 = r4.m15689()
                r0 = r0[r1]
                r1 = 0
                if (r0 == 0) goto L30
                int r0 = r0.hashCode()
                goto L31
            L30:
                r0 = r1
            L31:
                Yue.ۥ۠ۨۦۨ r2 = r4.m15690()
                java.lang.Object[] r2 = Yue.C3880.m15644(r2)
                Yue.C3329.m13903(r2)
                int r3 = r4.m15689()
                r2 = r2[r3]
                if (r2 == 0) goto L48
                int r1 = r2.hashCode()
            L48:
                r0 = r0 ^ r1
                r4.m15691()
                return r0
            L4d:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۦۨ$ۥ۟۟, reason: contains not printable characters */
    public static final class C3883<K, V> implements java.util.Map.Entry<K, V>, Yue.InterfaceC3449.InterfaceC3450 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.C3880<K, V> f12418;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final int f12419;

        public C3883(@Yue.InterfaceC4418 Yue.C3880<K, V> r2, int r3) {
                r1 = this;
                java.lang.String r0 = "map"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f12418 = r2
                r1.f12419 = r3
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                if (r0 == 0) goto L24
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r0 = r3.getKey()
                java.lang.Object r1 = r2.getKey()
                boolean r0 = Yue.C3329.m13897(r0, r1)
                if (r0 == 0) goto L24
                java.lang.Object r3 = r3.getValue()
                java.lang.Object r0 = r2.getValue()
                boolean r3 = Yue.C3329.m13897(r3, r0)
                if (r3 == 0) goto L24
                r3 = 1
                goto L25
            L24:
                r3 = 0
            L25:
                return r3
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r2 = this;
                Yue.ۥ۠ۨۦۨ<K, V> r0 = r2.f12418
                java.lang.Object[] r0 = Yue.C3880.m15641(r0)
                int r1 = r2.f12419
                r0 = r0[r1]
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r2 = this;
                Yue.ۥ۠ۨۦۨ<K, V> r0 = r2.f12418
                java.lang.Object[] r0 = Yue.C3880.m15644(r0)
                Yue.C3329.m13903(r0)
                int r1 = r2.f12419
                r0 = r0[r1]
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r3 = this;
                java.lang.Object r0 = r3.getKey()
                r1 = 0
                if (r0 == 0) goto Lc
                int r0 = r0.hashCode()
                goto Ld
            Lc:
                r0 = r1
            Ld:
                java.lang.Object r2 = r3.getValue()
                if (r2 == 0) goto L17
                int r1 = r2.hashCode()
            L17:
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r4) {
                r3 = this;
                Yue.ۥ۠ۨۦۨ<K, V> r0 = r3.f12418
                r0.m15652()
                Yue.ۥ۠ۨۦۨ<K, V> r0 = r3.f12418
                java.lang.Object[] r0 = Yue.C3880.m15639(r0)
                int r1 = r3.f12419
                r2 = r0[r1]
                r0[r1] = r4
                return r2
        }

        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r2.getKey()
                r0.append(r1)
                r1 = 61
                r0.append(r1)
                java.lang.Object r1 = r2.getValue()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۦۨ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,697:1\n1#2:698\n*E\n"})
    public static class C3884<K, V> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.C3880<K, V> f12420;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f12421;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f12422;

        public C3884(@Yue.InterfaceC4418 Yue.C3880<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "map"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f12420 = r2
                r2 = -1
                r1.f12422 = r2
                r1.m15691()
                return
        }

        public final boolean hasNext() {
                r2 = this;
                int r0 = r2.f12421
                Yue.ۥ۠ۨۦۨ<K, V> r1 = r2.f12420
                int r1 = Yue.C3880.m15642(r1)
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public final void remove() {
                r3 = this;
                int r0 = r3.f12422
                r1 = -1
                if (r0 == r1) goto L14
                Yue.ۥ۠ۨۦۨ<K, V> r0 = r3.f12420
                r0.m15652()
                Yue.ۥ۠ۨۦۨ<K, V> r0 = r3.f12420
                int r2 = r3.f12422
                Yue.C3880.m15645(r0, r2)
                r3.f12422 = r1
                return
            L14:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Call next() before removing element from the iterator."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int m15688() {
                r1 = this;
                int r0 = r1.f12421
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int m15689() {
                r1 = this;
                int r0 = r1.f12422
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C3880<K, V> m15690() {
                r1 = this;
                Yue.ۥ۠ۨۦۨ<K, V> r0 = r1.f12420
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m15691() {
                r2 = this;
            L0:
                int r0 = r2.f12421
                Yue.ۥ۠ۨۦۨ<K, V> r1 = r2.f12420
                int r1 = Yue.C3880.m15642(r1)
                if (r0 >= r1) goto L1b
                Yue.ۥ۠ۨۦۨ<K, V> r0 = r2.f12420
                int[] r0 = Yue.C3880.m15643(r0)
                int r1 = r2.f12421
                r0 = r0[r1]
                if (r0 >= 0) goto L1b
                int r1 = r1 + 1
                r2.f12421 = r1
                goto L0
            L1b:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m15692(int r1) {
                r0 = this;
                r0.f12421 = r1
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m15693(int r1) {
                r0 = this;
                r0.f12422 = r1
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۦۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C3885<K, V> extends Yue.C3880.C3884<K, V> implements java.util.Iterator<K>, Yue.InterfaceC3446 {
        public C3885(@Yue.InterfaceC4418 Yue.C3880<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "map"
                Yue.C3329.m13906(r2, r0)
                r1.<init>(r2)
                return
        }

        @Override // java.util.Iterator
        public K next() {
                r2 = this;
                int r0 = r2.m15688()
                Yue.ۥ۠ۨۦۨ r1 = r2.m15690()
                int r1 = Yue.C3880.m15642(r1)
                if (r0 >= r1) goto L2c
                int r0 = r2.m15688()
                int r1 = r0 + 1
                r2.m15692(r1)
                r2.m15693(r0)
                Yue.ۥ۠ۨۦۨ r0 = r2.m15690()
                java.lang.Object[] r0 = Yue.C3880.m15641(r0)
                int r1 = r2.m15689()
                r0 = r0[r1]
                r2.m15691()
                return r0
            L2c:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۦۨ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C3886<K, V> extends Yue.C3880.C3884<K, V> implements java.util.Iterator<V>, Yue.InterfaceC3446 {
        public C3886(@Yue.InterfaceC4418 Yue.C3880<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "map"
                Yue.C3329.m13906(r2, r0)
                r1.<init>(r2)
                return
        }

        @Override // java.util.Iterator
        public V next() {
                r2 = this;
                int r0 = r2.m15688()
                Yue.ۥ۠ۨۦۨ r1 = r2.m15690()
                int r1 = Yue.C3880.m15642(r1)
                if (r0 >= r1) goto L2f
                int r0 = r2.m15688()
                int r1 = r0 + 1
                r2.m15692(r1)
                r2.m15693(r0)
                Yue.ۥ۠ۨۦۨ r0 = r2.m15690()
                java.lang.Object[] r0 = Yue.C3880.m15644(r0)
                Yue.C3329.m13903(r0)
                int r1 = r2.m15689()
                r0 = r0[r1]
                r2.m15691()
                return r0
            L2f:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    static {
            Yue.ۥ۠ۨۦۨ$ۥ r0 = new Yue.ۥ۠ۨۦۨ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C3880.f12400 = r0
            Yue.ۥ۠ۨۦۨ r0 = new Yue.ۥ۠ۨۦۨ
            r1 = 0
            r0.<init>(r1)
            r1 = 1
            r0.f12417 = r1
            Yue.C3880.f12405 = r0
            return
    }

    public C3880() {
            r1 = this;
            r0 = 8
            r1.<init>(r0)
            return
    }

    public C3880(int r8) {
            r7 = this;
            java.lang.Object[] r1 = Yue.C3627.m14670(r8)
            int[] r3 = new int[r8]
            Yue.ۥ۠ۨۦۨ$ۥ r0 = Yue.C3880.f12400
            int r8 = Yue.C3880.C3881.m15680(r0, r8)
            int[] r4 = new int[r8]
            r5 = 2
            r6 = 0
            r2 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public C3880(K[] r1, V[] r2, int[] r3, int[] r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.f12406 = r1
            r0.f12407 = r2
            r0.f12408 = r3
            r0.f12409 = r4
            r0.f12410 = r5
            r0.f12411 = r6
            Yue.ۥ۠ۨۦۨ$ۥ r1 = Yue.C3880.f12400
            int r2 = r0.m15662()
            int r1 = Yue.C3880.C3881.m15681(r1, r2)
            r0.f12412 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object[] m15639(Yue.C3880 r0) {
            java.lang.Object[] r0 = r0.m15650()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C3880 m15640() {
            Yue.ۥ۠ۨۦۨ r0 = Yue.C3880.f12405
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object[] m15641(Yue.C3880 r0) {
            K[] r0 = r0.f12406
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int m15642(Yue.C3880 r0) {
            int r0 = r0.f12411
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int[] m15643(Yue.C3880 r0) {
            int[] r0 = r0.f12408
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object[] m15644(Yue.C3880 r0) {
            V[] r0 = r0.f12407
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final /* synthetic */ void m15645(Yue.C3880 r0, int r1) {
            r0.m15676(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    private final void m15646(int r3) {
            r2 = this;
            if (r3 < 0) goto L45
            int r0 = r2.m15660()
            if (r3 <= r0) goto L44
            int r0 = r2.m15660()
            int r0 = r0 * 3
            int r0 = r0 / 2
            if (r3 <= r0) goto L13
            goto L14
        L13:
            r3 = r0
        L14:
            K[] r0 = r2.f12406
            java.lang.Object[] r0 = Yue.C3627.m14671(r0, r3)
            r2.f12406 = r0
            V[] r0 = r2.f12407
            if (r0 == 0) goto L25
            java.lang.Object[] r0 = Yue.C3627.m14671(r0, r3)
            goto L26
        L25:
            r0 = 0
        L26:
            r2.f12407 = r0
            int[] r0 = r2.f12408
            int[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r1 = "copyOf(this, newSize)"
            Yue.C3329.m13905(r0, r1)
            r2.f12408 = r0
            Yue.ۥ۠ۨۦۨ$ۥ r0 = Yue.C3880.f12400
            int r3 = Yue.C3880.C3881.m15680(r0, r3)
            int r0 = r2.m15662()
            if (r3 <= r0) goto L44
            r2.m15672(r3)
        L44:
            return
        L45:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError
            r3.<init>()
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    private final void m15647(int r2) {
            r1 = this;
            boolean r0 = r1.m15678(r2)
            if (r0 == 0) goto Le
            int r2 = r1.m15662()
            r1.m15672(r2)
            goto L14
        Le:
            int r0 = r1.f12411
            int r0 = r0 + r2
            r1.m15646(r0)
        L14:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    private final java.lang.Object m15648() {
            r2 = this;
            boolean r0 = r2.f12417
            if (r0 == 0) goto La
            Yue.ۥۣۡۨ۠ r0 = new Yue.ۥۣۡۨ۠
            r0.<init>(r2)
            return r0
        La:
            java.io.NotSerializableException r0 = new java.io.NotSerializableException
            java.lang.String r1 = "The map cannot be serialized while it is being built."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public void clear() {
            r6 = this;
            r6.m15652()
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            int r1 = r6.f12411
            int r1 = r1 + (-1)
            r2 = 0
            r0.<init>(r2, r1)
            Yue.ۥ۠ۥۣۥ r0 = r0.m13740()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            int r1 = r0.mo2006()
            int[] r3 = r6.f12408
            r4 = r3[r1]
            if (r4 < 0) goto L11
            int[] r5 = r6.f12409
            r5[r4] = r2
            r4 = -1
            r3[r1] = r4
            goto L11
        L29:
            K[] r0 = r6.f12406
            int r1 = r6.f12411
            Yue.C3627.m14673(r0, r2, r1)
            V[] r0 = r6.f12407
            if (r0 == 0) goto L39
            int r1 = r6.f12411
            Yue.C3627.m14673(r0, r2, r1)
        L39:
            r6.f12413 = r2
            r6.f12411 = r2
            return
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.m15658(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.m15659(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set r0 = r1.m15661()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L11
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto Lf
            java.util.Map r2 = (java.util.Map) r2
            boolean r2 = r1.m15656(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    @Override // java.util.Map
    @Yue.InterfaceC4543
    public V get(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.m15658(r2)
            if (r2 >= 0) goto L8
            r2 = 0
            return r2
        L8:
            V[] r0 = r1.f12407
            Yue.C3329.m13903(r0)
            r2 = r0[r2]
            return r2
    }

    @Override // java.util.Map
    public int hashCode() {
            r3 = this;
            Yue.ۥ۠ۨۦۨ$ۥ۟ r0 = r3.m15657()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L11
            int r2 = r0.m15687()
            int r1 = r1 + r2
            goto L5
        L11:
            return r1
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set r0 = r1.m15663()
            return r0
    }

    @Override // java.util.Map
    @Yue.InterfaceC4543
    public V put(K r3, V r4) {
            r2 = this;
            r2.m15652()
            int r3 = r2.m15649(r3)
            java.lang.Object[] r0 = r2.m15650()
            if (r3 >= 0) goto L15
            int r3 = -r3
            int r3 = r3 + (-1)
            r1 = r0[r3]
            r0[r3] = r4
            return r1
        L15:
            r0[r3] = r4
            r3 = 0
            return r3
    }

    @Override // java.util.Map
    public void putAll(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "from"
            Yue.C3329.m13906(r2, r0)
            r1.m15652()
            java.util.Set r2 = r2.entrySet()
            r1.m15669(r2)
            return
    }

    @Override // java.util.Map
    @Yue.InterfaceC4543
    public V remove(java.lang.Object r3) {
            r2 = this;
            int r3 = r2.m15675(r3)
            if (r3 >= 0) goto L8
            r3 = 0
            return r3
        L8:
            V[] r0 = r2.f12407
            Yue.C3329.m13903(r0)
            r1 = r0[r3]
            Yue.C3627.m14672(r0, r3)
            return r1
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.m15664()
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.size()
            int r1 = r1 * 3
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            Yue.ۥ۠ۨۦۨ$ۥ۟ r1 = r4.m15657()
            r2 = 0
        L17:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2a
            if (r2 <= 0) goto L24
            java.lang.String r3 = ", "
            r0.append(r3)
        L24:
            r1.m15686(r0)
            int r2 = r2 + 1
            goto L17
        L2a:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "sb.toString()"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = r1.m15665()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int m15649(K r8) {
            r7 = this;
            r7.m15652()
        L3:
            int r0 = r7.m15666(r8)
            int r1 = r7.f12410
            int r1 = r1 * 2
            int r2 = r7.m15662()
            int r2 = r2 / 2
            int r1 = Yue.C5196.m19521(r1, r2)
            r2 = 0
        L16:
            int[] r3 = r7.f12409
            r3 = r3[r0]
            r4 = 1
            if (r3 > 0) goto L49
            int r1 = r7.f12411
            int r3 = r7.m15660()
            if (r1 < r3) goto L29
            r7.m15647(r4)
            goto L3
        L29:
            int r1 = r7.f12411
            int r3 = r1 + 1
            r7.f12411 = r3
            K[] r5 = r7.f12406
            r5[r1] = r8
            int[] r8 = r7.f12408
            r8[r1] = r0
            int[] r8 = r7.f12409
            r8[r0] = r3
            int r8 = r7.size()
            int r8 = r8 + r4
            r7.f12413 = r8
            int r8 = r7.f12410
            if (r2 <= r8) goto L48
            r7.f12410 = r2
        L48:
            return r1
        L49:
            K[] r5 = r7.f12406
            int r6 = r3 + (-1)
            r5 = r5[r6]
            boolean r5 = Yue.C3329.m13897(r5, r8)
            if (r5 == 0) goto L57
            int r8 = -r3
            return r8
        L57:
            int r2 = r2 + 1
            if (r2 <= r1) goto L65
            int r0 = r7.m15662()
            int r0 = r0 * 2
            r7.m15672(r0)
            goto L3
        L65:
            int r3 = r0 + (-1)
            if (r0 != 0) goto L6f
            int r0 = r7.m15662()
            int r0 = r0 - r4
            goto L16
        L6f:
            r0 = r3
            goto L16
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final V[] m15650() {
            r1 = this;
            V[] r0 = r1.f12407
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r1.m15660()
            java.lang.Object[] r0 = Yue.C3627.m14670(r0)
            r1.f12407 = r0
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final java.util.Map<K, V> m15651() {
            r2 = this;
            r2.m15652()
            r0 = 1
            r2.f12417 = r0
            int r0 = r2.size()
            if (r0 <= 0) goto Le
            r0 = r2
            goto L15
        Le:
            Yue.ۥ۠ۨۦۨ r0 = Yue.C3880.f12405
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>"
            Yue.C3329.m13904(r0, r1)
        L15:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m15652() {
            r1 = this;
            boolean r0 = r1.f12417
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m15653() {
            r5 = this;
            V[] r0 = r5.f12407
            r1 = 0
            r2 = r1
        L4:
            int r3 = r5.f12411
            if (r1 >= r3) goto L1f
            int[] r3 = r5.f12408
            r3 = r3[r1]
            if (r3 < 0) goto L1c
            K[] r3 = r5.f12406
            r4 = r3[r1]
            r3[r2] = r4
            if (r0 == 0) goto L1a
            r3 = r0[r1]
            r0[r2] = r3
        L1a:
            int r2 = r2 + 1
        L1c:
            int r1 = r1 + 1
            goto L4
        L1f:
            K[] r1 = r5.f12406
            Yue.C3627.m14673(r1, r2, r3)
            if (r0 == 0) goto L2b
            int r1 = r5.f12411
            Yue.C3627.m14673(r0, r2, r1)
        L2b:
            r5.f12411 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final boolean m15654(@Yue.InterfaceC4418 java.util.Collection<?> r3) {
            r2 = this;
            java.lang.String r0 = "m"
            Yue.C3329.m13906(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r3.next()
            r1 = 0
            if (r0 == 0) goto L1f
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.ClassCastException -> L1f
            boolean r0 = r2.m15655(r0)     // Catch: java.lang.ClassCastException -> L1f
            if (r0 != 0) goto L9
        L1f:
            return r1
        L20:
            r3 = 1
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final boolean m15655(@Yue.InterfaceC4418 java.util.Map.Entry<? extends K, ? extends V> r3) {
            r2 = this;
            java.lang.String r0 = "entry"
            Yue.C3329.m13906(r3, r0)
            java.lang.Object r0 = r3.getKey()
            int r0 = r2.m15658(r0)
            if (r0 >= 0) goto L11
            r3 = 0
            return r3
        L11:
            V[] r1 = r2.f12407
            Yue.C3329.m13903(r1)
            r0 = r1[r0]
            java.lang.Object r3 = r3.getValue()
            boolean r3 = Yue.C3329.m13897(r0, r3)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final boolean m15656(java.util.Map<?, ?> r3) {
            r2 = this;
            int r0 = r2.size()
            int r1 = r3.size()
            if (r0 != r1) goto L16
            java.util.Set r3 = r3.entrySet()
            boolean r3 = r2.m15654(r3)
            if (r3 == 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final Yue.C3880.C3882<K, V> m15657() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ$ۥ۟ r0 = new Yue.ۥ۠ۨۦۨ$ۥ۟
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int m15658(K r6) {
            r5 = this;
            int r0 = r5.m15666(r6)
            int r1 = r5.f12410
        L6:
            int[] r2 = r5.f12409
            r2 = r2[r0]
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            if (r2 <= 0) goto L1d
            K[] r4 = r5.f12406
            int r2 = r2 + (-1)
            r4 = r4[r2]
            boolean r4 = Yue.C3329.m13897(r4, r6)
            if (r4 == 0) goto L1d
            return r2
        L1d:
            int r1 = r1 + r3
            if (r1 >= 0) goto L21
            return r3
        L21:
            int r2 = r0 + (-1)
            if (r0 != 0) goto L2c
            int r0 = r5.m15662()
            int r0 = r0 + (-1)
            goto L6
        L2c:
            r0 = r2
            goto L6
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int m15659(V r3) {
            r2 = this;
            int r0 = r2.f12411
        L2:
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L1a
            int[] r1 = r2.f12408
            r1 = r1[r0]
            if (r1 < 0) goto L2
            V[] r1 = r2.f12407
            Yue.C3329.m13903(r1)
            r1 = r1[r0]
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 == 0) goto L2
            return r0
        L1a:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int m15660() {
            r1 = this;
            K[] r0 = r1.f12406
            int r0 = r0.length
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public java.util.Set<java.util.Map.Entry<K, V>> m15661() {
            r1 = this;
            Yue.ۥ۠ۨۧ<K, V> r0 = r1.f12416
            if (r0 != 0) goto Lb
            Yue.ۥ۠ۨۧ r0 = new Yue.ۥ۠ۨۧ
            r0.<init>(r1)
            r1.f12416 = r0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int m15662() {
            r1 = this;
            int[] r0 = r1.f12409
            int r0 = r0.length
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.util.Set<K> m15663() {
            r1 = this;
            Yue.ۥ۠ۨۧ۟<K> r0 = r1.f12414
            if (r0 != 0) goto Lb
            Yue.ۥ۠ۨۧ۟ r0 = new Yue.ۥ۠ۨۧ۟
            r0.<init>(r1)
            r1.f12414 = r0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int m15664() {
            r1 = this;
            int r0 = r1.f12413
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public java.util.Collection<V> m15665() {
            r1 = this;
            Yue.ۥ۠ۨۧ۠<V> r0 = r1.f12415
            if (r0 != 0) goto Lb
            Yue.ۥ۠ۨۧ۠ r0 = new Yue.ۥ۠ۨۧ۠
            r0.<init>(r1)
            r1.f12415 = r0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final int m15666(K r2) {
            r1 = this;
            if (r2 == 0) goto L7
            int r2 = r2.hashCode()
            goto L8
        L7:
            r2 = 0
        L8:
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r2 = r2 * r0
            int r0 = r1.f12412
            int r2 = r2 >>> r0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final boolean m15667() {
            r1 = this;
            boolean r0 = r1.f12417
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final Yue.C3880.C3885<K, V> m15668() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ$ۥ۟۟۟۟ r0 = new Yue.ۥ۠ۨۦۨ$ۥ۟۟۟۟
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final boolean m15669(java.util.Collection<? extends java.util.Map.Entry<? extends K, ? extends V>> r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r3.size()
            r2.m15647(r0)
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            boolean r0 = r2.m15670(r0)
            if (r0 == 0) goto L13
            r1 = 1
            goto L13
        L27:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final boolean m15670(java.util.Map.Entry<? extends K, ? extends V> r6) {
            r5 = this;
            java.lang.Object r0 = r6.getKey()
            int r0 = r5.m15649(r0)
            java.lang.Object[] r1 = r5.m15650()
            r2 = 1
            if (r0 < 0) goto L16
            java.lang.Object r6 = r6.getValue()
            r1[r0] = r6
            return r2
        L16:
            int r0 = -r0
            int r0 = r0 - r2
            r3 = r1[r0]
            java.lang.Object r4 = r6.getValue()
            boolean r3 = Yue.C3329.m13897(r4, r3)
            if (r3 != 0) goto L2b
            java.lang.Object r6 = r6.getValue()
            r1[r0] = r6
            return r2
        L2b:
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final boolean m15671(int r6) {
            r5 = this;
            K[] r0 = r5.f12406
            r0 = r0[r6]
            int r0 = r5.m15666(r0)
            int r1 = r5.f12410
        La:
            int[] r2 = r5.f12409
            r3 = r2[r0]
            r4 = 1
            if (r3 != 0) goto L1a
            int r1 = r6 + 1
            r2[r0] = r1
            int[] r1 = r5.f12408
            r1[r6] = r0
            return r4
        L1a:
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L20
            r6 = 0
            return r6
        L20:
            int r2 = r0 + (-1)
            if (r0 != 0) goto L2a
            int r0 = r5.m15662()
            int r0 = r0 - r4
            goto La
        L2a:
            r0 = r2
            goto La
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final void m15672(int r3) {
            r2 = this;
            int r0 = r2.f12411
            int r1 = r2.size()
            if (r0 <= r1) goto Lb
            r2.m15653()
        Lb:
            int r0 = r2.m15662()
            r1 = 0
            if (r3 == r0) goto L1f
            int[] r0 = new int[r3]
            r2.f12409 = r0
            Yue.ۥ۠ۨۦۨ$ۥ r0 = Yue.C3880.f12400
            int r3 = Yue.C3880.C3881.m15681(r0, r3)
            r2.f12412 = r3
            goto L28
        L1f:
            int[] r3 = r2.f12409
            int r0 = r2.m15662()
            Yue.C0586.m2237(r3, r1, r1, r0)
        L28:
            int r3 = r2.f12411
            if (r1 >= r3) goto L3e
            int r3 = r1 + 1
            boolean r0 = r2.m15671(r1)
            if (r0 == 0) goto L36
            r1 = r3
            goto L28
        L36:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r3.<init>(r0)
            throw r3
        L3e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final boolean m15673(@Yue.InterfaceC4418 java.util.Map.Entry<? extends K, ? extends V> r4) {
            r3 = this;
            java.lang.String r0 = "entry"
            Yue.C3329.m13906(r4, r0)
            r3.m15652()
            java.lang.Object r0 = r4.getKey()
            int r0 = r3.m15658(r0)
            r1 = 0
            if (r0 >= 0) goto L14
            return r1
        L14:
            V[] r2 = r3.f12407
            Yue.C3329.m13903(r2)
            r2 = r2[r0]
            java.lang.Object r4 = r4.getValue()
            boolean r4 = Yue.C3329.m13897(r2, r4)
            if (r4 != 0) goto L26
            return r1
        L26:
            r3.m15676(r0)
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final void m15674(int r10) {
            r9 = this;
            int r0 = r9.f12410
            int r0 = r0 * 2
            int r1 = r9.m15662()
            int r1 = r1 / 2
            int r0 = Yue.C5196.m19521(r0, r1)
            r1 = 0
            r2 = r0
            r3 = r1
            r0 = r10
        L12:
            int r4 = r10 + (-1)
            if (r10 != 0) goto L1d
            int r10 = r9.m15662()
            int r10 = r10 + (-1)
            goto L1e
        L1d:
            r10 = r4
        L1e:
            int r3 = r3 + 1
            int r4 = r9.f12410
            if (r3 <= r4) goto L29
            int[] r10 = r9.f12409
            r10[r0] = r1
            return
        L29:
            int[] r4 = r9.f12409
            r5 = r4[r10]
            if (r5 != 0) goto L32
            r4[r0] = r1
            return
        L32:
            r6 = -1
            if (r5 >= 0) goto L3a
            r4[r0] = r6
        L37:
            r0 = r10
            r3 = r1
            goto L57
        L3a:
            K[] r4 = r9.f12406
            int r7 = r5 + (-1)
            r4 = r4[r7]
            int r4 = r9.m15666(r4)
            int r4 = r4 - r10
            int r8 = r9.m15662()
            int r8 = r8 + (-1)
            r4 = r4 & r8
            if (r4 < r3) goto L57
            int[] r3 = r9.f12409
            r3[r0] = r5
            int[] r3 = r9.f12408
            r3[r7] = r0
            goto L37
        L57:
            int r2 = r2 + r6
            if (r2 >= 0) goto L12
            int[] r10 = r9.f12409
            r10[r0] = r6
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final int m15675(K r1) {
            r0 = this;
            r0.m15652()
            int r1 = r0.m15658(r1)
            if (r1 >= 0) goto Lb
            r1 = -1
            return r1
        Lb:
            r0.m15676(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final void m15676(int r3) {
            r2 = this;
            K[] r0 = r2.f12406
            Yue.C3627.m14672(r0, r3)
            int[] r0 = r2.f12408
            r0 = r0[r3]
            r2.m15674(r0)
            int[] r0 = r2.f12408
            r1 = -1
            r0[r3] = r1
            int r3 = r2.size()
            int r3 = r3 + r1
            r2.f12413 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final boolean m15677(V r1) {
            r0 = this;
            r0.m15652()
            int r1 = r0.m15659(r1)
            if (r1 >= 0) goto Lb
            r1 = 0
            return r1
        Lb:
            r0.m15676(r1)
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final boolean m15678(int r4) {
            r3 = this;
            int r0 = r3.m15660()
            int r1 = r3.f12411
            int r0 = r0 - r1
            int r2 = r3.size()
            int r1 = r1 - r2
            if (r0 >= r4) goto L1b
            int r0 = r0 + r1
            if (r0 < r4) goto L1b
            int r4 = r3.m15660()
            int r4 = r4 / 4
            if (r1 < r4) goto L1b
            r4 = 1
            goto L1c
        L1b:
            r4 = 0
        L1c:
            return r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final Yue.C3880.C3886<K, V> m15679() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ$ۥ۟۟۟۠ r0 = new Yue.ۥ۠ۨۦۨ$ۥ۟۟۟۠
            r0.<init>(r1)
            return r0
    }
}
