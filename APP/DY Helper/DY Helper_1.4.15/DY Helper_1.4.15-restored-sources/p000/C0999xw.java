package p000;

/* JADX INFO: renamed from: xw */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0999xw {

    /* JADX INFO: renamed from: α */
    public final boolean f12330;

    /* JADX INFO: renamed from: β */
    public final int f12331;

    /* JADX INFO: renamed from: γ */
    public final boolean f12332;

    /* JADX INFO: renamed from: δ */
    public final boolean f12333;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f12334;

    /* JADX INFO: renamed from: ζ */
    public final boolean f12335;

    /* JADX INFO: renamed from: η */
    public final int f12336;

    /* JADX INFO: renamed from: θ */
    public final boolean f12337;

    /* JADX INFO: renamed from: ι */
    public final boolean f12338;

    public C0999xw(boolean r1, int r2, boolean r3, boolean r4, java.lang.String r5, boolean r6, int r7, boolean r8, boolean r9) {
            r0 = this;
            r0.<init>()
            r0.f12330 = r1
            r0.f12331 = r2
            r0.f12332 = r3
            r0.f12333 = r4
            r0.f12334 = r5
            r0.f12335 = r6
            r0.f12336 = r7
            r0.f12337 = r8
            r0.f12338 = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4e
        L3:
            boolean r0 = r3 instanceof p000.C0999xw
            if (r0 != 0) goto L8
            goto L4c
        L8:
            xw r3 = (p000.C0999xw) r3
            boolean r0 = r2.f12330
            boolean r1 = r3.f12330
            if (r0 == r1) goto L11
            goto L4c
        L11:
            int r0 = r2.f12331
            int r1 = r3.f12331
            if (r0 == r1) goto L18
            goto L4c
        L18:
            boolean r0 = r2.f12332
            boolean r1 = r3.f12332
            if (r0 == r1) goto L1f
            goto L4c
        L1f:
            boolean r0 = r2.f12333
            boolean r1 = r3.f12333
            if (r0 == r1) goto L26
            goto L4c
        L26:
            java.lang.String r0 = r2.f12334
            java.lang.String r1 = r3.f12334
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L31
            goto L4c
        L31:
            boolean r0 = r2.f12335
            boolean r1 = r3.f12335
            if (r0 == r1) goto L38
            goto L4c
        L38:
            int r0 = r2.f12336
            int r1 = r3.f12336
            if (r0 == r1) goto L3f
            goto L4c
        L3f:
            boolean r0 = r2.f12337
            boolean r1 = r3.f12337
            if (r0 == r1) goto L46
            goto L4c
        L46:
            boolean r2 = r2.f12338
            boolean r3 = r3.f12338
            if (r2 == r3) goto L4e
        L4c:
            r2 = 0
            return r2
        L4e:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f12330
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f12331
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r2 = r3.f12332
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r3.f12333
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.lang.String r2 = r3.f12334
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r3.f12335
            int r0 = p000.lz1.m3678(r0, r1, r2)
            int r2 = r3.f12336
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r2 = r3.f12337
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r3 = r3.f12338
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AlertConfig(enabled="
            r0.<init>(r1)
            boolean r1 = r5.f12330
            r0.append(r1)
            java.lang.String r1 = ", minutes="
            r0.append(r1)
            int r1 = r5.f12331
            r0.append(r1)
            java.lang.String r1 = ", repeat="
            r0.append(r1)
            java.lang.String r1 = ", vibrate="
            java.lang.String r2 = ", message="
            boolean r3 = r5.f12332
            boolean r4 = r5.f12333
            p000.AbstractC0602nx.m4120(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f12334
            r0.append(r1)
            java.lang.String r1 = ", idleExitEnabled="
            r0.append(r1)
            boolean r1 = r5.f12335
            r0.append(r1)
            java.lang.String r1 = ", idleExitMinutes="
            r0.append(r1)
            int r1 = r5.f12336
            r0.append(r1)
            java.lang.String r1 = ", idleLockScreen="
            r0.append(r1)
            boolean r1 = r5.f12337
            r0.append(r1)
            java.lang.String r1 = ", idleShowCountdown="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r5 = r5.f12338
            java.lang.String r5 = p000.lz1.m3693(r0, r5, r1)
            return r5
    }
}
