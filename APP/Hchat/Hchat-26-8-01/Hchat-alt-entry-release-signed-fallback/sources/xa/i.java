package xa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.Activity f21438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f21439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21440c;

    public i(android.app.Activity r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f21438a = r1
            r0.f21439b = r2
            r0.f21440c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof xa.i
            if (r0 != 0) goto L8
            goto L26
        L8:
            xa.i r3 = (xa.i) r3
            android.app.Activity r0 = r2.f21438a
            android.app.Activity r1 = r3.f21438a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            java.lang.String r0 = r2.f21439b
            java.lang.String r1 = r3.f21439b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            boolean r0 = r2.f21440c
            boolean r3 = r3.f21440c
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
            android.app.Activity r0 = r3.f21438a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f21439b
            int r0 = eh.a.g(r0, r1, r2)
            boolean r1 = r3.f21440c
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MenuTarget(activity="
            r0.<init>(r1)
            android.app.Activity r1 = r3.f21438a
            r0.append(r1)
            java.lang.String r1 = ", talker="
            r0.append(r1)
            java.lang.String r1 = r3.f21439b
            r0.append(r1)
            java.lang.String r1 = ", allowOpenIm="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r3.f21440c
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
