package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements qe.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.u f10953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pd.n f10954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd.j f10955c;

    public i(ud.u r1, pd.n r2, qd.j r3) {
            r0 = this;
            r0.<init>()
            r0.f10953a = r1
            r0.f10954b = r2
            r0.f10955c = r3
            return
    }

    @Override // qe.e
    public final qd.j a(f5.g r3) {
            r2 = this;
            pd.n r0 = r2.f10954b
            r1 = 0
            qd.l r0 = r0.S(r1)
            qd.j r3 = r3.b(r0)
            qd.j r3 = r2.c(r3)
            return r3
    }

    @Override // qe.d
    public final int b() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final qd.j c(qd.j r5) {
            r4 = this;
            ud.u r0 = r4.f10953a
            fe.a r1 = r0.f13749h
            pd.n r2 = r4.f10954b
            ud.m r1 = r1.g(r2)
            if (r1 == 0) goto L15
            od.d r1 = r1.q()
            od.a r1 = r1.f9780j
            qd.j r1 = r1.f9765g
            goto L16
        L15:
            r1 = r5
        L16:
            fe.a r0 = r0.f13750i
            qd.j r3 = r4.f10955c
            qd.j r5 = r0.l(r5, r1, r3)
            if (r5 != 0) goto L22
            r5 = 0
            goto L2b
        L22:
            boolean r0 = r5 instanceof qd.i
            if (r0 != 0) goto L27
            goto L2b
        L27:
            qd.j r5 = r5.r()
        L2b:
            if (r5 == 0) goto L2e
            return r5
        L2e:
            od.d r5 = r2.f10526p
            qd.j r5 = r5.f9778h
            return r5
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<qe.i> r0 = qe.i.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            qe.i r3 = (qe.i) r3
            pd.n r0 = r2.f10954b
            pd.n r3 = r3.f10954b
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // qe.d
    public final qd.j getType() {
            r2 = this;
            pd.n r0 = r2.f10954b
            r1 = 0
            qd.l r0 = r0.S(r1)
            qd.j r0 = r0.I()
            qd.j r0 = r2.c(r0)
            return r0
    }

    public final int hashCode() {
            r1 = this;
            pd.n r0 = r1.f10954b
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r7 = this;
            pd.n r0 = r7.f10954b
            od.d r1 = r0.f10526p
            java.lang.String r1 = r1.f9781k
            qd.j r2 = r7.f10955c
            java.lang.String r2 = java.lang.String.valueOf(r2)
            qd.j r3 = r7.getType()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = 0
            qd.l r0 = r0.S(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = ", returnType="
            java.lang.String r5 = ", currentType="
            java.lang.String r6 = "InvokeAssign{"
            java.lang.StringBuilder r1 = bc.e.p(r6, r1, r4, r2, r5)
            java.lang.String r2 = ", instanceArg="
            java.lang.String r4 = "}"
            java.lang.String r0 = j8.b.k(r1, r3, r2, r0, r4)
            return r0
    }
}
