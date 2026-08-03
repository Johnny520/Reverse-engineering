package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hb.c f5428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hb.r f5429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hb.k f5430c;

    public k0(hb.c r1, hb.r r2, hb.k r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f5428a = r1
            r0.f5429b = r2
            r0.f5430c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof hb.k0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            hb.k0 r5 = (hb.k0) r5
            hb.c r1 = r4.f5428a
            hb.c r3 = r5.f5428a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            hb.r r1 = r4.f5429b
            hb.r r3 = r5.f5429b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            hb.k r1 = r4.f5430c
            hb.k r5 = r5.f5430c
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            hb.c r0 = r2.f5428a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            hb.r r1 = r2.f5429b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            hb.k r0 = r2.f5430c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "State(moduleSender="
            r0.<init>(r1)
            hb.c r1 = r2.f5428a
            r0.append(r1)
            java.lang.String r1 = ", selectedModuleSender="
            r0.append(r1)
            hb.r r1 = r2.f5429b
            r0.append(r1)
            java.lang.String r1 = ", officialSender="
            r0.append(r1)
            hb.k r1 = r2.f5430c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
