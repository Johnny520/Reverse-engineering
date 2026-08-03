package c1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.r0 f1006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.d f1007b;

    public q(f1.r0 r1, l1.d r2) {
            r0 = this;
            r0.<init>()
            r0.f1006a = r1
            r0.f1007b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof c1.q
            if (r0 != 0) goto L8
            goto L1f
        L8:
            c1.q r3 = (c1.q) r3
            f1.r0 r0 = r2.f1006a
            f1.r0 r1 = r3.f1006a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            l1.d r0 = r2.f1007b
            l1.d r3 = r3.f1007b
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L21
        L1f:
            r3 = 0
            return r3
        L21:
            r3 = 1
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            c1.r r0 = new c1.r
            r0.<init>()
            f1.r0 r1 = r2.f1006a
            r0.f1008u = r1
            l1.d r1 = r2.f1007b
            r0.f1009v = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r4) {
            r3 = this;
            c1.r r4 = (c1.r) r4
            f1.r0 r0 = r4.f1008u
            f1.r0 r1 = r3.f1006a
            boolean r0 = gg.l.a(r0, r1)
            l1.d r2 = r3.f1007b
            if (r0 == 0) goto L16
            l1.d r0 = r4.f1009v
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L19
        L16:
            r0 = 0
            r4.f1010w = r0
        L19:
            r4.f1008u = r1
            r4.f1009v = r2
            return
    }

    public final int hashCode() {
            r2 = this;
            f1.r0 r0 = r2.f1006a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            l1.d r1 = r2.f1007b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SimpleDropShadowElement(shape="
            r0.<init>(r1)
            f1.r0 r1 = r2.f1006a
            r0.append(r1)
            java.lang.String r1 = ", shadow="
            r0.append(r1)
            l1.d r1 = r2.f1007b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
