package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class bb1 {

    /* JADX INFO: renamed from: α */
    public final int f1620;

    /* JADX INFO: renamed from: β */
    public final int f1621;

    /* JADX INFO: renamed from: γ */
    public final long f1622;

    public bb1(int r1, int r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.f1620 = r1
            r0.f1621 = r2
            r0.f1622 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L34
        L3:
            boolean r0 = r3 instanceof p000.bb1
            if (r0 != 0) goto L8
            goto L32
        L8:
            bb1 r3 = (p000.bb1) r3
            jz r0 = p000.C0450jz.f5672
            boolean r0 = r0.equals(r0)
            if (r0 != 0) goto L13
            goto L32
        L13:
            int r0 = r2.f1620
            int r1 = r3.f1620
            if (r0 == r1) goto L1a
            goto L32
        L1a:
            int r0 = r2.f1621
            int r1 = r3.f1621
            if (r0 == r1) goto L21
            goto L32
        L21:
            long r0 = r2.f1622
            long r2 = r3.f1622
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L2a
            goto L32
        L2a:
            nz r2 = p000.C0604nz.f7825
            boolean r2 = r2.equals(r2)
            if (r2 != 0) goto L34
        L32:
            r2 = 0
            return r2
        L34:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r0 = r0 + 1
            int r0 = r0 * r1
            int r2 = r4.f1620
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r4.f1621
            int r0 = p000.a12.m14(r2, r0, r1)
            long r2 = r4.f1622
            int r4 = p000.lz1.m3677(r0, r1, r2)
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PetElfCampAutomationConfig(enabled=false, seedWhitelist="
            r0.<init>(r1)
            jz r1 = p000.C0450jz.f5672
            r0.append(r1)
            java.lang.String r1 = ", dailyHarvestLimit="
            r0.append(r1)
            int r1 = r3.f1620
            r0.append(r1)
            java.lang.String r1 = ", dailyPlantLimit="
            r0.append(r1)
            int r1 = r3.f1621
            r0.append(r1)
            java.lang.String r1 = ", operationIntervalMillis="
            r0.append(r1)
            long r1 = r3.f1622
            r0.append(r1)
            java.lang.String r3 = ", conversationShortIdWhitelist="
            r0.append(r3)
            nz r3 = p000.C0604nz.f7825
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final int m844() {
            r0 = this;
            int r0 = r0.f1620
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final int m845() {
            r0 = this;
            int r0 = r0.f1621
            return r0
    }
}
