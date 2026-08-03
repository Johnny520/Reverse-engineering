package b6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements w5.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte f493g;

    public b(byte r1) {
            r0 = this;
            r0.<init>()
            r0.f493g = r1
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            w5.a r3 = (w5.a) r3
            r0 = 0
            int r1 = r3.h()
            int r0 = java.lang.Integer.compare(r0, r1)
            if (r0 == 0) goto Le
            return r0
        Le:
            b6.b r3 = (b6.b) r3
            byte r3 = r3.f493g
            byte r0 = r2.f493g
            int r3 = java.lang.Integer.compare(r0, r3)
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof b6.b
            r1 = 0
            if (r0 == 0) goto Lf
            b6.b r3 = (b6.b) r3
            byte r3 = r3.f493g
            byte r0 = r2.f493g
            if (r0 != r3) goto Lf
            r3 = 1
            return r3
        Lf:
            return r1
    }

    @Override // w5.a
    public final int h() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final int hashCode() {
            r1 = this;
            byte r0 = r1.f493g
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
