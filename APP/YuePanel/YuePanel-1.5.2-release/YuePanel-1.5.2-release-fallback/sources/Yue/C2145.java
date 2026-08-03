package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2145 implements java.util.List, java.io.Serializable, java.util.RandomAccess, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C2145 f6733 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final long f6734 = -7390468764508069838L;

    static {
            Yue.ۥ۠۠ۨ۟ r0 = new Yue.ۥ۠۠ۨ۟
            r0.<init>()
            Yue.C2145.f6733 = r0
            return
    }

    public C2145() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    private final java.lang.Object m10061() {
            r1 = this;
            Yue.ۥ۠۠ۨ۟ r0 = Yue.C2145.f6733
            return r0
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Void
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Void r2 = (java.lang.Void) r2
            boolean r2 = r1.m10064(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@Yue.InterfaceC4418 java.util.Collection r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            boolean r2 = r2.isEmpty()
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto Le
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.Void r1 = r0.m10065(r1)
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Void
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            java.lang.Void r2 = (java.lang.Void) r2
            int r2 = r1.m10067(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @Yue.InterfaceC4418
    public java.util.Iterator iterator() {
            r1 = this;
            Yue.ۥ۠۠ۧۨ r0 = Yue.C2143.f6731
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Void
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            java.lang.Void r2 = (java.lang.Void) r2
            int r2 = r1.m10068(r2)
            return r2
    }

    @Override // java.util.List
    @Yue.InterfaceC4418
    public java.util.ListIterator listIterator() {
            r1 = this;
            Yue.ۥ۠۠ۧۨ r0 = Yue.C2143.f6731
            return r0
    }

    @Override // java.util.List
    @Yue.InterfaceC4418
    public java.util.ListIterator listIterator(int r4) {
            r3 = this;
            if (r4 != 0) goto L5
            Yue.ۥ۠۠ۧۨ r4 = Yue.C2143.f6731
            return r4
        L5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object remove(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.m10066()
            return r0
    }

    @Override // java.util.List
    @Yue.InterfaceC4418
    public java.util.List subList(int r4, int r5) {
            r3 = this;
            if (r4 != 0) goto L5
            if (r5 != 0) goto L5
            return r3
        L5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "fromIndex: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", toIndex: "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = Yue.C1204.m6175(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object[] r2 = Yue.C1204.m6176(r1, r2)
            return r2
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "[]"
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m10062(int r1, java.lang.Void r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m10063(java.lang.Void r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m10064(@Yue.InterfaceC4418 java.lang.Void r2) {
            r1 = this;
            java.lang.String r0 = "element"
            Yue.C3329.m13906(r2, r0)
            r2 = 0
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.Void m10065(int r4) {
            r3 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Empty list doesn't contain element at index "
            r1.append(r2)
            r1.append(r4)
            r4 = 46
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m10066() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m10067(@Yue.InterfaceC4418 java.lang.Void r2) {
            r1 = this;
            java.lang.String r0 = "element"
            Yue.C3329.m13906(r2, r0)
            r2 = -1
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int m10068(@Yue.InterfaceC4418 java.lang.Void r2) {
            r1 = this;
            java.lang.String r0 = "element"
            Yue.C3329.m13906(r2, r0)
            r2 = -1
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public java.lang.Void m10069(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public java.lang.Void m10070(int r1, java.lang.Void r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }
}
