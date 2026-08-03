package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements qe.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.u f10956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pd.b f10957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd.r f10958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qd.j f10959d;

    public j(ud.u r1, pd.b r2, qd.r r3, qd.j r4) {
            r0 = this;
            r0.<init>()
            r0.f10956a = r1
            r0.f10957b = r2
            r0.f10958c = r3
            r0.f10959d = r4
            return
    }

    @Override // qe.e
    public final qd.j a(f5.g r4) {
            r3 = this;
            pd.b r0 = r3.f10957b
            qd.l r0 = r0.k0()
            qd.j r0 = r4.b(r0)
            qd.r r1 = r3.f10958c
            qd.j r4 = r4.b(r1)
            ud.u r1 = r3.f10956a
            fe.a r1 = r1.f13750i
            qd.j r2 = r3.f10959d
            qd.j r0 = r1.l(r0, r0, r2)
            if (r0 == 0) goto L1d
            return r0
        L1d:
            return r4
    }

    @Override // qe.d
    public final int b() {
            r1 = this;
            r0 = 2
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<qe.j> r0 = qe.j.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            qe.j r3 = (qe.j) r3
            pd.b r0 = r2.f10957b
            pd.b r3 = r3.f10957b
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // qe.d
    public final qd.j getType() {
            r4 = this;
            pd.b r0 = r4.f10957b
            qd.l r0 = r0.k0()
            qd.j r0 = r0.I()
            qd.r r1 = r4.f10958c
            qd.j r1 = r1.I()
            ud.u r2 = r4.f10956a
            fe.a r2 = r2.f13750i
            qd.j r3 = r4.f10959d
            qd.j r0 = r2.l(r0, r0, r3)
            if (r0 == 0) goto L1d
            return r0
        L1d:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            pd.b r0 = r1.f10957b
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r7 = this;
            pd.b r0 = r7.f10957b
            od.d r1 = r0.i0()
            java.lang.String r1 = r1.f9781k
            qd.j r2 = r7.f10959d
            java.lang.String r2 = java.lang.String.valueOf(r2)
            qd.j r3 = r7.getType()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            qd.l r0 = r0.k0()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = ", argType="
            java.lang.String r5 = ", currentType="
            java.lang.String r6 = "InvokeAssign{"
            java.lang.StringBuilder r1 = bc.e.p(r6, r1, r4, r2, r5)
            java.lang.String r2 = ", instanceArg="
            java.lang.String r4 = "}"
            java.lang.String r0 = j8.b.k(r1, r3, r2, r0, r4)
            return r0
    }
}
