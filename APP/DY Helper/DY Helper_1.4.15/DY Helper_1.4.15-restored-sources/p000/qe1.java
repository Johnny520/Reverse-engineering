package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qe1 {

    /* JADX INFO: renamed from: α */
    public final int f8984;

    /* JADX INFO: renamed from: β */
    public final int f8985;

    /* JADX INFO: renamed from: γ */
    public final int f8986;

    /* JADX INFO: renamed from: δ */
    public final int f8987;

    /* JADX INFO: renamed from: ε */
    public final int f8988;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f8989;

    public qe1(int r1, int r2, int r3, int r4, int r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.f8984 = r1
            r0.f8985 = r2
            r0.f8986 = r3
            r0.f8987 = r4
            r0.f8988 = r5
            r0.f8989 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L39
        L3:
            boolean r0 = r3 instanceof p000.qe1
            if (r0 != 0) goto L8
            goto L37
        L8:
            qe1 r3 = (p000.qe1) r3
            int r0 = r2.f8984
            int r1 = r3.f8984
            if (r0 == r1) goto L11
            goto L37
        L11:
            int r0 = r2.f8985
            int r1 = r3.f8985
            if (r0 == r1) goto L18
            goto L37
        L18:
            int r0 = r2.f8986
            int r1 = r3.f8986
            if (r0 == r1) goto L1f
            goto L37
        L1f:
            int r0 = r2.f8987
            int r1 = r3.f8987
            if (r0 == r1) goto L26
            goto L37
        L26:
            int r0 = r2.f8988
            int r1 = r3.f8988
            if (r0 == r1) goto L2d
            goto L37
        L2d:
            java.lang.String r2 = r2.f8989
            java.lang.String r3 = r3.f8989
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L39
        L37:
            r2 = 0
            return r2
        L39:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f8984
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f8985
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f8986
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f8987
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f8988
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r3 = r3.f8989
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", claimedBehaviors="
            java.lang.String r1 = ", idempotentBehaviors="
            java.lang.String r2 = "Summary(checkedConversations="
            int r3 = r5.f8984
            int r4 = r5.f8985
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", skippedConversations="
            java.lang.String r2 = ", failureCount="
            int r3 = r5.f8986
            int r4 = r5.f8987
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            int r1 = r5.f8988
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r5 = r5.f8989
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
