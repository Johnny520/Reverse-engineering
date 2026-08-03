package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.3")
@Yue.InterfaceC3419
@Yue.InterfaceC5840({"SMAP\nUIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n*L\n62#1:87,3\n*E\n"})
@Yue.InterfaceC2314
public final class C6530 implements java.util.Collection<Yue.C6528>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final int[] f22911;

    /* JADX INFO: renamed from: Yue.ۥۢۢۦۤ$ۥ, reason: contains not printable characters */
    public static final class C6531 implements java.util.Iterator<Yue.C6528>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final int[] f22912;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f22913;

        public C6531(@Yue.InterfaceC4418 int[] r2) {
                r1 = this;
                java.lang.String r0 = "array"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f22912 = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f22913
                int[] r1 = r2.f22912
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
        public /* bridge */ /* synthetic */ Yue.C6528 next() {
                r1 = this;
                int r0 = r1.m25011()
                Yue.ۥۢۢۦۣ r0 = Yue.C6528.m24932(r0)
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
        public int m25011() {
                r3 = this;
                int r0 = r3.f22913
                int[] r1 = r3.f22912
                int r2 = r1.length
                if (r0 >= r2) goto L12
                int r2 = r0 + 1
                r3.f22913 = r2
                r0 = r1[r0]
                int r0 = Yue.C6528.m24937(r0)
                return r0
            L12:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                int r1 = r3.f22913
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.<init>(r1)
                throw r0
        }
    }

    @Yue.InterfaceC4986
    public /* synthetic */ C6530(int[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22911 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C6530 m24992(int[] r1) {
            Yue.ۥۢۢۦۤ r0 = new Yue.ۥۢۢۦۤ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int[] m24993(int r0) {
            int[] r0 = new int[r0]
            int[] r0 = m24994(r0)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int[] m24994(@Yue.InterfaceC4418 int[] r1) {
            java.lang.String r0 = "storage"
            Yue.C3329.m13906(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m24995(int[] r0, int r1) {
            boolean r0 = Yue.C0595.m2613(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m24996(int[] r3, @Yue.InterfaceC4418 java.util.Collection<Yue.C6528> r4) {
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
            boolean r2 = r0 instanceof Yue.C6528
            if (r2 == 0) goto L2c
            Yue.ۥۢۢۦۣ r0 = (Yue.C6528) r0
            int r0 = r0.m24991()
            boolean r0 = Yue.C0595.m2613(r3, r0)
            if (r0 == 0) goto L2c
            goto L11
        L2c:
            r1 = 0
        L2d:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m24997(int[] r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof Yue.C6530
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            Yue.ۥۢۢۦۤ r3 = (Yue.C6530) r3
            int[] r3 = r3.m25010()
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 != 0) goto L13
            return r1
        L13:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean m24998(int[] r0, int[] r1) {
            boolean r0 = Yue.C3329.m13897(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int m24999(int[] r0, int r1) {
            r0 = r0[r1]
            int r0 = Yue.C6528.m24937(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static int m25000(int[] r0) {
            int r0 = r0.length
            return r0
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m25001() {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static int m25002(int[] r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m25003(int[] r0) {
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
    public static java.util.Iterator<Yue.C6528> m25004(int[] r1) {
            Yue.ۥۢۢۦۤ$ۥ r0 = new Yue.ۥۢۢۦۤ$ۥ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final void m25005(int[] r0, int r1, int r2) {
            r0[r1] = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static java.lang.String m25006(int[] r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UIntArray(storage="
            r0.append(r1)
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Yue.C6528 r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends Yue.C6528> r2) {
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
            boolean r0 = r2 instanceof Yue.C6528
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            Yue.ۥۢۢۦۣ r2 = (Yue.C6528) r2
            int r2 = r2.m24991()
            boolean r2 = r1.m25008(r2)
            return r2
    }

    @Override // java.util.Collection
    public boolean containsAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            int[] r0 = r1.f22911
            boolean r2 = m24996(r0, r2)
            return r2
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            int[] r0 = r1.f22911
            boolean r2 = m24997(r0, r2)
            return r2
    }

    @Override // java.util.Collection
    public int hashCode() {
            r1 = this;
            int[] r0 = r1.f22911
            int r0 = m25002(r0)
            return r0
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            int[] r0 = r1.f22911
            boolean r0 = m25003(r0)
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    @Yue.InterfaceC4418
    public java.util.Iterator<Yue.C6528> iterator() {
            r1 = this;
            int[] r0 = r1.f22911
            java.util.Iterator r0 = m25004(r0)
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
            int r0 = r1.m25009()
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
            int[] r0 = r1.f22911
            java.lang.String r0 = m25006(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean m25007(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m25008(int r2) {
            r1 = this;
            int[] r0 = r1.f22911
            boolean r2 = m24995(r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m25009() {
            r1 = this;
            int[] r0 = r1.f22911
            int r0 = m25000(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ int[] m25010() {
            r1 = this;
            int[] r0 = r1.f22911
            return r0
    }
}
