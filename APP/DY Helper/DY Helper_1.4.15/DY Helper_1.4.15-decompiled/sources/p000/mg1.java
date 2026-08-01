package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class mg1 {

    /* JADX INFO: renamed from: α */
    public final int f7122;

    /* JADX INFO: renamed from: β */
    public final int f7123;

    /* JADX INFO: renamed from: γ */
    public final int f7124;

    /* JADX INFO: renamed from: δ */
    public final int f7125;

    /* JADX INFO: renamed from: ε */
    public final int f7126;

    /* JADX INFO: renamed from: ζ */
    public final int f7127;

    /* JADX INFO: renamed from: η */
    public final int f7128;

    /* JADX INFO: renamed from: θ */
    public final java.lang.String f7129;

    public mg1(int r1, int r2, int r3, int r4, int r5, int r6, int r7, java.lang.String r8) {
            r0 = this;
            r0.<init>()
            r0.f7122 = r1
            r0.f7123 = r2
            r0.f7124 = r3
            r0.f7125 = r4
            r0.f7126 = r5
            r0.f7127 = r6
            r0.f7128 = r7
            r0.f7129 = r8
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L47
        L3:
            boolean r0 = r3 instanceof p000.mg1
            if (r0 != 0) goto L8
            goto L45
        L8:
            mg1 r3 = (p000.mg1) r3
            int r0 = r2.f7122
            int r1 = r3.f7122
            if (r0 == r1) goto L11
            goto L45
        L11:
            int r0 = r2.f7123
            int r1 = r3.f7123
            if (r0 == r1) goto L18
            goto L45
        L18:
            int r0 = r2.f7124
            int r1 = r3.f7124
            if (r0 == r1) goto L1f
            goto L45
        L1f:
            int r0 = r2.f7125
            int r1 = r3.f7125
            if (r0 == r1) goto L26
            goto L45
        L26:
            int r0 = r2.f7126
            int r1 = r3.f7126
            if (r0 == r1) goto L2d
            goto L45
        L2d:
            int r0 = r2.f7127
            int r1 = r3.f7127
            if (r0 == r1) goto L34
            goto L45
        L34:
            int r0 = r2.f7128
            int r1 = r3.f7128
            if (r0 == r1) goto L3b
            goto L45
        L3b:
            java.lang.String r2 = r2.f7129
            java.lang.String r3 = r3.f7129
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
            int r0 = r3.f7122
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f7123
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f7124
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f7125
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f7126
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f7127
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f7128
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r3 = r3.f7129
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", textMessagesSubmitted="
            java.lang.String r1 = ", imagesSubmitted="
            java.lang.String r2 = "Summary(checkedConversations="
            int r3 = r5.f7122
            int r4 = r5.f7123
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", rewardsClaimed="
            java.lang.String r2 = ", skippedConversations="
            int r3 = r5.f7124
            int r4 = r5.f7125
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", failureCount="
            java.lang.String r2 = ", retryableFailureCount="
            int r3 = r5.f7126
            int r4 = r5.f7127
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            int r1 = r5.f7128
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r5 = r5.f7129
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
