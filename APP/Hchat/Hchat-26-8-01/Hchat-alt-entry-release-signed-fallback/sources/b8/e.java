package b8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b8.k implements java.lang.Comparable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a2.a f508k;

    static {
            b8.a r0 = new b8.a
            return
    }

    public e() {
            r2 = this;
            r2.<init>()
            a2.a r0 = new a2.a
            r1 = 4
            r0.<init>(r1)
            r2.f508k = r0
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            b8.e r2 = (b8.e) r2
            if (r2 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r0 = r1.p()
            java.lang.String r2 = r2.p()
            int r2 = r0.compareTo(r2)
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r3 != r2) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof b8.e
            if (r1 != 0) goto La
            r3 = 0
            return r3
        La:
            java.lang.String r1 = r2.i(r0)
            b8.e r3 = (b8.e) r3
            java.lang.String r3 = r3.i(r0)
            boolean r3 = r1.equals(r3)
            return r3
    }

    public final int hashCode() {
            r1 = this;
            r0 = 1
            java.lang.String r0 = r1.i(r0)
            int r0 = r0.hashCode()
            return r0
    }

    @Override // b8.j
    public final void k(java.io.StringWriter r3, boolean r4) {
            r2 = this;
            z7.l r0 = new z7.l
            r0.<init>(r2)
        L5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L15
            java.lang.Object r1 = r0.next()
            b8.j r1 = (b8.j) r1
            r1.k(r3, r4)
            goto L5
        L15:
            return
    }

    @Override // b8.k
    public final b8.f n() {
            r1 = this;
            b8.f r0 = new b8.f
            r0.<init>()
            r1.m(r0)
            return r0
    }

    @Override // b8.k
    public final b8.h o() {
            r1 = this;
            b8.h r0 = new b8.h
            r0.<init>()
            r1.m(r0)
            return r0
    }

    public final java.lang.String p() {
            r4 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            z7.l r1 = new z7.l     // Catch: java.io.IOException -> L32
            r1.<init>(r4)     // Catch: java.io.IOException -> L32
        La:
            boolean r2 = r1.hasNext()     // Catch: java.io.IOException -> L32
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()     // Catch: java.io.IOException -> L32
            b8.j r2 = (b8.j) r2     // Catch: java.io.IOException -> L32
            boolean r3 = r2 instanceof b8.h     // Catch: java.io.IOException -> L32
            if (r3 == 0) goto L22
            b8.h r2 = (b8.h) r2     // Catch: java.io.IOException -> L32
            java.lang.String r2 = r2.f517h     // Catch: java.io.IOException -> L32
            r0.append(r2)     // Catch: java.io.IOException -> L32
            goto La
        L22:
            boolean r3 = r2 instanceof b8.f     // Catch: java.io.IOException -> L32
            if (r3 == 0) goto La
            b8.f r2 = (b8.f) r2     // Catch: java.io.IOException -> L32
            r2.u(r0)     // Catch: java.io.IOException -> L32
            goto La
        L2c:
            r0.flush()     // Catch: java.io.IOException -> L32
            r0.close()     // Catch: java.io.IOException -> L32
        L32:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
