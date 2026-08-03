package e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements java.lang.Iterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e.c f2263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e.c f2264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.WeakHashMap f2265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f2267k;

    public a() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.f2265i = r0
            r0 = 0
            r1.f2266j = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2267k = r0
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof e.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            e.a r7 = (e.a) r7
            int r1 = r6.f2266j
            int r3 = r7.f2266j
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            e.b r3 = (e.b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            e.b r4 = (e.b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            e.b r7 = (e.b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.util.Iterator r0 = r4.iterator()
            r1 = 0
        L5:
            r2 = r0
            e.b r2 = (e.b) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1a
            java.lang.Object r2 = r2.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            goto L5
        L1a:
            return r1
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r4 = this;
            e.b r0 = new e.b
            e.c r1 = r4.f2263g
            e.c r2 = r4.f2264h
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.WeakHashMap r1 = r4.f2265i
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.put(r0, r2)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        Lb:
            r2 = r1
            e.b r2 = (e.b) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto Lb
            java.lang.String r2 = ", "
            r0.append(r2)
            goto Lb
        L2d:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
