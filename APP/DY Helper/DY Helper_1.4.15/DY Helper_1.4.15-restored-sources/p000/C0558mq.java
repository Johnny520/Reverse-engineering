package p000;

/* JADX INFO: renamed from: mq */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0558mq {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f7244;

    /* JADX INFO: renamed from: β */
    public final long f7245;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f7246;

    /* JADX INFO: renamed from: δ */
    public final long f7247;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f7248;

    /* JADX INFO: renamed from: ζ */
    public final long f7249;

    public C0558mq(java.lang.String r1, long r2, java.lang.String r4, long r5, java.lang.String r7, long r8) {
            r0 = this;
            r0.<init>()
            r0.f7244 = r1
            r0.f7245 = r2
            r0.f7246 = r4
            r0.f7247 = r5
            r0.f7248 = r7
            r0.f7249 = r8
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L47
        L3:
            boolean r0 = r5 instanceof p000.C0558mq
            if (r0 != 0) goto L8
            goto L45
        L8:
            mq r5 = (p000.C0558mq) r5
            java.lang.String r0 = r4.f7244
            java.lang.String r1 = r5.f7244
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L45
        L15:
            long r0 = r4.f7245
            long r2 = r5.f7245
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L45
        L1e:
            java.lang.String r0 = r4.f7246
            java.lang.String r1 = r5.f7246
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L29
            goto L45
        L29:
            long r0 = r4.f7247
            long r2 = r5.f7247
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L32
            goto L45
        L32:
            java.lang.String r0 = r4.f7248
            java.lang.String r1 = r5.f7248
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
            goto L45
        L3d:
            long r0 = r4.f7249
            long r4 = r5.f7249
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L47
        L45:
            r4 = 0
            return r4
        L47:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r5 = this;
            r0 = 0
            java.lang.String r1 = r5.f7244
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            r2 = 31
            int r1 = r1 * r2
            long r3 = r5.f7245
            int r1 = p000.lz1.m3677(r1, r2, r3)
            java.lang.String r3 = r5.f7246
            if (r3 != 0) goto L19
            goto L1d
        L19:
            int r0 = r3.hashCode()
        L1d:
            int r1 = r1 + r0
            int r1 = r1 * r2
            long r3 = r5.f7247
            int r0 = p000.lz1.m3677(r1, r2, r3)
            java.lang.String r1 = r5.f7248
            int r0 = p000.a12.m15(r0, r2, r1)
            long r1 = r5.f7249
            int r5 = java.lang.Long.hashCode(r1)
            int r5 = r5 + r0
            return r5
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "Summary(awemeId="
            java.lang.String r1 = ", createTime="
            java.lang.String r2 = r5.f7244
            long r3 = r5.f7245
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r0, r2, r3, r1)
            java.lang.String r1 = ", publishLocation="
            r0.append(r1)
            java.lang.String r1 = r5.f7246
            r0.append(r1)
            java.lang.String r1 = ", generation="
            r0.append(r1)
            long r1 = r5.f7247
            r0.append(r1)
            java.lang.String r1 = ", source="
            r0.append(r1)
            java.lang.String r1 = r5.f7248
            r0.append(r1)
            java.lang.String r1 = ", selectedAtUptimeMs="
            r0.append(r1)
            long r1 = r5.f7249
            r0.append(r1)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
