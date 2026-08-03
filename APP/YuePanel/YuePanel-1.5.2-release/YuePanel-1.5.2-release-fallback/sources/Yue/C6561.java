package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.3")
@Yue.InterfaceC3419
@Yue.InterfaceC5840({"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n62#1:87,3\n*E\n"})
@Yue.InterfaceC2314
public final class C6561 implements java.util.Collection<Yue.C6559>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final short[] f22950;

    /* JADX INFO: renamed from: Yue.ۥۢۢۨۥ$ۥ, reason: contains not printable characters */
    public static final class C6562 implements java.util.Iterator<Yue.C6559>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final short[] f22951;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f22952;

        public C6562(@Yue.InterfaceC4418 short[] r2) {
                r1 = this;
                java.lang.String r0 = "array"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f22951 = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f22952
                short[] r1 = r2.f22951
                int r1 = r1.length
                if (r0 >= r1) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Yue.C6559 next() {
                r1 = this;
                short r0 = r1.m25315()
                Yue.ۥۢۢۨۤ r0 = Yue.C6559.m25238(r0)
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public short m25315() {
                r3 = this;
                int r0 = r3.f22952
                short[] r1 = r3.f22951
                int r2 = r1.length
                if (r0 >= r2) goto L12
                int r2 = r0 + 1
                r3.f22952 = r2
                short r0 = r1[r0]
                short r0 = Yue.C6559.m25243(r0)
                return r0
            L12:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                int r1 = r3.f22952
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.<init>(r1)
                throw r0
        }
    }

    @Yue.InterfaceC4986
    public /* synthetic */ C6561(short[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22950 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C6561 m25296(short[] r1) {
            Yue.ۥۢۢۨۥ r0 = new Yue.ۥۢۢۨۥ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static short[] m25297(int r0) {
            short[] r0 = new short[r0]
            short[] r0 = m25298(r0)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static short[] m25298(@Yue.InterfaceC4418 short[] r1) {
            java.lang.String r0 = "storage"
            Yue.C3329.m13906(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m25299(short[] r0, short r1) {
            boolean r0 = Yue.C0595.m2616(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m25300(short[] r3, @Yue.InterfaceC4418 java.util.Collection<Yue.C6559> r4) {
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r4, r0)
            boolean r0 = r4.isEmpty()
            r1 = 1
            if (r0 == 0) goto Ld
            goto L2d
        Ld:
            java.util.Iterator r4 = r4.iterator()
        L11:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r4.next()
            boolean r2 = r0 instanceof Yue.C6559
            if (r2 == 0) goto L2c
            Yue.ۥۢۢۨۤ r0 = (Yue.C6559) r0
            short r0 = r0.m25295()
            boolean r0 = Yue.C0595.m2616(r3, r0)
            if (r0 == 0) goto L2c
            goto L11
        L2c:
            r1 = 0
        L2d:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m25301(short[] r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof Yue.C6561
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            Yue.ۥۢۢۨۥ r3 = (Yue.C6561) r3
            short[] r3 = r3.m25314()
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 != 0) goto L13
            return r1
        L13:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean m25302(short[] r0, short[] r1) {
            boolean r0 = Yue.C3329.m13897(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final short m25303(short[] r0, int r1) {
            short r0 = r0[r1]
            short r0 = Yue.C6559.m25243(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static int m25304(short[] r0) {
            int r0 = r0.length
            return r0
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m25305() {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static int m25306(short[] r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m25307(short[] r0) {
            int r0 = r0.length
            if (r0 != 0) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static java.util.Iterator<Yue.C6559> m25308(short[] r1) {
            Yue.ۥۢۢۨۥ$ۥ r0 = new Yue.ۥۢۢۨۥ$ۥ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final void m25309(short[] r0, int r1, short r2) {
            r0[r1] = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static java.lang.String m25310(short[] r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UShortArray(storage="
            r0.append(r1)
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Yue.C6559 r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends Yue.C6559> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C6559
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            Yue.ۥۢۢۨۤ r2 = (Yue.C6559) r2
            short r2 = r2.m25295()
            boolean r2 = r1.m25312(r2)
            return r2
    }

    @Override // java.util.Collection
    public boolean containsAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            short[] r0 = r1.f22950
            boolean r2 = m25300(r0, r2)
            return r2
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            short[] r0 = r1.f22950
            boolean r2 = m25301(r0, r2)
            return r2
    }

    @Override // java.util.Collection
    public int hashCode() {
            r1 = this;
            short[] r0 = r1.f22950
            int r0 = m25306(r0)
            return r0
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            short[] r0 = r1.f22950
            boolean r0 = m25307(r0)
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    @Yue.InterfaceC4418
    public java.util.Iterator<Yue.C6559> iterator() {
            r1 = this;
            short[] r0 = r1.f22950
            java.util.Iterator r0 = m25308(r0)
            return r0
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ int size() {
            r1 = this;
            int r0 = r1.m25313()
            return r0
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = Yue.C1204.m6175(r1)
            return r0
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object[] r2 = Yue.C1204.m6176(r1, r2)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            short[] r0 = r1.f22950
            java.lang.String r0 = m25310(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean m25311(short r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m25312(short r2) {
            r1 = this;
            short[] r0 = r1.f22950
            boolean r2 = m25299(r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m25313() {
            r1 = this;
            short[] r0 = r1.f22950
            int r0 = m25304(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ short[] m25314() {
            r1 = this;
            short[] r0 = r1.f22950
            return r0
    }
}
