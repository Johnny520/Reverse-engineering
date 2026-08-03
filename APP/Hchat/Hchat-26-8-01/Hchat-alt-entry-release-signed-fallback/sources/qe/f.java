package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements qe.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.u f10945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pd.j f10946b;

    public f(ud.u r1, pd.j r2) {
            r0 = this;
            r0.<init>()
            r0.f10945a = r1
            r0.f10946b = r2
            return
    }

    @Override // qe.e
    public final qd.j a(f5.g r3) {
            r2 = this;
            r0 = 0
            pd.j r1 = r2.f10946b
            qd.l r0 = r1.S(r0)
            qd.j r3 = r3.b(r0)
            java.lang.Object r0 = r1.f10495o
            qd.j r0 = (qd.j) r0
            ud.u r1 = r2.f10945a
            qe.x r1 = r1.f13748g
            qe.k r1 = r1.f11002c
            qe.l r1 = r1.d(r3, r0)
            boolean r1 = r1.c()
            if (r1 == 0) goto L20
            return r3
        L20:
            return r0
    }

    @Override // qe.d
    public final int b() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // qe.d
    public final qd.j getType() {
            r3 = this;
            r0 = 0
            pd.j r1 = r3.f10946b
            qd.l r0 = r1.S(r0)
            qd.j r0 = r0.I()
            java.lang.Object r1 = r1.f10495o
            qd.j r1 = (qd.j) r1
            ud.u r2 = r3.f10945a
            qe.x r2 = r2.f13748g
            qe.k r2 = r2.f11002c
            qe.l r2 = r2.d(r0, r1)
            boolean r2 = r2.c()
            if (r2 == 0) goto L20
            return r0
        L20:
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            pd.j r0 = r5.f10946b
            java.lang.Object r1 = r0.f10495o
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 0
            qd.l r0 = r0.S(r2)
            qd.j r0 = r0.I()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = ") "
            java.lang.String r3 = "}"
            java.lang.String r4 = "CHECK_CAST_ASSIGN{("
            java.lang.String r0 = bc.e.k(r4, r1, r2, r0, r3)
            return r0
    }
}
