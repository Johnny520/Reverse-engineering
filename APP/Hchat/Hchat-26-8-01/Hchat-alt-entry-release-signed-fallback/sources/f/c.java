package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements java.util.Iterator, java.util.Map.Entry {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f.e f2783j;

    public c(f.e r1) {
            r0 = this;
            r0.<init>()
            r0.f2783j = r1
            int r1 = r1.f2792i
            int r1 = r1 + (-1)
            r0.f2780g = r1
            r1 = -1
            r0.f2781h = r1
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r3.f2782i
            if (r0 == 0) goto L31
            boolean r0 = r4 instanceof java.util.Map.Entry
            if (r0 != 0) goto L9
            goto L2f
        L9:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            int r1 = r3.f2781h
            f.e r2 = r3.f2783j
            java.lang.Object r1 = r2.h(r1)
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L2f
            java.lang.Object r4 = r4.getValue()
            int r0 = r3.f2781h
            java.lang.Object r0 = r2.l(r0)
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L2f
            r4 = 1
            return r4
        L2f:
            r4 = 0
            return r4
        L31:
            java.lang.String r4 = "This container does not support retaining Map.Entry objects"
            j8.o.A(r4)
            r4 = 0
            return r4
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r2 = this;
            boolean r0 = r2.f2782i
            if (r0 == 0) goto Ld
            f.e r0 = r2.f2783j
            int r1 = r2.f2781h
            java.lang.Object r0 = r0.h(r1)
            return r0
        Ld:
            java.lang.String r0 = "This container does not support retaining Map.Entry objects"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r2 = this;
            boolean r0 = r2.f2782i
            if (r0 == 0) goto Ld
            f.e r0 = r2.f2783j
            int r1 = r2.f2781h
            java.lang.Object r0 = r0.l(r1)
            return r0
        Ld:
            java.lang.String r0 = "This container does not support retaining Map.Entry objects"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f2781h
            int r1 = r2.f2780g
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f2782i
            if (r0 == 0) goto L24
            int r0 = r3.f2781h
            f.e r1 = r3.f2783j
            java.lang.Object r0 = r1.h(r0)
            int r2 = r3.f2781h
            java.lang.Object r1 = r1.l(r2)
            r2 = 0
            if (r0 != 0) goto L17
            r0 = r2
            goto L1b
        L17:
            int r0 = r0.hashCode()
        L1b:
            if (r1 != 0) goto L1e
            goto L22
        L1e:
            int r2 = r1.hashCode()
        L22:
            r0 = r0 ^ r2
            return r0
        L24:
            java.lang.String r0 = "This container does not support retaining Map.Entry objects"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf
            int r0 = r2.f2781h
            r1 = 1
            int r0 = r0 + r1
            r2.f2781h = r0
            r2.f2782i = r1
            return r2
        Lf:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            boolean r0 = r2.f2782i
            if (r0 == 0) goto L1b
            f.e r0 = r2.f2783j
            int r1 = r2.f2781h
            r0.j(r1)
            int r0 = r2.f2781h
            int r0 = r0 + (-1)
            r2.f2781h = r0
            int r0 = r2.f2780g
            int r0 = r0 + (-1)
            r2.f2780g = r0
            r0 = 0
            r2.f2782i = r0
            return
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r2.f2782i
            if (r0 == 0) goto Ld
            f.e r0 = r2.f2783j
            int r1 = r2.f2781h
            java.lang.Object r3 = r0.k(r1, r3)
            return r3
        Ld:
            java.lang.String r3 = "This container does not support retaining Map.Entry objects"
            j8.o.A(r3)
            r3 = 0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.getKey()
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r1 = r2.getValue()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
