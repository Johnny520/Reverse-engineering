package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.Activity f1393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f1394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f1395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f1396d;

    public u1(android.app.Activity r1, java.lang.String r2, java.lang.String r3, java.lang.Object r4) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.f1393a = r1
            r0.f1394b = r2
            r0.f1395c = r3
            r0.f1396d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof c9.u1
            if (r0 != 0) goto L8
            goto L35
        L8:
            c9.u1 r3 = (c9.u1) r3
            android.app.Activity r0 = r2.f1393a
            android.app.Activity r1 = r3.f1393a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.String r0 = r2.f1394b
            java.lang.String r1 = r3.f1394b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.String r0 = r2.f1395c
            java.lang.String r1 = r3.f1395c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.lang.Object r0 = r2.f1396d
            java.lang.Object r3 = r3.f1396d
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L37
        L35:
            r3 = 0
            return r3
        L37:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            android.app.Activity r0 = r3.f1393a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f1394b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f1395c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.Object r1 = r3.f1396d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NativeGroupLongClickTarget(activity="
            r0.<init>(r1)
            android.app.Activity r1 = r2.f1393a
            r0.append(r1)
            java.lang.String r1 = ", talker="
            r0.append(r1)
            java.lang.String r1 = r2.f1394b
            r0.append(r1)
            java.lang.String r1 = ", groupId="
            r0.append(r1)
            java.lang.String r1 = r2.f1395c
            r0.append(r1)
            java.lang.String r1 = ", fragment="
            r0.append(r1)
            java.lang.Object r1 = r2.f1396d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
