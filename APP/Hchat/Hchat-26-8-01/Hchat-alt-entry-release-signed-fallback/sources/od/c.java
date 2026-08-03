package od;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ud.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final od.a f9773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f9774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qd.j f9775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.String f9776j;

    public c(od.a r1, java.lang.String r2, qd.j r3) {
            r0 = this;
            r0.<init>()
            r0.f9773g = r1
            r0.f9774h = r2
            r0.f9775i = r3
            r0.f9776j = r2
            return
    }

    public static od.c a(ud.u r3, jf.d r4) {
            java.lang.String r0 = r4.f6871b
            od.a r0 = od.a.d(r3, r0)
            od.c r1 = new od.c
            java.lang.String r2 = r4.f6873d
            java.lang.String r4 = r4.f6872c
            qd.j r4 = qd.j.z(r4)
            r1.<init>(r0, r2, r4)
            be.k r3 = r3.f13746e
            od.c r3 = r3.h(r1)
            return r3
    }

    public final boolean b() {
            r2 = this;
            java.lang.String r0 = r2.f9774h
            java.lang.String r1 = r2.f9776j
            boolean r0 = java.util.Objects.equals(r0, r1)
            r0 = r0 ^ 1
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L31
            java.lang.Class<od.c> r2 = od.c.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L31
        L10:
            od.c r5 = (od.c) r5
            java.lang.String r2 = r4.f9774h
            java.lang.String r3 = r5.f9774h
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            qd.j r2 = r4.f9775i
            qd.j r3 = r5.f9775i
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            od.a r2 = r4.f9773g
            od.a r5 = r5.f9773g
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L31
            return r0
        L31:
            return r1
    }

    @Override // ud.l
    public final od.c f() {
            r0 = this;
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f9774h
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            qd.j r1 = r2.f9775i
            int r1 = r1.f10893a
            int r0 = r0 + r1
            int r0 = r0 * 31
            od.a r1 = r2.f9773g
            qd.j r1 = r1.f9765g
            int r1 = r1.f10893a
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            od.a r0 = r5.f9773g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            qd.j r1 = r5.f9775i
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "."
            java.lang.String r3 = " "
            java.lang.String r4 = r5.f9774h
            java.lang.String r0 = bc.e.v(r0, r2, r4, r3, r1)
            return r0
    }
}
