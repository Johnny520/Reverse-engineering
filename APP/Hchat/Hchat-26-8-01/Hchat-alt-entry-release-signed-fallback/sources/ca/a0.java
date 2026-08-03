package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f1460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f1461c;

    public a0(java.lang.String r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            r0.<init>()
            r0.f1459a = r1
            r0.f1460b = r2
            r0.f1461c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof ca.a0
            if (r0 != 0) goto L8
            goto L2a
        L8:
            ca.a0 r3 = (ca.a0) r3
            java.lang.String r0 = r2.f1459a
            java.lang.String r1 = r3.f1459a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.String r0 = r2.f1460b
            java.lang.String r1 = r3.f1460b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.util.List r0 = r2.f1461c
            java.util.List r3 = r3.f1461c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f1459a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f1460b
            int r0 = eh.a.g(r0, r1, r2)
            java.util.List r1 = r3.f1461c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", summary="
            java.lang.String r1 = ", targetIds="
            java.lang.String r2 = "LabelTargets(title="
            java.lang.String r3 = r5.f1459a
            java.lang.String r4 = r5.f1460b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.util.List r1 = r5.f1461c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
