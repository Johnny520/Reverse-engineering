package n5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a.a implements java.lang.Comparable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k5.u f9019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9020k;

    public d(k5.u r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f9019j = r1
            r0.f9020k = r2
            return
    }

    @Override // a.a, v5.b
    public final void a() {
            r3 = this;
            int r0 = r3.f9020k
            if (r0 < 0) goto Lf
            k5.u r1 = r3.f9019j
            k5.p r1 = r1.f7284v
            k5.u r1 = r1.f7256h
            int r1 = r1.f7270h
            if (r0 >= r1) goto Lf
            return
        Lf:
            v5.a r1 = new v5.a
            java.lang.String r2 = "proto@"
            java.lang.String r0 = eh.a.l(r0, r2)
            r1.<init>(r0)
            throw r1
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            n5.d r3 = (n5.d) r3
            java.lang.String r0 = r2.f1()
            java.lang.String r1 = r3.f1()
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L11
            return r0
        L11:
            java.util.List r0 = r2.e1()
            java.util.List r3 = r3.e1()
            int r3 = d6.d.b(r0, r3)
            return r3
    }

    public final java.util.List e1() {
            r4 = this;
            k5.u r0 = r4.f9019j
            androidx.lifecycle.x r1 = r0.f7263a
            k5.p r2 = r0.f7284v
            int r3 = r4.f9020k
            int r2 = r2.b(r3)
            int r2 = r2 + 8
            int r1 = r1.N(r2)
            if (r1 <= 0) goto L23
            androidx.lifecycle.x r0 = r0.f7264b
            int r0 = r0.N(r1)
            int r1 = r1 + 4
            k5.y r2 = new k5.y
            r3 = 1
            r2.<init>(r4, r1, r0, r3)
            return r2
        L23:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof n5.d
            if (r0 == 0) goto L24
            n5.d r3 = (n5.d) r3
            java.lang.String r0 = r2.f1()
            java.lang.String r1 = r3.f1()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24
            java.util.List r0 = r2.e1()
            java.util.List r3 = r3.e1()
            boolean r3 = d6.d.e(r0, r3)
            if (r3 == 0) goto L24
            r3 = 1
            return r3
        L24:
            r3 = 0
            return r3
    }

    public final java.lang.String f1() {
            r4 = this;
            k5.u r0 = r4.f9019j
            k5.s r1 = r0.f7281s
            androidx.lifecycle.x r2 = r0.f7263a
            k5.p r0 = r0.f7284v
            int r3 = r4.f9020k
            int r0 = r0.b(r3)
            int r0 = r0 + 4
            int r0 = r2.N(r0)
            java.lang.String r0 = r1.b(r0)
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f1()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List r1 = r2.e1()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            q5.a r1 = new q5.a     // Catch: java.io.IOException -> L12
            r1.<init>(r0)     // Catch: java.io.IOException -> L12
            r1.l(r2)     // Catch: java.io.IOException -> L12
            java.lang.String r0 = r0.toString()
            return r0
        L12:
            java.lang.String r0 = "Unexpected IOException"
            j8.o.f(r0)
            r0 = 0
            return r0
    }
}
