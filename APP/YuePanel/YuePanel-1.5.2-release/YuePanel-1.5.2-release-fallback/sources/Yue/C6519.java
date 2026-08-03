package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.3")
@Yue.InterfaceC3419
@Yue.InterfaceC5840({"SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n62#1:87,3\n*E\n"})
@Yue.InterfaceC2314
public final class C6519 implements java.util.Collection<Yue.C6517>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final byte[] f22902;

    /* JADX INFO: renamed from: Yue.ۥۢۢۥۦ$ۥ, reason: contains not printable characters */
    public static final class C6520 implements java.util.Iterator<Yue.C6517>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final byte[] f22903;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f22904;

        public C6520(@Yue.InterfaceC4418 byte[] r2) {
                r1 = this;
                java.lang.String r0 = "array"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f22903 = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f22904
                byte[] r1 = r2.f22903
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
        public /* bridge */ /* synthetic */ Yue.C6517 next() {
                r1 = this;
                byte r0 = r1.m24870()
                Yue.ۥۢۢۥۥ r0 = Yue.C6517.m24793(r0)
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
        public byte m24870() {
                r3 = this;
                int r0 = r3.f22904
                byte[] r1 = r3.f22903
                int r2 = r1.length
                if (r0 >= r2) goto L12
                int r2 = r0 + 1
                r3.f22904 = r2
                r0 = r1[r0]
                byte r0 = Yue.C6517.m24798(r0)
                return r0
            L12:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                int r1 = r3.f22904
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.<init>(r1)
                throw r0
        }
    }

    @Yue.InterfaceC4986
    public /* synthetic */ C6519(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22902 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C6519 m24851(byte[] r1) {
            Yue.ۥۢۢۥۦ r0 = new Yue.ۥۢۢۥۦ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static byte[] m24852(int r0) {
            byte[] r0 = new byte[r0]
            byte[] r0 = m24853(r0)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static byte[] m24853(@Yue.InterfaceC4418 byte[] r1) {
            java.lang.String r0 = "storage"
            Yue.C3329.m13906(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m24854(byte[] r0, byte r1) {
            boolean r0 = Yue.C0595.m2609(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m24855(byte[] r3, @Yue.InterfaceC4418 java.util.Collection<Yue.C6517> r4) {
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
            boolean r2 = r0 instanceof Yue.C6517
            if (r2 == 0) goto L2c
            Yue.ۥۢۢۥۥ r0 = (Yue.C6517) r0
            byte r0 = r0.m24850()
            boolean r0 = Yue.C0595.m2609(r3, r0)
            if (r0 == 0) goto L2c
            goto L11
        L2c:
            r1 = 0
        L2d:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m24856(byte[] r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof Yue.C6519
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            Yue.ۥۢۢۥۦ r3 = (Yue.C6519) r3
            byte[] r3 = r3.m24869()
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 != 0) goto L13
            return r1
        L13:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean m24857(byte[] r0, byte[] r1) {
            boolean r0 = Yue.C3329.m13897(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final byte m24858(byte[] r0, int r1) {
            r0 = r0[r1]
            byte r0 = Yue.C6517.m24798(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static int m24859(byte[] r0) {
            int r0 = r0.length
            return r0
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m24860() {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static int m24861(byte[] r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m24862(byte[] r0) {
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
    public static java.util.Iterator<Yue.C6517> m24863(byte[] r1) {
            Yue.ۥۢۢۥۦ$ۥ r0 = new Yue.ۥۢۢۥۦ$ۥ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final void m24864(byte[] r0, int r1, byte r2) {
            r0[r1] = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static java.lang.String m24865(byte[] r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UByteArray(storage="
            r0.append(r1)
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Yue.C6517 r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends Yue.C6517> r2) {
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
            boolean r0 = r2 instanceof Yue.C6517
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            Yue.ۥۢۢۥۥ r2 = (Yue.C6517) r2
            byte r2 = r2.m24850()
            boolean r2 = r1.m24867(r2)
            return r2
    }

    @Override // java.util.Collection
    public boolean containsAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            byte[] r0 = r1.f22902
            boolean r2 = m24855(r0, r2)
            return r2
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            byte[] r0 = r1.f22902
            boolean r2 = m24856(r0, r2)
            return r2
    }

    @Override // java.util.Collection
    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.f22902
            int r0 = m24861(r0)
            return r0
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            byte[] r0 = r1.f22902
            boolean r0 = m24862(r0)
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    @Yue.InterfaceC4418
    public java.util.Iterator<Yue.C6517> iterator() {
            r1 = this;
            byte[] r0 = r1.f22902
            java.util.Iterator r0 = m24863(r0)
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
            int r0 = r1.m24868()
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
            byte[] r0 = r1.f22902
            java.lang.String r0 = m24865(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean m24866(byte r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m24867(byte r2) {
            r1 = this;
            byte[] r0 = r1.f22902
            boolean r2 = m24854(r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m24868() {
            r1 = this;
            byte[] r0 = r1.f22902
            int r0 = m24859(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ byte[] m24869() {
            r1 = this;
            byte[] r0 = r1.f22902
            return r0
    }
}
