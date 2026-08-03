package x9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f21395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21396c;

    public b(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f21394a = r1
            r0.f21395b = r2
            r0.f21396c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof x9.b
            if (r0 != 0) goto L8
            goto L26
        L8:
            x9.b r3 = (x9.b) r3
            java.lang.String r0 = r2.f21394a
            java.lang.String r1 = r3.f21394a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            java.lang.String r0 = r2.f21395b
            java.lang.String r1 = r3.f21395b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            boolean r0 = r2.f21396c
            boolean r3 = r3.f21396c
            if (r0 == r3) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f21394a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f21395b
            int r0 = eh.a.g(r0, r1, r2)
            boolean r1 = r3.f21396c
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", content="
            java.lang.String r1 = ", group="
            java.lang.String r2 = "KeywordMatch(keyword="
            java.lang.String r3 = r5.f21394a
            java.lang.String r4 = r5.f21395b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ")"
            boolean r2 = r5.f21396c
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
