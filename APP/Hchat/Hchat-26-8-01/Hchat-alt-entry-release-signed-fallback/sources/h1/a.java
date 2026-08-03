package h1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u2.c f5033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u2.m f5034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f1.u f5035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5036d;

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L33
        L3:
            boolean r0 = r5 instanceof h1.a
            if (r0 != 0) goto L8
            goto L31
        L8:
            h1.a r5 = (h1.a) r5
            u2.c r0 = r4.f5033a
            u2.c r1 = r5.f5033a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            u2.m r0 = r4.f5034b
            u2.m r1 = r5.f5034b
            if (r0 == r1) goto L1c
            goto L31
        L1c:
            f1.u r0 = r4.f5035c
            f1.u r1 = r5.f5035c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L27
            goto L31
        L27:
            long r0 = r4.f5036d
            long r2 = r5.f5036d
            boolean r5 = e1.e.a(r0, r2)
            if (r5 != 0) goto L33
        L31:
            r5 = 0
            return r5
        L33:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r3 = this;
            u2.c r0 = r3.f5033a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            u2.m r1 = r3.f5034b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            f1.u r0 = r3.f5035c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r3.f5036d
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DrawParams(density="
            r0.<init>(r1)
            u2.c r1 = r3.f5033a
            r0.append(r1)
            java.lang.String r1 = ", layoutDirection="
            r0.append(r1)
            u2.m r1 = r3.f5034b
            r0.append(r1)
            java.lang.String r1 = ", canvas="
            r0.append(r1)
            f1.u r1 = r3.f5035c
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r3.f5036d
            java.lang.String r1 = e1.e.d(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
