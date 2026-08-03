package d9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.Activity f2092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f2093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg.l f2095d;

    public e(android.app.Activity r1, fg.l r2, java.lang.String r3, boolean r4) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>()
            r0.f2092a = r1
            r0.f2093b = r3
            r0.f2094c = r4
            r0.f2095d = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof d9.e
            if (r0 != 0) goto L8
            goto L31
        L8:
            d9.e r3 = (d9.e) r3
            android.app.Activity r0 = r2.f2092a
            android.app.Activity r1 = r3.f2092a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.lang.String r0 = r2.f2093b
            java.lang.String r1 = r3.f2093b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            boolean r0 = r2.f2094c
            boolean r1 = r3.f2094c
            if (r0 == r1) goto L27
            goto L31
        L27:
            fg.l r0 = r2.f2095d
            fg.l r3 = r3.f2095d
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
            android.app.Activity r0 = r3.f2092a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f2093b
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f2094c
            int r0 = eh.a.h(r0, r1, r2)
            fg.l r1 = r3.f2095d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pending(activity="
            r0.<init>(r1)
            android.app.Activity r1 = r2.f2092a
            r0.append(r1)
            java.lang.String r1 = ", wxid="
            r0.append(r1)
            java.lang.String r1 = r2.f2093b
            r0.append(r1)
            java.lang.String r1 = ", trackConfiguredFriend="
            r0.append(r1)
            boolean r1 = r2.f2094c
            r0.append(r1)
            java.lang.String r1 = ", callback="
            r0.append(r1)
            fg.l r1 = r2.f2095d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
