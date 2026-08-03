package t4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z4.j implements java.lang.Comparable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t4.b f13073i = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.TreeMap f13074h;

    static {
            t4.b r0 = new t4.b
            r0.<init>()
            t4.b.f13073i = r0
            r1 = 0
            r0.f22555g = r1
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.f13074h = r0
            return
    }

    public static t4.b n(t4.b r1, t4.a r2) {
            t4.b r0 = new t4.b
            r0.<init>()
            r0.m(r1)
            r0.l(r2)
            r1 = 0
            r0.f22555g = r1
            return r0
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            t4.b r1 = (t4.b) r1
            int r1 = r0.o(r1)
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof t4.b
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            t4.b r2 = (t4.b) r2
            java.util.TreeMap r0 = r1.f13074h
            java.util.TreeMap r2 = r2.f13074h
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.util.TreeMap r0 = r1.f13074h
            int r0 = r0.hashCode()
            return r0
    }

    public final void l(t4.a r4) {
            r3 = this;
            r3.j()
            if (r4 == 0) goto L1f
            v4.d0 r0 = r4.f13070h
            java.util.TreeMap r1 = r3.f13074h
            boolean r2 = r1.containsKey(r0)
            if (r2 != 0) goto L13
            r1.put(r0, r4)
            return
        L13:
            w4.c r4 = r0.f14088g
            java.lang.String r4 = r4.a()
            java.lang.String r0 = "duplicate type: "
            j8.o.x(r4, r0)
            return
        L1f:
            java.lang.String r4 = "annotation == null"
            bsh.j.c(r4)
            return
    }

    public final void m(t4.b r2) {
            r1 = this;
            r1.j()
            if (r2 == 0) goto L20
            java.util.TreeMap r2 = r2.f13074h
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r2.next()
            t4.a r0 = (t4.a) r0
            r1.l(r0)
            goto Lf
        L1f:
            return
        L20:
            java.lang.String r2 = "toAdd == null"
            bsh.j.c(r2)
            return
    }

    public final int o(t4.b r4) {
            r3 = this;
            java.util.TreeMap r0 = r3.f13074h
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            java.util.TreeMap r4 = r4.f13074h
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            t4.a r1 = (t4.a) r1
            java.lang.Object r2 = r4.next()
            t4.a r2 = (t4.a) r2
            int r1 = r1.m(r2)
            if (r1 == 0) goto L14
            return r1
        L33:
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L3b
            r4 = 1
            return r4
        L3b:
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L43
            r4 = -1
            return r4
        L43:
            r4 = 0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "annotations{"
            r0.<init>(r1)
            java.util.TreeMap r1 = r5.f13074h
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L12:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r1.next()
            t4.a r3 = (t4.a) r3
            if (r2 == 0) goto L22
            r2 = 0
            goto L27
        L22:
            java.lang.String r4 = ", "
            r0.append(r4)
        L27:
            java.lang.String r3 = r3.a()
            r0.append(r3)
            goto L12
        L2f:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
