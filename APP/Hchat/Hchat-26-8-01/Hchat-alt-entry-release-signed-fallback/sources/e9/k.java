package e9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f2432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f2433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f2434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f2435d;

    public k(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f2432a = r1
            r0.f2433b = r2
            r0.f2434c = r3
            r0.f2435d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof e9.k
            if (r0 != 0) goto L8
            goto L35
        L8:
            e9.k r3 = (e9.k) r3
            java.lang.String r0 = r2.f2432a
            java.lang.String r1 = r3.f2432a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.String r0 = r2.f2433b
            java.lang.String r1 = r3.f2433b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.String r0 = r2.f2434c
            java.lang.String r1 = r3.f2434c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.lang.String r0 = r2.f2435d
            java.lang.String r3 = r3.f2435d
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
            java.lang.String r0 = r3.f2432a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f2433b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f2434c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f2435d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", text="
            java.lang.String r1 = ", summary="
            java.lang.String r2 = "NativeNotifyPayload(title="
            java.lang.String r3 = r5.f2432a
            java.lang.String r4 = r5.f2433b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", talker="
            java.lang.String r2 = ")"
            java.lang.String r3 = r5.f2434c
            java.lang.String r4 = r5.f2435d
            java.lang.String r0 = j8.b.k(r0, r3, r1, r4, r2)
            return r0
    }
}
