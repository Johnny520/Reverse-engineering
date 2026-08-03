package o7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends k7.c implements java.lang.Iterable, java.lang.Comparable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k7.a[] f9584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l7.j f9585l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j7.e f9586m;

    public j() {
            r5 = this;
            l7.j r0 = new l7.j
            r1 = 0
            r0.<init>(r1)
            j7.e r2 = new j7.e
            r2.<init>()
            r5.<init>()
            r5.f9585l = r0
            r5.f9586m = r2
            r3 = 2
            k7.a[] r3 = new k7.a[r3]
            r3[r1] = r0
            r4 = 1
            r3[r4] = r2
            r5.f9584k = r3
            r0.H(r1)
            r2.H(r4)
            r0.J(r5)
            r2.J(r5)
            return
    }

    @Override // k7.c, k7.a
    public final void B(q7.b r4) {
            r3 = this;
            r4.getClass()
            p7.b r0 = p7.b.T(r4)
            if (r0 != 0) goto La
            return
        La:
            int r1 = r0.Q()
            r2 = 13
            if (r1 != r2) goto L1e
            j7.e r0 = r3.f9586m
            k7.a r0 = r0.P()
            l7.m r0 = (l7.m) r0
            r0.G(r4)
            return
        L1e:
            r2 = 14
            if (r1 != r2) goto L28
            l7.j r0 = r3.f9585l
            r0.G(r4)
            return
        L28:
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = ", Should be: "
            java.lang.String r1 = j8.b.u(r2)
            java.lang.String r2 = "Unexpected block: "
            okio.a.j(r2, r4, r0, r1)
            return
    }

    @Override // k7.c
    public final k7.a[] L() {
            r1 = this;
            k7.a[] r0 = r1.f9584k
            return r0
    }

    @Override // k7.c
    public final void N() {
            r0 = this;
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            o7.j r2 = (o7.j) r2
            l7.j r0 = r1.f9585l
            p7.a r0 = r0.f7869m
            p7.g r0 = (p7.g) r0
            r7.c r0 = r0.f10286r
            int r0 = r0.get()
            l7.j r2 = r2.f9585l
            p7.a r2 = r2.f7869m
            p7.g r2 = (p7.g) r2
            r7.c r2 = r2.f10286r
            int r2 = r2.get()
            int r2 = java.lang.Integer.compare(r0, r2)
            return r2
    }

    public final boolean isEmpty() {
            r4 = this;
            j7.e r0 = r4.f9586m
            r0.getClass()
            r1 = 0
            java.util.Iterator r0 = r0.j0(r1)
        La:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L26
            java.lang.Object r2 = r0.next()
            l7.m r2 = (l7.m) r2
            if (r2 == 0) goto La
            s7.b r2 = r2.f7890o
            java.util.Iterator r2 = r2.n0(r3)
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto La
            return r1
        L26:
            return r3
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            j7.e r0 = r1.f9586m
            z7.c r0 = r0.f9563k
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            l7.j r1 = r3.f9585l
            byte r2 = r1.V()
            java.lang.String r2 = y7.a.n(r2)
            r0.append(r2)
            java.lang.String r2 = " ("
            r0.append(r2)
            java.lang.Class<l7.f> r2 = l7.f.class
            k7.a r2 = r3.u(r2)
            l7.f r2 = (l7.f) r2
            if (r2 == 0) goto L32
            u7.d r2 = r2.f7876o
            p7.a r1 = r1.f7869m
            p7.g r1 = (p7.g) r1
            r7.c r1 = r1.f10286r
            int r1 = r1.get()
            r7.y r1 = r2.c0(r1)
            goto L33
        L32:
            r1 = 0
        L33:
            if (r1 == 0) goto L3b
            java.lang.String r1 = r1.f11578m
            r0.append(r1)
            goto L40
        L3b:
            java.lang.String r1 = "null"
            r0.append(r1)
        L40:
            java.lang.String r1 = ") config count="
            r0.append(r1)
            j7.e r1 = r3.f9586m
            z7.c r1 = r1.f9563k
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
