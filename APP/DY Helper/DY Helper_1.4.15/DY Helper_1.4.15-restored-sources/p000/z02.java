package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class z02 implements java.util.List, p000.no0 {

    /* JADX INFO: renamed from: ε */
    public final p000.ix1 f12920;

    /* JADX INFO: renamed from: ζ */
    public final int f12921;

    /* JADX INFO: renamed from: η */
    public int f12922;

    /* JADX INFO: renamed from: θ */
    public int f12923;

    public z02(p000.ix1 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f12920 = r1
            r0.f12921 = r2
            int r1 = p000.AbstractC0073bd.m889(r1)
            r0.f12922 = r1
            int r3 = r3 - r2
            r0.f12923 = r3
            return
    }

    @Override // java.util.List
    public final void add(int r2, java.lang.Object r3) {
            r1 = this;
            r1.m7055()
            int r0 = r1.f12921
            int r0 = r0 + r2
            ix1 r2 = r1.f12920
            r2.add(r0, r3)
            int r3 = r1.f12923
            int r3 = r3 + 1
            r1.f12923 = r3
            int r2 = p000.AbstractC0073bd.m889(r2)
            r1.f12922 = r2
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object r3) {
            r2 = this;
            r2.m7055()
            int r0 = r2.f12921
            int r1 = r2.f12923
            int r0 = r0 + r1
            ix1 r1 = r2.f12920
            r1.add(r0, r3)
            int r3 = r2.f12923
            r0 = 1
            int r3 = r3 + r0
            r2.f12923 = r3
            int r3 = p000.AbstractC0073bd.m889(r1)
            r2.f12922 = r3
            return r0
    }

    @Override // java.util.List
    public final boolean addAll(int r3, java.util.Collection r4) {
            r2 = this;
            r2.m7055()
            int r0 = r2.f12921
            int r3 = r3 + r0
            ix1 r0 = r2.f12920
            boolean r3 = r0.addAll(r3, r4)
            if (r3 == 0) goto L1d
            int r1 = r2.f12923
            int r4 = r4.size()
            int r4 = r4 + r1
            r2.f12923 = r4
            int r4 = p000.AbstractC0073bd.m889(r0)
            r2.f12922 = r4
        L1d:
            return r3
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f12923
            boolean r1 = r1.addAll(r0, r2)
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r3 = this;
            int r0 = r3.f12923
            if (r0 <= 0) goto L1a
            r3.m7055()
            int r0 = r3.f12923
            int r1 = r3.f12921
            int r0 = r0 + r1
            ix1 r2 = r3.f12920
            r2.m2827(r1, r0)
            r0 = 0
            r3.f12923 = r0
            int r0 = p000.AbstractC0073bd.m889(r2)
            r3.f12922 = r0
        L1a:
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r3) {
            r2 = this;
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r0 = r3 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L11
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            return r1
        L11:
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L15
            r2 = 0
            return r2
        L27:
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            r1.m7055()
            int r0 = r1.f12923
            p000.AbstractC0073bd.m870(r2, r0)
            int r0 = r1.f12921
            int r0 = r0 + r2
            ix1 r1 = r1.f12920
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            r4.m7055()
            int r0 = r4.f12923
            int r1 = r4.f12921
            int r0 = r0 + r1
            xm0 r0 = p000.j81.m2893(r1, r0)
            java.util.Iterator r0 = r0.iterator()
        L10:
            r2 = r0
            wm0 r2 = (p000.wm0) r2
            boolean r3 = r2.f11765
            if (r3 == 0) goto L29
            int r2 = r2.nextInt()
            ix1 r3 = r4.f12920
            java.lang.Object r3 = r3.get(r2)
            boolean r3 = p000.ln0.m3626(r5, r3)
            if (r3 == 0) goto L10
            int r2 = r2 - r1
            return r2
        L29:
            r4 = -1
            return r4
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.f12923
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r1 = r1.listIterator(r0)
            return r1
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            r3.m7055()
            int r0 = r3.f12923
            int r1 = r3.f12921
            int r0 = r0 + r1
            int r0 = r0 + (-1)
        La:
            if (r0 < r1) goto L1d
            ix1 r2 = r3.f12920
            java.lang.Object r2 = r2.get(r0)
            boolean r2 = p000.ln0.m3626(r4, r2)
            if (r2 == 0) goto L1a
            int r0 = r0 - r1
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto La
        L1d:
            r3 = -1
            return r3
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r1 = r1.listIterator(r0)
            return r1
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            r1.m7055()
            sm1 r0 = new sm1
            r0.<init>()
            int r2 = r2 + (-1)
            r0.f9967 = r2
            ko1 r2 = new ko1
            r2.<init>(r0, r1)
            return r2
    }

    @Override // java.util.List
    public final java.lang.Object remove(int r3) {
            r2 = this;
            r2.m7055()
            int r0 = r2.f12921
            int r0 = r0 + r3
            ix1 r3 = r2.f12920
            java.lang.Object r0 = r3.remove(r0)
            int r1 = r2.f12923
            int r1 = r1 + (-1)
            r2.f12923 = r1
            int r3 = p000.AbstractC0073bd.m889(r3)
            r2.f12922 = r3
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lb
            r0.remove(r1)
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r4) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L5:
            r1 = r0
        L6:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r4.next()
            boolean r2 = r3.remove(r2)
            if (r2 != 0) goto L18
            if (r1 == 0) goto L5
        L18:
            r1 = 1
            goto L6
        L1a:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r11) {
            r10 = this;
            r10.m7055()
            ix1 r0 = r10.f12920
            int r1 = r10.f12921
            int r2 = r10.f12923
            int r2 = r2 + r1
            int r3 = r0.size()
        Le:
            java.lang.Object r4 = p000.AbstractC0073bd.f1653
            monitor-enter(r4)
            h02 r5 = r0.f5238     // Catch: java.lang.Throwable -> L73
            r5.getClass()     // Catch: java.lang.Throwable -> L73
            k02 r5 = p000.ax1.m626(r5)     // Catch: java.lang.Throwable -> L73
            h02 r5 = (p000.h02) r5     // Catch: java.lang.Throwable -> L73
            int r6 = r5.f4518     // Catch: java.lang.Throwable -> L73
            б r5 = r5.f4517     // Catch: java.lang.Throwable -> L73
            monitor-exit(r4)
            r5.getClass()
            qa1 r4 = r5.mo4445()
            java.util.List r7 = r4.subList(r1, r2)
            r7.retainAll(r11)
            б r4 = r4.m4829()
            boolean r5 = p000.ln0.m3626(r4, r5)
            r7 = 1
            if (r5 != 0) goto L5a
            h02 r5 = r0.f5238
            r5.getClass()
            java.lang.Object r8 = p000.ax1.f1362
            monitor-enter(r8)
            tw1 r9 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L57
            k02 r5 = p000.ax1.m641(r5, r0, r9)     // Catch: java.lang.Throwable -> L57
            h02 r5 = (p000.h02) r5     // Catch: java.lang.Throwable -> L57
            boolean r4 = p000.AbstractC0073bd.m873(r5, r6, r4, r7)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r8)
            p000.ax1.m632(r9, r0)
            if (r4 == 0) goto Le
            goto L5a
        L57:
            r10 = move-exception
            monitor-exit(r8)
            throw r10
        L5a:
            int r11 = r0.size()
            int r3 = r3 - r11
            if (r3 <= 0) goto L6e
            ix1 r11 = r10.f12920
            int r11 = p000.AbstractC0073bd.m889(r11)
            r10.f12922 = r11
            int r11 = r10.f12923
            int r11 = r11 - r3
            r10.f12923 = r11
        L6e:
            if (r3 <= 0) goto L71
            return r7
        L71:
            r10 = 0
            return r10
        L73:
            r10 = move-exception
            monitor-exit(r4)
            throw r10
    }

    @Override // java.util.List
    public final java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f12923
            p000.AbstractC0073bd.m870(r2, r0)
            r1.m7055()
            int r0 = r1.f12921
            int r2 = r2 + r0
            ix1 r0 = r1.f12920
            java.lang.Object r2 = r0.set(r2, r3)
            int r3 = p000.AbstractC0073bd.m889(r0)
            r1.f12922 = r3
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r0 = this;
            int r0 = r0.f12923
            return r0
    }

    @Override // java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto L9
            if (r3 > r4) goto L9
            int r0 = r2.f12923
            if (r4 > r0) goto L9
            goto Le
        L9:
            java.lang.String r0 = "fromIndex or toIndex are out of bounds"
            p000.pi1.m4544(r0)
        Le:
            r2.m7055()
            z02 r0 = new z02
            int r1 = r2.f12921
            int r3 = r3 + r1
            int r4 = r4 + r1
            ix1 r2 = r2.f12920
            r0.<init>(r2, r3, r4)
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

    /* JADX INFO: renamed from: α */
    public final void m7055() {
            r1 = this;
            ix1 r0 = r1.f12920
            int r0 = p000.AbstractC0073bd.m889(r0)
            int r1 = r1.f12922
            if (r0 != r1) goto Lb
            return
        Lb:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }
}
