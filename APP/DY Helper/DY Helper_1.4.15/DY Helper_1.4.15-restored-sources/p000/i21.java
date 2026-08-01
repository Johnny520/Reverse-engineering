package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class i21 implements java.util.List, p000.no0 {

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object f4880;

    /* JADX INFO: renamed from: ζ */
    public final int f4881;

    /* JADX INFO: renamed from: η */
    public int f4882;

    public i21(java.util.List r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f4880 = r1
            r0.f4881 = r2
            r0.f4882 = r3
            return
    }

    @Override // java.util.List
    public final void add(int r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f4881
            int r2 = r2 + r0
            java.lang.Object r0 = r1.f4880
            r0.add(r2, r3)
            int r2 = r1.f4882
            int r2 = r2 + 1
            r1.f4882 = r2
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f4882
            int r1 = r0 + 1
            r2.f4882 = r1
            java.lang.Object r2 = r2.f4880
            r2.add(r0, r3)
            r2 = 1
            return r2
    }

    @Override // java.util.List
    public final boolean addAll(int r2, java.util.Collection r3) {
            r1 = this;
            int r0 = r1.f4881
            int r2 = r2 + r0
            java.lang.Object r0 = r1.f4880
            r0.addAll(r2, r3)
            int r2 = r3.size()
            int r3 = r1.f4882
            int r3 = r3 + r2
            r1.f4882 = r3
            if (r2 <= 0) goto L15
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r3) {
            r2 = this;
            java.lang.Object r0 = r2.f4880
            int r1 = r2.f4882
            r0.addAll(r1, r3)
            int r3 = r3.size()
            int r0 = r2.f4882
            int r0 = r0 + r3
            r2.f4882 = r0
            if (r3 <= 0) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r3 = this;
            int r0 = r3.f4882
            int r0 = r0 + (-1)
            int r1 = r3.f4881
            if (r1 > r0) goto L12
        L8:
            java.lang.Object r2 = r3.f4880
            r2.remove(r0)
            if (r0 == r1) goto L12
            int r0 = r0 + (-1)
            goto L8
        L12:
            r3.f4882 = r1
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f4882
            int r1 = r3.f4881
        L4:
            if (r1 >= r0) goto L17
            java.lang.Object r2 = r3.f4880
            java.lang.Object r2 = r2.get(r1)
            boolean r2 = p000.ln0.m3626(r2, r4)
            if (r2 == 0) goto L14
            r3 = 1
            return r3
        L14:
            int r1 = r1 + 1
            goto L4
        L17:
            r3 = 0
            return r3
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L18:
            r1 = 1
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            p000.l21.m3471(r2, r1)
            int r0 = r1.f4881
            int r2 = r2 + r0
            java.lang.Object r1 = r1.f4880
            java.lang.Object r1 = r1.get(r2)
            return r1
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f4882
            int r1 = r4.f4881
            r2 = r1
        L5:
            if (r2 >= r0) goto L18
            java.lang.Object r3 = r4.f4880
            java.lang.Object r3 = r3.get(r2)
            boolean r3 = p000.ln0.m3626(r3, r5)
            if (r3 == 0) goto L15
            int r2 = r2 - r1
            return r2
        L15:
            int r2 = r2 + 1
            goto L5
        L18:
            r4 = -1
            return r4
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f4882
            int r1 = r1.f4881
            if (r0 != r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            j21 r0 = new j21
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f4882
            int r0 = r0 + (-1)
            int r1 = r3.f4881
            if (r1 > r0) goto L1b
        L8:
            java.lang.Object r2 = r3.f4880
            java.lang.Object r2 = r2.get(r0)
            boolean r2 = p000.ln0.m3626(r2, r4)
            if (r2 == 0) goto L16
            int r0 = r0 - r1
            return r0
        L16:
            if (r0 == r1) goto L1b
            int r0 = r0 + (-1)
            goto L8
        L1b:
            r3 = -1
            return r3
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r2 = this;
            j21 r0 = new j21
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            j21 r0 = new j21
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object remove(int r2) {
            r1 = this;
            p000.l21.m3471(r2, r1)
            int r0 = r1.f4881
            int r2 = r2 + r0
            java.lang.Object r0 = r1.f4880
            java.lang.Object r2 = r0.remove(r2)
            int r0 = r1.f4882
            int r0 = r0 + (-1)
            r1.f4882 = r0
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f4882
            int r1 = r4.f4881
        L4:
            if (r1 >= r0) goto L20
            java.lang.Object r2 = r4.f4880
            java.lang.Object r3 = r2.get(r1)
            boolean r3 = p000.ln0.m3626(r3, r5)
            if (r3 == 0) goto L1d
            r2.remove(r1)
            int r5 = r4.f4882
            int r5 = r5 + (-1)
            r4.f4882 = r5
            r4 = 1
            return r4
        L1d:
            int r1 = r1 + 1
            goto L4
        L20:
            r4 = 0
            return r4
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r3) {
            r2 = this;
            int r0 = r2.f4882
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r3.next()
            r2.remove(r1)
            goto L8
        L16:
            int r2 = r2.f4882
            if (r0 == r2) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r6) {
            r5 = this;
            int r0 = r5.f4882
            int r1 = r0 + (-1)
            int r2 = r5.f4881
            if (r2 > r1) goto L22
        L8:
            java.lang.Object r3 = r5.f4880
            java.lang.Object r4 = r3.get(r1)
            boolean r4 = r6.contains(r4)
            if (r4 != 0) goto L1d
            r3.remove(r1)
            int r3 = r5.f4882
            int r3 = r3 + (-1)
            r5.f4882 = r3
        L1d:
            if (r1 == r2) goto L22
            int r1 = r1 + (-1)
            goto L8
        L22:
            int r5 = r5.f4882
            if (r0 == r5) goto L28
            r5 = 1
            return r5
        L28:
            r5 = 0
            return r5
    }

    @Override // java.util.List
    public final java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            p000.l21.m3471(r2, r1)
            int r0 = r1.f4881
            int r2 = r2 + r0
            java.lang.Object r1 = r1.f4880
            java.lang.Object r1 = r1.set(r2, r3)
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r1 = this;
            int r0 = r1.f4882
            int r1 = r1.f4881
            int r0 = r0 - r1
            return r0
    }

    @Override // java.util.List
    public final java.util.List subList(int r2, int r3) {
            r1 = this;
            p000.l21.m3472(r1, r2, r3)
            i21 r0 = new i21
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
            r0 = this;
            java.lang.Object[] r0 = p000.AbstractC0782s1.m5320(r0)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            java.lang.Object[] r0 = p000.AbstractC0782s1.m5321(r0, r1)
            return r0
    }
}
