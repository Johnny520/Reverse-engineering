package c0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class b extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0.q f939a;

    public b(b0.q r1) {
            r0 = this;
            r0.<init>()
            r0.f939a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L12
        L3:
            boolean r0 = r2 instanceof c0.b
            if (r0 != 0) goto L8
            goto L10
        L8:
            c0.b r2 = (c0.b) r2
            b0.q r2 = r2.f939a
            b0.q r0 = r1.f939a
            if (r0 == r2) goto L12
        L10:
            r2 = 0
            return r2
        L12:
            r2 = 1
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r4 = this;
            c0.c r0 = new c0.c
            r0.<init>()
            b0.q r1 = r4.f939a
            r0.f940w = r1
            c0.a r1 = new c0.a
            b0.d0 r2 = new b0.d0
            r3 = 1
            r2.<init>(r0, r3)
            r1.<init>()
            r1.f938u = r2
            r0.k1(r1)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            c0.c r2 = (c0.c) r2
            b0.q r0 = r1.f939a
            r2.f940w = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            b0.q r0 = r1.f939a
            int r0 = r0.hashCode()
            return r0
    }
}
