package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zf1 {

    /* JADX INFO: renamed from: α */
    public final int f13078;

    /* JADX INFO: renamed from: β */
    public final int f13079;

    /* JADX INFO: renamed from: γ */
    public final int f13080;

    /* JADX INFO: renamed from: δ */
    public final int f13081;

    /* JADX INFO: renamed from: ε */
    public final int f13082;

    /* JADX INFO: renamed from: ζ */
    public final int f13083;

    /* JADX INFO: renamed from: η */
    public final int f13084;

    /* JADX INFO: renamed from: θ */
    public final java.lang.String f13085;

    public zf1(int r1, int r2, int r3, int r4, int r5, int r6, int r7, java.lang.String r8) {
            r0 = this;
            r0.<init>()
            r0.f13078 = r1
            r0.f13079 = r2
            r0.f13080 = r3
            r0.f13081 = r4
            r0.f13082 = r5
            r0.f13083 = r6
            r0.f13084 = r7
            r0.f13085 = r8
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L47
        L3:
            boolean r0 = r3 instanceof p000.zf1
            if (r0 != 0) goto L8
            goto L45
        L8:
            zf1 r3 = (p000.zf1) r3
            int r0 = r2.f13078
            int r1 = r3.f13078
            if (r0 == r1) goto L11
            goto L45
        L11:
            int r0 = r2.f13079
            int r1 = r3.f13079
            if (r0 == r1) goto L18
            goto L45
        L18:
            int r0 = r2.f13080
            int r1 = r3.f13080
            if (r0 == r1) goto L1f
            goto L45
        L1f:
            int r0 = r2.f13081
            int r1 = r3.f13081
            if (r0 == r1) goto L26
            goto L45
        L26:
            int r0 = r2.f13082
            int r1 = r3.f13082
            if (r0 == r1) goto L2d
            goto L45
        L2d:
            int r0 = r2.f13083
            int r1 = r3.f13083
            if (r0 == r1) goto L34
            goto L45
        L34:
            int r0 = r2.f13084
            int r1 = r3.f13084
            if (r0 == r1) goto L3b
            goto L45
        L3b:
            java.lang.String r2 = r2.f13085
            java.lang.String r3 = r3.f13085
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L47
        L45:
            r2 = 0
            return r2
        L47:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f13078
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f13079
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f13080
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f13081
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f13082
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f13083
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f13084
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r3 = r3.f13085
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", taskCount="
            java.lang.String r1 = ", matchedTaskCount="
            java.lang.String r2 = "DebugSummary(checkedConversations="
            int r3 = r5.f13078
            int r4 = r5.f13079
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", quantityTaskCount="
            java.lang.String r2 = ", claimableTaskCount="
            int r3 = r5.f13080
            int r4 = r5.f13081
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", claimSuccessCount="
            java.lang.String r2 = ", failureCount="
            int r3 = r5.f13082
            int r4 = r5.f13083
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            int r1 = r5.f13084
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r5 = r5.f13085
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
