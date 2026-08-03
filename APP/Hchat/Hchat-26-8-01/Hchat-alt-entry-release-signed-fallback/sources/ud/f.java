package ud;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.a f13704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ud.a f13705b;

    public f(ud.a r1, ud.a r2) {
            r0 = this;
            r0.<init>()
            r0.f13704a = r1
            r0.f13705b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            if (r3 == 0) goto L26
            java.lang.Class<ud.f> r0 = ud.f.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Le
            goto L26
        Le:
            ud.f r3 = (ud.f) r3
            ud.a r0 = r2.f13704a
            ud.a r1 = r3.f13704a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            ud.a r0 = r2.f13705b
            ud.a r3 = r3.f13705b
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L26
        L24:
            r3 = 1
            return r3
        L26:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            ud.a r0 = r2.f13704a
            int r0 = r0.f13671i
            ud.a r1 = r2.f13705b
            int r1 = r1.f13671i
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            ud.a r0 = r4.f13704a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            ud.a r1 = r4.f13705b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Edge: "
            java.lang.String r3 = " -> "
            java.lang.String r0 = bc.e.j(r2, r0, r3, r1)
            return r0
    }
}
