package p5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements w5.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k5.u f10251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10253i;

    public b(k5.u r3, a5.a r4) {
            r2 = this;
            r2.<init>()
            r2.f10251g = r3
            r3 = 0
            int r0 = r4.o(r3)
            r2.f10252h = r0
            int r1 = r4.f56h
            r2.f10253i = r1
        L10:
            if (r3 >= r0) goto L18
            fb.v0.K(r4)
            int r3 = r3 + 1
            goto L10
        L18:
            return
    }

    public final java.util.List a() {
            r6 = this;
            k5.d0 r0 = new k5.d0
            k5.u r1 = r6.f10251g
            androidx.lifecycle.x r2 = r1.f7264b
            int r4 = r6.f10252h
            r5 = 1
            int r3 = r6.f10253i
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r4) {
            r3 = this;
            w5.a r4 = (w5.a) r4
            r0 = 28
            int r1 = r4.h()
            int r0 = java.lang.Integer.compare(r0, r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            java.util.List r0 = r3.a()
            p5.b r4 = (p5.b) r4
            java.util.List r4 = r4.a()
            int r1 = r0.size()
            int r2 = r4.size()
            int r1 = java.lang.Integer.compare(r1, r2)
            if (r1 == 0) goto L28
            return r1
        L28:
            java.util.Iterator r4 = r4.iterator()
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Object r2 = r4.next()
            int r1 = r1.compareTo(r2)
            if (r1 == 0) goto L30
            return r1
        L47:
            r4 = 0
            return r4
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p5.b
            if (r0 == 0) goto L13
            java.util.List r0 = r1.a()
            p5.b r2 = (p5.b) r2
            java.util.List r2 = r2.a()
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // w5.a
    public final int h() {
            r1 = this;
            r0 = 28
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.util.List r0 = r1.a()
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
