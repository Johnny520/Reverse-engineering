package p0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p0.k[] f10052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10054i;

    public c(p0.j r3, p0.k[] r4) {
            r2 = this;
            r2.<init>()
            r2.f10052g = r4
            r0 = 1
            r2.f10054i = r0
            r0 = 0
            r4 = r4[r0]
            java.lang.Object[] r1 = r3.f10069d
            int r3 = r3.f10066a
            int r3 = java.lang.Integer.bitCount(r3)
            int r3 = r3 * 2
            r4.a(r1, r3, r0)
            r2.f10053h = r0
            r2.a()
            return
    }

    public final void a() {
            r9 = this;
            int r0 = r9.f10053h
            p0.k[] r1 = r9.f10052g
            r2 = r1[r0]
            int r3 = r2.f10072i
            int r2 = r2.f10071h
            if (r3 >= r2) goto Ld
            return
        Ld:
            r2 = 0
            r3 = -1
            if (r3 >= r0) goto L49
            int r4 = r9.c(r0)
            if (r4 != r3) goto L29
            r5 = r1[r0]
            int r6 = r5.f10072i
            java.lang.Object[] r7 = r5.f10070g
            int r8 = r7.length
            if (r6 >= r8) goto L29
            int r4 = r7.length
            int r6 = r6 + 1
            r5.f10072i = r6
            int r4 = r9.c(r0)
        L29:
            if (r4 == r3) goto L2e
            r9.f10053h = r4
            return
        L2e:
            if (r0 <= 0) goto L3d
            int r3 = r0 + (-1)
            r3 = r1[r3]
            int r4 = r3.f10072i
            java.lang.Object[] r5 = r3.f10070g
            int r5 = r5.length
            int r4 = r4 + 1
            r3.f10072i = r4
        L3d:
            r3 = r1[r0]
            p0.j r4 = p0.j.f10065e
            java.lang.Object[] r4 = r4.f10069d
            r3.a(r4, r2, r2)
            int r0 = r0 + (-1)
            goto Ld
        L49:
            r9.f10054i = r2
            return
    }

    public final int c(int r5) {
            r4 = this;
            p0.k[] r0 = r4.f10052g
            r1 = r0[r5]
            int r2 = r1.f10072i
            int r3 = r1.f10071h
            if (r2 >= r3) goto Lb
            return r5
        Lb:
            java.lang.Object[] r1 = r1.f10070g
            int r3 = r1.length
            if (r2 >= r3) goto L3f
            int r3 = r1.length
            r1 = r1[r2]
            r1.getClass()
            p0.j r1 = (p0.j) r1
            r2 = 6
            r3 = 0
            if (r5 != r2) goto L27
            int r2 = r5 + 1
            r0 = r0[r2]
            java.lang.Object[] r1 = r1.f10069d
            int r2 = r1.length
            r0.a(r1, r2, r3)
            goto L38
        L27:
            int r2 = r5 + 1
            r0 = r0[r2]
            java.lang.Object[] r2 = r1.f10069d
            int r1 = r1.f10066a
            int r1 = java.lang.Integer.bitCount(r1)
            int r1 = r1 * 2
            r0.a(r2, r1, r3)
        L38:
            int r5 = r5 + 1
            int r5 = r4.c(r5)
            return r5
        L3f:
            r5 = -1
            return r5
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            boolean r0 = r1.f10054i
            return r0
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.f10054i
            if (r0 == 0) goto L12
            p0.k[] r0 = r2.f10052g
            int r1 = r2.f10053h
            r0 = r0[r1]
            java.lang.Object r0 = r0.next()
            r2.a()
            return r0
        L12:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
