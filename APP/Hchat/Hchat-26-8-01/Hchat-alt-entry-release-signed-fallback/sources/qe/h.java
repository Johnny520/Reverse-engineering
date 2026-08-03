package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements qe.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.u f10949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pd.j f10950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final od.c f10951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qd.j f10952d;

    public h(ud.u r1, pd.j r2, qd.j r3) {
            r0 = this;
            r0.<init>()
            r0.f10949a = r1
            r0.f10950b = r2
            java.lang.Object r1 = r2.f10495o
            od.c r1 = (od.c) r1
            r0.f10951c = r1
            r0.f10952d = r3
            return
    }

    @Override // qe.e
    public final qd.j a(f5.g r3) {
            r2 = this;
            pd.j r0 = r2.f10950b
            r1 = 0
            qd.l r0 = r0.S(r1)
            qd.j r3 = r3.b(r0)
            ud.u r0 = r2.f10949a
            fe.a r0 = r0.f13750i
            qd.j r1 = r2.f10952d
            qd.j r3 = r0.l(r3, r3, r1)
            if (r3 == 0) goto L1c
            boolean r0 = r3 instanceof qd.i
            if (r0 != 0) goto L1c
            return r3
        L1c:
            return r1
    }

    @Override // qe.d
    public final int b() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<qe.h> r0 = qe.h.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            qe.h r3 = (qe.h) r3
            pd.j r0 = r2.f10950b
            pd.j r3 = r3.f10950b
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // qe.d
    public final qd.j getType() {
            r3 = this;
            pd.j r0 = r3.f10950b
            r1 = 0
            qd.l r0 = r0.S(r1)
            qd.j r0 = r0.I()
            ud.u r1 = r3.f10949a
            fe.a r1 = r1.f13750i
            qd.j r2 = r3.f10952d
            qd.j r0 = r1.l(r0, r0, r2)
            if (r0 == 0) goto L1c
            boolean r1 = r0 instanceof qd.i
            if (r1 != 0) goto L1c
            return r0
        L1c:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            pd.j r0 = r1.f10950b
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            od.c r0 = r6.f10951c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            qd.j r1 = r6.getType()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            pd.j r2 = r6.f10950b
            r3 = 0
            qd.l r2 = r2.S(r3)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = ", type="
            java.lang.String r4 = ", instanceArg="
            java.lang.String r5 = "FieldGetAssign{"
            java.lang.StringBuilder r0 = bc.e.p(r5, r0, r3, r1, r4)
            java.lang.String r1 = "}"
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
