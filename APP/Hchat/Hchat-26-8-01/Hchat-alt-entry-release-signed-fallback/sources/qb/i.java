package qb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f10829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10831c;

    public i(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f10829a = r1
            r0.f10830b = r2
            r0.f10831c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof qb.i
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qb.i r5 = (qb.i) r5
            java.lang.String r1 = r4.f10829a
            java.lang.String r3 = r5.f10829a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.f10830b
            int r3 = r5.f10830b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            boolean r1 = r4.f10831c
            boolean r5 = r5.f10831c
            if (r1 == r5) goto L25
            return r2
        L25:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f10829a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f10830b
            int r0 = eh.a.e(r2, r0, r1)
            boolean r1 = r3.f10831c
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", durationMillis="
            java.lang.String r1 = ", deleteAfterUse="
            int r2 = r5.f10830b
            java.lang.String r3 = "VoiceSource(path="
            java.lang.String r4 = r5.f10829a
            java.lang.StringBuilder r0 = eh.a.u(r2, r3, r4, r0, r1)
            java.lang.String r1 = ")"
            boolean r2 = r5.f10831c
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
