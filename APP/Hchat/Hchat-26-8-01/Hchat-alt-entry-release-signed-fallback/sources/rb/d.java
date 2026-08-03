package rb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f11881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f11882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rb.e f11883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f11884d;

    public d(java.lang.String r1, java.lang.String r2, rb.e r3, java.lang.String r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f11881a = r1
            r0.f11882b = r2
            r0.f11883c = r3
            r0.f11884d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof rb.d
            if (r0 != 0) goto L8
            goto L31
        L8:
            rb.d r3 = (rb.d) r3
            java.lang.String r0 = r2.f11881a
            java.lang.String r1 = r3.f11881a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.lang.String r0 = r2.f11882b
            java.lang.String r1 = r3.f11882b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            rb.e r0 = r2.f11883c
            rb.e r1 = r3.f11883c
            if (r0 == r1) goto L27
            goto L31
        L27:
            java.lang.String r0 = r2.f11884d
            java.lang.String r3 = r3.f11884d
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L33
        L31:
            r3 = 0
            return r3
        L33:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f11881a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f11882b
            int r0 = eh.a.g(r0, r1, r2)
            rb.e r2 = r3.f11883c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.f11884d
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", type="
            java.lang.String r2 = "ZombieCheckResult(wxid="
            java.lang.String r3 = r5.f11881a
            java.lang.String r4 = r5.f11882b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            rb.e r1 = r5.f11883c
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = r5.f11884d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
