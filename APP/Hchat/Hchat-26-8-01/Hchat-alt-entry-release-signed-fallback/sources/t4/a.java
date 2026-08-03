package t4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends z4.j implements java.lang.Comparable, z4.k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.d0 f13070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.TreeMap f13072j;

    public a(v4.d0 r1, int r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L1a
            if (r2 == 0) goto L13
            r0.f13070h = r1
            r0.f13071i = r2
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            r0.f13072j = r1
            return
        L13:
            java.lang.String r1 = "visibility == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
        L1a:
            java.lang.String r1 = "type == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    @Override // z4.k
    public final java.lang.String a() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.f13071i
            java.lang.String r1 = p.a.c(r1)
            r0.append(r1)
            java.lang.String r1 = "-annotation "
            r0.append(r1)
            v4.d0 r1 = r5.f13070h
            w4.c r1 = r1.f14088g
            java.lang.String r1 = r1.a()
            r0.append(r1)
            java.lang.String r1 = " {"
            r0.append(r1)
            java.util.TreeMap r1 = r5.f13072j
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r1.next()
            t4.d r3 = (t4.d) r3
            if (r2 == 0) goto L3e
            r2 = 0
            goto L43
        L3e:
            java.lang.String r4 = ", "
            r0.append(r4)
        L43:
            v4.c0 r4 = r3.f13076g
            java.lang.String r4 = r4.a()
            r0.append(r4)
            java.lang.String r4 = ": "
            r0.append(r4)
            v4.a r3 = r3.f13077h
            java.lang.String r3 = r3.a()
            r0.append(r3)
            goto L2e
        L5b:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            t4.a r1 = (t4.a) r1
            int r1 = r0.m(r1)
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof t4.a
            if (r0 != 0) goto L5
            goto L21
        L5:
            t4.a r3 = (t4.a) r3
            v4.d0 r0 = r2.f13070h
            v4.d0 r1 = r3.f13070h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21
            int r0 = r2.f13071i
            int r1 = r3.f13071i
            if (r0 == r1) goto L18
            goto L21
        L18:
            java.util.TreeMap r0 = r2.f13072j
            java.util.TreeMap r3 = r3.f13072j
            boolean r3 = r0.equals(r3)
            return r3
        L21:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            v4.d0 r0 = r2.f13070h
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.TreeMap r1 = r2.f13072j
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f13071i
            int r0 = t3.c.b(r0)
            int r0 = r0 + r1
            return r0
    }

    public final void l(t4.d r4) {
            r3 = this;
            r3.j()
            v4.c0 r0 = r4.f13076g
            java.util.TreeMap r1 = r3.f13072j
            java.lang.Object r2 = r1.get(r0)
            if (r2 != 0) goto L11
            r1.put(r0, r4)
            return
        L11:
            java.lang.String r4 = "name already added: "
            g1.d.f(r0, r4)
            return
    }

    public final int m(t4.a r6) {
            r5 = this;
            v4.d0 r0 = r5.f13070h
            v4.d0 r1 = r6.f13070h
            int r0 = r0.d(r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            int r0 = r6.f13071i
            int r1 = r5.f13071i
            if (r1 == 0) goto L6b
            if (r0 == 0) goto L6b
            int r1 = r1 - r0
            if (r1 == 0) goto L17
            return r1
        L17:
            java.util.TreeMap r0 = r5.f13072j
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            java.util.TreeMap r6 = r6.f13072j
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L59
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.next()
            t4.d r1 = (t4.d) r1
            java.lang.Object r2 = r6.next()
            t4.d r2 = (t4.d) r2
            v4.c0 r3 = r1.f13076g
            v4.c0 r4 = r2.f13076g
            int r3 = r3.d(r4)
            if (r3 == 0) goto L4e
            goto L56
        L4e:
            v4.a r1 = r1.f13077h
            v4.a r2 = r2.f13077h
            int r3 = r1.d(r2)
        L56:
            if (r3 == 0) goto L2b
            return r3
        L59:
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L61
            r6 = 1
            return r6
        L61:
            boolean r6 = r6.hasNext()
            if (r6 == 0) goto L69
            r6 = -1
            return r6
        L69:
            r6 = 0
            return r6
        L6b:
            r6 = 0
            throw r6
    }

    public final void n(t4.d r3) {
            r2 = this;
            r2.j()
            java.util.TreeMap r0 = r2.f13072j
            v4.c0 r1 = r3.f13076g
            r0.put(r1, r3)
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.a()
            return r0
    }
}
