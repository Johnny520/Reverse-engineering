package p5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements w5.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k5.u f10262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10263h;

    public g(k5.u r1, a5.a r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f10262g = r1
            int r3 = r3 + 1
            int r1 = r2.l(r3)
            r0.f10263h = r1
            return
    }

    public final n5.d a() {
            r3 = this;
            n5.d r0 = new n5.d
            k5.u r1 = r3.f10262g
            int r2 = r3.f10263h
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r4) {
            r3 = this;
            w5.a r4 = (w5.a) r4
            r0 = 21
            int r1 = r4.h()
            int r0 = java.lang.Integer.compare(r0, r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            n5.d r0 = r3.a()
            p5.g r4 = (p5.g) r4
            n5.d r4 = r4.a()
            java.lang.String r1 = r0.f1()
            java.lang.String r2 = r4.f1()
            int r1 = r1.compareTo(r2)
            if (r1 == 0) goto L28
            return r1
        L28:
            java.util.List r0 = r0.e1()
            java.util.List r4 = r4.e1()
            int r4 = d6.d.b(r0, r4)
            return r4
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p5.g
            if (r0 == 0) goto L13
            n5.d r0 = r1.a()
            p5.g r2 = (p5.g) r2
            n5.d r2 = r2.a()
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // w5.a
    public final int h() {
            r1 = this;
            r0 = 21
            return r0
    }

    public final int hashCode() {
            r1 = this;
            n5.d r0 = r1.a()
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
