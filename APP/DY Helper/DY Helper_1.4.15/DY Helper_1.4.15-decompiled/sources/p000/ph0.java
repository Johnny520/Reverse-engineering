package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ph0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f8560;

    /* JADX INFO: renamed from: β */
    public final long f8561;

    /* JADX INFO: renamed from: γ */
    public final long f8562;

    /* JADX INFO: renamed from: δ */
    public final int f8563;

    /* JADX INFO: renamed from: ε */
    public final int f8564;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f8565;

    /* JADX INFO: renamed from: η */
    public final boolean f8566;

    /* JADX INFO: renamed from: θ */
    public final boolean f8567;

    public ph0(java.lang.String r1, long r2, long r4, int r6, int r7, java.lang.String r8, boolean r9, boolean r10) {
            r0 = this;
            r0.<init>()
            r0.f8560 = r1
            r0.f8561 = r2
            r0.f8562 = r4
            r0.f8563 = r6
            r0.f8564 = r7
            r0.f8565 = r8
            r0.f8566 = r9
            r0.f8567 = r10
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L4f
        L3:
            boolean r0 = r5 instanceof p000.ph0
            if (r0 != 0) goto L8
            goto L4d
        L8:
            ph0 r5 = (p000.ph0) r5
            java.lang.String r0 = r4.f8560
            java.lang.String r1 = r5.f8560
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L4d
        L15:
            long r0 = r4.f8561
            long r2 = r5.f8561
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L4d
        L1e:
            long r0 = r4.f8562
            long r2 = r5.f8562
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L27
            goto L4d
        L27:
            int r0 = r4.f8563
            int r1 = r5.f8563
            if (r0 == r1) goto L2e
            goto L4d
        L2e:
            int r0 = r4.f8564
            int r1 = r5.f8564
            if (r0 == r1) goto L35
            goto L4d
        L35:
            java.lang.String r0 = r4.f8565
            java.lang.String r1 = r5.f8565
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            goto L4d
        L40:
            boolean r0 = r4.f8566
            boolean r1 = r5.f8566
            if (r0 == r1) goto L47
            goto L4d
        L47:
            boolean r4 = r4.f8567
            boolean r5 = r5.f8567
            if (r4 == r5) goto L4f
        L4d:
            r4 = 0
            return r4
        L4f:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f8560
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f8561
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r2 = r4.f8562
            int r0 = p000.lz1.m3677(r0, r1, r2)
            int r2 = r4.f8563
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r4.f8564
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r2 = r4.f8565
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r4.f8566
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r4 = r4.f8567
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "MessageInput(timeText="
            java.lang.String r1 = ", senderId="
            java.lang.String r2 = r5.f8560
            long r3 = r5.f8561
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r0, r2, r3, r1)
            java.lang.String r1 = ", currentUserId="
            java.lang.String r2 = ", msgType="
            long r3 = r5.f8562
            p000.AbstractC0602nx.m4118(r0, r1, r3, r2)
            java.lang.String r1 = ", subType="
            java.lang.String r2 = ", content="
            int r3 = r5.f8563
            int r4 = r5.f8564
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f8565
            r0.append(r1)
            java.lang.String r1 = ", hasAttachment="
            r0.append(r1)
            boolean r1 = r5.f8566
            r0.append(r1)
            java.lang.String r1 = ", hasReference="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r5 = r5.f8567
            java.lang.String r5 = p000.lz1.m3693(r0, r5, r1)
            return r5
    }
}
