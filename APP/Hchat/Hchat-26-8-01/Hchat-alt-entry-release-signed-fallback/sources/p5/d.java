package p5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements w5.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k5.u f10256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10257h;

    public d(k5.u r1, a5.a r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f10256g = r1
            int r3 = r3 + 1
            int r1 = r2.l(r3)
            r0.f10257h = r1
            return
    }

    public final i5.a a() {
            r3 = this;
            n5.b r0 = new n5.b
            k5.u r1 = r3.f10256g
            int r2 = r3.f10257h
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            w5.a r3 = (w5.a) r3
            r0 = 25
            int r1 = r3.h()
            int r0 = java.lang.Integer.compare(r0, r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            i5.a r0 = r2.a()
            p5.d r3 = (p5.d) r3
            i5.a r3 = r3.a()
            int r3 = r0.e1(r3)
            return r3
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p5.d
            if (r0 == 0) goto L13
            i5.a r0 = r1.a()
            p5.d r2 = (p5.d) r2
            i5.a r2 = r2.a()
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // w5.a
    public final int h() {
            r1 = this;
            r0 = 25
            return r0
    }

    public final int hashCode() {
            r1 = this;
            i5.a r0 = r1.a()
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            q5.a r1 = new q5.a     // Catch: java.io.IOException -> L12
            r1.<init>(r0)     // Catch: java.io.IOException -> L12
            r1.g(r2)     // Catch: java.io.IOException -> L12
            java.lang.String r0 = r0.toString()
            return r0
        L12:
            java.lang.String r0 = "Unexpected IOException"
            j8.o.f(r0)
            r0 = 0
            return r0
    }
}
