package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2148 implements java.util.Set, java.io.Serializable, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C2148 f6738 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final long f6739 = 3406603774387020532L;

    static {
            Yue.ۥ۠۠ۨۢ r0 = new Yue.ۥ۠۠ۨۢ
            r0.<init>()
            Yue.C2148.f6738 = r0
            return
    }

    public C2148() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    private final java.lang.Object m10082() {
            r1 = this;
            Yue.ۥ۠۠ۨۢ r0 = Yue.C2148.f6738
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Void
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Void r2 = (java.lang.Void) r2
            boolean r2 = r1.m10084(r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@Yue.InterfaceC4418 java.util.Collection r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            boolean r2 = r2.isEmpty()
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Set
            if (r0 == 0) goto Le
            java.util.Set r2 = (java.util.Set) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @Yue.InterfaceC4418
    public java.util.Iterator iterator() {
            r1 = this;
            Yue.ۥ۠۠ۧۨ r0 = Yue.C2143.f6731
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.m10085()
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = Yue.C1204.m6175(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
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
    public boolean m10083(java.lang.Void r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m10084(@Yue.InterfaceC4418 java.lang.Void r2) {
            r1 = this;
            java.lang.String r0 = "element"
            Yue.C3329.m13906(r2, r0)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m10085() {
            r1 = this;
            r0 = 0
            return r0
    }
}
