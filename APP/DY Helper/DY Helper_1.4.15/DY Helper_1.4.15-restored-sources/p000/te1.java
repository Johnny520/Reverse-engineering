package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class te1 {

    /* JADX INFO: renamed from: α */
    public final int f10346;

    /* JADX INFO: renamed from: β */
    public final int f10347;

    /* JADX INFO: renamed from: γ */
    public final int f10348;

    /* JADX INFO: renamed from: δ */
    public final int f10349;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f10350;

    public te1(int r1, int r2, int r3, int r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.f10346 = r1
            r0.f10347 = r2
            r0.f10348 = r3
            r0.f10349 = r4
            r0.f10350 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L32
        L3:
            boolean r0 = r3 instanceof p000.te1
            if (r0 != 0) goto L8
            goto L30
        L8:
            te1 r3 = (p000.te1) r3
            int r0 = r2.f10346
            int r1 = r3.f10346
            if (r0 == r1) goto L11
            goto L30
        L11:
            int r0 = r2.f10347
            int r1 = r3.f10347
            if (r0 == r1) goto L18
            goto L30
        L18:
            int r0 = r2.f10348
            int r1 = r3.f10348
            if (r0 == r1) goto L1f
            goto L30
        L1f:
            int r0 = r2.f10349
            int r1 = r3.f10349
            if (r0 == r1) goto L26
            goto L30
        L26:
            java.lang.String r2 = r2.f10350
            java.lang.String r3 = r3.f10350
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L32
        L30:
            r2 = 0
            return r2
        L32:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f10346
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f10347
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f10348
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f10349
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r3 = r3.f10350
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", successfulConversations="
            java.lang.String r1 = ", skippedConversations="
            java.lang.String r2 = "DebugSummary(checkedConversations="
            int r3 = r5.f10346
            int r4 = r5.f10347
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", failureCount="
            java.lang.String r2 = ", message="
            int r3 = r5.f10348
            int r4 = r5.f10349
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f10350
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
