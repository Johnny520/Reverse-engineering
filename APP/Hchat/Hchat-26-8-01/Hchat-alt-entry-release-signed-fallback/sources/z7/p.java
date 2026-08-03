package z7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Object f22623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ae.d f22624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.Object f22626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.Iterator f22627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public z7.p f22628l;

    public p(java.lang.Object r1, ae.d r2) {
            r0 = this;
            r0.<init>()
            r0.f22623g = r1
            r0.f22624h = r2
            return
    }

    public final java.lang.Object a() {
            r3 = this;
            java.lang.Object r0 = r3.f22626j
            if (r0 != 0) goto L38
            boolean r0 = r3.f22625i
            r1 = 0
            if (r0 != 0) goto L15
            r0 = 1
            r3.f22625i = r0
            java.lang.Object r0 = r3.f22623g
            if (r0 != 0) goto L13
            r3.f22623g = r1
            goto L35
        L13:
            r1 = r0
            goto L35
        L15:
            java.lang.Object r0 = r3.f22623g
            if (r0 == 0) goto L25
            r3.f22623g = r1
            ae.d r2 = r3.f22624h
            java.lang.Object r0 = r2.apply(r0)
            java.util.Iterator r0 = (java.util.Iterator) r0
            r3.f22627k = r0
        L25:
            java.util.Iterator r0 = r3.b()
            if (r0 == 0) goto L35
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r1 = r0.next()
        L35:
            r3.f22626j = r1
            return r1
        L38:
            return r0
    }

    public final java.util.Iterator b() {
            r3 = this;
            z7.p r0 = r3.f22628l
            if (r0 == 0) goto Lb
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb
            return r0
        Lb:
            r0 = 0
            r3.f22628l = r0
            java.util.Iterator r1 = r3.f22627k
            if (r1 == 0) goto L26
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            z7.p r0 = new z7.p
            java.lang.Object r1 = r1.next()
            ae.d r2 = r3.f22624h
            r0.<init>(r1, r2)
            r3.f22628l = r0
            goto L28
        L26:
            r3.f22627k = r0
        L28:
            if (r0 == 0) goto L34
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L34
            java.util.Iterator r0 = r3.b()
        L34:
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
            r2.f22626j = r1
            return r0
        La:
            bsh.j.e()
            r0 = 0
            return r0
    }
}
