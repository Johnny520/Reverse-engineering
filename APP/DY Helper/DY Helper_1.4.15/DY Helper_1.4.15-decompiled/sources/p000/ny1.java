package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ny1 {

    /* JADX INFO: renamed from: α */
    public final int f7818;

    /* JADX INFO: renamed from: β */
    public final int f7819;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f7820;

    /* JADX INFO: renamed from: δ */
    public final boolean f7821;

    /* JADX INFO: renamed from: ε */
    public final boolean f7822;

    /* JADX INFO: renamed from: ζ */
    public final long f7823;

    /* JADX INFO: renamed from: η */
    public final p000.ky1 f7824;

    public ny1(int r1, int r2, java.lang.String r3, boolean r4, boolean r5, long r6, p000.ky1 r8) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.f7818 = r1
            r0.f7819 = r2
            r0.f7820 = r3
            r0.f7821 = r4
            r0.f7822 = r5
            r0.f7823 = r6
            r0.f7824 = r8
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L46
        L3:
            boolean r0 = r5 instanceof p000.ny1
            if (r0 != 0) goto L8
            goto L44
        L8:
            ny1 r5 = (p000.ny1) r5
            int r0 = r4.f7818
            int r1 = r5.f7818
            if (r0 == r1) goto L11
            goto L44
        L11:
            int r0 = r4.f7819
            int r1 = r5.f7819
            if (r0 == r1) goto L18
            goto L44
        L18:
            java.lang.String r0 = r4.f7820
            java.lang.String r1 = r5.f7820
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L23
            goto L44
        L23:
            boolean r0 = r4.f7821
            boolean r1 = r5.f7821
            if (r0 == r1) goto L2a
            goto L44
        L2a:
            boolean r0 = r4.f7822
            boolean r1 = r5.f7822
            if (r0 == r1) goto L31
            goto L44
        L31:
            long r0 = r4.f7823
            long r2 = r5.f7823
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3a
            goto L44
        L3a:
            ky1 r4 = r4.f7824
            ky1 r5 = r5.f7824
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L46
        L44:
            r4 = 0
            return r4
        L46:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f7818
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f7819
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r2 = r4.f7820
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r4.f7821
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r4.f7822
            int r0 = p000.lz1.m3678(r0, r1, r2)
            long r2 = r4.f7823
            int r0 = p000.lz1.m3677(r0, r1, r2)
            ky1 r4 = r4.f7824
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", rawLength="
            java.lang.String r1 = ", today="
            java.lang.String r2 = "SparkProcessCacheEntry(rawHash="
            int r3 = r5.f7818
            int r4 = r5.f7819
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f7820
            r0.append(r1)
            java.lang.String r1 = ", selfSentToday="
            r0.append(r1)
            boolean r1 = r5.f7821
            r0.append(r1)
            java.lang.String r1 = ", renewedByTool="
            r0.append(r1)
            boolean r1 = r5.f7822
            r0.append(r1)
            java.lang.String r1 = ", processTimeMs="
            r0.append(r1)
            long r1 = r5.f7823
            r0.append(r1)
            java.lang.String r1 = ", info="
            r0.append(r1)
            ky1 r5 = r5.f7824
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
