package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,481:1\n1726#2,3:482\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n*L\n61#1:482,3\n*E\n"})
public final class C0553<T> implements java.util.Collection<T>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final T[] f1441;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean f1442;

    public C0553(@Yue.InterfaceC4418 T[] r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "values"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f1441 = r2
            r1.f1442 = r3
            return
    }

    @Override // java.util.Collection
    public boolean add(T r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends T> r2) {
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
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            T[] r0 = r1.f1441
            boolean r2 = Yue.C0595.m2615(r0, r2)
            return r2
    }

    @Override // java.util.Collection
    public boolean containsAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3.isEmpty()
            r1 = 1
            if (r0 == 0) goto Ld
            goto L22
        Ld:
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L11
            r1 = 0
        L22:
            return r1
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            T[] r0 = r1.f1441
            int r0 = r0.length
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    @Yue.InterfaceC4418
    public java.util.Iterator<T> iterator() {
            r1 = this;
            T[] r0 = r1.f1441
            java.util.Iterator r0 = Yue.C0569.m2009(r0)
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
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.m1951()
            return r0
    }

    @Override // java.util.Collection
    @Yue.InterfaceC4418
    public final java.lang.Object[] toArray() {
            r2 = this;
            T[] r0 = r2.f1441
            boolean r1 = r2.f1442
            java.lang.Object[] r0 = Yue.C1207.m6187(r0, r1)
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

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int m1951() {
            r1 = this;
            T[] r0 = r1.f1441
            int r0 = r0.length
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final T[] m1952() {
            r1 = this;
            T[] r0 = r1.f1441
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m1953() {
            r1 = this;
            boolean r0 = r1.f1442
            return r0
    }
}
