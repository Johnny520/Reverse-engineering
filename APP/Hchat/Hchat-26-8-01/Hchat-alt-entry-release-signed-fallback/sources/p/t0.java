package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class t0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.l f10010a;

    public t0(fg.l r1) {
            r0 = this;
            r0.<init>()
            r0.f10010a = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof p.t0
            if (r1 == 0) goto Lb
            p.t0 r3 = (p.t0) r3
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r3 != 0) goto Lf
            goto L16
        Lf:
            fg.l r1 = r2.f10010a
            fg.l r3 = r3.f10010a
            if (r1 != r3) goto L16
            return r0
        L16:
            r3 = 0
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            p.u0 r0 = new p.u0
            r0.<init>()
            fg.l r1 = r2.f10010a
            r0.f10015u = r1
            r1 = 1
            r0.f10016v = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r5) {
            r4 = this;
            p.u0 r5 = (p.u0) r5
            fg.l r0 = r5.f10015u
            fg.l r1 = r4.f10010a
            r2 = 1
            if (r0 != r1) goto Ld
            boolean r0 = r5.f10016v
            if (r0 == r2) goto L15
        Ld:
            x1.f0 r0 = x1.k.w(r5)
            r3 = 0
            r0.U(r3)
        L15:
            r5.f10015u = r1
            r5.f10016v = r2
            return
    }

    public final int hashCode() {
            r2 = this;
            fg.l r0 = r2.f10010a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 1
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OffsetPxModifier(offset="
            r0.<init>(r1)
            fg.l r1 = r2.f10010a
            r0.append(r1)
            java.lang.String r1 = ", rtlAware=true)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
