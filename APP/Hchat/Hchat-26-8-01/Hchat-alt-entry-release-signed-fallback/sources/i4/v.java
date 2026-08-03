package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements w4.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6489g;

    public v(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto L8
            r0.f6489g = r1
            return
        L8:
            java.lang.String r1 = "subroutineAddress < 0"
            j8.o.t(r1)
            r1 = 0
            throw r1
    }

    @Override // z4.k
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // w4.d
    public final int b() {
            r1 = this;
            w4.c r0 = w4.c.f14876y
            int r0 = r0.f14879h
            return r0
    }

    @Override // w4.d
    public final boolean c() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof i4.v
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            i4.v r3 = (i4.v) r3
            int r3 = r3.f6489g
            int r0 = r2.f6489g
            if (r0 != r3) goto L10
            r3 = 1
            return r3
        L10:
            return r1
    }

    @Override // w4.d
    public final int f() {
            r1 = this;
            w4.c r0 = w4.c.f14876y
            int r0 = r0.f()
            return r0
    }

    @Override // w4.d
    public final w4.d g() {
            r0 = this;
            return r0
    }

    @Override // w4.d
    public final w4.c getType() {
            r1 = this;
            w4.c r0 = w4.c.f14876y
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f6489g
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<addr:"
            r0.<init>(r1)
            int r1 = r2.f6489g
            java.lang.String r1 = a.a.X0(r1)
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
