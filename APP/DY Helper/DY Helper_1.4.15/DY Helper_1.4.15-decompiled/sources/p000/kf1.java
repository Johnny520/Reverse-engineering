package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class kf1 {

    /* JADX INFO: renamed from: α */
    public final int f5889;

    /* JADX INFO: renamed from: β */
    public final int f5890;

    /* JADX INFO: renamed from: γ */
    public final int f5891;

    /* JADX INFO: renamed from: δ */
    public final int f5892;

    /* JADX INFO: renamed from: ε */
    public final int f5893;

    /* JADX INFO: renamed from: ζ */
    public final int f5894;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f5895;

    public kf1(int r1, int r2, int r3, int r4, int r5, int r6, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.f5889 = r1
            r0.f5890 = r2
            r0.f5891 = r3
            r0.f5892 = r4
            r0.f5893 = r5
            r0.f5894 = r6
            r0.f5895 = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L40
        L3:
            boolean r0 = r3 instanceof p000.kf1
            if (r0 != 0) goto L8
            goto L3e
        L8:
            kf1 r3 = (p000.kf1) r3
            int r0 = r2.f5889
            int r1 = r3.f5889
            if (r0 == r1) goto L11
            goto L3e
        L11:
            int r0 = r2.f5890
            int r1 = r3.f5890
            if (r0 == r1) goto L18
            goto L3e
        L18:
            int r0 = r2.f5891
            int r1 = r3.f5891
            if (r0 == r1) goto L1f
            goto L3e
        L1f:
            int r0 = r2.f5892
            int r1 = r3.f5892
            if (r0 == r1) goto L26
            goto L3e
        L26:
            int r0 = r2.f5893
            int r1 = r3.f5893
            if (r0 == r1) goto L2d
            goto L3e
        L2d:
            int r0 = r2.f5894
            int r1 = r3.f5894
            if (r0 == r1) goto L34
            goto L3e
        L34:
            java.lang.String r2 = r2.f5895
            java.lang.String r3 = r3.f5895
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L40
        L3e:
            r2 = 0
            return r2
        L40:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f5889
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f5890
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f5891
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f5892
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f5893
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f5894
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r3 = r3.f5895
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", fedConversations="
            java.lang.String r1 = ", priceBlockedConversations="
            java.lang.String r2 = "Summary(checkedConversations="
            int r3 = r5.f5889
            int r4 = r5.f5890
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", unavailableConversations="
            java.lang.String r2 = ", skippedConversations="
            int r3 = r5.f5891
            int r4 = r5.f5892
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", failureCount="
            java.lang.String r2 = ", message="
            int r3 = r5.f5893
            int r4 = r5.f5894
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f5895
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
