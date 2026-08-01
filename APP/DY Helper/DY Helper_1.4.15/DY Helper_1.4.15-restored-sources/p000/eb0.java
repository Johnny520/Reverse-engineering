package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class eb0 {

    /* JADX INFO: renamed from: α */
    public final java.util.Set f3467;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object f3468;

    /* JADX INFO: renamed from: γ */
    public final boolean f3469;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f3470;

    public eb0(java.util.Set r1, java.util.Set r2, boolean r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f3467 = r1
            r0.f3468 = r2
            r0.f3469 = r3
            r0.f3470 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof p000.eb0
            if (r0 != 0) goto L8
            goto L31
        L8:
            eb0 r3 = (p000.eb0) r3
            java.util.Set r0 = r2.f3467
            java.util.Set r1 = r3.f3467
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.lang.Object r0 = r2.f3468
            java.lang.Object r1 = r3.f3468
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            boolean r0 = r2.f3469
            boolean r1 = r3.f3469
            if (r0 == r1) goto L27
            goto L31
        L27:
            java.lang.String r2 = r2.f3470
            java.lang.String r3 = r3.f3470
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.util.Set r0 = r3.f3467
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.Object r2 = r3.f3468
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f3469
            int r0 = p000.lz1.m3678(r2, r1, r0)
            java.lang.String r3 = r3.f3470
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GroupApplyApprovalResult(requestedIds="
            r0.<init>(r1)
            java.util.Set r1 = r2.f3467
            r0.append(r1)
            java.lang.String r1 = ", acknowledgedIds="
            r0.append(r1)
            java.lang.Object r1 = r2.f3468
            r0.append(r1)
            java.lang.String r1 = ", complete="
            r0.append(r1)
            boolean r1 = r2.f3469
            r0.append(r1)
            java.lang.String r1 = ", warningMessage="
            r0.append(r1)
            java.lang.String r2 = r2.f3470
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
