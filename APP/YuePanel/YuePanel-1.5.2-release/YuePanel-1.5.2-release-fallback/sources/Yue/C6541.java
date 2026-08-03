package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.3")
@Yue.InterfaceC3419
@Yue.InterfaceC5840({"SMAP\nULongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n*L\n62#1:87,3\n*E\n"})
@Yue.InterfaceC2314
public final class C6541 implements java.util.Collection<Yue.C6539>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final long[] f22930;

    /* JADX INFO: renamed from: Yue.ۥۢۢۧ۠$ۥ, reason: contains not printable characters */
    public static final class C6542 implements java.util.Iterator<Yue.C6539>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final long[] f22931;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f22932;

        public C6542(@Yue.InterfaceC4418 long[] r2) {
                r1 = this;
                java.lang.String r0 = "array"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f22931 = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f22932
                long[] r1 = r2.f22931
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
        public /* bridge */ /* synthetic */ Yue.C6539 next() {
                r2 = this;
                long r0 = r2.m25112()
                Yue.ۥۢۢۧ۟ r0 = Yue.C6539.m25033(r0)
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
        public long m25112() {
                r3 = this;
                int r0 = r3.f22932
                long[] r1 = r3.f22931
                int r2 = r1.length
                if (r0 >= r2) goto L12
                int r2 = r0 + 1
                r3.f22932 = r2
                r0 = r1[r0]
                long r0 = Yue.C6539.m25038(r0)
                return r0
            L12:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                int r1 = r3.f22932
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.<init>(r1)
                throw r0
        }
    }

    @Yue.InterfaceC4986
    public /* synthetic */ C6541(long[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22930 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C6541 m25093(long[] r1) {
            Yue.ۥۢۢۧ۠ r0 = new Yue.ۥۢۢۧ۠
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static long[] m25094(int r0) {
            long[] r0 = new long[r0]
            long[] r0 = m25095(r0)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static long[] m25095(@Yue.InterfaceC4418 long[] r1) {
            java.lang.String r0 = "storage"
            Yue.C3329.m13906(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m25096(long[] r0, long r1) {
            boolean r0 = Yue.C0595.m2614(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m25097(long[] r4, @Yue.InterfaceC4418 java.util.Collection<Yue.C6539> r5) {
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r5, r0)
            boolean r0 = r5.isEmpty()
            r1 = 1
            if (r0 == 0) goto Ld
            goto L2d
        Ld:
            java.util.Iterator r5 = r5.iterator()
        L11:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r5.next()
            boolean r2 = r0 instanceof Yue.C6539
            if (r2 == 0) goto L2c
            Yue.ۥۢۢۧ۟ r0 = (Yue.C6539) r0
            long r2 = r0.m25092()
            boolean r0 = Yue.C0595.m2614(r4, r2)
            if (r0 == 0) goto L2c
            goto L11
        L2c:
            r1 = 0
        L2d:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m25098(long[] r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof Yue.C6541
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            Yue.ۥۢۢۧ۠ r3 = (Yue.C6541) r3
            long[] r3 = r3.m25111()
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 != 0) goto L13
            return r1
        L13:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean m25099(long[] r0, long[] r1) {
            boolean r0 = Yue.C3329.m13897(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final long m25100(long[] r2, int r3) {
            r0 = r2[r3]
            long r2 = Yue.C6539.m25038(r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static int m25101(long[] r0) {
            int r0 = r0.length
            return r0
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m25102() {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static int m25103(long[] r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m25104(long[] r0) {
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
    public static java.util.Iterator<Yue.C6539> m25105(long[] r1) {
            Yue.ۥۢۢۧ۠$ۥ r0 = new Yue.ۥۢۢۧ۠$ۥ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final void m25106(long[] r0, int r1, long r2) {
            r0[r1] = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static java.lang.String m25107(long[] r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ULongArray(storage="
            r0.append(r1)
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Yue.C6539 r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends Yue.C6539> r2) {
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
    public final /* bridge */ boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C6539
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            Yue.ۥۢۢۧ۟ r3 = (Yue.C6539) r3
            long r0 = r3.m25092()
            boolean r3 = r2.m25109(r0)
            return r3
    }

    @Override // java.util.Collection
    public boolean containsAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            long[] r0 = r1.f22930
            boolean r2 = m25097(r0, r2)
            return r2
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            long[] r0 = r1.f22930
            boolean r2 = m25098(r0, r2)
            return r2
    }

    @Override // java.util.Collection
    public int hashCode() {
            r1 = this;
            long[] r0 = r1.f22930
            int r0 = m25103(r0)
            return r0
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            long[] r0 = r1.f22930
            boolean r0 = m25104(r0)
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    @Yue.InterfaceC4418
    public java.util.Iterator<Yue.C6539> iterator() {
            r1 = this;
            long[] r0 = r1.f22930
            java.util.Iterator r0 = m25105(r0)
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
            int r0 = r1.m25110()
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
            long[] r0 = r1.f22930
            java.lang.String r0 = m25107(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean m25108(long r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m25109(long r2) {
            r1 = this;
            long[] r0 = r1.f22930
            boolean r2 = m25096(r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m25110() {
            r1 = this;
            long[] r0 = r1.f22930
            int r0 = m25101(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ long[] m25111() {
            r1 = this;
            long[] r0 = r1.f22930
            return r0
    }
}
