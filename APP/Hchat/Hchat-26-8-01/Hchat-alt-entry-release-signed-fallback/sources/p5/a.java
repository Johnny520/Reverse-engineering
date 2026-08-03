package p5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements w5.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k5.u f10247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f10248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10250j;

    public a(k5.u r3, a5.a r4) {
            r2 = this;
            r2.<init>()
            r2.f10247g = r3
            k5.s r3 = r3.f7281s
            r0 = 0
            int r1 = r4.o(r0)
            java.lang.String r3 = r3.b(r1)
            r2.f10248h = r3
            int r3 = r4.o(r0)
            r2.f10249i = r3
            int r0 = r4.f56h
            r2.f10250j = r0
            b(r4, r3)
            return
    }

    public static void b(a5.a r1, int r2) {
            r0 = 0
        L1:
            if (r0 >= r2) goto Lc
            r1.q()
            fb.v0.K(r1)
            int r0 = r0 + 1
            goto L1
        Lc:
            return
    }

    public final java.util.Set a() {
            r6 = this;
            k5.a r0 = new k5.a
            k5.u r1 = r6.f10247g
            androidx.lifecycle.x r2 = r1.f7264b
            int r4 = r6.f10249i
            r5 = 1
            int r3 = r6.f10250j
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            w5.a r3 = (w5.a) r3
            r0 = 29
            int r1 = r3.h()
            int r0 = java.lang.Integer.compare(r0, r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            p5.a r3 = (p5.a) r3
            java.lang.String r0 = r2.getType()
            java.lang.String r1 = r3.getType()
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L20
            return r0
        L20:
            java.util.Set r0 = r2.a()
            java.util.Set r3 = r3.a()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Set r3 = (java.util.Set) r3
            int r3 = d6.d.c(r0, r3)
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p5.a
            if (r0 == 0) goto L24
            p5.a r3 = (p5.a) r3
            java.lang.String r0 = r2.getType()
            java.lang.String r1 = r3.getType()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24
            java.util.Set r0 = r2.a()
            java.util.Set r3 = r3.a()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L24
            r3 = 1
            return r3
        L24:
            r3 = 0
            return r3
    }

    public final java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.f10248h
            return r0
    }

    @Override // w5.a
    public final int h() {
            r1 = this;
            r0 = 29
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.getType()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Set r1 = r2.a()
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
