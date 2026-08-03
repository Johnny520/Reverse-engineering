package p0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class b implements java.util.Map, hg.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p0.b f10049i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p0.j f10050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10051h;

    static {
            p0.b r0 = new p0.b
            p0.j r1 = p0.j.f10065e
            r2 = 0
            r0.<init>(r1, r2)
            p0.b.f10049i = r0
            return
    }

    public b(p0.j r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f10050g = r1
            r0.f10051h = r2
            return
    }

    public final p0.b a(java.lang.Object r4, q0.a r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L8
            int r1 = r4.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            p0.j r2 = r3.f10050g
            a5.a r4 = r2.u(r1, r4, r5, r0)
            if (r4 != 0) goto L12
            return r3
        L12:
            p0.b r5 = new p0.b
            java.lang.Object r0 = r4.f57i
            p0.j r0 = (p0.j) r0
            int r1 = r3.f10051h
            int r4 = r4.f56h
            int r1 = r1 + r4
            r5.<init>(r0, r1)
            return r5
    }

    @Override // java.util.Map
    public final void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L8
            int r1 = r4.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            p0.j r2 = r3.f10050g
            boolean r4 = r2.d(r1, r0, r4)
            return r4
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r4) {
            r3 = this;
            java.util.Set r0 = r3.entrySet()
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto Lc
            return r2
        Lc:
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            boolean r1 = gg.l.a(r1, r4)
            if (r1 == 0) goto L10
            r4 = 1
            return r4
        L28:
            return r2
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            p0.h r0 = new p0.h
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof java.util.Map
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Map r6 = (java.util.Map) r6
            int r1 = r6.size()
            int r3 = r5.f10051h
            if (r3 == r1) goto L15
            return r2
        L15:
            java.util.Set r6 = r6.entrySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L29
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L29
            return r0
        L29:
            java.util.Iterator r6 = r6.iterator()
        L2d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 != 0) goto L3c
            goto L57
        L3c:
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r4 = r5.get(r3)
            boolean r1 = gg.l.a(r1, r4)
            if (r1 != 0) goto L4f
            goto L57
        L4f:
            if (r4 != 0) goto L2d
            boolean r1 = r5.containsKey(r3)
            if (r1 != 0) goto L2d
        L57:
            return r2
        L58:
            return r0
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L8
            int r1 = r4.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            p0.j r2 = r3.f10050g
            java.lang.Object r4 = r2.g(r1, r0, r4)
            return r4
    }

    @Override // java.util.Map
    public final int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f10051h
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r2 = this;
            p0.h r0 = new p0.h
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public final int size() {
            r1 = this;
            int r0 = r1.f10051h
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            java.util.Set r0 = r6.entrySet()
            nb.a r4 = new nb.a
            r1 = 13
            r4.<init>(r6, r1)
            r5 = 24
            java.lang.String r1 = ", "
            java.lang.String r2 = "{"
            java.lang.String r3 = "}"
            java.lang.String r0 = tf.m.A1(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r2 = this;
            og.h r0 = new og.h
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }
}
