package z7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements java.util.Iterator, z7.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object[] f22591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.function.Predicate f22593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22594j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f22595k;

    public d(java.lang.Object[] r1, int r2, java.util.function.Predicate r3) {
            r0 = this;
            r0.<init>()
            r0.f22591g = r1
            r0.f22592h = r2
            r0.f22593i = r3
            return
    }

    public final java.lang.Object a() {
            r3 = this;
            java.lang.Object r0 = r3.f22595k
            if (r0 != 0) goto L23
            java.lang.Object[] r0 = r3.f22591g
            if (r0 == 0) goto L23
        L8:
            int r1 = r3.f22594j
            int r2 = r3.f22592h
            if (r1 >= r2) goto L23
            r2 = r0[r1]
            int r1 = r1 + 1
            r3.f22594j = r1
            if (r2 != 0) goto L17
            goto L8
        L17:
            java.util.function.Predicate r1 = r3.f22593i
            if (r1 == 0) goto L21
            boolean r1 = r1.test(r2)
            if (r1 == 0) goto L8
        L21:
            r3.f22595k = r2
        L23:
            java.lang.Object r0 = r3.f22595k
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.lang.Object r0 = r1.a()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            java.lang.Object r0 = r2.a()
            if (r0 == 0) goto La
            r1 = 0
            r2.f22595k = r1
            return r0
        La:
            bsh.j.e()
            r0 = 0
            return r0
    }
}
