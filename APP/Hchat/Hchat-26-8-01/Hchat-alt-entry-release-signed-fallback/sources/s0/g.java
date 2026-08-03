package s0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends java.util.AbstractMap implements java.util.Map, hg.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r0.b f12189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p0.j f12190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f12191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s0.h f12194l;

    public g(s0.h r2) {
            r1 = this;
            r1.<init>()
            r0.b r0 = new r0.b
            r0.<init>()
            r1.f12189g = r0
            p0.j r0 = r2.f10050g
            r1.f12190h = r0
            int r0 = r2.f10051h
            r1.f12193k = r0
            r1.f12194l = r2
            return
    }

    public final s0.h a() {
            r3 = this;
            p0.j r0 = r3.f12190h
            s0.h r1 = r3.f12194l
            p0.j r2 = r1.f10050g
            if (r0 != r2) goto L9
            goto L19
        L9:
            r0.b r0 = new r0.b
            r0.<init>()
            r3.f12189g = r0
            s0.h r1 = new s0.h
            p0.j r0 = r3.f12190h
            int r2 = r3.f12193k
            r1.<init>(r0, r2)
        L19:
            r3.f12194l = r1
            return r1
    }

    public final boolean c(java.lang.Object r4) {
            r3 = this;
            p0.j r0 = r3.f12190h
            r1 = 0
            if (r4 == 0) goto La
            int r2 = r4.hashCode()
            goto Lb
        La:
            r2 = r1
        Lb:
            boolean r4 = r0.d(r2, r1, r4)
            return r4
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
            r1 = this;
            p0.j r0 = p0.j.f10065e
            r1.f12190h = r0
            r0 = 0
            r1.f(r0)
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof i0.p1
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            i0.p1 r2 = (i0.p1) r2
            boolean r2 = r1.c(r2)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof i0.p2
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            i0.p2 r2 = (i0.p2) r2
            boolean r2 = super.containsValue(r2)
            return r2
    }

    public final java.lang.Object d(java.lang.Object r4) {
            r3 = this;
            p0.j r0 = r3.f12190h
            r1 = 0
            if (r4 == 0) goto La
            int r2 = r4.hashCode()
            goto Lb
        La:
            r2 = r1
        Lb:
            java.lang.Object r4 = r0.g(r2, r1, r4)
            return r4
    }

    public final java.lang.Object e(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            r3.f12191i = r0
            p0.j r0 = r3.f12190h
            r1 = 0
            if (r4 == 0) goto Ld
            int r2 = r4.hashCode()
            goto Le
        Ld:
            r2 = r1
        Le:
            p0.j r4 = r0.n(r2, r4, r1, r3)
            if (r4 != 0) goto L16
            p0.j r4 = p0.j.f10065e
        L16:
            r3.f12190h = r4
            java.lang.Object r4 = r3.f12191i
            return r4
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            p0.e r0 = new p0.e
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public final void f(int r1) {
            r0 = this;
            r0.f12193k = r1
            int r1 = r0.f12192j
            int r1 = r1 + 1
            r0.f12192j = r1
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof i0.p1
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            i0.p1 r2 = (i0.p1) r2
            java.lang.Object r2 = r1.d(r2)
            i0.p2 r2 = (i0.p2) r2
            return r2
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r2 instanceof i0.p1
            if (r0 != 0) goto L5
            return r3
        L5:
            i0.p1 r2 = (i0.p1) r2
            i0.p2 r3 = (i0.p2) r3
            java.lang.Object r2 = super.getOrDefault(r2, r3)
            i0.p2 r2 = (i0.p2) r2
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
            r2 = this;
            p0.e r0 = new p0.e
            r1 = 1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            r0 = 0
            r7.f12191i = r0
            p0.j r1 = r7.f12190h
            if (r8 == 0) goto Ld
            int r0 = r8.hashCode()
        Lb:
            r2 = r0
            goto Lf
        Ld:
            r0 = 0
            goto Lb
        Lf:
            r5 = 0
            r6 = r7
            r3 = r8
            r4 = r9
            p0.j r8 = r1.l(r2, r3, r4, r5, r6)
            r6.f12190h = r8
            java.lang.Object r8 = r6.f12191i
            return r8
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map r6) {
            r5 = this;
            boolean r0 = r6 instanceof p0.b
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r6
            p0.b r0 = (p0.b) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto L1c
            boolean r0 = r6 instanceof s0.g
            if (r0 == 0) goto L14
            r0 = r6
            s0.g r0 = (s0.g) r0
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto L1d
            s0.h r1 = r0.a()
            goto L1d
        L1c:
            r1 = r0
        L1d:
            if (r1 == 0) goto L42
            r0.a r6 = new r0.a
            r6.<init>()
            r0 = 0
            r6.f11304a = r0
            int r2 = r5.f12193k
            p0.j r3 = r5.f12190h
            p0.j r4 = r1.f10050g
            r4.getClass()
            p0.j r0 = r3.m(r4, r0, r6, r5)
            r5.f12190h = r0
            int r0 = r1.f10051h
            int r0 = r0 + r2
            int r6 = r6.f11304a
            int r0 = r0 - r6
            if (r2 == r0) goto L41
            r5.f(r0)
        L41:
            return
        L42:
            super.putAll(r6)
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof i0.p1
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            i0.p1 r2 = (i0.p1) r2
            java.lang.Object r2 = r1.e(r2)
            i0.p2 r2 = (i0.p2) r2
            return r2
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.f12193k
            p0.j r1 = r8.f12190h
            r7 = 0
            if (r9 == 0) goto Lc
            int r2 = r9.hashCode()
            goto Ld
        Lc:
            r2 = r7
        Ld:
            r5 = 0
            r6 = r8
            r3 = r9
            r4 = r10
            p0.j r9 = r1.o(r2, r3, r4, r5, r6)
            if (r9 != 0) goto L19
            p0.j r9 = p0.j.f10065e
        L19:
            r6.f12190h = r9
            int r9 = r6.f12193k
            if (r0 == r9) goto L21
            r9 = 1
            return r9
        L21:
            return r7
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
            r1 = this;
            int r0 = r1.f12193k
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
            r2 = this;
            p0.g r0 = new p0.g
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
