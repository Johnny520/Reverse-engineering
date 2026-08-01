package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ix1 implements android.os.Parcelable, p000.i02, java.util.List, java.util.RandomAccess, p000.no0 {
    public static final android.os.Parcelable.Creator<p000.ix1> CREATOR = null;

    /* JADX INFO: renamed from: ε */
    public p000.h02 f5238;

    static {
            hx1 r0 = new hx1
            r1 = 0
            r0.<init>(r1)
            p000.ix1.CREATOR = r0
            return
    }

    public ix1() {
            r1 = this;
            sw1 r0 = p000.sw1.f10062
            r1.<init>(r0)
            return
    }

    public ix1(p000.AbstractC1103 r5) {
            r4 = this;
            r4.<init>()
            tw1 r0 = p000.ax1.m628()
            h02 r1 = new h02
            long r2 = r0.mo5759()
            r1.<init>(r2, r5)
            boolean r0 = r0 instanceof p000.sa0
            if (r0 != 0) goto L1d
            h02 r0 = new h02
            r2 = 1
            long r2 = (long) r2
            r0.<init>(r2, r5)
            r1.f5698 = r0
        L1d:
            r4.f5238 = r1
            return
    }

    @Override // java.util.List
    public final void add(int r7, java.lang.Object r8) {
            r6 = this;
        L0:
            java.lang.Object r0 = p000.AbstractC0073bd.f1653
            monitor-enter(r0)
            h02 r1 = r6.f5238     // Catch: java.lang.Throwable -> L42
            r1.getClass()     // Catch: java.lang.Throwable -> L42
            k02 r1 = p000.ax1.m626(r1)     // Catch: java.lang.Throwable -> L42
            h02 r1 = (p000.h02) r1     // Catch: java.lang.Throwable -> L42
            int r2 = r1.f4518     // Catch: java.lang.Throwable -> L42
            б r1 = r1.f4517     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            r1.getClass()
            б r0 = r1.mo4443(r7, r8)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L21
            goto L3e
        L21:
            h02 r1 = r6.f5238
            r1.getClass()
            java.lang.Object r3 = p000.ax1.f1362
            monitor-enter(r3)
            tw1 r4 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L3f
            k02 r1 = p000.ax1.m641(r1, r6, r4)     // Catch: java.lang.Throwable -> L3f
            h02 r1 = (p000.h02) r1     // Catch: java.lang.Throwable -> L3f
            r5 = 1
            boolean r0 = p000.AbstractC0073bd.m873(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r3)
            p000.ax1.m632(r4, r6)
            if (r0 == 0) goto L0
        L3e:
            return
        L3f:
            r6 = move-exception
            monitor-exit(r3)
            throw r6
        L42:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = p000.AbstractC0073bd.f1653
            monitor-enter(r0)
            h02 r1 = r6.f5238     // Catch: java.lang.Throwable -> L43
            r1.getClass()     // Catch: java.lang.Throwable -> L43
            k02 r1 = p000.ax1.m626(r1)     // Catch: java.lang.Throwable -> L43
            h02 r1 = (p000.h02) r1     // Catch: java.lang.Throwable -> L43
            int r2 = r1.f4518     // Catch: java.lang.Throwable -> L43
            б r1 = r1.f4517     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            r1.getClass()
            б r0 = r1.mo4444(r7)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L22
            r6 = 0
            return r6
        L22:
            h02 r1 = r6.f5238
            r1.getClass()
            java.lang.Object r3 = p000.ax1.f1362
            monitor-enter(r3)
            tw1 r4 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L40
            k02 r1 = p000.ax1.m641(r1, r6, r4)     // Catch: java.lang.Throwable -> L40
            h02 r1 = (p000.h02) r1     // Catch: java.lang.Throwable -> L40
            r5 = 1
            boolean r0 = p000.AbstractC0073bd.m873(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r3)
            p000.ax1.m632(r4, r6)
            if (r0 == 0) goto L0
            return r5
        L40:
            r6 = move-exception
            monitor-exit(r3)
            throw r6
        L43:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    @Override // java.util.List
    public final boolean addAll(int r2, java.util.Collection r3) {
            r1 = this;
            uv r0 = new uv
            r0.<init>(r2, r3)
            boolean r1 = p000.AbstractC0073bd.m853(r1, r0)
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = p000.AbstractC0073bd.f1653
            monitor-enter(r0)
            h02 r1 = r6.f5238     // Catch: java.lang.Throwable -> L43
            r1.getClass()     // Catch: java.lang.Throwable -> L43
            k02 r1 = p000.ax1.m626(r1)     // Catch: java.lang.Throwable -> L43
            h02 r1 = (p000.h02) r1     // Catch: java.lang.Throwable -> L43
            int r2 = r1.f4518     // Catch: java.lang.Throwable -> L43
            б r1 = r1.f4517     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            r1.getClass()
            б r0 = r1.mo5578(r7)
            boolean r1 = p000.ln0.m3626(r0, r1)
            if (r1 == 0) goto L22
            r6 = 0
            return r6
        L22:
            h02 r1 = r6.f5238
            r1.getClass()
            java.lang.Object r3 = p000.ax1.f1362
            monitor-enter(r3)
            tw1 r4 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L40
            k02 r1 = p000.ax1.m641(r1, r6, r4)     // Catch: java.lang.Throwable -> L40
            h02 r1 = (p000.h02) r1     // Catch: java.lang.Throwable -> L40
            r5 = 1
            boolean r0 = p000.AbstractC0073bd.m873(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r3)
            p000.ax1.m632(r4, r6)
            if (r0 == 0) goto L0
            return r5
        L40:
            r6 = move-exception
            monitor-exit(r3)
            throw r6
        L43:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r5 = this;
            h02 r0 = r5.f5238
            r0.getClass()
            java.lang.Object r1 = p000.ax1.f1362
            monitor-enter(r1)
            tw1 r2 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L2b
            k02 r0 = p000.ax1.m641(r0, r5, r2)     // Catch: java.lang.Throwable -> L2b
            h02 r0 = (p000.h02) r0     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r3 = p000.AbstractC0073bd.f1653     // Catch: java.lang.Throwable -> L2b
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L2b
            sw1 r4 = p000.sw1.f10062     // Catch: java.lang.Throwable -> L2d
            r0.f4517 = r4     // Catch: java.lang.Throwable -> L2d
            int r4 = r0.f4518     // Catch: java.lang.Throwable -> L2d
            int r4 = r4 + 1
            r0.f4518 = r4     // Catch: java.lang.Throwable -> L2d
            int r4 = r0.f4519     // Catch: java.lang.Throwable -> L2d
            int r4 = r4 + 1
            r0.f4519 = r4     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            p000.ax1.m632(r2, r5)
            return
        L2b:
            r5 = move-exception
            goto L30
        L2d:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
            throw r5     // Catch: java.lang.Throwable -> L2b
        L30:
            monitor-exit(r1)
            throw r5
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            h02 r0 = p000.AbstractC0073bd.m888(r0)
            б r0 = r0.f4517
            boolean r0 = r0.contains(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r1) {
            r0 = this;
            h02 r0 = p000.AbstractC0073bd.m888(r0)
            б r0 = r0.f4517
            boolean r0 = r0.containsAll(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object get(int r1) {
            r0 = this;
            h02 r0 = p000.AbstractC0073bd.m888(r0)
            б r0 = r0.f4517
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r1) {
            r0 = this;
            h02 r0 = p000.AbstractC0073bd.m888(r0)
            б r0 = r0.f4517
            int r0 = r0.indexOf(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            h02 r0 = p000.AbstractC0073bd.m888(r0)
            б r0 = r0.f4517
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r0 = this;
            java.util.ListIterator r0 = r0.listIterator()
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r1) {
            r0 = this;
            h02 r0 = p000.AbstractC0073bd.m888(r0)
            б r0 = r0.f4517
            int r0 = r0.lastIndexOf(r1)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r2 = this;
            le0 r0 = new le0
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            le0 r0 = new le0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object remove(int r8) {
            r7 = this;
            java.lang.Object r0 = r7.get(r8)
        L4:
            java.lang.Object r1 = p000.AbstractC0073bd.f1653
            monitor-enter(r1)
            h02 r2 = r7.f5238     // Catch: java.lang.Throwable -> L46
            r2.getClass()     // Catch: java.lang.Throwable -> L46
            k02 r2 = p000.ax1.m626(r2)     // Catch: java.lang.Throwable -> L46
            h02 r2 = (p000.h02) r2     // Catch: java.lang.Throwable -> L46
            int r3 = r2.f4518     // Catch: java.lang.Throwable -> L46
            б r2 = r2.f4517     // Catch: java.lang.Throwable -> L46
            monitor-exit(r1)
            r2.getClass()
            б r1 = r2.mo4447(r8)
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L25
            goto L42
        L25:
            h02 r2 = r7.f5238
            r2.getClass()
            java.lang.Object r4 = p000.ax1.f1362
            monitor-enter(r4)
            tw1 r5 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L43
            k02 r2 = p000.ax1.m641(r2, r7, r5)     // Catch: java.lang.Throwable -> L43
            h02 r2 = (p000.h02) r2     // Catch: java.lang.Throwable -> L43
            r6 = 1
            boolean r1 = p000.AbstractC0073bd.m873(r2, r3, r1, r6)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r4)
            p000.ax1.m632(r5, r7)
            if (r1 == 0) goto L4
        L42:
            return r0
        L43:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L46:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = p000.AbstractC0073bd.f1653
            monitor-enter(r0)
            h02 r1 = r6.f5238     // Catch: java.lang.Throwable -> L4c
            r1.getClass()     // Catch: java.lang.Throwable -> L4c
            k02 r1 = p000.ax1.m626(r1)     // Catch: java.lang.Throwable -> L4c
            h02 r1 = (p000.h02) r1     // Catch: java.lang.Throwable -> L4c
            int r2 = r1.f4518     // Catch: java.lang.Throwable -> L4c
            б r1 = r1.f4517     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r0)
            r1.getClass()
            int r0 = r1.indexOf(r7)
            r3 = -1
            if (r0 == r3) goto L22
            б r0 = r1.mo4447(r0)
            goto L23
        L22:
            r0 = r1
        L23:
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L2b
            r6 = 0
            return r6
        L2b:
            h02 r1 = r6.f5238
            r1.getClass()
            java.lang.Object r3 = p000.ax1.f1362
            monitor-enter(r3)
            tw1 r4 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L49
            k02 r1 = p000.ax1.m641(r1, r6, r4)     // Catch: java.lang.Throwable -> L49
            h02 r1 = (p000.h02) r1     // Catch: java.lang.Throwable -> L49
            r5 = 1
            boolean r0 = p000.AbstractC0073bd.m873(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r3)
            p000.ax1.m632(r4, r6)
            if (r0 == 0) goto L0
            return r5
        L49:
            r6 = move-exception
            monitor-exit(r3)
            throw r6
        L4c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = p000.AbstractC0073bd.f1653
            monitor-enter(r0)
            h02 r1 = r6.f5238     // Catch: java.lang.Throwable -> L49
            r1.getClass()     // Catch: java.lang.Throwable -> L49
            k02 r1 = p000.ax1.m626(r1)     // Catch: java.lang.Throwable -> L49
            h02 r1 = (p000.h02) r1     // Catch: java.lang.Throwable -> L49
            int r2 = r1.f4518     // Catch: java.lang.Throwable -> L49
            б r1 = r1.f4517     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)
            r1.getClass()
            а r0 = new а
            r3 = 0
            r0.<init>(r3, r7)
            б r0 = r1.mo4446(r0)
            boolean r1 = p000.ln0.m3626(r0, r1)
            if (r1 == 0) goto L28
            r6 = 0
            return r6
        L28:
            h02 r1 = r6.f5238
            r1.getClass()
            java.lang.Object r3 = p000.ax1.f1362
            monitor-enter(r3)
            tw1 r4 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L46
            k02 r1 = p000.ax1.m641(r1, r6, r4)     // Catch: java.lang.Throwable -> L46
            h02 r1 = (p000.h02) r1     // Catch: java.lang.Throwable -> L46
            r5 = 1
            boolean r0 = p000.AbstractC0073bd.m873(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)
            p000.ax1.m632(r4, r6)
            if (r0 == 0) goto L0
            return r5
        L46:
            r6 = move-exception
            monitor-exit(r3)
            throw r6
        L49:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r3) {
            r2 = this;
            а r0 = new а
            r1 = 2
            r0.<init>(r1, r3)
            boolean r2 = p000.AbstractC0073bd.m853(r2, r0)
            return r2
    }

    @Override // java.util.List
    public final java.lang.Object set(int r8, java.lang.Object r9) {
            r7 = this;
            java.lang.Object r0 = r7.get(r8)
        L4:
            java.lang.Object r1 = p000.AbstractC0073bd.f1653
            monitor-enter(r1)
            h02 r2 = r7.f5238     // Catch: java.lang.Throwable -> L46
            r2.getClass()     // Catch: java.lang.Throwable -> L46
            k02 r2 = p000.ax1.m626(r2)     // Catch: java.lang.Throwable -> L46
            h02 r2 = (p000.h02) r2     // Catch: java.lang.Throwable -> L46
            int r3 = r2.f4518     // Catch: java.lang.Throwable -> L46
            б r2 = r2.f4517     // Catch: java.lang.Throwable -> L46
            monitor-exit(r1)
            r2.getClass()
            б r1 = r2.mo4448(r8, r9)
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L25
            goto L42
        L25:
            h02 r2 = r7.f5238
            r2.getClass()
            java.lang.Object r4 = p000.ax1.f1362
            monitor-enter(r4)
            tw1 r5 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L43
            k02 r2 = p000.ax1.m641(r2, r7, r5)     // Catch: java.lang.Throwable -> L43
            h02 r2 = (p000.h02) r2     // Catch: java.lang.Throwable -> L43
            r6 = 0
            boolean r1 = p000.AbstractC0073bd.m873(r2, r3, r1, r6)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r4)
            p000.ax1.m632(r5, r7)
            if (r1 == 0) goto L4
        L42:
            return r0
        L43:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L46:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r0 = this;
            h02 r0 = p000.AbstractC0073bd.m888(r0)
            б r0 = r0.f4517
            int r0 = r0.mo2340()
            return r0
    }

    @Override // java.util.List
    public final java.util.List subList(int r2, int r3) {
            r1 = this;
            if (r2 < 0) goto Lc
            if (r2 > r3) goto Lc
            int r0 = r1.size()
            if (r3 > r0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L14
            java.lang.String r0 = "fromIndex or toIndex are out of bounds"
            p000.pi1.m4544(r0)
        L14:
            z02 r0 = new z02
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

    public final java.lang.String toString() {
            r3 = this;
            h02 r0 = r3.f5238
            r0.getClass()
            k02 r0 = p000.ax1.m626(r0)
            h02 r0 = (p000.h02) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SnapshotStateList(value="
            r1.<init>(r2)
            б r0 = r0.f4517
            r1.append(r0)
            java.lang.String r0 = ")@"
            r1.append(r0)
            int r3 = r3.hashCode()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            h02 r2 = p000.AbstractC0073bd.m888(r2)
            б r2 = r2.f4517
            int r4 = r2.mo2340()
            r3.writeInt(r4)
            r0 = 0
        Le:
            if (r0 >= r4) goto L1a
            java.lang.Object r1 = r2.get(r0)
            r3.writeValue(r1)
            int r0 = r0 + 1
            goto Le
        L1a:
            return
    }

    @Override // p000.i02
    /* JADX INFO: renamed from: α */
    public final p000.k02 mo2200() {
            r0 = this;
            h02 r0 = r0.f5238
            return r0
    }

    @Override // p000.i02
    /* JADX INFO: renamed from: γ */
    public final void mo2201(p000.k02 r2) {
            r1 = this;
            h02 r0 = r1.f5238
            r2.f5698 = r0
            h02 r2 = (p000.h02) r2
            r1.f5238 = r2
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m2827(int r7, int r8) {
            r6 = this;
        L0:
            java.lang.Object r0 = p000.AbstractC0073bd.f1653
            monitor-enter(r0)
            h02 r1 = r6.f5238     // Catch: java.lang.Throwable -> L4d
            r1.getClass()     // Catch: java.lang.Throwable -> L4d
            k02 r1 = p000.ax1.m626(r1)     // Catch: java.lang.Throwable -> L4d
            h02 r1 = (p000.h02) r1     // Catch: java.lang.Throwable -> L4d
            int r2 = r1.f4518     // Catch: java.lang.Throwable -> L4d
            б r1 = r1.f4517     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)
            r1.getClass()
            qa1 r0 = r1.mo4445()
            java.util.List r3 = r0.subList(r7, r8)
            r3.clear()
            б r0 = r0.m4829()
            boolean r1 = p000.ln0.m3626(r0, r1)
            if (r1 != 0) goto L4c
            h02 r1 = r6.f5238
            r1.getClass()
            java.lang.Object r3 = p000.ax1.f1362
            monitor-enter(r3)
            tw1 r4 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L49
            k02 r1 = p000.ax1.m641(r1, r6, r4)     // Catch: java.lang.Throwable -> L49
            h02 r1 = (p000.h02) r1     // Catch: java.lang.Throwable -> L49
            r5 = 1
            boolean r0 = p000.AbstractC0073bd.m873(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r3)
            p000.ax1.m632(r4, r6)
            if (r0 == 0) goto L0
            goto L4c
        L49:
            r6 = move-exception
            monitor-exit(r3)
            throw r6
        L4c:
            return
        L4d:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }
}
