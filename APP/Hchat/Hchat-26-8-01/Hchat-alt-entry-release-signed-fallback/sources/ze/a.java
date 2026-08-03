package ze;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.a f22672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ud.a f22673b;

    public a(ud.a r1, ud.a r2) {
            r0 = this;
            r0.<init>()
            r0.f22672a = r1
            r0.f22673b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof ze.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ze.a r5 = (ze.a) r5
            ud.a r1 = r4.f22672a
            ud.a r3 = r5.f22672a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L21
            ud.a r1 = r4.f22673b
            ud.a r5 = r5.f22673b
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            ud.a r0 = r2.f22672a
            int r0 = r0.f13671i
            ud.a r1 = r2.f22673b
            int r1 = r1.f13671i
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            ud.a r0 = r5.f22672a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            ud.a r1 = r5.f22673b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = ", "
            java.lang.String r3 = ")"
            java.lang.String r4 = "("
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
    }
}
