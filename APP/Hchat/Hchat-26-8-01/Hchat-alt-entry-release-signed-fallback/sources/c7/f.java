package c7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements java.util.Comparator, java.lang.Iterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f1040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.LinkedHashMap f1041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c7.e[] f1042i;

    public f(java.util.LinkedHashMap r4) {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.f1040g = r0
            r3.f1041h = r4
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L15:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r4.next()
            c7.e r1 = (c7.e) r1
            boolean r2 = r1 instanceof i7.c
            if (r2 == 0) goto L15
            r0 = r1
            i7.c r0 = (i7.c) r0
            java.lang.String r1 = r1.f1036a
            java.lang.String r2 = "META-INF/"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto L15
        L32:
            if (r0 != 0) goto L35
            return
        L35:
            c7.b r4 = r0.f6515f
            d7.d r0 = r4.a()
            int r1 = r0.f2040p
            r2 = 4
            int r1 = r1 + r2
            r0.N(r1)
            d7.d r0 = r4.a()
            r0.O(r2)
            d7.m r0 = r4.f1034a
            r0.O(r2)
            d7.d r4 = r4.a()
            r0 = 6
            r4.O(r0)
            return
    }

    public final void a(c7.d r4) {
            r3 = this;
            java.lang.Object r0 = r3.f1040g
            monitor-enter(r0)
            java.lang.String r1 = r4.a()     // Catch: java.lang.Throwable -> L14
            java.util.LinkedHashMap r2 = r3.f1041h     // Catch: java.lang.Throwable -> L14
            r2.remove(r1)     // Catch: java.lang.Throwable -> L14
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> L14
            r4 = 0
            r3.f1042i = r4     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
    }

    public final c7.e b(java.lang.String r3) {
            r2 = this;
            java.lang.Object r0 = r2.f1040g
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r2.f1041h     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> Ld
            c7.e r3 = (c7.e) r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    public final c7.e[] c() {
            r5 = this;
            java.lang.Object r0 = r5.f1040g
            monitor-enter(r0)
            c7.e[] r1 = r5.f1042i     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            goto L31
        Lb:
            java.util.LinkedHashMap r1 = r5.f1041h     // Catch: java.lang.Throwable -> L9
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L9
            c7.e[] r2 = new c7.e[r2]     // Catch: java.lang.Throwable -> L9
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L9
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L9
            r3 = 0
        L1c:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L9
            if (r4 == 0) goto L2d
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L9
            c7.e r4 = (c7.e) r4     // Catch: java.lang.Throwable -> L9
            r2[r3] = r4     // Catch: java.lang.Throwable -> L9
            int r3 = r3 + 1
            goto L1c
        L2d:
            r5.f1042i = r2     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r2
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            c7.e r1 = (c7.e) r1
            c7.e r2 = (c7.e) r2
            if (r1 != r2) goto L8
            r1 = 0
            return r1
        L8:
            if (r1 != 0) goto Lc
            r1 = 1
            return r1
        Lc:
            if (r2 != 0) goto L10
            r1 = -1
            return r1
        L10:
            int r1 = r1.f1039d
            int r2 = r2.f1039d
            int r1 = java.lang.Integer.compare(r1, r2)
            return r1
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r4 = this;
            c7.e[] r0 = r4.c()
            int r1 = r0.length
            if (r1 != 0) goto L8
            goto L1b
        L8:
            int r1 = r0.length
            r2 = 0
        La:
            if (r2 >= r1) goto L1b
            r3 = r0[r2]
            if (r3 == 0) goto L18
            z7.d r1 = new z7.d
            r2 = 0
            int r3 = r0.length
            r1.<init>(r0, r3, r2)
            return r1
        L18:
            int r2 = r2 + 1
            goto La
        L1b:
            z7.h r0 = z7.h.f22606g
            return r0
    }
}
