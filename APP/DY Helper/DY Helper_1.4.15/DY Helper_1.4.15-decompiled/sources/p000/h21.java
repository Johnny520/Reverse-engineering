package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class h21 implements java.util.List, p000.no0 {

    /* JADX INFO: renamed from: ε */
    public final p000.k21 f4540;

    public h21(p000.k21 r1) {
            r0 = this;
            r0.<init>()
            r0.f4540 = r1
            return
    }

    @Override // java.util.List
    public final void add(int r1, java.lang.Object r2) {
            r0 = this;
            k21 r0 = r0.f4540
            r0.m3126(r1, r2)
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            k21 r0 = r0.f4540
            r0.m3127(r1)
            r0 = 1
            return r0
    }

    @Override // java.util.List
    public final boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            k21 r0 = r0.f4540
            boolean r0 = r0.m3130(r1, r2)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            k21 r1 = r1.f4540
            int r0 = r1.f5718
            boolean r1 = r1.m3130(r0, r2)
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r0 = this;
            k21 r0 = r0.f4540
            r0.m3132()
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            k21 r0 = r0.f4540
            boolean r0 = r0.m3133(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r3) {
            r2 = this;
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r3.next()
            k21 r1 = r2.f4540
            boolean r0 = r1.m3133(r0)
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L1a:
            r2 = 1
            return r2
    }

    @Override // java.util.List
    public final java.lang.Object get(int r1) {
            r0 = this;
            p000.l21.m3471(r1, r0)
            k21 r0 = r0.f4540
            java.lang.Object[] r0 = r0.f5716
            r0 = r0[r1]
            return r0
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r1) {
            r0 = this;
            k21 r0 = r0.f4540
            int r0 = r0.m3134(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            k21 r0 = r0.f4540
            int r0 = r0.f5718
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
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
    public final int lastIndexOf(java.lang.Object r3) {
            r2 = this;
            k21 r2 = r2.f4540
            int r0 = r2.f5718
            int r0 = r0 + (-1)
            java.lang.Object[] r2 = r2.f5716
        L8:
            if (r0 < 0) goto L16
            r1 = r2[r0]
            boolean r1 = p000.ln0.m3626(r3, r1)
            if (r1 == 0) goto L13
            return r0
        L13:
            int r0 = r0 + (-1)
            goto L8
        L16:
            r2 = -1
            return r2
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
    public final java.lang.Object remove(int r1) {
            r0 = this;
            p000.l21.m3471(r1, r0)
            k21 r0 = r0.f4540
            java.lang.Object r0 = r0.m3136(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            k21 r0 = r0.f4540
            boolean r0 = r0.m3135(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            goto L25
        L7:
            k21 r2 = r2.f4540
            int r0 = r2.f5718
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r3.next()
            r2.m3135(r1)
            goto L11
        L1f:
            int r2 = r2.f5718
            if (r0 == r2) goto L25
            r2 = 1
            return r2
        L25:
            r2 = 0
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r4) {
            r3 = this;
            k21 r3 = r3.f4540
            int r0 = r3.f5718
            int r1 = r0 + (-1)
        L6:
            r2 = -1
            if (r2 >= r1) goto L19
            java.lang.Object[] r2 = r3.f5716
            r2 = r2[r1]
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto L16
            r3.m3136(r1)
        L16:
            int r1 = r1 + (-1)
            goto L6
        L19:
            int r3 = r3.f5718
            if (r0 == r3) goto L1f
            r3 = 1
            return r3
        L1f:
            r3 = 0
            return r3
    }

    @Override // java.util.List
    public final java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            p000.l21.m3471(r2, r1)
            k21 r1 = r1.f4540
            java.lang.Object[] r1 = r1.f5716
            r0 = r1[r2]
            r1[r2] = r3
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r0 = this;
            k21 r0 = r0.f4540
            int r0 = r0.f5718
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
